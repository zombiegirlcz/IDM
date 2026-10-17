package com.revolut.feature.crypto.remittance.impl.ui.multichain.info;

import aii.q;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.remittance.impl.R$id;
import com.revolut.feature.crypto.remittance.impl.R$layout;
import com.revolut.feature.crypto.remittance.impl.R$string;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sw6.a;
import te0.w;
import tk5.b;
import tk5.c;
import tk5.e;
import tk5.f;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/ui/multichain/info/CryptoMultichainInfoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Ltk5/f;", "Lcom/revolut/feature/crypto/remittance/impl/ui/multichain/info/CryptoMultichainInfoControllerContract$SheetPagerItem;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoMultichainInfoController extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CryptoMultichainInfoController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/remittance/impl/databinding/ControllerCryptoMultichainInfoBinding;", 0))};
    public final h K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CryptoMultichainInfoController(CryptoMultichainInfoControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.controller_crypto_multichain_info;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoMultichainInfoController f271877b;

            {
                this.f271877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoMultichainInfoController cryptoMultichainInfoController = this.f271877b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoMultichainInfoController.Q;
                        return mif.a.a(cryptoMultichainInfoController, 0, R$id.controllerCryptoMultichainInfo_Pager, (g) cryptoMultichainInfoController.P.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = CryptoMultichainInfoController.Q;
                        return (g) ((ak5.e) cryptoMultichainInfoController.O.getValue()).f5680c.get();
                }
            }
        });
        this.O = w.y0(new a(this, inputData, 25));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoMultichainInfoController f271877b;

            {
                this.f271877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoMultichainInfoController cryptoMultichainInfoController = this.f271877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoMultichainInfoController.Q;
                        return mif.a.a(cryptoMultichainInfoController, 0, R$id.controllerCryptoMultichainInfo_Pager, (g) cryptoMultichainInfoController.P.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = CryptoMultichainInfoController.Q;
                        return (g) ((ak5.e) cryptoMultichainInfoController.O.getValue()).f5680c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        e eVar = qVar instanceof e ? (e) qVar : null;
        Tabs tabs = d3().f314419c;
        ArrayList arrayList = uiState.f271881a;
        String str = uiState.f271882b;
        tabs.setItems(arrayList, str);
        if (!pd.b.k(eVar != null ? Boolean.valueOf(eVar.f271880a) : null) || str == null) {
            return;
        }
        Tabs controllerCryptoMultichainInfoTabs = d3().f314419c;
        Intrinsics.checkNotNullExpressionValue(controllerCryptoMultichainInfoTabs, "controllerCryptoMultichainInfoTabs");
        Tabs.u(controllerCryptoMultichainInfoTabs, uiState.f271882b, true, false, false, 12);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        CryptoMultichainInfoControllerContract$SheetPagerItem scrollerItem = (CryptoMultichainInfoControllerContract$SheetPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(scrollerItem, "pagerItem");
        tk5.g gVar = (tk5.g) this.P.getValue();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(scrollerItem, "scrollerItem");
        gVar.H2(gVar.o, new tjf.e(scrollerItem, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ak5.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ak5.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tk5.g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f314418b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        Continuation continuation = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_multi_network_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.crypto_withdrawals_multi_network_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f314419c.f58882b), new t9h.b(this, continuation, 23), 3);
    }

    public final yj5.a d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yj5.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
