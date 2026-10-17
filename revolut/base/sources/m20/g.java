package m20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lm20/g;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "openNew", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "ticketId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("openNew")
    private final boolean openNew;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketId")
    private final UUID ticketId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getOpenNew() {
        return this.openNew;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getTicketId() {
        return this.ticketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.openNew == gVar.openNew && Intrinsics.f(this.ticketId, gVar.ticketId);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.openNew) * 31;
        UUID uuid = this.ticketId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }
}
