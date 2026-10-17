package com.revolut.feature.standingordertopup.impl.ui.screen.payment_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.standingordertopup.impl.ui.screen.payment_details.AutoTopUpPaymentDetailsScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.payment_details.AutoTopUpPaymentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uwe.f;
import uxd.b;
import uxd.c;
import uxd.e;
import vc.s;
import yy0.i;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/screen/payment_details/AutoTopUpPaymentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luxd/e;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoTopUpPaymentDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AutoTopUpPaymentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AutoTopUpPaymentDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AutoTopUpPaymentDetailsScreen(AutoTopUpPaymentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: uxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoTopUpPaymentDetailsScreen f283977b;

            {
                this.f283977b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AutoTopUpPaymentDetailsScreen autoTopUpPaymentDetailsScreen = this.f283977b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AutoTopUpPaymentDetailsScreen.Q;
                        return (h) ((jxd.c) autoTopUpPaymentDetailsScreen.O.getValue()).f179144c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AutoTopUpPaymentDetailsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(autoTopUpPaymentDetailsScreen.m2()).a().get(jxd.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jxd.f.class, " is not found"));
                        }
                        jxd.f fVar = ((jxd.f) aVar2.b()).i;
                        AutoTopUpPaymentDetailsScreenContract$InputData autoTopUpPaymentDetailsScreenContract$InputData = autoTopUpPaymentDetailsScreen.K;
                        autoTopUpPaymentDetailsScreenContract$InputData.getClass();
                        return new jxd.c(fVar, autoTopUpPaymentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AutoTopUpPaymentDetailsScreen.Q;
                        AutoTopUpPaymentDetailsScreen autoTopUpPaymentDetailsScreen2 = this.f283977b;
                        return dli.f.a(autoTopUpPaymentDetailsScreen2, (h) autoTopUpPaymentDetailsScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsChevronDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: uxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoTopUpPaymentDetailsScreen f283977b;

            {
                this.f283977b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AutoTopUpPaymentDetailsScreen autoTopUpPaymentDetailsScreen = this.f283977b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AutoTopUpPaymentDetailsScreen.Q;
                        return (h) ((jxd.c) autoTopUpPaymentDetailsScreen.O.getValue()).f179144c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AutoTopUpPaymentDetailsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(autoTopUpPaymentDetailsScreen.m2()).a().get(jxd.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jxd.f.class, " is not found"));
                        }
                        jxd.f fVar = ((jxd.f) aVar2.b()).i;
                        AutoTopUpPaymentDetailsScreenContract$InputData autoTopUpPaymentDetailsScreenContract$InputData = autoTopUpPaymentDetailsScreen.K;
                        autoTopUpPaymentDetailsScreenContract$InputData.getClass();
                        return new jxd.c(fVar, autoTopUpPaymentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AutoTopUpPaymentDetailsScreen.Q;
                        AutoTopUpPaymentDetailsScreen autoTopUpPaymentDetailsScreen2 = this.f283977b;
                        return dli.f.a(autoTopUpPaymentDetailsScreen2, (h) autoTopUpPaymentDetailsScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsChevronDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: uxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoTopUpPaymentDetailsScreen f283977b;

            {
                this.f283977b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AutoTopUpPaymentDetailsScreen autoTopUpPaymentDetailsScreen = this.f283977b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AutoTopUpPaymentDetailsScreen.Q;
                        return (h) ((jxd.c) autoTopUpPaymentDetailsScreen.O.getValue()).f179144c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AutoTopUpPaymentDetailsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(autoTopUpPaymentDetailsScreen.m2()).a().get(jxd.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jxd.f.class, " is not found"));
                        }
                        jxd.f fVar = ((jxd.f) aVar2.b()).i;
                        AutoTopUpPaymentDetailsScreenContract$InputData autoTopUpPaymentDetailsScreenContract$InputData = autoTopUpPaymentDetailsScreen.K;
                        autoTopUpPaymentDetailsScreenContract$InputData.getClass();
                        return new jxd.c(fVar, autoTopUpPaymentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AutoTopUpPaymentDetailsScreen.Q;
                        AutoTopUpPaymentDetailsScreen autoTopUpPaymentDetailsScreen2 = this.f283977b;
                        return dli.f.a(autoTopUpPaymentDetailsScreen2, (h) autoTopUpPaymentDetailsScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsChevronDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        c cVar = uiState.f283983b;
        MoneyClause moneyClause = cVar.f283978a;
        Image image = cVar.f283980c;
        if (image != null) {
            l.Companion.getClass();
            navBarWithToolbar.setEndImage(i.a(image));
        }
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(cVar.f283979b);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (jxd.c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uxd.h) this.N.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new f(this, null, 2), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
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
        return (dli.c) this.P.getValue();
    }
}
