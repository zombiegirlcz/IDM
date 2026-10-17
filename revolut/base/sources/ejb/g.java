package ejb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f126847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f126848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f126849c;
    public final boolean d;

    public g(f allTime, f currentYear, f currentMonth, boolean z) {
        Intrinsics.checkNotNullParameter(allTime, "allTime");
        Intrinsics.checkNotNullParameter(currentYear, "currentYear");
        Intrinsics.checkNotNullParameter(currentMonth, "currentMonth");
        this.f126847a = allTime;
        this.f126848b = currentYear;
        this.f126849c = currentMonth;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f126847a, gVar.f126847a) && Intrinsics.f(this.f126848b, gVar.f126848b) && Intrinsics.f(this.f126849c, gVar.f126849c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f126849c.hashCode() + ((this.f126848b.hashCode() + (this.f126847a.hashCode() * 31)) * 31)) * 31);
    }
}
