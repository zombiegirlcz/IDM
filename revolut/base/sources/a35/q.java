package a35;

import com.google.common.collect.ImmutableMap;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uvl.c f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq3.j f1074c;

    public q(ImmutableMap productContractMap, uvl.c creditApplicationAccountInteractor, xq3.j creditApplicationInteractor) {
        Intrinsics.checkNotNullParameter(productContractMap, "productContractMap");
        Intrinsics.checkNotNullParameter(creditApplicationAccountInteractor, "creditApplicationAccountInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        this.f1072a = productContractMap;
        this.f1073b = creditApplicationAccountInteractor;
        this.f1074c = creditApplicationInteractor;
    }

    public final Flow a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new a2c.c(2, 1, null), nim.a.v(u0.i(c(loadingStrategy), b(loadingStrategy), nim.a.v(this.f1074c.i(w4l.j.f294644c), new b(6))), new a0.c(this, 14)));
    }

    public final vkm.f b(w4l.k kVar) {
        w4l.k kVar2 = w4l.j.f294644c;
        if (!kVar.equals(kVar2)) {
            kVar2 = w4l.i.f294643c;
        }
        jhi.k kVarT = this.f1073b.t(kVar2);
        Data data = new Data(f0.f322471a, null, false, 6, null);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return zi0.c.M(kVarT, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "CreditApplicationAccount.observeCreditApplicationAccounts");
    }

    public final akg.n c(w4l.k kVar) {
        Map map = this.f1072a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            akg.n nVarV = nim.a.v(((i) ((Map.Entry) it8.next()).getValue()).k(kVar), new b(3));
            od0.i.Companion.getClass();
            Data data = new Data(od0.i.f224256b, null, false, 6, null);
            b.Companion companion = kotlin.time.b.INSTANCE;
            arrayList.add(zi0.c.M(nVarV, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "CreditApplicationAccount.observeProducts"));
        }
        Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
        return nim.a.v(u0.l((Flow[]) Arrays.copyOf(flowArr, flowArr.length)), new b(4));
    }

    public final akg.n d() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(c(loadingStrategy), b(loadingStrategy)), new b(2));
    }
}
