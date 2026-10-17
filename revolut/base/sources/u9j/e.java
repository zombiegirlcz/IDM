package u9j;

import ip0.jm0;
import ip0.qi;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import u80.t;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements o9j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f278490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nwh.b f278491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f278492c;
    public final l80.e d;
    public final s9j.a e;
    public final Lazy f;

    public e(a itemsMapper, nwh.b dataMapper, t ratesMoneyUtils, l80.e dateProvider, s9j.a lineChartUtils) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(dataMapper, "dataMapper");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(lineChartUtils, "lineChartUtils");
        this.f278490a = itemsMapper;
        this.f278491b = dataMapper;
        this.f278492c = ratesMoneyUtils;
        this.d = dateProvider;
        this.e = lineChartUtils;
        this.f = yhm.j.b(new u9a.b(2));
    }

    public static List f(qta.d dVar, double d) {
        List list = dVar.e;
        if (list.isEmpty()) {
            return list;
        }
        Pair pair = (Pair) d0.m0(list);
        ArrayList arrayListF1 = d0.f1(list);
        arrayListF1.remove(v.j(arrayListF1));
        arrayListF1.add(Pair.a(pair, null, Double.valueOf(d), 1));
        return arrayListF1;
    }

    public final ArrayList c() {
        d dVar = (d) this.f278490a;
        jm0 jm0Var = (jm0) dVar.d.getValue();
        int length = ((qta.f[]) this.f.getValue()).length;
        dVar.getClass();
        return v.n(jm0Var, new qi("ASSET_DETAILS_CHART_TABS_LIST_ID", length));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p9j.a d(xi0.b r25, xi0.b r26, java.lang.Double r27, qta.f r28, com.revolut.core.ui_kit.delegates.TrendViewDelegate.a r29, com.revolut.data.model.Data r30, com.revolut.core.ui_kit.models.Clause r31, com.revolut.core.ui_kit_core.displayers.image.Image r32) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u9j.e.d(xi0.b, xi0.b, java.lang.Double, qta.f, com.revolut.core.ui_kit.delegates.TrendViewDelegate$a, com.revolut.data.model.Data, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit_core.displayers.image.Image):p9j.a");
    }

    public final qta.f e(String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        for (qta.f fVar : (qta.f[]) this.f.getValue()) {
            if (Intrinsics.f(fVar.name(), tabId)) {
                return fVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
