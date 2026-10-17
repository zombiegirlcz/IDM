package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f276122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276124c;

    public g0(h0 status, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f276122a = status;
        this.f276123b = str;
        this.f276124c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f276122a == g0Var.f276122a && Intrinsics.f(this.f276123b, g0Var.f276123b) && Intrinsics.f(this.f276124c, g0Var.f276124c);
    }

    public final int hashCode() {
        int iHashCode = this.f276122a.hashCode() * 31;
        String str = this.f276123b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276124c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
