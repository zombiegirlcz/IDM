package com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreen;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.y0;
import te0.w;
import vc.s;
import w5b.b6;
import w8a.b;
import w8a.c;
import w8a.g;
import w8a.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_deletion/screens/review_delete/ReviewDeleteAliasScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw8a/g;", "Ldli/a;", "Lw8a/h;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewDeleteAliasScreen extends ViewController<g> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ReviewDeleteAliasScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final ReviewDeleteAliasScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ReviewDeleteAliasScreen(ReviewDeleteAliasScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: w8a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewDeleteAliasScreen f295626b;

            {
                this.f295626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReviewDeleteAliasScreen reviewDeleteAliasScreen = this.f295626b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewDeleteAliasScreen.S;
                        qji.b bVarU2 = reviewDeleteAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.di.ReviewDeleteAliasScreenInjector");
                        p8a.d dVar = (p8a.d) bVarU2;
                        d0 d0Var = dVar.f233927b;
                        p8a.d dVar2 = dVar.f233928c;
                        ReviewDeleteAliasScreenContract$InputData reviewDeleteAliasScreenContract$InputData = reviewDeleteAliasScreen.K;
                        reviewDeleteAliasScreenContract$InputData.getClass();
                        return new y0(d0Var, dVar2, reviewDeleteAliasScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewDeleteAliasScreen.S;
                        return (j) ((y0) reviewDeleteAliasScreen.M.getValue()).f234127c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReviewDeleteAliasScreen.S;
                        ReviewDeleteAliasScreen reviewDeleteAliasScreen2 = this.f295626b;
                        return dli.f.a(reviewDeleteAliasScreen2, (j) reviewDeleteAliasScreen2.N.getValue(), v.k((RowDelegate) reviewDeleteAliasScreen2.P.getValue(), (LargeActionButtonDelegate) reviewDeleteAliasScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: w8a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewDeleteAliasScreen f295626b;

            {
                this.f295626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReviewDeleteAliasScreen reviewDeleteAliasScreen = this.f295626b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewDeleteAliasScreen.S;
                        qji.b bVarU2 = reviewDeleteAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.di.ReviewDeleteAliasScreenInjector");
                        p8a.d dVar = (p8a.d) bVarU2;
                        d0 d0Var = dVar.f233927b;
                        p8a.d dVar2 = dVar.f233928c;
                        ReviewDeleteAliasScreenContract$InputData reviewDeleteAliasScreenContract$InputData = reviewDeleteAliasScreen.K;
                        reviewDeleteAliasScreenContract$InputData.getClass();
                        return new y0(d0Var, dVar2, reviewDeleteAliasScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewDeleteAliasScreen.S;
                        return (j) ((y0) reviewDeleteAliasScreen.M.getValue()).f234127c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReviewDeleteAliasScreen.S;
                        ReviewDeleteAliasScreen reviewDeleteAliasScreen2 = this.f295626b;
                        return dli.f.a(reviewDeleteAliasScreen2, (j) reviewDeleteAliasScreen2.N.getValue(), v.k((RowDelegate) reviewDeleteAliasScreen2.P.getValue(), (LargeActionButtonDelegate) reviewDeleteAliasScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new b6(24));
        this.Q = w.y0(new b6(25));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: w8a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewDeleteAliasScreen f295626b;

            {
                this.f295626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReviewDeleteAliasScreen reviewDeleteAliasScreen = this.f295626b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewDeleteAliasScreen.S;
                        qji.b bVarU2 = reviewDeleteAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.di.ReviewDeleteAliasScreenInjector");
                        p8a.d dVar = (p8a.d) bVarU2;
                        d0 d0Var = dVar.f233927b;
                        p8a.d dVar2 = dVar.f233928c;
                        ReviewDeleteAliasScreenContract$InputData reviewDeleteAliasScreenContract$InputData = reviewDeleteAliasScreen.K;
                        reviewDeleteAliasScreenContract$InputData.getClass();
                        return new y0(d0Var, dVar2, reviewDeleteAliasScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewDeleteAliasScreen.S;
                        return (j) ((y0) reviewDeleteAliasScreen.M.getValue()).f234127c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReviewDeleteAliasScreen.S;
                        ReviewDeleteAliasScreen reviewDeleteAliasScreen2 = this.f295626b;
                        return dli.f.a(reviewDeleteAliasScreen2, (j) reviewDeleteAliasScreen2.N.getValue(), v.k((RowDelegate) reviewDeleteAliasScreen2.P.getValue(), (LargeActionButtonDelegate) reviewDeleteAliasScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        w8a.h uiState = (w8a.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f295631b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
