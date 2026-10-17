package com.revolut.feature.image_gallery.screens.grid;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.image_gallery.R$id;
import com.revolut.feature.image_gallery.R$layout;
import com.revolut.feature.image_gallery.screens.grid.ImageGalleryGridScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import ud7.c;
import v25.k;
import vc.s;
import vd7.e;
import vd7.f;
import vd7.g;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/image_gallery/screens/grid/ImageGalleryGridScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvd7/e;", "Ldli/a;", "Lvd7/g;", "<init>", "()V", "feature_image_gallery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageGalleryGridScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ImageGalleryGridScreen.class, "binding", "getBinding()Lcom/revolut/feature/image_gallery/databinding/ScreenImageGalleryGridBinding;", 0))};
    public final int K = R$layout.screen_image_gallery_grid;
    public final SmallCardDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, sd7.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/image_gallery/databinding/ScreenImageGalleryGridBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.imageGalleryGridScreen_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.imageGalleryGridScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new sd7.a((ControllerContainerLinearLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ImageGalleryGridScreen() {
        SmallCardDelegate.INSTANCE.getClass();
        this.L = new SmallCardDelegate(SmallCardDelegate.f53351j);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryGridScreen f287809b;

            {
                this.f287809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ImageGalleryGridScreen imageGalleryGridScreen = this.f287809b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ImageGalleryGridScreen.Q;
                        ImageGalleryGridScreen imageGalleryGridScreen2 = this.f287809b;
                        return dli.f.a(imageGalleryGridScreen2, (f) imageGalleryGridScreen2.P.getValue(), u.c(imageGalleryGridScreen2.L), R$id.imageGalleryGridScreen_recyclerView, new k(imageGalleryGridScreen2, 29), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = ImageGalleryGridScreen.Q;
                        qji.b bVarU2 = imageGalleryGridScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.image_gallery.screens.grid.di.ImageGalleryGridScreenInjector");
                        ud7.b bVar = ((ud7.b) bVarU2).d;
                        ud7.c cVar = new ud7.c();
                        cVar.f279169a = e4m.b.b(new ud7.a(bVar, 1));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = ImageGalleryGridScreen.Q;
                        return (f) ((ud7.c) imageGalleryGridScreen.O.getValue()).f279169a.get();
                }
            }
        });
        this.N = s.t(this, a.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryGridScreen f287809b;

            {
                this.f287809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ImageGalleryGridScreen imageGalleryGridScreen = this.f287809b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ImageGalleryGridScreen.Q;
                        ImageGalleryGridScreen imageGalleryGridScreen2 = this.f287809b;
                        return dli.f.a(imageGalleryGridScreen2, (f) imageGalleryGridScreen2.P.getValue(), u.c(imageGalleryGridScreen2.L), R$id.imageGalleryGridScreen_recyclerView, new k(imageGalleryGridScreen2, 29), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = ImageGalleryGridScreen.Q;
                        qji.b bVarU2 = imageGalleryGridScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.image_gallery.screens.grid.di.ImageGalleryGridScreenInjector");
                        ud7.b bVar = ((ud7.b) bVarU2).d;
                        ud7.c cVar = new ud7.c();
                        cVar.f279169a = e4m.b.b(new ud7.a(bVar, 1));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = ImageGalleryGridScreen.Q;
                        return (f) ((ud7.c) imageGalleryGridScreen.O.getValue()).f279169a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: vd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryGridScreen f287809b;

            {
                this.f287809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ImageGalleryGridScreen imageGalleryGridScreen = this.f287809b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ImageGalleryGridScreen.Q;
                        ImageGalleryGridScreen imageGalleryGridScreen2 = this.f287809b;
                        return dli.f.a(imageGalleryGridScreen2, (f) imageGalleryGridScreen2.P.getValue(), u.c(imageGalleryGridScreen2.L), R$id.imageGalleryGridScreen_recyclerView, new k(imageGalleryGridScreen2, 29), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = ImageGalleryGridScreen.Q;
                        qji.b bVarU2 = imageGalleryGridScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.image_gallery.screens.grid.di.ImageGalleryGridScreenInjector");
                        ud7.b bVar = ((ud7.b) bVarU2).d;
                        ud7.c cVar = new ud7.c();
                        cVar.f279169a = e4m.b.b(new ud7.a(bVar, 1));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = ImageGalleryGridScreen.Q;
                        return (f) ((ud7.c) imageGalleryGridScreen.O.getValue()).f279169a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f261830b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setShadowVisible(false);
        navBarWithToolbar.j0(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f261830b.f59410q), null, new uwe.f(this, null, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d), null, new vd7.b(this, null), 3);
    }

    public final sd7.a d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (sd7.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
