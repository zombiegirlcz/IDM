package wy1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lwy1/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "aliasBeneficiaryId", "b", "counterpartyId", "Lwy1/k;", "c", "Lwy1/k;", "()Lwy1/k;", "merchant", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("aliasBeneficiaryId")
    private final String aliasBeneficiaryId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterpartyId")
    private final String counterpartyId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    private final k merchant;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAliasBeneficiaryId() {
        return this.aliasBeneficiaryId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCounterpartyId() {
        return this.counterpartyId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getMerchant() {
        return this.merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.aliasBeneficiaryId, lVar.aliasBeneficiaryId) && Intrinsics.f(this.counterpartyId, lVar.counterpartyId) && Intrinsics.f(this.merchant, lVar.merchant);
    }

    public final int hashCode() {
        String str = this.aliasBeneficiaryId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.counterpartyId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k kVar = this.merchant;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
