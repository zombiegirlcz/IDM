package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing.PlanSharingBottomSheet;
import gaa.b;
import gik.c;
import gik.f;
import gik.h;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.c1;
import qgk.h1;
import qgk.i0;
import qgk.m;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/plan_sharing/PlanSharingBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lgik/f;", "Lgik/c;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanSharingBottomSheet extends BaseBottomSheetRecyclerController<f, c> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final List R;
    public final Object S;
    public final Object T;

    public PlanSharingBottomSheet() {
        Lazy lazyY0 = w.y0(new b(21));
        this.Q = lazyY0;
        this.R = u.c((LargeActionButtonDelegate) lazyY0.getValue());
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: gik.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSharingBottomSheet f144221b;

            {
                this.f144221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanSharingBottomSheet planSharingBottomSheet = this.f144221b;
                switch (i2) {
                    case 0:
                        int i3 = PlanSharingBottomSheet.U;
                        qji.b bVarU2 = planSharingBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing.di.PlanSharingBottomSheetInjector");
                        i0 i0Var = ((c1) bVarU2).f245903b;
                        h1 h1Var = new h1();
                        int i5 = 23;
                        h1Var.f245997a = e4m.b.b(new m(i0Var, h1Var, 1, i5));
                        h1Var.f245998b = e4m.b.b(new m(i0Var, h1Var, 0, i5));
                        return h1Var;
                    default:
                        int i6 = PlanSharingBottomSheet.U;
                        return (h) ((h1) planSharingBottomSheet.S.getValue()).f245998b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: gik.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSharingBottomSheet f144221b;

            {
                this.f144221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanSharingBottomSheet planSharingBottomSheet = this.f144221b;
                switch (i22) {
                    case 0:
                        int i3 = PlanSharingBottomSheet.U;
                        qji.b bVarU2 = planSharingBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing.di.PlanSharingBottomSheetInjector");
                        i0 i0Var = ((c1) bVarU2).f245903b;
                        h1 h1Var = new h1();
                        int i5 = 23;
                        h1Var.f245997a = e4m.b.b(new m(i0Var, h1Var, 1, i5));
                        h1Var.f245998b = e4m.b.b(new m(i0Var, h1Var, 0, i5));
                        return h1Var;
                    default:
                        int i6 = PlanSharingBottomSheet.U;
                        return (h) ((h1) planSharingBottomSheet.S.getValue()).f245998b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h1) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (h) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), new gik.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
