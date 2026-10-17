package com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.w;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.salary_switch.impl.R$layout;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import nrc.b;
import nrc.d;
import org.jetbrains.annotations.NotNull;
import vc.s;
import xki.e;
import zhm.u;
import zpc.k;
import zpc.o;
import zpc.r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/screen/terms/TermsViewerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lnrc/b;", "Lprc/a;", "Companion", "a", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TermsViewerController extends ViewController<q> implements w, prc.a {
    public final TermsViewerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TermsViewerController.class, "binding", "getBinding()Lcom/revolut/feature/salary_switch/impl/databinding/ScreenTermsViewerBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TermsViewerController(TermsViewerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d.f);
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: nrc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsViewerController f218607b;

            {
                this.f218607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TermsViewerController termsViewerController = this.f218607b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TermsViewerController.Q;
                        TermsViewerController termsViewerController2 = this.f218607b;
                        qji.b bVarU2 = termsViewerController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.di.TermsViewerControllerComponent.Injector");
                        o oVar = (o) bVarU2;
                        k kVar = oVar.f324279b;
                        o oVar2 = oVar.f324280c;
                        TermsViewerContract$InputData termsViewerContract$InputData = termsViewerController2.K;
                        termsViewerContract$InputData.getClass();
                        return new r(kVar, oVar2, termsViewerController2, termsViewerContract$InputData, termsViewerController2);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsViewerController.Q;
                        return (e) ((r) termsViewerController.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TermsViewerController.Q;
                        return n14.e.a(termsViewerController, (e) termsViewerController.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: nrc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsViewerController f218607b;

            {
                this.f218607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TermsViewerController termsViewerController = this.f218607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsViewerController.Q;
                        TermsViewerController termsViewerController2 = this.f218607b;
                        qji.b bVarU2 = termsViewerController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.di.TermsViewerControllerComponent.Injector");
                        o oVar = (o) bVarU2;
                        k kVar = oVar.f324279b;
                        o oVar2 = oVar.f324280c;
                        TermsViewerContract$InputData termsViewerContract$InputData = termsViewerController2.K;
                        termsViewerContract$InputData.getClass();
                        return new r(kVar, oVar2, termsViewerController2, termsViewerContract$InputData, termsViewerController2);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsViewerController.Q;
                        return (e) ((r) termsViewerController.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TermsViewerController.Q;
                        return n14.e.a(termsViewerController, (e) termsViewerController.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: nrc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsViewerController f218607b;

            {
                this.f218607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TermsViewerController termsViewerController = this.f218607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsViewerController.Q;
                        TermsViewerController termsViewerController2 = this.f218607b;
                        qji.b bVarU2 = termsViewerController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.di.TermsViewerControllerComponent.Injector");
                        o oVar = (o) bVarU2;
                        k kVar = oVar.f324279b;
                        o oVar2 = oVar.f324280c;
                        TermsViewerContract$InputData termsViewerContract$InputData = termsViewerController2.K;
                        termsViewerContract$InputData.getClass();
                        return new r(kVar, oVar2, termsViewerController2, termsViewerContract$InputData, termsViewerController2);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsViewerController.Q;
                        return (e) ((r) termsViewerController.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TermsViewerController.Q;
                        return n14.e.a(termsViewerController, (e) termsViewerController.N.getValue());
                }
            }
        });
        this.P = R$layout.screen_terms_viewer;
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f307929c.loadDataWithBaseURL(null, uiState.f218605a, "text/html", "utf-8", null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nrc.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f307928b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.salary_switch_mx_review_details_terms_link_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_DOWNLOAD", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f307928b.f59211b), new j2(this, continuation, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f307928b.f59210a.f57403b), new nn7.d(this, continuation, 11), 3);
    }

    public final xpc.a d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xpc.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
