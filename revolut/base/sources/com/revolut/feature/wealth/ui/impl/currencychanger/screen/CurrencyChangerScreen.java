package com.revolut.feature.wealth.ui.impl.currencychanger.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.wealth.api.domain.model.SelectedCurrencyInfo;
import com.revolut.feature.wealth.ui.api.currencychanger.CurrencyChangerContract$InputData;
import com.revolut.feature.wealth.ui.impl.currencychanger.screen.CurrencyChangerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.n;
import kih.d;
import kih.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkh.u;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/currencychanger/screen/CurrencyChangerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkih/d;", "Ldli/a;", "Lkih/f;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CurrencyChangerScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CurrencyChangerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SelectedCurrencyInfo K;
    public final h L = s.t(this, jkh.d.f);
    public final AccountCellItemDelegate M = new AccountCellItemDelegate();
    public final AppTipDelegate N = new AppTipDelegate();
    public final int O = R$layout.screen_recycler_navbar_bottomsheet;
    public final boolean P = true;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CurrencyChangerScreen(SelectedCurrencyInfo selectedCurrencyInfo) {
        this.K = selectedCurrencyInfo;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: jkh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChangerScreen f175172b;

            {
                this.f175172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CurrencyChangerScreen currencyChangerScreen = this.f175172b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChangerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChangerScreen.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mkh.f(((mkh.s) ((u) aVar2.b())).l0, new CurrencyChangerContract$InputData(currencyChangerScreen.K, false));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChangerScreen.T;
                        return (kih.e) ((mkh.f) currencyChangerScreen.Q.getValue()).f206324c.get();
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChangerScreen.T;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        CurrencyChangerScreen currencyChangerScreen2 = this.f175172b;
                        return dli.f.a(currencyChangerScreen2, (kih.e) currencyChangerScreen2.R.getValue(), v.k(currencyChangerScreen2.M, new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new PlainTextDelegate(), new FullScreenStateDelegate(), currencyChangerScreen2.N), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: jkh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChangerScreen f175172b;

            {
                this.f175172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CurrencyChangerScreen currencyChangerScreen = this.f175172b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChangerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChangerScreen.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mkh.f(((mkh.s) ((u) aVar2.b())).l0, new CurrencyChangerContract$InputData(currencyChangerScreen.K, false));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChangerScreen.T;
                        return (kih.e) ((mkh.f) currencyChangerScreen.Q.getValue()).f206324c.get();
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChangerScreen.T;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        CurrencyChangerScreen currencyChangerScreen2 = this.f175172b;
                        return dli.f.a(currencyChangerScreen2, (kih.e) currencyChangerScreen2.R.getValue(), v.k(currencyChangerScreen2.M, new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new PlainTextDelegate(), new FullScreenStateDelegate(), currencyChangerScreen2.N), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: jkh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChangerScreen f175172b;

            {
                this.f175172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CurrencyChangerScreen currencyChangerScreen = this.f175172b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChangerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChangerScreen.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mkh.f(((mkh.s) ((u) aVar2.b())).l0, new CurrencyChangerContract$InputData(currencyChangerScreen.K, false));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChangerScreen.T;
                        return (kih.e) ((mkh.f) currencyChangerScreen.Q.getValue()).f206324c.get();
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChangerScreen.T;
                        int i32 = R$id.navBarBottomSheet_RecyclerView;
                        CurrencyChangerScreen currencyChangerScreen2 = this.f175172b;
                        return dli.f.a(currencyChangerScreen2, (kih.e) currencyChangerScreen2.R.getValue(), v.k(currencyChangerScreen2.M, new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new PlainTextDelegate(), new FullScreenStateDelegate(), currencyChangerScreen2.N), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f184237a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mkh.f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (kih.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51551c.f53218h), null, new jkh.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51654g), null, new jij.h(this, (Continuation) null, 8), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
