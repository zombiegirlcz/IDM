package com.revolut.sso.impl.ui.phone.enter_phone;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreen;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import dkl.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.l1;
import ljl.m1;
import pol.c;
import pol.d;
import pol.f;
import pol.k;
import pol.l;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpol/k;", "Ldli/a;", "Lpol/l;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnterPhoneScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EnterPhoneScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenEnterPhoneBinding;", 0))};
    public final EnterPhoneScreenContract$InputData K;
    public final h L;
    public final PhoneEditorDelegate M;
    public final LabelButtonDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int R;

    public EnterPhoneScreen(EnterPhoneScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, pol.b.f);
        this.M = new PhoneEditorDelegate();
        this.N = new LabelButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: pol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterPhoneScreen f238048b;

            {
                this.f238048b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnterPhoneScreen enterPhoneScreen = this.f238048b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnterPhoneScreen.S;
                        m1 m1Var = (m1) enterPhoneScreen.Q.getValue();
                        switch (m1Var.f196033a) {
                            case 0:
                                return (f) m1Var.d.get();
                            case 1:
                                return (f) m1Var.d.get();
                            default:
                                return (f) m1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = EnterPhoneScreen.S;
                        EnterPhoneScreen enterPhoneScreen2 = this.f238048b;
                        return dli.f.a(enterPhoneScreen2, enterPhoneScreen2.d(), v.k(enterPhoneScreen2.M, enterPhoneScreen2.N), R$id.enterPhoneScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EnterPhoneScreen.S;
                        qji.b bVarU2 = enterPhoneScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.phone.enter_phone.di.EnterPhoneScreenInjector");
                        l1 l1Var = (l1) ((qol.a) bVarU2).j().mo3808a(enterPhoneScreen);
                        EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData = enterPhoneScreen.K;
                        switch (l1Var.f196022a) {
                            case 0:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                            case 1:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                            default:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                        }
                        return (m1) l1Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: pol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterPhoneScreen f238048b;

            {
                this.f238048b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnterPhoneScreen enterPhoneScreen = this.f238048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterPhoneScreen.S;
                        m1 m1Var = (m1) enterPhoneScreen.Q.getValue();
                        switch (m1Var.f196033a) {
                            case 0:
                                return (f) m1Var.d.get();
                            case 1:
                                return (f) m1Var.d.get();
                            default:
                                return (f) m1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = EnterPhoneScreen.S;
                        EnterPhoneScreen enterPhoneScreen2 = this.f238048b;
                        return dli.f.a(enterPhoneScreen2, enterPhoneScreen2.d(), v.k(enterPhoneScreen2.M, enterPhoneScreen2.N), R$id.enterPhoneScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EnterPhoneScreen.S;
                        qji.b bVarU2 = enterPhoneScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.phone.enter_phone.di.EnterPhoneScreenInjector");
                        l1 l1Var = (l1) ((qol.a) bVarU2).j().mo3808a(enterPhoneScreen);
                        EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData = enterPhoneScreen.K;
                        switch (l1Var.f196022a) {
                            case 0:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                            case 1:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                            default:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                        }
                        return (m1) l1Var.mo3783build();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: pol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterPhoneScreen f238048b;

            {
                this.f238048b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnterPhoneScreen enterPhoneScreen = this.f238048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterPhoneScreen.S;
                        m1 m1Var = (m1) enterPhoneScreen.Q.getValue();
                        switch (m1Var.f196033a) {
                            case 0:
                                return (f) m1Var.d.get();
                            case 1:
                                return (f) m1Var.d.get();
                            default:
                                return (f) m1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = EnterPhoneScreen.S;
                        EnterPhoneScreen enterPhoneScreen2 = this.f238048b;
                        return dli.f.a(enterPhoneScreen2, enterPhoneScreen2.d(), v.k(enterPhoneScreen2.M, enterPhoneScreen2.N), R$id.enterPhoneScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EnterPhoneScreen.S;
                        qji.b bVarU2 = enterPhoneScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.phone.enter_phone.di.EnterPhoneScreenInjector");
                        l1 l1Var = (l1) ((qol.a) bVarU2).j().mo3808a(enterPhoneScreen);
                        EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData = enterPhoneScreen.K;
                        switch (l1Var.f196022a) {
                            case 0:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                            case 1:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                            default:
                                enterPhoneScreenContract$InputData.getClass();
                                l1Var.d = enterPhoneScreenContract$InputData;
                                break;
                        }
                        return (m1) l1Var.mo3783build();
                }
            }
        });
        this.R = R$layout.screen_enter_phone;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f115658b;
        TextLocalisedClause textLocalisedClause = uiState.f238055a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f238056b);
        LargeActionButton largeActionButton = d3().f115659c;
        largeActionButton.setText(uiState.f238057c);
        largeActionButton.setEnabled(uiState.d);
        LargeActionButton largeActionButton2 = d3().d;
        Clause clause = uiState.e;
        largeActionButton2.setText(clause);
        largeActionButton2.setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m1) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f115658b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115658b.f59410q), null, new c(this, continuation, 0), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.d.f121375b), null, new pfk.o0(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115659c.o), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new c(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new pol.e(this, null), 3);
    }

    public final j d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
