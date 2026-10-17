package w88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u98.a f295608a;

    public d(u98.a ageEligibility) {
        Intrinsics.checkNotNullParameter(ageEligibility, "ageEligibility");
        this.f295608a = ageEligibility;
    }

    @Override // w88.e
    public final u98.a a() {
        return this.f295608a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f295608a == ((d) obj2).f295608a;
    }

    public final int hashCode() {
        return this.f295608a.hashCode();
    }
}
