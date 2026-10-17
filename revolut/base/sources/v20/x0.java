package v20;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010\u0005R\u001c\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0005R\u001c\u00100\u001a\u0004\u0018\u00010,8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b1\u0010\nR\u001c\u00104\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b)\u0010\nR\u001c\u00106\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b3\u0010\u0005¨\u00067"}, d2 = {"Lv20/x0;", "Lv20/n;", "Lv20/i;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "b", "p", "ticketId", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "d", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "e", "callRequestId", "f", "o", "ticketCreatedAt", "Lf20/i;", "g", "Lf20/i;", "getCallType", "()Lf20/i;", "callType", "Ljava/lang/String;", "getLanguage", "language", "i", "s", "category", "Lv30/c0;", "j", "Lv30/c0;", "()Lv30/c0;", "feedType", "n", "serverId", "l", "feedId", "m", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x0 extends n implements i {

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
    @NotNull
    private final f20.i callType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("language")
    private final String language;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    public x0(UUID id10, UUID ticketId, Instant time, MessageAuthor author, UUID uuid, Instant ticketCreatedAt, f20.i callType, String str, String str2, v30.c0 c0Var, UUID uuid2, UUID uuid3, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(callType, "callType");
        this.id = id10;
        this.ticketId = ticketId;
        this.time = time;
        this.author = author;
        this.callRequestId = uuid;
        this.ticketCreatedAt = ticketCreatedAt;
        this.callType = callType;
        this.language = str;
        this.category = str2;
        this.feedType = c0Var;
        this.serverId = uuid2;
        this.feedId = uuid3;
        this.messageGroupId = str3;
    }

    public static x0 r(x0 x0Var, Instant instant, MessageAuthor messageAuthor, int i) {
        UUID id10 = x0Var.id;
        UUID ticketId = x0Var.ticketId;
        if ((i & 4) != 0) {
            instant = x0Var.time;
        }
        Instant time = instant;
        MessageAuthor author = (i & 8) != 0 ? x0Var.author : messageAuthor;
        UUID uuid = x0Var.callRequestId;
        Instant ticketCreatedAt = x0Var.ticketCreatedAt;
        f20.i callType = x0Var.callType;
        String str = x0Var.language;
        String str2 = x0Var.category;
        v30.c0 c0Var = x0Var.feedType;
        UUID uuid2 = x0Var.serverId;
        UUID uuid3 = x0Var.feedId;
        String str3 = x0Var.messageGroupId;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(callType, "callType");
        return new x0(id10, ticketId, time, author, uuid, ticketCreatedAt, callType, str, str2, c0Var, uuid2, uuid3, str3);
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
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.id, x0Var.id) && Intrinsics.f(this.ticketId, x0Var.ticketId) && Intrinsics.f(this.time, x0Var.time) && Intrinsics.f(this.author, x0Var.author) && Intrinsics.f(this.callRequestId, x0Var.callRequestId) && Intrinsics.f(this.ticketCreatedAt, x0Var.ticketCreatedAt) && this.callType == x0Var.callType && Intrinsics.f(this.language, x0Var.language) && Intrinsics.f(this.category, x0Var.category) && this.feedType == x0Var.feedType && Intrinsics.f(this.serverId, x0Var.serverId) && Intrinsics.f(this.feedId, x0Var.feedId) && Intrinsics.f(this.messageGroupId, x0Var.messageGroupId);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        return r(this, null, messageAuthor, 8183);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iA = v1.c.a(this.author, t61.a.g(this.time, t61.a.f(this.ticketId, this.id.hashCode() * 31, 31), 31), 31);
        UUID uuid = this.callRequestId;
        int iHashCode = (this.callType.hashCode() + t61.a.g(this.ticketCreatedAt, (iA + (uuid == null ? 0 : uuid.hashCode())) * 31, 31)) * 31;
        String str = this.language;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid2 = this.serverId;
        int iHashCode5 = (iHashCode4 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.feedId;
        int iHashCode6 = (iHashCode5 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        String str3 = this.messageGroupId;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
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

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getCategory() {
        return this.category;
    }
}
