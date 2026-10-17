package com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u6h.b;
import u6h.f;
import u6h.g;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/margin_status_info/MarginStatusInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu6h/f;", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarginStatusInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(MarginStatusInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final MarginStatusInfoScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public MarginStatusInfoScreen(MarginStatusInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: u6h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarginStatusInfoScreen f277593b;

            {
                this.f277593b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MarginStatusInfoScreen marginStatusInfoScreen = this.f277593b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MarginStatusInfoScreen.Q;
                        MarginStatusInfoScreen marginStatusInfoScreen2 = this.f277593b;
                        return dli.f.a(marginStatusInfoScreen2, (g) marginStatusInfoScreen2.P.getValue(), u.c(new PlainTextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = MarginStatusInfoScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(marginStatusInfoScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        MarginStatusInfoScreenContract$InputData marginStatusInfoScreenContract$InputData = marginStatusInfoScreen.K;
                        marginStatusInfoScreenContract$InputData.getClass();
                        return new f6h.a(cVar, marginStatusInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MarginStatusInfoScreen.Q;
                        return (g) ((f6h.a) marginStatusInfoScreen.O.getValue()).f132426b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: u6h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarginStatusInfoScreen f277593b;

            {
                this.f277593b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MarginStatusInfoScreen marginStatusInfoScreen = this.f277593b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarginStatusInfoScreen.Q;
                        MarginStatusInfoScreen marginStatusInfoScreen2 = this.f277593b;
                        return dli.f.a(marginStatusInfoScreen2, (g) marginStatusInfoScreen2.P.getValue(), u.c(new PlainTextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = MarginStatusInfoScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(marginStatusInfoScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        MarginStatusInfoScreenContract$InputData marginStatusInfoScreenContract$InputData = marginStatusInfoScreen.K;
                        marginStatusInfoScreenContract$InputData.getClass();
                        return new f6h.a(cVar, marginStatusInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MarginStatusInfoScreen.Q;
                        return (g) ((f6h.a) marginStatusInfoScreen.O.getValue()).f132426b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: u6h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarginStatusInfoScreen f277593b;

            {
                this.f277593b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MarginStatusInfoScreen marginStatusInfoScreen = this.f277593b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarginStatusInfoScreen.Q;
                        MarginStatusInfoScreen marginStatusInfoScreen2 = this.f277593b;
                        return dli.f.a(marginStatusInfoScreen2, (g) marginStatusInfoScreen2.P.getValue(), u.c(new PlainTextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = MarginStatusInfoScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(marginStatusInfoScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        MarginStatusInfoScreenContract$InputData marginStatusInfoScreenContract$InputData = marginStatusInfoScreen.K;
                        marginStatusInfoScreenContract$InputData.getClass();
                        return new f6h.a(cVar, marginStatusInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MarginStatusInfoScreen.Q;
                        return (g) ((f6h.a) marginStatusInfoScreen.O.getValue()).f132426b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f277597b.f277595a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f6h.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new u07.b(this, null, 11), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
