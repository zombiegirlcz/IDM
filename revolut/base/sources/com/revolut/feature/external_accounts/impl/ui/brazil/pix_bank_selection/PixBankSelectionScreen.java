package com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.PixBankSelectionScreen;
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
import njj.n;
import nk6.c;
import nk6.d;
import nk6.f;
import nk6.i;
import te0.w;
import vc.s;
import xf6.j0;
import xf6.o;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/pix_bank_selection/PixBankSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnk6/f;", "Ldli/a;", "Lnk6/i;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixBankSelectionScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PixBankSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h N = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();

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

    public PixBankSelectionScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixBankSelectionScreen f216654b;

            {
                this.f216654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixBankSelectionScreen pixBankSelectionScreen = this.f216654b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixBankSelectionScreen.R;
                        qji.b bVarU2 = pixBankSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.di.PixBankSelectionScreenComponent.Injector");
                        o oVar = (o) bVarU2;
                        return new j0(oVar.f304970b, oVar.f304971c);
                    case 1:
                        KProperty[] kPropertyArr2 = PixBankSelectionScreen.R;
                        return (h) ((j0) pixBankSelectionScreen.L.getValue()).f304899b.get();
                    default:
                        KProperty[] kPropertyArr3 = PixBankSelectionScreen.R;
                        PixBankSelectionScreen pixBankSelectionScreen2 = this.f216654b;
                        return dli.f.a(pixBankSelectionScreen2, pixBankSelectionScreen2.d(), v.k(pixBankSelectionScreen2.O, pixBankSelectionScreen2.P, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixBankSelectionScreen f216654b;

            {
                this.f216654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixBankSelectionScreen pixBankSelectionScreen = this.f216654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixBankSelectionScreen.R;
                        qji.b bVarU2 = pixBankSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.di.PixBankSelectionScreenComponent.Injector");
                        o oVar = (o) bVarU2;
                        return new j0(oVar.f304970b, oVar.f304971c);
                    case 1:
                        KProperty[] kPropertyArr2 = PixBankSelectionScreen.R;
                        return (h) ((j0) pixBankSelectionScreen.L.getValue()).f304899b.get();
                    default:
                        KProperty[] kPropertyArr3 = PixBankSelectionScreen.R;
                        PixBankSelectionScreen pixBankSelectionScreen2 = this.f216654b;
                        return dli.f.a(pixBankSelectionScreen2, pixBankSelectionScreen2.d(), v.k(pixBankSelectionScreen2.O, pixBankSelectionScreen2.P, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixBankSelectionScreen f216654b;

            {
                this.f216654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixBankSelectionScreen pixBankSelectionScreen = this.f216654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixBankSelectionScreen.R;
                        qji.b bVarU2 = pixBankSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.di.PixBankSelectionScreenComponent.Injector");
                        o oVar = (o) bVarU2;
                        return new j0(oVar.f304970b, oVar.f304971c);
                    case 1:
                        KProperty[] kPropertyArr2 = PixBankSelectionScreen.R;
                        return (h) ((j0) pixBankSelectionScreen.L.getValue()).f304899b.get();
                    default:
                        KProperty[] kPropertyArr3 = PixBankSelectionScreen.R;
                        PixBankSelectionScreen pixBankSelectionScreen2 = this.f216654b;
                        return dli.f.a(pixBankSelectionScreen2, pixBankSelectionScreen2.d(), v.k(pixBankSelectionScreen2.O, pixBankSelectionScreen2.P, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_pix_smart_transfer_bank_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.topup_pix_smart_transfer_bank_selection_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.topup_pix_smart_transfer_bank_selection_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new j2(this, null, 11), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new bl6.f(navBarWithToolbar, null, 4), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(this.O.f53218h), 3), new c(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final nk6.h d() {
        return (nk6.h) this.M.getValue();
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
