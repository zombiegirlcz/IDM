package s57;

import aw0.ja;
import aw0.ka;
import aw0.o9;
import cgc.o;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.FullScreenStateWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.o3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.youTransactor.uCube.rpc.Constants;
import ct6.w;
import do3.n;
import ds6.z;
import et6.l0;
import ip0.yn0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import op0.q;
import org.jmrtd.lds.LDSFile;
import yhm.r;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f260008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f260009c;

    public /* synthetic */ a(m mVar, String str, int i) {
        this.f260007a = i;
        this.f260008b = mVar;
        this.f260009c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        char c2;
        RowDelegate.Model.c pfVar;
        RowDelegate.Model model;
        int i = this.f260007a;
        String widgetId = this.f260009c;
        m mVar = this.f260008b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return mVar.f260037l.b(widgetId);
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return mVar.f260037l.b(widgetId);
            case 2:
                iia.a data = (iia.a) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                z57.c cVar = mVar.k;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(data, "data");
                LineChartResizableTileDelegate.Model modelA = ((end.a) cVar.f319526a).a(data.f161595a, data.f161596b, null, AnalyticsAccount.Pro.All.f99196a, dmd.a.POSITIVE_SURPLUS_TREND);
                return LineChartTileWidgetDelegate.Model.Companion.a(LineChartTileWidgetDelegate.Model.INSTANCE, widgetId, LineChartResizableTileDelegate.Model.e(modelA, ja.a(modelA.f52645c, new TextLocalisedClause(R$string.freelancer_sales_this_month_widget_header_title, null, null, 14)), 3670011));
            case 3:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                z57.c cVar2 = mVar.k;
                String widgetId2 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId2, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId2, null, new TextLocalisedClause(R$string.freelancer_widget_sales_analytics_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 4:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                b67.f fVar = mVar.f260039n;
                String widgetId3 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId3, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId3, null, new TextLocalisedClause(R$string.freelancer_widget_toolbox_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 5:
                FreelancerAccountOnboardingState accountState = (FreelancerAccountOnboardingState) obj2;
                Intrinsics.checkNotNullParameter(accountState, "accountState");
                if (!(accountState instanceof FreelancerAccountOnboardingState.Pending)) {
                    return nim.a.v(((ugc.g) mVar.u).g(o.PRO, w4l.i.f294643c), new a(mVar, widgetId, 11));
                }
                w57.d dVar = mVar.f260041q;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                return new go.g(zi0.c.P(FullScreenStateWidgetDelegate.Model.Companion.a(FullScreenStateWidgetDelegate.Model.INSTANCE, widgetId, new BaseDynamicWidgetDelegate.BigHeaderModel("ITEM_ID_PRO_PERKS_PENDING_HEADER", w.a(), null, false, FreelancerWidgetClickData.ProPerks.AllPerks.f74453a, 40), new FullScreenStateDelegate.Model("LIST_ID_PENDING_PERKS", new TextLocalisedClause(R$string.freelancer_perks_widget_pending_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_perks_widget_pending_subtitle, null, null, 14), new ComplexImage.Regular(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_price_tag, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48)), null, zj.SMALL, false, null, null, null, 1984), 24), false, null, 3), 2);
            case 6:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                w57.d dVar2 = mVar.f260041q;
                String widgetId4 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId4, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId4, null, new TextLocalisedClause(R$string.freelancer_perks_widget_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 7:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return mVar.e.a(widgetId);
            case 8:
                iia.a data2 = (iia.a) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                z57.c cVar3 = mVar.k;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(data2, "data");
                LineChartResizableTileDelegate.Model modelB = ((end.a) cVar3.f319526a).b(data2.f161595a, data2.f161596b, null, AnalyticsAccount.Pro.All.f99196a, dmd.a.POSITIVE_SURPLUS_TREND);
                return LineChartTileWidgetDelegate.Model.Companion.b(LineChartTileWidgetDelegate.Model.INSTANCE, widgetId, LineChartResizableTileDelegate.Model.e(modelB, ja.a(modelB.f52645c, new TextLocalisedClause(R$string.freelancer_sales_this_month_widget_header_title, null, null, 14)), 3670011));
            case 9:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return mVar.e.a(widgetId);
            case 10:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                x57.g gVar = mVar.f260035h;
                String widgetId5 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId5, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId5, null, new TextLocalisedClause(R$string.freelancer_widget_pockets_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 11:
                boolean z = false;
                List perks = (List) obj2;
                Intrinsics.checkNotNullParameter(perks, "perks");
                w57.d dVar3 = mVar.f260041q;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(perks, "perks");
                boolean zIsEmpty = perks.isEmpty();
                FreelancerWidgetClickData.ProPerks.AllPerks allPerks = FreelancerWidgetClickData.ProPerks.AllPerks.f74453a;
                if (zIsEmpty) {
                    return FullScreenStateWidgetDelegate.Model.Companion.a(FullScreenStateWidgetDelegate.Model.INSTANCE, widgetId, new BaseDynamicWidgetDelegate.BigHeaderModel("ITEM_ID_PRO_PERKS_EMPTY_HEADER", w.a(), null, false, allPerks, 40), dVar3.f294725b.a(), 24);
                }
                List<cgc.c> listV0 = d0.V0(perks, 3);
                ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
                for (cgc.c cVar4 : listV0) {
                    cgc.l lVar = cVar4.f23909c;
                    String str = lVar.f23919b;
                    cgc.j jVar = cVar4.d;
                    cgc.e eVar = cVar4.e;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    boolean zF = Intrinsics.f(eVar.f23910a, "PERK_DETAILS");
                    String str2 = eVar.f23911b;
                    yn0 yn0Var = new yn0(R$attr.uikit_dp0, ((sic.d) dVar3.f294724a).a(str2.hashCode(), jVar.d), null);
                    TextClause textClause = new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = jVar.f23915a;
                    TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String str4 = lVar.f23920c;
                    arrayList.add(new VoucherExtraSmallTileDelegate.Model(str2, yn0Var, textClause, textClause2, null, str4 != null ? new UrlImage(str4, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, z, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902) : null, (!zF || str == null) ? null : new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE)), zF ? new FreelancerWidgetClickData.ProPerks.Perk(str2) : allPerks, 208));
                    z = false;
                }
                return TileGridWidgetDelegate.Model.Companion.b(TileGridWidgetDelegate.Model.INSTANCE, widgetId, w.a(), arrayList, 8);
            case 12:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                z57.c cVar5 = mVar.k;
                String widgetId6 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId6, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId6, null, new TextLocalisedClause(R$string.freelancer_widget_sales_analytics_error_title, null, null, 14), w.b(), q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 13:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                ds6.k taxTypeInfo = (ds6.k) rVar.f314201a;
                List calendarEvents = (List) rVar.f314202b;
                n nVar = (n) rVar.f314203c;
                a67.f fVar2 = mVar.f260040p;
                wi0.b countryCode = do3.q.y(nVar);
                ft6.w wVar = fVar2.f1556a;
                String widgetId7 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId7, "widgetId");
                Intrinsics.checkNotNullParameter(calendarEvents, "calendarEvents");
                Intrinsics.checkNotNullParameter(taxTypeInfo, "taxTypeInfo");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                boolean zIsEmpty2 = taxTypeInfo.f117243a.isEmpty();
                FreelancerWidgetClickData.TaxHub.C0496TaxHub c0496TaxHub = FreelancerWidgetClickData.TaxHub.C0496TaxHub.f74461a;
                if (zIsEmpty2) {
                    return FullScreenStateWidgetDelegate.Model.Companion.a(FullScreenStateWidgetDelegate.Model.INSTANCE, widgetId7, new BaseDynamicWidgetDelegate.BigHeaderModel("LIST_ID_WIDGET_HEADER", new TextLocalisedClause(R$string.freelancer_tax_hub_hub_title, null, null, 14), null, false, c0496TaxHub, 40), wVar.a(new FreelancerWidgetClickData.TaxHub.TaxProfile(taxTypeInfo.d)), 8);
                }
                return calendarEvents.isEmpty() ? RowsWidgetDelegate.Model.Companion.a(RowsWidgetDelegate.Model.INSTANCE, widgetId7, new TextLocalisedClause(R$string.freelancer_tax_hub_hub_title, null, null, 14), u.c(wVar.c()), false, null, SyslogConstants.LOG_CLOCK) : CalendarListWidgetDelegate.Model.Companion.a(CalendarListWidgetDelegate.Model.INSTANCE, widgetId7, new BaseDynamicWidgetDelegate.BigHeaderModel("LIST_ID_WIDGET_HEADER", new TextLocalisedClause(R$string.freelancer_tax_hub_hub_title, null, null, 14), null, false, c0496TaxHub, 40), wVar.b(calendarEvents, countryCode, new a5g.h(6)), null, 24);
            case 14:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                a67.f fVar3 = mVar.f260040p;
                String widgetId8 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId8, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId8, null, new TextLocalisedClause(R$string.freelancer_widget_tax_hub_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 15:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                x57.g gVar2 = mVar.f260035h;
                String widgetId9 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId9, "widgetId");
                return new ErrorWidgetDelegate.Model(widgetId9, null, new TextLocalisedClause(R$string.freelancer_widget_pockets_error_title, null, null, 14), w.b(), q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 16:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar = (od0.i) pair.f186385a;
                od0.i iVar2 = (od0.i) pair.f186386b;
                c67.d dVar4 = mVar.o;
                es6.d dVar5 = (es6.d) iVar.f224257a;
                z zVar = (z) iVar2.f224257a;
                FreelancerTaxProfile freelancerTaxProfile = zVar != null ? zVar.f117257b : null;
                TaxHubVatSummary taxHubVatSummary = zVar != null ? zVar.f117256a : null;
                String widgetId10 = this.f260009c;
                Intrinsics.checkNotNullParameter(widgetId10, "widgetId");
                if (dVar5 == null) {
                    return dVar4.a(widgetId10);
                }
                es6.b bVar = dVar5.d;
                RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_header_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_item_reminder_title, null, null, 14);
                Clause textLocalisedClause3 = (freelancerTaxProfile == null || !freelancerTaxProfile.d) ? new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_item_reminder_subtitle_disabled, null, null, 14) : taxHubVatSummary != null ? new TimeClause(oc.c.F(taxHubVatSummary.f73491c), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12) : null;
                int i2 = R$drawable.uikit_icn_24_calendar_week;
                LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion2, i2, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 62);
                if (freelancerTaxProfile == null || !freelancerTaxProfile.d) {
                    c2 = 0;
                    pfVar = new pf(new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_item_reminder_action_set, null, null, 14), null, null, false, null, null, 510);
                } else {
                    c2 = 0;
                    pfVar = new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                }
                RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_VAT_RETURN_ITEM", image40, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, pfVar, (freelancerTaxProfile == null || !freelancerTaxProfile.d) ? c2 : 1, null, false, null, null, null, null, null, null, freelancerTaxProfile == null ? FreelancerWidgetClickData.VatReminder.CreateVatProfile.f74478a : new FreelancerWidgetClickData.VatReminder.NotificationToggle(freelancerTaxProfile.f73474a), null, 0, 0, 0, 0, 532673496);
                if (freelancerTaxProfile == null || !freelancerTaxProfile.d) {
                    model = null;
                } else {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_item_estimation_title, null, null, 14);
                    ImageClause imageClause = taxHubVatSummary != null ? new ImageClause(R$drawable.uikit_icn_24_info_legacy, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28) : null;
                    Clause[] elements = new Clause[2];
                    elements[c2] = textLocalisedClause4;
                    elements[1] = imageClause;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    t0 t0Var = t0.f186434a;
                    m70.a.t(t0Var);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    CompositeClause compositeClauseM = yoj.b.m(new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL);
                    es6.b bVar2 = es6.b.DISABLED;
                    model = new RowDelegate.Model("LIST_ID_ESTIMATED_VAT_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion2, R$drawable.uikit_icn_24_percent, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 62), compositeClauseM, null, 0, bVar == bVar2 ? new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_item_estimation_tax_sorter_not_set, null, null, 14) : taxHubVatSummary != null ? new MoneyClause(taxHubVatSummary.f73490b.f73494c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, bVar == bVar2 ? FreelancerWidgetClickData.VatReminder.SetUpTaxSorter.f74480a : taxHubVatSummary != null ? new FreelancerWidgetClickData.VatReminder.VatSummary(bVar, taxHubVatSummary) : null, null, 0, 0, 0, 0, 532676568);
                }
                RowDelegate.Model[] elements2 = {model2, model};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return RowsWidgetDelegate.Model.Companion.a(companion, widgetId10, textLocalisedClause, kotlin.collections.d.L(elements2), false, ((l0) dVar4.f21693a).b("FREELANCER_TAX_HUB") ? new o3(new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_item_tax_hub_access_tax_hub, null, null, 14), FreelancerWidgetClickData.VatReminder.TaxHub.f74481a) : null, 96);
            default:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return mVar.o.a(widgetId);
        }
    }
}
