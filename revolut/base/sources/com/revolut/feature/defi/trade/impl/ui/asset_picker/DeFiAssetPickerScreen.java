package com.revolut.feature.defi.trade.impl.ui.asset_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.trade.impl.R$string;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerContract$InputData;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import r66.a;
import te0.w;
import vc.s;
import y4f.c;
import y66.b;
import y66.e;
import y66.f;
import y66.g;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/trade/impl/ui/asset_picker/DeFiAssetPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr66/a;", "Ldli/a;", "Ly66/c;", "Companion", "a", "feature_defi_trade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiAssetPickerScreen extends ViewController<a> implements dli.a {
    public final DeFiAssetPickerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public v O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DeFiAssetPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DeFiAssetPickerScreen(DeFiAssetPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, e.f);
        this.M = w.y0(new c(14));
        this.N = w.y0(new c(15));
        this.P = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: y66.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetPickerScreen f311187b;

            {
                this.f311187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiAssetPickerScreen deFiAssetPickerScreen = this.f311187b;
                switch (i2) {
                    case 0:
                        DeFiAssetPickerScreen.Companion companion = DeFiAssetPickerScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(deFiAssetPickerScreen.m2()).a().get(w66.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w66.e.class, " is not found"));
                        }
                        w66.e eVar = ((w66.e) aVar2.b()).f;
                        DeFiAssetPickerContract$InputData deFiAssetPickerContract$InputData = deFiAssetPickerScreen.K;
                        deFiAssetPickerContract$InputData.getClass();
                        return new w66.c(eVar, deFiAssetPickerContract$InputData);
                    case 1:
                        DeFiAssetPickerScreen.Companion companion2 = DeFiAssetPickerScreen.INSTANCE;
                        return (b) ((w66.c) deFiAssetPickerScreen.Q.getValue()).f295396c.get();
                    default:
                        DeFiAssetPickerScreen.Companion companion3 = DeFiAssetPickerScreen.INSTANCE;
                        DeFiAssetPickerScreen deFiAssetPickerScreen2 = this.f311187b;
                        return dli.f.a(deFiAssetPickerScreen2, deFiAssetPickerScreen2.h3(), zhm.v.k((RowDelegate) deFiAssetPickerScreen2.M.getValue(), (FullScreenStateDelegate) deFiAssetPickerScreen2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: y66.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetPickerScreen f311187b;

            {
                this.f311187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiAssetPickerScreen deFiAssetPickerScreen = this.f311187b;
                switch (i22) {
                    case 0:
                        DeFiAssetPickerScreen.Companion companion = DeFiAssetPickerScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(deFiAssetPickerScreen.m2()).a().get(w66.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w66.e.class, " is not found"));
                        }
                        w66.e eVar = ((w66.e) aVar2.b()).f;
                        DeFiAssetPickerContract$InputData deFiAssetPickerContract$InputData = deFiAssetPickerScreen.K;
                        deFiAssetPickerContract$InputData.getClass();
                        return new w66.c(eVar, deFiAssetPickerContract$InputData);
                    case 1:
                        DeFiAssetPickerScreen.Companion companion2 = DeFiAssetPickerScreen.INSTANCE;
                        return (b) ((w66.c) deFiAssetPickerScreen.Q.getValue()).f295396c.get();
                    default:
                        DeFiAssetPickerScreen.Companion companion3 = DeFiAssetPickerScreen.INSTANCE;
                        DeFiAssetPickerScreen deFiAssetPickerScreen2 = this.f311187b;
                        return dli.f.a(deFiAssetPickerScreen2, deFiAssetPickerScreen2.h3(), zhm.v.k((RowDelegate) deFiAssetPickerScreen2.M.getValue(), (FullScreenStateDelegate) deFiAssetPickerScreen2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: y66.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetPickerScreen f311187b;

            {
                this.f311187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiAssetPickerScreen deFiAssetPickerScreen = this.f311187b;
                switch (i22) {
                    case 0:
                        DeFiAssetPickerScreen.Companion companion = DeFiAssetPickerScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(deFiAssetPickerScreen.m2()).a().get(w66.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w66.e.class, " is not found"));
                        }
                        w66.e eVar = ((w66.e) aVar2.b()).f;
                        DeFiAssetPickerContract$InputData deFiAssetPickerContract$InputData = deFiAssetPickerScreen.K;
                        deFiAssetPickerContract$InputData.getClass();
                        return new w66.c(eVar, deFiAssetPickerContract$InputData);
                    case 1:
                        DeFiAssetPickerScreen.Companion companion2 = DeFiAssetPickerScreen.INSTANCE;
                        return (b) ((w66.c) deFiAssetPickerScreen.Q.getValue()).f295396c.get();
                    default:
                        DeFiAssetPickerScreen.Companion companion3 = DeFiAssetPickerScreen.INSTANCE;
                        DeFiAssetPickerScreen deFiAssetPickerScreen2 = this.f311187b;
                        return dli.f.a(deFiAssetPickerScreen2, deFiAssetPickerScreen2.h3(), zhm.v.k((RowDelegate) deFiAssetPickerScreen2.M.getValue(), (FullScreenStateDelegate) deFiAssetPickerScreen2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((y66.c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w66.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = true;
        Clause clause = this.K.d;
        if (clause != null) {
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
        } else {
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_defi_sell_to_asset_main_title, null, null, 14));
            navBarWithToolbar.j0(false);
        }
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.O;
        if (vVar != null) {
            d3().f174540c.removeOnScrollListener(vVar);
        }
        this.O = null;
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new xv4.o(this, (Continuation) null, 26), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57336l), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new y66.h(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.O = y.a(recyclerView, 50, false, new y1.a(this, 20));
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b R2() {
        return (b) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
