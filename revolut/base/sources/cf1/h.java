package cf1;

import android.os.Parcelable;
import android.text.InputFilter;
import au0.q0;
import au0.u0;
import aw0.aa;
import aw0.ba;
import aw0.c7;
import aw0.ca;
import aw0.da;
import aw0.ea;
import aw0.k7;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.s8;
import aw0.t0;
import aw0.v4;
import bu7.x0;
import cli.n;
import cm9.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.b2;
import com.revolut.core.ui_kit.delegates.c2;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.hj;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.lh;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.tg;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.vg;
import com.revolut.core.ui_kit.delegates.yi;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.slider.SliderTitledView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressExtKt;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.o0;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$YouthAccountEmptyState;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Toggles$PayWithSmileChangePasscode;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.feature.retail.cfd.api.domain.models.Fee;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreenContract$TitleClickParcel;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPriceBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$plurals;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import cuj.a0;
import cuj.b0;
import cv7.m;
import d0j.r;
import d0j.x;
import d2g.z;
import d78.t;
import d9.e1;
import gu7.b5;
import gu7.e5;
import gu7.h5;
import gu7.l5;
import gu7.q5;
import gu7.s4;
import gu7.w4;
import gu7.w5;
import gu7.x4;
import gu7.y4;
import ip0.ak0;
import ip0.ej;
import ip0.g9;
import ip0.go0;
import ip0.qd0;
import ip0.u8;
import ip0.vd0;
import ip0.y10;
import ip0.yj0;
import ip0.yt;
import ip0.zj;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import ms0.h4;
import mx0.v5;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import pcd.s;
import pie.p;
import pie.q;
import qv0.c;
import ymi.k;
import yy0.l;
import z0h.p1;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23528b;

    public /* synthetic */ h(int i, cli.j jVar, n nVar) {
        this.f23527a = i;
        this.f23528b = jVar;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        o oVar = (o) this.f23528b;
        nl9.g settings = (nl9.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        aim.e eVarB = u.b();
        boolean z = false;
        int i = 6;
        eVarB.add(new RowDelegate.Model("SWITCHER_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_pay_with_smile_title, null, null, 14), null, 0, null, null, null, 0, new vf(settings.f217102a, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
        if (((jte.d) oVar.f25177a).c(PayWithSmileApi$Toggles$PayWithSmileChangePasscode.f78948c)) {
            boolean z3 = settings.f217103b;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_change_passcode, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_change_passcode_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = !z3 ? new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_change_passcode_not_set_subtitle, null, null, 14) : null;
            yy0.i iVar = l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            eVarB.add(new RowDelegate.Model("CHANGE_PASSCODE_ID", image24, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.h.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Pair pair;
        Pair pair2;
        int i;
        boolean z;
        cni.g gVar = (cni.g) this.f23528b;
        cni.f content = (cni.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Set set = gVar.f25437b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_title, u.c(content.f25434a.f315017c.f315013b), null, 12);
        AvatarModel.Default r92 = new AvatarModel.Default(new UserAvatarImage(new UserNamePlaceholder.Default(content.f25435b.f315010c), null, null, 6), null, null, null, null, null, 126);
        ymi.i iVar = content.f25434a;
        ymi.g gVar2 = iVar.f315017c;
        cni.h hVar = new cni.h(textLocalisedClause, new q0(r92, new AvatarModel.Default(new UrlImage(gVar2.f315014c, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, null, null, null, null, 126), new TagViewData(null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, R$attr.uikit_colorTransparent, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION)));
        ArrayList<k> arrayList = iVar.f315016b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (k kVar : arrayList) {
            arrayList2.add(new RowDelegate.Model(j6.a.q("SCOPE_LIST_ID_", kVar.f315018a), null, new TextClause(kVar.f315019b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new vf(!set.contains(kVar.f315018a), true), false, null, false, null, null, null, null, null, null, kVar.f315018a, null, 0, 0, 0, 0, 532675578));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        TextClause textClause = new TextClause(gVar2.f315013b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = gVar2.d;
        String str2 = gVar2.e;
        if (str == null || str2 == null) {
            if (str != null) {
                pair = new Pair(tmi.a.ServiceTerms, v.k(textClause, new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_footer_service_terms, null, new Click(28, (Integer) null, (Object) str, "LINK_SERVICE_TERMS", false), 10)));
            } else if (str2 != null) {
                pair2 = new Pair(tmi.a.PrivacyPolicy, v.k(textClause, new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_footer_privacy_policy, null, new Click(28, (Integer) null, (Object) str2, "LINK_PRIVACY_POLICY", false), 10)));
            } else {
                pair = new Pair(tmi.a.NoLinks, u.c(textClause));
            }
            pair2 = pair;
        } else {
            pair2 = new Pair(tmi.a.TermsAndPrivacyPolicy, v.k(textClause, new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_footer_service_terms, null, new Click(28, (Integer) null, (Object) str, "LINK_SERVICE_TERMS", false), 10), new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_footer_privacy_policy, null, new Click(28, (Integer) null, (Object) str2, "LINK_PRIVACY_POLICY", false), 10)));
        }
        tmi.a footerType = (tmi.a) pair2.f186385a;
        List args = (List) pair2.f186386b;
        Intrinsics.checkNotNullParameter(footerType, "footerType");
        Intrinsics.checkNotNullParameter(args, "args");
        int i2 = b3l.a.f12140a[footerType.ordinal()];
        if (i2 == 1) {
            i = com.revolut.retail.oauth.dependencies.R$string.revolut_oauth_consent_footer_text_with_two_links;
        } else if (i2 == 2 || i2 == 3) {
            i = com.revolut.retail.oauth.dependencies.R$string.revolut_oauth_consent_footer_text_with_one_link;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.retail.oauth.dependencies.R$string.revolut_oauth_consent_footer_text_without_links;
        }
        ArrayList arrayListF0 = d0.F0(new TextDelegate.Model("CONSENT_FOOTER", new TextLocalisedClause(i, args, null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036), arrayList2);
        m6 m6Var = n6.Companion;
        n6 n6VarC = m6.c(m6Var, new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "TAG_CANCEL", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.oauth.impl.R$string.revolut_oauth_consent_confirm, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (!set.contains(((k) it8.next()).f315018a)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new cni.n(hVar, arrayListF0, new aw0.g(n6VarC, m6.c(m6Var, textLocalisedClause2, defaultFilledButton, null, "TAG_CONFIRM", z, null, null, null, 972), (Clause) null, (aw0.f) null, 25));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        cpb.e eVar = (cpb.e) this.f23528b;
        s savingsAccount = (s) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
        boolean z = false;
        List listC = u.c(cpb.l.a(savingsAccount.f234885h.f234859a, false));
        if (eVar.f107914a.length() > 0 && eVar.f107914a.length() <= 40) {
            z = true;
        }
        return new cpb.i(listC, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        Clause clauseW;
        DayOfWeek dayOfWeek;
        crd.l lVar = (crd.l) this.f23528b;
        lzi.h analyticsSpendingCycle = (lzi.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(analyticsSpendingCycle, "content");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_settings_section_cycle_frequency_title, null, null, 14);
        erd.c cVar = lVar.f108357a;
        Intrinsics.checkNotNullParameter(analyticsSpendingCycle, "analyticsSpendingCycle");
        boolean z = analyticsSpendingCycle instanceof lzi.g;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_settings_cycle_frequency_weekly, null, null, 14);
        } else {
            if (!(analyticsSpendingCycle instanceof lzi.c) && !(analyticsSpendingCycle instanceof lzi.e)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_settings_cycle_frequency_monthly, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        Object[] objArr = 0 == true ? 1 : 0;
        RowDelegate.Model model = new RowDelegate.Model("SPENDING_CYCLE_FREQUENCY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_repeat, R$attr.uikit_colorWhite, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_settings_screen_button_change, null, null, 14), objArr, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_settings_section_cycle_start_title, null, null, 14);
        cmd.b bVar = cVar.f128645a;
        Intrinsics.checkNotNullParameter(analyticsSpendingCycle, "analyticsSpendingCycle");
        if (z) {
            switch (erd.b.f128644c[((lzi.g) analyticsSpendingCycle).f200979a.ordinal()]) {
                case 1:
                    dayOfWeek = DayOfWeek.MONDAY;
                    break;
                case 2:
                    dayOfWeek = DayOfWeek.TUESDAY;
                    break;
                case 3:
                    dayOfWeek = DayOfWeek.WEDNESDAY;
                    break;
                case 4:
                    dayOfWeek = DayOfWeek.THURSDAY;
                    break;
                case 5:
                    dayOfWeek = DayOfWeek.FRIDAY;
                    break;
                case 6:
                    dayOfWeek = DayOfWeek.SATURDAY;
                    break;
                case 7:
                    dayOfWeek = DayOfWeek.SUNDAY;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            clauseW = ((cnd.b) bVar).a(dayOfWeek.getValue());
        } else if (analyticsSpendingCycle instanceof lzi.c) {
            lzi.c cVar2 = (lzi.c) analyticsSpendingCycle;
            int i = cVar2.f200975a;
            int i2 = erd.b.f128642a[cVar2.f200976b.ordinal()];
            if (i2 == 1) {
                clauseW = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_period_filter_screen_monthly_picker_weekend_behaviour_exact_short_title, u.c(Integer.valueOf(i)), null, 12);
            } else if (i2 == 2) {
                clauseW = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_period_filter_screen_monthly_picker_weekend_behaviour_before_short_title, u.c(Integer.valueOf(i)), null, 12);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseW = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_period_filter_screen_monthly_picker_weekend_behaviour_after_short_title, u.c(Integer.valueOf(i)), null, 12);
            }
        } else {
            if (!(analyticsSpendingCycle instanceof lzi.e)) {
                throw new NoWhenBranchMatchedException();
            }
            lzi.e eVar = (lzi.e) analyticsSpendingCycle;
            lzi.f fVar = eVar.f200977a;
            int i3 = erd.b.f128643b[eVar.f200978b.ordinal()];
            if (i3 == 1) {
                clauseW = yoj.b.w(yoj.b.w(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_period_filter_screen_monthly_picker_tab_title_first, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), ((cnd.b) bVar).a(fVar.getDayOfWeek()));
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseW = yoj.b.w(yoj.b.w(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_period_filter_screen_monthly_picker_tab_title_last, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), ((cnd.b) bVar).a(fVar.getDayOfWeek()));
            }
        }
        Clause clause = clauseW;
        boolean z3 = false;
        NewBadgeContent newBadgeContent = null;
        List listK = v.k(model, new RowDelegate.Model("SPENDING_CYCLE_START_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_calendar_date, R$attr.uikit_colorWhite, R$attr.uikit_colorAccentNeutral_10), null, null, z3, newBadgeContent, false, 60), textLocalisedClause4, null, 0, clause, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_settings_screen_button_change, null, null, 14), 0 == true ? 1 : 0, 0 == true ? 1 : 0, z3, newBadgeContent, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.h.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        ea daVar;
        TextClause textClause;
        StreakStepVerticalDelegate.Model.a lhVar;
        boolean z;
        TextClause textClause2;
        b0 b0Var = (b0) this.f23528b;
        r content = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.f110431g;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            d0j.v vVar = (d0j.v) obj5;
            boolean z3 = i == v.j(content.f110431g);
            String str = content.f110428a;
            d0j.b0 b0Var2 = content.f110429b;
            if (!z3) {
                b0Var2 = null;
            }
            cuj.h hVar = new cuj.h(str, b0Var2, vVar);
            String str2 = vVar.f110438c;
            x xVar = vVar.e;
            int iA = b0Var.f109033a.a(vVar.i.f110443b);
            Integer numValueOf = Integer.valueOf(iA);
            if (iA == 0) {
                numValueOf = null;
            }
            int[] iArr = a0.f109031a;
            switch (iArr[xVar.ordinal()]) {
                case 1:
                    daVar = new da(new GlyphImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_check, null, null, 6));
                    break;
                case 2:
                    daVar = new da(new GlyphImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_check, null, null, 6));
                    break;
                case 3:
                    daVar = new ba(new GlyphImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_cross, null, null, 6));
                    break;
                case 4:
                    daVar = new aa(new GlyphImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_lock_opened, null, null, 6));
                    break;
                case 5:
                    daVar = new ca(new GlyphImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_lock_opened, null, null, 6));
                    break;
                case 6:
                    daVar = new ba(new GlyphImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_cross, null, null, 6));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextClause textClause3 = new TextClause(vVar.f110439g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str3 = vVar.f.f110433b;
            if (str3 != null) {
                textClause = null;
                lhVar = new lh(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), vVar.f110438c, hVar);
            } else {
                textClause = null;
                lhVar = StreakStepVerticalDelegate.Model.a.C0427a.f53480a;
            }
            StreakStepVerticalDelegate.Model.a aVar = lhVar;
            switch (iArr[xVar.ordinal()]) {
                case 1:
                case 2:
                    z = true;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    z = false;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[xVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    String str4 = vVar.f110440h;
                    if (str4 != null) {
                        textClause2 = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    arrayList2.add(new StreakStepVerticalDelegate.Model(str2, daVar, textClause3, aVar, z3, z, textClause2, hVar, 384));
                    i = i2;
                case 4:
                case 5:
                case 6:
                    textClause2 = textClause;
                    arrayList2.add(new StreakStepVerticalDelegate.Model(str2, daVar, textClause3, aVar, z3, z, textClause2, hVar, 384));
                    i = i2;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final Object i(Object obj2, Object obj3, Object obj4) {
        dl7.a aVar;
        x0 x0Var;
        int i;
        ?? r142;
        int i2;
        cv7.j jVar = (cv7.j) this.f23528b;
        bu7.b0 insuranceDetails = (bu7.b0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        wi0.b bVar = (wi0.b) jVar.f109305b.getContent();
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        String str = insuranceDetails.d;
        dl7.a aVar2 = insuranceDetails.f18694b;
        x0 x0Var2 = insuranceDetails.i;
        if (str != null) {
            aVar = aVar2;
            x0Var = x0Var2;
            eVarB2.add(new CellDetailsActionDelegate.Model(str, new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_travel_details_title_summary_policy_number, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, new cv7.h(str), 0, 0, 0, 0, 4192228));
        } else {
            aVar = aVar2;
            x0Var = x0Var2;
        }
        eVarB2.addAll(cv7.s.a(insuranceDetails.f));
        aim.e eVarA = u.a(eVarB2);
        if (eVarA.isEmpty()) {
            i = 14;
            r142 = 0;
        } else {
            i = 14;
            r142 = 0;
            eVarB.add(new ListSubheaderDelegate.Model("ID_HEADER_SUMMARY", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_travel_details_title_summary, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434));
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarA);
        }
        com.revolut.feature.insurance_embedded.api.models.b bVar2 = insuranceDetails.k;
        RemoteDocument remoteDocument = bVar2.f75850c;
        RemoteDocument remoteDocument2 = bVar2.f75849b;
        RemoteDocument remoteDocument3 = bVar2.e;
        if (remoteDocument3 != null) {
            RowDelegate.Model modelC = cv7.r.c("ID_PRODUCT_SUMMARY", cv7.r.e(bVar), cv7.r.d(bVar), remoteDocument3);
            yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelC);
        } else if (remoteDocument != null) {
            RowDelegate.Model modelC2 = cv7.r.c("ID_GUIDE_TO_BENEFITS", new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_details_guide_to_benefits_title, r142, r142, i), new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_travel_details_product_summary_subtitle, r142, r142, i), remoteDocument);
            yp0.b.l(modelC2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelC2);
        } else if (remoteDocument2 != null) {
            RowDelegate.Model modelC3 = cv7.r.c("ID_PRODUCT_SUMMARY", cv7.r.e(bVar), cv7.r.d(bVar), remoteDocument2);
            yp0.b.l(modelC3, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelC3);
        }
        ArrayList arrayList = new ArrayList();
        List list = insuranceDetails.f18697h;
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("<this>", list);
        List<bu7.x> list2 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (bu7.x xVar : list2) {
            String str2 = xVar.f18746b;
            TextClause textClause = new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            bu7.o oVar = xVar.f18745a;
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            switch (xu7.a.f308974a[oVar.ordinal()]) {
                case 1:
                    i2 = R$drawable.uikit_icn_24_medical_cross;
                    break;
                case 2:
                    i2 = R$drawable.uikit_icn_24_tooth;
                    break;
                case 3:
                    i2 = R$drawable.uikit_icn_24_medical_bed;
                    break;
                case 4:
                    i2 = R$drawable.uikit_icn_24_globe;
                    break;
                case 5:
                    i2 = R$drawable.uikit_icn_24_time_and_money;
                    break;
                case 6:
                    i2 = R$drawable.uikit_icn_24_travel;
                    break;
                case 7:
                    i2 = R$drawable.uikit_icn_24_suitcase;
                    break;
                case 8:
                    i2 = R$drawable.uikit_icn_24_suitcase_insurance;
                    break;
                case 9:
                    i2 = R$drawable.uikit_icn_24_lightbulb;
                    break;
                case 10:
                    i2 = R$drawable.uikit_icn_24_reverted;
                    break;
                case 11:
                    i2 = R$drawable.uikit_icn_24_driving_licence;
                    break;
                case 12:
                    i2 = R$drawable.uikit_icn_24_shopping;
                    break;
                case 13:
                    i2 = R$drawable.uikit_icn_24_sport_equipment;
                    break;
                case 14:
                    i2 = R$drawable.uikit_icn_24_time;
                    break;
                case 15:
                    i2 = R$drawable.uikit_icn_24_profile;
                    break;
                case 16:
                    i2 = R$drawable.uikit_icn_24_info;
                    break;
                case 17:
                    i2 = R$drawable.uikit_icn_24_people;
                    break;
                case 18:
                    i2 = R$drawable.uikit_icn_24_smartphone_broken;
                    break;
                case 19:
                    i2 = R$drawable.uikit_icn_24_anonymous;
                    break;
                case 20:
                    i2 = R$drawable.uikit_icn_24_reverted;
                    break;
                case 21:
                    i2 = R$drawable.uikit_icn_24_snowflake;
                    break;
                case 22:
                    i2 = R$drawable.uikit_icn_24_voucher;
                    break;
                case 23:
                    i2 = R$drawable.uikit_icn_24_card;
                    break;
                default:
                    i2 = R$drawable.uikit_icn_24_insurance;
                    break;
            }
            arrayList2.add(new ListCellDelegate.Model(str2, new j8(new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.CENTER), null, textClause, false, null, null, 0, 0, 0, 0, 4068));
        }
        zhm.a0.x(arrayList2, arrayListY);
        yp0.b.k(arrayListY, 0, 0, 0, 0, 31);
        zhm.a0.x(arrayListY, arrayList);
        ArrayList arrayListA = cv7.s.a(insuranceDetails.f18696g);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        zhm.a0.x(arrayListA, arrayList);
        if (!arrayList.isEmpty()) {
            arrayList.add(0, new ListSubheaderDelegate.Model("ID_HEADER_COVERAGE_AND_LIMITS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_travel_details_title_coverage_and_limits, r142, r142, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434));
        }
        eVarB.addAll(arrayList);
        yj0 yj0Var = yj0.START;
        String str3 = x0Var.f18748b;
        eVarB.add(new TextDelegate.Model("ID_FOOTER", new TextClause(x0Var.f18749c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(yj0Var, str3 != null ? new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, 32, null, false, false, 491518) : r142), null, null, 0, 0, 0, 0, 2036));
        return new m(u.a(eVarB), new cv7.k(cv7.r.f(aVar), cv7.r.b(aVar), new aw0.k(4, new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_travel_state_active, r142, r142, i), new ResourceImage(R$drawable.uikit_icn_16_status_active, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246), false), u.c(new ActionsView.Item("ID_ACTION_ALL_DOCUMENTS", null, false, null, null, new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_details_action_all_documents, r142, r142, i), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_HELP", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124))), true);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        PlainTextDelegate.Model model;
        int i;
        boolean z;
        List list;
        Clause textLocalisedClause;
        cvi.f fVar = (cvi.f) this.f23528b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        AsftTerminal asftTerminal = (AsftTerminal) pair.f186385a;
        AsftConfig asftConfig = (AsftConfig) pair.f186386b;
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_travellers_title, null, null, 14);
        int i2 = com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_travellers_subtitle;
        int i3 = asftTerminal.f98739c;
        AsftPriceBreakdown asftPriceBreakdown = asftTerminal.k;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, u.c(Integer.valueOf(i3 + 1)), null, 12);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_16_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i5 = fVar.f109468c;
        Data data = fVar.f109466a;
        TextClause textClause = new TextClause(String.valueOf(i5), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        int i6 = fVar.f109468c;
        int i21 = asftTerminal.e;
        u8 u8Var = new u8("ID_TRAVELLERS_PICKER_ITEM", textLocalisedClause2, textLocalisedClause3, textClause, resourceImage, resourceImage2, i6 < i21, i6 > 1, null, 63874);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(u8Var);
        if (i21 == i6) {
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_max_travellers_number_error, u.c(Integer.valueOf(i21)), new Custom(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), 8);
            int i22 = R$attr.uikit_dp0;
            PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("ID_MAX_NUMBER_OF_TRAVELLERS_ERROR", (Clause) null, (Clause) textLocalisedClause4, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, i22, i22, 0, 0, 53230);
            int i32 = R$attr.uikit_dp0;
            yp0.b.r(model2, i32, i32, 0, 0, 12);
            model = model2;
        } else {
            model = null;
        }
        if (model != null) {
            eVarB.add(model);
        }
        String str = asftPriceBreakdown.e;
        dj0.d dVar = asftPriceBreakdown.f98736c;
        if (str == null) {
            list = f0.f322471a;
            z = true;
            i = 12;
        } else {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_your_pass, null, null, 14);
            int i33 = com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_terminals_card_price_with_plan;
            List listK = v.k(ivi.b.a(asftPriceBreakdown.f98734a), str);
            i = 12;
            CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_YOUR_PRICE_DETAILS", textLocalisedClause5, new TextLocalisedClause(i33, listK, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
            z = true;
            qv0.i[] elements = {model3, dVar != null ? new CellDetailsDelegate.Model("ID_GUEST_PRICE_DETAILS", new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_guest_pass, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_amount_per_person, u.c(ivi.b.a(dVar)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            list = listL;
        }
        eVarB.addAll(list);
        aim.e eVarA = u.a(eVarB);
        boolean z3 = (data.getLoading() || data.getError() != null) ? false : z;
        dj0.d dVar2 = asftPriceBreakdown.f;
        Integer num = asftConfig.d;
        String str2 = asftConfig.f98710a;
        int iIntValue = num != null ? num.intValue() : 0;
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_header_title, null, null, 14);
        if (iIntValue > 0 && dVar2 != null && dVar2.k() == z && dVar != null) {
            textLocalisedClause = new TextLocalisedQuantityClause(R$plurals.asft_number_of_travellers_header_free_companion_subtitle, Integer.valueOf(iIntValue), v.k(Integer.valueOf(iIntValue), str2, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), (Style) null, 24);
        } else if (!asftConfig.f98711b || dVar == null) {
            int i43 = asftTerminal.f98739c;
            textLocalisedClause = i43 > 0 ? new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_header_subtitle, u.c(Integer.valueOf(i43)), null, i) : null;
        } else {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_header_unlimited_subtitle, v.k(str2, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, i);
        }
        return new cvi.h(eVarA, z3, new lw0.a(textLocalisedClause6, textLocalisedClause, null, null, false, 28));
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        sa saVar;
        cw6.h hVar = (cw6.h) this.f23528b;
        FreelancerInvoice invoice = (FreelancerInvoice) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        FreelancerInvoiceNumberData freelancerInvoiceNumberData = hVar.f109547b;
        SelectableDelegate.Model model = null;
        if (freelancerInvoiceNumberData == null) {
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            return u.c(model2);
        }
        if (e0.w(invoice)) {
            saVar = new sa("LIST_ID_NUMBER_CHANGE_BANNER", (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_number_recurring_note_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_number_recurring_note_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        } else {
            saVar = null;
        }
        String str = freelancerInvoiceNumberData.f73399b;
        if (str == null) {
            str = "";
        }
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("LIST_ID_INPUT_PREFIX", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_number_input_prefix_title, null, null, 14), null, false, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_optional, null, null, 14), null, null, null, null, null, false, null, null, false, e0.r(invoice), 1, 0, null, false, false, null, true, v.k(cw6.n.f109557a, new InputFilter.LengthFilter(6), new InputFilter.AllCaps()), false, false, false, null, null, 0, -1612972168, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("LIST_ID_INPUT_NUMBER", new TextClause(freelancerInvoiceNumberData.f73398a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_number_input_number_title, null, null, 14), null, false, null, null, null, null, null, e0.r(invoice) ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, false, null, null, false, e0.r(invoice), 2, 0, null, false, false, null, true, v.k(cw6.n.f109558b, new InputFilter.LengthFilter(8)), false, false, false, null, null, 0, -1612980232, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        if (e0.r(invoice)) {
            SelectableDelegate.Model model5 = new SelectableDelegate.Model("LIST_ID_DEFAULT_SETTING_TOGGLE", new PlainTextDelegate.Model("LIST_ID_DEFAULT_SETTING_TEXT", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_number_input_make_default_title, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), freelancerInvoiceNumberData.f73400c ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            model = model5;
        }
        koi.j[] elements = {saVar, model3, model4, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        sa saVar;
        sa saVar2;
        Object obj5;
        Collection collectionG;
        cw7.l lVar = (cw7.l) this.f23528b;
        o0 policy = (o0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(policy, "policy");
        aim.e eVarB = u.b();
        l5 l5Var = policy.f76024c;
        Collection collectionG2 = null;
        if (l5Var != null) {
            saVar = new sa("ORDER_CARD_WIDGET_ID", (Clause) new TextClause(l5Var.f146787a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(l5Var.f146788b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new ActionsView.Item("ORDER_CARD_WIDGET_ACTION_ID", mx0.d.SEMIBLACK, false, null, null, new TextClause(l5Var.f146789c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, l5Var, null, 24476)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorTerracotta), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        } else {
            saVar = null;
        }
        eVarB.add(saVar);
        SchemeInsuranceActivateCoverageWidget schemeInsuranceActivateCoverageWidget = policy.d;
        if (schemeInsuranceActivateCoverageWidget != null) {
            saVar2 = new sa("ACTIVATE_COVERAGE_WIDGET_ID", (Clause) new TextClause(schemeInsuranceActivateCoverageWidget.f75965a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(schemeInsuranceActivateCoverageWidget.f75966b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new ActionsView.Item("ORDER_CARD_WIDGET_ACTION_ID", mx0.d.SEMIBLACK, false, null, null, new TextClause(schemeInsuranceActivateCoverageWidget.f75967c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, schemeInsuranceActivateCoverageWidget, null, 24476)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
        } else {
            saVar2 = null;
        }
        eVarB.add(saVar2);
        List list = policy.e;
        int i = 6;
        boolean z = false;
        if (list != null) {
            List<w5> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (w5 w5Var : list2) {
                String strQ = j6.a.q("POLICY_ROW_ID_", w5Var.f146858b);
                TextClause textClause = new TextClause(w5Var.f146858b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(w5Var.f146859c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(cw7.l.a(lVar, w5Var.f146857a, Integer.valueOf(R$attr.uikit_colorAccent)), z, z, i);
                gu7.v5 v5Var = w5Var.d;
                arrayList.add(new RowDelegate.Model(strQ, image24, textClause, null, 0, textClause2, null, null, 0, null, v5Var != null, null, false, null, null, null, null, null, null, v5Var, null, 0, 0, 0, 0, 532674520));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            obj5 = arrayList;
        } else {
            obj5 = null;
        }
        if (obj5 == null) {
            obj5 = f0.f322471a;
        }
        eVarB.addAll((Collection) obj5);
        h5 h5Var = policy.f;
        if (h5Var != null) {
            List<e5> list3 = h5Var.f146763b;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (e5 e5Var : list3) {
                String strQ2 = j6.a.q("COVERAGE_ID_", e5Var.f146740b);
                TextClause textClause3 = new TextClause(e5Var.f146740b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause4 = new TextClause(e5Var.f146741c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                RowDelegate.Model.MainImage.Image24 image242 = new RowDelegate.Model.MainImage.Image24(cw7.l.a(lVar, e5Var.f146739a, Integer.valueOf(R$attr.uikit_colorAccent)), z, z, i);
                tf tfVar = e5Var.d != null ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false) : null;
                q5 q5Var = e5Var.d;
                arrayList2.add(new RowDelegate.Model(strQ2, image242, textClause3, null, 0, textClause4, null, null, 0, tfVar, q5Var != null, null, false, null, null, null, null, null, null, q5Var, null, 0, 0, 0, 0, 532673496));
            }
            collectionG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("COVERAGE_HEADER_ID", (Image) null, (Clause) new TextClause(h5Var.f146762a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, R$attr.uikit_dp16, 0, 122);
        } else {
            collectionG = null;
        }
        if (collectionG == null) {
            collectionG = f0.f322471a;
        }
        eVarB.addAll(collectionG);
        b5 b5Var = policy.f76025g;
        if (b5Var != null) {
            List<y4> list4 = b5Var.f146719b;
            ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
            for (y4 y4Var : list4) {
                String strQ3 = j6.a.q("CONTACT_ID_", y4Var.f146870b);
                TextClause textClause5 = new TextClause(y4Var.f146870b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                RowDelegate.Model.MainImage.Image24 image243 = new RowDelegate.Model.MainImage.Image24(cw7.l.a(lVar, y4Var.f146869a, Integer.valueOf(R$attr.uikit_colorAccent)), z, z, i);
                tf tfVar2 = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false);
                w4 w4Var = y4Var.f146871c;
                arrayList3.add(new RowDelegate.Model(strQ3, image243, textClause5, null, 0, null, null, null, 0, ((w4Var instanceof s4) || (w4Var instanceof x4)) ? tfVar2 : null, false, null, false, null, null, null, null, null, null, w4Var, null, 0, 0, 0, 0, 532675576));
            }
            collectionG2 = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("CONTACT_HEADER_ID", (Image) null, (Clause) new TextClause(b5Var.f146718a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, R$attr.uikit_dp16, 0, 122);
        }
        if (collectionG2 == null) {
            collectionG2 = f0.f322471a;
        }
        eVarB.addAll(collectionG2);
        return new cw7.h(new UrlImage(policy.f76022a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new TextClause(policy.f76023b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d0.Z(u.a(eVarB)));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        SliderTitledView sliderTitledView = (SliderTitledView) this.f23528b;
        int iIntValue = ((Integer) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        Function1 function1 = sliderTitledView.onValueChangeListener;
        if (function1 != null) {
            function1.invoke(new cy0.a(iIntValue, zBooleanValue, zBooleanValue2));
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        czg.c cVar = (czg.c) this.f23528b;
        List contributors = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(contributors, "contributors");
        if (contributors.isEmpty()) {
            return u.c(new FullScreenStateDelegate.Model("widgetised-analytics-pnl-contributor-empty", new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_pnl_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_pnl_empty_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_coins, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
        }
        List listP0 = d0.P0(contributors, new czg.b());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        int i = 0;
        for (Object obj5 : listP0) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            rxg.j jVar = (rxg.j) obj5;
            dj0.d dVarD = jVar.d();
            qxg.b bVar = cVar.f110231a;
            int i3 = dVarD.f(dj0.d.e) ? R$attr.uikit_colorPerformancePositive : dVarD.k() ? R$attr.uikit_colorPerformanceStatic : R$attr.uikit_colorPerformanceNegative;
            String strN = a0.d.n("widgetised-analytics-pnl-contributor-", i);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(bVar.a(jVar), null, null, false, null, false, 60);
            Clause clauseB = bVar.b(jVar);
            Clause clauseC = bVar.c(jVar);
            RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(new MoneyClause(dVarD, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 6), new Custom(Integer.valueOf(i3), false, null, false, null, 254), null, 8), null, null, false, 126);
            oxg.l.Companion.getClass();
            arrayList.add(new RowDelegate.Model(strN, image40, clauseB, null, 0, clauseC, null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, oxg.f.a(jVar), null, 0, 0, 0, 0, 532675544));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Float, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v6 */
    private final Object o(Object obj2, Object obj3, Object obj4) {
        int i;
        Collection collectionK;
        ?? r332;
        int i2;
        RevPoints revPoints;
        dj0.d dVar;
        dj0.d dVarH;
        d2g.k kVar = (d2g.k) this.f23528b;
        lyf.e destinationDiscovery = (lyf.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(destinationDiscovery, "destinationDiscovery");
        Data data = kVar.f110809c;
        TravelExperienceDatesSelection travelExperienceDatesSelection = kVar.f110807a;
        ArrayList<lyf.f> attractions = destinationDiscovery.f;
        Intrinsics.checkNotNullParameter(attractions, "attractions");
        boolean z = false;
        ?? r102 = 0;
        if (attractions.isEmpty()) {
            collectionK = f0.f322471a;
            r332 = 0;
            i = 1;
        } else {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("TOP_ATTRACTIONS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_destination_discovery_subheader_top_attractions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            ArrayList arrayList = new ArrayList(w.t(attractions, 10));
            for (lyf.f fVar : attractions) {
                CenteredContentTileDelegate.Model.Companion aVar = CenteredContentTileDelegate.Model.INSTANCE;
                String listId = j6.a.q("TOP_ATTRACTION_ITEM_ID_", fVar.f200823a);
                TextClause title = new TextClause(fVar.f200824b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                UrlImage image = new UrlImage(fVar.f200825c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) r102, (Integer) r102, z, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                boolean z3 = z;
                g9 style = g9.f164371a;
                Intrinsics.checkNotNullParameter(style, "style");
                AvatarModel.Default avatarModel = new AvatarModel.Default(image, null, null, null, null, null, 102);
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(style, "style");
                CenteredContentTileDelegate.Model model2 = new CenteredContentTileDelegate.Model(listId, avatarModel, title, null, null, true, true, style, fVar, null, new c.e((qv0.h) null, 3), 0, 0, 0, 0, 522240);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model2);
                z = z3;
                r102 = 0;
            }
            boolean z4 = z;
            i = 1;
            hg hgVarA = f2g.a.a(arrayList);
            qv0.i[] iVarArr = new qv0.i[2];
            iVarArr[z4 ? 1 : 0] = model;
            iVarArr[1] = hgVarA;
            collectionK = v.k(iVarArr);
            r332 = z4;
        }
        Collection collection = collectionK;
        ArrayList arrayList2 = destinationDiscovery.f200821g;
        ArrayList arrayListS = t61.a.s("categorySection", arrayList2);
        for (Object obj5 : arrayList2) {
            if (!((lyf.b) obj5).f200817c.isEmpty()) {
                arrayListS.add(obj5);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayListS.iterator();
        while (it8.hasNext()) {
            lyf.b bVar = (lyf.b) it8.next();
            ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model(j6.a.q("CATEGORY_SECTION_TITLE_ITEM_ID_", bVar.f200815a), (Image) null, (Clause) new TextClause(bVar.f200816b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_common_action_see_all, null, null, 14), true, (Object) bVar, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
            String strQ = j6.a.q("CATEGORY_SECTION_ITEM_SCROLLER_ID_", bVar.f200815a);
            ArrayList arrayList4 = bVar.f200817c;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                lyf.a aVar2 = (lyf.a) it9.next();
                String strQ2 = j6.a.q("CATEGORY_SECTION_EXPERIENCE_ITEM_ID_", aVar2.f200812a);
                TextClause textClause = new TextClause(aVar2.f200813b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                hj hjVar = new hj(2);
                Data data2 = data;
                TravelExperiencesPricing travelExperiencesPricing = aVar2.d;
                Iterator it10 = it8;
                TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
                dj0.d dVar2 = travelExperiencesPricing.f93199b;
                Iterator it11 = it9;
                dj0.d dVar3 = (travelExperiencesPointsOption == null || (dVar = travelExperiencesPointsOption.f93196b) == null || (dVarH = pyd.c.H(dVar2, dVar)) == null) ? dVar2 : dVarH;
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var = o9.NON_SENSITIVE;
                VoucherSmallTileDelegate.Model model4 = new VoucherSmallTileDelegate.Model(strQ2, new zi(new UrlImage(aVar2.f200814c, null, null, null, 0L, null, null, null, null, null, true, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 503806), go0.PROGRESSIVE_BLUR), textClause, hjVar, null, null, null, new yi((travelExperiencesPointsOption == null || (revPoints = travelExperiencesPointsOption.f93195a) == null) ? null : nub.a.l(revPoints, o9Var, null, null, BitmapDescriptorFactory.HUE_RED, 62), new MoneyClause(dVar3, defaults, null, o9Var, 4)), null, null, null, false, null, null, aVar2, 261872);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                arrayList5.add(model4);
                data = data2;
                it8 = it10;
                it9 = it11;
            }
            Data data3 = data;
            Iterator it12 = it8;
            hg hgVarA2 = f2g.c.a(strQ, arrayList5);
            qv0.i[] iVarArr2 = new qv0.i[2];
            iVarArr2[r332] = model3;
            iVarArr2[i] = hgVarA2;
            zhm.a0.x(v.k(iVarArr2), arrayList3);
            data = data3;
            it8 = it12;
        }
        Data data4 = data;
        ArrayList arrayListE0 = d0.E0(arrayList3, collection);
        d2g.l lVar = new d2g.l(u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(destinationDiscovery.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), null, null, null)), new TextClause(destinationDiscovery.f200820c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection ? null : a1g.f.c(travelExperienceDatesSelection), new aw0.k(6, new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_destination_discovery_header_status_label, null, null, 14), null, r332), v.l(data4.getContent()));
        lyf.g gVar = destinationDiscovery.e;
        lyf.c cVar = gVar.f200827b;
        int i3 = gVar.f200826a;
        int i5 = z.f110831a[cVar.ordinal()];
        if (i5 == i) {
            i2 = com.revolut.feature.travel.experiences.api.R$plurals.experiences_destination_discovery_action_button_label_precise;
        } else {
            if (i5 != 2 && i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = com.revolut.feature.travel.experiences.api.R$plurals.experiences_destination_discovery_action_button_label_unprecise;
        }
        return new d2g.w(arrayListE0, lVar, new d2g.i(new TextLocalisedQuantityClause(i2, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), (Style) null, 24)));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        dj0.d dVarB;
        d4b.c cVar = (d4b.c) this.f23528b;
        MarginQuote content = (MarginQuote) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        l4i.a aVar = cVar.f111260a;
        Amount amount = content.d;
        Fee fee2 = content.f82116l;
        Amount amount2 = content.f82110a;
        if (e1.I(amount.f104717a)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            dVarB = l4i.a.b(Amount.a(amount2, ZERO));
        } else {
            dVarB = l4i.a.b(amount2);
        }
        MoneyClause moneyClause = new MoneyClause(dVarB, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
        Float fValueOf = Float.valueOf(12.0f);
        CompositeClause compositeClauseM = (e1.D(fee2.f82103a.f104717a) && e1.D(content.d.f104717a)) ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_order_form_hint_inc_fee, u.c(new MoneyClause(l4i.a.b(fee2.f82103a), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)), null, 12), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16))) : null;
        Clause[] elements = {moneyClause, compositeClauseM};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClauseF = v1.c.f(kotlin.collections.d.L(elements), null);
        d4b.a aVar2 = compositeClauseM != null ? d4b.a.f111259a : null;
        return new bw0.m(compositeClauseF, bw0.l.INFO, null, aVar2 != null, aVar2, 4);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        d4c.e eVar = (d4c.e) this.f23528b;
        List addressList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(addressList, "addressList");
        List<Address> list = addressList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Address address : list) {
            Address selectedAddress = eVar.f111273b;
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
            String strN = a0.d.n("ADDRESS_ITEM_LIST_ID_", address.hashCode());
            String[] elements = {address.getStreetLine1(), address.getStreetLine2(), address.getPostcode(), address.getCity(), cp5.c.f(address.getCountry())};
            Intrinsics.checkNotNullParameter(elements, "elements");
            String str = (String) d0.d0(kotlin.collections.d.L(elements));
            TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String[] elements2 = {address.getStreetLine1(), address.getStreetLine2(), address.getPostcode(), address.getCity(), cp5.c.f(address.getCountry())};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            arrayList.add(new SelectableDelegate.Model(strN, new RowDelegate.Model(strN, null, textClause, null, 0, new TextClause(d0.k0(d0.V(kotlin.collections.d.L(elements2), 1), null, null, null, 0, null, 63), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, new a4c.a(address), null, 0, 0, 0, 0, 532676570), address.equals(selectedAddress) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, null, null, false, 32744));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new d4c.h(arrayList, addressList.contains(eVar.f111273b));
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        Clause clauseA;
        Number numberValueOf;
        d74.n nVar = (d74.n) this.f23528b;
        ConsentPreferences preferences = (ConsentPreferences) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        ConsentPreferencesSelection consentPreferencesSelection = nVar.f111823a.f67282b;
        if (consentPreferencesSelection == null) {
            consentPreferencesSelection = new ConsentPreferencesSelection(preferences.f66434a.f66431a, preferences.f66435b.f66442a);
        }
        ConsentRetention.ActiveFacility activeFacility = consentPreferencesSelection.f66436a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_preferences_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_preferences_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_preferences_confirm, null, null, 14);
        ConsentRetention.Application application = consentPreferencesSelection.f66437b;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_preferences_active_credit_facility_title, null, null, 14);
        if (Intrinsics.f(activeFacility, ConsentRetention.ActiveFacility.Indefinitely.f66438a)) {
            clauseA = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_active_credit_facility_always, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        } else {
            if (!(activeFacility instanceof ConsentRetention.ActiveFacility.Until)) {
                throw new NoWhenBranchMatchedException();
            }
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = ((ConsentRetention.ActiveFacility.Until) activeFacility).f66439a;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(0);
            Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
            jVar.getClass();
            clauseA = com.revolut.core.ui_kit.models.j.a(localDate, dayAndMonth, custom);
        }
        CellDetailsDelegate.Model modelA = d74.n.a(activeFacility, "id_active_facility", textLocalisedClause4, clauseA);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_consents_preferences_incomplete_application_title, null, null, 14);
        if (application instanceof ConsentRetention.Application.DefaultDuration) {
            numberValueOf = Integer.valueOf(preferences.f66435b.f66443b);
        } else {
            if (!(application instanceof ConsentRetention.Application.Until)) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            numberValueOf = Long.valueOf(oc.c.h(localDateNow, ((ConsentRetention.Application.Until) application).f66441a));
        }
        Number number = numberValueOf;
        List listK = v.k(modelA, d74.n.a(application, "id_application", textLocalisedClause5, new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_consents_incomplete_application_default, number, u.c(number), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8)));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new d74.l(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, listK, true);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        t tVar = (t) this.f23528b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            if (!((jte.d) tVar.f111878c).c(JuniorAccountsApi$Toggles$YouthAccountEmptyState.f76698c)) {
                return new go.g(f0.f322471a, 2);
            }
            return new go.g(u.c(new vfe.a(new TextLocalisedClause(com.revolut.feature.tab.accounts.api.R$string.account_switcher_space_youth_title, null, null, 14), new ProductSpaceIdentifier.Youth(ProductSpaceIdentifier.Youth.State.Discover.f89756a), u.c(p.e))), 2);
        }
        List<vf8.a> listP0 = d0.P0(content, new a9j.f(new d78.s(), 18));
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (vf8.a profileExtended : listP0) {
            Intrinsics.checkNotNullParameter(profileExtended, "profileExtended");
            ProductSpaceIdentifier.Youth youth = new ProductSpaceIdentifier.Youth(new ProductSpaceIdentifier.Youth.State.Active(profileExtended.f288532a.f77103j));
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_account_switcher_kid_space_title, u.c(profileExtended.f288532a.f77099b), null, 12);
            aim.e eVarB = u.b();
            eVarB.add(p.e);
            sf8.h hVar = profileExtended.f288533b;
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            if (!Intrinsics.f(hVar, sf8.b.f262351a)) {
                if (profileExtended.d) {
                    eVarB.add(q.e);
                }
                if (profileExtended.f288534c) {
                    eVarB.add(pie.r.e);
                }
            }
            Unit unit = Unit.f186387a;
            arrayList.add(new vfe.a(textLocalisedClause, youth, u.a(eVarB)));
        }
        return new go.g(arrayList, 2);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.b bVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.b) this.f23528b;
        d7f.e details = (d7f.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        vel.l lVar = details.f111952a;
        del.b bVar2 = details.f111953b;
        RoboPortfolioInfo roboPortfolioInfo = details.f111954c;
        vel.j jVar = details.d;
        vel.k kVar = lVar.f288366c;
        dj0.d dVar = kVar.f288362a;
        dj0.d dVar2 = kVar.f288363b;
        dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
        Clause clauseB = sfl.b.b(bVar.f91345a, jVar.f288360a, jVar.f288361b, null, 24);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("PerformanceDetailsStateMapper_contributions", new t0((Clause) new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_investment_details_contributions, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("PerformanceDetailsStateMapper_withdrawals", new t0((Clause) new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_investment_details_withdrawals, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("PerformanceDetailsStateMapper_total_return", new t0((Clause) new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_investment_details_total_return, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), clauseB, null, PerformanceDetailsScreenContract$TitleClickParcel.TotalReturnInfo.f91339a, null, null, 0, null, false, false, null, null, 32696);
        List listK = v.k(model, model2);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        List listC = u.c(model3);
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new d7f.i(new MoneyClause(dVarQ, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), bVar.f91346b.c(roboPortfolioInfo), LayeredImage.INSTANCE.i(bVar.f91347c.g(n2l.i.f211591a), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), d0.E0(listC, listK));
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        d9j.h hVar = (d9j.h) this.f23528b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        Map map = (Map) pair.f186386b;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_CRYPTO_COLLECTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_featured_widget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp16, 0, 0, 57338);
        List list2 = list;
        ArrayList<xzg.d> arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xzg.k) it8.next()).c());
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (xzg.d dVar : arrayList) {
            xzg.g gVar = (xzg.g) map.get(dVar.f309976a);
            hVar.getClass();
            String strQ = j6.a.q("LIST_ID_CRYPTO_COLLECTIONS_CARD_", dVar.f309976a);
            f01.c cVar = hVar.f112397a;
            String str = dVar.f309979g;
            if (str == null) {
                str = "";
            }
            int iA = cVar.a(str);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            Integer numValueOf = Integer.valueOf(iA);
            if (iA == 0) {
                numValueOf = null;
            }
            vg vgVar = new vg(companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10));
            TextClause textClause2 = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (gVar != null) {
                textClause = xqi.a.c(gVar.f309991c.f310002a, false, false, false, false, false, CertificateBody.profileType);
            } else {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            SmallStockCardDelegate.Model model2 = new SmallStockCardDelegate.Model(strQ, vgVar, textClause2, new tg(textClause), dVar, null, null, null, null, 8160);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model2);
        }
        hVar.getClass();
        List listK = v.k(model, new hg("LIST_ID_CRYPTO_COLLECTIONS_SCROLLER", arrayList2, 2, new v4(180.0f), null, null, false, false, null, null, 0, 0, 0, 0, 32752));
        int i = R$attr.uikit_dp0;
        yp0.b.o(i, R$attr.uikit_dp16, i, i, listK);
        return listK;
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        da8.g gVar = (da8.g) this.f23528b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        com.revolut.feature.junior_profile.api.models.a aVar = (com.revolut.feature.junior_profile.api.models.a) pair.f186385a;
        od0.i iVar = (od0.i) pair.f186386b;
        aim.e eVarB = u.b();
        t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_full_name, null, null, 14), (Image) null, 0, false, 30);
        int i = com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_full_name_value;
        String str = gVar.f112477c;
        boolean z = gVar.f112478g;
        List listK = v.k(new CellDetailsDelegate.Model("ID_FULL_NAME", t0Var, new TextLocalisedClause(i, u.c(str + " " + gVar.d), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), null, null, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31736), new CellDetailsDelegate.Model("ID_DATE_OF_BIRTH", new t0((Clause) new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_date_of_birth, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_date_of_birth_value, u.c(new TimeClause(oc.c.F(aVar.getI()), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 30712), new CellDetailsDelegate.Model("ID_RELATIONSHIP", new t0((Clause) new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_relationship, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.youth_signup_details_relationship_parent, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712), new CellDetailsDelegate.Model("ID_ADDRESS", new t0((Clause) new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_address, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_address_value, u.c(AddressExtKt.formatInline(gVar.e)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), null, null, null, null, 4, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31224));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        zhm.a0.x(listK, eVarB);
        Set<Map.Entry> setEntrySet = gVar.f.entrySet();
        ArrayList arrayList = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            ConsentMechanics.OptOut optOut = (ConsentMechanics.OptOut) entry.getKey();
            arrayList.add(da8.r.a(optOut.f76951a, new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_consent, u.c(optOut.f76952b), null, 12), ((Boolean) entry.getValue()).booleanValue(), optOut));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        zhm.a0.x(arrayList, eVarB);
        SelectableDelegate.Model modelA = da8.r.a("ID_CHECKBOX_PERSONAL_DATA_ACCURATE", new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_signup_details_confirmation_confirmation_title, null, null, 14), z, null);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelA);
        Clause clause = (Clause) iVar.f224257a;
        if (clause != null) {
            eVarB.add(new ej("ID_TERMS", new mx0.c7(clause, false, null, 6)));
        }
        return new da8.j(u.a(eVarB), z);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        dah.j jVar = (dah.j) this.f23528b;
        p1 p1Var = (p1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(p1Var, "<destruct>");
        return q1.a(jVar.f112538a, p1Var.f318546a, p1Var.f318547b);
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        String str;
        int i;
        ResourceImage resourceImage;
        int i2;
        db.l lVar = (db.l) this.f23528b;
        ta.j userDetails = (ta.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(userDetails, "userDetails");
        String str2 = lVar.e;
        boolean loading = lVar.f112620a.getLoading();
        Set set = lVar.f;
        aim.e eVarB = u.b();
        ArrayList arrayList = userDetails.e;
        ta.d dVar = userDetails.f269078g;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj5 : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            ta.i iVar = (ta.i) obj5;
            ArrayList<ta.h> arrayList3 = iVar.f269074b;
            ArrayList arrayList4 = new ArrayList();
            for (ta.h hVar : arrayList3) {
                ta.e eVar = hVar.f269071b;
                String str3 = hVar.f269072c;
                int i6 = db.x.f112636b[eVar.ordinal()];
                boolean z = loading;
                if (i6 == 1) {
                    ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    i = R$attr.uikit_colorForeground;
                    resourceImage = resourceImage2;
                } else if (i6 == 2) {
                    ResourceImage resourceImage3 = new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    i = R$attr.uikit_colorForeground_60;
                    resourceImage = resourceImage3;
                } else if (i6 == 3) {
                    ResourceImage resourceImage4 = new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    i = R$attr.uikit_colorOrange;
                    resourceImage = resourceImage4;
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$attr.uikit_colorForeground_60;
                    resourceImage = null;
                }
                boolean z3 = Intrinsics.f(str3, str2) && z;
                ta.e eVar2 = hVar.f269071b;
                int i21 = i;
                boolean z4 = (eVar2 == ta.e.EDITABLE || eVar2 == ta.e.MISSING_INFO || eVar2 == ta.e.IN_REVIEW) && !z3;
                Boolean bool = hVar.d;
                Intrinsics.h(bool);
                ra.a aVar = new ra.a(bool.booleanValue(), str3);
                String strQ = j6.a.q("LIST_BLOCK_HEADER_ID", hVar.f269070a);
                TextClause textClause = new TextClause(hVar.f269070a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ArrayList arrayList5 = hVar.e;
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                Iterator it8 = arrayList5.iterator();
                while (it8.hasNext()) {
                    ta.g gVar = (ta.g) it8.next();
                    int i22 = db.x.f112635a[gVar.f269069b.ordinal()];
                    Iterator it9 = it8;
                    if (i22 == 1) {
                        i2 = R$attr.uikit_colorOrange;
                    } else if (i22 == 2) {
                        i2 = i21;
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$attr.uikit_colorStatusDanger;
                    }
                    TextClause textClause2 = new TextClause(gVar.f269068a, (Style) new Custom(Integer.valueOf(i2), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    arrayList6.add(z3 ? new c2(textClause2) : new b2(textClause2, null));
                    it8 = it9;
                }
                zhm.a0.x(u.c(new CellDetailsActionListDelegate.Model(strQ, textClause, null, resourceImage, arrayList6, z4, aVar, 132)), arrayList4);
                loading = z;
            }
            zhm.a0.x(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(a0.d.n("LIST_SECTION_HEADER_ID", i3), (Image) null, (Clause) new TextClause(iVar.f269073a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
            i3 = i5;
        }
        eVarB.addAll(arrayList2);
        if (dVar != null) {
            ArrayList arrayList7 = dVar.f269066a;
            ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
            int i32 = 0;
            for (Object obj6 : arrayList7) {
                int i33 = i32 + 1;
                if (i32 < 0) {
                    v.s();
                    throw null;
                }
                ta.c cVar = (ta.c) obj6;
                String strN = a0.d.n("CONSENT_ITEM_ID", i32);
                boolean zContains = set.contains(cVar);
                vd0 vd0Var = vd0.CHECKBOX;
                HtmlClause htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, cVar.f269064a);
                String str4 = cVar.f269065b;
                arrayList8.add(new SelectableDelegate.Model(strN, new RowDelegate.Model("CONSENT_ITEM_CONTENT_ID", null, htmlClause, null, 0, str4 != null ? new HtmlClause(0, 30, (Integer) null, (Object) null, str4) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, cVar, null, true, 31464));
                i32 = i33;
            }
            yp0.b.k(arrayList8, R$attr.uikit_dp24, 0, 0, 0, 30);
            eVarB.addAll(arrayList8);
        }
        if (dVar != null && (str = dVar.f269067b) != null) {
            eVarB.add(new TextDelegate.Model("CONSENT_NOTE_ID", new HtmlClause(0, 30, (Integer) null, (Object) null, str), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        return u.a(eVarB);
    }

    private final Object y(Object obj2, Object obj3, Object obj4) {
        dba.k kVar = (dba.k) this.f23528b;
        dba.g content = (dba.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.f112698b.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ITEM_ID", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_trusted_list_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D211", null, null, null, 30)), new l6(8, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_trusted_list_empty_state_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1988));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (f5j.a aVar : content.f112697a) {
            RowDelegate.Model modelX = RowDelegate.Model.x(kVar.f112704a.c(aVar, true), null, null, null, content.f112698b.get(aVar.f132329a) == g8a.u.PENDING ? new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_trusted_list_cell_subtitle_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10) : null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
            String str = aVar.f132333h;
            if (str == null || str.length() == 0) {
                arrayList.add(modelX);
            } else {
                arrayList2.add(modelX);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = arrayList2.isEmpty();
        RowDelegate.Model model = new RowDelegate.Model("ADD_TRUSTED_ACCOUNT_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_trusted_list_action_add_new, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ListSubheaderDelegate.Model model2 = !zIsEmpty ? new ListSubheaderDelegate.Model("INDIVIDUAL_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_trusted_list_subheader_individuals_accounts, u.c(Integer.valueOf(arrayList.size())), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null;
        ListSubheaderDelegate.Model model3 = !zIsEmpty2 ? new ListSubheaderDelegate.Model("BUSINESS_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_trusted_list_subheader_businesses_accounts, u.c(Integer.valueOf(arrayList2.size())), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null;
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        List listQ = i2b.a.q(model2, arrayList);
        if (zIsEmpty) {
            listQ = null;
        }
        List listQ2 = i2b.a.q(model, listQ);
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return i2b.a.o(listQ2, zIsEmpty2 ? null : i2b.a.q(model3, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x08ee A[PHI: r0
      0x08ee: PHI (r0v34 com.revolut.core.ui_kit.models.CompositeClause) = 
      (r0v33 com.revolut.core.ui_kit.models.CompositeClause)
      (r0v35 com.revolut.core.ui_kit.models.CompositeClause)
      (r0v36 com.revolut.core.ui_kit.models.CompositeClause)
      (r0v37 com.revolut.core.ui_kit.models.CompositeClause)
     binds: [B:226:0x09be, B:221:0x0992, B:216:0x094a, B:208:0x08ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0c65  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 3624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f23527a = i;
        this.f23528b = obj2;
    }

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f23527a = i;
        this.f23528b = obj3;
    }
}
