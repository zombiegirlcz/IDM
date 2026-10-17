package jh2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljh2/k;", "", "", "toString", "()Ljava/lang/String;", "Lqx1/j;", "a", "Lqx1/j;", "b", "()Lqx1/j;", "contact", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "c", "getState", "state", "Lqx1/e;", "d", "Lqx1/e;", "()Lqx1/e;", "attributeBag", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("contact")
    private final qx1.j contact;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    private final String beneficiaryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("attributeBag")
    private final qx1.e attributeBag;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qx1.e getAttributeBag() {
        return this.attributeBag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final qx1.j getContact() {
        return this.contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.contact, kVar.contact) && Intrinsics.f(this.beneficiaryId, kVar.beneficiaryId) && Intrinsics.f(this.state, kVar.state) && Intrinsics.f(this.attributeBag, kVar.attributeBag);
    }

    public final int hashCode() {
        qx1.j jVar = this.contact;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        String str = this.beneficiaryId;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state);
        qx1.e eVar = this.attributeBag;
        return iC + (eVar != null ? eVar.hashCode() : 0);
    }
}
