package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f201834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CfdCashTradeDetailsContract$InputData f201835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f201836c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(v vVar, CfdCashTradeDetailsContract$InputData cfdCashTradeDetailsContract$InputData, i7d.i iVar) {
        this.f201836c = vVar;
        this.f201834a = iVar;
        this.f201835b = cfdCashTradeDetailsContract$InputData;
        this.d = e4m.b.b(new lzk.b(vVar, this, 1, 4));
        this.e = e4m.b.b(new lzk.b(vVar, this, 0, 4));
        this.f = e4m.b.b(new lzk.b(vVar, this, 2, 4));
    }

    @Override // xki.e
    public final Set f() {
        i7d.o oVar = (i7d.o) this.d.get();
        h7d.e.a(oVar);
        return ImmutableSet.of(oVar);
    }

    @Override // xki.e
    public final Set g() {
        i7d.n nVar = (i7d.n) this.e.get();
        h7d.c.a(nVar);
        return ImmutableSet.of(nVar);
    }
}
