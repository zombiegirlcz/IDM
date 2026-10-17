package w2e;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import com.revolut.feature.store.impl.ui.brand_filters.StoreBrandsFiltersScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vrl.n;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandsFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StoreBrandsFiltersScreen storeBrandsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StoreMegaFiltersResponse storeMegaFiltersResponse;
        Object next;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarD = this.v.d();
        Object obj3 = model.k;
        i iVar = (i) bVarD;
        y yVar = iVar.f294036r;
        Object obj4 = null;
        k kVar = obj3 instanceof k ? (k) obj3 : null;
        if (kVar != null && (storeMegaFiltersResponse = (StoreMegaFiltersResponse) ((a) ((j2) yVar.f22677a).getValue()).f294025a.getContent()) != null) {
            Iterator it8 = storeMegaFiltersResponse.f88545a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((StoreMegaFilter) next).f88537a, kVar.f294038a)) {
                    break;
                }
            }
            StoreMegaFilter storeMegaFilter = (StoreMegaFilter) next;
            if (storeMegaFilter != null) {
                Iterator it9 = storeMegaFilter.f88539c.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    if (Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) next2).f88540a, kVar.f294039b)) {
                        obj4 = next2;
                        break;
                    }
                }
                StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue = (StoreMegaFilter.StoreMegaFilterValue) obj4;
                if (storeMegaFilterValue != null) {
                    iVar.H2(yVar, new n(iVar, storeMegaFilter, storeMegaFilterValue));
                }
            }
        }
        return Unit.f186387a;
    }
}
