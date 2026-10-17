package w88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u98.a f295607a;

    public c(u98.a ageEligibility) {
        Intrinsics.checkNotNullParameter(ageEligibility, "ageEligibility");
        this.f295607a = ageEligibility;
    }

    @Override // w88.e
    public final u98.a a() {
        return this.f295607a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f295607a == ((c) obj2).f295607a;
    }

    public final int hashCode() {
        return this.f295607a.hashCode();
    }
}
