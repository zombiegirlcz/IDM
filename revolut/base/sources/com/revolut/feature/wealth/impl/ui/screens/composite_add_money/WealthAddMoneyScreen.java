package com.revolut.feature.wealth.impl.ui.screens.composite_add_money;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.R$layout;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m1h.t;
import no.m;
import org.jetbrains.annotations.NotNull;
import r60.d;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import ybh.a0;
import ybh.d1;
import ybh.e1;
import ybh.f1;
import ybh.g1;
import ybh.j;
import ybh.r;
import ybh.u;
import ybh.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/WealthAddMoneyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lybh/r;", "Ltki/c;", "Lybh/w;", "Lno/m;", "Lm1h/t;", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthAddMoneyScreen extends ViewController<r> implements c, m, t {
    public final CompositeAddMoneyScreenContract$Input K;
    public final AnalyticsProduct L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;
    public final RowDelegate Q;
    public final LargeActionButtonDelegate R;
    public final Object S;
    public final TextDelegate T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(WealthAddMoneyScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/impl/databinding/ScreenWealthCompositeAddMoneyBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public WealthAddMoneyScreen(CompositeAddMoneyScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f95584b;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ybh.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAddMoneyScreen f312299b;

            {
                this.f312299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthAddMoneyScreen wealthAddMoneyScreen = this.f312299b;
                switch (i2) {
                    case 0:
                        WealthAddMoneyScreen.Companion companion = WealthAddMoneyScreen.INSTANCE;
                        qji.b bVarU2 = wealthAddMoneyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.composite_add_money.di.CompositeAddMoneyScreenComponentInjector");
                        z9h.m mVar = (z9h.m) ((zbh.c) bVarU2).b().mo3808a(wealthAddMoneyScreen);
                        CompositeAddMoneyScreenContract$Input compositeAddMoneyScreenContract$Input = wealthAddMoneyScreen.K;
                        switch (mVar.f320478a) {
                            case 0:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                            default:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                        }
                        return (z9h.o) mVar.mo3783build();
                    case 1:
                        WealthAddMoneyScreen.Companion companion2 = WealthAddMoneyScreen.INSTANCE;
                        z9h.o oVar = (z9h.o) wealthAddMoneyScreen.M.getValue();
                        switch (oVar.f320481a) {
                            case 0:
                                return (j60.a) oVar.k.get();
                            default:
                                return (j60.a) oVar.k.get();
                        }
                    case 2:
                        WealthAddMoneyScreen.Companion companion3 = WealthAddMoneyScreen.INSTANCE;
                        return new CenteredAmountDelegate(new y8a.g(wealthAddMoneyScreen, 9));
                    default:
                        WealthAddMoneyScreen.Companion companion4 = WealthAddMoneyScreen.INSTANCE;
                        WealthAddMoneyScreen wealthAddMoneyScreen2 = this.f312299b;
                        return tki.g.a(wealthAddMoneyScreen2, wealthAddMoneyScreen2.R2(), zhm.v.k(wealthAddMoneyScreen2.e3(), wealthAddMoneyScreen2.T), wealthAddMoneyScreen2.d3().f243079c.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ybh.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAddMoneyScreen f312299b;

            {
                this.f312299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthAddMoneyScreen wealthAddMoneyScreen = this.f312299b;
                switch (i22) {
                    case 0:
                        WealthAddMoneyScreen.Companion companion = WealthAddMoneyScreen.INSTANCE;
                        qji.b bVarU2 = wealthAddMoneyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.composite_add_money.di.CompositeAddMoneyScreenComponentInjector");
                        z9h.m mVar = (z9h.m) ((zbh.c) bVarU2).b().mo3808a(wealthAddMoneyScreen);
                        CompositeAddMoneyScreenContract$Input compositeAddMoneyScreenContract$Input = wealthAddMoneyScreen.K;
                        switch (mVar.f320478a) {
                            case 0:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                            default:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                        }
                        return (z9h.o) mVar.mo3783build();
                    case 1:
                        WealthAddMoneyScreen.Companion companion2 = WealthAddMoneyScreen.INSTANCE;
                        z9h.o oVar = (z9h.o) wealthAddMoneyScreen.M.getValue();
                        switch (oVar.f320481a) {
                            case 0:
                                return (j60.a) oVar.k.get();
                            default:
                                return (j60.a) oVar.k.get();
                        }
                    case 2:
                        WealthAddMoneyScreen.Companion companion3 = WealthAddMoneyScreen.INSTANCE;
                        return new CenteredAmountDelegate(new y8a.g(wealthAddMoneyScreen, 9));
                    default:
                        WealthAddMoneyScreen.Companion companion4 = WealthAddMoneyScreen.INSTANCE;
                        WealthAddMoneyScreen wealthAddMoneyScreen2 = this.f312299b;
                        return tki.g.a(wealthAddMoneyScreen2, wealthAddMoneyScreen2.R2(), zhm.v.k(wealthAddMoneyScreen2.e3(), wealthAddMoneyScreen2.T), wealthAddMoneyScreen2.d3().f243079c.getId(), null, null, null, 56);
                }
            }
        });
        this.O = R$layout.screen_wealth_composite_add_money;
        this.P = s.t(this, d1.f);
        this.Q = new RowDelegate(null, null, 7);
        this.R = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ybh.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAddMoneyScreen f312299b;

            {
                this.f312299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthAddMoneyScreen wealthAddMoneyScreen = this.f312299b;
                switch (i22) {
                    case 0:
                        WealthAddMoneyScreen.Companion companion = WealthAddMoneyScreen.INSTANCE;
                        qji.b bVarU2 = wealthAddMoneyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.composite_add_money.di.CompositeAddMoneyScreenComponentInjector");
                        z9h.m mVar = (z9h.m) ((zbh.c) bVarU2).b().mo3808a(wealthAddMoneyScreen);
                        CompositeAddMoneyScreenContract$Input compositeAddMoneyScreenContract$Input = wealthAddMoneyScreen.K;
                        switch (mVar.f320478a) {
                            case 0:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                            default:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                        }
                        return (z9h.o) mVar.mo3783build();
                    case 1:
                        WealthAddMoneyScreen.Companion companion2 = WealthAddMoneyScreen.INSTANCE;
                        z9h.o oVar = (z9h.o) wealthAddMoneyScreen.M.getValue();
                        switch (oVar.f320481a) {
                            case 0:
                                return (j60.a) oVar.k.get();
                            default:
                                return (j60.a) oVar.k.get();
                        }
                    case 2:
                        WealthAddMoneyScreen.Companion companion3 = WealthAddMoneyScreen.INSTANCE;
                        return new CenteredAmountDelegate(new y8a.g(wealthAddMoneyScreen, 9));
                    default:
                        WealthAddMoneyScreen.Companion companion4 = WealthAddMoneyScreen.INSTANCE;
                        WealthAddMoneyScreen wealthAddMoneyScreen2 = this.f312299b;
                        return tki.g.a(wealthAddMoneyScreen2, wealthAddMoneyScreen2.R2(), zhm.v.k(wealthAddMoneyScreen2.e3(), wealthAddMoneyScreen2.T), wealthAddMoneyScreen2.d3().f243079c.getId(), null, null, null, 56);
                }
            }
        });
        this.T = new TextDelegate();
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: ybh.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAddMoneyScreen f312299b;

            {
                this.f312299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WealthAddMoneyScreen wealthAddMoneyScreen = this.f312299b;
                switch (i22) {
                    case 0:
                        WealthAddMoneyScreen.Companion companion = WealthAddMoneyScreen.INSTANCE;
                        qji.b bVarU2 = wealthAddMoneyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.composite_add_money.di.CompositeAddMoneyScreenComponentInjector");
                        z9h.m mVar = (z9h.m) ((zbh.c) bVarU2).b().mo3808a(wealthAddMoneyScreen);
                        CompositeAddMoneyScreenContract$Input compositeAddMoneyScreenContract$Input = wealthAddMoneyScreen.K;
                        switch (mVar.f320478a) {
                            case 0:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                            default:
                                compositeAddMoneyScreenContract$Input.getClass();
                                mVar.d = compositeAddMoneyScreenContract$Input;
                                break;
                        }
                        return (z9h.o) mVar.mo3783build();
                    case 1:
                        WealthAddMoneyScreen.Companion companion2 = WealthAddMoneyScreen.INSTANCE;
                        z9h.o oVar = (z9h.o) wealthAddMoneyScreen.M.getValue();
                        switch (oVar.f320481a) {
                            case 0:
                                return (j60.a) oVar.k.get();
                            default:
                                return (j60.a) oVar.k.get();
                        }
                    case 2:
                        WealthAddMoneyScreen.Companion companion3 = WealthAddMoneyScreen.INSTANCE;
                        return new CenteredAmountDelegate(new y8a.g(wealthAddMoneyScreen, 9));
                    default:
                        WealthAddMoneyScreen.Companion companion4 = WealthAddMoneyScreen.INSTANCE;
                        WealthAddMoneyScreen wealthAddMoneyScreen2 = this.f312299b;
                        return tki.g.a(wealthAddMoneyScreen2, wealthAddMoneyScreen2.R2(), zhm.v.k(wealthAddMoneyScreen2.e3(), wealthAddMoneyScreen2.T), wealthAddMoneyScreen2.d3().f243079c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ybh.w uiState = (ybh.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = d3().f243078b;
        v vVar = uiState.f312360b;
        navBarWithAvatar.setToolbarTitle(vVar.f312356a);
        d3().f243078b.setToolbarDescription(vVar.f312357b);
        d3().f243078b.setAvatarImage(vVar.f312358c);
        u uVar = uiState.f312361c;
        ybh.t tVar = uVar.f312354b;
        d3().d.setSecondaryButtonText(tVar.f312349b);
        d3().d.setSecondaryButtonCustomE2ETestId("AddMoneyButton");
        d3().d.setSecondaryButtonEnabled(tVar.f312348a);
        Boolean bool = uVar.f312353a;
        if (bool != null) {
            d3().d.setPrimaryButtonVisible(bool.booleanValue());
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) R2()).accept(j.f312315a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getG0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z9h.o) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f243078b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) this.N.getValue()).d(zhm.v.k(this.Q, this.R));
        d3().d.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        d3().d.setPrimaryButtonVisible(false);
        d3().d.setGradientBackgroundEnabled(true);
        d3().d.setPrimaryButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        TwinHorizontalButton twinHorizontalButton = d3().d;
        twinHorizontalButton.setPrimaryButtonWeight(0.16666667f);
        twinHorizontalButton.setSecondaryButtonWeight(0.8333333f);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        r60.b bVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f243078b.f59338a), new e1(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().d.f121375b), new f1(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(e3().f51967l.f121375b), new f1(this, continuation, 3), 3);
        ViewController.P2(this, l.y(e3().e.f121375b, e3().f51966j.f121375b, "merge(...)"), new g1(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(e3().f.f121375b, new a0(10))), new f1(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(w.a0(e3().f.f121375b, new a0(11))), new f1(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().d.d()), new e1(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.c()), new e1(this, continuation, 0), 3);
        z9h.o oVar = (z9h.o) this.M.getValue();
        switch (oVar.f320481a) {
            case 0:
                bVar = (r60.b) oVar.f320485h.get();
                break;
            default:
                bVar = (r60.b) oVar.f320485h.get();
                break;
        }
        ViewController.P2(this, rd0.e.b(w.a0(((d) bVar).d.d(), new a0(12))), new f1(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.T.d, new a0(13))), new f1(this, continuation, 1), 3);
        view.postDelayed(new x.b(this, 12), 400L);
    }

    public final q8h.c d3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q8h.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate e3() {
        return (CenteredAmountDelegate) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final ybh.s R2() {
        z9h.o oVar = (z9h.o) this.M.getValue();
        switch (oVar.f320481a) {
        }
        return (ybh.s) oVar.L.get();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
