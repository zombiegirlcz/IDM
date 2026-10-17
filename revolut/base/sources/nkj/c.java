package nkj;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPortOutEligibility;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPortOutOptIn;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yy0.j;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f216815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okj.b f216816b;

    public c(z80.b phoneToolsProvider, okj.b esimPhoneNumberGrouper, e phoneNumberCircularBadgeMapper, f phoneNumberSubtitleMapper) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(esimPhoneNumberGrouper, "esimPhoneNumberGrouper");
        Intrinsics.checkNotNullParameter(phoneNumberCircularBadgeMapper, "phoneNumberCircularBadgeMapper");
        Intrinsics.checkNotNullParameter(phoneNumberSubtitleMapper, "phoneNumberSubtitleMapper");
        this.f216815a = phoneToolsProvider;
        this.f216816b = esimPhoneNumberGrouper;
    }

    public final RowDelegate.Model a(EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory phoneNumberCategory) {
        Clause textLocalisedClause;
        EsimSubscriptionPhoneNumberPortOutOptIn esimSubscriptionPhoneNumberPortOutOptIn;
        String strQ = j6.a.q("ID_PRIMARY_PHONE_NUMBER_", phoneNumberCategory.getF101234a().f100470a);
        CircleBadgeModel accentCircleBadge = null;
        TextClause textClause = new TextClause(z80.b.b(this.f216815a, phoneNumberCategory.getF101234a().f100472c, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(phoneNumberCategory, "phoneNumberCategory");
        EsimSubscriptionPhoneNumber phoneNumber = phoneNumberCategory.getF101234a();
        String str = phoneNumber.f;
        TextClause textClause2 = (str == null || str.length() == 0) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = phoneNumber.f100475j;
        Object[] elements = {textClause2, (esimSubscriptionPhoneNumberPortOutEligibility == null || (esimSubscriptionPhoneNumberPortOutOptIn = esimSubscriptionPhoneNumberPortOutEligibility.f100484c) == null || !esimSubscriptionPhoneNumberPortOutOptIn.f100486b) ? null : new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_released_subtitle, null, null, 14)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = (ArrayList) listL;
        Clause clauseF = arrayList.isEmpty() ? null : arrayList.size() == 1 ? (Clause) d0.b0(listL) : v1.c.f(listL, null);
        boolean z = phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInEligible;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_port_in_pending_subtitle, null, null, 14);
        } else if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInPending) {
            EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = ((EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInPending) phoneNumberCategory).f101227a.i;
            Instant instant = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.f : null;
            textLocalisedClause = instant != null ? new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_port_in_progress_on_date, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_port_in_progress_subtitle, null, null, 14);
        } else if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortOutPending) {
            EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting2 = ((EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortOutPending) phoneNumberCategory).f101229a.i;
            Instant instant2 = esimSubscriptionPhoneNumberPorting2 != null ? esimSubscriptionPhoneNumberPorting2.f : null;
            textLocalisedClause = f.a(clauseF, instant2 != null ? new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_port_out_progress_subtitle, u.c(new TimeClause(instant2.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12) : null);
        } else if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber) {
            EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber secondaryNumber = (EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber) phoneNumberCategory;
            if (secondaryNumber.f101235b) {
                textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_preparing_subtitle, null, null, 14);
            } else {
                Instant instant3 = secondaryNumber.f101234a.f100473g;
                textLocalisedClause = f.a(clauseF, instant3 != null ? new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_secondary_number_termination_active_until_subtitle, u.c(new TimeClause(instant3.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12) : null);
            }
        } else {
            if (!(phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PrimaryNumber)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = ((EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PrimaryNumber) phoneNumberCategory).f101233b ? new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_preparing_subtitle, null, null, 14) : f.a(clauseF, null);
        }
        LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_call, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        Intrinsics.checkNotNullParameter(phoneNumberCategory, "phoneNumberCategory");
        if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInPending) {
            accentCircleBadge = new AccentCircleBadge(dw0.a.Pending);
        } else if (z) {
            accentCircleBadge = new WarningCircleBadge(dw0.a.Suspicious);
        } else if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortOutPending) {
            accentCircleBadge = new AccentCircleBadge(dw0.a.Awaiting);
        } else if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber) {
            EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber secondaryNumber2 = (EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber) phoneNumberCategory;
            if (secondaryNumber2.f101235b) {
                accentCircleBadge = new AccentCircleBadge(dw0.a.Pending);
            } else if (secondaryNumber2.f101234a.f100473g != null) {
                accentCircleBadge = new WarningCircleBadge(dw0.a.Suspicious);
            }
        } else {
            if (!(phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PrimaryNumber)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PrimaryNumber) phoneNumberCategory).f101233b) {
                accentCircleBadge = new AccentCircleBadge(dw0.a.Pending);
            }
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(layeredImageI, accentCircleBadge, null, false, null, false, 60), textClause, null, 0, textLocalisedClause, null, null, 0, new tf(new j(new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, phoneNumberCategory, null, 0, 0, 0, 0, 532675544);
    }
}
