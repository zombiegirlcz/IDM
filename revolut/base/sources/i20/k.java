package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Li20/k;", "Li20/o0;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "callId", "agentId", "c", "Ljava/lang/String;", "callRef", "d", "initializedBy", "Li20/e0;", "e", "Li20/e0;", "()Li20/e0;", "meta", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("callId")
    @NotNull
    private final UUID callId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("agentId")
    private final UUID agentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("callRef")
    private final String callRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("initializedBy")
    private final String initializedBy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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
    public final String getInitializedBy() {
        return this.initializedBy;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getMeta() {
        return this.meta;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.callId, kVar.callId) && Intrinsics.f(this.agentId, kVar.agentId) && Intrinsics.f(this.callRef, kVar.callRef) && Intrinsics.f(this.initializedBy, kVar.initializedBy) && Intrinsics.f(this.meta, kVar.meta);
    }

    public final int hashCode() {
        int iHashCode = this.callId.hashCode() * 31;
        UUID uuid = this.agentId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.callRef;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initializedBy;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        e0 e0Var = this.meta;
        return iHashCode4 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
