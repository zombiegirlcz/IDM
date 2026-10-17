package com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.MerchantPermissionsScreen;
import com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.MerchantPermissionsScreenContract$InputData;
import dkl.r;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.c0;
import ljl.q0;
import pnl.c;
import rk9.d;
import rnl.b;
import rnl.e;
import rnl.f;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/merchant_permissions/merchant_permissions_screen/MerchantPermissionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpnl/c;", "Ldli/a;", "Lrnl/f;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MerchantPermissionsScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(MerchantPermissionsScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenSsoMerchantConsentBinding;", 0))};
    public final MerchantPermissionsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public MerchantPermissionsScreen(MerchantPermissionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_sso_merchant_consent;
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantPermissionsScreen f255717b;

            {
                this.f255717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MerchantPermissionsScreen merchantPermissionsScreen = this.f255717b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MerchantPermissionsScreen.S;
                        return (d) ((c0) merchantPermissionsScreen.R.getValue()).f195910c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MerchantPermissionsScreen.S;
                        MerchantPermissionsScreen merchantPermissionsScreen2 = this.f255717b;
                        return dli.f.a(merchantPermissionsScreen2, merchantPermissionsScreen2.d(), v.k(new FullScreenStateDelegate(), merchantPermissionsScreen2.M, merchantPermissionsScreen2.N), R$id.merchantConsentScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MerchantPermissionsScreen.S;
                        qji.b bVarU2 = merchantPermissionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.di.MerchantPermissionsScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        MerchantPermissionsScreenContract$InputData merchantPermissionsScreenContract$InputData = merchantPermissionsScreen.K;
                        merchantPermissionsScreenContract$InputData.getClass();
                        return new c0(q0Var, cVar2, merchantPermissionsScreenContract$InputData);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantPermissionsScreen f255717b;

            {
                this.f255717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MerchantPermissionsScreen merchantPermissionsScreen = this.f255717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MerchantPermissionsScreen.S;
                        return (d) ((c0) merchantPermissionsScreen.R.getValue()).f195910c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MerchantPermissionsScreen.S;
                        MerchantPermissionsScreen merchantPermissionsScreen2 = this.f255717b;
                        return dli.f.a(merchantPermissionsScreen2, merchantPermissionsScreen2.d(), v.k(new FullScreenStateDelegate(), merchantPermissionsScreen2.M, merchantPermissionsScreen2.N), R$id.merchantConsentScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MerchantPermissionsScreen.S;
                        qji.b bVarU2 = merchantPermissionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.di.MerchantPermissionsScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        MerchantPermissionsScreenContract$InputData merchantPermissionsScreenContract$InputData = merchantPermissionsScreen.K;
                        merchantPermissionsScreenContract$InputData.getClass();
                        return new c0(q0Var, cVar2, merchantPermissionsScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantPermissionsScreen f255717b;

            {
                this.f255717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MerchantPermissionsScreen merchantPermissionsScreen = this.f255717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MerchantPermissionsScreen.S;
                        return (d) ((c0) merchantPermissionsScreen.R.getValue()).f195910c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MerchantPermissionsScreen.S;
                        MerchantPermissionsScreen merchantPermissionsScreen2 = this.f255717b;
                        return dli.f.a(merchantPermissionsScreen2, merchantPermissionsScreen2.d(), v.k(new FullScreenStateDelegate(), merchantPermissionsScreen2.M, merchantPermissionsScreen2.N), R$id.merchantConsentScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MerchantPermissionsScreen.S;
                        qji.b bVarU2 = merchantPermissionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.di.MerchantPermissionsScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        MerchantPermissionsScreenContract$InputData merchantPermissionsScreenContract$InputData = merchantPermissionsScreen.K;
                        merchantPermissionsScreenContract$InputData.getClass();
                        return new c0(q0Var, cVar2, merchantPermissionsScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f115679b.setModel(uiState.f255722b);
        NavBarWithBigTile navBarWithBigTile = d3().f115680c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        e eVar = uiState.f255721a;
        TextLocalisedClause textLocalisedClause = eVar.f255718a;
        navBarWithBigTile.setToolbarTitle(textLocalisedClause);
        navBarWithBigTile.setTitle(textLocalisedClause);
        navBarWithBigTile.setDescription(eVar.f255719b);
        au0.q0 q0Var = eVar.f255720c;
        if (q0Var != null) {
            navBarWithBigTile.setDuoAvatar(q0Var, r0.DEFAULT);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f115680c.f59357t), new rnl.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f115679b.f), new rnl.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f115679b.f58955g), new rnl.c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new d(this, null, 10), 3);
    }

    public final r d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rnl.d d() {
        return (rnl.d) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
