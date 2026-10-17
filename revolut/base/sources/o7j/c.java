package o7j;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f222852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f222853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd6.h f222854c;
    public final xi0.b d;
    public final xi0.b e;
    public final wd6.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f222855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f222856h;

    public c(BigDecimal limitRate, BigDecimal currentRate, wd6.h orderType, xi0.b targetCurrency, xi0.b counterCurrency, wd6.e exchangeMode, b state, boolean z) {
        Intrinsics.checkNotNullParameter(limitRate, "limitRate");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f222852a = limitRate;
        this.f222853b = currentRate;
        this.f222854c = orderType;
        this.d = targetCurrency;
        this.e = counterCurrency;
        this.f = exchangeMode;
        this.f222855g = state;
        this.f222856h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f222852a, cVar.f222852a) && Intrinsics.f(this.f222853b, cVar.f222853b) && this.f222854c == cVar.f222854c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && this.f222855g == cVar.f222855g && this.f222856h == cVar.f222856h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222856h) + ((this.f222855g.hashCode() + wp5.y.g(this.f, h30.l.j(this.e, h30.l.j(this.d, v1.c.b(this.f222854c, t61.a.d(this.f222853b, this.f222852a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31);
    }
}
