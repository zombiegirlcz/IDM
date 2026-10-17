package o3b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f221764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f221765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f221766c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final bfl.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f221767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f221768h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f221769j;
    public final r2b.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f221770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f221771m;

    public t(BigDecimal quantity, BigDecimal currentRate, BigDecimal baseRate, BigDecimal askRate, BigDecimal bidRate, bfl.g side, int i, xi0.b currency, s sVar, s sVar2, r2b.c exitStrategyTarget, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(askRate, "askRate");
        Intrinsics.checkNotNullParameter(bidRate, "bidRate");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(exitStrategyTarget, "exitStrategyTarget");
        this.f221764a = quantity;
        this.f221765b = currentRate;
        this.f221766c = baseRate;
        this.d = askRate;
        this.e = bidRate;
        this.f = side;
        this.f221767g = i;
        this.f221768h = currency;
        this.i = sVar;
        this.f221769j = sVar2;
        this.k = exitStrategyTarget;
        this.f221770l = z;
        this.f221771m = z3;
    }

    public static t a(t tVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, s sVar, s sVar2, int i) {
        BigDecimal quantity = tVar.f221764a;
        BigDecimal currentRate = (i & 2) != 0 ? tVar.f221765b : bigDecimal;
        BigDecimal baseRate = (i & 4) != 0 ? tVar.f221766c : bigDecimal2;
        BigDecimal askRate = (i & 8) != 0 ? tVar.d : bigDecimal3;
        BigDecimal bidRate = (i & 16) != 0 ? tVar.e : bigDecimal4;
        bfl.g side = tVar.f;
        int i2 = tVar.f221767g;
        xi0.b currency = tVar.f221768h;
        s sVar3 = (i & 256) != 0 ? tVar.i : sVar;
        s sVar4 = (i & 512) != 0 ? tVar.f221769j : sVar2;
        r2b.c exitStrategyTarget = tVar.k;
        boolean z = tVar.f221770l;
        boolean z3 = tVar.f221771m;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(askRate, "askRate");
        Intrinsics.checkNotNullParameter(bidRate, "bidRate");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(exitStrategyTarget, "exitStrategyTarget");
        return new t(quantity, currentRate, baseRate, askRate, bidRate, side, i2, currency, sVar3, sVar4, exitStrategyTarget, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f221764a, tVar.f221764a) && Intrinsics.f(this.f221765b, tVar.f221765b) && Intrinsics.f(this.f221766c, tVar.f221766c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && this.f == tVar.f && this.f221767g == tVar.f221767g && Intrinsics.f(this.f221768h, tVar.f221768h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f221769j, tVar.f221769j) && Intrinsics.f(this.k, tVar.k) && this.f221770l == tVar.f221770l && this.f221771m == tVar.f221771m;
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f221768h, j6.a.b(this.f221767g, wp5.y.b(this.f, t61.a.d(this.e, t61.a.d(this.d, t61.a.d(this.f221766c, t61.a.d(this.f221765b, this.f221764a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        s sVar = this.i;
        int iHashCode = (iJ + (sVar == null ? 0 : sVar.hashCode())) * 31;
        s sVar2 = this.f221769j;
        return Boolean.hashCode(this.f221771m) + j6.a.c((this.k.hashCode() + ((iHashCode + (sVar2 != null ? sVar2.hashCode() : 0)) * 31)) * 31, 31, this.f221770l);
    }
}
