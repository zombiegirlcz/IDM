package dz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\tR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Ldz1/m;", "", "", "toString", "()Ljava/lang/String;", "Ldz1/n;", "Ljo3/a;", "a", "Ldz1/n;", "()Ldz1/n;", "amountChanges", "", "b", "c", "expirationDateChanges", "executionTypeChanges", "d", "f", "periodChanges", "Lk02/a;", "e", "paymentAmountsChanges", "Ldz1/p;", "Ldz1/p;", "()Ldz1/p;", "paymentMethodDetailsChanges", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final n<jo3.a> amountChanges;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final n<Long> expirationDateChanges;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("executionType")
    private final n<String> executionTypeChanges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("period")
    private final n<String> periodChanges;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentAmounts")
    private final n<k02.a> paymentAmountsChanges;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentMethodDetails")
    private final p paymentMethodDetailsChanges;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAmountChanges() {
        return this.amountChanges;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getExecutionTypeChanges() {
        return this.executionTypeChanges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getExpirationDateChanges() {
        return this.expirationDateChanges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getPaymentAmountsChanges() {
        return this.paymentAmountsChanges;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p getPaymentMethodDetailsChanges() {
        return this.paymentMethodDetailsChanges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.amountChanges, mVar.amountChanges) && Intrinsics.f(this.expirationDateChanges, mVar.expirationDateChanges) && Intrinsics.f(this.executionTypeChanges, mVar.executionTypeChanges) && Intrinsics.f(this.periodChanges, mVar.periodChanges) && Intrinsics.f(this.paymentAmountsChanges, mVar.paymentAmountsChanges) && Intrinsics.f(this.paymentMethodDetailsChanges, mVar.paymentMethodDetailsChanges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getPeriodChanges() {
        return this.periodChanges;
    }

    public final int hashCode() {
        n<jo3.a> nVar = this.amountChanges;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        n<Long> nVar2 = this.expirationDateChanges;
        int iHashCode2 = (iHashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n<String> nVar3 = this.executionTypeChanges;
        int iHashCode3 = (iHashCode2 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        n<String> nVar4 = this.periodChanges;
        int iHashCode4 = (iHashCode3 + (nVar4 == null ? 0 : nVar4.hashCode())) * 31;
        n<k02.a> nVar5 = this.paymentAmountsChanges;
        int iHashCode5 = (iHashCode4 + (nVar5 == null ? 0 : nVar5.hashCode())) * 31;
        p pVar = this.paymentMethodDetailsChanges;
        return iHashCode5 + (pVar != null ? pVar.hashCode() : 0);
    }
}
