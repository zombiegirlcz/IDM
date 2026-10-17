package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f173479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f173480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f173481c;
    public final BigDecimal d;
    public final BigDecimal e;

    public j(ej0.b bVar, ej0.b bVar2, ej0.b bVar3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f173479a = bVar;
        this.f173480b = bVar2;
        this.f173481c = bVar3;
        this.d = bigDecimal;
        this.e = bigDecimal2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f173479a, jVar.f173479a) && Intrinsics.f(this.f173480b, jVar.f173480b) && Intrinsics.f(this.f173481c, jVar.f173481c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        ej0.b bVar = this.f173479a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ej0.b bVar2 = this.f173480b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ej0.b bVar3 = this.f173481c;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.e;
        return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }
}
