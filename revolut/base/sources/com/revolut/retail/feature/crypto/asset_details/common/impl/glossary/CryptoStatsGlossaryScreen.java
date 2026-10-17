package com.revolut.retail.feature.crypto.asset_details.common.impl.glossary;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryScreen;
import dli.a;
import h8j.b;
import hwi.l0;
import i8j.c;
import i8j.d;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/common/impl/glossary/CryptoStatsGlossaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li8j/a;", "feature_crypto_asset_details_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoStatsGlossaryScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CryptoStatsGlossaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CryptoStatsGlossaryContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CryptoStatsGlossaryScreen(CryptoStatsGlossaryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: i8j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStatsGlossaryScreen f159545b;

            {
                this.f159545b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoStatsGlossaryScreen cryptoStatsGlossaryScreen = this.f159545b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStatsGlossaryScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoStatsGlossaryScreen.m2()).a().get(h8j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h8j.a.class, " is not found"));
                        }
                        h8j.a aVar3 = ((h8j.a) aVar2.b()).f150059c;
                        CryptoStatsGlossaryContract$InputData cryptoStatsGlossaryContract$InputData = cryptoStatsGlossaryScreen.K;
                        cryptoStatsGlossaryContract$InputData.getClass();
                        return new h8j.b(aVar3, cryptoStatsGlossaryContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStatsGlossaryScreen.Q;
                        return (d) ((h8j.b) cryptoStatsGlossaryScreen.N.getValue()).f150062c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoStatsGlossaryScreen.Q;
                        CryptoStatsGlossaryScreen cryptoStatsGlossaryScreen2 = this.f159545b;
                        return dli.f.a(cryptoStatsGlossaryScreen2, (d) cryptoStatsGlossaryScreen2.O.getValue(), v.k(new HeaderDelegate(), new HeaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsChevronDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: i8j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStatsGlossaryScreen f159545b;

            {
                this.f159545b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoStatsGlossaryScreen cryptoStatsGlossaryScreen = this.f159545b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStatsGlossaryScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoStatsGlossaryScreen.m2()).a().get(h8j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h8j.a.class, " is not found"));
                        }
                        h8j.a aVar3 = ((h8j.a) aVar2.b()).f150059c;
                        CryptoStatsGlossaryContract$InputData cryptoStatsGlossaryContract$InputData = cryptoStatsGlossaryScreen.K;
                        cryptoStatsGlossaryContract$InputData.getClass();
                        return new h8j.b(aVar3, cryptoStatsGlossaryContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStatsGlossaryScreen.Q;
                        return (d) ((h8j.b) cryptoStatsGlossaryScreen.N.getValue()).f150062c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoStatsGlossaryScreen.Q;
                        CryptoStatsGlossaryScreen cryptoStatsGlossaryScreen2 = this.f159545b;
                        return dli.f.a(cryptoStatsGlossaryScreen2, (d) cryptoStatsGlossaryScreen2.O.getValue(), v.k(new HeaderDelegate(), new HeaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsChevronDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: i8j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStatsGlossaryScreen f159545b;

            {
                this.f159545b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoStatsGlossaryScreen cryptoStatsGlossaryScreen = this.f159545b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStatsGlossaryScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoStatsGlossaryScreen.m2()).a().get(h8j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h8j.a.class, " is not found"));
                        }
                        h8j.a aVar3 = ((h8j.a) aVar2.b()).f150059c;
                        CryptoStatsGlossaryContract$InputData cryptoStatsGlossaryContract$InputData = cryptoStatsGlossaryScreen.K;
                        cryptoStatsGlossaryContract$InputData.getClass();
                        return new h8j.b(aVar3, cryptoStatsGlossaryContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStatsGlossaryScreen.Q;
                        return (d) ((h8j.b) cryptoStatsGlossaryScreen.N.getValue()).f150062c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoStatsGlossaryScreen.Q;
                        CryptoStatsGlossaryScreen cryptoStatsGlossaryScreen2 = this.f159545b;
                        return dli.f.a(cryptoStatsGlossaryScreen2, (d) cryptoStatsGlossaryScreen2.O.getValue(), v.k(new HeaderDelegate(), new HeaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsChevronDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i8j.a uiState = (i8j.a) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f159542a, null);
        TextLocalisedClause textLocalisedClause = uiState.f159542a;
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new l0(this, null, 26), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
