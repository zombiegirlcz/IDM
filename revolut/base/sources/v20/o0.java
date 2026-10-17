package v20;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b)\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010\u0007\u001a\u0004\b+\u0010\tR\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b.\u0010\u0004¨\u00060"}, d2 = {"Lv20/o0;", "Lv20/n;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "Lorg/joda/time/Instant;", "b", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "c", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "d", "p", "ticketId", "e", "o", "ticketCreatedAt", "Lv20/n0;", "f", "Lv20/n0;", "getEntity", "()Lv20/n0;", "entity", "Lv30/c0;", "g", "Lv30/c0;", "j", "()Lv30/c0;", "feedType", "n", "serverId", "i", "feedId", "Ljava/lang/String;", "l", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("time")
    @NotNull
    private final Instant time;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("author")
    @NotNull
    private final MessageAuthor author;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ticketId")
    @NotNull
    private final UUID ticketId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ticketCreatedAt")
    @NotNull
    private final Instant ticketCreatedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("entity")
    @NotNull
    private final n0 entity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    public o0(UUID id10, Instant time, MessageAuthor author, UUID ticketId, Instant ticketCreatedAt, n0 entity, v30.c0 c0Var, UUID uuid, UUID uuid2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.id = id10;
        this.time = time;
        this.author = author;
        this.ticketId = ticketId;
        this.ticketCreatedAt = ticketCreatedAt;
        this.entity = entity;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
        this.messageGroupId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.id, o0Var.id) && Intrinsics.f(this.time, o0Var.time) && Intrinsics.f(this.author, o0Var.author) && Intrinsics.f(this.ticketId, o0Var.ticketId) && Intrinsics.f(this.ticketCreatedAt, o0Var.ticketCreatedAt) && Intrinsics.f(this.entity, o0Var.entity) && this.feedType == o0Var.feedType && Intrinsics.f(this.serverId, o0Var.serverId) && Intrinsics.f(this.feedId, o0Var.feedId) && Intrinsics.f(this.messageGroupId, o0Var.messageGroupId);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        MessageAuthor author = messageAuthor;
        UUID id10 = this.id;
        Instant time = this.time;
        UUID ticketId = this.ticketId;
        Instant ticketCreatedAt = this.ticketCreatedAt;
        n0 entity = this.entity;
        v30.c0 c0Var = this.feedType;
        UUID uuid = this.serverId;
        UUID uuid2 = this.feedId;
        String str3 = this.messageGroupId;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new o0(id10, time, author, ticketId, ticketCreatedAt, entity, c0Var, uuid, uuid2, str3);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iHashCode = (this.entity.hashCode() + t61.a.g(this.ticketCreatedAt, t61.a.f(this.ticketId, v1.c.a(this.author, t61.a.g(this.time, this.id.hashCode() * 31, 31), 31), 31), 31)) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.serverId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.messageGroupId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: i, reason: from getter */
    public final UUID getFeedId() {
        return this.feedId;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: j, reason: from getter */
    public final v30.c0 getFeedType() {
        return this.feedType;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: k, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getMessageGroupId() {
        return this.messageGroupId;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: n, reason: from getter */
    public final UUID getServerId() {
        return this.serverId;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Instant getTicketCreatedAt() {
        return this.ticketCreatedAt;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: p, reason: from getter */
    public final UUID getTicketId() {
        return this.ticketId;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: q, reason: from getter */
    public final Instant getTime() {
        return this.time;
    }
}
