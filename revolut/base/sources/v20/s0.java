package v20;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001d\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\nR\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0005R(\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0005R\u001c\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u0005R\u001a\u00102\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u001c\u00109\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020:8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b\u0013\u0010=R\u001c\u0010@\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b?\u0010\nR\u001c\u0010A\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b*\u0010\nR\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\b-\u0010DR\u001c\u0010H\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\b;\u0010GR\u001c\u0010N\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\bO\u0010\u0005¨\u0006R"}, d2 = {"Lv20/s0;", "Lv20/n;", "Lv20/k1;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "k", "()Ljava/util/UUID;", "id", "Lorg/joda/time/Instant;", "b", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "c", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "d", "p", "ticketId", "e", "o", "ticketCreatedAt", "f", "z", "uploadId", "g", "Ljava/lang/String;", "v", "thumbnailUrl", "", "Ljava/util/Map;", "w", "()Ljava/util/Map;", "thumbnailUrlHeaders", "i", "t", "mediaType", "j", "s", "filePath", "", "Z", "isMass", "()Z", "Lv20/t0;", "l", "Lv20/t0;", "u", "()Lv20/t0;", "meta", "Lv20/b1;", "m", "Lv20/b1;", "()Lv20/b1;", "sendingStatus", "n", "serverId", "feedId", "Lv30/c0;", "Lv30/c0;", "()Lv30/c0;", "feedType", "Lv20/n;", "()Lv20/n;", "replyTo", "Lv20/q2;", "r", "Lv20/q2;", "x", "()Lv20/q2;", "transcriptState", "y", "transcriptText", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s0 extends n implements k1 {

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
    @lg.b("uploadId")
    private final UUID uploadId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("thumbnailUrl")
    private final String thumbnailUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("thumbnailUrlHeaders")
    private final Map<String, String> thumbnailUrlHeaders;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("mediaType")
    @NotNull
    private final String mediaType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("filePath")
    private final String filePath;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("isMass")
    private final boolean isMass;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("meta")
    private final t0 meta;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("sendingStatus")
    @NotNull
    private final b1 sendingStatus;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyTo")
    private final n replyTo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("transcriptState")
    private final q2 transcriptState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("transcriptText")
    private final String transcriptText;

    /* JADX INFO: renamed from: v20.s0$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean a(java.lang.String r1) {
            /*
                if (r1 == 0) goto L10
                ulm.a1 r0 = ulm.b1.Companion
                r0.getClass()
                ulm.b1 r1 = ulm.a1.b(r1)
                if (r1 == 0) goto L10
                java.lang.String r1 = r1.f281066b
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.String r0 = "audio"
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: v20.s0.Companion.a(java.lang.String):boolean");
        }

        public Companion(int i) {
        }
    }

    public s0(UUID id10, Instant time, MessageAuthor author, UUID ticketId, Instant ticketCreatedAt, UUID uuid, String str, Map map, String mediaType, String str2, boolean z, t0 t0Var, b1 sendingStatus, UUID uuid2, UUID uuid3, v30.c0 c0Var, n nVar, q2 q2Var, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(sendingStatus, "sendingStatus");
        this.id = id10;
        this.time = time;
        this.author = author;
        this.ticketId = ticketId;
        this.ticketCreatedAt = ticketCreatedAt;
        this.uploadId = uuid;
        this.thumbnailUrl = str;
        this.thumbnailUrlHeaders = map;
        this.mediaType = mediaType;
        this.filePath = str2;
        this.isMass = z;
        this.meta = t0Var;
        this.sendingStatus = sendingStatus;
        this.serverId = uuid2;
        this.feedId = uuid3;
        this.feedType = c0Var;
        this.replyTo = nVar;
        this.transcriptState = q2Var;
        this.transcriptText = str3;
    }

    public static s0 r(s0 s0Var, MessageAuthor messageAuthor, String str, Map map, String str2, t0 t0Var, b1 b1Var, n nVar, q2 q2Var, String str3, int i) {
        v30.c0 c0Var;
        n nVar2;
        UUID id10 = s0Var.id;
        Instant time = s0Var.time;
        MessageAuthor author = (i & 4) != 0 ? s0Var.author : messageAuthor;
        UUID ticketId = s0Var.ticketId;
        Instant ticketCreatedAt = s0Var.ticketCreatedAt;
        UUID uuid = s0Var.uploadId;
        String str4 = (i & 64) != 0 ? s0Var.thumbnailUrl : str;
        Map map2 = (i & 128) != 0 ? s0Var.thumbnailUrlHeaders : map;
        String mediaType = s0Var.mediaType;
        String str5 = (i & 512) != 0 ? s0Var.filePath : str2;
        boolean z = s0Var.isMass;
        t0 t0Var2 = (i & 2048) != 0 ? s0Var.meta : t0Var;
        b1 sendingStatus = (i & 4096) != 0 ? s0Var.sendingStatus : b1Var;
        UUID uuid2 = s0Var.serverId;
        UUID uuid3 = s0Var.feedId;
        v30.c0 c0Var2 = s0Var.feedType;
        if ((i & 65536) != 0) {
            c0Var = c0Var2;
            nVar2 = s0Var.replyTo;
        } else {
            c0Var = c0Var2;
            nVar2 = nVar;
        }
        n nVar3 = nVar2;
        q2 q2Var2 = (i & 131072) != 0 ? s0Var.transcriptState : q2Var;
        String str6 = (i & 262144) != 0 ? s0Var.transcriptText : str3;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(sendingStatus, "sendingStatus");
        return new s0(id10, time, author, ticketId, ticketCreatedAt, uuid, str4, map2, mediaType, str5, z, t0Var2, sendingStatus, uuid2, uuid3, c0Var, nVar3, q2Var2, str6);
    }

    public final boolean A() {
        Companion companion = INSTANCE;
        String str = this.mediaType;
        companion.getClass();
        return Companion.a(str);
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
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.id, s0Var.id) && Intrinsics.f(this.time, s0Var.time) && Intrinsics.f(this.author, s0Var.author) && Intrinsics.f(this.ticketId, s0Var.ticketId) && Intrinsics.f(this.ticketCreatedAt, s0Var.ticketCreatedAt) && Intrinsics.f(this.uploadId, s0Var.uploadId) && Intrinsics.f(this.thumbnailUrl, s0Var.thumbnailUrl) && Intrinsics.f(this.thumbnailUrlHeaders, s0Var.thumbnailUrlHeaders) && Intrinsics.f(this.mediaType, s0Var.mediaType) && Intrinsics.f(this.filePath, s0Var.filePath) && this.isMass == s0Var.isMass && Intrinsics.f(this.meta, s0Var.meta) && this.sendingStatus == s0Var.sendingStatus && Intrinsics.f(this.serverId, s0Var.serverId) && Intrinsics.f(this.feedId, s0Var.feedId) && this.feedType == s0Var.feedType && Intrinsics.f(this.replyTo, s0Var.replyTo) && this.transcriptState == s0Var.transcriptState && Intrinsics.f(this.transcriptText, s0Var.transcriptText);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        n nVarF;
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        MessageAuthor messageAuthor3 = messageAuthor;
        if (str == null) {
            str = this.thumbnailUrl;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = this.filePath;
        }
        String str4 = str2;
        if (messageAuthor2 != null) {
            n nVar = this.replyTo;
            nVarF = nVar != null ? nVar.f(messageAuthor2, null, null, null) : null;
        } else {
            nVarF = this.replyTo;
        }
        return r(this, messageAuthor3, str3, null, str4, null, null, nVarF, null, null, 458171);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.ticketCreatedAt, t61.a.f(this.ticketId, v1.c.a(this.author, t61.a.g(this.time, this.id.hashCode() * 31, 31), 31), 31), 31);
        UUID uuid = this.uploadId;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.thumbnailUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.thumbnailUrlHeaders;
        int iC = p.a.c((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.mediaType);
        String str2 = this.filePath;
        int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isMass);
        t0 t0Var = this.meta;
        int iHashCode3 = (this.sendingStatus.hashCode() + ((iC2 + (t0Var == null ? 0 : t0Var.hashCode())) * 31)) * 31;
        UUID uuid2 = this.serverId;
        int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.feedId;
        int iHashCode5 = (iHashCode4 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode6 = (iHashCode5 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        n nVar = this.replyTo;
        int iHashCode7 = (iHashCode6 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        q2 q2Var = this.transcriptState;
        int iHashCode8 = (iHashCode7 + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        String str3 = this.transcriptText;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
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
        t0 t0Var = this.meta;
        if (t0Var != null) {
            return t0Var.getMessageGroupId();
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
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final t0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Map getThumbnailUrlHeaders() {
        return this.thumbnailUrlHeaders;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final q2 getTranscriptState() {
        return this.transcriptState;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTranscriptText() {
        return this.transcriptText;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final UUID getUploadId() {
        return this.uploadId;
    }
}
