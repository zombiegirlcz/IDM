package com.revolut.feature.tab.crypto.impl.ui.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreen;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import wje.b;
import wje.d;
import wje.f;
import wje.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ltki/c;", "Lwje/i;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSettingsScreen extends ViewController<Object> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CryptoSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CryptoSettingsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final AccountCellItemDelegate Q;
    public final Object R;
    public final List S;
    public final Object T;

    public CryptoSettingsScreen(CryptoSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wje.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSettingsScreen f298066b;

            {
                this.f298066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSettingsScreen cryptoSettingsScreen = this.f298066b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSettingsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSettingsScreen.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        CryptoSettingsScreenContract$InputData cryptoSettingsScreenContract$InputData = cryptoSettingsScreen.K;
                        cryptoSettingsScreenContract$InputData.getClass();
                        return new jje.b(cVar, cryptoSettingsScreen, cryptoSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSettingsScreen.U;
                        return (h) ((jje.b) cryptoSettingsScreen.N.getValue()).f174824g.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoSettingsScreen.U;
                        CryptoSettingsScreen cryptoSettingsScreen2 = this.f298066b;
                        return tki.g.a(cryptoSettingsScreen2, cryptoSettingsScreen2.d(), cryptoSettingsScreen2.S, 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wje.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSettingsScreen f298066b;

            {
                this.f298066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSettingsScreen cryptoSettingsScreen = this.f298066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSettingsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSettingsScreen.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        CryptoSettingsScreenContract$InputData cryptoSettingsScreenContract$InputData = cryptoSettingsScreen.K;
                        cryptoSettingsScreenContract$InputData.getClass();
                        return new jje.b(cVar, cryptoSettingsScreen, cryptoSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSettingsScreen.U;
                        return (h) ((jje.b) cryptoSettingsScreen.N.getValue()).f174824g.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoSettingsScreen.U;
                        CryptoSettingsScreen cryptoSettingsScreen2 = this.f298066b;
                        return tki.g.a(cryptoSettingsScreen2, cryptoSettingsScreen2.d(), cryptoSettingsScreen2.S, 0, null, null, null, 60);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new AccountCellItemDelegate();
        this.R = w.y0(new wf5.a(16));
        final int i3 = 2;
        this.S = v.k(rowDelegate, new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate());
        this.T = w.y0(new Function0(this) { // from class: wje.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSettingsScreen f298066b;

            {
                this.f298066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoSettingsScreen cryptoSettingsScreen = this.f298066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSettingsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSettingsScreen.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        CryptoSettingsScreenContract$InputData cryptoSettingsScreenContract$InputData = cryptoSettingsScreen.K;
                        cryptoSettingsScreenContract$InputData.getClass();
                        return new jje.b(cVar, cryptoSettingsScreen, cryptoSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSettingsScreen.U;
                        return (h) ((jje.b) cryptoSettingsScreen.N.getValue()).f174824g.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoSettingsScreen.U;
                        CryptoSettingsScreen cryptoSettingsScreen2 = this.f298066b;
                        return tki.g.a(cryptoSettingsScreen2, cryptoSettingsScreen2.d(), cryptoSettingsScreen2.S, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jje.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((jje.b) this.N.getValue()).e.get()).d(v.k(this.Q, new CellDetailsDelegate(), (AppTipDelegate) this.R.getValue()));
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_settings_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new wje.c(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new wje.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51551c.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((AppTipDelegate) this.R.getValue()).f51654g), new wje.c(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final wje.h d() {
        return (wje.h) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
