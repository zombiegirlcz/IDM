package ox5;

import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import yhm.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b f230569b;

    public /* synthetic */ c0(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar, int i) {
        this.f230568a = i;
        this.f230569b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        Flow flowV;
        int i = this.f230568a;
        Continuation continuation = null;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = this.f230569b;
        switch (i) {
            case 0:
                ny5.g gVar = bVar.f71567q;
                cw5.f content = (cw5.f) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                ArrayList<cw5.c> arrayList = content.f109542c;
                ArrayList arrayList2 = new ArrayList();
                for (cw5.c cVar : arrayList) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        xi0.a aVar = xi0.b.Companion;
                        String str = cVar.f109537a;
                        aVar.getClass();
                        objA = xi0.a.a(str);
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    xi0.b bVar2 = (xi0.b) objA;
                    if (bVar2 != null) {
                        arrayList2.add(bVar2);
                    }
                    break;
                }
                return arrayList2.isEmpty() ? new go.g(new Data(null, null, false, 2, null), 2) : nim.a.v(zh9.u0.m(rd0.e.b(gVar.a(arrayList2)), rd0.e.b(gVar.b(arrayList2, tzg.j.ONE_DAY))), new jeg.i(18, arrayList2));
            case 1:
                dw5.b outputData = (dw5.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                bVar.n2(new osk.m(bVar, outputData, continuation, 8), new whi.b(6));
                return Unit.f186387a;
            case 2:
                ny5.g gVar2 = bVar.f71567q;
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                if (!currencies.isEmpty()) {
                    return nim.a.v(zh9.u0.m(rd0.e.b(gVar2.a(currencies)), rd0.e.b(gVar2.b(currencies, tzg.j.ONE_DAY))), new njf.e(currencies, 12));
                }
                zhm.f0 f0Var = zhm.f0.f322471a;
                return new go.g(zi0.c.P(new cw5.a(f0Var, f0Var, f0Var), false, null, 3), 2);
            case 3:
                List products = (List) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                List list = products;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((StakingProduct) it8.next()).d);
                }
                ny5.g gVar3 = bVar.f71567q;
                if (arrayList3.isEmpty()) {
                    zhm.f0 f0Var2 = zhm.f0.f322471a;
                    flowV = new go.g(new Data(new cw5.a(f0Var2, f0Var2, f0Var2), null, false, 6, null), 2);
                } else {
                    flowV = nim.a.v(zh9.u0.m(rd0.e.b(gVar3.a(arrayList3)), rd0.e.b(gVar3.b(arrayList3, tzg.j.ONE_DAY))), new jeg.i(19, arrayList3));
                }
                return nim.a.v(flowV, new njf.e(products, 11));
            case 4:
                List collections = (List) obj2;
                Intrinsics.checkNotNullParameter(collections, "collections");
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = collections.iterator();
                while (it9.hasNext()) {
                    zhm.a0.x(((xzg.k) it9.next()).a(), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(((xzg.d) it10.next()).f309976a);
                }
                return nim.a.w(bVar.f71573y.e(arrayList5, qta.f.DAY), new njf.e(collections, 13));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return bVar.f71569s.a((List) pair.f186385a, (ny5.v) pair.f186386b);
        }
    }
}
