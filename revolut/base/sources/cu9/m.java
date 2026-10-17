package cu9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f108928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f108930c;

    public m(a3 a3Var, String transferLinkId, l action) {
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f108928a = a3Var;
        this.f108929b = transferLinkId;
        this.f108930c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f108928a, mVar.f108928a) && Intrinsics.f(this.f108929b, mVar.f108929b) && this.f108930c == mVar.f108930c;
    }

    public final int hashCode() {
        a3 a3Var = this.f108928a;
        return this.f108930c.hashCode() + p.a.c((a3Var == null ? 0 : a3Var.hashCode()) * 31, 31, this.f108929b);
    }
}
