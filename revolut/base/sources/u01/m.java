package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276016c;
    public final c1b.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, c1b.f chartHandlerVersion) {
        super("updateLastClosingPrice", 8);
        Intrinsics.checkNotNullParameter(chartHandlerVersion, "chartHandlerVersion");
        this.f276016c = str;
        this.d = chartHandlerVersion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f276016c, mVar.f276016c) && this.d == mVar.d;
    }

    public final int hashCode() {
        String str = this.f276016c;
        return this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
