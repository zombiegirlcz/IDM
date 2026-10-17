package v20;

import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.ChatMessageMarkdownException;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001d\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0005R\u001c\u0010'\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b(\u0010\u0005R\u001c\u0010/\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00108\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\u0002098\u0016X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u0013\u0010<R\u001c\u0010B\u001a\u0004\u0018\u00010>8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b0\u0010AR\u001c\u0010D\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bC\u0010\nR\u001c\u0010E\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b+\u0010\nR\u001c\u0010J\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010M\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\b?\u0010LR\u001c\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u001f\u001a\u0004\bO\u0010\u0005¨\u0006R"}, d2 = {"Lv20/o2;", "Lv20/n;", "Lv20/k1;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "Lorg/joda/time/Instant;", "b", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "c", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "d", "p", "ticketId", "e", "o", "ticketCreatedAt", "f", "Ljava/lang/String;", "t", "message", "", "g", "Ljava/lang/Boolean;", "y", "()Ljava/lang/Boolean;", "preventEscalation", "v", "messageTranslated", "Lv20/q0;", "i", "Lv20/q0;", "getExpandableState", "()Lv20/q0;", "expandableState", "j", "Z", "isMass", "()Z", "Lv20/z0;", "Lv20/z0;", "w", "()Lv20/z0;", "meta", "Lv20/b1;", "l", "Lv20/b1;", "()Lv20/b1;", "sendingStatus", "Lv30/c0;", "m", "Lv30/c0;", "()Lv30/c0;", "feedType", "n", "serverId", "feedId", "Lv20/a1;", "Lv20/a1;", "x", "()Lv20/a1;", "notification", "Lv20/n;", "()Lv20/n;", "replyTo", "r", "u", "messageRawLocal", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o2 extends n implements k1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

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
    @lg.b("message")
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("preventEscalation")
    private final Boolean preventEscalation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageTranslated")
    private final String messageTranslated;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("expandableState")
    private final q0 expandableState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("isMass")
    private final boolean isMass;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("meta")
    private final z0 meta;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("sendingStatus")
    @NotNull
    private final b1 sendingStatus;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("notification")
    private final a1 notification;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyTo")
    private final n replyTo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageRawLocal")
    private final String messageRawLocal;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient String f285513s;

    /* JADX INFO: renamed from: v20.o2$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        private Companion() {
        }

        public Companion(int i) {
        }
    }

    public o2(UUID id10, Instant time, MessageAuthor author, UUID ticketId, Instant ticketCreatedAt, String message, Boolean bool, String str, q0 q0Var, boolean z, z0 z0Var, b1 sendingStatus, v30.c0 c0Var, UUID uuid, UUID uuid2, a1 a1Var, n nVar, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sendingStatus, "sendingStatus");
        this.id = id10;
        this.time = time;
        this.author = author;
        this.ticketId = ticketId;
        this.ticketCreatedAt = ticketCreatedAt;
        this.message = message;
        this.preventEscalation = bool;
        this.messageTranslated = str;
        this.expandableState = q0Var;
        this.isMass = z;
        this.meta = z0Var;
        this.sendingStatus = sendingStatus;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
        this.notification = a1Var;
        this.replyTo = nVar;
        this.messageRawLocal = str2;
    }

    public static o2 r(o2 o2Var, UUID uuid, Instant instant, MessageAuthor messageAuthor, UUID uuid2, Instant instant2, b1 b1Var, n nVar, int i) {
        UUID id10 = (i & 1) != 0 ? o2Var.id : uuid;
        Instant time = (i & 2) != 0 ? o2Var.time : instant;
        MessageAuthor author = (i & 4) != 0 ? o2Var.author : messageAuthor;
        UUID ticketId = (i & 8) != 0 ? o2Var.ticketId : uuid2;
        Instant ticketCreatedAt = (i & 16) != 0 ? o2Var.ticketCreatedAt : instant2;
        String message = o2Var.message;
        Boolean bool = o2Var.preventEscalation;
        String str = o2Var.messageTranslated;
        q0 q0Var = o2Var.expandableState;
        boolean z = o2Var.isMass;
        z0 z0Var = o2Var.meta;
        b1 sendingStatus = (i & 2048) != 0 ? o2Var.sendingStatus : b1Var;
        v30.c0 c0Var = o2Var.feedType;
        UUID uuid3 = o2Var.serverId;
        UUID uuid4 = o2Var.feedId;
        a1 a1Var = o2Var.notification;
        n nVar2 = (i & 65536) != 0 ? o2Var.replyTo : nVar;
        String str2 = o2Var.messageRawLocal;
        o2Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sendingStatus, "sendingStatus");
        return new o2(id10, time, author, ticketId, ticketCreatedAt, message, bool, str, q0Var, z, z0Var, sendingStatus, c0Var, uuid3, uuid4, a1Var, nVar2, str2);
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
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.id, o2Var.id) && Intrinsics.f(this.time, o2Var.time) && Intrinsics.f(this.author, o2Var.author) && Intrinsics.f(this.ticketId, o2Var.ticketId) && Intrinsics.f(this.ticketCreatedAt, o2Var.ticketCreatedAt) && Intrinsics.f(this.message, o2Var.message) && Intrinsics.f(this.preventEscalation, o2Var.preventEscalation) && Intrinsics.f(this.messageTranslated, o2Var.messageTranslated) && this.expandableState == o2Var.expandableState && this.isMass == o2Var.isMass && Intrinsics.f(this.meta, o2Var.meta) && this.sendingStatus == o2Var.sendingStatus && this.feedType == o2Var.feedType && Intrinsics.f(this.serverId, o2Var.serverId) && Intrinsics.f(this.feedId, o2Var.feedId) && Intrinsics.f(this.notification, o2Var.notification) && Intrinsics.f(this.replyTo, o2Var.replyTo) && Intrinsics.f(this.messageRawLocal, o2Var.messageRawLocal);
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
            nVarF = nVar != null ? nVar.f(messageAuthor2, null, null, null) : null;
        } else {
            nVarF = this.replyTo;
        }
        return r(this, null, null, messageAuthor3, null, null, null, nVarF, 196603);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.g(this.ticketCreatedAt, t61.a.f(this.ticketId, v1.c.a(this.author, t61.a.g(this.time, this.id.hashCode() * 31, 31), 31), 31), 31), 31, this.message);
        Boolean bool = this.preventEscalation;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.messageTranslated;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q0 q0Var = this.expandableState;
        int iC2 = j6.a.c((iHashCode2 + (q0Var == null ? 0 : q0Var.hashCode())) * 31, 31, this.isMass);
        z0 z0Var = this.meta;
        int iHashCode3 = (this.sendingStatus.hashCode() + ((iC2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31)) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.serverId;
        int iHashCode5 = (iHashCode4 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        int iHashCode6 = (iHashCode5 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        a1 a1Var = this.notification;
        int iHashCode7 = (iHashCode6 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        n nVar = this.replyTo;
        int iHashCode8 = (iHashCode7 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str2 = this.messageRawLocal;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
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
    /* JADX INFO: renamed from: l */
    public final String getMessageGroupId() {
        z0 z0Var = this.meta;
        if (z0Var != null) {
            return z0Var.getMessageGroupId();
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

    public final String s(k50.x textMapper) {
        String strC;
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        try {
            String str = this.f285513s;
            if (str != null) {
                return str;
            }
            if (this.author instanceof ChatAgent) {
                String str2 = this.messageTranslated;
                if (str2 == null) {
                    str2 = this.message;
                }
                strC = textMapper.c(str2);
            } else {
                strC = textMapper.c(this.message);
            }
            this.f285513s = strC;
            return strC;
        } catch (Exception e) {
            String strM = kotlin.jvm.internal.o0.f186429a.b(o2.class).m();
            if (strM == null) {
                strM = "";
            }
            String string = this.id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ChatMessageMarkdownException chatMessageMarkdownException = new ChatMessageMarkdownException(strM, string, e);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ChatMessageMarkdownException", null, chatMessageMarkdownException, h0Var);
            String str3 = this.message;
            this.f285513s = str3;
            return str3;
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getMessageRawLocal() {
        return this.messageRawLocal;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getMessageTranslated() {
        return this.messageTranslated;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final z0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final a1 getNotification() {
        return this.notification;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getPreventEscalation() {
        return this.preventEscalation;
    }

    public /* synthetic */ o2(UUID uuid, Instant instant, MessageAuthor messageAuthor, UUID uuid2, Instant instant2, String str, Boolean bool, String str2, q0 q0Var, boolean z, z0 z0Var, b1 b1Var, v30.c0 c0Var, UUID uuid3, UUID uuid4, a1 a1Var, n nVar, String str3, int i) {
        this(uuid, instant, messageAuthor, uuid2, instant2, str, bool, str2, q0Var, z, z0Var, b1Var, c0Var, (i & 8192) != 0 ? null : uuid3, (i & 16384) != 0 ? null : uuid4, (32768 & i) != 0 ? null : a1Var, nVar, (i & 131072) != 0 ? null : str3);
    }
}
