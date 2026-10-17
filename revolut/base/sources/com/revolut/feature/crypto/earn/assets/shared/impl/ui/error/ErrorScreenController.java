package com.revolut.feature.crypto.earn.assets.shared.impl.ui.error;

import af5.d;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$id;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$layout;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$string;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.error.ErrorScreenController;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ff4.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import ue0.e;
import vc.s;
import ye5.c;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/error/ErrorScreenController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ErrorScreenController extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ErrorScreenController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/earn/assets/shared/impl/databinding/ErrorScreenBinding;", 0))};
    public final Object P;
    public final Object Q;
    public final int N = R$layout.error_screen;
    public final h O = s.t(this, a.f);
    public final j R = new j(7, u.c(new FullScreenStateDelegate()), false);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto/earn/assets/shared/impl/databinding/ErrorScreenBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.navBarWithContainer;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new c((ControllerContainerCoordinatorLayout) p0, navBarWithContainer, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ErrorScreenController() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ff5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreenController f134754b;

            {
                this.f134754b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ErrorScreenController errorScreenController = this.f134754b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ErrorScreenController.S;
                        phm.a aVar = (phm.a) e.j(errorScreenController.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.e();
                    default:
                        KProperty[] kPropertyArr2 = ErrorScreenController.S;
                        ((af5.e) errorScreenController.P.getValue()).getClass();
                        return new b();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ff5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreenController f134754b;

            {
                this.f134754b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ErrorScreenController errorScreenController = this.f134754b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ErrorScreenController.S;
                        phm.a aVar = (phm.a) e.j(errorScreenController.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        return new af5.e();
                    default:
                        KProperty[] kPropertyArr2 = ErrorScreenController.S;
                        ((af5.e) errorScreenController.P.getValue()).getClass();
                        return new b();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (af5.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (ff5.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().f312776c;
        j jVar = this.R;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.setVisibility(0);
        screenContentRecyclerView.addItemDecoration(new o31.b());
        jVar.c(iii.c.b(null, null, 6, false));
        NavBarWithContainer navBarWithContainer = d3().f312775b;
        navBarWithContainer.setTitle(new TextLocalisedClause(R$string.crypto_staking_staking_overview_header_title, null, null, 14));
        navBarWithContainer.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f312775b.K()), new z(this, null, 1), 3);
    }

    public final c d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.N;
    }
}
