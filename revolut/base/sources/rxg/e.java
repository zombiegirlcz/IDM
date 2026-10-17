package rxg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f258168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f258169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f258170c;
    public final LocalDate d;

    public e(xi0.b currency, dj0.d pnl2, float f, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f258168a = currency;
        this.f258169b = pnl2;
        this.f258170c = f;
        this.d = localDate;
    }

    @Override // rxg.j
    public final LocalDate b() {
        return this.d;
    }

    @Override // rxg.j
    public final float c() {
        return this.f258170c;
    }

    @Override // rxg.j
    public final dj0.d d() {
        return this.f258169b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f258168a, eVar.f258168a) && Intrinsics.f(this.f258169b, eVar.f258169b) && Float.compare(this.f258170c, eVar.f258170c) == 0 && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f258170c, v7.c(this.f258168a.hashCode() * 31, 31, this.f258169b), 31);
        LocalDate localDate = this.d;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}
