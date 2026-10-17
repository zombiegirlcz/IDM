package com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p8a.b1;
import te0.w;
import vc.s;
import yaa.b;
import yaa.c;
import yaa.e;
import yaa.f;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/review_trusted_account/ReviewTrustedAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyaa/e;", "Ldli/a;", "Lyaa/f;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewTrustedAccountScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(ReviewTrustedAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public ReviewTrustedAccountScreen(ReviewTrustedAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yaa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewTrustedAccountScreen f311997b;

            {
                this.f311997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewTrustedAccountScreen.P;
                        return (h) ((b1) this.f311997b.M.getValue()).f233900c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReviewTrustedAccountScreen.P;
                        ReviewTrustedAccountScreen reviewTrustedAccountScreen = this.f311997b;
                        return dli.f.a(reviewTrustedAccountScreen, (h) reviewTrustedAccountScreen.L.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsActionDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = w.y0(new y1a.a(this, inputData, 11));
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yaa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewTrustedAccountScreen f311997b;

            {
                this.f311997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewTrustedAccountScreen.P;
                        return (h) ((b1) this.f311997b.M.getValue()).f233900c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReviewTrustedAccountScreen.P;
                        ReviewTrustedAccountScreen reviewTrustedAccountScreen = this.f311997b;
                        return dli.f.a(reviewTrustedAccountScreen, (h) reviewTrustedAccountScreen.L.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsActionDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (yaa.h) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_trusted_new_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pix_trusted_new_review_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.pix_trusted_new_review_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
