package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"La9g/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "roomId", "b", "bedOptionId", "c", "rateId", "occupancy", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("roomId")
    @NotNull
    private final String roomId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bedOptionId")
    @NotNull
    private final String bedOptionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rateId")
    @NotNull
    private final String rateId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final String occupancy;

    public u(String roomId, String bedOptionId, String rateId, String occupancy) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(bedOptionId, "bedOptionId");
        Intrinsics.checkNotNullParameter(rateId, "rateId");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        this.roomId = roomId;
        this.bedOptionId = bedOptionId;
        this.rateId = rateId;
        this.occupancy = occupancy;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBedOptionId() {
        return this.bedOptionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOccupancy() {
        return this.occupancy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRateId() {
        return this.rateId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.roomId, uVar.roomId) && Intrinsics.f(this.bedOptionId, uVar.bedOptionId) && Intrinsics.f(this.rateId, uVar.rateId) && Intrinsics.f(this.occupancy, uVar.occupancy);
    }

    public final int hashCode() {
        return this.occupancy.hashCode() + p.a.c(p.a.c(this.roomId.hashCode() * 31, 31, this.bedOptionId), 31, this.rateId);
    }
}
