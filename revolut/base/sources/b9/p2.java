package b9;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13443c;
    public float d;
    public boolean e = false;

    public p2(float f, float f4, float f5, float f6) {
        this.f13443c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.f13441a = f;
        this.f13442b = f4;
        double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        if (dSqrt != 0.0d) {
            this.f13443c = (float) (((double) f5) / dSqrt);
            this.d = (float) (((double) f6) / dSqrt);
        }
    }

    public final void a(float f, float f4) {
        float f5 = f - this.f13441a;
        float f6 = f4 - this.f13442b;
        double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        if (dSqrt != 0.0d) {
            f5 = (float) (((double) f5) / dSqrt);
            f6 = (float) (((double) f6) / dSqrt);
        }
        float f32 = this.f13443c;
        if (f5 != (-f32) || f6 != (-this.d)) {
            this.f13443c = f32 + f5;
            this.d += f6;
        } else {
            this.e = true;
            this.f13443c = -f6;
            this.d = f5;
        }
    }

    public final void b(p2 p2Var) {
        float f = p2Var.f13443c;
        float f4 = this.f13443c;
        if (f == (-f4)) {
            float f5 = p2Var.d;
            if (f5 == (-this.d)) {
                this.e = true;
                this.f13443c = -f5;
                this.d = p2Var.f13443c;
                return;
            }
        }
        this.f13443c = f4 + f;
        this.d += p2Var.d;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("(");
        sb6.append(this.f13441a);
        sb6.append(",");
        sb6.append(this.f13442b);
        sb6.append(" ");
        sb6.append(this.f13443c);
        sb6.append(",");
        return ehe.n.t(this.d, ")", sb6);
    }
}
