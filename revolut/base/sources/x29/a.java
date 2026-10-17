package x29;

import a0.d;
import a6f.g;
import a6f.h;
import a6f.i;
import aw0.bb;
import aw0.cb;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import com.revolut.feature.lifestyle.core.api.R$string;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_exchange.impl.ui.order_details.screen.OrderDetailsActivity;
import do3.n;
import dx4.a1;
import hw0.v;
import ip0.ak0;
import ip0.jm0;
import ip0.um0;
import ip0.yl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import nkm.y;
import p35.e0;
import p35.o0;
import p35.p0;
import p6f.f;
import x32.c;
import x42.e;
import x4e.l;
import x64.j;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302532a;

    public /* synthetic */ a(int i) {
        this.f302532a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a1 a1Var;
        int i = 3;
        boolean z = false;
        imageT1 = null;
        Image imageT1 = null;
        switch (this.f302532a) {
            case 0:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                List list = user.v;
                if ((list != null ? list.size() : 0) > 1) {
                    Address address = user.k;
                    if ((address != null ? address.getCountry() : 0) != 0) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                n user2 = (n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                wi0.a aVar = wi0.b.Companion;
                Address address2 = user2.k;
                String country = address2 != null ? address2.getCountry() : null;
                if (country == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar.getClass();
                TextDelegate.Model model = new TextDelegate.Model("BORDERLESS_FOOTER_ITEM_ID", new TextLocalisedClause(R$string.borderless_footer_text, u.c(new CountryClause(wi0.a.a(country), null)), null, 12), false, new ak0(, , i), null, null, 0, 0, 0, 0, 2036);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                return model;
            case 2:
                h3g.a updateAnswer = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer, "$this$updateAnswer");
                return updateAnswer.b();
            case 3:
                um0 it8 = (um0) obj2;
                int i2 = OrderDetailsActivity.E0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 4:
                um0 it9 = (um0) obj2;
                int i3 = OrderDetailsActivity.E0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 5:
                LargeActionButtonDelegate.Model it10 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f52613a, "CRYPTO_PRICE_EXPLANATION_BUTTON_ID"));
            case 6:
                CellDetailsActionDelegate.Model it11 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(Intrinsics.f(it11.f51781a, "EXCHANGE_FEE"));
            case 7:
                CellDetailsActionDelegate.Model it12 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f51781a, "FEE_BREAKDOWN_ITEM_LIST_ID"));
            case 8:
                CellDetailsActionDelegate.Model it13 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f51781a, "CURRENT_PRICE_ID"));
            case 9:
                c it14 = (c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f302622a;
            case 10:
                MatchResult it15 = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return d.r(it15.getValue(), " ");
            case 11:
                RowDelegate.Model it16 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransferSettingsScreen.T;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.u;
                if (obj3 instanceof x42.c) {
                    return (x42.c) obj3;
                }
                return null;
            case 12:
                x42.a update = (x42.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return x42.a.a(update, new x42.d(!update.f302772a.f302778c), null, null, 6);
            case 13:
                x42.a update2 = (x42.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return x42.a.a(update2, null, new e(!update2.f302773b.f302779c), null, 5);
            case 14:
                Pair pair = (Pair) obj2;
                du3.d dVar = (du3.d) pair.f186385a;
                AgreementsScreenConfig agreementsScreenConfig = (AgreementsScreenConfig) pair.f186386b;
                ArrayList arrayList = dVar.f117561a;
                TextClause textClause = new TextClause(dVar.f117563c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                du3.c cVar = dVar.d;
                TextClause textClause2 = cVar != null ? new TextClause(cVar.f117560b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                if (cVar != null && (a1Var = cVar.f117559a) != null) {
                    imageT1 = a1Var.T1();
                }
                Image image = imageT1;
                TextClause textClause3 = new TextClause(dVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = dVar.f117562b;
                return new CreditApplicationDocumentsScreenContract$Configuration(arrayList, textClause, textClause2, image, textClause3, str != null ? new AgreementsScreenConfig.Disclaimer(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.feature.credit.application.plugins.api.models.config.a.ALWAYS) : agreementsScreenConfig.f66331a, new TextClause(dVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 15:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "pair");
                return com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) pair2.f186385a).f306286a, "-", ((xi0.b) pair2.f186386b).f306286a);
            case 16:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : rates) {
                    if (!Intrinsics.f(((qta.c) obj4).f249048c, x46.b.f)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 17:
                jel.c it17 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                if (it17 instanceof w2) {
                    return (w2) it17;
                }
                return null;
            case 18:
                Function0 it18 = (Function0) obj2;
                l.a aVar2 = l.Companion;
                Intrinsics.checkNotNullParameter(it18, "it");
                yl ylVar = new yl("note_payout_chart_header", 0, 30);
                cb.Companion.getClass();
                jm0 jm0Var = new jm0("note_payout_chart", bb.c(), null, false, null, null, 0, true, 300, null, false, false, null, null, null, null, u.c(new hw0.u(BitmapDescriptorFactory.HUE_RED, v.DASHED)), null, null, null, 0, 0, 0, 0, -66000);
                yp0.b.r(jm0Var, 0, 0, 0, 0, 15);
                return zhm.v.k(ylVar, jm0Var, l.a());
            case 19:
                e0 it19 = (e0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return y.J(y.x(y.n(d0.Q(it19.O), new a(20)), new a(21)));
            case 20:
                o0 source = (o0) obj2;
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.f232663b == p0.DISABLED && source.f != null && source.e != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                o0 source2 = (o0) obj2;
                Intrinsics.checkNotNullParameter(source2, "source");
                String str2 = source2.f232664c;
                String str3 = source2.f;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = source2.e;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = source2.f232665g;
                return new dz4.a(str2, str3, str4, str5 != null ? str5 : "");
            case 22:
                return ((vdh.b) obj2).e;
            case 23:
                i it20 = (i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                List listA = it20.a();
                ArrayList allocations = new ArrayList();
                for (Object obj5 : listA) {
                    if (((AssetSubclassAllocation) obj5).getF95688a().compareTo(BigDecimal.ZERO) > 0) {
                        allocations.add(obj5);
                    }
                }
                List listC = it20.c();
                ArrayList sectorAllocations = new ArrayList();
                for (Object obj6 : listC) {
                    if (((SectorSubclassAllocation) obj6).f95694b.compareTo(BigDecimal.ZERO) > 0) {
                        sectorAllocations.add(obj6);
                    }
                }
                List listB = it20.b();
                ArrayList regionAllocations = new ArrayList();
                for (Object obj7 : listB) {
                    if (((RegionSubclassAllocation) obj7).f95692b.compareTo(BigDecimal.ZERO) > 0) {
                        regionAllocations.add(obj7);
                    }
                }
                List listD = it20.d();
                ArrayList topHoldingAllocations = new ArrayList();
                for (Object obj8 : listD) {
                    if (((TopHoldingSubclassAllocation) obj8).f95696b.compareTo(BigDecimal.ZERO) > 0) {
                        topHoldingAllocations.add(obj8);
                    }
                }
                if (it20 instanceof g) {
                    alc.n portfolio = ((g) it20).e;
                    Intrinsics.checkNotNullParameter(allocations, "allocations");
                    Intrinsics.checkNotNullParameter(sectorAllocations, "sectorAllocations");
                    Intrinsics.checkNotNullParameter(regionAllocations, "regionAllocations");
                    Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
                    Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                    return new g(allocations, sectorAllocations, regionAllocations, topHoldingAllocations, portfolio);
                }
                if (!(it20 instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(allocations, "allocations");
                Intrinsics.checkNotNullParameter(sectorAllocations, "sectorAllocations");
                Intrinsics.checkNotNullParameter(regionAllocations, "regionAllocations");
                Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
                return new h(allocations, sectorAllocations, regionAllocations, topHoldingAllocations);
            case 24:
                Template template = (Template) obj2;
                Intrinsics.checkNotNullParameter(template, "template");
                List list2 = template.f;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                List list3 = template.f95709g;
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                List list4 = template.f95710h;
                if (list4 == null) {
                    list4 = f0.f322471a;
                }
                List list5 = template.i;
                if (list5 == null) {
                    list5 = f0.f322471a;
                }
                return new h(list2, list3, list4, list5);
            case 25:
                PerformanceChart performanceChart = (PerformanceChart) obj2;
                Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
                List<PerformanceChartPoint> list6 = performanceChart.f94993c;
                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                for (PerformanceChartPoint performanceChartPoint : list6) {
                    long millis = performanceChartPoint.f94994a.getMillis();
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(performanceChartPoint.f94996c));
                    BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(performanceChartPoint.f94995b));
                    Float f = performanceChartPoint.d;
                    arrayList3.add(new p6f.a(millis, bigDecimal, bigDecimal2, f != null ? new BigDecimal(String.valueOf(f.floatValue())) : null));
                }
                return new p6f.d(arrayList3);
            case 26:
                pdh.b performanceChart2 = (pdh.b) obj2;
                Intrinsics.checkNotNullParameter(performanceChart2, "performanceChart");
                ArrayList<pdh.a> arrayList4 = performanceChart2.d;
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                for (pdh.a aVar3 : arrayList4) {
                    arrayList5.add(new p6f.a(aVar3.f235227a.getMillis(), aVar3.f235229c, aVar3.f235228b, aVar3.d));
                }
                return new p6f.d(arrayList5);
            case 27:
                TotalValueChart totalValueChart = (TotalValueChart) obj2;
                long millis2 = totalValueChart.f95002a.getMillis();
                long millis3 = totalValueChart.f95003b.getMillis();
                List<TotalValueChartPoint> list7 = totalValueChart.f95004c;
                ArrayList arrayList6 = new ArrayList(w.t(list7, 10));
                for (TotalValueChartPoint totalValueChartPoint : list7) {
                    arrayList6.add(new p6f.b(totalValueChartPoint.f95005a.getMillis(), totalValueChartPoint.f95006b, totalValueChartPoint.f95007c));
                }
                return new f(millis2, millis3, totalValueChart.d, totalValueChart.e, arrayList6);
            case 28:
                j update3 = (j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return j.a(update3, null, null, 3);
            default:
                j update4 = (j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return j.a(update4, null, Data.copy$default(update4.f303040b, null, null, true, 3, null), 5);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f302532a = i;
    }
}
