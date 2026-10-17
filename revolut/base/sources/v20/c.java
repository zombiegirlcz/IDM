package v20;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001d\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0005R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020)8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b\u0013\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\nR\u001c\u00101\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b-\u0010\nR\u001c\u00105\u001a\u0004\u0018\u0001028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b0\u00104R\u001c\u0010:\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010?\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lv20/c;", "Lv20/n;", "Lv20/k1;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "Lorg/joda/time/Instant;", "b", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "c", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "d", "p", "ticketId", "e", "o", "ticketCreatedAt", "f", "Ljava/lang/String;", "t", "text", "", "Lv20/a;", "g", "Ljava/util/List;", "u", "()Ljava/util/List;", "uploads", "Lv20/b1;", "Lv20/b1;", "()Lv20/b1;", "sendingStatus", "i", "n", "serverId", "j", "feedId", "Lv30/c0;", "Lv30/c0;", "()Lv30/c0;", "feedType", "l", "Lv20/n;", "m", "()Lv20/n;", "replyTo", "Lv20/d;", "Lv20/d;", "s", "()Lv20/d;", "meta", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c extends n implements k1 {

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
    @lg.b("text")
    private final String text;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploads")
    @NotNull
    private final List<a> uploads;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("sendingStatus")
    @NotNull
    private final b1 sendingStatus;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyTo")
    private final n replyTo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("meta")
    private final d meta;

    public c(UUID id10, Instant time, MessageAuthor author, UUID ticketId, Instant ticketCreatedAt, String str, List uploads, b1 sendingStatus, UUID uuid, UUID uuid2, v30.c0 c0Var, n nVar, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(uploads, "uploads");
        Intrinsics.checkNotNullParameter(sendingStatus, "sendingStatus");
        this.id = id10;
        this.time = time;
        this.author = author;
        this.ticketId = ticketId;
        this.ticketCreatedAt = ticketCreatedAt;
        this.text = str;
        this.uploads = uploads;
        this.sendingStatus = sendingStatus;
        this.serverId = uuid;
        this.feedId = uuid2;
        this.feedType = c0Var;
        this.replyTo = nVar;
        this.meta = dVar;
    }

    public static c r(c cVar, MessageAuthor messageAuthor, ArrayList arrayList, b1 b1Var, n nVar, int i) {
        UUID id10 = cVar.id;
        Instant time = cVar.time;
        MessageAuthor author = (i & 4) != 0 ? cVar.author : messageAuthor;
        UUID ticketId = cVar.ticketId;
        Instant ticketCreatedAt = cVar.ticketCreatedAt;
        String str = cVar.text;
        List<a> uploads = (i & 64) != 0 ? cVar.uploads : arrayList;
        b1 sendingStatus = (i & 128) != 0 ? cVar.sendingStatus : b1Var;
        UUID uuid = cVar.serverId;
        UUID uuid2 = cVar.feedId;
        v30.c0 c0Var = cVar.feedType;
        n nVar2 = (i & 2048) != 0 ? cVar.replyTo : nVar;
        d dVar = cVar.meta;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(uploads, "uploads");
        Intrinsics.checkNotNullParameter(sendingStatus, "sendingStatus");
        return new c(id10, time, author, ticketId, ticketCreatedAt, str, uploads, sendingStatus, uuid, uuid2, c0Var, nVar2, dVar);
    }

    @Override // v20.k1
    /* JADX INFO: renamed from: c, reason: from getter */
    public final b1 getSendingStatus() {
        return this.sendingStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.time, cVar.time) && Intrinsics.f(this.author, cVar.author) && Intrinsics.f(this.ticketId, cVar.ticketId) && Intrinsics.f(this.ticketCreatedAt, cVar.ticketCreatedAt) && Intrinsics.f(this.text, cVar.text) && Intrinsics.f(this.uploads, cVar.uploads) && this.sendingStatus == cVar.sendingStatus && Intrinsics.f(this.serverId, cVar.serverId) && Intrinsics.f(this.feedId, cVar.feedId) && this.feedType == cVar.feedType && Intrinsics.f(this.replyTo, cVar.replyTo) && Intrinsics.f(this.meta, cVar.meta);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        n nVarF;
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        MessageAuthor messageAuthor3 = messageAuthor;
        if (messageAuthor2 != null) {
            n nVar = this.replyTo;
            nVarF = null;
            if (nVar != null) {
                nVarF = nVar.f(messageAuthor2, null, null, null);
            }
        } else {
            nVarF = this.replyTo;
        }
        return r(this, messageAuthor3, null, null, nVarF, 6139);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.ticketCreatedAt, t61.a.f(this.ticketId, v1.c.a(this.author, t61.a.g(this.time, this.id.hashCode() * 31, 31), 31), 31), 31);
        String str = this.text;
        int iHashCode = (this.sendingStatus.hashCode() + p.a.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.uploads)) * 31;
        UUID uuid = this.serverId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        n nVar = this.replyTo;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        d dVar = this.meta;
        return iHashCode5 + (dVar != null ? dVar.hashCode() : 0);
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
    public final String l() {
        d dVar = this.meta;
        if (dVar != null) {
            return dVar.getMessageGroupId();
        }
        return null;
    }

    @Override // v20.n
    /* JADX INFO: renamed from: m, reason: from getter */
    public final n getReplyTo() {
        return this.replyTo;
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
    public final d getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final List getUploads() {
        return this.uploads;
    }
}
