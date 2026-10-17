package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j1 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f216179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.a f216180b;

    public j1(m0 configuration, ty0.a data) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f216179a = configuration;
        this.f216180b = data;
    }

    @Override // nii.n1
    public final m0 a() {
        return this.f216179a;
    }

    public final ty0.a b() {
        return this.f216180b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f216179a, j1Var.f216179a) && Intrinsics.f(this.f216180b, j1Var.f216180b);
    }

    public final int hashCode() {
        return this.f216180b.hashCode() + (this.f216179a.hashCode() * 31);
    }
}
