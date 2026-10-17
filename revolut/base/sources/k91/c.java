package k91;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\t¨\u0006\u0011"}, d2 = {"Lk91/c;", "", "", "toString", "()Ljava/lang/String;", "", "Lk91/f;", "a", "Ljava/util/List;", "()Ljava/util/List;", "directDebits", "Lk91/m;", "b", "c", "scheduledPayments", "Lk91/i;", "incomingPayments", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("directDebits")
    private final List<f> directDebits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledPayments")
    private final List<m> scheduledPayments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("credits")
    private final List<i> incomingPayments;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDirectDebits() {
        return this.directDebits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getIncomingPayments() {
        return this.incomingPayments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getScheduledPayments() {
        return this.scheduledPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.directDebits, cVar.directDebits) && Intrinsics.f(this.scheduledPayments, cVar.scheduledPayments) && Intrinsics.f(this.incomingPayments, cVar.incomingPayments);
    }

    public final int hashCode() {
        List<f> list = this.directDebits;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<m> list2 = this.scheduledPayments;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<i> list3 = this.incomingPayments;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
