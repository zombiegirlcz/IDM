package com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.r0;
import au0.s0;
import aw0.d0;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$id;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$layout;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$string;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import g85.f;
import gaa.g;
import gf5.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.o2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/preview/EarnAssetsPreviewScreenController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgf5/b;", "<init>", "()V", "Companion", "a", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarnAssetsPreviewScreenController extends ViewController<q> implements a {
    public final int K = R$layout.earn_assets_preview_screen;
    public final h L = s.t(this, b.f);
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final List P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EarnAssetsPreviewScreenController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/earn/assets/shared/impl/databinding/EarnAssetsPreviewScreenBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, ye5.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto/earn/assets/shared/impl/databinding/EarnAssetsPreviewScreenBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.navBarWithBigTile;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
            if (navBarWithBigTile != null) {
                i = R$id.navBarWithContainerHeaderView;
                NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainerHeaderView != null) {
                    i = R$id.recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new ye5.a((ControllerContainerCoordinatorLayout) p0, navBarWithBigTile, navBarWithContainerHeaderView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public EarnAssetsPreviewScreenController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gf5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsPreviewScreenController f143347b;

            {
                this.f143347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EarnAssetsPreviewScreenController earnAssetsPreviewScreenController = this.f143347b;
                switch (i2) {
                    case 0:
                        EarnAssetsPreviewScreenController.Companion companion = EarnAssetsPreviewScreenController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(earnAssetsPreviewScreenController.m2()).a().get(af5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", af5.d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.a(((af5.d) objB).f3897j);
                    case 1:
                        EarnAssetsPreviewScreenController.Companion companion2 = EarnAssetsPreviewScreenController.INSTANCE;
                        return (h) ((af5.a) ((hf5.a) earnAssetsPreviewScreenController.M.getValue())).d.get();
                    default:
                        EarnAssetsPreviewScreenController.Companion companion3 = EarnAssetsPreviewScreenController.INSTANCE;
                        EarnAssetsPreviewScreenController earnAssetsPreviewScreenController2 = this.f143347b;
                        return dli.f.a(earnAssetsPreviewScreenController2, (h) earnAssetsPreviewScreenController2.N.getValue(), earnAssetsPreviewScreenController2.P, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gf5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsPreviewScreenController f143347b;

            {
                this.f143347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EarnAssetsPreviewScreenController earnAssetsPreviewScreenController = this.f143347b;
                switch (i22) {
                    case 0:
                        EarnAssetsPreviewScreenController.Companion companion = EarnAssetsPreviewScreenController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(earnAssetsPreviewScreenController.m2()).a().get(af5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", af5.d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.a(((af5.d) objB).f3897j);
                    case 1:
                        EarnAssetsPreviewScreenController.Companion companion2 = EarnAssetsPreviewScreenController.INSTANCE;
                        return (h) ((af5.a) ((hf5.a) earnAssetsPreviewScreenController.M.getValue())).d.get();
                    default:
                        EarnAssetsPreviewScreenController.Companion companion3 = EarnAssetsPreviewScreenController.INSTANCE;
                        EarnAssetsPreviewScreenController earnAssetsPreviewScreenController2 = this.f143347b;
                        return dli.f.a(earnAssetsPreviewScreenController2, (h) earnAssetsPreviewScreenController2.N.getValue(), earnAssetsPreviewScreenController2.P, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        final int i3 = 2;
        this.P = v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), new TextDelegate(), rowDelegate);
        this.Q = w.y0(new Function0(this) { // from class: gf5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsPreviewScreenController f143347b;

            {
                this.f143347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EarnAssetsPreviewScreenController earnAssetsPreviewScreenController = this.f143347b;
                switch (i22) {
                    case 0:
                        EarnAssetsPreviewScreenController.Companion companion = EarnAssetsPreviewScreenController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(earnAssetsPreviewScreenController.m2()).a().get(af5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", af5.d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.a(((af5.d) objB).f3897j);
                    case 1:
                        EarnAssetsPreviewScreenController.Companion companion2 = EarnAssetsPreviewScreenController.INSTANCE;
                        return (h) ((af5.a) ((hf5.a) earnAssetsPreviewScreenController.M.getValue())).d.get();
                    default:
                        EarnAssetsPreviewScreenController.Companion companion3 = EarnAssetsPreviewScreenController.INSTANCE;
                        EarnAssetsPreviewScreenController earnAssetsPreviewScreenController2 = this.f143347b;
                        return dli.f.a(earnAssetsPreviewScreenController2, (h) earnAssetsPreviewScreenController2.N.getValue(), earnAssetsPreviewScreenController2.P, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        gf5.b uiState = (gf5.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f143344a;
        if (clause != null) {
            d3().f312770c.setHeaderDisclaimer(clause);
            NavBarWithBigTile navBarWithBigTile = d3().f312769b;
            d0.Companion.getClass();
            navBarWithBigTile.setHeightMode(new o2(d0.f10273c));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hf5.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gf5.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = d3().f312770c;
        navBarWithContainerHeaderView.setExpandRatio(1.0f);
        navBarWithContainerHeaderView.f59386m.setVisibility(8);
        NavBarWithBigTile navBarWithBigTile = d3().f312769b;
        Continuation continuation = null;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setTitle(new TextLocalisedClause(R$string.crypto_staking_staking_overview_header_title, null, null, 14));
        navBarWithBigTile.setDescription(new TextLocalisedClause(R$string.crypto_staking_staking_overview_header_subtitle, null, null, 14));
        navBarWithBigTile.setHeightMode(new o2(new d0(100, 75)));
        navBarWithBigTile.setIcon(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_percent, R$attr.uikit_colorForeground, R$attr.uikit_colorTeal), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setIconClickable(false);
        ViewController.P2(this, rd0.e.b(d3().f312769b.f59357t), new f(this, continuation, 9), 3);
        ViewController.P2(this, kii.e.t(d3().f312770c.S, "hide(...)"), new g(this, continuation, 17), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new d(this, null), 3);
    }

    public final ye5.a d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ye5.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
