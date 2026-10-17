package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import java.util.Set;
import xf6.t1;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderContract$InputData f308619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f308620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f308621c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308622g;

    public f(p pVar, InvestOrderContract$InputData investOrderContract$InputData) {
        this.f308620b = pVar;
        this.f308619a = investOrderContract$InputData;
        int i = 24;
        this.d = e4m.b.b(new t1(pVar, this, 0, i));
        this.e = e4m.b.b(new t1(pVar, this, 1, i));
        this.f = e4m.b.b(new t1(pVar, this, 3, i));
        this.f308622g = e4m.b.b(new t1(pVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
