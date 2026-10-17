package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000fR\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b\u0018\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b)\u00102¨\u00064"}, d2 = {"Li20/b0;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "f", "()Ljava/util/UUID;", "id", "Lorg/joda/time/Instant;", "b", "Lorg/joda/time/Instant;", "c", "()Lorg/joda/time/Instant;", "createdAt", "k", "ticketId", "Li20/b;", "d", "Li20/b;", "()Li20/b;", "author", "e", "correlationId", "Li20/d0;", "Li20/d0;", "g", "()Li20/d0;", "payload", "Li20/h0;", "Li20/h0;", "h", "()Li20/h0;", "payloadType", "", "Z", "l", "()Z", "isFromClient", "i", "j", "ticketCreatedAt", "Lv30/c0;", "Lv30/c0;", "()Lv30/c0;", "feedType", "feedId", "Li20/b0;", "()Li20/b0;", "replyTo", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"messageId"}, value = "id")
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    @NotNull
    private final Instant createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketId")
    private final UUID ticketId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("author")
    private final b author;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("correlationId")
    private final UUID correlationId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("payload")
    @NotNull
    private final d0 payload;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("payloadType")
    @NotNull
    private final h0 payloadType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromClient")
    private final boolean isFromClient;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("ticketCreatedAt")
    private final Instant ticketCreatedAt;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final v30.c0 feedType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyTo")
    private final b0 replyTo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getFeedId() {
        return this.feedId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final v30.c0 getFeedType() {
        return this.feedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.id, b0Var.id) && Intrinsics.f(this.createdAt, b0Var.createdAt) && Intrinsics.f(this.ticketId, b0Var.ticketId) && Intrinsics.f(this.author, b0Var.author) && Intrinsics.f(this.correlationId, b0Var.correlationId) && Intrinsics.f(this.payload, b0Var.payload) && this.payloadType == b0Var.payloadType && this.isFromClient == b0Var.isFromClient && Intrinsics.f(this.ticketCreatedAt, b0Var.ticketCreatedAt) && this.feedType == b0Var.feedType && Intrinsics.f(this.feedId, b0Var.feedId) && Intrinsics.f(this.replyTo, b0Var.replyTo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d0 getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getPayloadType() {
        return this.payloadType;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.createdAt, this.id.hashCode() * 31, 31);
        UUID uuid = this.ticketId;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
        b bVar = this.author;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        UUID uuid2 = this.correlationId;
        int iC = j6.a.c((this.payloadType.hashCode() + ((this.payload.hashCode() + ((iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31)) * 31)) * 31, 31, this.isFromClient);
        Instant instant = this.ticketCreatedAt;
        int iHashCode3 = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        v30.c0 c0Var = this.feedType;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid3 = this.feedId;
        int iHashCode5 = (iHashCode4 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        b0 b0Var = this.replyTo;
        return iHashCode5 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b0 getReplyTo() {
        return this.replyTo;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getTicketCreatedAt() {
        return this.ticketCreatedAt;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final UUID getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsFromClient() {
        return this.isFromClient;
    }

    public final boolean m() {
        switch (a0.f157661a[this.payloadType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 7:
            case 8:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
