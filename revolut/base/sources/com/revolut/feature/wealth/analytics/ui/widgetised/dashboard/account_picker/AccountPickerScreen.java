package com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ewg.b;
import jii.m;
import jyg.e;
import jyg.f;
import jyg.g;
import jyg.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/account_picker/AccountPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljyg/e;", "Ldli/a;", "Ljyg/g;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountPickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AccountPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AccountPickerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final int O;
    public final Object P;
    public final Lazy Q;
    public final h R;

    public AccountPickerScreen(AccountPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: jyg.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerScreen f179435b;

            {
                this.f179435b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountPickerScreen accountPickerScreen = this.f179435b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerScreen.S;
                        return (f) ((ewg.b) accountPickerScreen.M.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerScreen.S;
                        qji.b bVarU2 = accountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.di.AccountPickerScreenInjector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        AccountPickerContract$InputData accountPickerContract$InputData = accountPickerScreen.K;
                        accountPickerContract$InputData.getClass();
                        return new ewg.b(hVar, kVar2, accountPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerScreen.S;
                        AccountPickerScreen accountPickerScreen2 = this.f179435b;
                        return dli.f.a(accountPickerScreen2, (f) accountPickerScreen2.L.getValue(), v.k((RowDelegate) accountPickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: jyg.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerScreen f179435b;

            {
                this.f179435b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountPickerScreen accountPickerScreen = this.f179435b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerScreen.S;
                        return (f) ((ewg.b) accountPickerScreen.M.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerScreen.S;
                        qji.b bVarU2 = accountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.di.AccountPickerScreenInjector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        AccountPickerContract$InputData accountPickerContract$InputData = accountPickerScreen.K;
                        accountPickerContract$InputData.getClass();
                        return new ewg.b(hVar, kVar2, accountPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerScreen.S;
                        AccountPickerScreen accountPickerScreen2 = this.f179435b;
                        return dli.f.a(accountPickerScreen2, (f) accountPickerScreen2.L.getValue(), v.k((RowDelegate) accountPickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$style.UiKitTheme_Transparent;
        this.O = R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: jyg.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerScreen f179435b;

            {
                this.f179435b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountPickerScreen accountPickerScreen = this.f179435b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerScreen.S;
                        return (f) ((ewg.b) accountPickerScreen.M.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerScreen.S;
                        qji.b bVarU2 = accountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.di.AccountPickerScreenInjector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        AccountPickerContract$InputData accountPickerContract$InputData = accountPickerScreen.K;
                        accountPickerContract$InputData.getClass();
                        return new ewg.b(hVar, kVar2, accountPickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerScreen.S;
                        AccountPickerScreen accountPickerScreen2 = this.f179435b;
                        return dli.f.a(accountPickerScreen2, (f) accountPickerScreen2.L.getValue(), v.k((RowDelegate) accountPickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = j.b(new jxi.a(9));
        this.R = s.t(this, i.f);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new jyg.j(this, null), 3);
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new jkc.g(this, null, 25), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
