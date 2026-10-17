package uz;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f284504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f284506c;
    public final int d;

    public d0() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Float.compare(this.f284504a, d0Var.f284504a) == 0 && this.f284505b == d0Var.f284505b && this.f284506c == d0Var.f284506c && this.d == d0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f284506c, j6.a.b(this.f284505b, Float.hashCode(this.f284504a) * 31, 31), 31);
    }

    public d0(float f, int i, int i2, int i3) {
        this.f284504a = f;
        this.f284505b = i;
        this.f284506c = i2;
        this.d = i3;
    }

    public /* synthetic */ d0(int i) {
        this(BitmapDescriptorFactory.HUE_RED, 0, 64, 0);
    }
}
