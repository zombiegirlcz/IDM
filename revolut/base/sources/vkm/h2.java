package vkm;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f290037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f290038b;

    public h2(long j2, long j3) {
        this.f290037a = j2;
        this.f290038b = j3;
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.n(j2, "stopTimeout(", " ms) cannot be negative").toString());
        }
        if (j3 < 0) {
            throw new IllegalArgumentException(p.a.n(j3, "replayExpiration(", " ms) cannot be negative").toString());
        }
    }

    @Override // vkm.d2
    public final Flow a(StateFlow stateFlow) {
        return q.q(new y(q.Q(stateFlow, new g2(this, null)), new akl.w(2, null)));
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return this.f290037a == h2Var.f290037a && this.f290038b == h2Var.f290038b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f290038b) + (Long.hashCode(this.f290037a) * 31);
    }

    public final String toString() {
        aim.e eVar = new aim.e(2);
        long j2 = this.f290037a;
        if (j2 > 0) {
            eVar.add("stopTimeout=" + j2 + "ms");
        }
        long j3 = this.f290038b;
        if (j3 < Long.MAX_VALUE) {
            eVar.add("replayExpiration=" + j3 + "ms");
        }
        return j6.a.u(new StringBuilder("SharingStarted.WhileSubscribed("), zhm.d0.k0(zhm.u.a(eVar), null, null, null, 0, null, 63), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
