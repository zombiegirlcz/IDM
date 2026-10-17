package com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bs5.d;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListDestination;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_feed/impl/chat_widgets/crypto_tokens/list/CryptoTokensListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbs5/b;", "feature_crypto_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoTokensListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CryptoTokensListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CryptoTokensListDestination.InputData K;
    public final h L;
    public final RowDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CryptoTokensListScreen(CryptoTokensListDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, a.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bs5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTokensListScreen f18070b;

            {
                this.f18070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoTokensListScreen cryptoTokensListScreen = this.f18070b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoTokensListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoTokensListScreen.m2()).a().get(or5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", or5.b.class, " is not found"));
                        }
                        es5.a aVar3 = ((es5.a) aVar2.b()).d;
                        CryptoTokensListDestination.InputData inputData2 = cryptoTokensListScreen.K;
                        inputData2.getClass();
                        return new es5.b(aVar3, inputData2);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoTokensListScreen.R;
                        return (a) ((es5.b) ((cs5.a) cryptoTokensListScreen.O.getValue())).f128865b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoTokensListScreen.R;
                        CryptoTokensListScreen cryptoTokensListScreen2 = this.f18070b;
                        return dli.f.a(cryptoTokensListScreen2, (a) cryptoTokensListScreen2.P.getValue(), v.k(cryptoTokensListScreen2.M, new TextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bs5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTokensListScreen f18070b;

            {
                this.f18070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoTokensListScreen cryptoTokensListScreen = this.f18070b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoTokensListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoTokensListScreen.m2()).a().get(or5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", or5.b.class, " is not found"));
                        }
                        es5.a aVar3 = ((es5.a) aVar2.b()).d;
                        CryptoTokensListDestination.InputData inputData2 = cryptoTokensListScreen.K;
                        inputData2.getClass();
                        return new es5.b(aVar3, inputData2);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoTokensListScreen.R;
                        return (a) ((es5.b) ((cs5.a) cryptoTokensListScreen.O.getValue())).f128865b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoTokensListScreen.R;
                        CryptoTokensListScreen cryptoTokensListScreen2 = this.f18070b;
                        return dli.f.a(cryptoTokensListScreen2, (a) cryptoTokensListScreen2.P.getValue(), v.k(cryptoTokensListScreen2.M, new TextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bs5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTokensListScreen f18070b;

            {
                this.f18070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoTokensListScreen cryptoTokensListScreen = this.f18070b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoTokensListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoTokensListScreen.m2()).a().get(or5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", or5.b.class, " is not found"));
                        }
                        es5.a aVar3 = ((es5.a) aVar2.b()).d;
                        CryptoTokensListDestination.InputData inputData2 = cryptoTokensListScreen.K;
                        inputData2.getClass();
                        return new es5.b(aVar3, inputData2);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoTokensListScreen.R;
                        return (a) ((es5.b) ((cs5.a) cryptoTokensListScreen.O.getValue())).f128865b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoTokensListScreen.R;
                        CryptoTokensListScreen cryptoTokensListScreen2 = this.f18070b;
                        return dli.f.a(cryptoTokensListScreen2, (a) cryptoTokensListScreen2.P.getValue(), v.k(cryptoTokensListScreen2.M, new TextDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bs5.b uiState = (bs5.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f18067a, null);
        d3().f174539b.setToolbarTitle(uiState.f18067a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (cs5.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (bs5.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new brc.h(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
