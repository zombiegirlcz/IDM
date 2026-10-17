package ich;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InstrumentsCollectionController instrumentsCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        zzg.s sVar;
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        if (obj3 instanceof o) {
            o oVar = (o) obj3;
            InstrumentsCollectionSortOption instrumentsCollectionSortOption = oVar.f160279a;
            InstrumentsCollectionSortOption priceChange1Day = oVar.f160280b;
            if (Intrinsics.f(instrumentsCollectionSortOption, priceChange1Day)) {
                Intrinsics.checkNotNullParameter(priceChange1Day, "<this>");
                zzg.s f95282a = priceChange1Day.getF95282a();
                int i = f95282a == null ? -1 : adh.e.f3352a[f95282a.ordinal()];
                if (i == -1) {
                    sVar = null;
                } else if (i == 1) {
                    sVar = zzg.s.DESC;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar = zzg.s.ASC;
                }
                if (priceChange1Day instanceof InstrumentsCollectionSortOption.AlphabeticalOrder) {
                    priceChange1Day = new InstrumentsCollectionSortOption.AlphabeticalOrder(sVar);
                } else if (priceChange1Day instanceof InstrumentsCollectionSortOption.MostOwned) {
                    priceChange1Day = new InstrumentsCollectionSortOption.MostOwned(sVar);
                } else if (priceChange1Day instanceof InstrumentsCollectionSortOption.RemainingYears) {
                    priceChange1Day = new InstrumentsCollectionSortOption.RemainingYears(sVar);
                } else if (priceChange1Day instanceof InstrumentsCollectionSortOption.YieldToMaturity) {
                    priceChange1Day = new InstrumentsCollectionSortOption.YieldToMaturity(sVar);
                } else if (priceChange1Day instanceof InstrumentsCollectionSortOption.MostTraded) {
                    priceChange1Day = new InstrumentsCollectionSortOption.MostTraded(sVar);
                } else {
                    if (!(priceChange1Day instanceof InstrumentsCollectionSortOption.PriceChange1Day)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    priceChange1Day = new InstrumentsCollectionSortOption.PriceChange1Day(sVar);
                }
            }
            aVar2.f95606p.A(aVar2.f95608r.a(((l) ((j2) aVar2.A.f22677a).getValue()).f, priceChange1Day));
        }
        return Unit.f186387a;
    }
}
