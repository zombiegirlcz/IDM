package ich;

import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import skm.a2;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InstrumentsCollectionController f160271w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InstrumentsCollectionController instrumentsCollectionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160271w = instrumentsCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f160271w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f160271w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InstrumentsCollectionController instrumentsCollectionController = this.f160271w;
        switch (i) {
            case 0:
                List items = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = instrumentsCollectionController.R2();
                Intrinsics.h(items);
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) kVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                List list = items;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((a0) it8.next()).f214560a.f214596b);
                }
                List listU = d0.U(arrayList);
                a2 a2Var = aVar2.f95613y;
                Continuation continuation = null;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                aVar2.f95613y = aVar2.n2(new i44.a(aVar2, listU, continuation, 14), new whi.b(6));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = instrumentsCollectionController.R2();
                Intrinsics.h(query);
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar4 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) kVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar4.H2(aVar4.A, new i25.e(aVar4, query, 16));
                break;
        }
        return Unit.f186387a;
    }
}
