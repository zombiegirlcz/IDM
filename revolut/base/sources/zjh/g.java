package zjh;

import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashBalanceController f322836w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CashBalanceController cashBalanceController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f322836w = cashBalanceController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f322836w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f322836w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        qih.a aVar;
        dkh.c cVar;
        int i2 = this.u;
        CashBalanceController cashBalanceController = this.f322836w;
        switch (i2) {
            case 0:
                n6 largeActionButtonModel = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarK3 = cashBalanceController.k3();
                Intrinsics.h(largeActionButtonModel);
                com.revolut.feature.wealth.ui.impl.cash_balance.b bVar = (com.revolut.feature.wealth.ui.impl.cash_balance.b) pVarK3;
                cli.y yVar = bVar.H;
                com.revolut.kompot.navigable.vc.modal.a aVar3 = bVar.I;
                Intrinsics.checkNotNullParameter(largeActionButtonModel, "largeActionButtonModel");
                Object obj3 = largeActionButtonModel.k;
                boolean z = obj3 instanceof JuniorIsaAccountOwnership;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    oki.h.v2(aVar3, new CashBalanceControllerContract$ModalStep.JisaAvailableToWithdrawDialog((JuniorIsaAccountOwnership) obj3), bottom_dialog);
                } else {
                    o oVar = obj3 instanceof o ? (o) obj3 : null;
                    Data data = ((q) ((j2) yVar.f22677a).getValue()).f322845b;
                    List listA = (data == null || (cVar = (dkh.c) data.getContent()) == null) ? null : cVar.a();
                    if (oVar != null && listA != null) {
                        Data data2 = ((q) ((j2) yVar.f22677a).getValue()).f322844a;
                        TradingAccount tradingAccount = data2 != null ? (TradingAccount) data2.getContent() : null;
                        if (oVar == o.WITHDRAW_MONEY && tradingAccount != null && ((x8h.a0) bVar.G).a(tradingAccount)) {
                            kel.c cVar2 = (kel.c) d0.d0(listA);
                            kel.b bVar2 = cVar2 != null ? cVar2.f183153a : null;
                            if (bVar2 == null) {
                                r6.b.D("CashHoldings cannot be empty");
                            } else {
                                bVar.J2(bVar2);
                            }
                        } else if (listA.size() == 1) {
                            bVar.K2(oVar, bVar.o.f95952b, ((kel.c) d0.b0(listA)).f183153a);
                        } else if (listA.size() > 1) {
                            int[] iArr = x.f322861a;
                            int i3 = iArr[oVar.ordinal()];
                            if (i3 == 1) {
                                i = R$string.wealth_invest_stocks_wallet_chooser_title;
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R$string.wealth_invest_stocks_wallet_chooser_title_withdraw;
                            }
                            int i5 = iArr[oVar.ordinal()];
                            if (i5 == 1) {
                                aVar = qih.a.AVAILABLE_TO_INVEST;
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar = qih.a.AVAILABLE_TO_WITHDRAW;
                            }
                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                            List list = listA;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((kel.c) it8.next()).f183153a);
                            }
                            oki.h.v2(aVar3, new CashBalanceControllerContract$ModalStep.CashHoldingsSelectorDialog(new CashHoldingSelectorInputData(textLocalisedClause, arrayList, aVar), oVar), bottom_dialog);
                        } else {
                            r6.b.D("CashHoldings cannot be empty");
                        }
                    }
                }
                return Unit.f186387a;
            default:
                ty0.a model = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarK32 = cashBalanceController.k3();
                Intrinsics.h(model);
                com.revolut.feature.wealth.ui.impl.cash_balance.b bVar3 = (com.revolut.feature.wealth.ui.impl.cash_balance.b) pVarK32;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj4 = model.d;
                n nVar = obj4 instanceof n ? (n) obj4 : null;
                if (nVar != null) {
                    bVar3.I2(nVar);
                }
                return Unit.f186387a;
        }
    }
}
