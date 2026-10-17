package iij;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import fij.s;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cej.b f161624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f161625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGetPlanScreenContract$InputData f161626c;

    public b(cej.b mobilePlansFeatureAvailabilityInteractor, EsimGetPlanScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161624a = mobilePlansFeatureAvailabilityInteractor;
        this.f161625b = featureToggleInteractor;
        this.f161626c = inputData;
    }

    public final s a(Data userCompanyData) {
        Intrinsics.checkNotNullParameter(userCompanyData, "userCompanyData");
        EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = this.f161626c;
        EsimGiftRecipient esimGiftRecipient = esimGetPlanScreenContract$InputData.d;
        EsimGetPlanLaunchMode esimGetPlanLaunchMode = esimGetPlanScreenContract$InputData.f100995c;
        if (((d) this.f161625b).c(EsimApi$Toggles.EsimChangeDataPlan.f100170c)) {
            Intrinsics.checkNotNullParameter(esimGetPlanScreenContract$InputData, "<this>");
            if (esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.DataPlanChange) {
                return new s(new TextLocalisedClause(R$string.esim_data_plans_change_plan_title, null, null, 14), esimGiftRecipient != null ? new TextLocalisedClause(R$string.esim_data_plans_change_plan_subtitle_gifted, u.c(esimGiftRecipient.d), null, 12) : new TextLocalisedClause(R$string.esim_data_plans_change_plan_subtitle, null, null, 14));
            }
        }
        cej.b bVar = this.f161624a;
        if (esimGiftRecipient != null) {
            return new s(new TextLocalisedClause(((efj.d) bVar).a() ? R$string.esim_gifting_plan_selection_title : R$string.esim_gifting_plan_selection_data_plan_title, u.c(esimGiftRecipient.d), null, 12), null);
        }
        Intrinsics.checkNotNullParameter(esimGetPlanScreenContract$InputData, "<this>");
        if ((esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.PlanChange) || (esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.PlanUpgrade)) {
            return new s(R$string.esim_mobile_plans_change_plan_title);
        }
        l71.d dVar = (l71.d) userCompanyData.getContent();
        if (dVar != null) {
            return new s(dVar.a() == UserCompanyRegion.MX ? R$string.esim_get_data_plan_header_title_mx : ((efj.d) bVar).a() ? R$string.esim_purchase_title_mobile_plans : R$string.esim_purchase_title);
        }
        return null;
    }
}
