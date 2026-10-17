package wed;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedAlertsScreen f296721w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SharedAlertsScreen sharedAlertsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296721w = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f296721w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f296721w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f296721w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 3;
        SharedAlertsScreen sharedAlertsScreen = this.f296721w;
        switch (i) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarI3 = sharedAlertsScreen.T2();
                String selectedId = g6Var.f54199a;
                f0 f0Var = (f0) qVarI3;
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                mgd.d dVarValueOf = mgd.d.valueOf(selectedId);
                if (((l) f0Var.t2()).d != dVarValueOf) {
                    f0Var.x2(new wdb.b(dVarValueOf, i2));
                    f0Var.f296732y.k(w4l.h.f294642c);
                    f0Var.f296731x.k(Unit.f186387a);
                }
                break;
            case 1:
                List<koi.j> items = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarI32 = sharedAlertsScreen.T2();
                Intrinsics.h(items);
                f0 f0Var2 = (f0) qVarI32;
                f0Var2.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList<Pair> arrayList = new ArrayList();
                for (koi.j jVar : items) {
                    wh whVar = jVar instanceof wh ? (wh) jVar : null;
                    qv0.i iVar = whVar != null ? whVar.f54925b : null;
                    qv0.p pVar = iVar instanceof qv0.p ? (qv0.p) iVar : null;
                    Object d = pVar != null ? pVar.getF55256g() : null;
                    AlertItem alertItem = d instanceof AlertItem ? (AlertItem) d : null;
                    Pair pair = alertItem != null ? new Pair(alertItem.getF86877b().d, ngm.n.t(alertItem)) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Pair pair2 : arrayList) {
                    FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) pair2.f186385a;
                    Object arrayList2 = linkedHashMap.get(favouritesAssetTypeKey);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(favouritesAssetTypeKey, arrayList2);
                    }
                    ((List) arrayList2).add((Pair) pair2.f186386b);
                }
                if (!Intrinsics.f(((l) f0Var2.t2()).f296745g, linkedHashMap)) {
                    f0Var2.x2(new awk.j(linkedHashMap, 22));
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarI33 = sharedAlertsScreen.T2();
                Intrinsics.h(id10);
                f0 f0Var3 = (f0) qVarI33;
                f0Var3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ADD_NAV_BAR_ITEM_ID")) {
                    f0.y2(f0Var3, null, null, 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
