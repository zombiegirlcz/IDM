package dj9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Ldj9/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "planId", "", "b", "I", "c", "()I", "instalmentIndex", "", "J", "()J", "amount", "d", "fee", "lateInterest", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalmentIndex")
    private final int instalmentIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    private final long fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lateInterest")
    private final long lateInterest;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInstalmentIndex() {
        return this.instalmentIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLateInterest() {
        return this.lateInterest;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.planId, tVar.planId) && this.instalmentIndex == tVar.instalmentIndex && this.amount == tVar.amount && this.fee == tVar.fee && this.lateInterest == tVar.lateInterest;
    }

    public final int hashCode() {
        return Long.hashCode(this.lateInterest) + a0.d.c(a0.d.c(j6.a.b(this.instalmentIndex, this.planId.hashCode() * 31, 31), 31, this.amount), 31, this.fee);
    }
}
