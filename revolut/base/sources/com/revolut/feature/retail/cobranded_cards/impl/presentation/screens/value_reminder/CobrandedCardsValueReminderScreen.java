package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.g0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.cobranded.cards.impl.R$id;
import com.revolut.retail.feature.cobranded.cards.impl.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5b.b6;
import w7b.f;
import w7b.g;
import w7b.k;
import w7b.l;
import w7b.m;
import w7b.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/a;", "Ldli/a;", "Lw7b/n;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsValueReminderScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CobrandedCardsValueReminderScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/cobranded/cards/impl/databinding/CobrandedValueReminderScreenBinding;", 0))};
    public final CobrandedCardsValueReminderScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CobrandedCardsValueReminderScreen(CobrandedCardsValueReminderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.cobranded_value_reminder_screen;
        this.M = s.t(this, w7b.c.f);
        this.N = w.y0(new b6(12));
        this.O = w.y0(new b6(13));
        this.P = w.y0(new b6(14));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: w7b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsValueReminderScreen f295495b;

            {
                this.f295495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen = this.f295495b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsValueReminderScreen.T;
                        CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen2 = this.f295495b;
                        return dli.f.a(cobrandedCardsValueReminderScreen2, cobrandedCardsValueReminderScreen2.R2(), v.k((RowDelegate) cobrandedCardsValueReminderScreen2.P.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) cobrandedCardsValueReminderScreen2.O.getValue(), new ListSubheaderLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (FullScreenStateDelegate) cobrandedCardsValueReminderScreen2.N.getValue()), R$id.screenCobrandedValueReminder_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsValueReminderScreen.T;
                        qji.b bVarU2 = cobrandedCardsValueReminderScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.di.CobrandedCardsValueReminderScreenInjector");
                        }
                        g0 g0Var = (g0) ((x7b.b) bVarU2).j().mo3808a(cobrandedCardsValueReminderScreen);
                        CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = cobrandedCardsValueReminderScreen.K;
                        switch (g0Var.f12594a) {
                            case 0:
                                cobrandedCardsValueReminderScreenContract$InputData.getClass();
                                g0Var.d = cobrandedCardsValueReminderScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsValueReminderScreenContract$InputData.getClass();
                                g0Var.d = cobrandedCardsValueReminderScreenContract$InputData;
                                break;
                        }
                        return (x7b.a) g0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsValueReminderScreen.T;
                        return ((x7b.a) cobrandedCardsValueReminderScreen.R.getValue()).a();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: w7b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsValueReminderScreen f295495b;

            {
                this.f295495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen = this.f295495b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsValueReminderScreen.T;
                        CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen2 = this.f295495b;
                        return dli.f.a(cobrandedCardsValueReminderScreen2, cobrandedCardsValueReminderScreen2.R2(), v.k((RowDelegate) cobrandedCardsValueReminderScreen2.P.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) cobrandedCardsValueReminderScreen2.O.getValue(), new ListSubheaderLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (FullScreenStateDelegate) cobrandedCardsValueReminderScreen2.N.getValue()), R$id.screenCobrandedValueReminder_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsValueReminderScreen.T;
                        qji.b bVarU2 = cobrandedCardsValueReminderScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.di.CobrandedCardsValueReminderScreenInjector");
                        }
                        g0 g0Var = (g0) ((x7b.b) bVarU2).j().mo3808a(cobrandedCardsValueReminderScreen);
                        CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = cobrandedCardsValueReminderScreen.K;
                        switch (g0Var.f12594a) {
                            case 0:
                                cobrandedCardsValueReminderScreenContract$InputData.getClass();
                                g0Var.d = cobrandedCardsValueReminderScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsValueReminderScreenContract$InputData.getClass();
                                g0Var.d = cobrandedCardsValueReminderScreenContract$InputData;
                                break;
                        }
                        return (x7b.a) g0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsValueReminderScreen.T;
                        return ((x7b.a) cobrandedCardsValueReminderScreen.R.getValue()).a();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: w7b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsValueReminderScreen f295495b;

            {
                this.f295495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen = this.f295495b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsValueReminderScreen.T;
                        CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen2 = this.f295495b;
                        return dli.f.a(cobrandedCardsValueReminderScreen2, cobrandedCardsValueReminderScreen2.R2(), v.k((RowDelegate) cobrandedCardsValueReminderScreen2.P.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) cobrandedCardsValueReminderScreen2.O.getValue(), new ListSubheaderLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (FullScreenStateDelegate) cobrandedCardsValueReminderScreen2.N.getValue()), R$id.screenCobrandedValueReminder_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsValueReminderScreen.T;
                        qji.b bVarU2 = cobrandedCardsValueReminderScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.di.CobrandedCardsValueReminderScreenInjector");
                        }
                        g0 g0Var = (g0) ((x7b.b) bVarU2).j().mo3808a(cobrandedCardsValueReminderScreen);
                        CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = cobrandedCardsValueReminderScreen.K;
                        switch (g0Var.f12594a) {
                            case 0:
                                cobrandedCardsValueReminderScreenContract$InputData.getClass();
                                g0Var.d = cobrandedCardsValueReminderScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsValueReminderScreenContract$InputData.getClass();
                                g0Var.d = cobrandedCardsValueReminderScreenContract$InputData;
                                break;
                        }
                        return (x7b.a) g0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsValueReminderScreen.T;
                        return ((x7b.a) cobrandedCardsValueReminderScreen.R.getValue()).a();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f233163b;
        l lVar = uiState.f295504a;
        m mVar = uiState.f295505b;
        navBarWithToolbar.setTitle(lVar != null ? lVar.f295500a : null, null);
        if (lVar != null) {
            navBarWithToolbar.setToolbarTitle(lVar.f295500a);
        }
        navBarWithToolbar.setSecondDescriptionText(lVar != null ? lVar.f295501b : null);
        navBarWithToolbar.setSecondDescriptionVisible(lVar != null);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(mVar != null ? mVar.f295502a : null);
        twinVerticalButton.setMainButtonVisible((mVar != null ? mVar.f295502a : null) != null);
        twinVerticalButton.setSecondaryButtonText(mVar != null ? mVar.f295503b : null);
        twinVerticalButton.setSecondaryButtonVisible((mVar != null ? mVar.f295503b : null) != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x7b.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f233163b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setCollapsible(true);
        twinVerticalButton.setCollapsed(true, false);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f233163b.f59410q), new w7b.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, new v2e.h0(rd0.e.b(((ListSubheaderDelegate) this.O.getValue()).d), 28), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.m0()), new w7b.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new w7b.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new w7b.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53226s), new g(this, null, 1), 3);
    }

    public final p5j.a d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p5j.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
