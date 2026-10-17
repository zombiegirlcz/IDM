package snh;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerController;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$ModalStep;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$Output;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthTransferPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WealthTransferPickerController wealthTransferPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = wealthTransferPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.R.getValue();
        Intrinsics.h(model);
        com.revolut.feature.wealth.ui.impl.transfer_picker.e eVar = (com.revolut.feature.wealth.ui.impl.transfer_picker.e) dVar;
        y yVar = eVar.f96087p;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        i iVar = obj3 instanceof i ? (i) obj3 : null;
        if (iVar != null) {
            if (iVar instanceof h) {
                h hVar = (h) iVar;
                WealthAccount wealthAccount = hVar.f264627c;
                kel.b bVar = hVar.f264625a;
                String str = hVar.f264626b;
                if (wealthAccount instanceof WealthAccount.Securities) {
                    eVar.C2(new WealthTransferPickerControllerContract$Output.StocksTransfer(str, bVar));
                } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount) {
                    eVar.C2(new WealthTransferPickerControllerContract$Output.TaxAdvantageTransfer((WealthAccount.TaxAdvantageWealthAccount) wealthAccount, str, bVar));
                } else {
                    if (!(wealthAccount instanceof WealthAccount.Commodities) && !(wealthAccount instanceof WealthAccount.Margin) && !(wealthAccount instanceof WealthAccount.Robo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.n(new IllegalStateException("Cash Holding payload for wealth transfer but " + wealthAccount.T0() + " doesn't have cash holdings."));
                }
            } else if (iVar instanceof com.revolut.feature.wealth.ui.impl.transfer_picker.a) {
                eVar.C2(new WealthTransferPickerControllerContract$Output.MarginTransfer(((com.revolut.feature.wealth.ui.impl.transfer_picker.a) iVar).f96083a));
            } else if (iVar instanceof com.revolut.feature.wealth.ui.impl.transfer_picker.b) {
                eVar.C2(new WealthTransferPickerControllerContract$Output.RoboTransfer(((com.revolut.feature.wealth.ui.impl.transfer_picker.b) iVar).f96084a));
            } else if (iVar instanceof com.revolut.feature.wealth.ui.impl.transfer_picker.c) {
                WealthTransferPickerControllerContract$TransferAccount.Securities securities = ((com.revolut.feature.wealth.ui.impl.transfer_picker.c) iVar).f96085a;
                List list = securities.f96078b;
                if (list.size() == 1) {
                    eVar.C2(new WealthTransferPickerControllerContract$Output.StocksTransfer(securities.f96077a, ((CashHoldingAvailability) d0.b0(list)).f105108a));
                } else if (list.size() > 1) {
                    eVar.H2(yVar, new sdi.k(securities, list, 12));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("There needs to be at least one cash holding in order to transfer");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
            } else if (iVar instanceof com.revolut.feature.wealth.ui.impl.transfer_picker.d) {
                WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount taxAdvantageAccount = ((com.revolut.feature.wealth.ui.impl.transfer_picker.d) iVar).f96086a;
                List list2 = taxAdvantageAccount.f96081b;
                String str2 = taxAdvantageAccount.f96080a;
                if (list2.size() == 1) {
                    eVar.C2(new WealthTransferPickerControllerContract$Output.TaxAdvantageTransfer(taxAdvantageAccount.f96082c, str2, ((CashHoldingAvailability) d0.b0(list2)).f105108a));
                } else if (list2.size() > 1) {
                    eVar.H2(yVar, new sdi.k(taxAdvantageAccount, list2, 11));
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("There needs to be at least one cash holding in order to transfer tax advantage portfolio id ", str2));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
            } else {
                if (!(iVar instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.kompot.navigable.vc.modal.a aVar2 = eVar.f96088q;
                xi0.a aVar3 = xi0.b.Companion;
                g gVar = (g) iVar;
                String str3 = gVar.f264623a.f183148a.e;
                aVar3.getClass();
                oki.h.v2(aVar2, new WealthTransferPickerControllerContract$ModalStep.CashHoldingDeactivatedBorrowedFundsExplanation(xi0.a.a(str3), gVar.f264624b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
