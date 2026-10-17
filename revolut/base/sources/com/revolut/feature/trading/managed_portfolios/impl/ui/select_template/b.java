package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template;

import android.os.Parcelable;
import aw0.n6;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$ModalStep;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$Page;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateControllerContract$InputData;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import cvi.j;
import d7j.o0;
import d8f.b0;
import d8f.i;
import d8f.n;
import emc.e;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import yji.l;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zjh.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements n {
    public final ManagedPortfolioSelectTemplateScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f91449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f91450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qmc.b f91451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f91452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f8f.e f91453t;
    public final f8f.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ali.b f91454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91455x;

    public b(ManagedPortfolioSelectTemplateScreenContract$InputData inputData, f portfolioInteractor, e templatesInteractor, qmc.b roboContextProvider, a templateDataProvider, f8f.e templateScreenDialogMapper, f8f.a templateRiskModalStepProvider, b0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(templateDataProvider, "templateDataProvider");
        Intrinsics.checkNotNullParameter(templateScreenDialogMapper, "templateScreenDialogMapper");
        Intrinsics.checkNotNullParameter(templateRiskModalStepProvider, "templateRiskModalStepProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f91449p = portfolioInteractor;
        this.f91450q = templatesInteractor;
        this.f91451r = roboContextProvider;
        this.f91452s = templateDataProvider;
        this.f91453t = templateScreenDialogMapper;
        this.u = templateRiskModalStepProvider;
        this.v = d.b(this, new i(f0.f322471a, null, null, null, null), stateMapper, null, false, 12);
        final int i = 0;
        this.f91454w = s.b(this, new Function2(this) { // from class: d8f.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b f112261b;

            {
                this.f112261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ?? r06;
                int i2;
                TextLocalisedClause textLocalisedClause;
                ActionsBottomSheetController actionsBottomSheetController;
                TextLocalisedClause textLocalisedClause2;
                int i3 = i;
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar = this.f112261b;
                switch (i3) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        ManagedPortfolioSelectTemplateScreenContract$Page tab2 = (ManagedPortfolioSelectTemplateScreenContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController = new ManagedPortfoliosSimpleTemplateController(new ManagedPortfoliosSimpleTemplateControllerContract$InputData(tab2.f91446a.f95706a, tab2.f91447b, tab2.f91448c, tab2.d));
                        d3i.k block = new d3i.k(bVar, tab2, 24);
                        Intrinsics.checkNotNullParameter(block, "block");
                        managedPortfoliosSimpleTemplateController.H = block;
                        return managedPortfoliosSimpleTemplateController;
                    default:
                        f8f.e eVar = bVar.f91453t;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        ManagedPortfolioSelectTemplateScreenContract$ModalStep step = (ManagedPortfolioSelectTemplateScreenContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog) {
                            ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog confirmChangeDialog = (ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog) step;
                            Template selectedTemplate = confirmChangeDialog.f91440a;
                            Template recommendedTemplate = confirmChangeDialog.f91441b;
                            ilc.a roboContext = confirmChangeDialog.f91442c;
                            eVar.getClass();
                            Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
                            Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
                            Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                            int i5 = R$string.wealth_robo_settings_change_template_dialog_title;
                            nmc.d dVar = eVar.f132770a;
                            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i5, zhm.u.c(dVar.g(selectedTemplate)), null, 12);
                            int i6 = f8f.d.f132769a[roboContext.ordinal()];
                            if (i6 == 1) {
                                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description, null, null, 14);
                                lw0.a aVar = new lw0.a(textLocalisedClause3, textLocalisedClause2, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                                k9 k9Var = k9.RoboAdvisor;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                                d3i.k block2 = new d3i.k(bVar, step, 25);
                                Intrinsics.checkNotNullParameter(block2, "block");
                                actionsBottomSheetController.H = block2;
                            } else if (i6 != 2) {
                                if (i6 != 3 && i6 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description, null, null, 14);
                                lw0.a aVar2 = new lw0.a(textLocalisedClause3, textLocalisedClause2, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                                aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                                k9 k9Var2 = k9.RoboAdvisor;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                                d3i.k block22 = new d3i.k(bVar, step, 25);
                                Intrinsics.checkNotNullParameter(block22, "block");
                                actionsBottomSheetController.H = block22;
                            } else {
                                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description_sg, zhm.v.k(dVar.g(recommendedTemplate), dVar.g(selectedTemplate)), null, 12);
                                lw0.a aVar22 = new lw0.a(textLocalisedClause3, textLocalisedClause2, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                                aw0.h hVar22 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                                k9 k9Var22 = k9.RoboAdvisor;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator22 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar22, hVar22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var22, "value", k9Var22), null, null, 24));
                                d3i.k block222 = new d3i.k(bVar, step, 25);
                                Intrinsics.checkNotNullParameter(block222, "block");
                                actionsBottomSheetController.H = block222;
                            }
                        } else {
                            if (!(step instanceof ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog riskDialog = (ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog) step;
                            ilc.a roboContext2 = riskDialog.f91445c;
                            Template selectedTemplate2 = riskDialog.f91443a;
                            Template recommendedTemplate2 = riskDialog.f91444b;
                            nmc.d dVar2 = eVar.f132770a;
                            Intrinsics.checkNotNullParameter(roboContext2, "roboContext");
                            Intrinsics.checkNotNullParameter(selectedTemplate2, "selectedTemplate");
                            Intrinsics.checkNotNullParameter(recommendedTemplate2, "recommendedTemplate");
                            int i21 = f8f.d.f132769a[roboContext2.ordinal()];
                            if (i21 == 1) {
                                r06 = 0;
                                i2 = 12;
                                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_upgrade_warning_names_only, zhm.v.k(dVar2.g(selectedTemplate2), dVar2.g(recommendedTemplate2)), null, 12);
                            } else {
                                if (i21 != 2) {
                                    if (i21 == 3 || i21 == 4) {
                                        throw new IllegalStateException("No risk dialog for EEA supported");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                r06 = 0;
                                i2 = 12;
                                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_change_warning_sg, zhm.v.k(dVar2.g(selectedTemplate2), new NumberClause(selectedTemplate2.f95707b.a(), (NumberClause.Format.Compact) null, (Custom) null, 6), dVar2.g(recommendedTemplate2), new NumberClause(recommendedTemplate2.f95707b.a(), (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
                            }
                            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.wealth_robo_portfolio_about_title, r06, r06, 14), textLocalisedClause, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                            aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_select_portfolio, zhm.u.c(dVar2.g(selectedTemplate2)), null, i2), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_common_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                            k9 k9Var3 = k9.RoboAdvisor;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                            d3i.k block3 = new d3i.k(bVar, riskDialog, 26);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            actionsBottomSheetController.H = block3;
                        }
                        return actionsBottomSheetController;
                }
            }
        });
        final int i2 = 1;
        this.f91455x = hx7.e.a(this, new Function2(this) { // from class: d8f.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b f112261b;

            {
                this.f112261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ?? r06;
                int i22;
                TextLocalisedClause textLocalisedClause;
                ActionsBottomSheetController actionsBottomSheetController;
                TextLocalisedClause textLocalisedClause2;
                int i3 = i2;
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar = this.f112261b;
                switch (i3) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        ManagedPortfolioSelectTemplateScreenContract$Page tab2 = (ManagedPortfolioSelectTemplateScreenContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController = new ManagedPortfoliosSimpleTemplateController(new ManagedPortfoliosSimpleTemplateControllerContract$InputData(tab2.f91446a.f95706a, tab2.f91447b, tab2.f91448c, tab2.d));
                        d3i.k block = new d3i.k(bVar, tab2, 24);
                        Intrinsics.checkNotNullParameter(block, "block");
                        managedPortfoliosSimpleTemplateController.H = block;
                        return managedPortfoliosSimpleTemplateController;
                    default:
                        f8f.e eVar = bVar.f91453t;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        ManagedPortfolioSelectTemplateScreenContract$ModalStep step = (ManagedPortfolioSelectTemplateScreenContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog) {
                            ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog confirmChangeDialog = (ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog) step;
                            Template selectedTemplate = confirmChangeDialog.f91440a;
                            Template recommendedTemplate = confirmChangeDialog.f91441b;
                            ilc.a roboContext = confirmChangeDialog.f91442c;
                            eVar.getClass();
                            Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
                            Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
                            Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                            int i5 = R$string.wealth_robo_settings_change_template_dialog_title;
                            nmc.d dVar = eVar.f132770a;
                            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i5, zhm.u.c(dVar.g(selectedTemplate)), null, 12);
                            int i6 = f8f.d.f132769a[roboContext.ordinal()];
                            if (i6 == 1) {
                                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description, null, null, 14);
                                lw0.a aVar22 = new lw0.a(textLocalisedClause3, textLocalisedClause2, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                                aw0.h hVar22 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                                k9 k9Var22 = k9.RoboAdvisor;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator22 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar22, hVar22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var22, "value", k9Var22), null, null, 24));
                                d3i.k block222 = new d3i.k(bVar, step, 25);
                                Intrinsics.checkNotNullParameter(block222, "block");
                                actionsBottomSheetController.H = block222;
                            } else if (i6 != 2) {
                                if (i6 != 3 && i6 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description, null, null, 14);
                                lw0.a aVar222 = new lw0.a(textLocalisedClause3, textLocalisedClause2, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                                aw0.h hVar222 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                                k9 k9Var222 = k9.RoboAdvisor;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator222 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar222, hVar222, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var222, "value", k9Var222), null, null, 24));
                                d3i.k block2222 = new d3i.k(bVar, step, 25);
                                Intrinsics.checkNotNullParameter(block2222, "block");
                                actionsBottomSheetController.H = block2222;
                            } else {
                                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description_sg, zhm.v.k(dVar.g(recommendedTemplate), dVar.g(selectedTemplate)), null, 12);
                                lw0.a aVar2222 = new lw0.a(textLocalisedClause3, textLocalisedClause2, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                                aw0.h hVar2222 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                                k9 k9Var2222 = k9.RoboAdvisor;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator2222 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2222, hVar2222, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2222, "value", k9Var2222), null, null, 24));
                                d3i.k block22222 = new d3i.k(bVar, step, 25);
                                Intrinsics.checkNotNullParameter(block22222, "block");
                                actionsBottomSheetController.H = block22222;
                            }
                        } else {
                            if (!(step instanceof ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog riskDialog = (ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog) step;
                            ilc.a roboContext2 = riskDialog.f91445c;
                            Template selectedTemplate2 = riskDialog.f91443a;
                            Template recommendedTemplate2 = riskDialog.f91444b;
                            nmc.d dVar2 = eVar.f132770a;
                            Intrinsics.checkNotNullParameter(roboContext2, "roboContext");
                            Intrinsics.checkNotNullParameter(selectedTemplate2, "selectedTemplate");
                            Intrinsics.checkNotNullParameter(recommendedTemplate2, "recommendedTemplate");
                            int i21 = f8f.d.f132769a[roboContext2.ordinal()];
                            if (i21 == 1) {
                                r06 = 0;
                                i22 = 12;
                                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_upgrade_warning_names_only, zhm.v.k(dVar2.g(selectedTemplate2), dVar2.g(recommendedTemplate2)), null, 12);
                            } else {
                                if (i21 != 2) {
                                    if (i21 == 3 || i21 == 4) {
                                        throw new IllegalStateException("No risk dialog for EEA supported");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                r06 = 0;
                                i22 = 12;
                                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_change_warning_sg, zhm.v.k(dVar2.g(selectedTemplate2), new NumberClause(selectedTemplate2.f95707b.a(), (NumberClause.Format.Compact) null, (Custom) null, 6), dVar2.g(recommendedTemplate2), new NumberClause(recommendedTemplate2.f95707b.a(), (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
                            }
                            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.wealth_robo_portfolio_about_title, r06, r06, 14), textLocalisedClause, new lw0.b(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182), null), null, false, 24);
                            aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_select_portfolio, zhm.u.c(dVar2.g(selectedTemplate2)), null, i22), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 504), new n6(new TextLocalisedClause(R$string.wealth_robo_common_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 504), null, null, null, 121);
                            k9 k9Var3 = k9.RoboAdvisor;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                            d3i.k block3 = new d3i.k(bVar, riskDialog, 26);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            actionsBottomSheetController.H = block3;
                        }
                        return actionsBottomSheetController;
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f91454w;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91455x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        ManagedPortfolioSelectTemplateScreenContract$InputData managedPortfolioSelectTemplateScreenContract$InputData = this.o;
        l.b1(this, mo3.a.g(rd0.e.n(nim.a.v(u0.i(rd0.e.b(this.f91449p.B(managedPortfolioSelectTemplateScreenContract$InputData.getF91439a(), w4l.i.f294643c)), this.f91450q.e(managedPortfolioSelectTemplateScreenContract$InputData.getF91439a()), this.f91451r.a()), new d34.b(this, 22)), h0.f322473a), null, new o0(12), 1), null, new j(this, (Continuation) null, 29), 3);
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.v;
    }
}
