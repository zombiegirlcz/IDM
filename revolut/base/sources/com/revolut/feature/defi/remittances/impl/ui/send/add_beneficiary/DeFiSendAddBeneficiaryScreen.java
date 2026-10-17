package com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.remittances.impl.R$string;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q2e.i0;
import q56.b;
import q56.d;
import q56.l;
import q56.m;
import q56.n;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq56/l;", "Ltki/c;", "Lq56/n;", "Lin0/g;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiSendAddBeneficiaryScreen extends ViewController<l> implements c, g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DeFiSendAddBeneficiaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final DeFiSendAddBeneficiaryScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public DeFiSendAddBeneficiaryScreen(DeFiSendAddBeneficiaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new q50.w(3));
        this.N = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: q56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAddBeneficiaryScreen f242296b;

            {
                this.f242296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen = this.f242296b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAddBeneficiaryScreen.R;
                        DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen2 = this.f242296b;
                        return tki.g.a(deFiSendAddBeneficiaryScreen2, deFiSendAddBeneficiaryScreen2.d(), zhm.u.c((InputTextDelegate) deFiSendAddBeneficiaryScreen2.M.getValue()), deFiSendAddBeneficiaryScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAddBeneficiaryScreen.R;
                        qji.b bVarR1 = deFiSendAddBeneficiaryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.di.DeFiSendAddBeneficiaryScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAddBeneficiaryScreenContract$InputData deFiSendAddBeneficiaryScreenContract$InputData = deFiSendAddBeneficiaryScreen.K;
                        deFiSendAddBeneficiaryScreenContract$InputData.getClass();
                        return new g56.e(dVar, gVar2, deFiSendAddBeneficiaryScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSendAddBeneficiaryScreen.R;
                        return (m) ((g56.e) deFiSendAddBeneficiaryScreen.P.getValue()).f140650c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: q56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAddBeneficiaryScreen f242296b;

            {
                this.f242296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen = this.f242296b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAddBeneficiaryScreen.R;
                        DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen2 = this.f242296b;
                        return tki.g.a(deFiSendAddBeneficiaryScreen2, deFiSendAddBeneficiaryScreen2.d(), zhm.u.c((InputTextDelegate) deFiSendAddBeneficiaryScreen2.M.getValue()), deFiSendAddBeneficiaryScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAddBeneficiaryScreen.R;
                        qji.b bVarR1 = deFiSendAddBeneficiaryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.di.DeFiSendAddBeneficiaryScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAddBeneficiaryScreenContract$InputData deFiSendAddBeneficiaryScreenContract$InputData = deFiSendAddBeneficiaryScreen.K;
                        deFiSendAddBeneficiaryScreenContract$InputData.getClass();
                        return new g56.e(dVar, gVar2, deFiSendAddBeneficiaryScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSendAddBeneficiaryScreen.R;
                        return (m) ((g56.e) deFiSendAddBeneficiaryScreen.P.getValue()).f140650c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: q56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAddBeneficiaryScreen f242296b;

            {
                this.f242296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen = this.f242296b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAddBeneficiaryScreen.R;
                        DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen2 = this.f242296b;
                        return tki.g.a(deFiSendAddBeneficiaryScreen2, deFiSendAddBeneficiaryScreen2.d(), zhm.u.c((InputTextDelegate) deFiSendAddBeneficiaryScreen2.M.getValue()), deFiSendAddBeneficiaryScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAddBeneficiaryScreen.R;
                        qji.b bVarR1 = deFiSendAddBeneficiaryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.di.DeFiSendAddBeneficiaryScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAddBeneficiaryScreenContract$InputData deFiSendAddBeneficiaryScreenContract$InputData = deFiSendAddBeneficiaryScreen.K;
                        deFiSendAddBeneficiaryScreenContract$InputData.getClass();
                        return new g56.e(dVar, gVar2, deFiSendAddBeneficiaryScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSendAddBeneficiaryScreen.R;
                        return (m) ((g56.e) deFiSendAddBeneficiaryScreen.P.getValue()).f140650c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(uiState.f242308b);
        largeActionButton.setEnabled(uiState.f242309c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g56.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_defi_send_add_beneficiary_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setTag("DeFiSendAddBeneficiaryScreen_SaveButton_Tag");
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new q56.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new q56.c(this, continuation, 1), 3);
        ?? r56 = this.M;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).i.f121375b), new q56.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52576h.f121375b), new i0(this, continuation, 11), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
