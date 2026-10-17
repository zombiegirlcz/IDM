package uh3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Luh3/b;", "", "", "toString", "()Ljava/lang/String;", "Luh3/a;", "a", "Luh3/a;", "d", "()Luh3/a;", "terms", "b", "c", "kyc", "balance", "creditCard", "feature_checkout_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planTermsDelivered")
    private final a terms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("kycPassed")
    private final a kyc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("enoughBalance")
    private final a balance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("creditCardActivated")
    private final a creditCard;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCreditCard() {
        return this.creditCard;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getKyc() {
        return this.kyc;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getTerms() {
        return this.terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.terms, bVar.terms) && Intrinsics.f(this.kyc, bVar.kyc) && Intrinsics.f(this.balance, bVar.balance) && Intrinsics.f(this.creditCard, bVar.creditCard);
    }

    public final int hashCode() {
        a aVar = this.terms;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.kyc;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.balance;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.creditCard;
        return iHashCode3 + (aVar4 != null ? aVar4.hashCode() : 0);
    }
}
