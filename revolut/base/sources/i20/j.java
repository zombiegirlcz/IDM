package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006\""}, d2 = {"Li20/j;", "Li20/o0;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "callId", "Ljava/lang/String;", "c", "callRef", "agentId", "Lorg/joda/time/Period;", "d", "Lorg/joda/time/Period;", "()Lorg/joda/time/Period;", "duration", "", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "errorsCount", "f", "h", "reason", "g", "initializedBy", "Li20/e0;", "Li20/e0;", "()Li20/e0;", "meta", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("callId")
    @NotNull
    private final UUID callId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("callRef")
    private final String callRef;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("agentId")
    private final UUID agentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("duration")
    private final Period duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("errorsCount")
    private final Integer errorsCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("initializedBy")
    private final String initializedBy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("meta")
    private final e0 meta;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCallRef() {
        return this.callRef;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Period getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getErrorsCount() {
        return this.errorsCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.callId, jVar.callId) && Intrinsics.f(this.callRef, jVar.callRef) && Intrinsics.f(this.agentId, jVar.agentId) && Intrinsics.f(this.duration, jVar.duration) && Intrinsics.f(this.errorsCount, jVar.errorsCount) && Intrinsics.f(this.reason, jVar.reason) && Intrinsics.f(this.initializedBy, jVar.initializedBy) && Intrinsics.f(this.meta, jVar.meta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInitializedBy() {
        return this.initializedBy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final int hashCode() {
        int iHashCode = this.callId.hashCode() * 31;
        String str = this.callRef;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.agentId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Period period = this.duration;
        int iHashCode4 = (iHashCode3 + (period == null ? 0 : period.hashCode())) * 31;
        Integer num = this.errorsCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.reason;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initializedBy;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e0 e0Var = this.meta;
        return iHashCode7 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
