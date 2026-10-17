package mx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f209982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f209983c;
    public float d;
    public float e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f209984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f209985h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f209986j;

    public s0(String letter, int i, int i2, int i3) {
        k0 animation = k0.NONE;
        Intrinsics.checkNotNullParameter(letter, "letter");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f209981a = letter;
        this.f209982b = animation;
        this.f209983c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = i;
        this.f209984g = i2;
        this.f209985h = i3;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.f209986j = false;
    }

    public final void a(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<set-?>");
        this.f209982b = k0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f209981a, s0Var.f209981a) && this.f209982b == s0Var.f209982b && Float.compare(this.f209983c, s0Var.f209983c) == 0 && Float.compare(this.d, s0Var.d) == 0 && Float.compare(this.e, s0Var.e) == 0 && this.f == s0Var.f && this.f209984g == s0Var.f209984g && this.f209985h == s0Var.f209985h && Float.compare(this.i, s0Var.i) == 0 && this.f209986j == s0Var.f209986j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209986j) + m72.b.b(this.i, j6.a.b(this.f209985h, j6.a.b(this.f209984g, j6.a.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f209983c, (this.f209982b.hashCode() + (this.f209981a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }
}
