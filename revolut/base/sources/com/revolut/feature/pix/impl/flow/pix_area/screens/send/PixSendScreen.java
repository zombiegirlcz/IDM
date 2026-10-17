package com.revolut.feature.pix.impl.flow.pix_area.screens.send;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.c;
import aw0.k9;
import bba.j;
import bba.k;
import bba.l;
import cli.o;
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
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import p8a.t0;
import p8a.u0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/send/PixSendScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbba/j;", "Ldli/a;", "Lbba/l;", "Lno/d1;", "<init>", "()V", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixSendScreen extends ViewController<j> implements a, d1 {
    public final Object L;
    public final Object M;
    public final Object Q;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixSendScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int K = R$layout.screen_recycler_navbar;
    public final Object N = w.y0(new b8g.a(7));
    public final Object O = w.y0(new b8g.a(8));
    public final Object P = w.y0(new b8g.a(9));
    public final h R = s.t(this, b.f);

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public PixSendScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixSendScreen f14199b;

            {
                this.f14199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixSendScreen pixSendScreen = this.f14199b;
                switch (i2) {
                    case 0:
                        PixSendScreen.Companion companion = PixSendScreen.INSTANCE;
                        qji.b bVarU2 = pixSendScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.send.di.PixSendScreenInjector");
                        u0 u0Var = (u0) bVarU2;
                        return new t0(u0Var.f234097b, u0Var.f234098c, pixSendScreen);
                    case 1:
                        PixSendScreen.Companion companion2 = PixSendScreen.INSTANCE;
                        return (k) ((t0) pixSendScreen.L.getValue()).f234091g.get();
                    default:
                        PixSendScreen.Companion companion3 = PixSendScreen.INSTANCE;
                        PixSendScreen pixSendScreen2 = this.f14199b;
                        return dli.f.a(pixSendScreen2, pixSendScreen2.d(), v.k((RowDelegate) pixSendScreen2.N.getValue(), (FullScreenStateDelegate) pixSendScreen2.O.getValue(), (CellDetailsDelegate) pixSendScreen2.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixSendScreen f14199b;

            {
                this.f14199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixSendScreen pixSendScreen = this.f14199b;
                switch (i22) {
                    case 0:
                        PixSendScreen.Companion companion = PixSendScreen.INSTANCE;
                        qji.b bVarU2 = pixSendScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.send.di.PixSendScreenInjector");
                        u0 u0Var = (u0) bVarU2;
                        return new t0(u0Var.f234097b, u0Var.f234098c, pixSendScreen);
                    case 1:
                        PixSendScreen.Companion companion2 = PixSendScreen.INSTANCE;
                        return (k) ((t0) pixSendScreen.L.getValue()).f234091g.get();
                    default:
                        PixSendScreen.Companion companion3 = PixSendScreen.INSTANCE;
                        PixSendScreen pixSendScreen2 = this.f14199b;
                        return dli.f.a(pixSendScreen2, pixSendScreen2.d(), v.k((RowDelegate) pixSendScreen2.N.getValue(), (FullScreenStateDelegate) pixSendScreen2.O.getValue(), (CellDetailsDelegate) pixSendScreen2.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixSendScreen f14199b;

            {
                this.f14199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixSendScreen pixSendScreen = this.f14199b;
                switch (i22) {
                    case 0:
                        PixSendScreen.Companion companion = PixSendScreen.INSTANCE;
                        qji.b bVarU2 = pixSendScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.send.di.PixSendScreenInjector");
                        u0 u0Var = (u0) bVarU2;
                        return new t0(u0Var.f234097b, u0Var.f234098c, pixSendScreen);
                    case 1:
                        PixSendScreen.Companion companion2 = PixSendScreen.INSTANCE;
                        return (k) ((t0) pixSendScreen.L.getValue()).f234091g.get();
                    default:
                        PixSendScreen.Companion companion3 = PixSendScreen.INSTANCE;
                        PixSendScreen pixSendScreen2 = this.f14199b;
                        return dli.f.a(pixSendScreen2, pixSendScreen2.d(), v.k((RowDelegate) pixSendScreen2.N.getValue(), (FullScreenStateDelegate) pixSendScreen2.O.getValue(), (CellDetailsDelegate) pixSendScreen2.P.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_send, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setSearchFieldActionButtons(new k9(new c("QR_SCAN_ACTION_BUTTON_ID", new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, 2));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.pix_send_search_placeholder, null, null, 14));
        ((j60.a) ((t0) this.L.getValue()).d.get()).d(u.c((RowDelegate) this.N.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new bba.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.w0()), null, new bba.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new b74.e(this, null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new bba.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
