package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lxo4/w;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "interestRate", "", "J", "c", "()J", "startDate", "endDate", "d", "Ljava/lang/String;", "termsUrl", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    private final double interestRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final long startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final long endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    public w(double d, long j2, long j3, String str) {
        this.interestRate = d;
        this.startDate = j2;
        this.endDate = j3;
        this.termsUrl = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getInterestRate() {
        return this.interestRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Double.compare(this.interestRate, wVar.interestRate) == 0 && this.startDate == wVar.startDate && this.endDate == wVar.endDate && Intrinsics.f(this.termsUrl, wVar.termsUrl);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(Double.hashCode(this.interestRate) * 31, 31, this.startDate), 31, this.endDate);
        String str = this.termsUrl;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
