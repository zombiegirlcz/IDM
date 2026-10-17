package hm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbk.i f153535a;

    public k(kbk.i eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f153535a = eligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f153535a, ((k) obj2).f153535a);
    }

    public final int hashCode() {
        return this.f153535a.hashCode();
    }
}
