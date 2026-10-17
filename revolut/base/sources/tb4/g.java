package tb4;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import xu3.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SummaryScreen summaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = summaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) nVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = hVar.f67751s;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof h) {
            hVar.C2(j.f269444a);
        } else if (obj3 instanceof ry3.a) {
            hVar.f67749q.getClass();
            ParcelableDestination parcelableDestinationA = jz3.c.a((ry3.a) obj3);
            if (parcelableDestinationA != null) {
                hVar.C1(parcelableDestinationA);
            }
        } else if (obj3 instanceof av3.i) {
            hVar.C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(((av3.i) obj3).f9907b, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, true, 2032)));
        } else {
            boolean z = obj3 instanceof av3.j;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                h0 h0VarF7 = hVar.o.f67734a.f7();
                if (h0VarF7 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                oki.h.v2(aVar2, new SummaryScreenContract$ModalStep.RevolutAccountDetails(h0VarF7), bottom_dialog);
            } else if (obj3 instanceof a3) {
                oki.h.v2(aVar2, new SummaryScreenContract$ModalStep.TransactionManagement(model.f53230c, (a3) obj3), bottom_dialog);
            } else {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "SummaryScreenModel", obj3 + " is not supported by onRowDelegateClicked", null, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
