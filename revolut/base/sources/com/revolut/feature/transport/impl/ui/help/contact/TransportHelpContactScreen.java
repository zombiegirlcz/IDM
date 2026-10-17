package com.revolut.feature.transport.impl.ui.help.contact;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.help.contact.TransportHelpContactScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import hvf.n;
import hvf.o;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import xsf.c;
import xvf.g;
import xvf.j;
import xvf.k;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/help/contact/TransportHelpContactScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxvf/g;", "<init>", "()V", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportHelpContactScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TransportHelpContactScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new c(7));
    public final Object O = w.y0(new c(8));
    public final Object P = w.y0(new c(9));
    public final Object Q = w.y0(new c(10));
    public final Object R;
    public final Object S;
    public final Object T;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public TransportHelpContactScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: xvf.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportHelpContactScreen f309254b;

            {
                this.f309254b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransportHelpContactScreen transportHelpContactScreen = this.f309254b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransportHelpContactScreen.U;
                        TransportHelpContactScreen transportHelpContactScreen2 = this.f309254b;
                        return dli.f.a(transportHelpContactScreen2, (h) transportHelpContactScreen2.T.getValue(), v.k((RowDelegate) transportHelpContactScreen2.N.getValue(), (CellDetailsActionDelegate) transportHelpContactScreen2.O.getValue(), (CellDetailsDelegate) transportHelpContactScreen2.P.getValue(), (FullScreenStateDelegate) transportHelpContactScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransportHelpContactScreen.U;
                        qji.b bVarU2 = transportHelpContactScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.help.contact.di.TransportHelpContactScreenInjector");
                        o oVar = (o) bVarU2;
                        return new hvf.n(oVar.f155935a, oVar.f155936b);
                    default:
                        KProperty[] kPropertyArr3 = TransportHelpContactScreen.U;
                        return (h) ((hvf.n) transportHelpContactScreen.S.getValue()).f155934c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: xvf.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportHelpContactScreen f309254b;

            {
                this.f309254b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransportHelpContactScreen transportHelpContactScreen = this.f309254b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportHelpContactScreen.U;
                        TransportHelpContactScreen transportHelpContactScreen2 = this.f309254b;
                        return dli.f.a(transportHelpContactScreen2, (h) transportHelpContactScreen2.T.getValue(), v.k((RowDelegate) transportHelpContactScreen2.N.getValue(), (CellDetailsActionDelegate) transportHelpContactScreen2.O.getValue(), (CellDetailsDelegate) transportHelpContactScreen2.P.getValue(), (FullScreenStateDelegate) transportHelpContactScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransportHelpContactScreen.U;
                        qji.b bVarU2 = transportHelpContactScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.help.contact.di.TransportHelpContactScreenInjector");
                        o oVar = (o) bVarU2;
                        return new hvf.n(oVar.f155935a, oVar.f155936b);
                    default:
                        KProperty[] kPropertyArr3 = TransportHelpContactScreen.U;
                        return (h) ((hvf.n) transportHelpContactScreen.S.getValue()).f155934c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: xvf.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportHelpContactScreen f309254b;

            {
                this.f309254b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransportHelpContactScreen transportHelpContactScreen = this.f309254b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportHelpContactScreen.U;
                        TransportHelpContactScreen transportHelpContactScreen2 = this.f309254b;
                        return dli.f.a(transportHelpContactScreen2, (h) transportHelpContactScreen2.T.getValue(), v.k((RowDelegate) transportHelpContactScreen2.N.getValue(), (CellDetailsActionDelegate) transportHelpContactScreen2.O.getValue(), (CellDetailsDelegate) transportHelpContactScreen2.P.getValue(), (FullScreenStateDelegate) transportHelpContactScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransportHelpContactScreen.U;
                        qji.b bVarU2 = transportHelpContactScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.help.contact.di.TransportHelpContactScreenInjector");
                        o oVar = (o) bVarU2;
                        return new hvf.n(oVar.f155935a, oVar.f155936b);
                    default:
                        KProperty[] kPropertyArr3 = TransportHelpContactScreen.U;
                        return (h) ((hvf.n) transportHelpContactScreen.S.getValue()).f155934c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setText(uiState.f309252b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (xvf.h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transport_get_help_otp_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_get_help_otp_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new j(this, null, 1), 3);
        r rVarMerge = r.merge(w.a0(((RowDelegate) this.N.getValue()).f53218h, new xub.e(11)), w.a0(((CellDetailsActionDelegate) this.O.getValue()).d, new xub.e(12)), w.a0(((CellDetailsDelegate) this.P.getValue()).f, new xub.e(13)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new xv4.o(this, (Continuation) null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new k(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
