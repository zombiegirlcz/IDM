package v20;

import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\tR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b)\u0010*R\u001c\u00101\u001a\u0004\u0018\u00010,8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00103\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b/\u0010\u0007\u001a\u0004\b2\u0010\tR\u001c\u00104\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b-\u0010\t¨\u00065"}, d2 = {"Lv20/i1;", "Lv20/n;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "p", "()Ljava/util/UUID;", "ticketId", "b", "k", "id", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "q", "()Lorg/joda/time/Instant;", "time", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "d", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "h", "()Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "author", "e", "o", "ticketCreatedAt", "f", "r", "previousMessageId", "", "Lv20/j1;", "g", "Ljava/util/List;", "s", "()Ljava/util/List;", "thoughts", "", "J", "t", "()J", "validityDurationMs", "Lv30/c0;", "i", "Lv30/c0;", "j", "()Lv30/c0;", "feedType", "n", "serverId", "feedId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i1 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketId")
    @NotNull
    private final UUID ticketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final UUID id;

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
    @lg.b("previousMessageId")
    @NotNull
    private final UUID previousMessageId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("thoughts")
    @NotNull
    private final List<j1> thoughts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("duration")
    private final long validityDurationMs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    public i1(UUID ticketId, UUID id10, Instant time, MessageAuthor author, Instant ticketCreatedAt, UUID previousMessageId, List thoughts, long j2, v30.c0 c0Var, UUID uuid, UUID uuid2) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(previousMessageId, "previousMessageId");
        Intrinsics.checkNotNullParameter(thoughts, "thoughts");
        this.ticketId = ticketId;
        this.id = id10;
        this.time = time;
        this.author = author;
        this.ticketCreatedAt = ticketCreatedAt;
        this.previousMessageId = previousMessageId;
        this.thoughts = thoughts;
        this.validityDurationMs = j2;
        this.feedType = c0Var;
        this.serverId = uuid;
        this.feedId = uuid2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.ticketId, i1Var.ticketId) && Intrinsics.f(this.id, i1Var.id) && Intrinsics.f(this.time, i1Var.time) && Intrinsics.f(this.author, i1Var.author) && Intrinsics.f(this.ticketCreatedAt, i1Var.ticketCreatedAt) && Intrinsics.f(this.previousMessageId, i1Var.previousMessageId) && Intrinsics.f(this.thoughts, i1Var.thoughts) && this.validityDurationMs == i1Var.validityDurationMs && this.feedType == i1Var.feedType && Intrinsics.f(this.serverId, i1Var.serverId) && Intrinsics.f(this.feedId, i1Var.feedId);
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
        UUID previousMessageId = this.previousMessageId;
        List<j1> thoughts = this.thoughts;
        long j2 = this.validityDurationMs;
        v30.c0 c0Var = this.feedType;
        UUID uuid = this.serverId;
        UUID uuid2 = this.feedId;
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(previousMessageId, "previousMessageId");
        Intrinsics.checkNotNullParameter(thoughts, "thoughts");
        return new i1(ticketId, id10, time, author, ticketCreatedAt, previousMessageId, thoughts, j2, c0Var, uuid, uuid2);
    }

    @Override // v20.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public final MessageAuthor getAuthor() {
        return this.author;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.d(t61.a.f(this.previousMessageId, t61.a.g(this.ticketCreatedAt, v1.c.a(this.author, t61.a.g(this.time, t61.a.f(this.id, this.ticketId.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.thoughts), 31, this.validityDurationMs);
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
    public final UUID getPreviousMessageId() {
        return this.previousMessageId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final List getThoughts() {
        return this.thoughts;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getValidityDurationMs() {
        return this.validityDurationMs;
    }

    public /* synthetic */ i1(UUID uuid, UUID uuid2, Instant instant, ChatAgent.Bot bot, Instant instant2, UUID uuid3, ArrayList arrayList, long j2) {
        this(uuid, uuid2, instant, bot, instant2, uuid3, arrayList, j2, null, null, null);
    }
}
