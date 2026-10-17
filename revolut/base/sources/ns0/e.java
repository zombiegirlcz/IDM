package ns0;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.Choreographer;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ht0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements b, Choreographer.FrameCallback {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f218680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f218681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f218682c;
    public TimeInterpolator d;
    public final LinearInterpolator e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f218683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f218684h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f218685j;

    public e(b0 onInvalidate, b0 onAnimationEnd) {
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        this.f218680a = onInvalidate;
        this.f218681b = onAnimationEnd;
        this.f218682c = 800L;
        this.d = new OvershootInterpolator(0.5f);
        this.e = new LinearInterpolator();
        this.f = new ArrayList();
    }

    @Override // ns0.b
    public final long a() {
        return this.f218682c;
    }

    @Override // ns0.b
    public final void cancel() {
        this.f218684h = false;
        Choreographer.getInstance().removeFrameCallback(this);
        q();
        this.f218680a.invoke();
    }

    @Override // ns0.b
    public final void d(long j2) {
        this.f218682c = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        float fA;
        int iBlendARGB;
        if (this.f218684h) {
            if (this.f218683g == -1) {
                this.f218683g = j2;
            }
            long j3 = (j2 - this.f218683g) / 1000000;
            if (j3 < 0) {
                j3 = 0;
            }
            long j5 = this.i ? this.f218682c : 0L;
            float f = j5 > 0 ? kotlin.ranges.f.f(j3 / j5, BitmapDescriptorFactory.HUE_RED, 1.0f) : 1.0f;
            float interpolation = this.d.getInterpolation(f);
            long j16 = this.f218685j ? 1600L : 0L;
            float f4 = j16 > 0 ? kotlin.ranges.f.f(j3 / j16, BitmapDescriptorFactory.HUE_RED, 1.0f) : 1.0f;
            float interpolation2 = this.e.getInterpolation(f4);
            boolean z = f >= 1.0f;
            boolean z3 = f4 >= 1.0f;
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                g gVar = (g) arrayList.get(i);
                if (z) {
                    fA = gVar.e;
                } else {
                    float f5 = gVar.f218690c;
                    fA = j6.a.a(gVar.e, f5, interpolation, f5);
                }
                if (z3) {
                    iBlendARGB = gVar.f218693j;
                } else {
                    int i2 = gVar.f218691g;
                    int i3 = gVar.f218693j;
                    if (i2 == i3 && gVar.i == i3) {
                        iBlendARGB = i3;
                    } else {
                        int i5 = gVar.i;
                        iBlendARGB = i5 != i3 ? interpolation2 < 0.5f ? ColorUtils.blendARGB(i2, i5, interpolation2 / 0.5f) : ColorUtils.blendARGB(i5, i3, (interpolation2 - 0.5f) / 0.5f) : ColorUtils.blendARGB(i2, i3, interpolation2);
                    }
                }
                gVar.d = fA;
                gVar.f218692h = iBlendARGB;
            }
            this.f218680a.invoke();
            if (!z || !z3) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            q();
            this.f218684h = false;
            this.f218681b.invoke();
        }
    }

    @Override // ns0.b
    public final void e(Canvas canvas, g digit, TextPaint paint, float f, float f4, float f5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(digit, "digit");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f4);
        canvas.translate(digit.f218688a, BitmapDescriptorFactory.HUE_RED);
        b.Companion.getClass();
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            canvas.drawText(a.f218677b[i], BitmapDescriptorFactory.HUE_RED, (i2 * f4) + digit.d, paint);
            i++;
            i2++;
        }
        canvas.restore();
    }

    @Override // ns0.b
    public final TimeInterpolator h() {
        return this.d;
    }

    @Override // ns0.b
    public final void l(TimeInterpolator value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d = value;
    }

    @Override // ns0.b
    public final void n(List digits) {
        Intrinsics.checkNotNullParameter(digits, "digits");
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(digits);
    }

    public final void q() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g gVar = (g) arrayList.get(i);
            float f = gVar.e;
            gVar.d = f;
            gVar.f218690c = f;
            int i2 = gVar.f218693j;
            gVar.f218692h = i2;
            gVar.f218691g = i2;
            gVar.i = i2;
        }
    }

    @Override // ns0.b
    public final void start() {
        boolean z;
        int i;
        boolean z3 = false;
        this.f218684h = false;
        Choreographer.getInstance().removeFrameCallback(this);
        ArrayList<g> arrayList = this.f;
        if (arrayList == null || !arrayList.isEmpty()) {
            for (g gVar : arrayList) {
                if (gVar.f218690c != gVar.e) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.i = z;
        if (arrayList == null || !arrayList.isEmpty()) {
            for (g gVar2 : arrayList) {
                int i2 = gVar2.f218691g;
                int i3 = gVar2.f218693j;
                if (i2 != i3 || (i = gVar2.i) != i3 || i2 != i) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f218685j = z3;
        this.f218684h = true;
        this.f218683g = -1L;
        Choreographer.getInstance().postFrameCallback(this);
    }
}
