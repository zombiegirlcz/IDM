package jch;

import cli.y;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersController;
import i2l.e0;
import ich.t;
import ip0.r70;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InstrumentsCollectionFiltersController f172800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(InstrumentsCollectionFiltersController instrumentsCollectionFiltersController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172800w = instrumentsCollectionFiltersController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f172800w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f172800w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InstrumentsCollectionFiltersController instrumentsCollectionFiltersController = this.f172800w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = instrumentsCollectionFiltersController.R2();
                Intrinsics.h(listId);
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("INSTRUMENTS_COLLECTION_CLEAR_ALL_LIST_ID")) {
                    aVar2.H2(aVar2.f95620q, new j7b.l(27));
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r70 model = (r70) pair.f186385a;
                Pair selectedRange = (Pair) pair.f186386b;
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a aVar4 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a) instrumentsCollectionFiltersController.R2();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(selectedRange, "selectedRange");
                int iIntValue = ((Number) selectedRange.f186385a).intValue();
                int iIntValue2 = ((Number) selectedRange.f186386b).intValue();
                Object obj3 = model.f166134j;
                if (obj3 instanceof n) {
                    n nVar = (n) obj3;
                    t tVar = aVar4.f95619p;
                    InstrumentsCollectionFilterId instrumentsCollectionFilterId = nVar.f172806a;
                    y yVar = aVar4.f95620q;
                    List list = ((j) ((j2) yVar.f22677a).getValue()).f172802b;
                    InstrumentsCollectionFilter.RangeFilter.Range range = nVar.f172807b;
                    Intrinsics.checkNotNullParameter(range, "<this>");
                    range.getClass();
                    InstrumentsCollectionFilter.RangeFilter.Range range2 = new InstrumentsCollectionFilter.RangeFilter.Range(iIntValue, iIntValue2);
                    tVar.getClass();
                    aVar4.H2(yVar, new e0(t.b(list, instrumentsCollectionFilterId, range2), 15));
                }
                break;
        }
        return Unit.f186387a;
    }
}
