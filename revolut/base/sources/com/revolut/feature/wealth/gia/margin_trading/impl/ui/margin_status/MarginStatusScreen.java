package com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.MarginChartDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$id;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$layout;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s56.i;
import s6h.b;
import s6h.f;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/margin_status/MarginStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Ls6h/j;", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarginStatusScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(MarginStatusScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/gia/margin_trading/impl/databinding/ScreenMarginStatusBinding;", 0))};
    public final MarginStatusScreenContract$InputData K;
    public final FullScreenStateDelegate L;
    public final CellDetailsChevronDelegate M;
    public final h N;
    public final int O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public MarginStatusScreen(MarginStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        this.M = new CellDetailsChevronDelegate();
        this.N = s.t(this, b.f);
        this.O = R$style.UiKitTheme_Mono;
        this.P = R$layout.screen_margin_status;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: s6h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarginStatusScreen f260345b;

            {
                this.f260345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MarginStatusScreen marginStatusScreen = this.f260345b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MarginStatusScreen.T;
                        MarginStatusScreen marginStatusScreen2 = this.f260345b;
                        return tki.g.a(marginStatusScreen2, (f) marginStatusScreen2.S.getValue(), v.k(marginStatusScreen2.L, new MarginChartDelegate(), marginStatusScreen2.M, new CellDetailsLoadingDelegate()), R$id.marginStatus_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MarginStatusScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(marginStatusScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        MarginStatusScreenContract$InputData marginStatusScreenContract$InputData = marginStatusScreen.K;
                        marginStatusScreenContract$InputData.getClass();
                        return new f6h.b(cVar, marginStatusScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MarginStatusScreen.T;
                        return (f) ((f6h.b) marginStatusScreen.R.getValue()).f132428b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: s6h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarginStatusScreen f260345b;

            {
                this.f260345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MarginStatusScreen marginStatusScreen = this.f260345b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarginStatusScreen.T;
                        MarginStatusScreen marginStatusScreen2 = this.f260345b;
                        return tki.g.a(marginStatusScreen2, (f) marginStatusScreen2.S.getValue(), v.k(marginStatusScreen2.L, new MarginChartDelegate(), marginStatusScreen2.M, new CellDetailsLoadingDelegate()), R$id.marginStatus_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MarginStatusScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(marginStatusScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        MarginStatusScreenContract$InputData marginStatusScreenContract$InputData = marginStatusScreen.K;
                        marginStatusScreenContract$InputData.getClass();
                        return new f6h.b(cVar, marginStatusScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MarginStatusScreen.T;
                        return (f) ((f6h.b) marginStatusScreen.R.getValue()).f132428b.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: s6h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarginStatusScreen f260345b;

            {
                this.f260345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MarginStatusScreen marginStatusScreen = this.f260345b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarginStatusScreen.T;
                        MarginStatusScreen marginStatusScreen2 = this.f260345b;
                        return tki.g.a(marginStatusScreen2, (f) marginStatusScreen2.S.getValue(), v.k(marginStatusScreen2.L, new MarginChartDelegate(), marginStatusScreen2.M, new CellDetailsLoadingDelegate()), R$id.marginStatus_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MarginStatusScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(marginStatusScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        MarginStatusScreenContract$InputData marginStatusScreenContract$InputData = marginStatusScreen.K;
                        marginStatusScreenContract$InputData.getClass();
                        return new f6h.b(cVar, marginStatusScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MarginStatusScreen.T;
                        return (f) ((f6h.b) marginStatusScreen.R.getValue()).f132428b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.O);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // cli.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(cli.o r4, cli.q r5) {
        /*
            r3 = this;
            s6h.j r4 = (s6h.j) r4
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            dli.a.z0(r4)
            r0 = 1
            if (r5 == 0) goto L1b
            boolean r1 = r5 instanceof s6h.e
            if (r1 == 0) goto L14
            s6h.e r5 = (s6h.e) r5
            goto L15
        L14:
            r5 = 0
        L15:
            if (r5 == 0) goto L26
            boolean r5 = r5.f260347a
            if (r5 != r0) goto L26
        L1b:
            d6h.a r5 = r3.d3()
            com.revolut.core.ui_kit.background.AnimatedBackgroundView r5 = r5.f111545b
            com.revolut.core.ui_kit.background.AnimatedBackgroundType r1 = r4.f260353c
            r5.setBackgroundType(r1)
        L26:
            s6h.i r4 = r4.f260352b
            if (r4 == 0) goto L64
            d6h.a r5 = r3.d3()
            com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar r5 = r5.f111546c
            java.lang.String r1 = "marginStatusNavBarWithToolbar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            boolean r1 = r4 instanceof s6h.g
            if (r1 == 0) goto L3d
            r5.setLoadingVisible(r0)
            goto L56
        L3d:
            boolean r1 = r4 instanceof s6h.h
            if (r1 == 0) goto L5e
            r1 = 0
            r5.setLoadingVisible(r1)
            r2 = r4
            s6h.h r2 = (s6h.h) r2
            com.revolut.core.ui_kit.models.Clause r2 = r2.f260349a
            if (r2 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r1
        L4e:
            r5.setSecondDescriptionVisible(r0)
            if (r2 == 0) goto L56
            r5.setSecondDescriptionText(r2)
        L56:
            java.util.List r4 = r4.a()
            r5.setMenuItems(r4)
            return
        L5e:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreen.B(cli.o, cli.q):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f6h.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar marginStatusNavBarWithToolbar = d3().f111546c;
        Intrinsics.checkNotNullExpressionValue(marginStatusNavBarWithToolbar, "marginStatusNavBarWithToolbar");
        marginStatusNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_trading_margin_status_header_title, null, null, 14), null);
        marginStatusNavBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_trading_margin_status_header_title, null, null, 14));
        marginStatusNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f111546c.f59410q), new s1k.b(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(d3().f111546c.o.f57403b), new i(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51821c), new s6h.c(this, null), 3);
    }

    public final d6h.a d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d6h.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
