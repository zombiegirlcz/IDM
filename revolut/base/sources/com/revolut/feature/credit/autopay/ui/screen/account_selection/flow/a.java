package com.revolut.feature.credit.autopay.ui.screen.account_selection.flow;

import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.AutoPayExternalAccountFlowContract$Step;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.AccountSelectionScreen;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.AccountSelectionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import fk4.h;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends g implements ek4.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AutoPayExternalAccountFlowContract$InputData f68580t;
    public final AutoPayExternalAccountFlowContract$Step.Intro u;
    public final AutoPayExternalAccountFlowContract$EmptyState v;

    public a(AutoPayExternalAccountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f68580t = inputData;
        this.u = AutoPayExternalAccountFlowContract$Step.Intro.f68579a;
        this.v = AutoPayExternalAccountFlowContract$EmptyState.f68576a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AutoPayExternalAccountFlowContract$Step step = (AutoPayExternalAccountFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean zF = Intrinsics.f(step, AutoPayExternalAccountFlowContract$Step.Intro.f68579a);
        AutoPayExternalAccountFlowContract$InputData autoPayExternalAccountFlowContract$InputData = this.f68580t;
        if (zF) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(iy4.a.a(new TextLocalisedClause(R$string.credit_loan_autopay_external_linking_intro_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_autopay_external_linking_intro_subtitle, null, null, 14), autoPayExternalAccountFlowContract$InputData.f68577a, b.c("3D094", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, cd.PRIMARY, new TextLocalisedClause(R$string.credit_loan_autopay_external_linking_intro_confirm_button, null, null, 14), (489368 & 4096) != 0 ? null : null, (489368 & 65536) == 0));
            final int i = 1;
            Function1 block = new Function1(this) { // from class: ek4.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a f126957b;

                {
                    this.f126957b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof fk4.g;
                            com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a aVar = this.f126957b;
                            if (z) {
                                aVar.G2(new b(((fk4.g) output).f135709a));
                            } else {
                                if (!(output instanceof h.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.q2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c outputData = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z3 = outputData instanceof c.C0497c;
                            com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a aVar2 = this.f126957b;
                            if (z3) {
                                aVar2.E2(AutoPayExternalAccountFlowContract$Step.ExternalAccountsList.f68578a, false, null, false);
                            } else if (outputData instanceof c.a) {
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        if (!Intrinsics.f(step, AutoPayExternalAccountFlowContract$Step.ExternalAccountsList.f68578a)) {
            throw new NoWhenBranchMatchedException();
        }
        AccountSelectionScreen accountSelectionScreen = new AccountSelectionScreen(new AccountSelectionScreenContract$InputData(autoPayExternalAccountFlowContract$InputData.f68577a));
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: ek4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a f126957b;

            {
                this.f126957b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        h output = (h) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof fk4.g;
                        com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a aVar = this.f126957b;
                        if (z) {
                            aVar.G2(new b(((fk4.g) output).f135709a));
                        } else {
                            if (!(output instanceof h.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.q2();
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.full_screen_prompt.c outputData = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z3 = outputData instanceof c.C0497c;
                        com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a aVar2 = this.f126957b;
                        if (z3) {
                            aVar2.E2(AutoPayExternalAccountFlowContract$Step.ExternalAccountsList.f68578a, false, null, false);
                        } else if (outputData instanceof c.a) {
                            aVar2.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        accountSelectionScreen.H = function1;
        return accountSelectionScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
