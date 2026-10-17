package ks6;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001d"}, d2 = {"Lks6/s;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDateTime;", "a", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "createdAt", "b", "h", "updatedAt", "c", "Ljava/lang/String;", "e", "state", "d", "g", "type", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "reservedAmount", "f", "releaseDate", "releasedAmount", "transactionId", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final LocalDateTime createdAt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final LocalDateTime updatedAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("reservedAmount")
    @NotNull
    private final jo3.a reservedAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("releaseDate")
    @NotNull
    private final LocalDateTime releaseDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("releasedAmount")
    private final jo3.a releasedAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    public s(LocalDateTime createdAt, LocalDateTime localDateTime, String state, String type, jo3.a reservedAmount, LocalDateTime releaseDate, jo3.a aVar, String str) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reservedAmount, "reservedAmount");
        Intrinsics.checkNotNullParameter(releaseDate, "releaseDate");
        this.createdAt = createdAt;
        this.updatedAt = localDateTime;
        this.state = state;
        this.type = type;
        this.reservedAmount = reservedAmount;
        this.releaseDate = releaseDate;
        this.releasedAmount = aVar;
        this.transactionId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDateTime getReleaseDate() {
        return this.releaseDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getReleasedAmount() {
        return this.releasedAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getReservedAmount() {
        return this.reservedAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.createdAt, sVar.createdAt) && Intrinsics.f(this.updatedAt, sVar.updatedAt) && Intrinsics.f(this.state, sVar.state) && Intrinsics.f(this.type, sVar.type) && Intrinsics.f(this.reservedAmount, sVar.reservedAmount) && Intrinsics.f(this.releaseDate, sVar.releaseDate) && Intrinsics.f(this.releasedAmount, sVar.releasedAmount) && Intrinsics.f(this.transactionId, sVar.transactionId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int iHashCode = this.createdAt.hashCode() * 31;
        LocalDateTime localDateTime = this.updatedAt;
        int i = v7.i(this.releaseDate, v7.j(this.reservedAmount, p.a.c(p.a.c((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.state), 31, this.type), 31), 31);
        jo3.a aVar = this.releasedAmount;
        int iHashCode2 = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.transactionId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
