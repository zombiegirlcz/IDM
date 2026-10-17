package k4i;

import aoa.k;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import java.util.Set;
import jm4.c3;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionBreakdownScreenContract$InputData f180920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f180921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f180922c;
    public final e4m.e d;

    public e(c cVar, b bVar, TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData) {
        this.f180921b = cVar;
        this.f180922c = bVar;
        this.f180920a = transactionBreakdownScreenContract$InputData;
        this.d = e4m.b.b(new c3(cVar, this, 13));
    }

    public final k b() {
        gte.a aVarB = this.f180921b.i.b();
        s.j(aVarB);
        return new k(aVarB, 2);
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
