package mei;

import efm.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kei.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ma1.v;
import qe0.s;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f204686b;

    public /* synthetic */ b(g gVar, int i) {
        this.f204685a = i;
        this.f204686b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f204685a) {
            case 0:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                g gVar = this.f204686b;
                d0<List<j>> tileCarousels = gVar.f204691a.getTileCarousels();
                v vVar = new v(25, new md0.c(9));
                tileCarousels.getClass();
                ufm.f fVar = new ufm.f(new i(tileCarousels, vVar, 1), new v(26, new b(gVar, 2)), 3);
                Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                return fVar;
            case 1:
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                ne0.d dVar = this.f204686b.f204692b;
                List<com.revolut.feature_tiles_api.models.a> list = (List) dVar.get(key);
                if (list == null) {
                    return null;
                }
                Set set = (Set) dVar.get("TEMPORARILY_CLOSED_TILES");
                if (set == null) {
                    set = h0.f322473a;
                }
                ArrayList arrayList = new ArrayList();
                for (com.revolut.feature_tiles_api.models.a aVarA : list) {
                    List list2 = aVarA.f97836c;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                if (set.contains(((gei.a) it9.next()).f143299a)) {
                                    List list3 = aVarA.f97836c;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : list3) {
                                        if (!set.contains(((gei.a) obj3).f143299a)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    aVarA = !arrayList2.isEmpty() ? com.revolut.feature_tiles_api.models.a.a(aVarA, arrayList2) : null;
                                }
                            }
                        }
                    }
                    if (aVarA != null) {
                        arrayList.add(aVarA);
                    }
                }
                return arrayList;
            default:
                s sVar = this.f204686b.f204693c;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
        }
    }
}
