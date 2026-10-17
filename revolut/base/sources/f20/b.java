package f20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006 "}, d2 = {"Lf20/b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "i", "()Ljava/util/UUID;", "ticketId", "b", "Ljava/lang/String;", "h", "state", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "g", "()Lorg/joda/time/Instant;", "scheduledAt", "d", "createdAt", "e", "j", "updatedAt", "f", "scheduledAgentId", "category", "callType", "language", "canceledBy", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"id"}, value = "ticketId")
    private final UUID ticketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledAt")
    private final Instant scheduledAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final Instant createdAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("updatedAt")
    private final Instant updatedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scheduledAgentId")
    private final UUID scheduledAgentId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("callType")
    private final String callType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("language")
    private final String language;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("canceledBy")
    private final String canceledBy;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCanceledBy() {
        return this.canceledBy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.ticketId, bVar.ticketId) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.scheduledAt, bVar.scheduledAt) && Intrinsics.f(this.createdAt, bVar.createdAt) && Intrinsics.f(this.updatedAt, bVar.updatedAt) && Intrinsics.f(this.scheduledAgentId, bVar.scheduledAgentId) && Intrinsics.f(this.category, bVar.category) && Intrinsics.f(this.callType, bVar.callType) && Intrinsics.f(this.language, bVar.language) && Intrinsics.f(this.canceledBy, bVar.canceledBy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UUID getScheduledAgentId() {
        return this.scheduledAgentId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Instant getScheduledAt() {
        return this.scheduledAt;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        UUID uuid = this.ticketId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.scheduledAt;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        UUID uuid2 = this.scheduledAgentId;
        int iC = p.a.c((iHashCode5 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31, 31, this.category);
        String str2 = this.callType;
        int iHashCode6 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.canceledBy;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final UUID getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }
}
