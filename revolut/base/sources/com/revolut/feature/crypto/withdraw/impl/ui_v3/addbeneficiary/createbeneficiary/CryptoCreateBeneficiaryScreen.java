package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary;

import a83.j0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bq5.h0;
import bq5.i;
import bq5.k0;
import bq5.m0;
import bq5.p;
import bq5.r;
import bq5.t;
import bq5.u;
import bq5.v;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zo5.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbq5/h0;", "Ltki/c;", "Lbq5/m0;", "Lin0/g;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCreateBeneficiaryScreen extends ViewController<h0> implements c, g {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new kotlin.jvm.internal.h0(CryptoCreateBeneficiaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final CryptoCreateBeneficiaryScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CryptoCreateBeneficiaryScreen(CryptoCreateBeneficiaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, i.f);
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = w.y0(new bkd.a(21));
        this.O = w.y0(new bkd.a(22));
        this.P = w.y0(new bkd.a(23));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bq5.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCreateBeneficiaryScreen f17717b;

            {
                this.f17717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.f17717b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCreateBeneficiaryScreen.T;
                        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen2 = this.f17717b;
                        return tki.g.a(cryptoCreateBeneficiaryScreen2, cryptoCreateBeneficiaryScreen2.R2(), zhm.v.k((ListSubheaderDelegate) cryptoCreateBeneficiaryScreen2.P.getValue(), (FixedTabsDelegate) cryptoCreateBeneficiaryScreen2.N.getValue(), cryptoCreateBeneficiaryScreen2.f3()), cryptoCreateBeneficiaryScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCreateBeneficiaryScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoCreateBeneficiaryScreen.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zo5.l) ((cq5.a) ((cq5.b) aVar2.b()).j().mo3808a(cryptoCreateBeneficiaryScreen)).f0(cryptoCreateBeneficiaryScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoCreateBeneficiaryScreen.T;
                        zo5.l lVar = (zo5.l) cryptoCreateBeneficiaryScreen.R.getValue();
                        switch (lVar.f323922a) {
                            case 0:
                                return (k0) lVar.e.get();
                            default:
                                return (k0) lVar.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bq5.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCreateBeneficiaryScreen f17717b;

            {
                this.f17717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.f17717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCreateBeneficiaryScreen.T;
                        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen2 = this.f17717b;
                        return tki.g.a(cryptoCreateBeneficiaryScreen2, cryptoCreateBeneficiaryScreen2.R2(), zhm.v.k((ListSubheaderDelegate) cryptoCreateBeneficiaryScreen2.P.getValue(), (FixedTabsDelegate) cryptoCreateBeneficiaryScreen2.N.getValue(), cryptoCreateBeneficiaryScreen2.f3()), cryptoCreateBeneficiaryScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCreateBeneficiaryScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoCreateBeneficiaryScreen.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zo5.l) ((cq5.a) ((cq5.b) aVar2.b()).j().mo3808a(cryptoCreateBeneficiaryScreen)).f0(cryptoCreateBeneficiaryScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoCreateBeneficiaryScreen.T;
                        zo5.l lVar = (zo5.l) cryptoCreateBeneficiaryScreen.R.getValue();
                        switch (lVar.f323922a) {
                            case 0:
                                return (k0) lVar.e.get();
                            default:
                                return (k0) lVar.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bq5.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCreateBeneficiaryScreen f17717b;

            {
                this.f17717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.f17717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCreateBeneficiaryScreen.T;
                        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen2 = this.f17717b;
                        return tki.g.a(cryptoCreateBeneficiaryScreen2, cryptoCreateBeneficiaryScreen2.R2(), zhm.v.k((ListSubheaderDelegate) cryptoCreateBeneficiaryScreen2.P.getValue(), (FixedTabsDelegate) cryptoCreateBeneficiaryScreen2.N.getValue(), cryptoCreateBeneficiaryScreen2.f3()), cryptoCreateBeneficiaryScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCreateBeneficiaryScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoCreateBeneficiaryScreen.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zo5.l) ((cq5.a) ((cq5.b) aVar2.b()).j().mo3808a(cryptoCreateBeneficiaryScreen)).f0(cryptoCreateBeneficiaryScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoCreateBeneficiaryScreen.T;
                        zo5.l lVar = (zo5.l) cryptoCreateBeneficiaryScreen.R.getValue();
                        switch (lVar.f323922a) {
                            case 0:
                                return (k0) lVar.e.get();
                            default:
                                return (k0) lVar.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m0 uiState = (m0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(uiState.f17732b);
        largeActionButton.setEnabled(uiState.f17733c);
        d3().f174558c.setTextClause(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setTag("CryptoCreateBeneficiaryScreen_NextButton_Tag");
    }

    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new r(this, continuation, 0), 3);
        ViewController.P2(this, new bk6.c(rd0.e.b(f3().f52576h.f121375b), 12), new r(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new r(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(f3().i.f121375b), new bq5.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(f3().f52575g.f121375b), new t(this, null), 3);
        ViewController.P2(this, t1.d(rd0.e.b(f3().e.f121375b), 300L), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(f3().e.f121375b), new v(this, null), 3);
        ViewController.P2(this, new j0(new bk6.c(rd0.e.b(f3().f.f121375b), 13), 12), new p(this, continuation, 0), 3);
        ViewController.P2(this, new bk6.c(rd0.e.b(((FixedTabsDelegate) this.N.getValue()).f52339c.f121375b), 15), new p(this, continuation, 1), 3);
        ViewController.P2(this, new bk6.c(rd0.e.b(((ListSubheaderDelegate) this.P.getValue()).d), 14), new bq5.q(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k0 R2() {
        return (k0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputTextDelegate f3() {
        return (InputTextDelegate) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
