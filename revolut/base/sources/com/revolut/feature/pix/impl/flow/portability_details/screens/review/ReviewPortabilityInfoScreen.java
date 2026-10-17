package com.revolut.feature.pix.impl.flow.portability_details.screens.review;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreen;
import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import h43.b;
import hba.c;
import hba.d;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import p8a.a1;
import p8a.d0;
import p8a.x0;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/portability_details/screens/review/ReviewPortabilityInfoScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lhba/d;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewPortabilityInfoScreen extends SimpleViewController<d> implements d1 {
    public static final /* synthetic */ int U = 0;
    public final ReviewPortabilityInfoScreenContract$InputData N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ReviewPortabilityInfoScreen(ReviewPortabilityInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_transparent;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: hba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewPortabilityInfoScreen f150626b;

            {
                this.f150626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReviewPortabilityInfoScreen reviewPortabilityInfoScreen = this.f150626b;
                        qji.b bVarU2 = reviewPortabilityInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.portability_details.screens.review.di.ReviewPortabilityInfoScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        d0 d0Var = x0Var.f234120b;
                        x0 x0Var2 = x0Var.f234121c;
                        ReviewPortabilityInfoScreenContract$InputData reviewPortabilityInfoScreenContract$InputData = reviewPortabilityInfoScreen.N;
                        reviewPortabilityInfoScreenContract$InputData.getClass();
                        return new a1(d0Var, x0Var2, reviewPortabilityInfoScreen, reviewPortabilityInfoScreenContract$InputData);
                    default:
                        return (e) ((a1) this.f150626b.P.getValue()).f233893g.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewPortabilityInfoScreen f150626b;

            {
                this.f150626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReviewPortabilityInfoScreen reviewPortabilityInfoScreen = this.f150626b;
                        qji.b bVarU2 = reviewPortabilityInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.portability_details.screens.review.di.ReviewPortabilityInfoScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        d0 d0Var = x0Var.f234120b;
                        x0 x0Var2 = x0Var.f234121c;
                        ReviewPortabilityInfoScreenContract$InputData reviewPortabilityInfoScreenContract$InputData = reviewPortabilityInfoScreen.N;
                        reviewPortabilityInfoScreenContract$InputData.getClass();
                        return new a1(d0Var, x0Var2, reviewPortabilityInfoScreen, reviewPortabilityInfoScreenContract$InputData);
                    default:
                        return (e) ((a1) this.f150626b.P.getValue()).f233893g.get();
                }
            }
        });
        this.R = w.y0(new b(12));
        this.S = w.y0(new b(13));
        this.T = w.y0(new b(14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((a1) this.P.getValue()).e.get()).d(v.k((LargeActionButtonDelegate) this.R.getValue(), (TwinHorizontalButtonDelegate) this.S.getValue(), (RowDelegate) this.T.getValue()));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), null, new hba.b(this, null), 3);
        ?? r62 = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r62.getValue()).f53572c.f121375b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r62.getValue()).d.f121375b), null, new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final hba.e d() {
        return (hba.e) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }
}
