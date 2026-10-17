package com.revolut.feature.transport.impl.ui.help.main;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.help.main.TransportHelpMainScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hvf.o;
import hvf.p;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;
import zr4.b;
import zt4.l;
import zul.l0;
import zvf.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/help/main/TransportHelpMainScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzvf/b;", "<init>", "()V", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportHelpMainScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransportHelpMainScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new b(27));
    public final Object O = w.y0(new b(28));
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public TransportHelpMainScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zvf.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportHelpMainScreen f325677b;

            {
                this.f325677b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransportHelpMainScreen transportHelpMainScreen = this.f325677b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransportHelpMainScreen.S;
                        TransportHelpMainScreen transportHelpMainScreen2 = this.f325677b;
                        return dli.f.a(transportHelpMainScreen2, (c) transportHelpMainScreen2.R.getValue(), v.k((RowDelegate) transportHelpMainScreen2.N.getValue(), (PlainTextWarningDelegate) transportHelpMainScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransportHelpMainScreen.S;
                        qji.b bVarU2 = transportHelpMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.help.main.di.TransportHelpMainScreenInjector");
                        o oVar = (o) bVarU2;
                        return new p(oVar.f155935a, oVar.f155936b);
                    default:
                        KProperty[] kPropertyArr3 = TransportHelpMainScreen.S;
                        return (c) ((p) transportHelpMainScreen.Q.getValue()).f155940c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zvf.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportHelpMainScreen f325677b;

            {
                this.f325677b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransportHelpMainScreen transportHelpMainScreen = this.f325677b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportHelpMainScreen.S;
                        TransportHelpMainScreen transportHelpMainScreen2 = this.f325677b;
                        return dli.f.a(transportHelpMainScreen2, (c) transportHelpMainScreen2.R.getValue(), v.k((RowDelegate) transportHelpMainScreen2.N.getValue(), (PlainTextWarningDelegate) transportHelpMainScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransportHelpMainScreen.S;
                        qji.b bVarU2 = transportHelpMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.help.main.di.TransportHelpMainScreenInjector");
                        o oVar = (o) bVarU2;
                        return new p(oVar.f155935a, oVar.f155936b);
                    default:
                        KProperty[] kPropertyArr3 = TransportHelpMainScreen.S;
                        return (c) ((p) transportHelpMainScreen.Q.getValue()).f155940c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zvf.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportHelpMainScreen f325677b;

            {
                this.f325677b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransportHelpMainScreen transportHelpMainScreen = this.f325677b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportHelpMainScreen.S;
                        TransportHelpMainScreen transportHelpMainScreen2 = this.f325677b;
                        return dli.f.a(transportHelpMainScreen2, (c) transportHelpMainScreen2.R.getValue(), v.k((RowDelegate) transportHelpMainScreen2.N.getValue(), (PlainTextWarningDelegate) transportHelpMainScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransportHelpMainScreen.S;
                        qji.b bVarU2 = transportHelpMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.help.main.di.TransportHelpMainScreenInjector");
                        o oVar = (o) bVarU2;
                        return new p(oVar.f155935a, oVar.f155936b);
                    default:
                        KProperty[] kPropertyArr3 = TransportHelpMainScreen.S;
                        return (c) ((p) transportHelpMainScreen.Q.getValue()).f155940c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((zvf.b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transport_get_help_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_get_help_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new zub.b(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.N.getValue()).f53218h, new l0(2))), null, new l(this, null, 9), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
