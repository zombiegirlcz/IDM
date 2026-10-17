package aj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, d2 = {"Laj7/o;", "", "", "toString", "()Ljava/lang/String;", "Laj7/q;", "a", "Laj7/q;", "c", "()Laj7/q;", "transactions", "", "Laj7/x;", "b", "Ljava/util/List;", "()Ljava/util/List;", "availablePaymentPurposes", "Laj7/w;", "availablePaymentCancellers", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactions")
    @NotNull
    private final q transactions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("availablePaymentPurposes")
    @NotNull
    private final List<x> availablePaymentPurposes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("availablePaymentCancellers")
    @NotNull
    private final List<w> availablePaymentCancellers;

    public o(q transactions, ArrayList availablePaymentPurposes, ArrayList availablePaymentCancellers) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(availablePaymentPurposes, "availablePaymentPurposes");
        Intrinsics.checkNotNullParameter(availablePaymentCancellers, "availablePaymentCancellers");
        this.transactions = transactions;
        this.availablePaymentPurposes = availablePaymentPurposes;
        this.availablePaymentCancellers = availablePaymentCancellers;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailablePaymentCancellers() {
        return this.availablePaymentCancellers;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAvailablePaymentPurposes() {
        return this.availablePaymentPurposes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getTransactions() {
        return this.transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.transactions, oVar.transactions) && Intrinsics.f(this.availablePaymentPurposes, oVar.availablePaymentPurposes) && Intrinsics.f(this.availablePaymentCancellers, oVar.availablePaymentCancellers);
    }

    public final int hashCode() {
        return this.availablePaymentCancellers.hashCode() + p.a.d(this.transactions.hashCode() * 31, 31, this.availablePaymentPurposes);
    }
}
