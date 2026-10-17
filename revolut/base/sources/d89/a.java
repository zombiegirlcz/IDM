package d89;

import ahd.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import d27.g0;
import d7j.p0;
import efm.r;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import w4l.h;
import w4l.k;
import wsg.n;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f112161b;

    public /* synthetic */ a(g gVar, int i) {
        this.f112160a = i;
        this.f112161b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112160a) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    if (l.D(xi0.b.Companion, ((io3.d) obj3).f163147c)) {
                        arrayList.add(obj3);
                    }
                }
                r rVarJust = r.just(zi0.c.P(arrayList, false, null, 3));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return nim.a.w(rVarJust, new a(this.f112161b, 8));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add((io3.d) ((Pair) it8.next()).f186385a);
                }
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add((z79.b) ((Pair) it9.next()).f186386b);
                }
                return nim.a.v(rd0.e.b(this.f112161b.c(arrayList2, bVar)), new g0(arrayList2, 6, arrayList3, bVar));
            case 2:
                c cVar = (c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                ArrayList arrayList4 = cVar.f112162a;
                ArrayList arrayList5 = cVar.f112163b;
                r rVarX = this.f112161b.f112168b.B(arrayList4, cVar.f112164c, cVar.d, false).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return new y(rd0.e.b(rVarX), arrayList5, arrayList4, 15);
            case 3:
                i jointAccountOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(jointAccountOptional, "jointAccountOptional");
                n38.a aVar = (n38.a) jointAccountOptional.f224257a;
                if (aVar == null) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                g gVar = this.f112161b;
                n nVar = gVar.f112168b;
                AccountId.Joint jointC = l38.a.c(aVar);
                return rd0.e.b(nim.a.w(osg.b.g(nVar, h.f294642c, io3.l.BLOCKING, null, null, null, null, jointC, 60), new p0(gVar, 19)));
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                xi0.b bVar2 = (xi0.b) pair2.f186386b;
                g gVar2 = this.f112161b;
                r rVarDistinctUntilChanged = gVar2.c(list3, bVar2).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                return pd.b.t(ue0.e.E(rVarDistinctUntilChanged, new Data(f0.f322471a, null, false, 6, null)), new g0(gVar2, 7, list3, bVar2));
            case 5:
                k loadingStrategy = (k) obj2;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                r map = this.f112161b.f112168b.J(AccountId.Personal.f51414a, loadingStrategy).map(new d73.n(new p0(20), 10));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                r rVarDistinctUntilChanged2 = map.distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged2;
            case 6:
                k loadingStrategy2 = (k) obj2;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                g gVar3 = this.f112161b;
                r map2 = pd.b.r(gVar3.b(loadingStrategy2), new a(gVar3, 0)).map(new d73.n(new p0(20), 10));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                r rVarDistinctUntilChanged3 = map2.distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged3;
            case 7:
                k loadingStrategy3 = (k) obj2;
                Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                g gVar4 = this.f112161b;
                r rVarDistinctUntilChanged4 = pd.b.r(kli.a.h(gVar4.b(loadingStrategy3), gVar4.f112168b.J(AccountId.Personal.f51414a, loadingStrategy3)), new a(gVar4, 4)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged4, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged4;
            default:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ArrayList arrayList6 = new ArrayList();
                Iterator it11 = it10.iterator();
                while (true) {
                    boolean zHasNext = it11.hasNext();
                    g gVar5 = this.f112161b;
                    if (!zHasNext) {
                        return d0.P0(arrayList6, gVar5.d);
                    }
                    Object next = it11.next();
                    gVar5.getClass();
                    io3.k kVar = ((io3.d) next).f;
                    if (kVar == io3.k.ACTIVE || kVar == io3.k.INACTIVE) {
                        arrayList6.add(next);
                    }
                }
                break;
        }
    }
}
