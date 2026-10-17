package mhh;

import ael.q0;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m75.i;
import w4l.h;
import ybl.k;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends zgh.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zgh.d f205572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f205573n;
    public final zgh.c o;

    public c(zgh.d inputData, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f205572m = inputData;
        this.f205573n = tradingAccountsInteractor;
        this.o = new zgh.c(null);
    }

    @Override // yji.n
    public final void H2() {
        zgh.d dVar = this.f205572m;
        if (dVar.f322123a instanceof TradingAccountType.Taa) {
            n.l2(this, nim.a.v(com.revolut.data.database.models.openbanking.d.x("LimitWidgetControllerModelExtension", "Account fetching", ((q0) this.f205573n).o(dVar.f322124b, h.f294642c)), new m98.k(this, 23)), null, new i(this, null, 27), 3);
        }
    }

    @Override // cki.a
    public final Object Z2() {
        return this.o;
    }

    @Override // zgh.b
    public final void e3(VaultsProgressDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.o;
        g gVar = obj2 instanceof g ? (g) obj2 : null;
        if (gVar == null) {
            return;
        }
        if (!(gVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        n.P2(this, o2(new ygh.a(((f) gVar).f205576a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}
