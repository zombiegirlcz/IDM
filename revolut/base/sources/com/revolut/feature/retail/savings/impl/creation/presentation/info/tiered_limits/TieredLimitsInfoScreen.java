package com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreenContract$InputData;
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
import rlb.l;
import te0.w;
import tx0.j0;
import vc.s;
import vge.z1;
import vmb.b;
import vmb.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/info/tiered_limits/TieredLimitsInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvmb/d;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TieredLimitsInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TieredLimitsInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TieredLimitsInfoScreenContract$InputData K;
    public final h L;
    public final boolean M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TieredLimitsInfoScreen(TieredLimitsInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = true;
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TieredLimitsInfoScreen f290550b;

            {
                this.f290550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TieredLimitsInfoScreen tieredLimitsInfoScreen = this.f290550b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TieredLimitsInfoScreen.R;
                        return (e) ((l) tieredLimitsInfoScreen.P.getValue()).f255008b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TieredLimitsInfoScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(tieredLimitsInfoScreen.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        TieredLimitsInfoScreenContract$InputData tieredLimitsInfoScreenContract$InputData = tieredLimitsInfoScreen.K;
                        tieredLimitsInfoScreenContract$InputData.getClass();
                        return new l(eVar, tieredLimitsInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TieredLimitsInfoScreen.R;
                        TieredLimitsInfoScreen tieredLimitsInfoScreen2 = this.f290550b;
                        return dli.f.a(tieredLimitsInfoScreen2, (e) tieredLimitsInfoScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate(), new PlainTextDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TieredLimitsInfoScreen f290550b;

            {
                this.f290550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TieredLimitsInfoScreen tieredLimitsInfoScreen = this.f290550b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TieredLimitsInfoScreen.R;
                        return (e) ((l) tieredLimitsInfoScreen.P.getValue()).f255008b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TieredLimitsInfoScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(tieredLimitsInfoScreen.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        TieredLimitsInfoScreenContract$InputData tieredLimitsInfoScreenContract$InputData = tieredLimitsInfoScreen.K;
                        tieredLimitsInfoScreenContract$InputData.getClass();
                        return new l(eVar, tieredLimitsInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TieredLimitsInfoScreen.R;
                        TieredLimitsInfoScreen tieredLimitsInfoScreen2 = this.f290550b;
                        return dli.f.a(tieredLimitsInfoScreen2, (e) tieredLimitsInfoScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate(), new PlainTextDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TieredLimitsInfoScreen f290550b;

            {
                this.f290550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TieredLimitsInfoScreen tieredLimitsInfoScreen = this.f290550b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TieredLimitsInfoScreen.R;
                        return (e) ((l) tieredLimitsInfoScreen.P.getValue()).f255008b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TieredLimitsInfoScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(tieredLimitsInfoScreen.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        TieredLimitsInfoScreenContract$InputData tieredLimitsInfoScreenContract$InputData = tieredLimitsInfoScreen.K;
                        tieredLimitsInfoScreenContract$InputData.getClass();
                        return new l(eVar, tieredLimitsInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TieredLimitsInfoScreen.R;
                        TieredLimitsInfoScreen tieredLimitsInfoScreen2 = this.f290550b;
                        return dli.f.a(tieredLimitsInfoScreen2, (e) tieredLimitsInfoScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate(), new PlainTextDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
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
        return (l) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vmb.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.savings_high_balance_rate_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new z1(this, null, 7), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
