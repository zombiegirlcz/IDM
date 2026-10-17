package v20;

import com.revolut.chat.data.repository.chat.ChatMessageMarkdownException;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010*\u001a\b\u0012\u0004\u0012\u00020(0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b)\u0010&R\u001c\u00100\u001a\u0004\u0018\u00010+8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010\u0007\u001a\u0004\b1\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b,\u0010\tR\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b4\u0010\u001e\u001a\u0004\b4\u0010\u0004¨\u00066"}, d2 = {"Lv20/m2;", "Lv20/n;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "b", "p", "ticketId", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "d", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "e", "o", "ticketCreatedAt", "f", "Ljava/lang/String;", "u", "message", "", "Lv20/m2$a;", "g", "Ljava/util/List;", "s", "()Ljava/util/List;", "attachments", "Lv20/m2$b;", "t", "buttons", "Lv30/c0;", "i", "Lv30/c0;", "j", "()Lv30/c0;", "feedType", "n", "serverId", "feedId", "l", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m2 extends n {

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
    @lg.b("message")
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("attachments")
    @NotNull
    private final List<a> attachments;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("buttons")
    @NotNull
    private final List<b> buttons;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient String f285478m;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\u0004R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lv20/m2$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "id", "Ljava/lang/String;", "filename", "c", "mediaType", "d", "thumbnailUrl", "", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "thumbnailUrlHeaders", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final UUID id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("filename")
        @NotNull
        private final String filename;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("mediaType")
        @NotNull
        private final String mediaType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("thumbnailUrl")
        private final String thumbnailUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("thumbnailUrlHeaders")
        private final Map<String, String> thumbnailUrlHeaders;

        public a(String filename, Map map, String mediaType, UUID id10, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.id = id10;
            this.filename = filename;
            this.mediaType = mediaType;
            this.thumbnailUrl = str;
            this.thumbnailUrlHeaders = map;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMediaType() {
            return this.mediaType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Map getThumbnailUrlHeaders() {
            return this.thumbnailUrlHeaders;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.filename, aVar.filename) && Intrinsics.f(this.mediaType, aVar.mediaType) && Intrinsics.f(this.thumbnailUrl, aVar.thumbnailUrl) && Intrinsics.f(this.thumbnailUrlHeaders, aVar.thumbnailUrlHeaders);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.filename), 31, this.mediaType);
            String str = this.thumbnailUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, String> map = this.thumbnailUrlHeaders;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Lv20/m2$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "key", "b", "d", "label", "deeplink", "actionId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("key")
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("actionId")
        private final String actionId;

        public b(String key, String label, String str, String str2) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            this.key = key;
            this.label = label;
            this.deeplink = str;
            this.actionId = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.key, bVar.key) && Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.deeplink, bVar.deeplink) && Intrinsics.f(this.actionId, bVar.actionId);
        }

        public final int hashCode() {
            int iC = p.a.c(this.key.hashCode() * 31, 31, this.label);
            String str = this.deeplink;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.actionId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public m2(UUID id10, UUID ticketId, Instant time, MessageAuthor author, Instant ticketCreatedAt, String message, List attachments, List buttons, v30.c0 c0Var, UUID uuid, UUID uuid2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = id10;
        this.ticketId = ticketId;
        this.time = time;
        this.author = author;
        this.ticketCreatedAt = ticketCreatedAt;
        this.message = message;
        this.attachments = attachments;
        this.buttons = buttons;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
        this.messageGroupId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.id, m2Var.id) && Intrinsics.f(this.ticketId, m2Var.ticketId) && Intrinsics.f(this.time, m2Var.time) && Intrinsics.f(this.author, m2Var.author) && Intrinsics.f(this.ticketCreatedAt, m2Var.ticketCreatedAt) && Intrinsics.f(this.message, m2Var.message) && Intrinsics.f(this.attachments, m2Var.attachments) && Intrinsics.f(this.buttons, m2Var.buttons) && this.feedType == m2Var.feedType && Intrinsics.f(this.serverId, m2Var.serverId) && Intrinsics.f(this.feedId, m2Var.feedId) && Intrinsics.f(this.messageGroupId, m2Var.messageGroupId);
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
        String message = this.message;
        List<a> attachments = this.attachments;
        List<b> buttons = this.buttons;
        v30.c0 c0Var = this.feedType;
        UUID uuid = this.serverId;
        UUID uuid2 = this.feedId;
        String str3 = this.messageGroupId;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new m2(id10, ticketId, time, author, ticketCreatedAt, message, attachments, buttons, c0Var, uuid, uuid2, str3);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.c(t61.a.g(this.ticketCreatedAt, v1.c.a(this.author, t61.a.g(this.time, t61.a.f(this.ticketId, this.id.hashCode() * 31, 31), 31), 31), 31), 31, this.message), 31, this.attachments), 31, this.buttons);
        v30.c0 c0Var = this.feedType;
        int iHashCode = (iD + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.serverId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.messageGroupId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
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

    public final String r(k50.x textMapper) {
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        try {
            String str = this.f285478m;
            if (str != null) {
                return str;
            }
            String strC = textMapper.c(this.message);
            this.f285478m = strC;
            return strC;
        } catch (Exception e) {
            String strM = kotlin.jvm.internal.o0.f186429a.b(m2.class).m();
            if (strM == null) {
                strM = "";
            }
            String string = this.id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ChatMessageMarkdownException chatMessageMarkdownException = new ChatMessageMarkdownException(strM, string, e);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ChatMessageMarkdownException", null, chatMessageMarkdownException, h0Var);
            String str2 = this.message;
            this.f285478m = str2;
            return str2;
        }
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final List getAttachments() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getMessage() {
        return this.message;
    }
}
