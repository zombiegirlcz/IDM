package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import java.util.Set;
import xf6.i0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderContract$InputData f308640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f308641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f308642c;

    public h(p pVar, InvestOrderContract$InputData investOrderContract$InputData) {
        this.f308641b = pVar;
        this.f308640a = investOrderContract$InputData;
        this.f308642c = e4m.b.b(new i0(pVar, this, 20));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
