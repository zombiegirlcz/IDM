package vvc;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o97.e0;
import o97.g0;
import o97.y;
import te0.w;
import tof.i7;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zkh.d0;
import zkh.z;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f292525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f292526c;

    public /* synthetic */ t(int i, Object obj2, int i2) {
        this.f292524a = i2;
        this.f292525b = i;
        this.f292526c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f292524a;
        Object obj3 = this.f292526c;
        int i2 = this.f292525b;
        switch (i) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, new d((GmsLatLngBounds) obj3), new m(i2), true, null, null, 24);
            case 1:
                xd7.g update2 = (xd7.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xd7.g.a(update2, Integer.valueOf(i2), (String) ((xd7.i) obj3).f304283p.f269936a.getOrDefault(i2, ""), 3);
            case 2:
                xoh.j jVar = (xoh.j) obj2;
                return xoh.j.a(jVar, null, null, r0.q(jVar.f307839c, new Pair((ScreenerAllFiltersFlowContract$Page) obj3, Integer.valueOf(i2))), null, false, false, 123);
            case 3:
                xsh.d updateState = (xsh.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return xsh.d.a((xsh.d) ((xsh.r) obj3).t2(), null, i2, 1);
            case 4:
                LargeActionButtonDelegate.Model it8 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr = PickerBottomSheetController.W;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (yp4.b) ((PickerBottomSheetController) obj3).O.f315783c.get(i2);
            case 5:
                i7 transactionFilter = (i7) obj2;
                Intrinsics.checkNotNullParameter(transactionFilter, "transactionFilter");
                return whf.b.a(((ys5.d) obj3).f316400c, w.h(transactionFilter), null, Integer.valueOf(i2 + 1), null, 10);
            default:
                d0 d0Var = (d0) obj3;
                o97.r rVar = d0Var.f322989g;
                List popularAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(popularAssets, "popularAssets");
                List<vel.f> listV0 = zhm.d0.V0(popularAssets, 3);
                ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
                for (vel.f fVar : listV0) {
                    arrayList.add(d0Var.f322988c.d(fVar, new y(rVar, new z(fVar), null, 60), new AnalyticsContext(o97.h.a(rVar, fVar.c()))));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList.isEmpty() ? zhm.u.c(new e0(f0.f322471a)) : v.k(new g0(new TextLocalisedClause(i2, null, null, 14), new TextLocalisedClause(R$string.search_block_header_see_all, null, null, 14), "SEARCH_POPULAR_ETFS_LIST_ID", new y(rVar, null, null, 62)), new e0(arrayList));
        }
    }

    public /* synthetic */ t(Object obj2, int i, int i2) {
        this.f292524a = i2;
        this.f292526c = obj2;
        this.f292525b = i;
    }
}
