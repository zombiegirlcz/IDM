package v20;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b,\u0010\nR\u001c\u0010.\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b+\u0010\nR\u001c\u00101\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0005¨\u00062"}, d2 = {"Lv20/w0;", "Lv20/n;", "Lv20/i;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "b", "p", "ticketId", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "d", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "e", "callRequestId", "f", "o", "ticketCreatedAt", "Lf20/i;", "g", "Lf20/i;", "getCallType", "()Lf20/i;", "callType", "Lv30/c0;", "Lv30/c0;", "j", "()Lv30/c0;", "feedType", "i", "n", "serverId", "feedId", "Ljava/lang/String;", "l", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 extends n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketId")
    @NotNull
    private final UUID ticketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("time")
    @NotNull
    private final Instant time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("author")
    @NotNull
    private final MessageAuthor author;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("callRequestId")
    private final UUID callRequestId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ticketCreatedAt")
    @NotNull
    private final Instant ticketCreatedAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("callType")
    private final f20.i callType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    public w0(UUID id10, UUID ticketId, Instant time, MessageAuthor author, UUID uuid, Instant ticketCreatedAt, f20.i iVar, v30.c0 c0Var, UUID uuid2, UUID uuid3, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        this.id = id10;
        this.ticketId = ticketId;
        this.time = time;
        this.author = author;
        this.callRequestId = uuid;
        this.ticketCreatedAt = ticketCreatedAt;
        this.callType = iVar;
        this.feedType = c0Var;
        this.serverId = uuid2;
        this.feedId = uuid3;
        this.messageGroupId = str;
    }

    public static w0 r(w0 w0Var, Instant instant, MessageAuthor messageAuthor, int i) {
        UUID id10 = w0Var.id;
        UUID ticketId = w0Var.ticketId;
        if ((i & 4) != 0) {
            instant = w0Var.time;
        }
        Instant time = instant;
        if ((i & 8) != 0) {
            messageAuthor = w0Var.author;
        }
        MessageAuthor author = messageAuthor;
        UUID uuid = w0Var.callRequestId;
        Instant ticketCreatedAt = w0Var.ticketCreatedAt;
        f20.i iVar = w0Var.callType;
        v30.c0 c0Var = w0Var.feedType;
        UUID uuid2 = w0Var.serverId;
        UUID uuid3 = w0Var.feedId;
        String str = w0Var.messageGroupId;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        return new w0(id10, ticketId, time, author, uuid, ticketCreatedAt, iVar, c0Var, uuid2, uuid3, str);
    }

    @Override // v20.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getCallRequestId() {
        return this.callRequestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.id, w0Var.id) && Intrinsics.f(this.ticketId, w0Var.ticketId) && Intrinsics.f(this.time, w0Var.time) && Intrinsics.f(this.author, w0Var.author) && Intrinsics.f(this.callRequestId, w0Var.callRequestId) && Intrinsics.f(this.ticketCreatedAt, w0Var.ticketCreatedAt) && this.callType == w0Var.callType && this.feedType == w0Var.feedType && Intrinsics.f(this.serverId, w0Var.serverId) && Intrinsics.f(this.feedId, w0Var.feedId) && Intrinsics.f(this.messageGroupId, w0Var.messageGroupId);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        return r(this, null, messageAuthor, 2039);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iA = v1.c.a(this.author, t61.a.g(this.time, t61.a.f(this.ticketId, this.id.hashCode() * 31, 31), 31), 31);
        UUID uuid = this.callRequestId;
        int iG = t61.a.g(this.ticketCreatedAt, (iA + (uuid == null ? 0 : uuid.hashCode())) * 31, 31);
        f20.i iVar = this.callType;
        int iHashCode = (iG + (iVar == null ? 0 : iVar.hashCode())) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid2 = this.serverId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.feedId;
        int iHashCode4 = (iHashCode3 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
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
