package com.revolut.sso.impl.ui.password_flow.password_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.password_flow.password_input.PasswordInputScreen;
import com.revolut.sso.impl.ui.password_flow.password_input.PasswordInputScreenContract$InputData;
import dkl.n;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.i0;
import ljl.q0;
import lol.c;
import lol.d;
import lol.i;
import lol.j;
import lol.k;
import ofm.q;
import rd0.e;
import rr0.f;
import te0.w;
import tx0.j0;
import vc.s;
import wii.b;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/password_flow/password_input/PasswordInputScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llol/j;", "Lcom/revolut/kompot/common/IOData$Input;", "Llol/i;", "Lwii/b;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasswordInputScreen extends BaseRecyclerViewScreen<j, IOData$Input, i> implements b {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(PasswordInputScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenPasswordInputBinding;", 0))};
    public final PasswordInputScreenContract$InputData U;
    public final Boolean V;
    public final ModalTransitionAnimation.Style.POPUP W;
    public final int X;
    public final int Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f106633a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f106634b0;
    public final InputTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final PlainTextDelegate f106635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f106636e0;
    public f f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordInputScreen(PasswordInputScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = input;
        this.V = input.f106639c;
        this.W = ModalTransitionAnimation.Style.POPUP.f98391a;
        this.X = R$layout.screen_password_input;
        this.Y = R$id.passwordInputScreen_recyclerView;
        this.Z = s.t(this, lol.b.f);
        final int i = 0;
        this.f106633a0 = w.y0(new Function0(this) { // from class: lol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordInputScreen f197466b;

            {
                this.f197466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PasswordInputScreen passwordInputScreen = this.f197466b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PasswordInputScreen.g0;
                        qji.b bVarQ2 = passwordInputScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.password_flow.password_input.di.PasswordInputScreenInjector");
                        ljl.h0 h0Var = (ljl.h0) bVarQ2;
                        q0 q0Var = h0Var.f195968c;
                        ljl.h0 h0Var2 = h0Var.d;
                        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = passwordInputScreen.U;
                        passwordInputScreenContract$InputData.getClass();
                        return new i0(q0Var, h0Var2, passwordInputScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = PasswordInputScreen.g0;
                        return (k) ((i0) passwordInputScreen.f106633a0.getValue()).f195979c.get();
                }
            }
        });
        final int i2 = 1;
        this.f106634b0 = w.y0(new Function0(this) { // from class: lol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordInputScreen f197466b;

            {
                this.f197466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PasswordInputScreen passwordInputScreen = this.f197466b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasswordInputScreen.g0;
                        qji.b bVarQ2 = passwordInputScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.password_flow.password_input.di.PasswordInputScreenInjector");
                        ljl.h0 h0Var = (ljl.h0) bVarQ2;
                        q0 q0Var = h0Var.f195968c;
                        ljl.h0 h0Var2 = h0Var.d;
                        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = passwordInputScreen.U;
                        passwordInputScreenContract$InputData.getClass();
                        return new i0(q0Var, h0Var2, passwordInputScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = PasswordInputScreen.g0;
                        return (k) ((i0) passwordInputScreen.f106633a0.getValue()).f195979c.get();
                }
            }
        });
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.c0 = inputTextDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.f106635d0 = plainTextDelegate;
        this.f106636e0 = v.k(inputTextDelegate, plainTextDelegate);
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Boolean getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i0) this.f106633a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.f106634b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(h3().f115670c.f59410q), null, new c(this, null, 0), 3);
        InputTextDelegate inputTextDelegate = this.c0;
        r rVarDebounce = inputTextDelegate.e.f121375b.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        a.g2(this, e.b(rVarDebounce), null, new d(this, null), 3);
        a.g2(this, e.b(inputTextDelegate.f52577j.f121375b), null, new lol.e(this, null), 3);
        a.g2(this, e.b(this.f106635d0.d.f121375b), null, new c(this, null, 1), 3);
        a.g2(this, e.b(h3().f115669b.o), null, new c(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f115670c;
        Clause textLocalisedClause = this.U.f106637a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_login_input_password_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        LargeActionButton largeActionButton = h3().f115669b;
        largeActionButton.setText(new TextLocalisedClause(R$string.revolut_sso_login_input_password_continue_button, null, null, 14));
        this.f0 = largeActionButton.A.V();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF103497a0() {
        return this.f106636e0;
    }

    @Override // wii.b
    public final ModalTransitionAnimation.Style d2() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f115669b.setEnabled(uiState.f197473b);
        f fVar = this.f0;
        if (fVar != null) {
            fVar.b(uiState.f197474c);
        } else {
            Intrinsics.r("passwordInputScreenButtonLoadingController");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final n h3() {
        ViewBinding value = this.Z.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }
}
