package com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fma.v;
import ghk.t;
import gna.b;
import gna.c;
import gna.d;
import gna.f;
import gna.g;
import jii.m;
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
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/documents_redesigned/document_selector/DocumentSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lgna/g;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentSelectorScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DocumentSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;

    public DocumentSelectorScreen(DocumentSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new t(this, inputData, 8));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectorScreen f144940b;

            {
                this.f144940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentSelectorScreen.R;
                        return (f) ((v) ((hna.a) this.f144940b.M.getValue())).f136229h.get();
                    default:
                        KProperty[] kPropertyArr2 = DocumentSelectorScreen.R;
                        DocumentSelectorScreen documentSelectorScreen = this.f144940b;
                        return dli.f.a(documentSelectorScreen, (f) documentSelectorScreen.N.getValue(), d0.E0(((fd6.a) ((v) ((hna.a) documentSelectorScreen.M.getValue())).d.get()).e, zhm.v.k(documentSelectorScreen.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), documentSelectorScreen.P)), 0, null, null, null, 60);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        this.P = new FullScreenStateDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectorScreen f144940b;

            {
                this.f144940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentSelectorScreen.R;
                        return (f) ((v) ((hna.a) this.f144940b.M.getValue())).f136229h.get();
                    default:
                        KProperty[] kPropertyArr2 = DocumentSelectorScreen.R;
                        DocumentSelectorScreen documentSelectorScreen = this.f144940b;
                        return dli.f.a(documentSelectorScreen, (f) documentSelectorScreen.N.getValue(), d0.E0(((fd6.a) ((v) ((hna.a) documentSelectorScreen.M.getValue())).d.get()).e, zhm.v.k(documentSelectorScreen.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), documentSelectorScreen.P)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f144944b;
        if (clause != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(clause, null);
            d3().f174539b.setToolbarTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hna.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new g85.f(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
