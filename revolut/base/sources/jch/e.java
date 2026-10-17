package jch;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsCollectionFiltersController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InstrumentsCollectionFiltersController instrumentsCollectionFiltersController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsCollectionFiltersController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        if (obj3 instanceof InstrumentsCollectionFilter.ListFilter) {
            oki.h.v2(aVar2.f95621r, new InstrumentsCollectionFiltersControllerContract$ModalStep.SeeAll((InstrumentsCollectionFilter.ListFilter) obj3), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
