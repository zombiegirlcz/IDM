package rxg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f258159c;
    public final dj0.d d;
    public final float e;
    public final LocalDate f;

    public b(String symbol, String ref2, String name, dj0.d pnl2, float f, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f258157a = symbol;
        this.f258158b = ref2;
        this.f258159c = name;
        this.d = pnl2;
        this.e = f;
        this.f = localDate;
    }

    @Override // rxg.j
    public final LocalDate b() {
        return this.f;
    }

    @Override // rxg.j
    public final float c() {
        return this.e;
    }

    @Override // rxg.j
    public final dj0.d d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f258157a, bVar.f258157a) && Intrinsics.f(this.f258158b, bVar.f258158b) && Intrinsics.f(this.f258159c, bVar.f258159c) && Intrinsics.f(this.d, bVar.d) && Float.compare(this.e, bVar.e) == 0 && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.e, v7.c(p.a.c(p.a.c(this.f258157a.hashCode() * 31, 31, this.f258158b), 31, this.f258159c), 31, this.d), 31);
        LocalDate localDate = this.f;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}
