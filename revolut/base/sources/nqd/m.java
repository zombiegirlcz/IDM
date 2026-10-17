package nqd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.s9;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fo3.c f218418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CategorisationFilter f218419x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f218420y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, fo3.c cVar, CategorisationFilter categorisationFilter, List list, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f218418w = cVar;
        this.f218419x = categorisationFilter;
        this.f218420y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, this.f218418w, this.f218419x, this.f218420y, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((IncomeSorter) it8.next()).f99162c);
        }
        o oVar = this.v;
        wzi.a aVar2 = oVar.o;
        String walletId = this.f218418w.f136801a;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((IncomeSorter) it9.next()).f99160a);
        }
        Set incomeSorterIds = d0.i1(arrayList2);
        etj.o oVar2 = (etj.o) aVar2;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(incomeSorterIds, "incomeSorterIds");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jtj.k kVar = (jtj.k) oVar2.f129439b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(incomeSorterIds, "incomeSorterIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new l(oVar, list, this.f218419x, this.f218420y, null), u0.m(cj9.c.y(nim.a.v(kVar.f.b(walletId, loadingStrategy), new imk.e(3, incomeSorterIds))), rd0.e.b(whf.b.a(oVar.f218423q, te0.w.h(new s9(d0.i1(arrayList))), null, null, null, 14))));
    }
}
