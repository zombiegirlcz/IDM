package v20;

import com.revolut.chat.data.repository.chat.EmptyAuthor;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u0000 12\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b)\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010\u0007\u001a\u0004\b+\u0010\tR\u001c\u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b-\u0010\tR\u001c\u00100\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b/\u0010\u0018¨\u00062"}, d2 = {"Lv20/r2;", "Lv20/n;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "p", "()Ljava/util/UUID;", "ticketId", "b", "k", "id", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "c", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "Lorg/joda/time/Instant;", "d", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "e", "o", "ticketCreatedAt", "Lorg/joda/time/Period;", "f", "Lorg/joda/time/Period;", "s", "()Lorg/joda/time/Period;", "messageDuration", "Lv30/c0;", "g", "Lv30/c0;", "j", "()Lv30/c0;", "feedType", "n", "serverId", "i", "feedId", "t", "previousMessageId", "r", "eventTimestamp", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r2 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketId")
    @NotNull
    private final UUID ticketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("author")
    @NotNull
    private final MessageAuthor author;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("time")
    @NotNull
    private final Instant time;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ticketCreatedAt")
    @NotNull
    private final Instant ticketCreatedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("duration")
    @NotNull
    private final Period messageDuration;

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
    @lg.b("previousMessageId")
    private final UUID previousMessageId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("timestamp")
    private final Instant eventTimestamp;

    public r2(UUID ticketId, UUID id10, MessageAuthor author, Instant time, Instant ticketCreatedAt, Period messageDuration, v30.c0 c0Var, UUID uuid, UUID uuid2, UUID uuid3, Instant instant) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(messageDuration, "messageDuration");
        this.ticketId = ticketId;
        this.id = id10;
        this.author = author;
        this.time = time;
        this.ticketCreatedAt = ticketCreatedAt;
        this.messageDuration = messageDuration;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
        this.previousMessageId = uuid3;
        this.eventTimestamp = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.ticketId, r2Var.ticketId) && Intrinsics.f(this.id, r2Var.id) && Intrinsics.f(this.author, r2Var.author) && Intrinsics.f(this.time, r2Var.time) && Intrinsics.f(this.ticketCreatedAt, r2Var.ticketCreatedAt) && Intrinsics.f(this.messageDuration, r2Var.messageDuration) && this.feedType == r2Var.feedType && Intrinsics.f(this.serverId, r2Var.serverId) && Intrinsics.f(this.feedId, r2Var.feedId) && Intrinsics.f(this.previousMessageId, r2Var.previousMessageId) && Intrinsics.f(this.eventTimestamp, r2Var.eventTimestamp);
    }

    @Override // v20.n
    public final n f(MessageAuthor messageAuthor, String str, String str2, MessageAuthor messageAuthor2) {
        if (messageAuthor == null) {
            messageAuthor = this.author;
        }
        MessageAuthor author = messageAuthor;
        UUID ticketId = this.ticketId;
        UUID id10 = this.id;
        Instant time = this.time;
        Instant ticketCreatedAt = this.ticketCreatedAt;
        Period messageDuration = this.messageDuration;
        v30.c0 c0Var = this.feedType;
        UUID uuid = this.serverId;
        UUID uuid2 = this.feedId;
        UUID uuid3 = this.previousMessageId;
        Instant instant = this.eventTimestamp;
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(messageDuration, "messageDuration");
        return new r2(ticketId, id10, author, time, ticketCreatedAt, messageDuration, c0Var, uuid, uuid2, uuid3, instant);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iHashCode = (this.messageDuration.hashCode() + t61.a.g(this.ticketCreatedAt, t61.a.g(this.time, v1.c.a(this.author, t61.a.f(this.id, this.ticketId.hashCode() * 31, 31), 31), 31), 31)) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid = this.serverId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.feedId;
        int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.previousMessageId;
        int iHashCode5 = (iHashCode4 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        Instant instant = this.eventTimestamp;
        return iHashCode5 + (instant != null ? instant.hashCode() : 0);
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
    public final Instant getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Period getMessageDuration() {
        return this.messageDuration;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final UUID getPreviousMessageId() {
        return this.previousMessageId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r2(UUID uuid, MessageAuthor messageAuthor, Instant instant, Period period, UUID uuid2, Instant instant2, int i) {
        Period period2;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        MessageAuthor messageAuthor2 = (i & 4) != 0 ? EmptyAuthor.f51023a : messageAuthor;
        Instant instantWithDurationAdded = Instant.now().withDurationAdded(Duration.standardDays(365L), 100);
        Intrinsics.checkNotNullExpressionValue(instantWithDurationAdded, "withDurationAdded(...)");
        if ((i & 32) != 0) {
            Period periodSeconds = Period.seconds(10);
            Intrinsics.checkNotNullExpressionValue(periodSeconds, "seconds(...)");
            period2 = periodSeconds;
        } else {
            period2 = period;
        }
        this(uuid, uuidRandomUUID, messageAuthor2, instantWithDurationAdded, instant, period2, null, null, null, (i & 512) != 0 ? null : uuid2, (i & 1024) != 0 ? null : instant2);
    }
}
