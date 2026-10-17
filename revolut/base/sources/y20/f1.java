package y20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f310494a;

    public f1(i1 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f310494a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f1) && Intrinsics.f(this.f310494a, ((f1) obj2).f310494a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f310494a.hashCode() * 31);
    }
}
