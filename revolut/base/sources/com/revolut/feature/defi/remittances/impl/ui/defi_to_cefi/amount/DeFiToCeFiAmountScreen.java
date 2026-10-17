package com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.amount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.remittances.impl.R$string;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.amount.DeFiToCeFiAmountScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dw3.p3;
import g56.i;
import j56.b;
import j56.d;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/amount/DeFiToCeFiAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj56/d;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiToCeFiAmountScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DeFiToCeFiAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final DeFiToCeFiAmountScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public DeFiToCeFiAmountScreen(DeFiToCeFiAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiToCeFiAmountScreen f171607b;

            {
                this.f171607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiToCeFiAmountScreen deFiToCeFiAmountScreen = this.f171607b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiToCeFiAmountScreen.Q;
                        qji.b bVarR1 = deFiToCeFiAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.amount.di.DeFiToCeFiAmountScreenComponentInjector");
                        deFiToCeFiAmountScreen.K.getClass();
                        i iVar = new i();
                        iVar.f140660a = e4m.b.b(new p3(18));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiToCeFiAmountScreen.Q;
                        return (e) ((i) deFiToCeFiAmountScreen.N.getValue()).f140660a.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiToCeFiAmountScreen.Q;
                        DeFiToCeFiAmountScreen deFiToCeFiAmountScreen2 = this.f171607b;
                        return dli.f.a(deFiToCeFiAmountScreen2, (e) deFiToCeFiAmountScreen2.O.getValue(), f0.f322471a, deFiToCeFiAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiToCeFiAmountScreen f171607b;

            {
                this.f171607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiToCeFiAmountScreen deFiToCeFiAmountScreen = this.f171607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiToCeFiAmountScreen.Q;
                        qji.b bVarR1 = deFiToCeFiAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.amount.di.DeFiToCeFiAmountScreenComponentInjector");
                        deFiToCeFiAmountScreen.K.getClass();
                        i iVar = new i();
                        iVar.f140660a = e4m.b.b(new p3(18));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiToCeFiAmountScreen.Q;
                        return (e) ((i) deFiToCeFiAmountScreen.N.getValue()).f140660a.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiToCeFiAmountScreen.Q;
                        DeFiToCeFiAmountScreen deFiToCeFiAmountScreen2 = this.f171607b;
                        return dli.f.a(deFiToCeFiAmountScreen2, (e) deFiToCeFiAmountScreen2.O.getValue(), f0.f322471a, deFiToCeFiAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: j56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiToCeFiAmountScreen f171607b;

            {
                this.f171607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiToCeFiAmountScreen deFiToCeFiAmountScreen = this.f171607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiToCeFiAmountScreen.Q;
                        qji.b bVarR1 = deFiToCeFiAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.amount.di.DeFiToCeFiAmountScreenComponentInjector");
                        deFiToCeFiAmountScreen.K.getClass();
                        i iVar = new i();
                        iVar.f140660a = e4m.b.b(new p3(18));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiToCeFiAmountScreen.Q;
                        return (e) ((i) deFiToCeFiAmountScreen.N.getValue()).f140660a.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiToCeFiAmountScreen.Q;
                        DeFiToCeFiAmountScreen deFiToCeFiAmountScreen2 = this.f171607b;
                        return dli.f.a(deFiToCeFiAmountScreen2, (e) deFiToCeFiAmountScreen2.O.getValue(), f0.f322471a, deFiToCeFiAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j56.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_defi_withdraw_move_crypto_amount_input_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.crypto_defi_withdraw_move_crypto_amount_input_action_review_transfer, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new j2c.b(this, null, 5), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
