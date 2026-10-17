package com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.view.View;
import androidx.view.ComponentActivity;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cll.c;
import cll.d;
import cll.h;
import cll.i;
import cll.l;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import dkl.g;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ljl.v;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/sso/impl/ui/card_pin/card_pin/enter_card_number/EnterCardNumberScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcll/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcll/h;", "<init>", "()V", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnterCardNumberScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, h> {
    public final Object U;
    public final PlainTextDelegate V;
    public final ao.h W;
    public final z1 X;
    public final ce9.a Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f106398a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f106399b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f106400d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106397e0 = {o0.f186429a.j(new h0(EnterCardNumberScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenEnterCardNumberBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenEnterCardNumberBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.enterCardNumberScreen_mainActionButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.enterCardNumberScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.enterCardNumberScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new g(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public EnterCardNumberScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: cll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterCardNumberScreen f25051b;

            {
                this.f25051b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnterCardNumberScreen enterCardNumberScreen = this.f25051b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnterCardNumberScreen.f106397e0;
                        return new c9f.c(enterCardNumberScreen, 25);
                    case 1:
                        KProperty[] kPropertyArr2 = EnterCardNumberScreen.f106397e0;
                        qji.b bVarQ2 = enterCardNumberScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.di.EnterCardNumberScreenInjector");
                        ljl.e eVar = (ljl.e) bVarQ2;
                        return new v(eVar.f195922a, eVar.f195923b, enterCardNumberScreen);
                    default:
                        KProperty[] kPropertyArr3 = EnterCardNumberScreen.f106397e0;
                        return (l) ((v) enterCardNumberScreen.f106399b0.getValue()).f196119h.get();
                }
            }
        });
        this.U = lazyY0;
        InputTextDelegate inputTextDelegate = new InputTextDelegate((Function2) lazyY0.getValue());
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.V = plainTextDelegate;
        this.W = s.t(this, b.f);
        this.X = ta6.a.a(0);
        this.Y = new ce9.a(this, 18);
        this.Z = R$layout.screen_enter_card_number;
        this.f106398a0 = R$id.enterCardNumberScreen_recyclerView;
        final int i2 = 1;
        this.f106399b0 = w.y0(new Function0(this) { // from class: cll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterCardNumberScreen f25051b;

            {
                this.f25051b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnterCardNumberScreen enterCardNumberScreen = this.f25051b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterCardNumberScreen.f106397e0;
                        return new c9f.c(enterCardNumberScreen, 25);
                    case 1:
                        KProperty[] kPropertyArr2 = EnterCardNumberScreen.f106397e0;
                        qji.b bVarQ2 = enterCardNumberScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.di.EnterCardNumberScreenInjector");
                        ljl.e eVar = (ljl.e) bVarQ2;
                        return new v(eVar.f195922a, eVar.f195923b, enterCardNumberScreen);
                    default:
                        KProperty[] kPropertyArr3 = EnterCardNumberScreen.f106397e0;
                        return (l) ((v) enterCardNumberScreen.f106399b0.getValue()).f196119h.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: cll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterCardNumberScreen f25051b;

            {
                this.f25051b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnterCardNumberScreen enterCardNumberScreen = this.f25051b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterCardNumberScreen.f106397e0;
                        return new c9f.c(enterCardNumberScreen, 25);
                    case 1:
                        KProperty[] kPropertyArr2 = EnterCardNumberScreen.f106397e0;
                        qji.b bVarQ2 = enterCardNumberScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.di.EnterCardNumberScreenInjector");
                        ljl.e eVar = (ljl.e) bVarQ2;
                        return new v(eVar.f195922a, eVar.f195923b, enterCardNumberScreen);
                    default:
                        KProperty[] kPropertyArr3 = EnterCardNumberScreen.f106397e0;
                        return (l) ((v) enterCardNumberScreen.f106399b0.getValue()).f196119h.get();
                }
            }
        });
        this.f106400d0 = zhm.v.k(inputTextDelegate, plainTextDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final void J() {
        f63.b bVar = ((d63.a) ((v) this.f106399b0.getValue()).f196117c.get()).f111441c.f111443l.f132401a;
        NfcAdapter nfcAdapter = bVar.f132398b;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(bVar.f132397a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (v) this.f106399b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f115650c.f59410q), null, new cll.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, this.X, null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.d.f121375b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f115649b.o), null, new cll.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final void W() {
        ((d63.a) ((v) this.f106399b0.getValue()).f196117c.get()).f111441c.f111443l.c();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).addOnNewIntentListener(new d(this.Y));
        NavBarWithToolbar navBarWithToolbar = h3().f115650c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_number_screen_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f115649b.setText(new TextLocalisedClause(R$string.revolut_sso_common_actions_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).removeOnNewIntentListener(new d(this.Y));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF106402a0() {
        return this.f106400d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.f106398a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f115650c;
        navBarWithToolbar.setSecondDescriptionVisible(uiState.f25060c != null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f25060c);
        h3().f115649b.setEnabled(uiState.f25059b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Z;
    }

    public final g h3() {
        ViewBinding value = this.W.getValue(this, f106397e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }
}
