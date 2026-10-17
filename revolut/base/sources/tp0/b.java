package tp0;

import a0.d;
import android.content.Context;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.h1;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGL10;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import vp0.c;
import vp0.e;
import vp0.g;
import vp0.h;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b extends HandlerThread {

    @NotNull
    private static final a Companion = new a();
    public static final AtomicInteger e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f273250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f273251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f273252c;
    public final CountDownLatch d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super(d.n("RemoveEffectDrawThread #", e.incrementAndGet()));
        Intrinsics.checkNotNullParameter("Remove", "effectName");
        this.f273250a = new AtomicBoolean(false);
        this.d = new CountDownLatch(1);
    }

    public abstract void a(Exception exc2);

    public final void b() {
        int i;
        int i2;
        int i3;
        int i5;
        if (this.f273250a.get()) {
            return;
        }
        e eVar = (e) this;
        GLES20.glClear(16384);
        int i6 = 0;
        int i21 = 0;
        while (i21 < eVar.f291021l.size()) {
            c cVar = (c) eVar.f291021l.get(i21);
            if (cVar.o) {
                int[] iArr = cVar.f291017y;
                float f = cVar.f291006j;
                float f4 = cVar.i;
                Context context = cVar.e;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                float fL = kli.a.l(context, 1.0f);
                if (fL < 1.0f) {
                    fL = 1.0f;
                }
                cVar.f291010p = f.g((int) ((f4 * f) / (fL * fL)), 100, 100000);
                float f5 = f4 / f;
                int iC = rim.d.c((float) Math.sqrt(r11 / f5));
                cVar.f291007l = iC;
                cVar.f291008m = rim.d.c(cVar.f291010p / iC);
                while (true) {
                    i2 = cVar.f291008m;
                    i3 = cVar.f291007l;
                    i5 = i2 * i3;
                    if (i5 >= cVar.f291010p) {
                        break;
                    } else if (i2 / i3 < f5) {
                        cVar.f291008m = i2 + 1;
                    } else {
                        cVar.f291007l = i3 + 1;
                    }
                }
                cVar.f291010p = i5;
                cVar.f291009n = Math.max(f4 / i2, f / i3);
                GLES20.glGenBuffers(2, iArr, 0);
                for (int i22 = 0; i22 < 2; i22++) {
                    GLES20.glBindBuffer(34962, iArr[i22]);
                    GLES20.glBufferData(34962, cVar.f291010p * 28, null, 35048);
                }
                eVar.f291022m.add(cVar);
            }
            eVar.k = true;
            int[] iArr2 = cVar.f291017y;
            float f6 = cVar.f291011q;
            float[] fArr = cVar.f291014t;
            float f32 = cVar.f291006j;
            float f35 = cVar.i;
            h hVar = cVar.f291002b;
            Matrix matrix = cVar.v;
            g gVar = cVar.f291003c;
            long jNanoTime = System.nanoTime();
            double d = cVar.f291012r < 0 ? 0.0d : (jNanoTime - r5) / 1.0E9d;
            cVar.f291012r = jNanoTime;
            if (cVar.f291013s) {
                matrix.reset();
                matrix.postScale(f35, f32);
                int[] iArr3 = cVar.k;
                i = 3;
                matrix.postTranslate(iArr3[0], iArr3[1]);
                float[] fArr2 = cVar.u;
                matrix.getValues(fArr2);
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[3];
                fArr[2] = fArr2[6];
                fArr[3] = fArr2[1];
                fArr[4] = fArr2[4];
                fArr[5] = fArr2[7];
                fArr[6] = fArr2[2];
                fArr[7] = fArr2[5];
                fArr[8] = fArr2[8];
                cVar.f291013s = false;
            } else {
                i = 3;
            }
            float f36 = ((float) d) / cVar.f291005h;
            cVar.f291004g += f36;
            GLES20.glUniformMatrix3fv(gVar.d, 1, false, fArr, 0);
            GLES20.glUniform1f(gVar.f, cVar.o ? 1.0f : 0.0f);
            GLES20.glUniform1f(gVar.f291028b, f36);
            GLES20.glUniform3f(gVar.f291029c, cVar.f291008m, cVar.f291007l, cVar.f291009n);
            int i32 = gVar.f291032j;
            float f37 = cVar.f291004g;
            if (f37 < BitmapDescriptorFactory.HUE_RED) {
                f37 = 0.0f;
            }
            GLES20.glUniform1f(i32, f37);
            GLES20.glUniform1f(gVar.f291033l, hVar.a());
            GLES20.glUniform2f(gVar.k, f35, f32);
            GLES20.glUniform3f(gVar.f291034m, hVar.c() * f6, hVar.d() * f6, 10 * f6);
            GLES20.glUniform1f(gVar.f291030g, (float) cVar.f291015w);
            GLES20.glUniform2f(gVar.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, cVar.z[0]);
            GLES20.glUniform1i(gVar.i, 0);
            GLES20.glBindBuffer(34962, iArr2[cVar.f291016x]);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
            GLES20.glEnableVertexAttribArray(i);
            GLES30.glBindBufferBase(35982, 0, iArr2[1 - cVar.f291016x]);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
            GLES20.glEnableVertexAttribArray(i);
            GLES30.glBeginTransformFeedback(0);
            GLES20.glDrawArrays(0, 0, cVar.f291010p);
            GLES30.glEndTransformFeedback();
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindBuffer(35982, 0);
            cVar.o = false;
            cVar.f291016x = 1 - cVar.f291016x;
            float f41 = cVar.f291004g;
            vp0.b bVar = c.Companion;
            h parameters = cVar.f291002b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (f41 > parameters.a() / 0.3f) {
                cVar.a();
                eVar.f291021l.remove(i21);
                eVar.f273251b = !eVar.f291021l.isEmpty();
            } else {
                i21++;
            }
        }
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                try {
                    break;
                } catch (Exception e2) {
                    eVar.f291022m.clear();
                    ArrayList arrayList = eVar.f291021l;
                    int size = arrayList.size();
                    while (i6 < size) {
                        ((c) arrayList.get(i6)).a();
                        i6++;
                    }
                    eVar.f291021l.clear();
                    eVar.a(e2);
                    eVar.c();
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "RemoveEffectDrawThread", d.n("RemoveEffect gl error ", iGlGetError), null, null, 16);
        }
        vp0.f fVar = eVar.f291023n;
        EGL10 egl10 = fVar.f291024a;
        Intrinsics.h(egl10);
        egl10.eglSwapBuffers(fVar.f291025b, fVar.d);
        ArrayList arrayList2 = eVar.f291022m;
        int size2 = arrayList2.size();
        while (i6 < size2) {
            c cVar2 = (c) arrayList2.get(i6);
            Lazy lazy = h1.f169241a;
            h1.c(cVar2.f);
            i6++;
        }
        eVar.f291022m.clear();
        if (eVar.f291021l.isEmpty() && eVar.k) {
            eVar.c();
        }
    }

    public final void c() {
        Message messageObtainMessage;
        Handler handler;
        if (this.f273250a.get()) {
            return;
        }
        if (!Intrinsics.f(Looper.myLooper(), getLooper())) {
            Handler handler2 = this.f273252c;
            if (handler2 == null || (messageObtainMessage = handler2.obtainMessage(3)) == null || (handler = this.f273252c) == null) {
                return;
            }
            handler.sendMessage(messageObtainMessage);
            return;
        }
        this.f273250a.set(true);
        e eVar = (e) this;
        ArrayList arrayList = eVar.f291021l;
        g gVar = eVar.o;
        int i = gVar.f291027a;
        if (i != 0) {
            try {
                GLES20.glDeleteProgram(i);
            } catch (Exception e2) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RemoveEffectOpenGLProgram", null, e2, h0Var);
            }
            gVar.f291027a = 0;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((c) arrayList.get(i2)).a();
        }
        arrayList.clear();
        eVar.f291018g.release();
        Lazy lazy = h1.f169241a;
        h1.c(eVar.f291019h);
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }

    public abstract void d();

    public final void e(int i, int i2) {
        Message messageObtainMessage;
        Handler handler;
        if (this.f273250a.get()) {
            return;
        }
        if (Intrinsics.f(Looper.myLooper(), getLooper())) {
            g gVar = ((e) this).o;
            gVar.getClass();
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glUniform2f(gVar.f291031h, i, i2);
            return;
        }
        Handler handler2 = this.f273252c;
        if (handler2 == null || (messageObtainMessage = handler2.obtainMessage(2, i, i2)) == null || (handler = this.f273252c) == null) {
            return;
        }
        handler.sendMessage(messageObtainMessage);
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        try {
            d();
            this.f273252c = new Handler(getLooper(), new j4.d(this, 2));
            this.d.countDown();
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
            a(e2);
            c();
            this.d.countDown();
        }
    }
}
