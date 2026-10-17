package nch;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllController;
import ich.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsCollectionFiltersSeeAllController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InstrumentsCollectionFiltersSeeAllController instrumentsCollectionFiltersSeeAllController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsCollectionFiltersSeeAllController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarE3 = this.v.R2();
        Intrinsics.h(model);
        k kVar = (k) eVarE3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof InstrumentsCollectionFilter.ListFilter.Value) {
            y yVar = kVar.f214195q;
            InstrumentsCollectionFilter.ListFilter listFilter = ((f) ((j2) yVar.f22677a).getValue()).f214185a;
            t tVar = kVar.f214194p;
            InstrumentsCollectionFilter.ListFilter.Value valueC = adh.d.c((InstrumentsCollectionFilter.ListFilter.Value) obj3);
            tVar.getClass();
            kVar.H2(yVar, new nc1.j(t.c(listFilter, valueC), kVar, 2));
        }
        return Unit.f186387a;
    }
}
