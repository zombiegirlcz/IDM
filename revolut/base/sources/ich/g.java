package ich;

import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InstrumentsCollectionController instrumentsCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "INSTRUMENTS_COLLECTION_SUBHEADER_LIST_ID")) {
            j60.a aVar3 = aVar2.f95606p;
            mch.e eVar = aVar2.f95608r;
            y yVar = aVar2.A;
            aVar3.x(eVar.a(((l) ((j2) yVar.f22677a).getValue()).f, ((l) ((j2) yVar.f22677a).getValue()).f160275g));
        }
        return Unit.f186387a;
    }
}
