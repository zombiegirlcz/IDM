package com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.withdraw.impl.R$id;
import com.revolut.feature.crypto.withdraw.impl.R$layout;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import se4.c;
import sq5.d;
import sq5.e;
import sq5.j;
import sq5.k;
import sq5.l;
import sq5.m;
import sq5.n;
import te0.w;
import uo5.b;
import vc.s;
import yo5.t;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingpicker/CryptoAddressHostingPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsq5/e;", "Ldli/a;", "Lsq5/h;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAddressHostingPickerController extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CryptoAddressHostingPickerController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/withdraw/impl/databinding/ScreenCryptoAddressHostingPickerBinding;", 0))};
    public final CryptoAddressHostingPickerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CryptoAddressHostingPickerController(CryptoAddressHostingPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_crypto_address_hosting_picker;
        this.M = s.t(this, k.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sq5.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingPickerController f265009b;

            {
                this.f265009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoAddressHostingPickerController cryptoAddressHostingPickerController = this.f265009b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAddressHostingPickerController.U;
                        qji.b bVarU2 = cryptoAddressHostingPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.di.CryptoAddressHostingPickerControllerComponentInjector");
                        yo5.s sVar = (yo5.s) bVarU2;
                        yo5.w wVar = sVar.f315579b;
                        yo5.s sVar2 = sVar.f315580c;
                        CryptoAddressHostingPickerContract$InputData cryptoAddressHostingPickerContract$InputData = cryptoAddressHostingPickerController.K;
                        cryptoAddressHostingPickerContract$InputData.getClass();
                        return new yo5.t(wVar, sVar2, cryptoAddressHostingPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAddressHostingPickerController.U;
                        return (d) ((yo5.t) cryptoAddressHostingPickerController.N.getValue()).f315583c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoAddressHostingPickerController.U;
                        int i3 = R$id.cryptoAddressHostingPicker_recyclerView;
                        CryptoAddressHostingPickerController cryptoAddressHostingPickerController2 = this.f265009b;
                        return dli.f.a(cryptoAddressHostingPickerController2, cryptoAddressHostingPickerController2.d(), v.k((RowDelegate) cryptoAddressHostingPickerController2.Q.getValue(), (FixedTabsDelegate) cryptoAddressHostingPickerController2.S.getValue(), (FullScreenStateDelegate) cryptoAddressHostingPickerController2.T.getValue(), (ListSubheaderDelegate) cryptoAddressHostingPickerController2.R.getValue(), new RowLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: sq5.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingPickerController f265009b;

            {
                this.f265009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoAddressHostingPickerController cryptoAddressHostingPickerController = this.f265009b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAddressHostingPickerController.U;
                        qji.b bVarU2 = cryptoAddressHostingPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.di.CryptoAddressHostingPickerControllerComponentInjector");
                        yo5.s sVar = (yo5.s) bVarU2;
                        yo5.w wVar = sVar.f315579b;
                        yo5.s sVar2 = sVar.f315580c;
                        CryptoAddressHostingPickerContract$InputData cryptoAddressHostingPickerContract$InputData = cryptoAddressHostingPickerController.K;
                        cryptoAddressHostingPickerContract$InputData.getClass();
                        return new yo5.t(wVar, sVar2, cryptoAddressHostingPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAddressHostingPickerController.U;
                        return (d) ((yo5.t) cryptoAddressHostingPickerController.N.getValue()).f315583c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoAddressHostingPickerController.U;
                        int i3 = R$id.cryptoAddressHostingPicker_recyclerView;
                        CryptoAddressHostingPickerController cryptoAddressHostingPickerController2 = this.f265009b;
                        return dli.f.a(cryptoAddressHostingPickerController2, cryptoAddressHostingPickerController2.d(), v.k((RowDelegate) cryptoAddressHostingPickerController2.Q.getValue(), (FixedTabsDelegate) cryptoAddressHostingPickerController2.S.getValue(), (FullScreenStateDelegate) cryptoAddressHostingPickerController2.T.getValue(), (ListSubheaderDelegate) cryptoAddressHostingPickerController2.R.getValue(), new RowLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: sq5.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingPickerController f265009b;

            {
                this.f265009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoAddressHostingPickerController cryptoAddressHostingPickerController = this.f265009b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAddressHostingPickerController.U;
                        qji.b bVarU2 = cryptoAddressHostingPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.di.CryptoAddressHostingPickerControllerComponentInjector");
                        yo5.s sVar = (yo5.s) bVarU2;
                        yo5.w wVar = sVar.f315579b;
                        yo5.s sVar2 = sVar.f315580c;
                        CryptoAddressHostingPickerContract$InputData cryptoAddressHostingPickerContract$InputData = cryptoAddressHostingPickerController.K;
                        cryptoAddressHostingPickerContract$InputData.getClass();
                        return new yo5.t(wVar, sVar2, cryptoAddressHostingPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAddressHostingPickerController.U;
                        return (d) ((yo5.t) cryptoAddressHostingPickerController.N.getValue()).f315583c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoAddressHostingPickerController.U;
                        int i32 = R$id.cryptoAddressHostingPicker_recyclerView;
                        CryptoAddressHostingPickerController cryptoAddressHostingPickerController2 = this.f265009b;
                        return dli.f.a(cryptoAddressHostingPickerController2, cryptoAddressHostingPickerController2.d(), v.k((RowDelegate) cryptoAddressHostingPickerController2.Q.getValue(), (FixedTabsDelegate) cryptoAddressHostingPickerController2.S.getValue(), (FullScreenStateDelegate) cryptoAddressHostingPickerController2.T.getValue(), (ListSubheaderDelegate) cryptoAddressHostingPickerController2.R.getValue(), new RowLoadingDelegate()), i32, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new j(0));
        this.R = w.y0(new j(1));
        this.S = w.y0(new j(2));
        this.T = w.y0(new j(3));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((sq5.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f281570b;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_withdrawals_search_hint, null, null, 14));
        navBarWithToolbar.f59417v0 = false;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f281570b.f59409p.f57336l), new c(this, continuation, 17), 3);
        r rVarDebounce = d3().f281570b.f59409p.f57337m.debounce(400L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        ViewController.P2(this, rd0.e.b(rVarDebounce), new l(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FixedTabsDelegate) this.S.getValue()).f52339c.f121375b), new l(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), new n(this, null), 3);
    }

    public final b d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
