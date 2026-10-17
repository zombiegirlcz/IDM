package com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import co7.c;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.PixTrustedListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d83.i;
import dba.d;
import dba.f;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.n;
import p8a.w0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/trusted_list/PixTrustedListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldba/f;", "Ldli/a;", "Ldba/h;", "Lno/d1;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixTrustedListScreen extends ViewController<f> implements dli.a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixTrustedListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object O;
    public final Object P;
    public final Object R;
    public final h K = s.t(this, a.f);
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final LargeActionButtonDelegate N = new LargeActionButtonDelegate();
    public final int Q = R$layout.screen_recycler_navbar;

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

    public PixTrustedListScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: dba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixTrustedListScreen f112693b;

            {
                this.f112693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixTrustedListScreen pixTrustedListScreen = this.f112693b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixTrustedListScreen.S;
                        return (i) ((w0) pixTrustedListScreen.P.getValue()).f234116g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixTrustedListScreen.S;
                        qji.b bVarU2 = pixTrustedListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.di.PixTrustedListScreenInjector");
                        n nVar = (n) bVarU2;
                        return new w0(nVar.f234031b, nVar.f234032c, pixTrustedListScreen);
                    default:
                        KProperty[] kPropertyArr3 = PixTrustedListScreen.S;
                        PixTrustedListScreen pixTrustedListScreen2 = this.f112693b;
                        return dli.f.a(pixTrustedListScreen2, pixTrustedListScreen2.R2(), v.k(pixTrustedListScreen2.L, new ListSubheaderDelegate(), pixTrustedListScreen2.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: dba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixTrustedListScreen f112693b;

            {
                this.f112693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixTrustedListScreen pixTrustedListScreen = this.f112693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixTrustedListScreen.S;
                        return (i) ((w0) pixTrustedListScreen.P.getValue()).f234116g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixTrustedListScreen.S;
                        qji.b bVarU2 = pixTrustedListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.di.PixTrustedListScreenInjector");
                        n nVar = (n) bVarU2;
                        return new w0(nVar.f234031b, nVar.f234032c, pixTrustedListScreen);
                    default:
                        KProperty[] kPropertyArr3 = PixTrustedListScreen.S;
                        PixTrustedListScreen pixTrustedListScreen2 = this.f112693b;
                        return dli.f.a(pixTrustedListScreen2, pixTrustedListScreen2.R2(), v.k(pixTrustedListScreen2.L, new ListSubheaderDelegate(), pixTrustedListScreen2.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: dba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixTrustedListScreen f112693b;

            {
                this.f112693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixTrustedListScreen pixTrustedListScreen = this.f112693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixTrustedListScreen.S;
                        return (i) ((w0) pixTrustedListScreen.P.getValue()).f234116g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixTrustedListScreen.S;
                        qji.b bVarU2 = pixTrustedListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.di.PixTrustedListScreenInjector");
                        n nVar = (n) bVarU2;
                        return new w0(nVar.f234031b, nVar.f234032c, pixTrustedListScreen);
                    default:
                        KProperty[] kPropertyArr3 = PixTrustedListScreen.S;
                        PixTrustedListScreen pixTrustedListScreen2 = this.f112693b;
                        return dli.f.a(pixTrustedListScreen2, pixTrustedListScreen2.R2(), v.k(pixTrustedListScreen2.L, new ListSubheaderDelegate(), pixTrustedListScreen2.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((dba.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_trusted_list_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pix_trusted_list_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.pix_trusted_list_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((w0) this.P.getValue()).e.get()).d(v.k(this.M, this.N));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new dba.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new d(this, null), 3);
        ViewController.P2(this, new i(rd0.e.b(this.N.d.f121375b), 5), new d8j.c(this, continuation, 6), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final dba.i R2() {
        return (dba.i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
