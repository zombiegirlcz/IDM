package dkk;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.FeatureTagData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import dcl.m0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f115624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si7.a f115625b;

    public v(ang.f userInteractor, si7.a insuranceInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f115624a = userInteractor;
        this.f115625b = insuranceInteractor;
    }

    public static PlanFeatureResource a(hha.u uVar, dj0.d dVar) {
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        return new PlanFeatureResource(uVar, new TextLocalisedClause(R$string.dashboard_feature_purchase_protection_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_restructured_feature_purchase_protection_subtitle, zhm.u.c(moneyClause), null, 12), R$drawable.uikit_icn_24_shopping, (FeatureTagData) null, 34);
    }

    public static PlanFeatureResource b() {
        hha.u.Companion.getClass();
        return new PlanFeatureResource(hha.u.K, new TextLocalisedClause(R$string.dashboard_feature_purchase_security_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_purchase_security_subtitle, null, null, 14), R$drawable.uikit_icn_24_shopping, (FeatureTagData) null, 34);
    }

    public final efm.r c(dl7.a aVar, ti7.d dVar) {
        return nim.a.w(si7.a.a(this.f115625b), new m0(aVar, dVar, 21));
    }
}
