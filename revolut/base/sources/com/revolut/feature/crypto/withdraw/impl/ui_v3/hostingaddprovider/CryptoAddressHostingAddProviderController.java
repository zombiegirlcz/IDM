package com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ok7.b;
import oq5.c;
import oq5.d;
import oq5.f;
import oq5.g;
import te0.w;
import vc.s;
import xf6.a1;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingaddprovider/CryptoAddressHostingAddProviderController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loq5/c;", "Ldli/a;", "Loq5/d;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAddressHostingAddProviderController extends ViewController<c> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoAddressHostingAddProviderController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object O;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final Object P = w.y0(new b(26));
    public final Object Q = w.y0(new b(27));
    public final Object R = w.y0(new b(28));

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public CryptoAddressHostingAddProviderController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: oq5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingAddProviderController f227748b;

            {
                this.f227748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController = this.f227748b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAddressHostingAddProviderController.S;
                        qji.b bVarU2 = cryptoAddressHostingAddProviderController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.di.CryptoAddressHostingAddProviderControllerComponentInjector");
                        yo5.q qVar = new yo5.q();
                        int i6 = 26;
                        qVar.f315574a = e4m.b.b(new a1(qVar, i3, i6));
                        qVar.f315575b = e4m.b.b(new a1(qVar, i5, i6));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAddressHostingAddProviderController.S;
                        return (b) ((yo5.q) cryptoAddressHostingAddProviderController.M.getValue()).f315575b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoAddressHostingAddProviderController.S;
                        int i21 = R$id.recyclerView;
                        CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController2 = this.f227748b;
                        return dli.f.a(cryptoAddressHostingAddProviderController2, cryptoAddressHostingAddProviderController2.d(), v.k((InputTextDelegate) cryptoAddressHostingAddProviderController2.Q.getValue(), (InputChecklistDelegate) cryptoAddressHostingAddProviderController2.R.getValue(), (ListSubheaderDelegate) cryptoAddressHostingAddProviderController2.P.getValue(), new RowLoadingDelegate()), i21, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: oq5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingAddProviderController f227748b;

            {
                this.f227748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController = this.f227748b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAddressHostingAddProviderController.S;
                        qji.b bVarU2 = cryptoAddressHostingAddProviderController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.di.CryptoAddressHostingAddProviderControllerComponentInjector");
                        yo5.q qVar = new yo5.q();
                        int i6 = 26;
                        qVar.f315574a = e4m.b.b(new a1(qVar, i3, i6));
                        qVar.f315575b = e4m.b.b(new a1(qVar, i5, i6));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAddressHostingAddProviderController.S;
                        return (b) ((yo5.q) cryptoAddressHostingAddProviderController.M.getValue()).f315575b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoAddressHostingAddProviderController.S;
                        int i21 = R$id.recyclerView;
                        CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController2 = this.f227748b;
                        return dli.f.a(cryptoAddressHostingAddProviderController2, cryptoAddressHostingAddProviderController2.d(), v.k((InputTextDelegate) cryptoAddressHostingAddProviderController2.Q.getValue(), (InputChecklistDelegate) cryptoAddressHostingAddProviderController2.R.getValue(), (ListSubheaderDelegate) cryptoAddressHostingAddProviderController2.P.getValue(), new RowLoadingDelegate()), i21, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: oq5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingAddProviderController f227748b;

            {
                this.f227748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController = this.f227748b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAddressHostingAddProviderController.S;
                        qji.b bVarU2 = cryptoAddressHostingAddProviderController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.di.CryptoAddressHostingAddProviderControllerComponentInjector");
                        yo5.q qVar = new yo5.q();
                        int i6 = 26;
                        qVar.f315574a = e4m.b.b(new a1(qVar, i32, i6));
                        qVar.f315575b = e4m.b.b(new a1(qVar, i5, i6));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAddressHostingAddProviderController.S;
                        return (b) ((yo5.q) cryptoAddressHostingAddProviderController.M.getValue()).f315575b.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoAddressHostingAddProviderController.S;
                        int i21 = R$id.recyclerView;
                        CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController2 = this.f227748b;
                        return dli.f.a(cryptoAddressHostingAddProviderController2, cryptoAddressHostingAddProviderController2.d(), v.k((InputTextDelegate) cryptoAddressHostingAddProviderController2.Q.getValue(), (InputChecklistDelegate) cryptoAddressHostingAddProviderController2.R.getValue(), (ListSubheaderDelegate) cryptoAddressHostingAddProviderController2.P.getValue(), new RowLoadingDelegate()), i21, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f227746b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yo5.q) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitleVisible(true);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        d3().f174564b.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new ocb.d(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.Q.getValue()).e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.P.getValue()).d), new g(view, this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) this.R.getValue()).f52518c), new oq5.h(view, this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new oli.f(view, this, continuation, 15), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final oq5.b d() {
        return (oq5.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
