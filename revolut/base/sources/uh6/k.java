package uh6;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Luh6/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMandateId", "mandateId", "Ljo3/a;", "b", "Ljo3/a;", "getTopupAmount", "()Ljo3/a;", "topupAmount", "Luh6/o;", "c", "Luh6/o;", "getRiskSignals", "()Luh6/o;", "riskSignals", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mandate_id")
    @NotNull
    private final String mandateId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("topup_amount")
    @NotNull
    private final jo3.a topupAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("risk_signals")
    private final o riskSignals;

    public k(String mandateId, jo3.a topupAmount, o oVar) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        this.mandateId = mandateId;
        this.topupAmount = topupAmount;
        this.riskSignals = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.mandateId, kVar.mandateId) && Intrinsics.f(this.topupAmount, kVar.topupAmount) && Intrinsics.f(this.riskSignals, kVar.riskSignals);
    }

    public final int hashCode() {
        int iJ = v7.j(this.topupAmount, this.mandateId.hashCode() * 31, 31);
        o oVar = this.riskSignals;
        return iJ + (oVar == null ? 0 : oVar.hashCode());
    }
}
