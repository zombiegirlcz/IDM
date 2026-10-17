package ich;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import i2l.e0;
import ip0.y;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InstrumentsCollectionController instrumentsCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        ActionsView.Item model = yVar.f167226b;
        com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f58324n;
        if (obj3 instanceof n) {
            n nVar = (n) obj3;
            cli.y yVar2 = aVar2.A;
            List list = ((l) ((j2) yVar2.f22677a).getValue()).i;
            t tVar = aVar2.f95610t;
            InstrumentsCollectionFilterId instrumentsCollectionFilterId = nVar.f160277a;
            InstrumentsCollectionFilter.ListFilter.Value valueC = adh.d.c(nVar.f160278b);
            tVar.getClass();
            List listB = t.b(list, instrumentsCollectionFilterId, valueC);
            if (!Intrinsics.f(listB, list)) {
                aVar2.H2(yVar2, new e0(listB, 3));
                aVar2.f95612x.b(Unit.f186387a);
            }
        }
        return Unit.f186387a;
    }
}
