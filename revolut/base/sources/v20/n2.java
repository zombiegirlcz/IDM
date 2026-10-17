package v20;

import com.revolut.chat.data.repository.chat.ChatMessageMarkdownException;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010+\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010\u0007\u001a\u0004\b*\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b)\u0010\t¨\u0006-"}, d2 = {"Lv20/n2;", "Lv20/n;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "b", "p", "ticketId", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "d", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "e", "o", "ticketCreatedAt", "f", "Ljava/lang/String;", "r", "actionId", "g", "s", "actionTitle", "Lv30/c0;", "Lv30/c0;", "j", "()Lv30/c0;", "feedType", "i", "n", "serverId", "feedId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n2 extends n {

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
    @lg.b("ticketCreatedAt")
    @NotNull
    private final Instant ticketCreatedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("actionId")
    @NotNull
    private final String actionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionTitle")
    @NotNull
    private final String actionTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;
    public transient String k;

    public n2(MessageAuthor author, String actionId, String actionTitle, UUID id10, UUID ticketId, UUID uuid, UUID uuid2, Instant time, Instant ticketCreatedAt, v30.c0 c0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        this.id = id10;
        this.ticketId = ticketId;
        this.time = time;
        this.author = author;
        this.ticketCreatedAt = ticketCreatedAt;
        this.actionId = actionId;
        this.actionTitle = actionTitle;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.id, n2Var.id) && Intrinsics.f(this.ticketId, n2Var.ticketId) && Intrinsics.f(this.time, n2Var.time) && Intrinsics.f(this.author, n2Var.author) && Intrinsics.f(this.ticketCreatedAt, n2Var.ticketCreatedAt) && Intrinsics.f(this.actionId, n2Var.actionId) && Intrinsics.f(this.actionTitle, n2Var.actionTitle) && this.feedType == n2Var.feedType && Intrinsics.f(this.serverId, n2Var.serverId) && Intrinsics.f(this.feedId, n2Var.feedId);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        MessageAuthor author = messageAuthor;
        UUID id10 = this.id;
        UUID ticketId = this.ticketId;
        Instant time = this.time;
        Instant ticketCreatedAt = this.ticketCreatedAt;
        String actionId = this.actionId;
        String actionTitle = this.actionTitle;
        v30.c0 c0Var = this.feedType;
        UUID uuid = this.serverId;
        UUID uuid2 = this.feedId;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        return new n2(author, actionId, actionTitle, id10, ticketId, uuid, uuid2, time, ticketCreatedAt, c0Var);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(t61.a.g(this.ticketCreatedAt, v1.c.a(this.author, t61.a.g(this.time, t61.a.f(this.ticketId, this.id.hashCode() * 31, 31), 31), 31), 31), 31, this.actionId), 31, this.actionTitle);
        v30.c0 c0Var = this.feedType;
        int iHashCode = (iC + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.serverId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        return iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0);
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

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final String t(k50.x textMapper) {
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        try {
            String str = this.k;
            if (str != null) {
                return str;
            }
            String strC = textMapper.c(this.actionTitle);
            this.k = strC;
            return strC;
        } catch (Exception e) {
            String strM = kotlin.jvm.internal.o0.f186429a.b(n2.class).m();
            if (strM == null) {
                strM = "";
            }
            String string = this.id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ChatMessageMarkdownException chatMessageMarkdownException = new ChatMessageMarkdownException(strM, string, e);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ChatMessageMarkdownException", null, chatMessageMarkdownException, h0Var);
            String str2 = this.actionTitle;
            this.k = str2;
            return str2;
        }
    }
}
