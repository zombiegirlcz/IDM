package com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import krc.c;
import krc.d;
import krc.f;
import krc.g;
import te0.w;
import tx0.j0;
import vc.s;
import wp5.y;
import xki.e;
import zhm.u;
import zpc.o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/screen/review_account_details/ReviewAccountDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkrc/c;", "Ltki/c;", "Lkrc/d;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewAccountDetailsController extends ViewController<c> implements tki.c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ReviewAccountDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final ReviewAccountDetailsContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;

    public ReviewAccountDetailsController(ReviewAccountDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: krc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewAccountDetailsController f188850b;

            {
                this.f188850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReviewAccountDetailsController reviewAccountDetailsController = this.f188850b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewAccountDetailsController.Q;
                        qji.b bVarU2 = reviewAccountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.di.ReviewAccountDetailsControllerComponent.Injector");
                        o oVar = (o) bVarU2;
                        zpc.k kVar = oVar.f324279b;
                        o oVar2 = oVar.f324280c;
                        ReviewAccountDetailsContract$InputData reviewAccountDetailsContract$InputData = reviewAccountDetailsController.K;
                        reviewAccountDetailsContract$InputData.getClass();
                        return new zpc.e(kVar, oVar2, reviewAccountDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewAccountDetailsController.Q;
                        return (b) ((zpc.e) reviewAccountDetailsController.M.getValue()).f324242c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReviewAccountDetailsController.Q;
                        ReviewAccountDetailsController reviewAccountDetailsController2 = this.f188850b;
                        return tki.g.a(reviewAccountDetailsController2, (b) reviewAccountDetailsController2.N.getValue(), y.w(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: krc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewAccountDetailsController f188850b;

            {
                this.f188850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReviewAccountDetailsController reviewAccountDetailsController = this.f188850b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewAccountDetailsController.Q;
                        qji.b bVarU2 = reviewAccountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.di.ReviewAccountDetailsControllerComponent.Injector");
                        o oVar = (o) bVarU2;
                        zpc.k kVar = oVar.f324279b;
                        o oVar2 = oVar.f324280c;
                        ReviewAccountDetailsContract$InputData reviewAccountDetailsContract$InputData = reviewAccountDetailsController.K;
                        reviewAccountDetailsContract$InputData.getClass();
                        return new zpc.e(kVar, oVar2, reviewAccountDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewAccountDetailsController.Q;
                        return (b) ((zpc.e) reviewAccountDetailsController.M.getValue()).f324242c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReviewAccountDetailsController.Q;
                        ReviewAccountDetailsController reviewAccountDetailsController2 = this.f188850b;
                        return tki.g.a(reviewAccountDetailsController2, (b) reviewAccountDetailsController2.N.getValue(), y.w(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: krc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewAccountDetailsController f188850b;

            {
                this.f188850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReviewAccountDetailsController reviewAccountDetailsController = this.f188850b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewAccountDetailsController.Q;
                        qji.b bVarU2 = reviewAccountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.di.ReviewAccountDetailsControllerComponent.Injector");
                        o oVar = (o) bVarU2;
                        zpc.k kVar = oVar.f324279b;
                        o oVar2 = oVar.f324280c;
                        ReviewAccountDetailsContract$InputData reviewAccountDetailsContract$InputData = reviewAccountDetailsController.K;
                        reviewAccountDetailsContract$InputData.getClass();
                        return new zpc.e(kVar, oVar2, reviewAccountDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewAccountDetailsController.Q;
                        return (b) ((zpc.e) reviewAccountDetailsController.M.getValue()).f324242c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReviewAccountDetailsController.Q;
                        ReviewAccountDetailsController reviewAccountDetailsController2 = this.f188850b;
                        return tki.g.a(reviewAccountDetailsController2, (b) reviewAccountDetailsController2.N.getValue(), y.w(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_footer_nextbutton;
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zpc.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (krc.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_mx_review_details_title, null, null, 14);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.salary_switch_mx_review_details_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174558c.setTextClause(new TextLocalisedClause(R$string.salary_switch_mx_review_details_terms_text, u.c(new TextLocalisedClause(R$string.salary_switch_mx_review_details_terms_link_title, null, new Click(30, (Integer) null, (Object) null, "TERMS_LINK_CLICK_ID", false), 10)), null, 12));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.salary_switch_mx_review_details_action_accept, null, null, 14));
        largeActionButton.setLoadingButtonTag("SUBMIT_REQUEST_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new krc.h(this, null, 0), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
