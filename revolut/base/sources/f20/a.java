package f20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006%"}, d2 = {"Lf20/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "c", "()Ljava/util/UUID;", "callId", "b", "Ljava/lang/String;", "i", "referenceSID", "g", "direction", "d", "agentId", "Lorg/joda/time/Instant;", "e", "Lorg/joda/time/Instant;", "f", "()Lorg/joda/time/Instant;", "createdAt", "j", "startedAt", "completedAt", "h", "k", "state", "callType", "callCompletionReason", "Lorg/joda/time/Period;", "Lorg/joda/time/Period;", "()Lorg/joda/time/Period;", "duration", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("callId")
    @NotNull
    private final UUID callId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("callRef")
    private final String referenceSID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("direction")
    private final String direction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("agentId")
    private final UUID agentId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("createdAt")
    @NotNull
    private final Instant createdAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startedAt")
    private final Instant startedAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedAt")
    private final Instant completedAt;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("callType")
    @NotNull
    private final String callType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String callCompletionReason;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("duration")
    private final Period duration;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCallCompletionReason() {
        return this.callCompletionReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UUID getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getCompletedAt() {
        return this.completedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.callId, aVar.callId) && Intrinsics.f(this.referenceSID, aVar.referenceSID) && Intrinsics.f(this.direction, aVar.direction) && Intrinsics.f(this.agentId, aVar.agentId) && Intrinsics.f(this.createdAt, aVar.createdAt) && Intrinsics.f(this.startedAt, aVar.startedAt) && Intrinsics.f(this.completedAt, aVar.completedAt) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.callType, aVar.callType) && Intrinsics.f(this.callCompletionReason, aVar.callCompletionReason) && Intrinsics.f(this.duration, aVar.duration);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Period getDuration() {
        return this.duration;
    }

    public final int hashCode() {
        int iHashCode = this.callId.hashCode() * 31;
        String str = this.referenceSID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.direction;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UUID uuid = this.agentId;
        int iG = t61.a.g(this.createdAt, (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31, 31);
        Instant instant = this.startedAt;
        int iHashCode4 = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.completedAt;
        int iC = p.a.c(p.a.c((iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31, 31, this.state), 31, this.callType);
        String str3 = this.callCompletionReason;
        int iHashCode5 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        Period period = this.duration;
        return iHashCode5 + (period != null ? period.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getReferenceSID() {
        return this.referenceSID;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
