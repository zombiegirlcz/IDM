package w2e;

import cli.y;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import com.revolut.feature.store.api.model.StoreMegaQuickFilter;
import com.revolut.feature.store.impl.ui.brand_filters.StoreBrandsFiltersScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StoreBrandsFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(StoreBrandsFiltersScreen storeBrandsFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = storeBrandsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        ArrayList arrayList;
        int i = this.u;
        StoreBrandsFiltersScreen storeBrandsFiltersScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) storeBrandsFiltersScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) storeBrandsFiltersScreen.e3();
                y yVar = iVar.f294036r;
                List selection = ((a) ((j2) yVar.f22677a).getValue()).f294026b;
                j2 j2Var = (j2) yVar.f22677a;
                StoreMegaFiltersResponse storeMegaFiltersResponse = (StoreMegaFiltersResponse) ((a) j2Var.getValue()).f294025a.getContent();
                List list = storeMegaFiltersResponse != null ? storeMegaFiltersResponse.f88546b : null;
                if (list == null) {
                    list = f0.f322471a;
                }
                StoreMegaFiltersResponse storeMegaFiltersResponse2 = (StoreMegaFiltersResponse) ((a) j2Var.getValue()).f294025a.getContent();
                Iterable iterable = storeMegaFiltersResponse2 != null ? storeMegaFiltersResponse2.f88545a : null;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                List list2 = selection;
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    List list3 = ((StoreMegaFilterSelection) it8.next()).f88544b;
                    ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(((StoreMegaFilter.StoreMegaFilterValue) it9.next()).f88540a);
                    }
                    a0.x(arrayList3, arrayList2);
                }
                Set setI1 = d0.i1(arrayList2);
                List list4 = list;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(((StoreMegaQuickFilter) it10.next()).f88565a);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (setI1.contains((String) obj3)) {
                        arrayList5.add(obj3);
                    }
                }
                List list5 = iVar.f294035q.f139971a;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list5) {
                    String str = (String) obj4;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it11 = iterable.iterator();
                    while (it11.hasNext()) {
                        a0.x(((StoreMegaFilter) it11.next()).f88539c, arrayList7);
                    }
                    if (!arrayList7.isEmpty()) {
                        Iterator it12 = arrayList7.iterator();
                        while (it12.hasNext()) {
                            if (Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) it12.next()).f88540a, str)) {
                            }
                            break;
                        }
                    }
                    arrayList6.add(obj4);
                }
                g2e.b bVar = iVar.f294034p;
                ArrayList quickFilterIds = d0.E0(arrayList5, arrayList6);
                g2e.c cVar = (g2e.c) bVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(selection, "selection");
                Intrinsics.checkNotNullParameter(quickFilterIds, "quickFilterIds");
                j2 j2Var2 = cVar.f139974a;
                do {
                    value = j2Var2.getValue();
                    g2e.a aVar3 = (g2e.a) value;
                    arrayList = new ArrayList();
                    for (Object obj5 : list2) {
                        if (!((StoreMegaFilterSelection) obj5).f88544b.isEmpty()) {
                            arrayList.add(obj5);
                        }
                    }
                    aVar3.getClass();
                } while (!j2Var2.h(value, g2e.a.a(quickFilterIds, arrayList)));
                iVar.B2();
                break;
        }
        return Unit.f186387a;
    }
}
