package vpd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.feature.vaults.common.SavingAccountType;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSorterDestinationsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(IncomeSorterDestinationsController incomeSorterDestinationsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSorterDestinationsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.m iVar;
        aii.m hVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        boolean z = obj3 instanceof RemainingBalanceDestination;
        IncomeSorterDestinationsController incomeSorterDestinationsController = this.v;
        if (z) {
            RemainingBalanceDestination remainingBalanceDestination = (RemainingBalanceDestination) obj3;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
            aVar2.C2(new h(remainingBalanceDestination));
        } else if (obj3 instanceof mqd.i) {
            mqd.i crossSell = (mqd.i) obj3;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d();
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(crossSell, "crossSell");
            Set setI2 = aVar3.I2();
            if (crossSell instanceof mqd.h) {
                iVar = new a.d(setI2);
            } else if (crossSell instanceof mqd.f) {
                iVar = new a.c(setI2);
            } else if (crossSell instanceof mqd.g) {
                iVar = new kqd.j(SavingAccountType.Personal.f94740a, setI2);
            } else {
                if (crossSell instanceof mqd.c) {
                    hVar = new kqd.j(new SavingAccountType.Joint(((mqd.c) crossSell).f207975a), setI2);
                } else if (crossSell instanceof mqd.a) {
                    iVar = a.C0549a.f87810b;
                } else if (crossSell instanceof mqd.e) {
                    iVar = new kqd.i(((mqd.e) crossSell).f207979b);
                } else if (crossSell instanceof mqd.d) {
                    hVar = new kqd.h(((mqd.d) crossSell).f207977a, setI2);
                } else {
                    if (!(crossSell instanceof mqd.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = a.b.f87811b;
                }
                iVar = hVar;
            }
            aVar3.l1().M0(iVar);
        } else if (obj3 instanceof a) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d();
            IncomeSorterDestinationsContract$InputData incomeSorterDestinationsContract$InputData = aVar4.o;
            IncomeSorterDestinationsContract$InputData.SelectionMode selectionMode = incomeSorterDestinationsContract$InputData.f87718a;
            IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection destinationsSelection = selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection ? (IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection) selectionMode : null;
            if (destinationsSelection != null) {
                aVar4.l1().M0(new kqd.k(destinationsSelection.f87721b, incomeSorterDestinationsContract$InputData.f87719b, aVar4.I2()));
            }
        }
        return Unit.f186387a;
    }
}
