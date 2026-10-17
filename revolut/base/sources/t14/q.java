package t14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u001c"}, d2 = {"Lt14/q;", "", "", "toString", "()Ljava/lang/String;", "", "Lz14/d;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "credits", "", "J", "()J", "amount", "c", "duration", "d", "Ljava/lang/String;", "f", "repaymentType", "", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "repaymentDayRequested", "insurance", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("credits")
    private final List<z14.d> credits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("duration")
    private final long duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentType")
    private final String repaymentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("repaymentDayRequested")
    private final Integer repaymentDayRequested;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("insurance")
    private final String insurance;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCredits() {
        return this.credits;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInsurance() {
        return this.insurance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getRepaymentDayRequested() {
        return this.repaymentDayRequested;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.credits, qVar.credits) && this.amount == qVar.amount && this.duration == qVar.duration && Intrinsics.f(this.repaymentType, qVar.repaymentType) && Intrinsics.f(this.repaymentDayRequested, qVar.repaymentDayRequested) && Intrinsics.f(this.insurance, qVar.insurance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRepaymentType() {
        return this.repaymentType;
    }

    public final int hashCode() {
        List<z14.d> list = this.credits;
        int iC = a0.d.c(a0.d.c((list == null ? 0 : list.hashCode()) * 31, 31, this.amount), 31, this.duration);
        String str = this.repaymentType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.repaymentDayRequested;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.insurance;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
