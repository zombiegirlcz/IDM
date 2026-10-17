package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class y0 implements tji.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f216244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f216245c;

    public y0(String str, m0 configuration, boolean z) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f216243a = str;
        this.f216244b = configuration;
        this.f216245c = z;
    }

    public static y0 a(y0 y0Var, m0 configuration, boolean z, int i) {
        String str = y0Var.f216243a;
        if ((i & 2) != 0) {
            configuration = y0Var.f216244b;
        }
        if ((i & 4) != 0) {
            z = y0Var.f216245c;
        }
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new y0(str, configuration, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f216243a, y0Var.f216243a) && Intrinsics.f(this.f216244b, y0Var.f216244b) && this.f216245c == y0Var.f216245c;
    }

    public final int hashCode() {
        String str = this.f216243a;
        return Boolean.hashCode(this.f216245c) + ((this.f216244b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public /* synthetic */ y0(String str, m0 m0Var, boolean z, int i) {
        this((i & 1) != 0 ? null : str, m0Var, (i & 4) != 0 ? false : z);
    }
}
