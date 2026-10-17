package z14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lz14/i;", "", "", "toString", "()Ljava/lang/String;", "", "Lz14/d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "credits", "", "b", "J", "c", "()J", "extraCash", "duration", "d", "Ljava/lang/String;", "repaymentType", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("credits")
    private final List<d> credits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("extraCash")
    private final long extraCash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("duration")
    private final long duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentType")
    private final String repaymentType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCredits() {
        return this.credits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getExtraCash() {
        return this.extraCash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRepaymentType() {
        return this.repaymentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.credits, iVar.credits) && this.extraCash == iVar.extraCash && this.duration == iVar.duration && Intrinsics.f(this.repaymentType, iVar.repaymentType);
    }

    public final int hashCode() {
        List<d> list = this.credits;
        int iC = a0.d.c(a0.d.c((list == null ? 0 : list.hashCode()) * 31, 31, this.extraCash), 31, this.duration);
        String str = this.repaymentType;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
