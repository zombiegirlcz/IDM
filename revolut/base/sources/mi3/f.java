package mi3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lmi3/f;", "", "", "toString", "()Ljava/lang/String;", "Lmi3/e;", "a", "Lmi3/e;", "d", "()Lmi3/e;", "terms", "b", "c", "kyc", "balance", "creditCard", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planTerms")
    private final e terms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("kyc")
    private final e kyc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("balance")
    private final e balance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("creditCard")
    private final e creditCard;

    public f(e eVar, e eVar2, e eVar3, e eVar4) {
        this.terms = eVar;
        this.kyc = eVar2;
        this.balance = eVar3;
        this.creditCard = eVar4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getCreditCard() {
        return this.creditCard;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getKyc() {
        return this.kyc;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getTerms() {
        return this.terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.terms, fVar.terms) && Intrinsics.f(this.kyc, fVar.kyc) && Intrinsics.f(this.balance, fVar.balance) && Intrinsics.f(this.creditCard, fVar.creditCard);
    }

    public final int hashCode() {
        e eVar = this.terms;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.kyc;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        e eVar3 = this.balance;
        int iHashCode3 = (iHashCode2 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        e eVar4 = this.creditCard;
        return iHashCode3 + (eVar4 != null ? eVar4.hashCode() : 0);
    }
}
