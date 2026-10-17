package s7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f260481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f260482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f260483c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f260484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f260485h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f260486j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f260487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f260488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f260489n;
    public PointF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f260490p;

    public a(j jVar, Object obj2, Object obj3, Interpolator interpolator, float f, Float f4) {
        this.i = -3987645.8f;
        this.f260486j = -3987645.8f;
        this.k = 784923401;
        this.f260487l = 784923401;
        this.f260488m = Float.MIN_VALUE;
        this.f260489n = Float.MIN_VALUE;
        this.o = null;
        this.f260490p = null;
        this.f260481a = jVar;
        this.f260482b = obj2;
        this.f260483c = obj3;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.f260484g = f;
        this.f260485h = f4;
    }

    public final float a() {
        j jVar = this.f260481a;
        if (jVar == null) {
            return 1.0f;
        }
        if (this.f260489n == Float.MIN_VALUE) {
            if (this.f260485h == null) {
                this.f260489n = 1.0f;
            } else {
                this.f260489n = (float) (((double) b()) + (((double) (this.f260485h.floatValue() - this.f260484g)) / ((double) (jVar.f111684m - jVar.f111683l))));
            }
        }
        return this.f260489n;
    }

    public final float b() {
        j jVar = this.f260481a;
        if (jVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f260488m == Float.MIN_VALUE) {
            float f = jVar.f111683l;
            this.f260488m = (this.f260484g - f) / (jVar.f111684m - f);
        }
        return this.f260488m;
    }

    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f260482b + ", endValue=" + this.f260483c + ", startFrame=" + this.f260484g + ", endFrame=" + this.f260485h + ", interpolator=" + this.d + CoreConstants.CURLY_RIGHT;
    }

    public a(j jVar, Object obj2, Object obj3, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.f260486j = -3987645.8f;
        this.k = 784923401;
        this.f260487l = 784923401;
        this.f260488m = Float.MIN_VALUE;
        this.f260489n = Float.MIN_VALUE;
        this.o = null;
        this.f260490p = null;
        this.f260481a = jVar;
        this.f260482b = obj2;
        this.f260483c = obj3;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.f260484g = f;
        this.f260485h = null;
    }

    public a(j jVar, Object obj2, Object obj3, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f4) {
        this.i = -3987645.8f;
        this.f260486j = -3987645.8f;
        this.k = 784923401;
        this.f260487l = 784923401;
        this.f260488m = Float.MIN_VALUE;
        this.f260489n = Float.MIN_VALUE;
        this.o = null;
        this.f260490p = null;
        this.f260481a = jVar;
        this.f260482b = obj2;
        this.f260483c = obj3;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.f260484g = f;
        this.f260485h = f4;
    }

    public a(Object obj2) {
        this.i = -3987645.8f;
        this.f260486j = -3987645.8f;
        this.k = 784923401;
        this.f260487l = 784923401;
        this.f260488m = Float.MIN_VALUE;
        this.f260489n = Float.MIN_VALUE;
        this.o = null;
        this.f260490p = null;
        this.f260481a = null;
        this.f260482b = obj2;
        this.f260483c = obj2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f260484g = Float.MIN_VALUE;
        this.f260485h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(m7.c cVar, m7.c cVar2) {
        this.i = -3987645.8f;
        this.f260486j = -3987645.8f;
        this.k = 784923401;
        this.f260487l = 784923401;
        this.f260488m = Float.MIN_VALUE;
        this.f260489n = Float.MIN_VALUE;
        this.o = null;
        this.f260490p = null;
        this.f260481a = null;
        this.f260482b = cVar;
        this.f260483c = cVar2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f260484g = Float.MIN_VALUE;
        this.f260485h = Float.valueOf(Float.MAX_VALUE);
    }
}
