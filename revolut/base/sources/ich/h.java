package ich;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InstrumentsCollectionController instrumentsCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof InstrumentsCollectionSortOption) {
            InstrumentsCollectionSortOption instrumentsCollectionSortOption = (InstrumentsCollectionSortOption) obj3;
            y yVar = aVar2.A;
            InstrumentsCollectionSortOption instrumentsCollectionSortOption2 = ((l) ((j2) yVar.f22677a).getValue()).f160275g;
            j60.a.v(aVar2.f95606p, false, null, 3);
            if (!Intrinsics.f(instrumentsCollectionSortOption2, instrumentsCollectionSortOption)) {
                aVar2.H2(yVar, new i9e.a(instrumentsCollectionSortOption, 15));
                aVar2.f95612x.b(Unit.f186387a);
            }
        }
        return Unit.f186387a;
    }
}
