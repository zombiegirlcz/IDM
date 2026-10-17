package com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreen;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p0l.d;
import pi5.e;
import pi5.f;
import te0.w;
import vc.s;
import wp5.y;
import xi0.b;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/onboarding/impl/ui/fca/screen/learn/CryptoFcaLearnScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpi5/e;", "feature_crypto_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoFcaLearnScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoFcaLearnScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final b K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final TextDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CryptoFcaLearnScreen() {
        this(null);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f236423a, null);
        navBarWithToolbar.setDescriptionText(uiState.f236424b);
        navBarWithToolbar.setSecondDescriptionText(uiState.f236425c);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setToolbarTitle(uiState.f236423a);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ei5.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
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
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 24), 3);
        ViewController.P2(this, y.x(this.N.f53226s, this.O.d, "mergeWith(...)"), new pfk.o0(this, continuation, 4), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }

    public CryptoFcaLearnScreen(b bVar) {
        this.K = bVar;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, pi5.b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new TextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pi5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoFcaLearnScreen f236421b;

            {
                this.f236421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoFcaLearnScreen cryptoFcaLearnScreen = this.f236421b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoFcaLearnScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoFcaLearnScreen.m2()).a().get(ei5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ei5.b(((ei5.d) aVar2.b()).f126430n, new CryptoFcaLearnScreenContract$InputData(cryptoFcaLearnScreen.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ei5.d.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoFcaLearnScreen.S;
                        return (f) ((ei5.b) cryptoFcaLearnScreen.P.getValue()).f126419b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoFcaLearnScreen.S;
                        CryptoFcaLearnScreen cryptoFcaLearnScreen2 = this.f236421b;
                        return dli.f.a(cryptoFcaLearnScreen2, (f) cryptoFcaLearnScreen2.Q.getValue(), v.k(cryptoFcaLearnScreen2.N, cryptoFcaLearnScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pi5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoFcaLearnScreen f236421b;

            {
                this.f236421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoFcaLearnScreen cryptoFcaLearnScreen = this.f236421b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoFcaLearnScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoFcaLearnScreen.m2()).a().get(ei5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ei5.b(((ei5.d) aVar2.b()).f126430n, new CryptoFcaLearnScreenContract$InputData(cryptoFcaLearnScreen.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ei5.d.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoFcaLearnScreen.S;
                        return (f) ((ei5.b) cryptoFcaLearnScreen.P.getValue()).f126419b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoFcaLearnScreen.S;
                        CryptoFcaLearnScreen cryptoFcaLearnScreen2 = this.f236421b;
                        return dli.f.a(cryptoFcaLearnScreen2, (f) cryptoFcaLearnScreen2.Q.getValue(), v.k(cryptoFcaLearnScreen2.N, cryptoFcaLearnScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pi5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoFcaLearnScreen f236421b;

            {
                this.f236421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoFcaLearnScreen cryptoFcaLearnScreen = this.f236421b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoFcaLearnScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoFcaLearnScreen.m2()).a().get(ei5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ei5.b(((ei5.d) aVar2.b()).f126430n, new CryptoFcaLearnScreenContract$InputData(cryptoFcaLearnScreen.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ei5.d.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoFcaLearnScreen.S;
                        return (f) ((ei5.b) cryptoFcaLearnScreen.P.getValue()).f126419b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoFcaLearnScreen.S;
                        CryptoFcaLearnScreen cryptoFcaLearnScreen2 = this.f236421b;
                        return dli.f.a(cryptoFcaLearnScreen2, (f) cryptoFcaLearnScreen2.Q.getValue(), v.k(cryptoFcaLearnScreen2.N, cryptoFcaLearnScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }
}
