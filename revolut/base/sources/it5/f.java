package it5;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f168348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f168349c;
    public final Long d;

    public f(String name, dj0.d dVar, BigDecimal bigDecimal, Long l2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f168347a = name;
        this.f168348b = dVar;
        this.f168349c = bigDecimal;
        this.d = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f168347a, fVar.f168347a) && Intrinsics.f(this.f168348b, fVar.f168348b) && Intrinsics.f(this.f168349c, fVar.f168349c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f168347a.hashCode() * 31;
        dj0.d dVar = this.f168348b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.f168349c;
        return (this.d.hashCode() + ((iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31)) * 31;
    }
}
