package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ijc.g;
import ijc.h;
import ijc.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import vkm.d;
import whc.z;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/screen/rev_points_earned/RentAndBillsRevPointsEarnedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lijc/g;", "Ldli/a;", "Lijc/i;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RentAndBillsRevPointsEarnedScreen extends ViewController<g> implements a {
    public final RentAndBillsRevPointsEarnedScreenContract$InputData K;
    public final PromptContentLoadingDelegate L;
    public final PromptMarketingContentDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RentAndBillsRevPointsEarnedScreen(RentAndBillsRevPointsEarnedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptContentLoadingDelegate();
        this.M = new PromptMarketingContentDelegate();
        this.N = R$layout.screen_prompt;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ijc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsRevPointsEarnedScreen f161755b;

            {
                this.f161755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen = this.f161755b;
                switch (i2) {
                    case 0:
                        return (h) ((whc.w) rentAndBillsRevPointsEarnedScreen.Q.getValue()).d.get();
                    case 1:
                        RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen2 = this.f161755b;
                        return dli.f.a(rentAndBillsRevPointsEarnedScreen2, (h) rentAndBillsRevPointsEarnedScreen2.O.getValue(), v.k(rentAndBillsRevPointsEarnedScreen2.L, rentAndBillsRevPointsEarnedScreen2.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsRevPointsEarnedScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsRevPointsEarnedScreenContract$InputData rentAndBillsRevPointsEarnedScreenContract$InputData = rentAndBillsRevPointsEarnedScreen.K;
                        rentAndBillsRevPointsEarnedScreenContract$InputData.getClass();
                        return new whc.w(zVar, rentAndBillsRevPointsEarnedScreen, rentAndBillsRevPointsEarnedScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ijc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsRevPointsEarnedScreen f161755b;

            {
                this.f161755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen = this.f161755b;
                switch (i22) {
                    case 0:
                        return (h) ((whc.w) rentAndBillsRevPointsEarnedScreen.Q.getValue()).d.get();
                    case 1:
                        RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen2 = this.f161755b;
                        return dli.f.a(rentAndBillsRevPointsEarnedScreen2, (h) rentAndBillsRevPointsEarnedScreen2.O.getValue(), v.k(rentAndBillsRevPointsEarnedScreen2.L, rentAndBillsRevPointsEarnedScreen2.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsRevPointsEarnedScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsRevPointsEarnedScreenContract$InputData rentAndBillsRevPointsEarnedScreenContract$InputData = rentAndBillsRevPointsEarnedScreen.K;
                        rentAndBillsRevPointsEarnedScreenContract$InputData.getClass();
                        return new whc.w(zVar, rentAndBillsRevPointsEarnedScreen, rentAndBillsRevPointsEarnedScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ijc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsRevPointsEarnedScreen f161755b;

            {
                this.f161755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen = this.f161755b;
                switch (i22) {
                    case 0:
                        return (h) ((whc.w) rentAndBillsRevPointsEarnedScreen.Q.getValue()).d.get();
                    case 1:
                        RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen2 = this.f161755b;
                        return dli.f.a(rentAndBillsRevPointsEarnedScreen2, (h) rentAndBillsRevPointsEarnedScreen2.O.getValue(), v.k(rentAndBillsRevPointsEarnedScreen2.L, rentAndBillsRevPointsEarnedScreen2.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsRevPointsEarnedScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsRevPointsEarnedScreenContract$InputData rentAndBillsRevPointsEarnedScreenContract$InputData = rentAndBillsRevPointsEarnedScreen.K;
                        rentAndBillsRevPointsEarnedScreenContract$InputData.getClass();
                        return new whc.w(zVar, rentAndBillsRevPointsEarnedScreen, rentAndBillsRevPointsEarnedScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (whc.w) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(this.L.f53078c.f121375b);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        ViewController.P2(this, vkm.q.J(dVarB, rd0.e.b(promptMarketingContentDelegate.f53079c)), new iaf.d(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new ijc.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
