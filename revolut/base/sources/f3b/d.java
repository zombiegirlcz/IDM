package f3b;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f131926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f131927c;
    public final boolean d;
    public final Long e;
    public final String f;

    public d(String instrumentRef, Set baselinePositions, long j2, boolean z, Long l2, String str) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(baselinePositions, "baselinePositions");
        this.f131925a = instrumentRef;
        this.f131926b = baselinePositions;
        this.f131927c = j2;
        this.d = z;
        this.e = l2;
        this.f = str;
    }

    @Override // f3b.e
    public final Long a() {
        return this.e;
    }

    @Override // f3b.e
    public final long b() {
        return this.f131927c;
    }

    @Override // f3b.e
    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f131925a, dVar.f131925a) && Intrinsics.f(this.f131926b, dVar.f131926b) && this.f131927c == dVar.f131927c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(a0.d.c(p.a.f(this.f131925a.hashCode() * 31, 31, this.f131926b), 31, this.f131927c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
