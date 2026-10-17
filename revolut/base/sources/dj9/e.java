package dj9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010$\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\u000eR\u001a\u0010%\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b#\u0010\u000eR\u001a\u0010+\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Ldj9/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "index", "", "b", "J", "()J", "dueDate", "c", "amount", "fee", "e", "Ljava/lang/String;", "j", "state", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", "paidDateTime", "", "g", "Ljava/util/List;", "k", "()Ljava/util/List;", "transactionIds", "h", "repaidAmount", "i", "repaidFee", "lateInterest", "repaidLateInterest", "", "l", "Z", "()Z", "isOverLimit", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("index")
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    private final long fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paidDateTime")
    private final Long paidDateTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionIds")
    @NotNull
    private final List<String> transactionIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaidAmount")
    private final long repaidAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("repaidFee")
    private final long repaidFee;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("lateInterest")
    private final long lateInterest;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("repaidLateInterest")
    private final long repaidLateInterest;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("isOverLimit")
    private final boolean isOverLimit;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLateInterest() {
        return this.lateInterest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.index == eVar.index && this.dueDate == eVar.dueDate && this.amount == eVar.amount && this.fee == eVar.fee && Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.paidDateTime, eVar.paidDateTime) && Intrinsics.f(this.transactionIds, eVar.transactionIds) && this.repaidAmount == eVar.repaidAmount && this.repaidFee == eVar.repaidFee && this.lateInterest == eVar.lateInterest && this.repaidLateInterest == eVar.repaidLateInterest && this.isOverLimit == eVar.isOverLimit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getPaidDateTime() {
        return this.paidDateTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getRepaidAmount() {
        return this.repaidAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getRepaidFee() {
        return this.repaidFee;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(a0.d.c(a0.d.c(Integer.hashCode(this.index) * 31, 31, this.dueDate), 31, this.amount), 31, this.fee), 31, this.state);
        Long l2 = this.paidDateTime;
        return Boolean.hashCode(this.isOverLimit) + a0.d.c(a0.d.c(a0.d.c(a0.d.c(p.a.d((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.transactionIds), 31, this.repaidAmount), 31, this.repaidFee), 31, this.lateInterest), 31, this.repaidLateInterest);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getRepaidLateInterest() {
        return this.repaidLateInterest;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getTransactionIds() {
        return this.transactionIds;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsOverLimit() {
        return this.isOverLimit;
    }
}
