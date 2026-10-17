package yei;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lyei/f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "checkInTimeMillis", "b", "checkOutTimeMillis", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkIn")
    private final long checkInTimeMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkOut")
    private final long checkOutTimeMillis;

    public f(long j2, long j3) {
        this.checkInTimeMillis = j2;
        this.checkOutTimeMillis = j3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCheckInTimeMillis() {
        return this.checkInTimeMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCheckOutTimeMillis() {
        return this.checkOutTimeMillis;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.checkInTimeMillis == fVar.checkInTimeMillis && this.checkOutTimeMillis == fVar.checkOutTimeMillis;
    }

    public final int hashCode() {
        return Long.hashCode(this.checkOutTimeMillis) + (Long.hashCode(this.checkInTimeMillis) * 31);
    }
}
