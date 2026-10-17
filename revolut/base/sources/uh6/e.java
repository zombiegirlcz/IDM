package uh6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Luh6/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getInstitutionId", "institutionId", "Luh6/d;", "b", "Luh6/d;", "getConstraints", "()Luh6/d;", "constraints", "Ljo3/a;", "c", "Ljo3/a;", "getInitialPayment", "()Ljo3/a;", "initialPayment", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("institution_id")
    @NotNull
    private final String institutionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("constraints")
    @NotNull
    private final d constraints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("initial_payment")
    private final jo3.a initialPayment;

    public e(String institutionId, d constraints, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.institutionId = institutionId;
        this.constraints = constraints;
        this.initialPayment = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.institutionId, eVar.institutionId) && Intrinsics.f(this.constraints, eVar.constraints) && Intrinsics.f(this.initialPayment, eVar.initialPayment);
    }

    public final int hashCode() {
        int iHashCode = (this.constraints.hashCode() + (this.institutionId.hashCode() * 31)) * 31;
        jo3.a aVar = this.initialPayment;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
