package com.revolut.feature.trusted_merchants.impl.ui.kompot.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nfj.j2;
import njg.e;
import njg.f;
import njg.i;
import pki.b;
import te0.w;
import tki.c;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/list/TrustedMerchantsListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnjg/e;", "Ltki/c;", "Lnjg/f;", "<init>", "()V", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedMerchantsListController extends ViewController<e> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TrustedMerchantsListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new nhl.s(23));
    public final Object N = w.y0(new nhl.s(24));
    public final Object O = w.y0(new nhl.s(25));
    public final Object P = w.y0(new nhl.s(26));
    public final Object Q = w.y0(new nhl.s(27));
    public final Object R;
    public final Object S;
    public final Object T;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TrustedMerchantsListController() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: njg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantsListController f216513b;

            {
                this.f216513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustedMerchantsListController trustedMerchantsListController = this.f216513b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedMerchantsListController.U;
                        TrustedMerchantsListController trustedMerchantsListController2 = this.f216513b;
                        return tki.g.a(trustedMerchantsListController2, (a) trustedMerchantsListController2.T.getValue(), v.k((ListSubheaderDelegate) trustedMerchantsListController2.M.getValue(), (RowDelegate) trustedMerchantsListController2.N.getValue(), (FullScreenStateDelegate) trustedMerchantsListController2.O.getValue(), (RowLoadingDelegate) trustedMerchantsListController2.P.getValue(), (ListSubheaderLoadingDelegate) trustedMerchantsListController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedMerchantsListController.U;
                        qji.b bVarU2 = trustedMerchantsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.list.di.TrustedMerchantsListControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        return new ejg.e(dVar.f126896b, dVar.f126897c);
                    default:
                        KProperty[] kPropertyArr3 = TrustedMerchantsListController.U;
                        return (a) ((ejg.e) trustedMerchantsListController.S.getValue()).f126899b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: njg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantsListController f216513b;

            {
                this.f216513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustedMerchantsListController trustedMerchantsListController = this.f216513b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedMerchantsListController.U;
                        TrustedMerchantsListController trustedMerchantsListController2 = this.f216513b;
                        return tki.g.a(trustedMerchantsListController2, (a) trustedMerchantsListController2.T.getValue(), v.k((ListSubheaderDelegate) trustedMerchantsListController2.M.getValue(), (RowDelegate) trustedMerchantsListController2.N.getValue(), (FullScreenStateDelegate) trustedMerchantsListController2.O.getValue(), (RowLoadingDelegate) trustedMerchantsListController2.P.getValue(), (ListSubheaderLoadingDelegate) trustedMerchantsListController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedMerchantsListController.U;
                        qji.b bVarU2 = trustedMerchantsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.list.di.TrustedMerchantsListControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        return new ejg.e(dVar.f126896b, dVar.f126897c);
                    default:
                        KProperty[] kPropertyArr3 = TrustedMerchantsListController.U;
                        return (a) ((ejg.e) trustedMerchantsListController.S.getValue()).f126899b.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: njg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantsListController f216513b;

            {
                this.f216513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrustedMerchantsListController trustedMerchantsListController = this.f216513b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedMerchantsListController.U;
                        TrustedMerchantsListController trustedMerchantsListController2 = this.f216513b;
                        return tki.g.a(trustedMerchantsListController2, (a) trustedMerchantsListController2.T.getValue(), v.k((ListSubheaderDelegate) trustedMerchantsListController2.M.getValue(), (RowDelegate) trustedMerchantsListController2.N.getValue(), (FullScreenStateDelegate) trustedMerchantsListController2.O.getValue(), (RowLoadingDelegate) trustedMerchantsListController2.P.getValue(), (ListSubheaderLoadingDelegate) trustedMerchantsListController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedMerchantsListController.U;
                        qji.b bVarU2 = trustedMerchantsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.list.di.TrustedMerchantsListControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        return new ejg.e(dVar.f126896b, dVar.f126897c);
                    default:
                        KProperty[] kPropertyArr3 = TrustedMerchantsListController.U;
                        return (a) ((ejg.e) trustedMerchantsListController.S.getValue()).f126899b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ejg.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (njg.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trusted_merchants_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.trusted_merchants_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new j2(this, null, 10), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new njg.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new i(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
