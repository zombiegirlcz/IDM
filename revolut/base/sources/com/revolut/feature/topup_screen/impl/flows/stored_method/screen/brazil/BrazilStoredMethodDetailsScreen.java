package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import qve.d;
import te0.w;
import tx0.s3;
import tx0.t3;
import urd.n;
import uxe.g;
import uxe.j;
import uxe.k;
import uxe.l;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsScreenContract$OutputData;", "Ldli/a;", "Luxe/o;", "Companion", "a", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazilStoredMethodDetailsScreen extends ViewController<BrazilStoredMethodDetailsScreenContract$OutputData> implements dli.a {
    public final BrazilStoredMethodDetailsScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final CellDetailsDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrazilStoredMethodDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BrazilStoredMethodDetailsScreen(BrazilStoredMethodDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, g.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new CellDetailsDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: uxe.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilStoredMethodDetailsScreen f283991b;

            {
                this.f283991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen = this.f283991b;
                switch (i2) {
                    case 0:
                        BrazilStoredMethodDetailsScreen.Companion companion = BrazilStoredMethodDetailsScreen.INSTANCE;
                        qji.b bVarU2 = brazilStoredMethodDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.di.BrazilStoredMethodDetailsScreenComponent.Injector");
                        qve.c cVar = (qve.c) bVarU2;
                        qve.k kVar = cVar.f249580b;
                        qve.c cVar2 = cVar.f249581c;
                        BrazilStoredMethodDetailsScreenContract$InputData brazilStoredMethodDetailsScreenContract$InputData = brazilStoredMethodDetailsScreen.K;
                        brazilStoredMethodDetailsScreenContract$InputData.getClass();
                        return new qve.d(kVar, cVar2, brazilStoredMethodDetailsScreenContract$InputData);
                    case 1:
                        BrazilStoredMethodDetailsScreen.Companion companion2 = BrazilStoredMethodDetailsScreen.INSTANCE;
                        return (n) ((qve.d) brazilStoredMethodDetailsScreen.P.getValue()).f249584c.get();
                    default:
                        BrazilStoredMethodDetailsScreen.Companion companion3 = BrazilStoredMethodDetailsScreen.INSTANCE;
                        BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen2 = this.f283991b;
                        return dli.f.a(brazilStoredMethodDetailsScreen2, brazilStoredMethodDetailsScreen2.R2(), v.k(brazilStoredMethodDetailsScreen2.M, new ListSubheaderDelegate(), brazilStoredMethodDetailsScreen2.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new FooterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: uxe.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilStoredMethodDetailsScreen f283991b;

            {
                this.f283991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen = this.f283991b;
                switch (i22) {
                    case 0:
                        BrazilStoredMethodDetailsScreen.Companion companion = BrazilStoredMethodDetailsScreen.INSTANCE;
                        qji.b bVarU2 = brazilStoredMethodDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.di.BrazilStoredMethodDetailsScreenComponent.Injector");
                        qve.c cVar = (qve.c) bVarU2;
                        qve.k kVar = cVar.f249580b;
                        qve.c cVar2 = cVar.f249581c;
                        BrazilStoredMethodDetailsScreenContract$InputData brazilStoredMethodDetailsScreenContract$InputData = brazilStoredMethodDetailsScreen.K;
                        brazilStoredMethodDetailsScreenContract$InputData.getClass();
                        return new qve.d(kVar, cVar2, brazilStoredMethodDetailsScreenContract$InputData);
                    case 1:
                        BrazilStoredMethodDetailsScreen.Companion companion2 = BrazilStoredMethodDetailsScreen.INSTANCE;
                        return (n) ((qve.d) brazilStoredMethodDetailsScreen.P.getValue()).f249584c.get();
                    default:
                        BrazilStoredMethodDetailsScreen.Companion companion3 = BrazilStoredMethodDetailsScreen.INSTANCE;
                        BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen2 = this.f283991b;
                        return dli.f.a(brazilStoredMethodDetailsScreen2, brazilStoredMethodDetailsScreen2.R2(), v.k(brazilStoredMethodDetailsScreen2.M, new ListSubheaderDelegate(), brazilStoredMethodDetailsScreen2.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new FooterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: uxe.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilStoredMethodDetailsScreen f283991b;

            {
                this.f283991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen = this.f283991b;
                switch (i22) {
                    case 0:
                        BrazilStoredMethodDetailsScreen.Companion companion = BrazilStoredMethodDetailsScreen.INSTANCE;
                        qji.b bVarU2 = brazilStoredMethodDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.di.BrazilStoredMethodDetailsScreenComponent.Injector");
                        qve.c cVar = (qve.c) bVarU2;
                        qve.k kVar = cVar.f249580b;
                        qve.c cVar2 = cVar.f249581c;
                        BrazilStoredMethodDetailsScreenContract$InputData brazilStoredMethodDetailsScreenContract$InputData = brazilStoredMethodDetailsScreen.K;
                        brazilStoredMethodDetailsScreenContract$InputData.getClass();
                        return new qve.d(kVar, cVar2, brazilStoredMethodDetailsScreenContract$InputData);
                    case 1:
                        BrazilStoredMethodDetailsScreen.Companion companion2 = BrazilStoredMethodDetailsScreen.INSTANCE;
                        return (n) ((qve.d) brazilStoredMethodDetailsScreen.P.getValue()).f249584c.get();
                    default:
                        BrazilStoredMethodDetailsScreen.Companion companion3 = BrazilStoredMethodDetailsScreen.INSTANCE;
                        BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen2 = this.f283991b;
                        return dli.f.a(brazilStoredMethodDetailsScreen2, brazilStoredMethodDetailsScreen2.R2(), v.k(brazilStoredMethodDetailsScreen2.M, new ListSubheaderDelegate(), brazilStoredMethodDetailsScreen2.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new FooterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        uxe.o uiState = (uxe.o) oVar;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        s3 s3Var = uiState.f283999c;
        if (s3Var != null) {
            navBarWithToolbar.setEndImage(s3Var);
        }
        String str = uiState.d;
        if (str != null) {
            navBarWithToolbar.setToolbarTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar.setTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        }
        String str2 = uiState.e;
        if (str2 != null) {
            navBarWithToolbar.setDescriptionText(new CompositeClause(v.k(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_edit, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
            navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorAccent);
            navBarWithToolbar.setDescriptionClickable(true);
            navBarWithToolbar.setDescriptionVisible(true);
        } else {
            navBarWithToolbar.setDescriptionVisible(false);
        }
        if (!uiState.f283998b) {
            navBarWithToolbar.l0();
            return;
        }
        t3 t3Var = t3.PROFILE;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.I0(t3Var, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.q0()), new j(this, null, 1), 3);
        ViewController.P2(this, new n(rd0.e.b(this.M.f53218h), 15), new k(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(this.N.d), 16), new l(this, null, 0), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final uxe.n R2() {
        return (uxe.n) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
