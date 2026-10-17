package ks6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0012"}, d2 = {"Lks6/z;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "createdDate", "b", "d", "updatedDate", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "paidDate", "sentDate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paidDate")
    private final Long paidDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sentDate")
    private final Long sentDate;

    public z(long j2, long j3, Long l2, Long l3) {
        this.createdDate = j2;
        this.updatedDate = j3;
        this.paidDate = l2;
        this.sentDate = l3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getPaidDate() {
        return this.paidDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getSentDate() {
        return this.sentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.createdDate == zVar.createdDate && this.updatedDate == zVar.updatedDate && Intrinsics.f(this.paidDate, zVar.paidDate) && Intrinsics.f(this.sentDate, zVar.sentDate);
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.createdDate) * 31, 31, this.updatedDate);
        Long l2 = this.paidDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.sentDate;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }
}
