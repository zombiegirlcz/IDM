package jcl;

import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0019"}, d2 = {"Ljcl/c;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZonedDateTime;", "a", "Ljava/time/ZonedDateTime;", "b", "()Ljava/time/ZonedDateTime;", "createdDate", "Ljava/lang/String;", "f", "ref", "c", "h", "total", "d", "e", "pending", "available", "lockup", "g", "softLockUntil", "hardLockUntil", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final ZonedDateTime createdDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final String total;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pending")
    @NotNull
    private final String pending;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("available")
    @NotNull
    private final String available;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lockup")
    @NotNull
    private final String lockup;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("softLockUntil")
    private final ZonedDateTime softLockUntil;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("hardLockUntil")
    private final ZonedDateTime hardLockUntil;

    public c(ZonedDateTime createdDate, String ref2, String total, String pending, String available, String lockup, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(pending, "pending");
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(lockup, "lockup");
        this.createdDate = createdDate;
        this.ref = ref2;
        this.total = total;
        this.pending = pending;
        this.available = available;
        this.lockup = lockup;
        this.softLockUntil = zonedDateTime;
        this.hardLockUntil = zonedDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ZonedDateTime getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZonedDateTime getHardLockUntil() {
        return this.hardLockUntil;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLockup() {
        return this.lockup;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPending() {
        return this.pending;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.createdDate, cVar.createdDate) && Intrinsics.f(this.ref, cVar.ref) && Intrinsics.f(this.total, cVar.total) && Intrinsics.f(this.pending, cVar.pending) && Intrinsics.f(this.available, cVar.available) && Intrinsics.f(this.lockup, cVar.lockup) && Intrinsics.f(this.softLockUntil, cVar.softLockUntil) && Intrinsics.f(this.hardLockUntil, cVar.hardLockUntil);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ZonedDateTime getSoftLockUntil() {
        return this.softLockUntil;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.createdDate.hashCode() * 31, 31, this.ref), 31, this.total), 31, this.pending), 31, this.available), 31, this.lockup);
        ZonedDateTime zonedDateTime = this.softLockUntil;
        int iHashCode = (iC + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.hardLockUntil;
        return iHashCode + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0);
    }
}
