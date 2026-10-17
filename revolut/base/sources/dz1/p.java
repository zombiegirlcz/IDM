package dz1;

import k02.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001c\u0010\tR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\"\u0010\tR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b\u001e\u0010\tR\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b&\u0010\tR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b\u0014\u0010\t¨\u0006*"}, d2 = {"Ldz1/p;", "", "", "toString", "()Ljava/lang/String;", "Ldz1/n;", "a", "Ldz1/n;", "d", "()Ldz1/n;", "descriptionChanges", "b", "n", "shortDescriptionChanges", "Lk02/c$b;", "c", "creditorChanges", "Ljo3/a;", "f", "firstAmountChanges", "e", "h", "lastAmountChanges", "l", "purposeChanges", "g", "amountTypeChanges", "firstTransactionDateChanges", "i", "lastTransactionDateChanges", "j", "m", "referenceChanges", "", "k", "countPerPeriodChanges", "pointInTimeChanges", "paymentNotAllowedBeforeChanges", "o", "transferArrangementChanges", "", "expirationExtendedAutomaticallyChanges", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final n<String> descriptionChanges;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("shortDescription")
    private final n<String> shortDescriptionChanges;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditor")
    private final n<c.b> creditorChanges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("firstAmount")
    private final n<jo3.a> firstAmountChanges;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lastAmount")
    private final n<jo3.a> lastAmountChanges;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("purpose")
    private final n<String> purposeChanges;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountType")
    private final n<String> amountTypeChanges;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstTransactionDate")
    private final n<String> firstTransactionDateChanges;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastTransactionDate")
    private final n<String> lastTransactionDateChanges;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("reference")
    private final n<String> referenceChanges;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("countPerPeriod")
    private final n<Integer> countPerPeriodChanges;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointInTime")
    private final n<Integer> pointInTimeChanges;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentNotAllowedBefore")
    private final n<String> paymentNotAllowedBeforeChanges;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferArrangement")
    private final n<String> transferArrangementChanges;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("expirationExtendedAutomatically")
    private final n<Boolean> expirationExtendedAutomaticallyChanges;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAmountTypeChanges() {
        return this.amountTypeChanges;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getCountPerPeriodChanges() {
        return this.countPerPeriodChanges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getCreditorChanges() {
        return this.creditorChanges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getDescriptionChanges() {
        return this.descriptionChanges;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n getExpirationExtendedAutomaticallyChanges() {
        return this.expirationExtendedAutomaticallyChanges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.descriptionChanges, pVar.descriptionChanges) && Intrinsics.f(this.shortDescriptionChanges, pVar.shortDescriptionChanges) && Intrinsics.f(this.creditorChanges, pVar.creditorChanges) && Intrinsics.f(this.firstAmountChanges, pVar.firstAmountChanges) && Intrinsics.f(this.lastAmountChanges, pVar.lastAmountChanges) && Intrinsics.f(this.purposeChanges, pVar.purposeChanges) && Intrinsics.f(this.amountTypeChanges, pVar.amountTypeChanges) && Intrinsics.f(this.firstTransactionDateChanges, pVar.firstTransactionDateChanges) && Intrinsics.f(this.lastTransactionDateChanges, pVar.lastTransactionDateChanges) && Intrinsics.f(this.referenceChanges, pVar.referenceChanges) && Intrinsics.f(this.countPerPeriodChanges, pVar.countPerPeriodChanges) && Intrinsics.f(this.pointInTimeChanges, pVar.pointInTimeChanges) && Intrinsics.f(this.paymentNotAllowedBeforeChanges, pVar.paymentNotAllowedBeforeChanges) && Intrinsics.f(this.transferArrangementChanges, pVar.transferArrangementChanges) && Intrinsics.f(this.expirationExtendedAutomaticallyChanges, pVar.expirationExtendedAutomaticallyChanges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getFirstAmountChanges() {
        return this.firstAmountChanges;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getFirstTransactionDateChanges() {
        return this.firstTransactionDateChanges;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n getLastAmountChanges() {
        return this.lastAmountChanges;
    }

    public final int hashCode() {
        n<String> nVar = this.descriptionChanges;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        n<String> nVar2 = this.shortDescriptionChanges;
        int iHashCode2 = (iHashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n<c.b> nVar3 = this.creditorChanges;
        int iHashCode3 = (iHashCode2 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        n<jo3.a> nVar4 = this.firstAmountChanges;
        int iHashCode4 = (iHashCode3 + (nVar4 == null ? 0 : nVar4.hashCode())) * 31;
        n<jo3.a> nVar5 = this.lastAmountChanges;
        int iHashCode5 = (iHashCode4 + (nVar5 == null ? 0 : nVar5.hashCode())) * 31;
        n<String> nVar6 = this.purposeChanges;
        int iHashCode6 = (iHashCode5 + (nVar6 == null ? 0 : nVar6.hashCode())) * 31;
        n<String> nVar7 = this.amountTypeChanges;
        int iHashCode7 = (iHashCode6 + (nVar7 == null ? 0 : nVar7.hashCode())) * 31;
        n<String> nVar8 = this.firstTransactionDateChanges;
        int iHashCode8 = (iHashCode7 + (nVar8 == null ? 0 : nVar8.hashCode())) * 31;
        n<String> nVar9 = this.lastTransactionDateChanges;
        int iHashCode9 = (iHashCode8 + (nVar9 == null ? 0 : nVar9.hashCode())) * 31;
        n<String> nVar10 = this.referenceChanges;
        int iHashCode10 = (iHashCode9 + (nVar10 == null ? 0 : nVar10.hashCode())) * 31;
        n<Integer> nVar11 = this.countPerPeriodChanges;
        int iHashCode11 = (iHashCode10 + (nVar11 == null ? 0 : nVar11.hashCode())) * 31;
        n<Integer> nVar12 = this.pointInTimeChanges;
        int iHashCode12 = (iHashCode11 + (nVar12 == null ? 0 : nVar12.hashCode())) * 31;
        n<String> nVar13 = this.paymentNotAllowedBeforeChanges;
        int iHashCode13 = (iHashCode12 + (nVar13 == null ? 0 : nVar13.hashCode())) * 31;
        n<String> nVar14 = this.transferArrangementChanges;
        int iHashCode14 = (iHashCode13 + (nVar14 == null ? 0 : nVar14.hashCode())) * 31;
        n<Boolean> nVar15 = this.expirationExtendedAutomaticallyChanges;
        return iHashCode14 + (nVar15 != null ? nVar15.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final n getLastTransactionDateChanges() {
        return this.lastTransactionDateChanges;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final n getPaymentNotAllowedBeforeChanges() {
        return this.paymentNotAllowedBeforeChanges;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getPointInTimeChanges() {
        return this.pointInTimeChanges;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final n getPurposeChanges() {
        return this.purposeChanges;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final n getReferenceChanges() {
        return this.referenceChanges;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final n getShortDescriptionChanges() {
        return this.shortDescriptionChanges;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final n getTransferArrangementChanges() {
        return this.transferArrangementChanges;
    }
}
