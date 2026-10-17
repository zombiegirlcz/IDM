package rxg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f258165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f258166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f258167c;
    public final LocalDate d;

    public d(xi0.b currency, dj0.d pnl2, float f, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f258165a = currency;
        this.f258166b = pnl2;
        this.f258167c = f;
        this.d = localDate;
    }

    @Override // rxg.j
    public final LocalDate b() {
        return this.d;
    }

    @Override // rxg.j
    public final float c() {
        return this.f258167c;
    }

    @Override // rxg.j
    public final dj0.d d() {
        return this.f258166b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f258165a, dVar.f258165a) && Intrinsics.f(this.f258166b, dVar.f258166b) && Float.compare(this.f258167c, dVar.f258167c) == 0 && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f258167c, v7.c(this.f258165a.hashCode() * 31, 31, this.f258166b), 31);
        LocalDate localDate = this.d;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}
