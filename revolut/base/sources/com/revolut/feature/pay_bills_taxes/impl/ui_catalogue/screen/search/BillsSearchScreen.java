package com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import bh9.b;
import bh9.e;
import bh9.f;
import bh9.g;
import bh9.k;
import bh9.l;
import bh9.m;
import bh9.n;
import bh9.p;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.d;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/screen/search/BillsSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbh9/e;", "Ldli/a;", "Lbh9/g;", "Companion", "a", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillsSearchScreen extends ViewController<e> implements a {
    public final b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BillsSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BillsSearchScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bh9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillsSearchScreen f15280b;

            {
                this.f15280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BillsSearchScreen billsSearchScreen = this.f15280b;
                switch (i2) {
                    case 0:
                        BillsSearchScreen.Companion companion = BillsSearchScreen.INSTANCE;
                        return new InputTextDelegate(new b7d.c(billsSearchScreen, 29));
                    case 1:
                        BillsSearchScreen.Companion companion2 = BillsSearchScreen.INSTANCE;
                        BillsSearchScreen billsSearchScreen2 = this.f15280b;
                        return dli.f.a(billsSearchScreen2, billsSearchScreen2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) billsSearchScreen2.Q.getValue(), (RowDelegate) billsSearchScreen2.P.getValue(), billsSearchScreen2.f3(), (ListSubheaderDelegate) billsSearchScreen2.N.getValue(), (LargeActionButtonDelegate) billsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        BillsSearchScreen.Companion companion3 = BillsSearchScreen.INSTANCE;
                        qji.b bVarU2 = billsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.di.BillsSearchScreenInjector");
                        lf9.b bVar = (lf9.b) bVarU2;
                        lf9.m mVar = bVar.f194684b;
                        lf9.b bVar2 = bVar.f194685c;
                        b bVar3 = billsSearchScreen.K;
                        bVar3.getClass();
                        return new lf9.d(mVar, bVar2, bVar3);
                    default:
                        BillsSearchScreen.Companion companion4 = BillsSearchScreen.INSTANCE;
                        return (f) ((lf9.d) billsSearchScreen.T.getValue()).f.get();
                }
            }
        });
        this.N = w.y0(new b8g.a(25));
        this.O = w.y0(new b8g.a(26));
        this.P = w.y0(new b8g.a(27));
        this.Q = w.y0(new b8g.a(28));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bh9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillsSearchScreen f15280b;

            {
                this.f15280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BillsSearchScreen billsSearchScreen = this.f15280b;
                switch (i22) {
                    case 0:
                        BillsSearchScreen.Companion companion = BillsSearchScreen.INSTANCE;
                        return new InputTextDelegate(new b7d.c(billsSearchScreen, 29));
                    case 1:
                        BillsSearchScreen.Companion companion2 = BillsSearchScreen.INSTANCE;
                        BillsSearchScreen billsSearchScreen2 = this.f15280b;
                        return dli.f.a(billsSearchScreen2, billsSearchScreen2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) billsSearchScreen2.Q.getValue(), (RowDelegate) billsSearchScreen2.P.getValue(), billsSearchScreen2.f3(), (ListSubheaderDelegate) billsSearchScreen2.N.getValue(), (LargeActionButtonDelegate) billsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        BillsSearchScreen.Companion companion3 = BillsSearchScreen.INSTANCE;
                        qji.b bVarU2 = billsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.di.BillsSearchScreenInjector");
                        lf9.b bVar = (lf9.b) bVarU2;
                        lf9.m mVar = bVar.f194684b;
                        lf9.b bVar2 = bVar.f194685c;
                        b bVar3 = billsSearchScreen.K;
                        bVar3.getClass();
                        return new lf9.d(mVar, bVar2, bVar3);
                    default:
                        BillsSearchScreen.Companion companion4 = BillsSearchScreen.INSTANCE;
                        return (f) ((lf9.d) billsSearchScreen.T.getValue()).f.get();
                }
            }
        });
        this.S = s.t(this, k.f);
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: bh9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillsSearchScreen f15280b;

            {
                this.f15280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BillsSearchScreen billsSearchScreen = this.f15280b;
                switch (i22) {
                    case 0:
                        BillsSearchScreen.Companion companion = BillsSearchScreen.INSTANCE;
                        return new InputTextDelegate(new b7d.c(billsSearchScreen, 29));
                    case 1:
                        BillsSearchScreen.Companion companion2 = BillsSearchScreen.INSTANCE;
                        BillsSearchScreen billsSearchScreen2 = this.f15280b;
                        return dli.f.a(billsSearchScreen2, billsSearchScreen2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) billsSearchScreen2.Q.getValue(), (RowDelegate) billsSearchScreen2.P.getValue(), billsSearchScreen2.f3(), (ListSubheaderDelegate) billsSearchScreen2.N.getValue(), (LargeActionButtonDelegate) billsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        BillsSearchScreen.Companion companion3 = BillsSearchScreen.INSTANCE;
                        qji.b bVarU2 = billsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.di.BillsSearchScreenInjector");
                        lf9.b bVar = (lf9.b) bVarU2;
                        lf9.m mVar = bVar.f194684b;
                        lf9.b bVar2 = bVar.f194685c;
                        b bVar3 = billsSearchScreen.K;
                        bVar3.getClass();
                        return new lf9.d(mVar, bVar2, bVar3);
                    default:
                        BillsSearchScreen.Companion companion4 = BillsSearchScreen.INSTANCE;
                        return (f) ((lf9.d) billsSearchScreen.T.getValue()).f.get();
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: bh9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillsSearchScreen f15280b;

            {
                this.f15280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BillsSearchScreen billsSearchScreen = this.f15280b;
                switch (i22) {
                    case 0:
                        BillsSearchScreen.Companion companion = BillsSearchScreen.INSTANCE;
                        return new InputTextDelegate(new b7d.c(billsSearchScreen, 29));
                    case 1:
                        BillsSearchScreen.Companion companion2 = BillsSearchScreen.INSTANCE;
                        BillsSearchScreen billsSearchScreen2 = this.f15280b;
                        return dli.f.a(billsSearchScreen2, billsSearchScreen2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) billsSearchScreen2.Q.getValue(), (RowDelegate) billsSearchScreen2.P.getValue(), billsSearchScreen2.f3(), (ListSubheaderDelegate) billsSearchScreen2.N.getValue(), (LargeActionButtonDelegate) billsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        BillsSearchScreen.Companion companion3 = BillsSearchScreen.INSTANCE;
                        qji.b bVarU2 = billsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.di.BillsSearchScreenInjector");
                        lf9.b bVar = (lf9.b) bVarU2;
                        lf9.m mVar = bVar.f194684b;
                        lf9.b bVar2 = bVar.f194685c;
                        b bVar3 = billsSearchScreen.K;
                        bVar3.getClass();
                        return new lf9.d(mVar, bVar2, bVar3);
                    default:
                        BillsSearchScreen.Companion companion4 = BillsSearchScreen.INSTANCE;
                        return (f) ((lf9.d) billsSearchScreen.T.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f15275b);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f15276c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextClause(this.K.f15270b.f61146b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setTag("CONTINUE_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.pay_bills_taxes_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().e.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f52577j.f121375b), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new l(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, y.x(f3().f52575g.f121375b, f3().i.f121375b, "mergeWith(...)"), null, new bh9.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f52576h.f121375b), null, new b74.e(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new p(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputTextDelegate f3() {
        return (InputTextDelegate) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
