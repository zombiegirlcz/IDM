package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f296668b;

    public q0(dj0.d dVar, String issuerInstitutionId) {
        Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
        this.f296667a = issuerInstitutionId;
        this.f296668b = dVar;
    }

    public final String a() {
        return this.f296667a;
    }

    public final dj0.d b() {
        return this.f296668b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f296667a, q0Var.f296667a) && Intrinsics.f(this.f296668b, q0Var.f296668b);
    }

    public final int hashCode() {
        int iHashCode = this.f296667a.hashCode() * 31;
        dj0.d dVar = this.f296668b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
