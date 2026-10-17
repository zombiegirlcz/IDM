package y2e;

import cli.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaQuickFilter;
import com.revolut.feature.store.impl.ui.brands.StoreBrandsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(StoreBrandsScreen storeBrandsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Object obj3 = item.f58324n;
        s sVar = (s) gVarE3;
        g2e.b bVar = sVar.f310656q;
        y yVar = sVar.f310658s;
        if (obj3 instanceof d) {
            String str = ((d) obj3).f310638a;
            Pair pairA = u3e.e.a(str, ((a) ((j2) yVar.f22677a).getValue()).f310634c);
            ((g2e.c) bVar).d(str, pairA != null ? (StoreMegaFilter) pairA.f186385a : null, pairA != null ? (StoreMegaFilter.StoreMegaFilterValue) pairA.f186386b : null);
        } else if (obj3 instanceof e) {
            List list = ((a) ((j2) yVar.f22677a).getValue()).f310633b;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((StoreMegaQuickFilter) it8.next()).f88565a);
            }
            e eVar = (e) obj3;
            String str2 = eVar.f310640b;
            ((g2e.c) bVar).b(eVar.f310639a, str2, arrayList.contains(str2));
        }
        return Unit.f186387a;
    }
}
