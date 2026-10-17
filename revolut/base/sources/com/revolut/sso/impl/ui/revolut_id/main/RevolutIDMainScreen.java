package com.revolut.sso.impl.ui.revolut_id.main;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.c1;
import au0.s0;
import au0.t0;
import au0.u0;
import au0.y0;
import aw0.s8;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.revolut_id.main.RevolutIDMainScreen;
import dli.a;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mjl.o;
import org.jetbrains.annotations.NotNull;
import oz0.c;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import xpl.h;
import xpl.i;
import xpl.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/main/RevolutIDMainScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxpl/h;", "Ldli/a;", "Lxpl/j;", "<init>", "()V", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutIDMainScreen extends ViewController<h> implements a {
    public final ao.h K = s.t(this, b.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final ListSubheaderDelegate M = new ListSubheaderDelegate();
    public final int N = R$layout.screen_recycler_navbarwithbigtile;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevolutIDMainScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.sso.impl.ui.revolut_id.main.RevolutIDMainScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, d0.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return d0.a(p0);
        }
    }

    public RevolutIDMainScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutIDMainScreen f308010b;

            {
                this.f308010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevolutIDMainScreen revolutIDMainScreen = this.f308010b;
                switch (i2) {
                    case 0:
                        RevolutIDMainScreen.Companion companion = RevolutIDMainScreen.INSTANCE;
                        RevolutIDMainScreen revolutIDMainScreen2 = this.f308010b;
                        return dli.f.a(revolutIDMainScreen2, (i) revolutIDMainScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), revolutIDMainScreen2.M, new ListSubheaderLoadingDelegate(), revolutIDMainScreen2.L, new RowLoadingDelegate()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutIDMainScreen.Companion companion2 = RevolutIDMainScreen.INSTANCE;
                        qji.b bVarU2 = revolutIDMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.main.di.RevolutIDMainScreenInjector");
                        mjl.n nVar = (mjl.n) bVarU2;
                        return new o(nVar.f206114b, nVar.f206115c);
                    default:
                        RevolutIDMainScreen.Companion companion3 = RevolutIDMainScreen.INSTANCE;
                        return (i) ((o) revolutIDMainScreen.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutIDMainScreen f308010b;

            {
                this.f308010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevolutIDMainScreen revolutIDMainScreen = this.f308010b;
                switch (i22) {
                    case 0:
                        RevolutIDMainScreen.Companion companion = RevolutIDMainScreen.INSTANCE;
                        RevolutIDMainScreen revolutIDMainScreen2 = this.f308010b;
                        return dli.f.a(revolutIDMainScreen2, (i) revolutIDMainScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), revolutIDMainScreen2.M, new ListSubheaderLoadingDelegate(), revolutIDMainScreen2.L, new RowLoadingDelegate()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutIDMainScreen.Companion companion2 = RevolutIDMainScreen.INSTANCE;
                        qji.b bVarU2 = revolutIDMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.main.di.RevolutIDMainScreenInjector");
                        mjl.n nVar = (mjl.n) bVarU2;
                        return new o(nVar.f206114b, nVar.f206115c);
                    default:
                        RevolutIDMainScreen.Companion companion3 = RevolutIDMainScreen.INSTANCE;
                        return (i) ((o) revolutIDMainScreen.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutIDMainScreen f308010b;

            {
                this.f308010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevolutIDMainScreen revolutIDMainScreen = this.f308010b;
                switch (i22) {
                    case 0:
                        RevolutIDMainScreen.Companion companion = RevolutIDMainScreen.INSTANCE;
                        RevolutIDMainScreen revolutIDMainScreen2 = this.f308010b;
                        return dli.f.a(revolutIDMainScreen2, (i) revolutIDMainScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), revolutIDMainScreen2.M, new ListSubheaderLoadingDelegate(), revolutIDMainScreen2.L, new RowLoadingDelegate()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutIDMainScreen.Companion companion2 = RevolutIDMainScreen.INSTANCE;
                        qji.b bVarU2 = revolutIDMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.main.di.RevolutIDMainScreenInjector");
                        mjl.n nVar = (mjl.n) bVarU2;
                        return new o(nVar.f206114b, nVar.f206115c);
                    default:
                        RevolutIDMainScreen.Companion companion3 = RevolutIDMainScreen.INSTANCE;
                        return (i) ((o) revolutIDMainScreen.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        jpl.b bVar = (jpl.b) ((o) this.P.getValue()).f206118c.get();
        bVar.getClass();
        RowDelegate rowDelegate = this.L;
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        ListSubheaderDelegate listSubheaderDelegate = this.M;
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        bVar.d = rowDelegate;
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile navBarWithBigTile = ((d0) value).f174510b;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        NavBarWithContainerBackground.VideoBackground videoBackground = new NavBarWithContainerBackground.VideoBackground(new UrlVideo("https://assets.revolut.com/mobile/sso/revolut_id/revolut_id_home_transparent_light.mp4", "https://assets.revolut.com/mobile/sso/revolut_id/revolut_id_home_transparent.mp4", false, oz0.b.CENTER_CROP, false, c.ENABLED, 52), (Image) null, (VideoShutter) null, (s8) null, 30);
        t0.a aVar = t0.a.f9365a;
        t0.a kind = t0.a.f9365a;
        Intrinsics.checkNotNullParameter(kind, "kind");
        c1.S(navBarWithBigTile, u.c(new u0(videoBackground, new y0(), null, null)), null, null, 6);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((d0) value).f174510b.f59357t), null, new xni.h(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new xpl.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
