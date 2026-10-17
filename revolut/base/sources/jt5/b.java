package jt5;

import dj0.d;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f178354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f178355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f178356c;
    public final BigDecimal d;

    public b(xi0.b currency, d dVar, d dVar2, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f178354a = currency;
        this.f178355b = dVar;
        this.f178356c = dVar2;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f178354a, bVar.f178354a) && Intrinsics.f(this.f178355b, bVar.f178355b) && Intrinsics.f(this.f178356c, bVar.f178356c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f178354a.hashCode() * 31;
        d dVar = this.f178355b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f178356c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        return iHashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
