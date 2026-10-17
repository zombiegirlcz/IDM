package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Li20/m;", "Li20/o0;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "callRequestId", "Lf20/i;", "b", "Lf20/i;", "()Lf20/i;", "callType", "Li20/l;", "c", "Li20/l;", "getAgent", "()Li20/l;", "agent", "Li20/e0;", "d", "Li20/e0;", "()Li20/e0;", "meta", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("callRequestId")
    private final UUID callRequestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("callType")
    private final f20.i callType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"agent"}, value = "scheduledAgent")
    private final l agent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("meta")
    private final e0 meta;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getCallRequestId() {
        return this.callRequestId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f20.i getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getMeta() {
        return this.meta;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.callRequestId, mVar.callRequestId) && this.callType == mVar.callType && Intrinsics.f(this.agent, mVar.agent) && Intrinsics.f(this.meta, mVar.meta);
    }

    public final int hashCode() {
        UUID uuid = this.callRequestId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        f20.i iVar = this.callType;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.agent;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e0 e0Var = this.meta;
        return iHashCode3 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
