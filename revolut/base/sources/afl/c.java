package afl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f4580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f4581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f4582c;
    public final BigDecimal d;
    public final BigDecimal e;

    public c(ej0.b bVar, ej0.b bVar2, ej0.b bVar3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f4580a = bVar;
        this.f4581b = bVar2;
        this.f4582c = bVar3;
        this.d = bigDecimal;
        this.e = bigDecimal2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f4580a, cVar.f4580a) && Intrinsics.f(this.f4581b, cVar.f4581b) && Intrinsics.f(this.f4582c, cVar.f4582c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        ej0.b bVar = this.f4580a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ej0.b bVar2 = this.f4581b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ej0.b bVar3 = this.f4582c;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.e;
        return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }
}
