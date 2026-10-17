package thh;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ybl.k;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h implements c {
    public final TaxAllowanceDetailScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f271384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f271385q;

    public d(n stateMapper, TaxAllowanceDetailScreenContract$InputData inputData, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.o = inputData;
        this.f271384p = tradingAccountsInteractor;
        this.f271385q = mra.d.b(this, new a(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String string = this.o.f95851a.getF105262a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        l.a1(this, rd0.e.n(nim.a.v(k.d(this.f271384p, string), new td1.f(this, 21)), h0.f322473a), null, null, new t9h.b(this, null, 19), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f271385q;
    }
}
