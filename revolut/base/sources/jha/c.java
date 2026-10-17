package jha;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f174188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f174189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f174190c;
    public final d d;
    public final a e;

    public c(BigDecimal smallPercent, BigDecimal largePercent, b bVar, d userRegion, a aVar) {
        Intrinsics.checkNotNullParameter(smallPercent, "smallPercent");
        Intrinsics.checkNotNullParameter(largePercent, "largePercent");
        Intrinsics.checkNotNullParameter(userRegion, "userRegion");
        this.f174188a = smallPercent;
        this.f174189b = largePercent;
        this.f174190c = bVar;
        this.d = userRegion;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f174188a, cVar.f174188a) && Intrinsics.f(this.f174189b, cVar.f174189b) && Intrinsics.f(this.f174190c, cVar.f174190c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f174189b, this.f174188a.hashCode() * 31, 31);
        b bVar = this.f174190c;
        int iHashCode = (this.d.hashCode() + ((iD + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        a aVar = this.e;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
