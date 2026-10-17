package g6j;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f140981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f140982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f140983c;
    public final q d;
    public final fsl.k e;
    public final pcj.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qzj.d f140984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1 f140985h;
    public final jxk.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n3h.e f140986j;
    public final CommodityAssetDetailsScreenContract$InputData k;

    public y(v lineChartMapper, a candleChartMapper, d chartPeriodsMapper, q investmentWidgetV2Mapper, fsl.k ordersWidgetMapper, pcj.c priceTargetsMapper, qzj.d topStoriesMapper, p commodityAssetDetailsContactUsMapper, q1 disclaimersMapper, jxk.f tradingHoursMapper, n3h.e automationsWidgetMapper, CommodityAssetDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(lineChartMapper, "lineChartMapper");
        Intrinsics.checkNotNullParameter(candleChartMapper, "candleChartMapper");
        Intrinsics.checkNotNullParameter(chartPeriodsMapper, "chartPeriodsMapper");
        Intrinsics.checkNotNullParameter(investmentWidgetV2Mapper, "investmentWidgetV2Mapper");
        Intrinsics.checkNotNullParameter(ordersWidgetMapper, "ordersWidgetMapper");
        Intrinsics.checkNotNullParameter(priceTargetsMapper, "priceTargetsMapper");
        Intrinsics.checkNotNullParameter(topStoriesMapper, "topStoriesMapper");
        Intrinsics.checkNotNullParameter(commodityAssetDetailsContactUsMapper, "commodityAssetDetailsContactUsMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(tradingHoursMapper, "tradingHoursMapper");
        Intrinsics.checkNotNullParameter(automationsWidgetMapper, "automationsWidgetMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f140981a = lineChartMapper;
        this.f140982b = candleChartMapper;
        this.f140983c = chartPeriodsMapper;
        this.d = investmentWidgetV2Mapper;
        this.e = ordersWidgetMapper;
        this.f = priceTargetsMapper;
        this.f140984g = topStoriesMapper;
        this.f140985h = disclaimersMapper;
        this.i = tradingHoursMapper;
        this.f140986j = automationsWidgetMapper;
        this.k = inputData;
    }

    public static MoneyClause a(Data data) {
        qta.c cVar = (qta.c) data.getContent();
        if (cVar != null) {
            return new MoneyClause(mif.a.Q(new ej0.b(cVar.f249048c, cVar.f249047b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // cli.n
    public final cli.o c(cli.j r42) {
        /*
            Method dump skipped, instruction units count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6j.y.c(cli.j):cli.o");
    }
}
