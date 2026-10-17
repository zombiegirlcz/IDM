package rxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f258162c;
    public final dj0.d d;
    public final String e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f258163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f258164h;
    public final LocalDate i;

    public c(String symbol, String ref2, String name, dj0.d dVar, String str, BigDecimal quantity, dj0.d pnl2, float f, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f258160a = symbol;
        this.f258161b = ref2;
        this.f258162c = name;
        this.d = dVar;
        this.e = str;
        this.f = quantity;
        this.f258163g = pnl2;
        this.f258164h = f;
        this.i = localDate;
    }

    @Override // rxg.j
    public final LocalDate b() {
        return this.i;
    }

    @Override // rxg.j
    public final float c() {
        return this.f258164h;
    }

    @Override // rxg.j
    public final dj0.d d() {
        return this.f258163g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258160a, cVar.f258160a) && Intrinsics.f(this.f258161b, cVar.f258161b) && Intrinsics.f(this.f258162c, cVar.f258162c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f258163g, cVar.f258163g) && Float.compare(this.f258164h, cVar.f258164h) == 0 && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f258160a.hashCode() * 31, 31, this.f258161b), 31, this.f258162c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.e;
        int iB = m72.b.b(this.f258164h, v7.c(t61.a.d(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f258163g), 31);
        LocalDate localDate = this.i;
        return iB + (localDate != null ? localDate.hashCode() : 0);
    }
}
