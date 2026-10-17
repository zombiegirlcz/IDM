package com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen;

import aii.q;
import android.view.View;
import cf7.h;
import cf7.l;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentController;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import x0f.g;
import xg7.c;
import xg7.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/lottery/enrollment/screen/LotteryEnrollmentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxg7/f;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LotteryEnrollmentController extends ViewController<q> implements a {
    public final LotteryEnrollmentControllerContract$InputData K;
    public final PromptMarketingContentDelegate L;
    public final PromptMarketingContentLoadingDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public LotteryEnrollmentController(LotteryEnrollmentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentDelegate();
        this.M = new PromptMarketingContentLoadingDelegate();
        this.N = R$layout.screen_prompt;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryEnrollmentController f305615b;

            {
                this.f305615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LotteryEnrollmentController lotteryEnrollmentController = this.f305615b;
                switch (i2) {
                    case 0:
                        return (e) ((cf7.h) lotteryEnrollmentController.Q.getValue()).e.get();
                    case 1:
                        LotteryEnrollmentController lotteryEnrollmentController2 = this.f305615b;
                        return dli.f.a(lotteryEnrollmentController2, (e) lotteryEnrollmentController2.O.getValue(), v.k(lotteryEnrollmentController2.L, lotteryEnrollmentController2.M), 0, null, null, null, 60);
                    default:
                        phm.a aVar = (phm.a) ue0.e.j(lotteryEnrollmentController.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        cf7.b bVar = ((cf7.b) ((l) aVar2.b())).f23583r;
                        LotteryEnrollmentControllerContract$InputData lotteryEnrollmentControllerContract$InputData = lotteryEnrollmentController.K;
                        lotteryEnrollmentControllerContract$InputData.getClass();
                        return new cf7.h(bVar, lotteryEnrollmentController, lotteryEnrollmentControllerContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryEnrollmentController f305615b;

            {
                this.f305615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LotteryEnrollmentController lotteryEnrollmentController = this.f305615b;
                switch (i22) {
                    case 0:
                        return (e) ((cf7.h) lotteryEnrollmentController.Q.getValue()).e.get();
                    case 1:
                        LotteryEnrollmentController lotteryEnrollmentController2 = this.f305615b;
                        return dli.f.a(lotteryEnrollmentController2, (e) lotteryEnrollmentController2.O.getValue(), v.k(lotteryEnrollmentController2.L, lotteryEnrollmentController2.M), 0, null, null, null, 60);
                    default:
                        phm.a aVar = (phm.a) ue0.e.j(lotteryEnrollmentController.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        cf7.b bVar = ((cf7.b) ((l) aVar2.b())).f23583r;
                        LotteryEnrollmentControllerContract$InputData lotteryEnrollmentControllerContract$InputData = lotteryEnrollmentController.K;
                        lotteryEnrollmentControllerContract$InputData.getClass();
                        return new cf7.h(bVar, lotteryEnrollmentController, lotteryEnrollmentControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryEnrollmentController f305615b;

            {
                this.f305615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LotteryEnrollmentController lotteryEnrollmentController = this.f305615b;
                switch (i22) {
                    case 0:
                        return (e) ((cf7.h) lotteryEnrollmentController.Q.getValue()).e.get();
                    case 1:
                        LotteryEnrollmentController lotteryEnrollmentController2 = this.f305615b;
                        return dli.f.a(lotteryEnrollmentController2, (e) lotteryEnrollmentController2.O.getValue(), v.k(lotteryEnrollmentController2.L, lotteryEnrollmentController2.M), 0, null, null, null, 60);
                    default:
                        phm.a aVar = (phm.a) ue0.e.j(lotteryEnrollmentController.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        cf7.b bVar = ((cf7.b) ((l) aVar2.b())).f23583r;
                        LotteryEnrollmentControllerContract$InputData lotteryEnrollmentControllerContract$InputData = lotteryEnrollmentController.K;
                        lotteryEnrollmentControllerContract$InputData.getClass();
                        return new cf7.h(bVar, lotteryEnrollmentController, lotteryEnrollmentControllerContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (xg7.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.lottery_enrollment_update, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new xg7.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.p()), new g(this, null, 14), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
