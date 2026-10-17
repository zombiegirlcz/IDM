package com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import uxe.l;
import v4h.f;
import v4h.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/ratings/credit_quality/CreditQualityScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lv4h/g;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditQualityScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditQualityScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CreditQualityScreenContract$InputData K;
    public final int L;
    public final h M;
    public final ListSubheaderDelegate N;
    public final RowDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CreditQualityScreen(CreditQualityScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, v4h.b.f);
        this.N = new ListSubheaderDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: v4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditQualityScreen f286092b;

            {
                this.f286092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditQualityScreen creditQualityScreen = this.f286092b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditQualityScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditQualityScreen.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        CreditQualityScreenContract$InputData creditQualityScreenContract$InputData = creditQualityScreen.K;
                        creditQualityScreenContract$InputData.getClass();
                        return new z3h.a(gVar, creditQualityScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditQualityScreen.S;
                        return (f) ((z3h.a) creditQualityScreen.P.getValue()).f319264b.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditQualityScreen.S;
                        CreditQualityScreen creditQualityScreen2 = this.f286092b;
                        return tki.g.a(creditQualityScreen2, (f) creditQualityScreen2.Q.getValue(), v.k(creditQualityScreen2.N, creditQualityScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: v4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditQualityScreen f286092b;

            {
                this.f286092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditQualityScreen creditQualityScreen = this.f286092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditQualityScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditQualityScreen.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        CreditQualityScreenContract$InputData creditQualityScreenContract$InputData = creditQualityScreen.K;
                        creditQualityScreenContract$InputData.getClass();
                        return new z3h.a(gVar, creditQualityScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditQualityScreen.S;
                        return (f) ((z3h.a) creditQualityScreen.P.getValue()).f319264b.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditQualityScreen.S;
                        CreditQualityScreen creditQualityScreen2 = this.f286092b;
                        return tki.g.a(creditQualityScreen2, (f) creditQualityScreen2.Q.getValue(), v.k(creditQualityScreen2.N, creditQualityScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: v4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditQualityScreen f286092b;

            {
                this.f286092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditQualityScreen creditQualityScreen = this.f286092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditQualityScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditQualityScreen.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        CreditQualityScreenContract$InputData creditQualityScreenContract$InputData = creditQualityScreen.K;
                        creditQualityScreenContract$InputData.getClass();
                        return new z3h.a(gVar, creditQualityScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditQualityScreen.S;
                        return (f) ((z3h.a) creditQualityScreen.P.getValue()).f319264b.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditQualityScreen.S;
                        CreditQualityScreen creditQualityScreen2 = this.f286092b;
                        return tki.g.a(creditQualityScreen2, (f) creditQualityScreen2.Q.getValue(), v.k(creditQualityScreen2.N, creditQualityScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f286095a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
        d3().f174539b.setSecondDescriptionVisible(true);
        d3().f174539b.setSecondDescriptionText(uiState.f286096b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z3h.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new l(this, null, 8), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53224q), new v4h.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
