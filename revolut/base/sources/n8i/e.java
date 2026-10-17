package n8i;

import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.PlanSelectionFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f213420b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f213419a = i;
        this.f213420b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.a) this.f213420b;
        yki.l FlowCoordinator = (yki.l) obj2;
        PlanSelectionFlowContract$Step step = (PlanSelectionFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PlanSelectionFlowContract$Step.SelectPlan)) {
            throw new NoWhenBranchMatchedException();
        }
        nik.c cVar = aVar.o;
        PlanFilter planFilter = cVar.f216275a;
        PlanSelection planSelection = cVar.f216276b;
        xfa.b bVar = cVar.f216277c;
        nik.d dVar = cVar.d;
        PlanSelectionCoreFlow planSelectionCoreFlow = new PlanSelectionCoreFlow(new jhk.c(planFilter, planSelection, bVar, new jhk.j(dVar.f216278a, true, dVar.f216279b, dVar.f216280c), new jhk.k(true), false, cVar.e, 32));
        nfj.l block = new nfj.l(aVar, 14);
        Intrinsics.checkNotNullParameter(block, "block");
        planSelectionCoreFlow.H = block;
        return planSelectionCoreFlow;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a) this.f213420b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        WaitingListFlowContract$Step step = (WaitingListFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, WaitingListFlowContract$Step.JoinWaitingList.f68518a)) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(iy4.a.a(new TextLocalisedClause(R$string.credit_waiting_list_join_title, null, null, 14), new TextLocalisedClause(R$string.credit_waiting_list_join_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D304", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, cd.PRIMARY, new TextLocalisedClause(R$string.credit_waiting_list_join_button_primary, null, null, 14), (489368 & 4096) != 0 ? null : null, (489368 & 65536) == 0));
            final int i = 1;
            Function1 block = new Function1() { // from class: nj4.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar2 = aVar;
                    com.revolut.feature.full_screen_prompt.c outputData = (com.revolut.feature.full_screen_prompt.c) obj4;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof c.C0497c) {
                                oki.h.D2(aVar2.f68522r);
                            } else {
                                int i3 = jli.h.f175850a;
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof c.C0497c) {
                                aVar2.l2(new f(aVar2, null, 0), new yi5.b(26));
                            } else {
                                int i5 = jli.h.f175850a;
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        if (!Intrinsics.f(step, WaitingListFlowContract$Step.WaitingListSubscribed.f68519a)) {
            throw new NoWhenBranchMatchedException();
        }
        FullScreenPromptScreen fullScreenPromptScreen2 = new FullScreenPromptScreen(iy4.a.a(new TextLocalisedClause(R$string.credit_waiting_list_subscribed_title_already_subscribed, null, null, 14), new TextLocalisedClause(R$string.credit_waiting_list_subscribed_alreadySubscribedSubtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D304", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, cd.PRIMARY, new TextLocalisedClause(R$string.credit_waiting_list_subscribed_alreadySubscribedButton, null, null, 14), (489368 & 4096) != 0 ? null : null, (489368 & 65536) == 0));
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: nj4.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i2;
                com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar2 = aVar;
                com.revolut.feature.full_screen_prompt.c outputData = (com.revolut.feature.full_screen_prompt.c) obj4;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof c.C0497c) {
                            oki.h.D2(aVar2.f68522r);
                        } else {
                            int i3 = jli.h.f175850a;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof c.C0497c) {
                            aVar2.l2(new f(aVar2, null, 0), new yi5.b(26));
                        } else {
                            int i5 = jli.h.f175850a;
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        fullScreenPromptScreen2.H = block2;
        return fullScreenPromptScreen2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v30 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData, still in use, count: 2, list:
          (r7v30 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData) from 0x0213: MOVE (r38v1 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData) = 
          (r7v30 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData)
        
          (r7v30 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData) from 0x0209: MOVE (r38v3 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData) = 
          (r7v30 com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData)
        
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8i.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e(nci.s sVar, nci.k kVar) {
        this.f213419a = 7;
        this.f213420b = kVar;
    }
}
