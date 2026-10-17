package hu1;

import com.revolut.feature.credit.application.plugins.api.models.config.ScreenConfig;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import ip0.s7;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import my0.g;
import my0.k;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155526a;

    public /* synthetic */ h0(int i) {
        this.f155526a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f155526a) {
            case 0:
                my0.c create = (my0.c) it8;
                Intrinsics.checkNotNullParameter(create, "$this$create");
                create.f210283c = k.a.f210294a;
                create.f210281a = new g.a(2, false);
                break;
            case 1:
                gu5.a it9 = (gu5.a) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 2:
                gu5.a it10 = (gu5.a) it8;
                Intrinsics.checkNotNullParameter(it10, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                break;
            case 4:
                hud.i it11 = (hud.i) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            case 5:
                hud.i it12 = (hud.i) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                io3.d dVar = it12.f155627g;
                if (dVar != null) {
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                IntRange intRangeU = t61.a.u((Function0) it8, "it", 1, 5, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it13 = intRangeU.iterator();
                while (it13.f289625c) {
                    arrayList.add(new s7(a0.d.n("EXCHANGE_CELLS_LOADING_LIST_ID_", it13.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                break;
            case 9:
                hui.k it14 = (hui.k) it8;
                Intrinsics.checkNotNullParameter(it14, "it");
                break;
            case 10:
                hui.k it15 = (hui.k) it8;
                Intrinsics.checkNotNullParameter(it15, "it");
                AsftConfig asftConfig = (AsftConfig) it15.d.getContent();
                if (asftConfig != null) {
                }
                break;
            case 11:
                hul.h update = (hul.h) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            case 12:
                jel.c it16 = (jel.c) it8;
                Intrinsics.checkNotNullParameter(it16, "it");
                break;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                break;
            case 14:
                OrderQuoteResult it17 = (OrderQuoteResult) it8;
                Intrinsics.checkNotNullParameter(it17, "it");
                break;
            case 15:
                hul.h it18 = (hul.h) it8;
                Intrinsics.checkNotNullParameter(it18, "it");
                break;
            case 16:
                hul.h it19 = (hul.h) it8;
                Intrinsics.checkNotNullParameter(it19, "it");
                break;
            case 17:
                hul.h update2 = (hul.h) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                break;
            case 18:
                SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) it8;
                Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
                if (sourcePocketWrapper.b()) {
                }
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                Intrinsics.checkNotNullParameter((hve.a) it8, "<unused var>");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 24:
                Throwable it20 = (Throwable) it8;
                Intrinsics.checkNotNullParameter(it20, "it");
                break;
            case 25:
                ScreenConfig it21 = (ScreenConfig) it8;
                Intrinsics.checkNotNullParameter(it21, "it");
                break;
            case 26:
                eh0.a it22 = (eh0.a) it8;
                Intrinsics.checkNotNullParameter(it22, "it");
                String strJ = ((di0.a) it22).f114860a.j();
                Intrinsics.checkNotNullExpressionValue(strJ, "getText(...)");
                break;
            case 27:
                eh0.a it23 = (eh0.a) it8;
                Intrinsics.checkNotNullParameter(it23, "it");
                String strJ2 = ((di0.a) it23).f114860a.j();
                Intrinsics.checkNotNullExpressionValue(strJ2, "getText(...)");
                break;
            case 28:
                break;
            default:
                break;
        }
        return yt8.i.NONE;
    }

    public /* synthetic */ h0(hud.r rVar) {
        this.f155526a = 8;
    }
}
