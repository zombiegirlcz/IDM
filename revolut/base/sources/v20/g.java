package v20;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0005R\u001a\u0010%\u001a\u00020!8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0007\u0010$R\u001a\u0010'\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b&\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0018\u0010+R\u001c\u00101\u001a\u0004\u0018\u00010-8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001c\u00103\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b2\u0010\nR\u001c\u00105\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b4\u0010\b\u001a\u0004\b)\u0010\nR\u001c\u00107\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b4\u0010\u0005¨\u00068"}, d2 = {"Lv20/g;", "Lv20/n;", "Lv20/j;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "Lorg/joda/time/Instant;", "b", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "c", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "d", "p", "ticketId", "e", "callId", "f", "Ljava/lang/String;", "getCallRef", "callRef", "Li20/h0;", "g", "Li20/h0;", "()Li20/h0;", "payloadType", "o", "ticketCreatedAt", "Lv20/h;", "i", "Lv20/h;", "()Lv20/h;", "initializedBy", "Lv30/c0;", "j", "Lv30/c0;", "()Lv30/c0;", "feedType", "n", "serverId", "l", "feedId", "m", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g extends n implements j {

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
    @lg.b("callId")
    @NotNull
    private final UUID callId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("callRef")
    private final String callRef;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("payloadType")
    @NotNull
    private final i20.h0 payloadType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketCreatedAt")
    @NotNull
    private final Instant ticketCreatedAt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("initializedBy")
    private final h initializedBy;

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

    public g(UUID id10, Instant time, MessageAuthor author, UUID ticketId, UUID callId, String str, i20.h0 payloadType, Instant ticketCreatedAt, h hVar, v30.c0 c0Var, UUID uuid, UUID uuid2, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        this.id = id10;
        this.time = time;
        this.author = author;
        this.ticketId = ticketId;
        this.callId = callId;
        this.callRef = str;
        this.payloadType = payloadType;
        this.ticketCreatedAt = ticketCreatedAt;
        this.initializedBy = hVar;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
        this.messageGroupId = str2;
    }

    public static g r(g gVar, Instant instant, MessageAuthor messageAuthor, int i) {
        UUID id10 = gVar.id;
        if ((i & 2) != 0) {
            instant = gVar.time;
        }
        Instant time = instant;
        MessageAuthor author = (i & 4) != 0 ? gVar.author : messageAuthor;
        UUID ticketId = gVar.ticketId;
        UUID callId = gVar.callId;
        String str = gVar.callRef;
        i20.h0 payloadType = gVar.payloadType;
        Instant ticketCreatedAt = gVar.ticketCreatedAt;
        h hVar = gVar.initializedBy;
        v30.c0 c0Var = gVar.feedType;
        UUID uuid = gVar.serverId;
        UUID uuid2 = gVar.feedId;
        String str2 = gVar.messageGroupId;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        return new g(id10, time, author, ticketId, callId, str, payloadType, ticketCreatedAt, hVar, c0Var, uuid, uuid2, str2);
    }

    @Override // v20.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public final i20.h0 getPayloadType() {
        return this.payloadType;
    }

    @Override // v20.j
    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getInitializedBy() {
        return this.initializedBy;
    }

    @Override // v20.j
    /* JADX INFO: renamed from: e, reason: from getter */
    public final UUID getCallId() {
        return this.callId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.time, gVar.time) && Intrinsics.f(this.author, gVar.author) && Intrinsics.f(this.ticketId, gVar.ticketId) && Intrinsics.f(this.callId, gVar.callId) && Intrinsics.f(this.callRef, gVar.callRef) && this.payloadType == gVar.payloadType && Intrinsics.f(this.ticketCreatedAt, gVar.ticketCreatedAt) && this.initializedBy == gVar.initializedBy && this.feedType == gVar.feedType && Intrinsics.f(this.serverId, gVar.serverId) && Intrinsics.f(this.feedId, gVar.feedId) && Intrinsics.f(this.messageGroupId, gVar.messageGroupId);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        return r(this, null, messageAuthor, 8187);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iF = t61.a.f(this.callId, t61.a.f(this.ticketId, v1.c.a(this.author, t61.a.g(this.time, this.id.hashCode() * 31, 31), 31), 31), 31);
        String str = this.callRef;
        int iG = t61.a.g(this.ticketCreatedAt, (this.payloadType.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        h hVar = this.initializedBy;
        int iHashCode = (iG + (hVar == null ? 0 : hVar.hashCode())) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.serverId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str2 = this.messageGroupId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
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
