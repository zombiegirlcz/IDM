package xjj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPacPortOutEligibility;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPortOutEligibility;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPlanChange;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f306532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd.o f306533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bnj.d f306534c;

    public d(gte.a featureToggleInteractor, ynj.p esimPhoneNumberStateResolver, ynj.m esimInstallationStateResolver, nd.o esimAnalyticsContextResolver, bnj.g shareActionItemMapper, bnj.d detailsActionItemMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(esimPhoneNumberStateResolver, "esimPhoneNumberStateResolver");
        Intrinsics.checkNotNullParameter(esimInstallationStateResolver, "esimInstallationStateResolver");
        Intrinsics.checkNotNullParameter(esimAnalyticsContextResolver, "esimAnalyticsContextResolver");
        Intrinsics.checkNotNullParameter(shareActionItemMapper, "shareActionItemMapper");
        Intrinsics.checkNotNullParameter(detailsActionItemMapper, "detailsActionItemMapper");
        this.f306532a = featureToggleInteractor;
        this.f306533b = esimAnalyticsContextResolver;
        this.f306534c = detailsActionItemMapper;
    }

    public static ActionsView.Item b(List list) {
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        EsimPhoneNumberSelections esimPhoneNumberSelections = list != null ? (EsimPhoneNumberSelections) d0.d0(list) : null;
        if (((esimPhoneNumberSelections == null || (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) == null) ? null : esimPhoneNumberSelectionOptions.f100405b) != null) {
            return new ActionsView.Item("ID_ADD_PHONE_NUMBER", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_add_number, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32670);
        }
        return null;
    }

    public static ActionsView.Item c() {
        mx0.e eVar = null;
        ms0.m mVar = null;
        String str = null;
        Float f = null;
        return new ActionsView.Item("ID_MOBILE_PLAN_BILLING", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_billing, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, eVar, mVar, false, str, f, null, null, 32670);
    }

    public static ActionsView.Item f() {
        mx0.e eVar = null;
        ms0.m mVar = null;
        String str = null;
        Float f = null;
        return new ActionsView.Item("ID_MOBILE_PLAN_INVOICES", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_billing_billing_item_invoices, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_receipt, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, eVar, mVar, false, str, f, null, null, 32670);
    }

    public static ActionsView.Item g(t1 t1Var) {
        EsimSubscriptionPhoneNumberPacPortOutEligibility esimSubscriptionPhoneNumberPacPortOutEligibility;
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = t1Var.f113657m;
        if (esimSubscriptionPhoneNumber == null) {
            return null;
        }
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = esimSubscriptionPhoneNumber.f100475j;
        if (pd.b.j((esimSubscriptionPhoneNumberPortOutEligibility == null || (esimSubscriptionPhoneNumberPacPortOutEligibility = esimSubscriptionPhoneNumberPortOutEligibility.f100482a) == null) ? null : Boolean.valueOf(esimSubscriptionPhoneNumberPacPortOutEligibility.f100481a))) {
            return new ActionsView.Item("ID_MOBILE_PLAN_REQUEST_PAC", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_request_pac, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_heart_broken, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, esimSubscriptionPhoneNumber, null, 24478);
        }
        return null;
    }

    public static ActionsView.Item i(t1 t1Var) {
        return new ActionsView.Item("ID_MOBILE_PLAN_TRANSFER_ESIM_TO_CURRENT_DEVICE", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_transfer_to_this_device_cta, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_send, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, t1Var.e, null, 24478);
    }

    public static ActionsView.Item j(List list) {
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        EsimPhoneNumberSelections esimPhoneNumberSelections = list != null ? (EsimPhoneNumberSelections) d0.d0(list) : null;
        EsimPhoneNumberPorting esimPhoneNumberPorting = (esimPhoneNumberSelections == null || (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) == null) ? null : esimPhoneNumberSelectionOptions.f100404a;
        if (pd.b.j(esimPhoneNumberPorting != null ? Boolean.valueOf(esimPhoneNumberPorting.f100331a) : null)) {
            return new ActionsView.Item("ID_MOBILE_PLAN_PORTABILITY_CREATION", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_transfer_number, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32670);
        }
        return null;
    }

    public static ActionsView.Item k(t1 t1Var) {
        return new ActionsView.Item("ID_MOBILE_PLAN_UNFREEZE", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unfreeze, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_snowflake, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, t1Var.e, null, 24478);
    }

    public static ActionsView.Item l(t1 t1Var) {
        EsimSubscriptionPlanChange esimSubscriptionPlanChange = t1Var.O;
        if (esimSubscriptionPlanChange == null || !esimSubscriptionPlanChange.f100495a || !esimSubscriptionPlanChange.f100496b) {
            return null;
        }
        return new ActionsView.Item("ID_MOBILE_PLAN_UPGRADE", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_upgrade, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_upgrade, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, t1Var, null, 24478);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.z a(dej.t1 r29, dm0.b r30, java.util.List r31, java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xjj.d.a(dej.t1, dm0.b, java.util.List, java.util.List):ip0.z");
    }

    public final ActionsView.Item d(List list) {
        if (!ynj.p.e(list)) {
            return null;
        }
        mx0.e eVar = null;
        ms0.m mVar = null;
        String str = null;
        Float f = null;
        return new ActionsView.Item("ID_MOBILE_PLAN_PORTABILITY_CONFIRMATION", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_confirm_transfer_details_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, eVar, mVar, false, str, f, null, null, 32670);
    }

    public final ActionsView.Item e(t1 t1Var, dm0.b bVar, List list) {
        if (!ynj.m.b(t1Var, bVar, list)) {
            return null;
        }
        return new ActionsView.Item("ID_MOBILE_PLAN_ESIM_INSTALL", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_install_esim, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, t1Var.e, this.f306533b.j(t1Var, list), 8094);
    }

    public final ActionsView.Item h(t1 t1Var, dm0.b bVar, List list) {
        if (ynj.m.a(t1Var.e, bVar, list == null ? f0.f322471a : list)) {
            return null;
        }
        return new ActionsView.Item("ID_MOBILE_PLAN_RESTART", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_restart_plan, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_refresh, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32670);
    }
}
