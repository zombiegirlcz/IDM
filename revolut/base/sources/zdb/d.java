package zdb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdb.j f321434a;

    public d(xdb.j policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f321434a = policy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f321434a, ((d) obj2).f321434a);
    }

    public final int hashCode() {
        return this.f321434a.hashCode();
    }
}
