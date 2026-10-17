package ec2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u001b"}, d2 = {"Lec2/d;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "amount", "", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "amountModifiable", "c", "Ljava/lang/String;", "e", "reference", "d", "f", "referenceModifiable", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "paymentDate", "callbackUrl", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountModifiable")
    private final Boolean amountModifiable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reference")
    private final String reference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("referenceModifiable")
    private final Boolean referenceModifiable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentDate")
    private final Long paymentDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("callbackUrl")
    private final String callbackUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAmountModifiable() {
        return this.amountModifiable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.amount, dVar.amount) && Intrinsics.f(this.amountModifiable, dVar.amountModifiable) && Intrinsics.f(this.reference, dVar.reference) && Intrinsics.f(this.referenceModifiable, dVar.referenceModifiable) && Intrinsics.f(this.paymentDate, dVar.paymentDate) && Intrinsics.f(this.callbackUrl, dVar.callbackUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getReferenceModifiable() {
        return this.referenceModifiable;
    }

    public final int hashCode() {
        jo3.a aVar = this.amount;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Boolean bool = this.amountModifiable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.reference;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.referenceModifiable;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.paymentDate;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.callbackUrl;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
