package com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result;

import android.os.Parcelable;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultController;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pd.b;
import qg7.c;
import qg7.d;
import qg7.f;
import qg7.g;
import qg7.i;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/lottery/draw/screen/result/LotteryResultController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqg7/g;", "Ldli/a;", "Lqg7/i;", "Lno/m;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LotteryResultController extends ViewController<g> implements a, m {
    public final LotteryResultControllerContract$InputData K;
    public final PromptMarketingContentLoadingDelegate L;
    public final PromptMarketingContentDelegate M;
    public final AnalyticsProduct.Retail N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public LotteryResultController(LotteryResultControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentLoadingDelegate();
        this.M = new PromptMarketingContentDelegate();
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.N = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.O = R$layout.screen_prompt;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: qg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryResultController f245667b;

            {
                this.f245667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LotteryResultController lotteryResultController = this.f245667b;
                switch (i2) {
                    case 0:
                        return (f) ((cf7.i) lotteryResultController.R.getValue()).f23622c.get();
                    case 1:
                        LotteryResultController lotteryResultController2 = this.f245667b;
                        return dli.f.a(lotteryResultController2, lotteryResultController2.R2(), zhm.v.k(lotteryResultController2.M, lotteryResultController2.L), 0, null, null, null, 60);
                    default:
                        qji.b bVarU2 = lotteryResultController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.di.LotteryResultControllerComponent.Injector");
                        cf7.g gVar = (cf7.g) bVarU2;
                        cf7.b bVar = gVar.f23615b;
                        cf7.g gVar2 = gVar.f23616c;
                        LotteryResultControllerContract$InputData lotteryResultControllerContract$InputData = lotteryResultController.K;
                        lotteryResultControllerContract$InputData.getClass();
                        return new cf7.i(bVar, gVar2, lotteryResultControllerContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: qg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryResultController f245667b;

            {
                this.f245667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LotteryResultController lotteryResultController = this.f245667b;
                switch (i22) {
                    case 0:
                        return (f) ((cf7.i) lotteryResultController.R.getValue()).f23622c.get();
                    case 1:
                        LotteryResultController lotteryResultController2 = this.f245667b;
                        return dli.f.a(lotteryResultController2, lotteryResultController2.R2(), zhm.v.k(lotteryResultController2.M, lotteryResultController2.L), 0, null, null, null, 60);
                    default:
                        qji.b bVarU2 = lotteryResultController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.di.LotteryResultControllerComponent.Injector");
                        cf7.g gVar = (cf7.g) bVarU2;
                        cf7.b bVar = gVar.f23615b;
                        cf7.g gVar2 = gVar.f23616c;
                        LotteryResultControllerContract$InputData lotteryResultControllerContract$InputData = lotteryResultController.K;
                        lotteryResultControllerContract$InputData.getClass();
                        return new cf7.i(bVar, gVar2, lotteryResultControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: qg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryResultController f245667b;

            {
                this.f245667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LotteryResultController lotteryResultController = this.f245667b;
                switch (i22) {
                    case 0:
                        return (f) ((cf7.i) lotteryResultController.R.getValue()).f23622c.get();
                    case 1:
                        LotteryResultController lotteryResultController2 = this.f245667b;
                        return dli.f.a(lotteryResultController2, lotteryResultController2.R2(), zhm.v.k(lotteryResultController2.M, lotteryResultController2.L), 0, null, null, null, 60);
                    default:
                        qji.b bVarU2 = lotteryResultController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.di.LotteryResultControllerComponent.Injector");
                        cf7.g gVar = (cf7.g) bVarU2;
                        cf7.b bVar = gVar.f23615b;
                        cf7.g gVar2 = gVar.f23616c;
                        LotteryResultControllerContract$InputData lotteryResultControllerContract$InputData = lotteryResultController.K;
                        lotteryResultControllerContract$InputData.getClass();
                        return new cf7.i(bVar, gVar2, lotteryResultControllerContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (cf7.i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b.p(view, new TextLocalisedClause(R$string.lottery_draw_result, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new qg7.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new qc3.c(this, continuation, 14), 3);
        ViewController.P2(this, rd0.e.b(this.L.p()), new qg4.d(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
