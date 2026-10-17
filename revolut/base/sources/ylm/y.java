package ylm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f314820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f314821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f314822c;

    public /* synthetic */ y(z zVar, d dVar, Throwable th10, int i) {
        this(zVar, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : th10);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f314820a, yVar.f314820a) && Intrinsics.f(this.f314821b, yVar.f314821b) && Intrinsics.f(this.f314822c, yVar.f314822c);
    }

    public final int hashCode() {
        int iHashCode = this.f314820a.hashCode() * 31;
        z zVar = this.f314821b;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        Throwable th10 = this.f314822c;
        return iHashCode2 + (th10 != null ? th10.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f314820a + ", nextPlan=" + this.f314821b + ", throwable=" + this.f314822c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public y(z plan, z zVar, Throwable th10) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f314820a = plan;
        this.f314821b = zVar;
        this.f314822c = th10;
    }
}
