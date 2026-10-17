package zkh;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f323018b;

    public /* synthetic */ m0(o0 o0Var, int i) {
        this.f323017a = i;
        this.f323018b = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f323017a;
        o0 o0Var = this.f323018b;
        switch (i) {
            case 0:
                Data widgetData = (Data) obj2;
                Intrinsics.checkNotNullParameter(widgetData, "it");
                dlh.a aVar = o0Var.f323021a;
                m0 parcelBuilder = new m0(o0Var, 1);
                m0 analyticsContextProvider = new m0(o0Var, 2);
                Intrinsics.checkNotNullParameter(widgetData, "widgetData");
                Intrinsics.checkNotNullParameter(parcelBuilder, "parcelBuilder");
                Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
                return zi0.c.P(zhm.v.k(new o97.f0(new TextLocalisedClause(R$string.search_block_recently_viewed_name, null, null, 14), "SEARCH_RECENTLY_VIEW_LIST_ID"), new o97.e0((List) iii.c.f(widgetData, new dkk.m(aVar, 24), new dee.a0(26), new a0i.a(aVar, 10, parcelBuilder, analyticsContextProvider)))), false, null, 3);
            case 1:
                vel.f asset = (vel.f) obj2;
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new o97.y(o0Var.d, asset, null, 60);
            default:
                vel.f asset2 = (vel.f) obj2;
                Intrinsics.checkNotNullParameter(asset2, "asset");
                return new AnalyticsContext(o97.h.a(o0Var.d, asset2.c()));
        }
    }
}
