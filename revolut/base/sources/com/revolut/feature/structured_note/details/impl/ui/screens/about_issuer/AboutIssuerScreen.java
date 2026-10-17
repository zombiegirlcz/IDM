package com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dze.n;
import e58.d;
import e5e.b;
import e5e.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/about_issuer/AboutIssuerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le5e/d;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AboutIssuerScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AboutIssuerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final HeaderDelegate M;
    public final HeaderLoadingDelegate N;
    public final ListSubheaderLoadingDelegate O;
    public final ListSubheaderDelegate P;
    public final RatingBarDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public AboutIssuerScreen(AboutIssuerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = new HeaderDelegate();
        this.N = new HeaderLoadingDelegate();
        this.O = new ListSubheaderLoadingDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new RatingBarDelegate();
        this.R = w.y0(new d(this, inputData, 1));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: e5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutIssuerScreen f122810b;

            {
                this.f122810b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AboutIssuerScreen.U;
                        return (f) ((o4e.a) this.f122810b.R.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = AboutIssuerScreen.U;
                        AboutIssuerScreen aboutIssuerScreen = this.f122810b;
                        return dli.f.a(aboutIssuerScreen, (f) aboutIssuerScreen.S.getValue(), v.k(aboutIssuerScreen.M, aboutIssuerScreen.N, aboutIssuerScreen.P, aboutIssuerScreen.O, aboutIssuerScreen.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: e5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutIssuerScreen f122810b;

            {
                this.f122810b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AboutIssuerScreen.U;
                        return (f) ((o4e.a) this.f122810b.R.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = AboutIssuerScreen.U;
                        AboutIssuerScreen aboutIssuerScreen = this.f122810b;
                        return dli.f.a(aboutIssuerScreen, (f) aboutIssuerScreen.S.getValue(), v.k(aboutIssuerScreen.M, aboutIssuerScreen.N, aboutIssuerScreen.P, aboutIssuerScreen.O, aboutIssuerScreen.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e5e.d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o4e.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_structured_notes_issuer_screen_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new n(this, null, 12), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
