package aqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSortersDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b1 b1Var = new b1(this.v, continuation);
        b1Var.u = obj2;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b1) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.m jVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d0 d0VarD = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) d0VarD;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = eVar.f87767y;
        if (obj3 instanceof y) {
            m mVar = (m) ((t) ((j2) eVar.f87766x.f22677a).getValue()).f8402a.getContent();
            if (mVar != null) {
                ArrayList arrayList = mVar.d;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((IncomeSorterHomeContract$DestinationValue) it8.next()).f87825a);
                }
                jVar = new kqd.l(new IncomeSorterFlowContract$SelectionMode.DestinationsSelection(mVar.k.f163145a, zhm.d0.i1(arrayList2)), mVar.f8363a.f115083b);
            }
            return Unit.f186387a;
        }
        if (obj3 instanceof mqd.h) {
            jVar = new a.d(0);
        } else if (obj3 instanceof mqd.f) {
            jVar = new a.c(0);
        } else if (obj3 instanceof mqd.g) {
            jVar = new kqd.j(SavingAccountType.Personal.f94740a, zhm.h0.f322473a);
        } else {
            boolean z = obj3 instanceof mqd.a;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                oki.h.v2(aVar2, new IncomeSortersDetailsContract$ModalStep.InvestDisclaimer(IncomeSortersDetailsContract$ModalStep.InvestDisclaimerDestination.Gia.f87750a), bottom_dialog);
            } else if (obj3 instanceof mqd.e) {
                oki.h.v2(aVar2, new IncomeSortersDetailsContract$ModalStep.InvestDisclaimer(new IncomeSortersDetailsContract$ModalStep.InvestDisclaimerDestination.PersonalJisa(((mqd.e) obj3).f207979b)), bottom_dialog);
            }
            jVar = null;
        }
        if (jVar != null) {
            eVar.l1().M0(jVar);
        }
        return Unit.f186387a;
    }
}
