package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f216190a;

    public l1(m0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f216190a = configuration;
    }

    @Override // nii.n1
    public final m0 a() {
        return this.f216190a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l1) && Intrinsics.f(this.f216190a, ((l1) obj2).f216190a);
    }

    public final int hashCode() {
        return this.f216190a.hashCode();
    }
}
