package gna;

import android.os.Parcelable;
import aw0.j0;
import aw0.ka;
import aw0.o9;
import aw0.u0;
import aw0.y4;
import bnf.o;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.SpareChangeAmount;
import com.revolut.feature.rev_points.models.SpareChangeCalculation;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestStep;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.retail.feature.limits.api.LimitsApi$Toggles$MexicoHideAtmLimits;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import dej.o2;
import gs2.a0;
import gs2.w;
import gtd.t;
import h2c.x;
import h3b.z;
import hbf.b0;
import ip0.ak0;
import ip0.v7;
import ip0.xk;
import ip0.yj0;
import ip0.zj;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jtd.k;
import jtd.l;
import jtd.m;
import jtd.n;
import jtd.p;
import jtd.q;
import jtd.r;
import jtd.s;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import m1c.i0;
import m1c.l0;
import ms0.h4;
import nkm.y;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import yp0.e0;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zw7.m0;
import zw7.n0;
import zw7.p0;
import zw7.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f144949b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f144948a = i;
        this.f144949b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gna.i.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        a0 a0Var = (a0) this.f144949b;
        List merchants = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(merchants, "merchants");
        if (merchants.isEmpty()) {
            return u.c((RowDelegate.Model) a0Var.f146277h.getValue());
        }
        List<kr2.e> listP0 = d0.P0(merchants, new w());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (kr2.e eVar : listP0) {
            String str = eVar.f188643a;
            String str2 = eVar.f188645c;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(((o) a0Var.f146274b).q(eVar.d, eVar.f), (LayeredImage) a0Var.f.getValue(), null, false, 28), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, a0.c(oi0.d.W(eVar.e)), null, null, 0, null, false, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532676568));
        }
        return arrayList;
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model modelC;
        gsa.c cVar = (gsa.c) this.f144949b;
        List<iy9.b> settingsContent = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(settingsContent, "settingsContent");
        if (settingsContent.isEmpty()) {
            return null;
        }
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model("ITEM_ID_SETTINGS_HEADER", null, new TextLocalisedClause(R.string.common_action_settings, null, null, 14), null, null, null, j0.TRANSPARENT, null, null, false, false, null, null, R$attr.uikit_dp16, R$attr.uikit_dp12, 0, 0, 13631418));
        ArrayList arrayList = new ArrayList();
        for (iy9.b bVar : settingsContent) {
            if (gsa.b.f146349a[bVar.f169640a.ordinal()] == 1) {
                modelC = ((bqf.e) cVar.f146352c).c(bVar, R$string.payments_recipient_settings_two_fa_description, new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
                yp0.b.l(modelC, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
            } else {
                modelC = null;
            }
            if (modelC != null) {
                arrayList.add(modelC);
            }
        }
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj2, Object obj3, Object obj4) {
        Collection collectionI;
        int i;
        int i2;
        Collection collectionG;
        RowDelegate.Model modelA;
        m mVar;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ProgressStyle progressStyleC;
        t tVar = (t) this.f144949b;
        gtd.c content = (gtd.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        List list = content.e;
        itd.c cVar = tVar.f146601a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            int i3 = 14;
            if (!it8.hasNext()) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                gtd.a currentTrip = content.f;
                if (currentTrip != null) {
                    Intrinsics.checkNotNullParameter(currentTrip, "currentTrip");
                    dj0.d dVar = currentTrip.f146575b;
                    TextLocalisedClause textLocalisedClause3 = !dVar.k() ? new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_current_trip_total_spent, u.c(new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_current_trip_title, null, null, 14);
                    RowDelegate.Model model = new RowDelegate.Model("CURRENT_TRIP_ID", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_globe, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, textLocalisedClause3, !dVar.k() ? new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_current_trip_avg_per_day, u.c(new MoneyClause(pyd.c.k(dVar, currentTrip.f146576c).a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_current_trip_subtitle, null, null, 14), null, null, 0, new tf(new yy0.h(textLocalisedClause3, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, false, null, null, null, null, null, currentTrip, null, 0, 0, 0, 0, 1056962412);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(model);
                }
                ArrayList<jtd.f> products = content.f146580c;
                String countryName = content.f146578a;
                Intrinsics.checkNotNullParameter(products, "products");
                Intrinsics.checkNotNullParameter(countryName, "countryName");
                if (products.isEmpty()) {
                    collectionI = f0.f322471a;
                } else {
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(products, 10));
                    for (jtd.f fVar : products) {
                        if (Intrinsics.f(fVar, jtd.e.f178477a)) {
                            i = R$drawable.uikit_icn_24_resort;
                            i2 = com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_lifestyle_stays;
                        } else if (Intrinsics.f(fVar, jtd.b.f178474a)) {
                            i = R$drawable.uikit_icn_24_voucher;
                            i2 = com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_lifestyle_experiences;
                        } else if (Intrinsics.f(fVar, jtd.d.f178476a)) {
                            i = R$drawable.uikit_icn_24_lounges;
                            i2 = com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_lifestyle_lounges;
                        } else {
                            if (!Intrinsics.f(fVar, jtd.c.f178475a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$drawable.uikit_icn_24_insurance;
                            i2 = com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_lifestyle_insurances;
                        }
                        arrayList2.add(new IconDelegate.Model(fVar.toString(), LayeredImage.Companion.p(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 12.0f, 32.0f), new TextLocalisedClause(i2, null, null, 14), null, null, null, fVar, null, 712));
                    }
                    collectionI = yp0.b.i(new xk("LIFESTYLE_GRID_ID", arrayList2, null, null, null, 60), new ListSubheaderDelegate.Model("LIFESTYLE_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_lifestyle_title, u.c(countryName), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                }
                eVarB.addAll(collectionI);
                List list2 = content.d;
                if (list2.isEmpty()) {
                    collectionG = f0.f322471a;
                } else {
                    List<jtd.a> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    for (jtd.a aVar : list3) {
                        arrayList3.add(new InputDisclosureDelegate.Model(aVar.f178473b, new TextLocalisedClause(aVar.f178472a, null, null, 14), null, aVar, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
                    }
                    collectionG = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("INFO_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_info_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                }
                eVarB.addAll(collectionG);
                return new gtd.h(u.a(eVarB), new gtd.e(new TextClause(content.f146578a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(content.f146579b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)));
            }
            jtd.u tool = (jtd.u) it8.next();
            Intrinsics.checkNotNullParameter(tool, "tool");
            if (tool instanceof p) {
                p pVar = (p) tool;
                if (pVar instanceof m) {
                    String strC = itd.c.c(pVar);
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_title_use, null, null, 14);
                    m mVar2 = (m) pVar;
                    l lVar = mVar2.f178484a;
                    boolean z = lVar instanceof jtd.j;
                    k kVar = k.f178483a;
                    if (z) {
                        mVar = mVar2;
                        textLocalisedClause = textLocalisedClause4;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_subtitle_use, u.c(gej.a.a(cVar.f168364a, ((jtd.j) lVar).f178481a, null, 6)), null, 12);
                    } else {
                        mVar = mVar2;
                        textLocalisedClause = textLocalisedClause4;
                        if (!lVar.equals(kVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_subtitle_unlimited, null, null, 14);
                    }
                    LayeredImage layeredImageB = itd.c.b(R$drawable.uikit_icn_24_sim_card);
                    if (z) {
                        progressStyleC = ProgressStyle.Companion.c(ProgressStyle.INSTANCE, ((jtd.j) lVar).f178482b, R$attr.uikit_colorAccent);
                    } else {
                        if (!lVar.equals(kVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        progressStyleC = null;
                    }
                    modelA = itd.c.a(strC, textLocalisedClause, textLocalisedClause2, layeredImageB, progressStyleC, mVar);
                } else if (pVar instanceof n) {
                    String strC2 = itd.c.c(pVar);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_title_activate, null, null, 14);
                    hha.d dVar2 = ((n) pVar).f178485a;
                    modelA = itd.c.a(strC2, textLocalisedClause5, dVar2 != null ? new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_subtitle_plan_included, u.c(egk.e.a(cVar.f168365b, dVar2)), null, 12) : null, itd.c.b(R$drawable.uikit_icn_24_sim_card), null, pVar);
                } else {
                    if (!(pVar instanceof jtd.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modelA = itd.c.a(itd.c.c(pVar), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_title_get, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_esim_subtitle_get, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_sim_card), null, pVar);
                }
            } else if (tool instanceof q) {
                q qVar = (q) tool;
                modelA = itd.c.a(itd.c.c(tool), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_exchangeRate_title, null, null, 14), new CompositeClause(v.k(new MoneyClause(qVar.f178489c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(qVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new PairedImage(new CurrencyImage(qVar.f178487a.f306286a, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), i3), new CurrencyImage(qVar.f178488b.f306286a, (ImageTransformations) (0 == true ? 1 : 0), (TextLocalisedClause) (0 == true ? 1 : 0), i3), R$attr.uikit_colorWidgetBackground, null), null, tool);
            } else if (Intrinsics.f(tool, s.f178491a)) {
                modelA = itd.c.a(itd.c.c(tool), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_splitBill_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_splitBill_subtitle, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_people), null, tool);
            } else if (Intrinsics.f(tool, jtd.t.f178492a)) {
                modelA = itd.c.a(itd.c.c(tool), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_transportHubs_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_transportHubs_subtitle, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_transport), null, tool);
            } else if (tool instanceof jtd.h) {
                String strC3 = itd.c.c(tool);
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_atm_title, null, null, 14);
                wi0.b bVar = ((jtd.h) tool).f178479a;
                wi0.b.Companion.getClass();
                modelA = itd.c.a(strC3, textLocalisedClause6, bVar.equals(wi0.b.f297750h0) ? new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_atm_subtitle_no_fees, null, null, 14) : new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_atm_subtitle, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_map_point), null, tool);
            } else if (Intrinsics.f(tool, jtd.i.f178480a)) {
                modelA = itd.c.a(itd.c.c(tool), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_bizum_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_apmArea_subtitle, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_bizum), null, tool);
            } else if (Intrinsics.f(tool, r.f178490a)) {
                modelA = itd.c.a(itd.c.c(tool), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_pixArea_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_pixArea_subtitle, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_logo_pix), null, tool);
            } else {
                if (!Intrinsics.f(tool, jtd.g.f178478a)) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = itd.c.a(itd.c.c(tool), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_alipay_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_travel_mode_section_tool_alipay_subtitle, null, null, 14), itd.c.b(R$drawable.uikit_icn_24_alipayplus), null, tool);
            }
            arrayList.add(modelA);
        }
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        CellDetailsSwitcherDelegate.Model model;
        Iterator it8;
        TextClause textClause;
        boolean z;
        Clause textClause2;
        Object objK;
        Iterator it9;
        TextLocalisedClause textLocalisedClause;
        gz7.v vVar = (gz7.v) this.f144949b;
        gz7.g viewModel = (gz7.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(viewModel, "content");
        iz7.c cVar = vVar.f147966p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        int i = 0;
        boolean z3 = true;
        if (viewModel instanceof gz7.e) {
            List list = ((gz7.e) viewModel).f147945a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                Object next = it10.next();
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                gz7.c cVar2 = (gz7.c) next;
                String strN = a0.d.n("PET_PLAN_RENEWAL_ITEM_PREFIX_", i);
                RowDelegate.Model.MainImage.Image40 image40A = cVar.a(cVar2, z3);
                q0 q0Var = cVar2.f147944b;
                zw7.d0 d0Var = cVar2.f147943a;
                String str = d0Var != null ? d0Var.d : null;
                TextClause textClause3 = new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                boolean z4 = q0Var.f325835c;
                n0 n0Var = q0Var.d.f325830c;
                LocalDate localDate = q0Var.f325834b;
                if (z4) {
                    it9 = it10;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_renewal_date, u.c(new TimeClause(jli.b.b(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
                } else {
                    it9 = it10;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_end_date, u.c(new TimeClause(jli.b.b(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
                }
                TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                dj0.d dVar = n0Var.f325820a;
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var = o9.NON_SENSITIVE;
                arrayList.add(new RowDelegate.Model(strN, image40A, textClause3, null, 0, textLocalisedClause2, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, defaults, null, o9Var, 4), new MoneyClause(n0Var.f325821b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), o9Var), null, false, 124), true, null, false, null, null, null, null, null, null, cVar2, null, 0, 0, 0, 0, 532673496));
                i = i2;
                it10 = it9;
                z3 = true;
            }
            yp0.b.k(arrayList, 0, R$attr.uikit_two_button_margin, 0, 0, 29);
            objK = arrayList;
        } else {
            if (!(viewModel instanceof gz7.f)) {
                throw new NoWhenBranchMatchedException();
            }
            s0 s0Var = new s0(4);
            gz7.c cVar3 = ((gz7.f) viewModel).f147946a;
            s0Var.a(new ListSubheaderDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", (Image) null, (Clause) (cVar3.f147944b.f325835c ? new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_header, null, null, 14) : new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_renewal_price_header, null, null, 14)), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114));
            RowDelegate.Model.MainImage.Image40 image40A2 = cVar.a(cVar3, false);
            q0 q0Var2 = cVar3.f147944b;
            zw7.d0 d0Var2 = cVar3.f147943a;
            String str2 = d0Var2 != null ? d0Var2.d : null;
            TextClause textClause4 = new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i3 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_start_date;
            LocalDate localDate2 = q0Var2.f325834b;
            p0 p0Var = q0Var2.d;
            n0 n0Var2 = p0Var.f325830c;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i3, u.c(new TimeClause(jli.b.b(localDate2), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
            dj0.d dVar2 = n0Var2.f325820a;
            MoneyClause.Format.Defaults defaults2 = new MoneyClause.Format.Defaults(null, null, false, false, 15);
            o9 o9Var2 = o9.NON_SENSITIVE;
            RowDelegate.Model model2 = new RowDelegate.Model("PET_PLAN_RENEWAL_ITEM_PREFIX_0", image40A2, textClause4, null, 0, textLocalisedClause3, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, defaults2, null, o9Var2, 4), new MoneyClause(n0Var2.f325821b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), o9Var2), null, false, 124), false, null, false, null, null, null, null, null, null, cVar3, null, 0, 0, 0, 0, 532673496);
            Boolean bool = p0Var.f.f325813a;
            if (bool != null) {
                model = new CellDetailsSwitcherDelegate.Model("PET_PLAN_RENEWAL_STERILIZED_CELL_ITEM_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_cells_is_sterilized_title, null, null, 14), bool.booleanValue(), d0Var2 != null, 0, null, null, null, 4080);
            } else {
                model = null;
            }
            Object[] elements = {model2, model};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            s0Var.b((qv0.i[]) listL.toArray(new qv0.i[0]));
            s0Var.a(new ListSubheaderDelegate.Model("PLAN_DETAILS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_plan_details_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            ArrayList arrayList2 = p0Var.e;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            Iterator it11 = arrayList2.iterator();
            int i5 = 0;
            while (it11.hasNext()) {
                Object next2 = it11.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                m0 m0Var = (m0) next2;
                String strN2 = a0.d.n("PLAN_DETAILS_ITEM_PREFIX_", i5);
                TextClause textClause5 = new TextClause(m0Var.f325817a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = m0Var.f325819c;
                if (str3 != null) {
                    it8 = it11;
                    textClause = textClause5;
                    z = true;
                    List listK = v.k(new TextClause(m0Var.f325818b, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), true, false, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    m70.a.t(t0.f186434a);
                    textClause2 = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else {
                    it8 = it11;
                    textClause = textClause5;
                    z = true;
                    textClause2 = new TextClause(m0Var.f325818b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                arrayList3.add(new CellDetailsDelegate.Model(strN2, textClause, textClause2, 0, m0Var, null, null, null, null, false, 0, 0, 32744));
                i5 = i6;
                it11 = it8;
            }
            yp0.b.k(arrayList3, 0, R$attr.uikit_two_button_margin, 0, 0, 29);
            s0Var.b(arrayList3.toArray(new CellDetailsDelegate.Model[0]));
            ArrayList arrayList4 = s0Var.f186433a;
            objK = v.k(arrayList4.toArray(new qv0.i[arrayList4.size()]));
        }
        return new Pair(viewModel, objK);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        gzb.c cVar = (gzb.c) this.f144949b;
        m1c.m0 challengesBreakdown = (m1c.m0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(challengesBreakdown, "challengesBreakdown");
        ArrayList arrayListE0 = d0.E0(challengesBreakdown.f201410c, challengesBreakdown.f201408a);
        if (arrayListE0.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_ID", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenges_active_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenges_active_empty_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D008", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1984);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : arrayListE0) {
            if (((l0) obj5).f201389j == i0.ACTIVE) {
                arrayList.add(obj5);
            }
        }
        pyb.d dVar = cVar.f147983a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (((l0) obj6).f201394q) {
                arrayList2.add(obj6);
            } else {
                arrayList3.add(obj6);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : arrayList3) {
            if (((l0) obj7).f201393p) {
                arrayList4.add(obj7);
            } else {
                arrayList5.add(obj7);
            }
        }
        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            arrayList6.add(dVar.a((l0) it8.next()));
        }
        yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
        ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList4, 10));
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            arrayList7.add(dVar.a((l0) it9.next()));
        }
        yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            arrayList8.add(dVar.a((l0) it10.next()));
        }
        if (arrayList5.isEmpty() && arrayList4.isEmpty()) {
            yp0.b.k(arrayList8, 0, 0, 0, 0, 31);
        } else {
            e0 e0Var = e0.OUTSIDE_BOX;
            int i = R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp16;
            if (!arrayList8.isEmpty()) {
                arrayList8 = yp0.b.d(arrayList8, new ListSubheaderDelegate.Model("PRE_ENROLLED_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenges_pre_enrolled_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2);
            }
        }
        return d0.E0(arrayList8, d0.E0(arrayList6, arrayList7));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        gzj.d dVar = (gzj.d) this.f144949b;
        gzj.g state = (gzj.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        hzj.j jVar = dVar.f148145n;
        List planLimits = state.f148154a;
        List walletLimits = state.f148155b;
        boolean z = state.f148156c;
        boolean z3 = state.d;
        yt8.i addressKycStatus = state.e;
        l71.d userCompany = state.f;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(planLimits, "planLimits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        Intrinsics.checkNotNullParameter(addressKycStatus, "addressKycStatus");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        List listJ = y.J(y.x(y.z(y.F(d0.Q(walletLimits), new hzj.i()), new hul.v(jVar, addressKycStatus, 21)), new hw9.a(jVar, 19)));
        boolean zC = ((jte.d) jVar.f157213b).c(LimitsApi$Toggles$MexicoHideAtmLimits.f101774c);
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : planLimits) {
            mha.s sVar = (mha.s) obj5;
            mha.m mVar = sVar.f205465c;
            mha.m.Companion.getClass();
            if (!mVar.equals(mha.m.f205456b) || !zC) {
                if (!sVar.f205465c.equals(mha.m.f205458g)) {
                    arrayList.add(obj5);
                }
            }
        }
        nkm.d0 d0VarX = y.x(y.F(y.F(d0.Q(arrayList), new hzj.g()), new hzj.h()), new g48.h(jVar, z, userCompany, 8));
        Intrinsics.checkNotNullParameter(d0VarX, "<this>");
        ArrayList arrayListE0 = d0.E0(listJ, y.J(y.x(nkm.t.f(d0VarX, new njf.d(20)), new gae.a(jVar, z3, 12))));
        yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        return arrayListE0;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        h09.d dVar = (h09.d) this.f144949b;
        List courses = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(courses, "courses");
        if (courses.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("CourseRedesignedMapper_SMALL_COURSES_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_home_header_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_common_action_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true), false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57258);
        List listV0 = d0.V0(courses, 5);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(dVar.a((u09.f) it8.next(), true));
        }
        gg.c cVar = new gg.c(0);
        SmallCardDelegate.INSTANCE.getClass();
        return v.k(model, new hg("CourseRedesignedMapper_SMALL_COURSE_ITEM_ID", arrayList, 2, new y4(SmallCardDelegate.f53351j), null, cVar, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624));
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        Object objC;
        Object next;
        h1k.o oVar = (h1k.o) this.f144949b;
        List trendsPreviewData = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(trendsPreviewData, "trendPreviews");
        y0k.a aVar = oVar.f148606a;
        Intrinsics.checkNotNullParameter(trendsPreviewData, "trendsPreviewData");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = trendsPreviewData.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            d1k.c cVar = (d1k.c) it8.next();
            Iterator it9 = aVar.f310220a.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (((c1k.c) next).b(cVar.getSymbol().f258690a)) {
                    break;
                }
            }
            c1k.c cVar2 = (c1k.c) next;
            objC = cVar2 != null ? cVar2.c(cVar) : null;
            if (objC != null) {
                arrayList.add(objC);
            }
        }
        eg egVar = new eg("TREND_PREVIEW_SCROLLER_LIST_ID", arrayList, dg.a.f54052a, 16.0f, 0, 0, 1008);
        if (arrayList.isEmpty()) {
            egVar = null;
        }
        objC = egVar != null ? u.c(egVar) : null;
        return objC == null ? f0.f322471a : objC;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        ListSubheaderDelegate.Model model;
        List listC;
        h1k.m mVar = (h1k.m) this.f144949b;
        rzj.k news = (rzj.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(news, "news");
        List list = news.f258697a;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        int[] iArr = h1k.n.f148604a;
        int i = iArr[mVar.ordinal()];
        if (i == 1 || i == 2) {
            DateTime dateTime = ((rzj.f) d0.b0(list)).d().e;
            String str = "NEWS_SECTION_HEADER_DELEGATE_ID_" + mVar;
            TimeClause timeClause = new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12);
            TextLocalisedClause textLocalisedClause = news.f258698b >= 10 ? new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_common_actions_see_all, null, null, 14) : null;
            DateTime dateTimeWithTime = dateTime.withZone(DateTimeZone.getDefault()).withTime(LocalTime.MIDNIGHT);
            Intrinsics.checkNotNullExpressionValue(dateTimeWithTime, "withTime(...)");
            model = new ListSubheaderDelegate.Model(str, (Image) null, (Clause) timeClause, (ResourceImage) null, false, false, (Clause) textLocalisedClause, true, (Object) new h1k.f(dateTimeWithTime), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            model = new ListSubheaderDelegate.Model("NEWS_SECTION_HEADER_DELEGATE_ID_" + h1k.m.PREVIOUS, (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_news_tab_screen_sections_previous_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        }
        int i2 = iArr[mVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            String str2 = "NEWS_ARTICLE_SCROLLER_DELEGATE_ID_" + mVar;
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                NewsDelegate.Model modelD = h1k.o.d((rzj.f) it8.next(), com.revolut.core.ui_kit.models.q0.ONLY_TIME, NewsDelegate.Model.b.a.f52847a);
                yp0.b.l(modelD, 0, 0, 0, 0, null, false, 63);
                arrayList.add(modelD);
            }
            listC = u.c(h1k.o.b(str2, arrayList));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList2.add(h1k.o.d((rzj.f) it9.next(), com.revolut.core.ui_kit.models.q0.DATETIME, NewsDelegate.Model.b.c.f52853a));
            }
            yp0.b.k(arrayList2, R$attr.uikit_dp0, 0, 0, 0, 30);
            listC = arrayList2;
        }
        return i2b.a.q(model, listC);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        Object next;
        boolean z;
        Object next2;
        h2c.i iVar = (h2c.i) this.f144949b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) pair.f186386b;
        int iA = iVar.f148774b.a();
        ArrayList arrayList = spareChangeCalculations.f84086c;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((SpareChangeCalculation) next).f84081a == iA) {
                break;
            }
        }
        SpareChangeCalculation spareChangeCalculation = (SpareChangeCalculation) next;
        if (spareChangeCalculation == null) {
            spareChangeCalculation = (SpareChangeCalculation) d0.b0(arrayList);
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            z = true;
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((SpareChangeCalculation) next2).f84081a == 1) {
                break;
            }
        }
        SpareChangeCalculation spareChangeCalculation2 = (SpareChangeCalculation) next2;
        if (spareChangeCalculation2 == null) {
            spareChangeCalculation2 = (SpareChangeCalculation) d0.b0(arrayList);
        }
        aim.e eVarB = u.b();
        h2c.n.Companion.getClass();
        List list = h2c.g.f148772b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            int iIntValue = ((Number) it10.next()).intValue();
            boolean z3 = z;
            AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(a0.d.n("SPARE_CHANGE_FG_GRID_BOX_ITEM_ID_", iIntValue), new com.revolut.core.ui_kit.delegates.p0(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_multiplier_change, u.c(new TextClause(a0.d.n("x", iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null), iIntValue == iA ? com.revolut.core.ui_kit.delegates.m0.f54452b : null, null, Integer.valueOf(iIntValue), new AnalyticsContext(x.a(iIntValue)), SyslogConstants.LOG_LOCAL3);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            z = z3;
        }
        boolean z4 = z;
        eVarB.add(new xk("SPARE_CHANGE_FG_GRID_ITEM_ID", arrayList2, null, null, null, 60));
        aim.e eVarB2 = u.b();
        RevPoints revPoints = spareChangeCalculation.f84083c;
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("SPARE_CHANGE_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_how_it_works_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        int i = R$attr.uikit_dp0;
        yp0.b.p(model2, i, i, i, i);
        eVarB2.add(model2);
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_how_it_works_if_you_spend, null, null, 14), (Image) null, 0, false, 30);
        SpareChangeAmount spareChangeAmount = spareChangeCalculations.f84085b;
        long j2 = spareChangeAmount.f84079a;
        xi0.a aVar = xi0.b.Companion;
        String str = spareChangeAmount.f84080b;
        aVar.getClass();
        dj0.d dVar = new dj0.d(j2, xi0.a.a(str));
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("SPARE_CHANGE_CELL_DELEGATE_SPEND_ITEM_ID", t0Var, new MoneyClause(dVar, defaults, null, o9Var, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_how_it_works_you_round_up, u.c(new NumberClause(iA, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12), (Image) null, 0, false, 30);
        SpareChangeAmount spareChangeAmount2 = spareChangeCalculation2.f84082b;
        List listK = v.k(new MoneyClause(new dj0.d(spareChangeAmount2.f84079a, xi0.a.a(spareChangeAmount2.f84080b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), new NumberClause(iA, (NumberClause.Format.Compact) null, (Custom) null, 6));
        t0 t0Var3 = t0.f186434a;
        m70.a.t(t0Var3);
        Intrinsics.checkNotNullParameter(t0Var3, "<this>");
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("SPARE_CHANGE_CELL_DELEGATE_ROUND_ITEM_ID", t0Var2, new CompositeClause(listK, new TextClause(" x ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        aw0.t0 t0Var4 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_how_it_works_and_you_buy, u.c(new NumberClause(iA, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12), (Image) null, 0, false, 30);
        u0 u0Var = u0.LARGE;
        int i2 = R$drawable.uikit_icn_24_info_outline;
        ImageClauseTint.Color color = new ImageClauseTint.Color(R$attr.uikit_colorAccent);
        Float fValueOf = Float.valueOf(16.0f);
        ImageClause imageClause = new ImageClause(i2, color, fValueOf, fValueOf, 16);
        TextLocalisedQuantityClause textLocalisedQuantityClauseQ = nub.a.q(revPoints, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, null, 6);
        Clause[] clauseArr = new Clause[2];
        clauseArr[0] = imageClause;
        clauseArr[z4 ? 1 : 0] = textLocalisedQuantityClauseQ;
        List listK2 = v.k(clauseArr);
        Intrinsics.checkNotNullParameter(t0Var3, "<this>");
        List listK3 = v.k(model3, model4, new CellDetailsDelegate.Model("SPARE_CHANGE_CELL_DELEGATE_BUY_ITEM_ID", t0Var4, new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, u0Var, 0, null, false, false, null, null, 32504));
        yp0.b.k(listK3, R$attr.uikit_dp0, 0, 0, 0, 30);
        eVarB2.addAll(listK3);
        eVarB.addAll(u.a(eVarB2));
        return u.a(eVarB);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        z zVar = (z) this.f144949b;
        Set actions = (Set) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        return zVar.a(actions.contains(h3b.h.ADD_MONEY), actions.contains(h3b.h.WITHDRAW));
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        hae.n nVar = (hae.n) this.f144949b;
        hae.g transactionsData = (hae.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_HEADER", null, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_history_list_header_title, null, null, 14), null, new MoneyClause(transactionsData.f150490c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, j0.TRANSPARENT, null, null, false, false, null, null, 0, 0, 0, 0, 16777130);
        ArrayList arrayListE = thf.l.e(nVar.f150502a, transactionsData.f150488a, transactionsData.f150489b, new thf.k(1022, false, false, false, false, false), null, 24);
        yp0.b.k(arrayListE, 0, 0, 0, 0, 31);
        return i2b.a.o(u.c(model), arrayListE);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        hb6.f fVar = (hb6.f) this.f144949b;
        DonationQuoteResponse quoteResponse = (DonationQuoteResponse) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(quoteResponse, "quoteResponse");
        DonationQuoteRequest quoteRequest = fVar.f150617a.f72004a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TOTAL_AMOUNT_CELL_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_donation_breakdown_cells_amount_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(quoteRequest.f71965a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_donation_breakdown_cells_exchange_rate_title, null, null, 14), (Image) null, 0, false, 30);
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        Intrinsics.checkNotNullParameter(quoteResponse, "quoteResponse");
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_arrow_rates, (Integer) null, (Float) null, (Float) null, 30);
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        AssetClause assetClause = new AssetClause(ONE, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), cp5.d.J(quoteRequest.f71965a.f115083b), null, o9.NON_SENSITIVE, 8);
        RateClause rateClause = new RateClause(quoteResponse.f71968b, quoteResponse.f71967a.f115083b, new RateClause.Format.Default(null, true), null);
        t0 t0Var2 = t0.f186434a;
        m70.a.t(t0Var2);
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(t0Var2, "<this>");
        List listK = v.k(model, new CellDetailsDelegate.Model("EXCHANGE_RATE_CELL_ID", t0Var, new CompositeClause(v.k(imageClause, textClause, assetClause, new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), rateClause), null, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("CHARITY_GET_CELL_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_donation_breakdown_cells_charity_gets_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(quoteResponse.f71967a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, hb6.e.f150616a, null, null, 0, null, false, false, null, null, 32696), new CellDetailsDelegate.Model("EXCHANGE_FEE_CELL_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_donation_breakdown_cells_exchange_fee_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_donation_breakdown_cells_exchange_fee_detail, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        TextLocalisedClause textLocalisedClause;
        int i3;
        ZonedDateTime zonedDateTime;
        TransferRequest transferRequest = (TransferRequest) this.f144949b;
        od0.i optionalTradingAccount = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(optionalTradingAccount, "optionalTradingAccount");
        TradingAccount tradingAccount = (TradingAccount) optionalTradingAccount.g();
        if (tradingAccount == null) {
            return hbf.q.f150675a;
        }
        boolean z = tradingAccount instanceof TradingAccount.TaxAdvantage.Pea;
        if (z) {
            i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_title_pea;
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
            i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_title_isa;
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
            i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_title_jisa;
        } else {
            if (!(tradingAccount instanceof TradingAccount.GIA)) {
                if (!(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("TransferProgress not supported for trading account " + tradingAccount.getF105262a()).toString());
            }
            i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_header_title;
        }
        Image imageI = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        int i5 = b0.f150656a[transferRequest.f91521c.ordinal()];
        if (i5 == 1) {
            i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_subtitle;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_subtitle_to;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, u.c(new TextClause(transferRequest.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TransferRequestStep transferRequestStep = (TransferRequestStep) d0.o0(transferRequest.f91524j);
        boolean z3 = false;
        TimeClause timeClause = (transferRequestStep == null || (zonedDateTime = transferRequestStep.f91529b) == null) ? null : new TimeClause(zonedDateTime.toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(0), null, null, 12);
        if (timeClause != null) {
            switch (b0.f150657b[transferRequest.f91520b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    i3 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_estimated_completion;
                    break;
                case 4:
                case 5:
                    i3 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_subtitle_failed;
                    break;
                case 6:
                    i3 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_progress_header_subtitle_completed;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(i3, u.c(timeClause), null, 12);
        } else {
            textLocalisedClause = null;
        }
        if (z || (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa)) {
            imageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_bar_chart_percent, R$attr.uikit_colorWhite, R$attr.uikit_colorColdBlue);
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
            imageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_children, R$attr.uikit_colorWhite, R$attr.uikit_colorColdBlue);
        } else {
            if (!(tradingAccount instanceof TradingAccount.GIA)) {
                if (!(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("TransferProgress not supported for trading account " + tradingAccount.getF105262a()).toString());
            }
            String str = transferRequest.f91522g;
            if (str != null) {
                imageI = new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) (objArr2 == true ? 1 : 0), (Integer) (objArr == true ? 1 : 0), z3, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
            }
        }
        return new hbf.o(textLocalisedClause2, textLocalisedClause3, textLocalisedClause, imageI);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        CdnImage cdnImage;
        Object next;
        rei.g bookingDetails = (rei.g) this.f144949b;
        List providers = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(providers, "providers");
        Iterator it8 = providers.iterator();
        while (true) {
            cdnImage = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((fgi.b) next).f135075a == bookingDetails.f.f98009h) {
                break;
            }
        }
        fgi.b bVar = (fgi.b) next;
        int i = hbg.i0.f150700a[bookingDetails.f253605b.ordinal()];
        if (i != 1 && i != 5) {
            return f0.f322471a;
        }
        od0.i.Companion.getClass();
        od0.i provider = od0.h.a(bVar);
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!provider.d()) {
            return f0.f322471a;
        }
        fgi.a aVar = bookingDetails.f.f98009h;
        if ((aVar == null ? -1 : hag.e.f150507c[aVar.ordinal()]) != 1) {
            return f0.f322471a;
        }
        fgi.b bVar2 = (fgi.b) provider.c();
        CompositeClause compositeClause = new CompositeClause(v.k(new TextClause(bVar2.f135076b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        Address address = bVar2.d;
        String str = address.f97966a;
        StringBuilder sb6 = new StringBuilder();
        String str2 = address.f97969g;
        String str3 = address.f;
        String str4 = address.d;
        String str5 = address.f97967b;
        if (str != null && str.length() != 0) {
            sb6.append(str);
            sb6.append(", ");
            if (str5 != null) {
                str5.length();
            }
            if (str5 != null) {
                str5.length();
            }
        }
        if (str5 != null && str5.length() != 0) {
            sb6.append(str5);
            sb6.append(", ");
            if (str4 != null) {
                str4.length();
            }
            if (str4 != null) {
                str4.length();
            }
        }
        if (str4 != null && str4.length() != 0) {
            sb6.append(str4);
            sb6.append(", ");
            if (str3 != null) {
                str3.length();
            }
            if (str3 != null) {
                str3.length();
            }
        }
        if (str3 != null && str3.length() != 0) {
            sb6.append(str3);
            sb6.append(", ");
            if (str2 != null) {
                str2.length();
            }
            if (str2 != null) {
                str2.length();
            }
        }
        if (str2 != null && str2.length() != 0) {
            sb6.append(str2);
        }
        sb6.append("\n");
        TextClause textClause = new TextClause(sb6.toString(), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        String str6 = bVar2.f;
        CompositeClause compositeClause2 = str6 != null ? new CompositeClause(v.k(new TextClause(str6, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14) : null;
        String str7 = bVar2.e;
        Clause[] elements = {compositeClause, textClause, compositeClause2, str7 != null ? new TextClause(str7, (Style) new Click(30, (Integer) null, (Object) null, "FOOTER_EMAIL_ID", false), (Integer) null, false, (o9) null, (List) null, 124) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        TextDelegate.Model model = new TextDelegate.Model("VRBO_FOOTER_ITEM_ID", new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), false, new ak0(yj0.START, cdnImage, 2), null, null, 0, 0, 0, 0, 2036);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return u.c(model);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        List list;
        hg9.g gVar = (hg9.g) this.f144949b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        xo1.g gVar2 = gVar.f152118b;
        if (content.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("ID_EMPTY_PLACEHOLDER", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_tax_form_errors_empty_state_title, null, null, 14), hg9.o.f152130a[gVar2.ordinal()] == 1 ? new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_tax_form_errors_empty_state_f24_subtitle, null, null, 14) : null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), new l6(12, new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_tax_form_action_retry, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
        } else {
            List<hg9.h> list2 = content;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (hg9.h hVar : list2) {
                boolean z = false;
                arrayList.add(new RowDelegate.Model(j6.a.q("ERROR_ITEM_ID_", hVar.f152121c), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextClause(hVar.f152119a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(hVar.f152120b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            list = arrayList;
        }
        return new hg9.l(list, !content.isEmpty());
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        fmc.z zVar = (fmc.z) this.f144949b;
        fi7.i disclaimersContext = (fi7.i) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(disclaimersContext, "disclaimersContext");
        return ((aah.m) ((q1) zVar.f136369b)).c(disclaimersContext.f135321a, disclaimersContext.f135322b);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) throws Throwable {
        int i;
        hjh.f fVar = (hjh.f) this.f144949b;
        djh.b content = (djh.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == null) {
            hx7.e.n(new IllegalArgumentException(a0.d.l(content.getClass(), "Invalid state. AvailableAccountsWidgetContract.Mapper received ")));
            return f0.f322471a;
        }
        g2e.t tVar = fVar.f152823a;
        List accounts = content.f115387a;
        TradingLegalEntityInformation tradingLegalEntityInformation = content.f115388b;
        ybl.g productGroupsAvailability = content.f115389c;
        djh.a upsellingState = content.d;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
        Intrinsics.checkNotNullParameter(upsellingState, "upsellingState");
        Lazy lazyB = yhm.j.b(new d4h.a(accounts, 1));
        Lazy lazyB2 = yhm.j.b(new d4h.a(accounts, 2));
        ArrayList arrayListU = null;
        if (!upsellingState.f115386a && ((Boolean) lazyB.getValue()).booleanValue() && !((List) lazyB2.getValue()).isEmpty()) {
            Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
            hel.b bVar = tradingLegalEntityInformation.f105106a;
            switch (bVar == null ? -1 : hjh.e.f152822a[bVar.ordinal()]) {
                case -1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_section_not_onboarded_accounts_bottom;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    i = com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_section_not_onboarded_accounts_uk_bottom;
                    break;
            }
            arrayListU = zhm.w.u(v.k(u.c(new ListSubheaderDelegate.Model("ACCOUNTS_BOTTOM_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), ((r10.d) tVar.f140031b).j0((List) lazyB2.getValue(), tradingLegalEntityInformation, productGroupsAvailability, new hhd.n(13))));
        }
        return arrayListU == null ? f0.f322471a : arrayListU;
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        a3e.u uVar = (a3e.u) this.f144949b;
        List invoices = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        jkj.e eVar = (jkj.e) uVar.f1129b;
        Lazy lazy = eVar.e;
        Lazy lazy2 = eVar.d;
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        List listP0 = d0.P0(invoices, new jkj.d());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : listP0) {
            Calendar calendar = (Calendar) lazy2.getValue();
            calendar.setTimeInMillis(((o2) obj5).f113612b.toEpochMilli());
            Integer numValueOf = Integer.valueOf(calendar.get(1));
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj5);
        }
        if (linkedHashMap.size() == 1) {
            Iterable<o2> iterable = (Iterable) ((Map.Entry) d0.a0(linkedHashMap.entrySet())).getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (o2 o2Var : iterable) {
                    Calendar calendar2 = (Calendar) lazy2.getValue();
                    calendar2.setTimeInMillis(o2Var.f113612b.toEpochMilli());
                    if (calendar2.get(1) == ((Number) lazy.getValue()).intValue()) {
                    }
                }
            }
            Map.Entry entry = (Map.Entry) d0.c0(linkedHashMap.entrySet());
            if (entry == null) {
                return f0.f322471a;
            }
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            int i = 0;
            for (Object obj6 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                arrayList.add(eVar.a(0, i, (o2) obj6));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            return arrayList;
        }
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(setEntrySet, 10));
        int i3 = 0;
        for (Object obj7 : setEntrySet) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            Map.Entry entry2 = (Map.Entry) obj7;
            int iIntValue = ((Number) entry2.getKey()).intValue();
            List list2 = (List) entry2.getValue();
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(a0.d.n("ID_INVOICES_GROUP_SUBHEADER_", i3), (Image) null, iIntValue == ((Number) lazy.getValue()).intValue() ? new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_invoices_section_this_year, null, null, 14) : new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List list3 = list2;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
            int i6 = 0;
            for (Object obj8 : list3) {
                int i21 = i6 + 1;
                if (i6 < 0) {
                    v.s();
                    throw null;
                }
                arrayList3.add(eVar.a(i3, i6, (o2) obj8));
                i6 = i21;
            }
            arrayList2.add(yp0.b.g(arrayList3, model, null, 0, 0, 126));
            i3 = i5;
        }
        return zhm.w.u(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01a0  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gna.i.v(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:329:0x0cb3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a2b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r80, java.lang.Object r81, java.lang.Object r82) {
        /*
            Method dump skipped, instruction units count: 3352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gna.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f144948a = i;
        this.f144949b = obj3;
    }

    public /* synthetic */ i(rei.g gVar, hbg.j0 j0Var) {
        this.f144948a = 23;
        this.f144949b = gVar;
    }
}
