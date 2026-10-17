package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309988a;

    public f0(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f309988a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f309988a, ((f0) obj2).f309988a);
    }

    public final int hashCode() {
        return this.f309988a.hashCode();
    }
}
