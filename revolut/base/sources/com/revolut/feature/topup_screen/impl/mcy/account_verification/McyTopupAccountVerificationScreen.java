package com.revolut.feature.topup_screen.impl.mcy.account_verification;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreen;
import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h0f.d;
import h0f.f;
import h0f.g;
import h0f.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qve.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/account_verification/McyTopupAccountVerificationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh0f/f;", "Ldli/a;", "Lh0f/n;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McyTopupAccountVerificationScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(McyTopupAccountVerificationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final McyTopupAccountVerificationScreenContract$InputData K;
    public final InputTextDelegate L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public McyTopupAccountVerificationScreen(McyTopupAccountVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new InputTextDelegate(null);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, h0f.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: h0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyTopupAccountVerificationScreen f148385b;

            {
                this.f148385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen = this.f148385b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = McyTopupAccountVerificationScreen.R;
                        return (g) ((qve.l) mcyTopupAccountVerificationScreen.P.getValue()).f249624b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = McyTopupAccountVerificationScreen.R;
                        qji.b bVarU2 = mcyTopupAccountVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.account_verification.di.McyTopupAccountVerificationScreenInjector");
                        qve.m mVar = (qve.m) bVarU2;
                        qve.k kVar = mVar.f249627c;
                        qve.m mVar2 = mVar.d;
                        McyTopupAccountVerificationScreenContract$InputData mcyTopupAccountVerificationScreenContract$InputData = mcyTopupAccountVerificationScreen.K;
                        mcyTopupAccountVerificationScreenContract$InputData.getClass();
                        return new qve.l(kVar, mVar2, mcyTopupAccountVerificationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = McyTopupAccountVerificationScreen.R;
                        McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen2 = this.f148385b;
                        return dli.f.a(mcyTopupAccountVerificationScreen2, mcyTopupAccountVerificationScreen2.d(), u.c(mcyTopupAccountVerificationScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: h0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyTopupAccountVerificationScreen f148385b;

            {
                this.f148385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen = this.f148385b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = McyTopupAccountVerificationScreen.R;
                        return (g) ((qve.l) mcyTopupAccountVerificationScreen.P.getValue()).f249624b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = McyTopupAccountVerificationScreen.R;
                        qji.b bVarU2 = mcyTopupAccountVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.account_verification.di.McyTopupAccountVerificationScreenInjector");
                        qve.m mVar = (qve.m) bVarU2;
                        qve.k kVar = mVar.f249627c;
                        qve.m mVar2 = mVar.d;
                        McyTopupAccountVerificationScreenContract$InputData mcyTopupAccountVerificationScreenContract$InputData = mcyTopupAccountVerificationScreen.K;
                        mcyTopupAccountVerificationScreenContract$InputData.getClass();
                        return new qve.l(kVar, mVar2, mcyTopupAccountVerificationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = McyTopupAccountVerificationScreen.R;
                        McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen2 = this.f148385b;
                        return dli.f.a(mcyTopupAccountVerificationScreen2, mcyTopupAccountVerificationScreen2.d(), u.c(mcyTopupAccountVerificationScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: h0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyTopupAccountVerificationScreen f148385b;

            {
                this.f148385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen = this.f148385b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = McyTopupAccountVerificationScreen.R;
                        return (g) ((qve.l) mcyTopupAccountVerificationScreen.P.getValue()).f249624b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = McyTopupAccountVerificationScreen.R;
                        qji.b bVarU2 = mcyTopupAccountVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.account_verification.di.McyTopupAccountVerificationScreenInjector");
                        qve.m mVar = (qve.m) bVarU2;
                        qve.k kVar = mVar.f249627c;
                        qve.m mVar2 = mVar.d;
                        McyTopupAccountVerificationScreenContract$InputData mcyTopupAccountVerificationScreenContract$InputData = mcyTopupAccountVerificationScreen.K;
                        mcyTopupAccountVerificationScreenContract$InputData.getClass();
                        return new qve.l(kVar, mVar2, mcyTopupAccountVerificationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = McyTopupAccountVerificationScreen.R;
                        McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen2 = this.f148385b;
                        return dli.f.a(mcyTopupAccountVerificationScreen2, mcyTopupAccountVerificationScreen2.d(), u.c(mcyTopupAccountVerificationScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f148396b);
        d3().f174565c.setMenuItems(u.c(uiState.f148397c));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.india_topup_verify_bank_account_header_title, null, null, 14), null);
        d3().f174565c.setDescriptionVisible(true);
        d3().f174565c.setDescriptionText(new TextLocalisedClause(R$string.india_topup_verify_bank_account_header_description, null, null, 14));
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.india_topup_verify_bank_account_footer_action_verify_account, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        InputTextDelegate inputTextDelegate = this.L;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new h0f.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new gul.n(this, null, 11), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
