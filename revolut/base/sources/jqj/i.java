package jqj;

import com.revolut.retail.feature.impl.analytics_cycle.network.TransactionAnalyticsService;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import jec.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.n;
import skm.p0;
import tof.hc;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f177740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hc f177741c;

    public /* synthetic */ i(l lVar, hc hcVar, int i) {
        this.f177739a = i;
        this.f177740b = lVar;
        this.f177741c = hcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f177739a) {
            case 0:
                od0.i lastUpdateTime = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(lastUpdateTime, "lastUpdateTime");
                l lVar = this.f177740b;
                TransactionAnalyticsService transactionAnalyticsService = lVar.f177744b;
                Long l2 = (Long) lastUpdateTime.f224257a;
                hc hcVar = this.f177741c;
                d0<iqj.f> transactionsAnalyticsUpdates = transactionAnalyticsService.getTransactionsAnalyticsUpdates(l2, hcVar.f272790a);
                jof.a aVar = new jof.a(12, new i(lVar, hcVar, 1));
                transactionsAnalyticsUpdates.getClass();
                return new ufm.i(transactionsAnalyticsUpdates, aVar, 0);
            default:
                iqj.f it8 = (iqj.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List data = it8.getData();
                l lVar2 = this.f177740b;
                lVar2.getClass();
                pfm.h hVarN = pd.b.n(p0.f264003c, new p(data, lVar2, null, 26));
                List<iqj.e> data2 = it8.getData();
                ArrayList arrayList = new ArrayList();
                for (iqj.e eVar : data2) {
                    tof.f fVar = eVar.getCategory() != null ? new tof.f(eVar.getId(), eVar.getCategory()) : null;
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                return hVarN.e(pd.b.n(p0.f264003c, new p(lVar2, arrayList, null, 25))).e(new n(new a9j.k(lVar2, 14, this.f177741c, it8), 1)).f(d0.m(Boolean.valueOf(!it8.getData().isEmpty())));
        }
    }
}
