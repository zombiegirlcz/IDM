package alc;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f6201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f6202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f6203c;
    public final BigDecimal d;
    public final List e;

    public j(BigDecimal bigDecimal, BigDecimal mean, g config, BigDecimal fee2, List simulatedAnnualReturns) {
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(simulatedAnnualReturns, "simulatedAnnualReturns");
        this.f6201a = bigDecimal;
        this.f6202b = mean;
        this.f6203c = config;
        this.d = fee2;
        this.e = simulatedAnnualReturns;
    }

    public final h a(int i) {
        List list = this.e;
        Object obj2 = null;
        if (list.isEmpty()) {
            return null;
        }
        List listP0 = d0.P0(list, new i());
        Iterator it8 = listP0.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((h) next).f6198a * 12 >= i) {
                obj2 = next;
                break;
            }
        }
        h hVar = (h) obj2;
        return hVar == null ? (h) d0.m0(listP0) : hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f6201a, jVar.f6201a) && Intrinsics.f(this.f6202b, jVar.f6202b) && Intrinsics.f(this.f6203c, jVar.f6203c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f6201a;
        return this.e.hashCode() + t61.a.d(this.d, (this.f6203c.hashCode() + t61.a.d(this.f6202b, (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31, 31)) * 31, 31);
    }
}
