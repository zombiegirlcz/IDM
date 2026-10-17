package zjh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.cash_balance.b f322860b;

    public /* synthetic */ v(com.revolut.feature.wealth.ui.impl.cash_balance.b bVar, int i) {
        this.f322859a = i;
        this.f322860b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit unit;
        switch (this.f322859a) {
            case 0:
                od0.i optionalTradingAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalTradingAccount, "optionalTradingAccount");
                if (!optionalTradingAccount.d() || ((TradingAccount) optionalTradingAccount.c()).getD() == cfl.b.TERMINATED) {
                    throw new IllegalStateException(p.a.p("No account of portfolioId ", this.f322860b.o.f95952b, " not terminated found"));
                }
                return (TradingAccount) optionalTradingAccount.c();
            default:
                com.revolut.feature.wealth.ui.impl.cash_balance.b bVar = this.f322860b;
                com.revolut.kompot.navigable.vc.modal.a aVar = bVar.I;
                pih.h it8 = (pih.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = bVar.o;
                if (it8 instanceof pih.c) {
                    Data data = ((q) ((j2) bVar.H.f22677a).getValue()).f322846c;
                    if (data != null) {
                        try {
                            Object content = data.getContent();
                            if (content != null) {
                                bVar.L2(((pih.c) it8).f236513a, ((pih.c) it8).f236514b, (TradingLegalEntityInformation) content);
                                unit = Unit.f186387a;
                            } else {
                                unit = null;
                            }
                            new Data(unit, data.getError(), data.getLoading());
                        } catch (Throwable th10) {
                            new Data(null, th10, data.getLoading());
                        }
                    }
                    break;
                } else {
                    boolean z = it8 instanceof pih.f;
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (z) {
                        pih.f fVar = (pih.f) it8;
                        oki.h.v2(aVar, new CashBalanceControllerContract$ModalStep.UnsettledDialog(fVar.f236518a, fVar.f236519b, pih.j.UnsettledSells), bottom_dialog);
                    } else if (it8 instanceof pih.e) {
                        pih.e eVar = (pih.e) it8;
                        oki.h.v2(aVar, new CashBalanceControllerContract$ModalStep.UnsettledDialog(eVar.f236516a, eVar.f236517b, pih.j.UnsettledBuys), bottom_dialog);
                    } else if (it8 instanceof pih.b) {
                        bVar.K2(o.ADD_MONEY, cashBalanceControllerContract$InputData.f95952b, ((pih.b) it8).f236511a);
                    } else if (it8 instanceof pih.g) {
                        tzg.h hVar = bVar.G;
                        pih.g gVar = (pih.g) it8;
                        kel.b bVar2 = gVar.f236520a;
                        if (((x8h.a0) hVar).a(gVar.f236521b)) {
                            bVar.J2(bVar2);
                        } else {
                            bVar.K2(o.WITHDRAW_MONEY, cashBalanceControllerContract$InputData.f95952b, bVar2);
                        }
                    } else if (!(it8 instanceof pih.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
        }
    }
}
