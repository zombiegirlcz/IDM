package vpd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSorterDestinationsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(IncomeSorterDestinationsController incomeSorterDestinationsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSorterDestinationsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set set;
        Set set2;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.i;
        boolean z = obj3 instanceof e;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        IncomeSorterDestinationsController incomeSorterDestinationsController = this.v;
        if (z) {
            e investmentSeeAllParcel = (e) obj3;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(investmentSeeAllParcel, "investmentSeeAllParcel");
            oki.h.v2(aVar2.f87737w, new IncomeSorterDestinationsContract$ModalStep.WealthAssetSelection(investmentSeeAllParcel.f291160a, investmentSeeAllParcel.f291162c, investmentSeeAllParcel.f291161b), popup);
        } else if (obj3 instanceof b) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d();
            IncomeSorterDestinationsContract$InputData.SelectionMode selectionMode = aVar3.o.f87718a;
            List list = null;
            IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection destinationsSelection = selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection ? (IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection) selectionMode : null;
            Set set3 = (destinationsSelection == null || (set2 = destinationsSelection.f87720a) == null) ? zhm.f0.f322471a : set2;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : set3) {
                if (obj4 instanceof IncomeSorterDestinationInfo.Crypto) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((IncomeSorterDestinationInfo.Crypto) it8.next()).getF87462a());
            }
            l lVar = ((d) ((j2) aVar3.v.f22677a).getValue()).f291157b;
            j jVar = lVar instanceof j ? (j) lVar : null;
            if (jVar != null && (set = jVar.f291169a) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : set) {
                    if (obj5 instanceof IncomeSorterDestinationInfo.Crypto.CryptoPocket) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) it9.next()).f87459a);
                }
                list = arrayList4;
            }
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            oki.h.v2(aVar3.f87737w, new IncomeSorterDestinationsContract$ModalStep.CryptoSeeAllStep(arrayList2, list), popup);
        }
        return Unit.f186387a;
    }
}
