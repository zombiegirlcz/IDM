package z77;

import com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc;
import e9h.d;
import fel.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import ua2.r;
import vel.g;
import vel.h;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ou5.b f319940b;

    public /* synthetic */ a(ou5.b bVar, int i) {
        this.f319939a = i;
        this.f319940b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h assetType;
        c collection = (c) obj2;
        switch (this.f319939a) {
            case 0:
                Intrinsics.checkNotNullParameter(collection, "collection");
                d dVar = (d) this.f319940b.f229821c;
                List<fel.b> list = collection.f134653b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (fel.b bVar : list) {
                    String ref2 = bVar.f134649a;
                    int i = b.f319941a[bVar.f134650b.ordinal()];
                    if (i == 1) {
                        assetType = h.CURRENCY;
                    } else if (i == 2) {
                        assetType = h.STOCK;
                    } else if (i == 3) {
                        assetType = h.CURRENCY;
                    } else if (i == 4) {
                        assetType = h.INDEX;
                    } else {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        assetType = h.CURRENCY_PAIR;
                    }
                    xi0.b bVar2 = bVar.f134651c;
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    arrayList.add(new g(ref2, assetType, null, null, bVar2));
                }
                return e.b(h0h.b.a(dVar, arrayList, null, null, false, 12));
            case 1:
                Intrinsics.checkNotNullParameter(collection, "collection");
                if (!((jte.d) ((gte.a) this.f319940b.e)).c(CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c)) {
                    return collection;
                }
                List list2 = collection.f134653b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((fel.b) obj3).f134650b != fel.a.COMMODITY) {
                        arrayList2.add(obj3);
                    }
                }
                return c.a(collection, arrayList2);
            default:
                Intrinsics.checkNotNullParameter(collection, "collection");
                List list3 = collection.f134653b;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((fel.b) it8.next()).f134649a);
                }
                zjh.c cVar = (zjh.c) this.f319940b.f229820b;
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                vdl.h hVar = (vdl.h) cVar.f322830b;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(hVar.d.b(Unit.f186387a, loadingStrategy), new r(18, arrayList3));
        }
    }
}
