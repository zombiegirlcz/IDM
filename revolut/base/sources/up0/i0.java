package up0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 extends HandlerThread {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f281717l = Float.floatToRawIntBits(Float.NaN);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f281718m = new AtomicInteger(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceTexture f281719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f281720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f281721c;
    public final umd.n d;
    public final Handler e;
    public final AtomicBoolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f281722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f281723h;
    public volatile long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f281724j;
    public volatile Handler k;

    public i0(SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, b bVar, k0 k0Var, k0 k0Var2, umd.n nVar) {
        super(a0.d.n("ParticlesThemeDrawThread #", f281718m.incrementAndGet()));
        this.f281719a = surfaceTexture;
        this.f281720b = k0Var;
        this.f281721c = k0Var2;
        this.d = nVar;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new AtomicBoolean(false);
        this.f281722g = new AtomicBoolean(false);
        this.f281723h = new AtomicBoolean(false);
        this.f281724j = new w(surfaceTexture, i, i2, f, i3, bVar);
    }

    public static void a(i0 i0Var, int i, int i2, int i3, Object obj2, int i5) {
        Handler handler;
        Message messageObtainMessage;
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            obj2 = null;
        }
        if (i0Var.f.get() || (handler = i0Var.k) == null || (messageObtainMessage = handler.obtainMessage(i, i2, i3, obj2)) == null) {
            return;
        }
        messageObtainMessage.sendToTarget();
    }

    public final void b(Float f, Float f4) {
        int iFloatToRawIntBits = f281717l;
        int iFloatToRawIntBits2 = f != null ? Float.floatToRawIntBits(f.floatValue()) : iFloatToRawIntBits;
        if (f4 != null) {
            iFloatToRawIntBits = Float.floatToRawIntBits(f4.floatValue());
        }
        a(this, 11, iFloatToRawIntBits2, iFloatToRawIntBits, null, 8);
    }

    public final void c(boolean z) {
        if (this.f.compareAndSet(false, true)) {
            SurfaceTexture surfaceTexture = this.f281719a;
            AtomicBoolean atomicBoolean = this.f281722g;
            try {
                this.f281724j.i();
                quitSafely();
            } finally {
                if (z && atomicBoolean.compareAndSet(false, true)) {
                    surfaceTexture.release();
                }
            }
        }
    }
}
