package com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import buf.u;
import cbf.c;
import cbh.b;
import ccf.d;
import ccf.g;
import ccf.i;
import ccf.l;
import ccf.m;
import ccf.n;
import ccf.o;
import ccf.p;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_add_ons.impl.R$string;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lbf.f;
import rd0.e;
import rp0.y;
import te0.w;
import ubf.a;
import vc.s;
import w01.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_add_ons/impl/ui/add_ons/goodbye_screen/AddOnsGoodbyeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lccf/o;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddOnsGoodbyeScreen extends BaseRecyclerViewScreen<o, IOData$EmptyInput, q> {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(AddOnsGoodbyeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public y U;
    public boolean V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91670a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91671b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final h f91672d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f91673e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f91674h0;
    public final Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddOnsGoodbyeScreen(f code) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(code, "code");
        this.W = w.y0(new b(5));
        this.X = w.y0(new b(6));
        this.Y = w.y0(new b(7));
        this.Z = w.y0(new b(8));
        this.f91670a0 = w.y0(new b(9));
        this.f91671b0 = w.y0(new b(10));
        this.c0 = w.y0(new b(11));
        this.f91672d0 = s.t(this, d.f);
        final int i = 3;
        this.f91673e0 = w.y0(new Function0(this) { // from class: ccf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOnsGoodbyeScreen f23072b;

            {
                this.f23072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddOnsGoodbyeScreen addOnsGoodbyeScreen = this.f23072b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((SuggestionsBarDelegate) addOnsGoodbyeScreen.f91670a0.getValue(), (LargeActionButtonDelegate) addOnsGoodbyeScreen.f91671b0.getValue(), (InputTextDelegate) addOnsGoodbyeScreen.c0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((RowDelegate) addOnsGoodbyeScreen.W.getValue(), (FullScreenStateDelegate) addOnsGoodbyeScreen.X.getValue(), (ListSubheaderDelegate) addOnsGoodbyeScreen.Y.getValue(), (RowLoadingDelegate) addOnsGoodbyeScreen.Z.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AddOnsGoodbyeScreen.j0;
                        return (p) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).f278853m.get();
                    default:
                        KProperty[] kPropertyArr4 = AddOnsGoodbyeScreen.j0;
                        return (j60.a) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).d.get();
                }
            }
        });
        final int i2 = 0;
        this.f0 = w.y0(new Function0(this) { // from class: ccf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOnsGoodbyeScreen f23072b;

            {
                this.f23072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddOnsGoodbyeScreen addOnsGoodbyeScreen = this.f23072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((SuggestionsBarDelegate) addOnsGoodbyeScreen.f91670a0.getValue(), (LargeActionButtonDelegate) addOnsGoodbyeScreen.f91671b0.getValue(), (InputTextDelegate) addOnsGoodbyeScreen.c0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((RowDelegate) addOnsGoodbyeScreen.W.getValue(), (FullScreenStateDelegate) addOnsGoodbyeScreen.X.getValue(), (ListSubheaderDelegate) addOnsGoodbyeScreen.Y.getValue(), (RowLoadingDelegate) addOnsGoodbyeScreen.Z.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AddOnsGoodbyeScreen.j0;
                        return (p) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).f278853m.get();
                    default:
                        KProperty[] kPropertyArr4 = AddOnsGoodbyeScreen.j0;
                        return (j60.a) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).d.get();
                }
            }
        });
        final int i3 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: ccf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOnsGoodbyeScreen f23072b;

            {
                this.f23072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddOnsGoodbyeScreen addOnsGoodbyeScreen = this.f23072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((SuggestionsBarDelegate) addOnsGoodbyeScreen.f91670a0.getValue(), (LargeActionButtonDelegate) addOnsGoodbyeScreen.f91671b0.getValue(), (InputTextDelegate) addOnsGoodbyeScreen.c0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((RowDelegate) addOnsGoodbyeScreen.W.getValue(), (FullScreenStateDelegate) addOnsGoodbyeScreen.X.getValue(), (ListSubheaderDelegate) addOnsGoodbyeScreen.Y.getValue(), (RowLoadingDelegate) addOnsGoodbyeScreen.Z.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AddOnsGoodbyeScreen.j0;
                        return (p) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).f278853m.get();
                    default:
                        KProperty[] kPropertyArr4 = AddOnsGoodbyeScreen.j0;
                        return (j60.a) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).d.get();
                }
            }
        });
        this.f91674h0 = w.y0(new u(this, code, 27));
        final int i5 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: ccf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOnsGoodbyeScreen f23072b;

            {
                this.f23072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AddOnsGoodbyeScreen addOnsGoodbyeScreen = this.f23072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((SuggestionsBarDelegate) addOnsGoodbyeScreen.f91670a0.getValue(), (LargeActionButtonDelegate) addOnsGoodbyeScreen.f91671b0.getValue(), (InputTextDelegate) addOnsGoodbyeScreen.c0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AddOnsGoodbyeScreen.j0;
                        return zhm.v.k((RowDelegate) addOnsGoodbyeScreen.W.getValue(), (FullScreenStateDelegate) addOnsGoodbyeScreen.X.getValue(), (ListSubheaderDelegate) addOnsGoodbyeScreen.Y.getValue(), (RowLoadingDelegate) addOnsGoodbyeScreen.Z.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = AddOnsGoodbyeScreen.j0;
                        return (p) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).f278853m.get();
                    default:
                        KProperty[] kPropertyArr4 = AddOnsGoodbyeScreen.j0;
                        return (j60.a) ((ubf.a) addOnsGoodbyeScreen.f91674h0.getValue()).d.get();
                }
            }
        });
    }

    public static void g3(n nVar, LargeActionButton largeActionButton, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        if (Intrinsics.f(nVar, m.f23076a)) {
            largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
            k.d(largeActionButton);
        } else if (nVar instanceof l) {
            largeActionButton.setText(((l) nVar).f23075a);
            largeActionButton.o(defaultFilledButton);
            k.d(largeActionButton);
        } else {
            if (nVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            k.a(largeActionButton);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a) this.f91674h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        x xVarI3 = i3();
        xVarI3.f174574c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        com.revolut.kompot.navigable.a.g2(this, e.b(xVarI3.f174574c.f59409p.f57336l), null, new ccf.f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(xVarI3.e.o), null, new ccf.f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(xVarI3.f174573b.o), null, new ccf.f(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f91671b0.getValue()).d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(e.b(((SuggestionsBarDelegate) this.f91670a0.getValue()).p().d), 3), null, new ccf.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) this.c0.getValue()).e.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f174574c.f59410q), null, new ccf.f(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(e.b(((RowDelegate) this.W.getValue()).f53218h), 4), null, new ccf.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF60649d0() {
        return (List) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getZ() {
        return R$id.screenRecyclerNavbarTwoButtons_recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_recycler_navbar_two_buttons;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = i3().f174574c;
        Clause clause = uiState.f23078b;
        if (clause != null) {
            navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_goodbye_title, zhm.u.c(clause), null, 12), null);
            navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_goodbye_subtitle, null, null, 14));
            navBarWithToolbar.setDescriptionVisible(true);
        } else {
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        }
        n nVar = uiState.d;
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = i3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        g3(nVar, screenRecyclerNavbarTwoButtonsFirstButton, LargeActionButton.ButtonStyle.f58725a);
        n nVar2 = uiState.e;
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = i3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        g3(nVar2, screenRecyclerNavbarTwoButtonsSecondButton, LargeActionButton.ButtonStyle.f58726b);
        y yVar = uiState.f23079c;
        this.U = yVar;
        if (!this.V || yVar == null) {
            return;
        }
        ((j60.a) this.f91673e0.getValue()).A(yVar);
    }

    public final x i3() {
        ViewBinding value = this.f91672d0.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final p T2() {
        return (p) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
