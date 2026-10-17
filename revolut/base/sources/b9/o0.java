package b9;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class o0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f13426b;

    public o0(float f, j2 j2Var) {
        this.f13425a = f;
        this.f13426b = j2Var;
    }

    public final float a(w2 w2Var) {
        float fSqrt;
        if (this.f13426b != j2.percent) {
            return e(w2Var);
        }
        u2 u2Var = (u2) w2Var.d;
        b0 b0Var = u2Var.f13484g;
        if (b0Var == null) {
            b0Var = u2Var.f;
        }
        float f = this.f13425a;
        if (b0Var == null) {
            return f;
        }
        float f4 = b0Var.f13311c;
        if (f4 == b0Var.d) {
            fSqrt = f * f4;
        } else {
            fSqrt = f * ((float) (Math.sqrt((r0 * r0) + (f4 * f4)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    public final float b(w2 w2Var, float f) {
        return this.f13426b == j2.percent ? (this.f13425a * f) / 100.0f : e(w2Var);
    }

    public final float c() {
        float f;
        float f4;
        int i = a0.f13300a[this.f13426b.ordinal()];
        float f5 = this.f13425a;
        if (i == 1) {
            return f5;
        }
        switch (i) {
            case 4:
                return f5 * 96.0f;
            case 5:
                f = f5 * 96.0f;
                f4 = 2.54f;
                break;
            case 6:
                f = f5 * 96.0f;
                f4 = 25.4f;
                break;
            case 7:
                f = f5 * 96.0f;
                f4 = 72.0f;
                break;
            case 8:
                f = f5 * 96.0f;
                f4 = 6.0f;
                break;
            default:
                return f5;
        }
        return f / f4;
    }

    public final float e(w2 w2Var) {
        float textSize;
        int i = a0.f13300a[this.f13426b.ordinal()];
        float f = this.f13425a;
        switch (i) {
            case 2:
                textSize = ((u2) w2Var.d).d.getTextSize();
                break;
            case 3:
                textSize = ((u2) w2Var.d).d.getTextSize() / 2.0f;
                break;
            case 4:
                w2Var.getClass();
                return f * 96.0f;
            case 5:
                w2Var.getClass();
                return (f * 96.0f) / 2.54f;
            case 6:
                w2Var.getClass();
                return (f * 96.0f) / 25.4f;
            case 7:
                w2Var.getClass();
                return (f * 96.0f) / 72.0f;
            case 8:
                w2Var.getClass();
                return (f * 96.0f) / 6.0f;
            case 9:
                u2 u2Var = (u2) w2Var.d;
                b0 b0Var = u2Var.f13484g;
                if (b0Var == null) {
                    b0Var = u2Var.f;
                }
                if (b0Var != null) {
                    return (f * b0Var.f13311c) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float f(w2 w2Var) {
        if (this.f13426b != j2.percent) {
            return e(w2Var);
        }
        u2 u2Var = (u2) w2Var.d;
        b0 b0Var = u2Var.f13484g;
        if (b0Var == null) {
            b0Var = u2Var.f;
        }
        float f = this.f13425a;
        return b0Var == null ? f : (f * b0Var.d) / 100.0f;
    }

    public final boolean g() {
        return this.f13425a < BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean h() {
        return this.f13425a == BitmapDescriptorFactory.HUE_RED;
    }

    public final String toString() {
        return String.valueOf(this.f13425a) + this.f13426b;
    }

    public o0(float f) {
        this.f13425a = f;
        this.f13426b = j2.f13378px;
    }
}
