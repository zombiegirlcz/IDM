package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents;

import ah4.b;
import ah4.d;
import ah4.k;
import ah4.l;
import ah4.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.o5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/documents/RefinancingAccountDocumentsController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lah4/k;", "Ldli/a;", "Lah4/n;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RefinancingAccountDocumentsController extends PluginScreenController<k> implements a, c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RefinancingAccountDocumentsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RefinancingAccountDocumentsController(RefinancingAccountDocumentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = w.y0(new agh.b(this, inputData, 1));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ah4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDocumentsController f4884b;

            {
                this.f4884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RefinancingAccountDocumentsController refinancingAccountDocumentsController = this.f4884b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDocumentsController.R;
                        return (l) ((o5) refinancingAccountDocumentsController.N.getValue()).f119457r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDocumentsController.R;
                        RefinancingAccountDocumentsController refinancingAccountDocumentsController2 = this.f4884b;
                        return dli.f.a(refinancingAccountDocumentsController2, refinancingAccountDocumentsController2.d(), (List) refinancingAccountDocumentsController2.Q.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RefinancingAccountDocumentsController.R;
                        return ((o5) refinancingAccountDocumentsController.N.getValue()).c().Q();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ah4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDocumentsController f4884b;

            {
                this.f4884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RefinancingAccountDocumentsController refinancingAccountDocumentsController = this.f4884b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDocumentsController.R;
                        return (l) ((o5) refinancingAccountDocumentsController.N.getValue()).f119457r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDocumentsController.R;
                        RefinancingAccountDocumentsController refinancingAccountDocumentsController2 = this.f4884b;
                        return dli.f.a(refinancingAccountDocumentsController2, refinancingAccountDocumentsController2.d(), (List) refinancingAccountDocumentsController2.Q.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RefinancingAccountDocumentsController.R;
                        return ((o5) refinancingAccountDocumentsController.N.getValue()).c().Q();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ah4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDocumentsController f4884b;

            {
                this.f4884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RefinancingAccountDocumentsController refinancingAccountDocumentsController = this.f4884b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDocumentsController.R;
                        return (l) ((o5) refinancingAccountDocumentsController.N.getValue()).f119457r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDocumentsController.R;
                        RefinancingAccountDocumentsController refinancingAccountDocumentsController2 = this.f4884b;
                        return dli.f.a(refinancingAccountDocumentsController2, refinancingAccountDocumentsController2.d(), (List) refinancingAccountDocumentsController2.Q.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RefinancingAccountDocumentsController.R;
                        return ((o5) refinancingAccountDocumentsController.N.getValue()).c().Q();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(uiState.f4902a, null);
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(uiState.f4902a);
        Clause clause = uiState.f4903b;
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionText(clause);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionVisible(clause != null);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setEnabled(uiState.f4904c);
        largeActionButton.setText(uiState.d);
        d3().f174558c.setContent(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o5) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setHeaderTitleMode(j0.MULTILINE);
        screenRecyclerNavbarFooterNextbuttonToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        screenRecyclerNavbarFooterNextbuttonToolbar.setEnabled(false);
        screenRecyclerNavbarFooterNextbuttonToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonToolbar.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new d(this, null, 1), 3);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar2 = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar2, "screenRecyclerNavbarFooterNextbuttonToolbar");
        com.revolut.kompot.navigable.a.g2(this, new a15.d(rd0.e.b(screenRecyclerNavbarFooterNextbuttonToolbar2.x0()), 24), null, new af4.e(this, null, 8), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
