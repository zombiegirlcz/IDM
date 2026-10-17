package com.revolut.feature.retail.salary_account.impl.promotion_inactive;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptController;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptControllerContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gaa.b;
import ggb.c;
import ggb.d;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import wfb.i;
import wfb.u;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/promotion_inactive/PromotionInactivePromptController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lggb/d;", "Lno/m;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromotionInactivePromptController extends ViewController<q> implements a, m {
    public final PromotionInactivePromptControllerContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final AnalyticsProduct.Retail O;
    public final Object P;
    public final Object Q;

    public PromotionInactivePromptController(PromotionInactivePromptControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new b(17));
        this.M = R$layout.screen_recycler_view;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ggb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotionInactivePromptController f143602b;

            {
                this.f143602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (e) ((wfb.e) this.f143602b.P.getValue()).f297031b.get();
                    case 1:
                        PromotionInactivePromptController promotionInactivePromptController = this.f143602b;
                        phm.a aVar = (phm.a) ue0.e.j(promotionInactivePromptController.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        i iVar = ((i) ((u) aVar2.b())).f297052t;
                        PromotionInactivePromptControllerContract$InputData promotionInactivePromptControllerContract$InputData = promotionInactivePromptController.K;
                        promotionInactivePromptControllerContract$InputData.getClass();
                        return new wfb.e(iVar, promotionInactivePromptControllerContract$InputData);
                    default:
                        PromotionInactivePromptController promotionInactivePromptController2 = this.f143602b;
                        return dli.f.a(promotionInactivePromptController2, (e) promotionInactivePromptController2.N.getValue(), zhm.u.c((PromptMarketingContentDelegate) promotionInactivePromptController2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ggb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotionInactivePromptController f143602b;

            {
                this.f143602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (e) ((wfb.e) this.f143602b.P.getValue()).f297031b.get();
                    case 1:
                        PromotionInactivePromptController promotionInactivePromptController = this.f143602b;
                        phm.a aVar = (phm.a) ue0.e.j(promotionInactivePromptController.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        i iVar = ((i) ((u) aVar2.b())).f297052t;
                        PromotionInactivePromptControllerContract$InputData promotionInactivePromptControllerContract$InputData = promotionInactivePromptController.K;
                        promotionInactivePromptControllerContract$InputData.getClass();
                        return new wfb.e(iVar, promotionInactivePromptControllerContract$InputData);
                    default:
                        PromotionInactivePromptController promotionInactivePromptController2 = this.f143602b;
                        return dli.f.a(promotionInactivePromptController2, (e) promotionInactivePromptController2.N.getValue(), zhm.u.c((PromptMarketingContentDelegate) promotionInactivePromptController2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ggb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotionInactivePromptController f143602b;

            {
                this.f143602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (e) ((wfb.e) this.f143602b.P.getValue()).f297031b.get();
                    case 1:
                        PromotionInactivePromptController promotionInactivePromptController = this.f143602b;
                        phm.a aVar = (phm.a) ue0.e.j(promotionInactivePromptController.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        i iVar = ((i) ((u) aVar2.b())).f297052t;
                        PromotionInactivePromptControllerContract$InputData promotionInactivePromptControllerContract$InputData = promotionInactivePromptController.K;
                        promotionInactivePromptControllerContract$InputData.getClass();
                        return new wfb.e(iVar, promotionInactivePromptControllerContract$InputData);
                    default:
                        PromotionInactivePromptController promotionInactivePromptController2 = this.f143602b;
                        return dli.f.a(promotionInactivePromptController2, (e) promotionInactivePromptController2.N.getValue(), zhm.u.c((PromptMarketingContentDelegate) promotionInactivePromptController2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wfb.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ggb.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), new ggb.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
