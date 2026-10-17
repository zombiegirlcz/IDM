package cz0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f110130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f110131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f110132c;

    public b(double d, double d5, double d6) {
        this.f110130a = d;
        this.f110131b = d5;
        this.f110132c = d6;
    }

    public static float a(float f, float f4, float f5) {
        if (f5 < BitmapDescriptorFactory.HUE_RED) {
            f5 += 1.0f;
        }
        if (f5 > 1.0f) {
            f5 -= 1.0f;
        }
        return ((float) 6) * f5 < 1.0f ? ((f4 - f) * 6.0f * f5) + f : ((float) 2) * f5 < 1.0f ? f4 : ((float) 3) * f5 < 2.0f ? j6.a.a(0.6666667f, f5, (f4 - f) * 6.0f, f) : f;
    }

    public final int b() {
        float f = (((float) this.f110130a) % 360.0f) / 360.0f;
        float f4 = ((float) this.f110131b) / 100.0f;
        float f5 = ((float) this.f110132c) / 100.0f;
        float f6 = ((double) f5) < 0.5d ? (1 + f4) * f5 : (f5 + f4) - (f4 * f5);
        float f32 = (2 * f5) - f6;
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, a(f32, f6, f + 0.33333334f));
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, a(f32, f6, f));
        float fMax3 = Math.max(BitmapDescriptorFactory.HUE_RED, a(f32, f6, f - 0.33333334f));
        float f35 = 255;
        return ((int) (Math.min(fMax3, 1.0f) * f35)) | (((int) (Math.min(fMax, 1.0f) * f35)) << 16) | (-16777216) | (((int) (Math.min(fMax2, 1.0f) * f35)) << 8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Double.compare(this.f110130a, bVar.f110130a) == 0 && Double.compare(this.f110131b, bVar.f110131b) == 0 && Double.compare(this.f110132c, bVar.f110132c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f110132c) + m72.b.c(Double.hashCode(this.f110130a) * 31, this.f110131b, 31);
    }
}
