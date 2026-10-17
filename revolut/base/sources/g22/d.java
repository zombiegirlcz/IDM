package g22;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.PaymentsBreakdownController;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsController;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import k5k.t;
import k5k.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nrf.h;
import q12.l;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentsBreakdownController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaymentsBreakdownController paymentsBreakdownController, Continuation continuation) {
        super(2, continuation);
        this.v = paymentsBreakdownController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ApmQuoteChargeFee apmQuoteChargeFee;
        ApmQuoteChargeTax apmQuoteChargeTax;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.S.getValue();
        Object obj3 = model.f51787l;
        g gVar = (g) aVar2;
        y yVar = gVar.f139771s;
        if (obj3 instanceof x) {
            ApmQuoteRate apmQuoteRate = ((b) ((j2) yVar.f22677a).getValue()).f139763b.f62209a;
            if (apmQuoteRate != null) {
                gVar.C1(((l) gVar.f139769q).f(apmQuoteRate));
            }
        } else {
            boolean z = obj3 instanceof t;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z || (obj3 instanceof k5k.y)) {
                ApmQuoteCharges apmQuoteCharges = ((b) ((j2) yVar.f22677a).getValue()).f139763b.d;
                if (apmQuoteCharges != null && (apmQuoteChargeFee = apmQuoteCharges.f62223b) != null) {
                    yji.l.j2(gVar, new BreakdownDetailsController(new BreakdownDetailsContract$InputData.ChargesFee(apmQuoteChargeFee)), bottom_dialog, null, 2);
                }
            } else if (obj3 instanceof h) {
                ApmQuoteCharges apmQuoteCharges2 = ((b) ((j2) yVar.f22677a).getValue()).f139763b.d;
                if (apmQuoteCharges2 != null && (apmQuoteChargeTax = apmQuoteCharges2.f62224c) != null) {
                    yji.l.j2(gVar, new BreakdownDetailsController(new BreakdownDetailsContract$InputData.ChargesTax(apmQuoteChargeTax)), bottom_dialog, null, 2);
                }
            } else if (obj3 instanceof z3l.a) {
                yji.l.j2(gVar, new BreakdownDetailsController(new BreakdownDetailsContract$InputData.Tax((z3l.a) obj3)), bottom_dialog, null, 2);
            } else if (obj3 instanceof z3l.b) {
                yji.l.j2(gVar, new BreakdownDetailsController(new BreakdownDetailsContract$InputData.TaxBreakdown((z3l.b) obj3)), bottom_dialog, null, 2);
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "PaymentsBreakdownControllerModel", a0.d.m(obj3, "No handler: "), null, null, 16);
            }
        }
        return Unit.f186387a;
    }
}
