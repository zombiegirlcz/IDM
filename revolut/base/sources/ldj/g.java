package ldj;

import android.os.Parcelable;
import au0.o0;
import au0.u0;
import au0.x0;
import aw0.ka;
import aw0.o9;
import aw0.s8;
import aw0.t0;
import aw0.x4;
import aw0.y4;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.j;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategoryWithImage;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreenContract$ActionParcel;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.am;
import ip0.ej;
import ip0.go0;
import ip0.o40;
import ip0.r40;
import ip0.yj0;
import j19.a1;
import j19.b1;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import jel.b0;
import jel.h0;
import jel.k0;
import jh2.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m75.k;
import m9d.e0;
import m9d.m1;
import m9d.o1;
import md3.a;
import mx0.c7;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import pcd.g0;
import pcd.s;
import q35.v;
import q35.x;
import q35.z;
import yp0.r;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194156a;

    public /* synthetic */ g(int i) {
        this.f194156a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        int i;
        LayeredImage layeredImageI;
        int i2;
        Object textLocalisedClause;
        int i3;
        z refinancedCreditsList = (z) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
        aim.e eVarB = u.b();
        ArrayList<x> arrayList = refinancedCreditsList.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (x xVar : arrayList) {
            aim.e eVarB2 = u.b();
            String str = xVar.f241841a;
            String str2 = xVar.f;
            dj0.d dVar = xVar.f241842b;
            String strQ = j6.a.q("loan_refinanced_credit:", str);
            int i5 = k.f203332b[xVar.f241843c.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_bank, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                layeredImageI = LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue_5, Integer.valueOf(R$attr.uikit_colorBlack), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(30.0f), 48);
            }
            LayeredImage layeredImage = layeredImageI;
            int i6 = R$drawable.uikit_icn_16_check;
            int i21 = R$attr.uikit_colorGreen;
            int i22 = R$attr.uikit_colorWhite;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(layeredImage, LayeredImage.INSTANCE.d(i6, i21, i22, Integer.valueOf(i22), 2.0f, 2.0f, Float.valueOf(12.0f)), null, false, 28);
            switch (k.f203331a[xVar.d.ordinal()]) {
                case 1:
                    i2 = R$string.loan_refinancing_credit_personal_loan;
                    break;
                case 2:
                    i2 = R$string.loan_refinancing_credit_secured_loan;
                    break;
                case 3:
                    i2 = R$string.loan_refinancing_credit_consumer_loan;
                    break;
                case 4:
                    i2 = R$string.loan_refinancing_credit_credit_line;
                    break;
                case 5:
                    i2 = R$string.loan_refinancing_credit_leasing;
                    break;
                case 6:
                    i2 = R$string.loan_refinancing_credit_mortgage;
                    break;
                case 7:
                    i2 = R$string.loan_refinancing_credit_refurbishment_loan;
                    break;
                case 8:
                    i2 = R$string.loan_refinancing_credit_car_loan;
                    break;
                case 9:
                    i2 = R$string.loan_refinancing_credit_credit_card;
                    break;
                case 10:
                    i2 = R$string.loan_refinancing_credit_overdraft;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
            ArrayList arrayList3 = arrayList;
            pf pfVar = new pf(new TextLocalisedClause(R.string.common_action_details, null, null, 14), null, null, false, new n75.a(xVar), null, 478);
            Object[] elements = {str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, sx4.f.b(3, null, null, dVar)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            eVarB2.add(new RowDelegate.Model(strQ, image40, textLocalisedClause2, null, 0, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, new n75.a(xVar), null, 0, 0, 0, 0, 532673496));
            if (xVar.e == v.Fallback) {
                int i32 = R$string.loan_refinancing_credit_details_npo_cash_transfer_failed_title;
                MoneyClause moneyClauseB = sx4.f.b(3, null, null, dVar);
                if (str2 != null) {
                    textLocalisedClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    i3 = 14;
                } else {
                    i3 = 14;
                    textLocalisedClause = new TextLocalisedClause(R$string.loan_refinancing_credit_details_external_bank_name_fallback, null, null, 14);
                }
                eVarB2.add(new r40("transfer-failed-id", null, new TextLocalisedClause(i32, zhm.v.k(moneyClauseB, textLocalisedClause), null, 12), new TextLocalisedClause(R$string.loan_refinancing_credit_details_npo_cash_transfer_failed_description, null, null, i3), null, null, R$attr.uikit_colorGreyTone10, false, null, 0, R$attr.uikit_dp12, 0, null, 15282));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.loan_refinancing_credit_details_npo_cash_transfer_success_title, u.c(sx4.f.b(3, null, null, dVar)), null, 12);
                ZonedDateTime zonedDateTime = xVar.f241845h;
                eVarB2.add(new r40("fallback-to-revolut-id", null, textLocalisedClause3, zonedDateTime != null ? new TimeClause(zonedDateTime.toEpochSecond() * 1000, new TimeClause.Format.Pretty(0), null, null, 12) : null, null, null, R$attr.uikit_colorStatusSuccess, false, null, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, null, 14770));
            }
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            arrayList2.add(eVarA);
            arrayList = arrayList3;
        }
        ArrayList arrayList4 = arrayList;
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            eVarB.addAll((Collection) it8.next());
        }
        if (!arrayList4.isEmpty()) {
            Iterator it9 = arrayList4.iterator();
            while (true) {
                if (it9.hasNext()) {
                    if (((x) it9.next()).f241843c == q35.u.NpoCash) {
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "<this>");
                        if (arrayList4.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it10 = arrayList4.iterator();
                            i = 0;
                            while (it10.hasNext()) {
                                if (((x) it10.next()).f241843c == q35.u.NpoCash && (i = i + 1) < 0) {
                                    zhm.v.r();
                                    throw null;
                                }
                            }
                        }
                        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_REFINANCING_IN_PROGRESS_WARNING", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(R$string.loan_refinancing_credit_details_npo_cash_warning_description, null, null, 14), new TextLocalisedClause(R$string.loan_refinancing_credit_details_npo_cash_warning_learn_more_link, null, new Click(28, (Integer) null, (Object) new n75.b(i), "ID_REFINANCING_IN_PROGRESS_WARNING", false), 10))), false, new ImageClause(R$drawable.uikit_icn_24_exclamation_mark_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), null, null, null, true, new n75.b(i), null, 0, 134168524);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(model);
                    }
                }
            }
        }
        return u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        f7d.h content = (f7d.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof f7d.g)) {
            if (content instanceof f7d.f) {
                return o1.b();
            }
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_title_header, null, null, 14);
        boolean z = false;
        TrackableClause trackableClauseA = p9d.i.a(new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_title_header, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), z, z, 254), 10));
        f7d.g gVar = (f7d.g) content;
        f7d.e eVar = gVar.f132596b;
        String str = gVar.f132595a;
        int i = m1.f203727a[eVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_welcome_morning, u.c(str), null, 12);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_welcome_afternoon, u.c(str), null, 12);
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_title_greeting, null, null, 14);
                return new e0(textLocalisedClause2, trackableClauseA, textLocalisedClause3);
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_welcome_evening, u.c(str), null, 12);
        }
        textLocalisedClause2 = textLocalisedClause;
        return new e0(textLocalisedClause2, trackableClauseA, textLocalisedClause3);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Optional content = (Optional) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        g7d.a aVar = (g7d.a) gj7.b.m(content);
        if (aVar == null) {
            return f0.f322471a;
        }
        List listC = u.c(new RowDelegate.Model("KYC_ISSUE_ITEM_ID", new RowDelegate.Model.MainImage.Image56((Image) com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), (CircleBadgeModel) null, false, 14), aVar.f141180a, null, 0, aVar.f141181b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Alias alias = (Alias) obj2;
        ((Boolean) obj3).getClass();
        aim.e eVarB = u.b();
        if (alias != null) {
            CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("LIST_ID_PAYID", new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_payid_cell_payid_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(alias.f61879b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_payid_cell_name_title, null, null, 14);
            String str = alias.d.f61881a;
            if (str == null) {
                str = "";
            }
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("LIST_ID_NAME", textLocalisedClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Quote quote = (Quote) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new CellDetailsDelegate.Model("EXCHANGE_RATE_ITEM_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_checkout_exchange_breakdown_exchanged_amount, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(quote.f84400c, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        DonationSchedule schedule = (DonationSchedule) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        LocalDate localDate = schedule.f72099b;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ID_START_DATE", new TimeClause(jli.b.b(localDate), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_recurring_schedule_selection_start_date, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_cal, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("ITEM_ID_PERIOD", ic6.c.b(schedule.f72098a), new TextLocalisedClause(com.revolut.feature.period_chooser.R$string.period_chooser_common_word_repeat, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return new mc6.i(ic6.c.a(schedule), zhm.v.k(model, modelA));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        Boolean boolValueOf;
        ActionWidgetDelegate.Model model;
        TextLocalisedClause textLocalisedClause2;
        Boolean boolValueOf2;
        a.b revPointsBanner = (a.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(revPointsBanner, "revPointsBanner");
        md3.b bVar = revPointsBanner instanceof md3.b ? (md3.b) revPointsBanner : null;
        if (bVar == null) {
            return f0.f322471a;
        }
        uc3.f fVar = bVar.f204476a;
        uc3.e eVar = fVar.f278979a;
        Instant instant = fVar.f278980b;
        if (eVar == uc3.e.ACTIVE || eVar == uc3.e.UNKNOWN) {
            return f0.f322471a;
        }
        uc3.a aVar = (uc3.a) d0.d0(((md3.b) revPointsBanner).f204477b);
        boolean z = eVar == uc3.e.DEPRECATED || eVar == uc3.e.TERMINATED;
        int i = md3.c.f204479a[bVar.f204478c.ordinal()];
        if (i == 1) {
            TextLocalisedClause textLocalisedClause3 = z ? new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_deprecated_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_opted_in_title, null, null, 14);
            if (z) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_deprecated_subtitle, null, null, 14);
            } else if (instant != null) {
                int i2 = com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_opted_in_subtitle_with_date;
                long epochMilli = instant.toEpochMilli();
                TimeClause.Format.INSTANCE.getClass();
                textLocalisedClause = new TextLocalisedClause(i2, u.c(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12)), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_opted_in_subtitle, null, null, 14);
            }
            if (aVar != null) {
                boolValueOf = Boolean.valueOf(aVar.f278974b.i > 0);
            } else {
                boolValueOf = null;
            }
            model = new ActionWidgetDelegate.Model("ID_POCKET_REV_POINTS_BANNER", textLocalisedClause3, textLocalisedClause, new m(hd3.a.f151383a, (LayeredImage) null, (ProgressStyle) null, 6), null, (z && pd.b.j(boolValueOf)) ? new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_box_action_withdraw, null, null, 14), new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_action_view_points_title, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE) : new j(new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_action_view_points_title, null, null, 14), null, 14), null, aVar, null, false, 8016);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause4 = z ? new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_deprecated_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_not_opted_in_title, null, null, 14);
            if (z) {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_deprecated_not_opted_in_subtitle, null, null, 14);
            } else if (instant != null) {
                int i3 = com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_not_opted_in_subtitle_with_date;
                long epochMilli2 = instant.toEpochMilli();
                TimeClause.Format.INSTANCE.getClass();
                textLocalisedClause2 = new TextLocalisedClause(i3, u.c(new TimeClause(epochMilli2, TimeClause.Format.f57959a, null, null, 12)), null, 12);
            } else {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_not_opted_in_subtitle, null, null, 14);
            }
            if (aVar != null) {
                boolValueOf2 = Boolean.valueOf(aVar.f278974b.i > 0);
            } else {
                boolValueOf2 = null;
            }
            model = new ActionWidgetDelegate.Model("ID_POCKET_REV_POINTS_BANNER", textLocalisedClause4, textLocalisedClause2, new m(hd3.a.f151383a, (LayeredImage) null, (ProgressStyle) null, 6), null, (z && pd.b.j(boolValueOf2)) ? new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_box_action_withdraw, null, null, 14), new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_action_get_started_title, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE) : new j(new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_points_banner_action_get_started_title, null, null, 14), null, 14), null, aVar, null, false, 8016);
        }
        List listC = u.c(model);
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        CellDetailsActionDelegate.Model model;
        k0 k0Var;
        dj0.d dVar;
        java.time.LocalDate localDate;
        b0 fundDetails = (b0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(fundDetails, "fundDetails");
        h0 h0Var = fundDetails.d;
        CellDetailsDelegate.Model model2 = (h0Var == null || (localDate = h0Var.d) == null) ? null : new CellDetailsDelegate.Model("FUND_PERFORMANCE_ABOUT_LAUNCH_DATE", new t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_about_launch_date, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oc.c.F(localDate), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 28664);
        CellDetailsDelegate.Model model3 = (h0Var == null || (dVar = h0Var.f) == null) ? null : new CellDetailsDelegate.Model("FUND_PERFORMANCE_ABOUT_FUND_SIZE", new t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_about_fund_size, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 28664);
        if (h0Var == null || (k0Var = h0Var.f173455a) == null) {
            model = null;
        } else {
            if (mgh.b.f205278a[k0Var.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            model = new CellDetailsActionDelegate.Model("FUND_PERFORMANCE_ABOUT_FUND_TYPE", new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_about_fund_type, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_about_fund_type_open_ended, null, null, 14), false, true, null, FundPerformanceScreenContract$ActionParcel.ShowOpenEndedFundInfo.f95830a, 0, 0, 32160);
        }
        Object[] elements = {model2, model3, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return !listL.isEmpty() ? yp0.b.d(listL, new ListSubheaderDelegate.Model("FUND_PERFORMANCE_ABOUT_GROUP_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_about_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2) : listL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v20 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List listV0;
        List list;
        Object model;
        am amVar;
        hg hgVar;
        int i = 6;
        int i2 = 3;
        int i3 = 2;
        int i5 = 0;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        switch (this.f194156a) {
            case 0:
                ncj.c priceTargetsInfo = (ncj.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(priceTargetsInfo, "priceTargetsInfo");
                ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("COMMENTARY_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_details_commentary_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List list2 = priceTargetsInfo.f214224a.f214223c;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                int i6 = 0;
                for (Object obj5 : list2) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    ncj.a priceTargetItem = (ncj.a) obj5;
                    BigDecimal bigDecimal = priceTargetsInfo.f214225b.f249048c;
                    String str = "COMMENTARY_SECTION_TARGET" + i6;
                    Intrinsics.checkNotNullParameter(priceTargetItem, "priceTargetItem");
                    java.time.LocalDate localDate = priceTargetItem.d;
                    Intrinsics.checkNotNullParameter(localDate, "localDate");
                    TimeClause timeClause = new TimeClause(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
                    dj0.d dVar = priceTargetItem.f214219b;
                    dj0.d dVar2 = priceTargetItem.f214220c;
                    dj0.d dVar3 = priceTargetItem.f214218a;
                    Clause compositeClause = (dVar2 == null || dVar3 == null) ? null : new CompositeClause(zhm.v.k(jdj.a.a(dVar2, false), new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), jdj.a.a(dVar3, false)), null, null, null, 14);
                    if (compositeClause == null) {
                        compositeClause = jdj.a.a(dVar, false);
                    }
                    Clause clauseW = yoj.b.w(yoj.b.w(timeClause, new DotDividerClause((Integer) null)), compositeClause);
                    String str2 = priceTargetItem.e;
                    arrayList.add(new r40(str, null, clauseW, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, pyd.c.j(dVar).compareTo(bigDecimal) >= 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative, false, new o40(false), 0, 0, 0, null, 15922));
                    i6 = i21;
                }
                if (arrayList.isEmpty()) {
                    return f0.f322471a;
                }
                yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
                return i2b.a.q(model2, arrayList);
            case 1:
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List list3 = content;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(ni2.a.b((n) it8.next()));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 2:
                CFACInsuranceDetails insurance = (CFACInsuranceDetails) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(insurance, "insurance");
                return u.c(new TextDelegate.Model("ID_ITEM_INSURER", new TextClause(insurance.f74990c.f74992b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(yj0.START, new UrlImage(insurance.f74990c.f74991a, null, null, null, 0L, null, null, null, null, null, false, null, null, Integer.valueOf(SyslogConstants.LOG_CLOCK), false, false, 458750)), null, null, 0, 0, 0, 0, 2036));
            case 3:
                f19.g suggestedForYou = (f19.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(suggestedForYou, "suggestedForYou");
                List list4 = suggestedForYou.f131192b;
                if (list4.isEmpty()) {
                    list4 = null;
                }
                if (list4 != null && (listV0 = d0.V0(list4, 5)) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i22 = 0;
                    for (Object obj6 : listV0) {
                        int i32 = i22 + 1;
                        if (i22 < 0) {
                            ?? r272 = listK;
                            zhm.v.s();
                            throw r272;
                        }
                        j19.k kVar = (j19.k) obj6;
                        if (kVar instanceof b1) {
                            b1 slot = (b1) kVar;
                            String placementId = suggestedForYou.f131191a;
                            Intrinsics.checkNotNullParameter(slot, "slot");
                            Intrinsics.checkNotNullParameter(placementId, "placementId");
                            a1 a1Var = slot.d;
                            String str3 = slot.f170173a;
                            if (a1Var == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String strQ = j6.a.q("HERO_BANNER_ITEM_ID_", str3);
                            TextClause textClause = new TextClause(a1Var.f170167a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            list = listK;
                            TextClause textClause2 = new TextClause(a1Var.f170168b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            UrlMedia urlMedia = new UrlMedia(a1Var.f170169c);
                            int i33 = hom.d.f154354a[a1Var.d.ordinal()];
                            if (i33 == z) {
                                amVar = am.DARK;
                            } else if (i33 == i3) {
                                amVar = am.LIGHT;
                            } else {
                                if (i33 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                amVar = am.AUTO;
                            }
                            am amVar2 = amVar;
                            k19.c cVar = a1Var.e;
                            String str4 = cVar.f180147a;
                            k19.d0 d0Var = cVar.f180148b;
                            model = new HeroBannerDelegate.Model(strQ, (Clause) textClause, (Clause) textClause2, (Media) urlMedia, (HeroBannerDelegate.b) null, true, amVar2, (Object) new m19.a(str3, str4, d0Var != null ? d0Var.f180151a : list, new zn.c(Integer.valueOf(i32), Integer.valueOf(i32), a1Var.f170169c, placementId, a1Var.f, null)), (AnalyticsContext) null, 1360);
                        } else {
                            list = listK;
                            model = list;
                        }
                        if (model != null) {
                            arrayList3.add(model);
                        }
                        i22 = i32;
                        listK = list;
                        i3 = 2;
                        z = true;
                    }
                    gg.b bVar = new gg.b(listV0.size() > 1, 2);
                    int i43 = R$attr.uikit_dp8;
                    List listC = u.c(new hg("HERO_BANNER_CAROUSEL_LIST_ITEM_ID", arrayList3, 1, x4.c.f10604a, null, bVar, false, false, null, null, i43, i43, 0, 0, 26576));
                    if (listC != null) {
                        return listC;
                    }
                }
                return f0.f322471a;
            case 4:
                ((Boolean) obj3).booleanValue();
                return ((tsl.a) obj2).f274171a.f104508b;
            case 5:
                List vaults = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                List<s> list5 = vaults;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                for (s sVar : list5) {
                    String str5 = sVar.f234881a;
                    g0 g0Var = sVar.f234885h;
                    arrayList4.add(new RowDelegate.Model(str5, new RowDelegate.Model.MainImage.Image40(ft6.n.a(sVar.e), null, null, false, null, false, 62), new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new MoneyClause(new dj0.d(g0Var.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, sVar, null, 0, 0, 0, 0, 532676568));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return arrayList4;
            case 6:
                List content2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                List list6 = content2;
                ArrayList arrayList5 = new ArrayList(w.t(list6, 10));
                Iterator it9 = list6.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(nvf.h.b((TransitTicket) it9.next()));
                }
                ArrayList arrayListS = d0.S(arrayList5, 2);
                ArrayList arrayList6 = new ArrayList(w.t(arrayListS, 10));
                for (Object obj7 : arrayListS) {
                    int i59 = i5 + 1;
                    if (i5 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    String strN = a0.d.n("SECTION_BOX_ID_", i5);
                    SmallCardDelegate.INSTANCE.getClass();
                    arrayList6.add(new hg(strN, (List) obj7, 2, new y4(SmallCardDelegate.f53351j), null, gg.a.f54220a, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28608));
                    i5 = i59;
                }
                return arrayList6;
            case 7:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list7 = (List) pair.f186386b;
                if (list7.isEmpty()) {
                    return yp0.b.g(u.c(new RowDelegate.Model("list_id_no_saved_lounges", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_heart_outline, new Color.Solid(R$attr.uikit_colorGreyTone50), new Color.Solid(R$attr.uikit_colorGreyTone50_10)), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_saved_lounges_no_saved_lounges, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856)), lxi.h.b(false), null, 0, 0, 126);
                }
                if (list7.size() == 1) {
                    hgVar = new hg("ID_SAVED_LOUNGES_SCROLLER_ITEM", u.c(lxi.h.a((svi.b) d0.b0(list7))), 1, new y4(new aw0.d0(340, 180)), null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
                } else {
                    gg.b bVar2 = new gg.b(list7.size() > 2, 2);
                    List list8 = list7;
                    ArrayList arrayList7 = new ArrayList(w.t(list8, 10));
                    Iterator it10 = list8.iterator();
                    while (it10.hasNext()) {
                        arrayList7.add(lxi.h.a((svi.b) it10.next()));
                    }
                    hgVar = new hg("ID_SAVED_LOUNGES_SCROLLER_ITEM", arrayList7, 2, new y4(new aw0.d0(168, 180)), null, bVar2, false, false, null, null, 0, 0, 0, 0, 32720);
                }
                return yp0.b.g(u.c(hgVar), lxi.h.b(list7.size() > 2), null, 0, 0, 126);
            case 8:
                FreelancerProfileSettings settings = (FreelancerProfileSettings) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(settings, "settings");
                aim.e eVarB = u.b();
                eVarB.add(new ListSubheaderDelegate.Model("ITEM_ID_SETTLEMENT_TIME_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_terms_sections_settlement_time, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z6 ? 1 : 0, z4 ? 1 : 0, i), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458));
                t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_terms_sections_settlement_time_input, null, null, 14), (Image) null, 0, false, 30);
                int i66 = (int) (settings.e / ((long) DateTimeConstants.SECONDS_PER_HOUR));
                int i74 = i66 / 24;
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ITEM_ID_SETTLEMENT_DELAY", t0Var, i74 <= 1 ? new TextLocalisedQuantityClause(R$plurals.freelancer_merchant_terms_sections_settlement_time_delay_hour, Integer.valueOf(i66), (List) null, (Style) null, 28) : new TextLocalisedQuantityClause(R$plurals.freelancer_merchant_terms_sections_settlement_time_delay_day, Integer.valueOf(i74), (List) null, (Style) null, 28), null, null, null, null, 0, null, false, false, null, null, 30712);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model3);
                eVarB.add(new ListSubheaderDelegate.Model("ITEM_ID_MERCHANT_FEES_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_terms_sections_merchant_fees, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                RowDelegate.Model model4 = new RowDelegate.Model("ITEM_ID_PAYMENT_ACCEPTANCE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z3 ? 1 : 0, z ? 1 : 0, 6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_terms_sections_merchant_fees_input, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model4);
                return new m07.h(u.a(eVarB));
            case 9:
                List content3 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                List<e12.d> list9 = content3;
                ArrayList arrayList8 = new ArrayList(w.t(list9, 10));
                for (e12.d dVar4 : list9) {
                    arrayList8.add(new RowDelegate.Model(dVar4.f121850a, dVar4.e, dVar4.f121851b, null, 0, dVar4.f121852c, dVar4.d, null, 0, dVar4.f, false, null, false, null, null, null, null, null, null, dVar4.f121853g, null, 0, 0, 0, 0, 532675480));
                }
                yp0.b.k(arrayList8, 0, 0, 0, 0, 31);
                return new m22.b(arrayList8);
            case 10:
                List content4 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                if (content4.isEmpty()) {
                    return f0.f322471a;
                }
                ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model("RECENTLY_VIEWED_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_home_discover_recently_viewed, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List list10 = content4;
                ArrayList arrayList9 = new ArrayList(w.t(list10, 10));
                int i92 = 0;
                for (Object obj8 : list10) {
                    int i96 = i92 + 1;
                    if (i92 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    nyf.c cVar2 = (nyf.c) obj8;
                    String strN2 = a0.d.n("RECENTLY_VIEWED_ITEM_ID_", i92);
                    TextClause textClause3 = new TextClause(cVar2.f220867b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str6 = cVar2.f220868c;
                    VoucherSmallTileDelegate.Model model6 = new VoucherSmallTileDelegate.Model(strN2, new zi(new UrlImage(cVar2.d, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282), go0.PROGRESSIVE_BLUR), textClause3, null, null, str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, null, null, null, false, null, null, cVar2, 262104);
                    yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                    arrayList9.add(model6);
                    i92 = i96;
                }
                return zhm.v.k(model5, new hg("RECENTLY_VIEWED_SCROLLER_ITEM_ID", arrayList9, 2, new y4(m2g.a.f202003a), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656));
            case 11:
                ld6.f context = (ld6.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                if (!(context instanceof ld6.c)) {
                    return f0.f322471a;
                }
                wi0.b bVar3 = ((ld6.c) context).f194034a;
                wi0.b.Companion.getClass();
                return Intrinsics.f(bVar3, wi0.b.f297734c) ? u.c(new ej("EXPERIENCES_DISCLAIMER_ITEM_ID", new c7(new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_discover_section_footer_uae, null, null, 14), false, null, 6))) : Intrinsics.f(bVar3, wi0.b.M0) ? u.c(new ej("EXPERIENCES_DISCLAIMER_ITEM_ID", new c7(new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_discover_section_footer_israel, null, null, 14), false, null, 6))) : f0.f322471a;
            case 12:
                myf.i content5 = (myf.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content5, "content");
                ListSubheaderDelegate.Model model7 = new ListSubheaderDelegate.Model("RECOMMENDED_CATEGORIES_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_discover_section_things_to_do_title, u.c(content5.f210475b.f92889b), null, 12), (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_common_action_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z12 ? 1 : 0, z11 ? 1 : 0, z, i2), false, false, (Object) content5, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 56234);
                ArrayList arrayList10 = content5.f210474a;
                ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                int i99 = 0;
                for (Object obj9 : arrayList10) {
                    int i100 = i99 + 1;
                    if (i99 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    TravelExperienceCategoryWithImage travelExperienceCategoryWithImage = (TravelExperienceCategoryWithImage) obj9;
                    VoucherSmallTileDelegate.Model model8 = new VoucherSmallTileDelegate.Model(a0.d.n("RECOMMENDED_CATEGORIES_ITEM_ID_", i99), new zi(new UrlImage(travelExperienceCategoryWithImage.f92811c, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282), go0.PROGRESSIVE_BLUR), new TextClause(travelExperienceCategoryWithImage.f92810b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, null, null, null, false, null, null, new n2g.a(content5.f210475b, travelExperienceCategoryWithImage), 262136);
                    yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                    arrayList11.add(model8);
                    i99 = i100;
                }
                listK = arrayList10.isEmpty() ? null : zhm.v.k(model7, new hg("RECOMMENDED_CATEGORIES_SCROLLER_ITEM_ID", arrayList11, 2, new y4(m2g.d.f202005a), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656));
                return listK == null ? f0.f322471a : listK;
            case 13:
                e16.b account = (e16.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(account, "account");
                return u.c(new ListSubheaderDelegate.Model("DeFiTransferAssetsScreen_AccountNameSubheader", (Image) null, (Clause) new TextClause(account.f121887b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            case 14:
                return a(obj2, obj3, obj4);
            case 15:
                String title = (String) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                return new m8d.w(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 16:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(profile, "profile");
                return new m98.h(new TextLocalisedClause(com.revolut.feature.junior.card_request.impl.R$string.junior_redesigned_card_request_header_title, u.c(profile.f77099b), null, 12), new TextLocalisedClause(com.revolut.feature.junior.card_request.impl.R$string.junior_redesigned_card_request_header_subtitle, null, null, 14));
            case 17:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                return Boolean.TRUE;
            case 18:
                f7d.h content6 = (f7d.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content6, "content");
                if (content6 instanceof f7d.g) {
                    return new m9d.g0(new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_title_header, null, null, 14), p9d.i.a(new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_screen_help_welcome_hi, u.c(((f7d.g) content6).f132595a), null, 12)));
                }
                if (content6 instanceof f7d.f) {
                    return o1.c();
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                Optional content7 = (Optional) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content7, "content");
                if (content7.isPresent()) {
                    return (Image) content7.get();
                }
                return null;
            case 20:
                return b(obj2, obj3, obj4);
            case 21:
                return c(obj2, obj3, obj4);
            case 22:
                List content8 = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content8, "content");
                return content8;
            case 23:
                return d(obj2, obj3, obj4);
            case 24:
                return e(obj2, obj3, obj4);
            case 25:
                return g(obj2, obj3, obj4);
            case 26:
                return h(obj2, obj3, obj4);
            case 27:
                List items = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(items, "items");
                return items;
            case 28:
                return i(obj2, obj3, obj4);
            default:
                hfg.g0 content9 = (hfg.g0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content9, "content");
                TextClause textClause4 = new TextClause(content9.f151842g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_travel, new ImageClauseTint.Color(R$attr.uikit_colorGrey50), (Float) null, (Float) null, 28);
                TextClause textClause5 = new TextClause(content9.f151843h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_flight_details_screen, u.c(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(textClause4, imageClause, textClause5))), null, 12);
                NavBarWithContainerBackground.ImageBackground imageBackground = new NavBarWithContainerBackground.ImageBackground(new UrlImage(content9.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14);
                x0 x0Var = new x0(textClause4, imageClause, textClause5);
                com.revolut.core.ui_kit.models.j jVar = aw0.c7.Companion;
                java.time.LocalDate localDate2 = content9.f151839a.f151817c.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                return new khg.i(textLocalisedClause, u.c(new u0(imageBackground, x0Var, new o0(new CompositeClause(zhm.v.k(com.revolut.core.ui_kit.models.j.b(jVar, localDate2, new LocalDateClause$DateFormat.DateMedium(0)), new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_one_way, null, null, 14)), new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), null)));
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f194156a = i;
    }
}
