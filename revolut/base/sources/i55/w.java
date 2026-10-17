package i55;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u001e"}, d2 = {"Li55/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "g", "refinancingMode", "c", "i", "state", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "amount", "bankName", "f", "h", "representation", "", "Z", "()Z", "receiptAvailable", "fallbackDateTime", "fallbackTransactionId", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refinancingMode")
    @NotNull
    private final String refinancingMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankName")
    private final String bankName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("representation")
    private final String representation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiptAvailable")
    private final boolean receiptAvailable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fallbackDateTime")
    private final String fallbackDateTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fallbackTransactionId")
    private final String fallbackTransactionId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFallbackDateTime() {
        return this.fallbackDateTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFallbackTransactionId() {
        return this.fallbackTransactionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.id, wVar.id) && Intrinsics.f(this.refinancingMode, wVar.refinancingMode) && Intrinsics.f(this.state, wVar.state) && Intrinsics.f(this.amount, wVar.amount) && Intrinsics.f(this.bankName, wVar.bankName) && Intrinsics.f(this.representation, wVar.representation) && this.receiptAvailable == wVar.receiptAvailable && Intrinsics.f(this.fallbackDateTime, wVar.fallbackDateTime) && Intrinsics.f(this.fallbackTransactionId, wVar.fallbackTransactionId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getReceiptAvailable() {
        return this.receiptAvailable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRefinancingMode() {
        return this.refinancingMode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRepresentation() {
        return this.representation;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.refinancingMode), 31, this.state), 31);
        String str = this.bankName;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.representation;
        int iC = j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.receiptAvailable);
        String str3 = this.fallbackDateTime;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fallbackTransactionId;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
