package ht0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Step;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mic.g0;
import mx0.y9;
import ozc.r0;
import rv0.f;
import z8k.m0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.q implements Function0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        switch (this.f) {
            case 0:
                ((TrendView) this.receiver).invalidate();
                break;
            case 1:
                qam.e eVar = (qam.e) this.receiver;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                break;
            case 2:
                ij9.i iVar = (ij9.i) this.receiver;
                iVar.getClass();
                iVar.A2(new BridgeDestination(new FeatureCommand(new PayLaterKompotFeatureConfig.RepayAmount(0))));
                break;
            case 3:
                ij9.i iVar2 = (ij9.i) this.receiver;
                iVar2.getClass();
                iVar2.A2(new BridgeDestination(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, null, null, null, false, null, null, null, null, null, null, 16383))));
                break;
            case 4:
                ((je.c) this.receiver).getClass();
                String threadName = je.c.a();
                Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
                break;
            case 5:
                ((je.c) this.receiver).getClass();
                String threadName2 = je.c.a();
                Intrinsics.checkNotNullExpressionValue(threadName2, "threadName");
                break;
            case 6:
                ((je.c) this.receiver).getClass();
                break;
            case 7:
                ((lyb.d) this.receiver).Z2();
                break;
            case 8:
                ((g0) this.receiver).getClass();
                break;
            case 9:
                y9 y9Var = (y9) this.receiver;
                kge.d dVar = y9Var.f210127c;
                com.revolut.core.ui_kit.views.o oVar = y9Var.f210125a;
                ViewGroup contentWrapper$ui_kit_components_release = ((com.revolut.core.ui_kit.views.o) dVar.f183974b).getContentWrapper$ui_kit_components_release();
                if (contentWrapper$ui_kit_components_release != null && (viewPropertyAnimatorAnimate = contentWrapper$ui_kit_components_release.animate()) != null) {
                    viewPropertyAnimatorAnimate.cancel();
                }
                y9Var.animate().cancel();
                int childCount = y9Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    y9Var.getChildAt(i).animate().cancel();
                }
                y9Var.setVisibility(8);
                y9Var.d.a();
                oVar.getContentContainer$ui_kit_components_release().setBackground(null);
                b0 listener = y9Var.f210126b;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                oVar.f59570h.remove(listener);
                break;
            case 10:
                Activity activity = (Activity) this.receiver;
                Intrinsics.checkNotNullParameter(activity, "<this>");
                break;
            case 11:
                Activity activity2 = (Activity) this.receiver;
                Intrinsics.checkNotNullParameter(activity2, "<this>");
                break;
            case 12:
                ((AnimatedNumbersView) this.receiver).invalidate();
                break;
            case 13:
                AnimatedNumbersView.a((AnimatedNumbersView) this.receiver);
                break;
            case 14:
                ((AnimatedNumbersView) this.receiver).invalidate();
                break;
            case 15:
                AnimatedNumbersView.a((AnimatedNumbersView) this.receiver);
                break;
            case 16:
                boolean z = ((gzc.n) ((ozc.t) ((r0) this.receiver).f231311c).r3().c()).f.size() > 1;
                ozc.h hVar = ozc.h.DOCUMENT_LIST;
                ozc.h hVar2 = ozc.h.EVIDENCE_LIST;
                if (!z) {
                    break;
                }
                break;
            case 17:
                boolean z3 = ((gzc.n) ((ozc.t) ((r0) this.receiver).f231311c).r3().c()).f.size() > 1;
                ozc.h hVar3 = ozc.h.DOCUMENT_LIST;
                ozc.h hVar4 = ozc.h.EVIDENCE_LIST;
                if (!z3) {
                    break;
                }
                break;
            case 18:
                break;
            case 19:
                sv0.c cVar = (sv0.c) this.receiver;
                Window window = cVar.f265812b;
                View decorView = window.getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    sv0.c.i(viewGroup);
                }
                View viewFindFocus = window.getDecorView().findFocus();
                if (viewFindFocus != null) {
                    cVar.n(viewFindFocus);
                }
                break;
            case 20:
                sv0.c cVar2 = (sv0.c) this.receiver;
                FrameLayout frameLayoutA = cVar2.a();
                if (frameLayoutA != null) {
                    frameLayoutA.animate().cancel();
                    frameLayoutA.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    frameLayoutA.setVisibility(8);
                }
                sv0.c.o(cVar2, null, 3);
                cVar2.f265817l = f.a.f257638a;
                ViewCompat.requestApplyInsets(cVar2.f265812b.getDecorView());
                break;
            case 21:
                ((ComparisonLineChartView) this.receiver).invalidate();
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                SetupBudgetController setupBudgetController = (SetupBudgetController) this.receiver;
                if (setupBudgetController.V != null) {
                    setupBudgetController.f3();
                }
                break;
            case 25:
                ((com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.receiver).K2();
                break;
            case 26:
                ((com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.receiver).K2();
                break;
            case 27:
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar = (com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) this.receiver;
                oki.h.t2(aVar, aVar.u, JuniorCardProfileFlowContract$Step.CardProfile.f77080a, true, null, false, 12);
                break;
            case 28:
                ((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) ((z8k.e0) this.receiver)).C2();
                break;
            default:
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) ((z8k.e0) this.receiver);
                bVar.getClass();
                bVar.l2(new m0(bVar, null, 3), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
