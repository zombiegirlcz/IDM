package f3b;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f131923c;
    public final long d;
    public final boolean e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f131924g;

    public c(String instrumentRef, String positionId, Set baselinePositions, long j2, boolean z, Long l2, String str) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(baselinePositions, "baselinePositions");
        this.f131921a = instrumentRef;
        this.f131922b = positionId;
        this.f131923c = baselinePositions;
        this.d = j2;
        this.e = z;
        this.f = l2;
        this.f131924g = str;
    }

    @Override // f3b.e
    public final Long a() {
        return this.f;
    }

    @Override // f3b.e
    public final long b() {
        return this.d;
    }

    @Override // f3b.e
    public final String c() {
        return this.f131924g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f131921a, cVar.f131921a) && Intrinsics.f(this.f131922b, cVar.f131922b) && Intrinsics.f(this.f131923c, cVar.f131923c) && this.d == cVar.d && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f131924g, cVar.f131924g);
    }

    public final int hashCode() {
        int iC = j6.a.c(a0.d.c(p.a.f(p.a.c(this.f131921a.hashCode() * 31, 31, this.f131922b), 31, this.f131923c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f131924g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
