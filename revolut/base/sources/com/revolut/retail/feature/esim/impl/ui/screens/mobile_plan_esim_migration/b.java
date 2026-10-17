package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanEsimMigrationScreenContract$InputData f101217a;

    public b(EsimMobilePlanEsimMigrationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101217a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plan_esim_migration_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plan_esim_migration_subtitle, null, null, 14), new lw0.b(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D363", null, null, null, 30), null), null, false, 24);
        RowDelegate.Model model = new RowDelegate.Model("ID_NEW_PLANS_INFO", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D363", null, null, null, 30), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_migration_new_plans_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
        EsimMobilePlanEsimMigrationScreenContract$InputData.ActiveDataPlanExists activeDataPlanExists = EsimMobilePlanEsimMigrationScreenContract$InputData.ActiveDataPlanExists.f101215a;
        EsimMobilePlanEsimMigrationScreenContract$InputData esimMobilePlanEsimMigrationScreenContract$InputData = this.f101217a;
        if (Intrinsics.f(esimMobilePlanEsimMigrationScreenContract$InputData, activeDataPlanExists)) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_esim_migration_esim_state_active_plans_title, null, null, 14);
        } else {
            if (!Intrinsics.f(esimMobilePlanEsimMigrationScreenContract$InputData, EsimMobilePlanEsimMigrationScreenContract$InputData.NoActiveDataPlan.f101216a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_esim_migration_esim_state_no_active_plans_title, null, null, 14);
        }
        List listK = v.k(model, new RowDelegate.Model("ID_ESIM_STATE", image24, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.esim_mobile_plan_esim_migration_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, aVar);
    }
}
