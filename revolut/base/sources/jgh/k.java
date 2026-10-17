package jgh;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.v0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f174051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f174052b;

    public k(ArrayList primarySectors, List secondarySectors) {
        Intrinsics.checkNotNullParameter(primarySectors, "primarySectors");
        Intrinsics.checkNotNullParameter(secondarySectors, "secondarySectors");
        this.f174051a = primarySectors;
        this.f174052b = secondarySectors;
    }

    public final BigDecimal a() {
        List list = this.f174052b;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            BigDecimal bigDecimal = ((v0) it8.next()).f173576c;
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            Intrinsics.h(bigDecimal);
            bigDecimalValueOf = bigDecimalValueOf.add(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f174051a.equals(kVar.f174051a) && Intrinsics.f(this.f174052b, kVar.f174052b);
    }

    public final int hashCode() {
        return this.f174052b.hashCode() + (this.f174051a.hashCode() * 31);
    }
}
