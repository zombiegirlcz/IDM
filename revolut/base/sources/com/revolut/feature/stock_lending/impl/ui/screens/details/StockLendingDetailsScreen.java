package com.revolut.feature.stock_lending.impl.ui.screens.details;

import a1e.d;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.stock_lending.impl.ui.screens.details.StockLendingDetailsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import hwi.l0;
import i1e.c;
import i1e.k;
import i1e.l;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/screens/details/StockLendingDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Li1e/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Li1e/l;", "<init>", "()V", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingDetailsScreen extends BaseRecyclerViewScreen<k, IOData$EmptyInput, q> implements l {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88403h0 = {o0.f186429a.j(new h0(StockLendingDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final boolean V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f88404a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f88405b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f88406d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f88407e0;
    public final Object f0;
    public final Object g0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public StockLendingDetailsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, a.f);
        this.V = true;
        this.W = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: i1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingDetailsScreen f157615b;

            {
                this.f157615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockLendingDetailsScreen stockLendingDetailsScreen = this.f157615b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockLendingDetailsScreen.f88403h0;
                        StockLendingDetailsScreen stockLendingDetailsScreen2 = this.f157615b;
                        phm.a aVar = (phm.a) ue0.e.j(stockLendingDetailsScreen2.m2()).a().get(u0e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new a1e.d(((a1e.b) aVar2.b()).f595l, new o0h.b(), new o0h.a(), stockLendingDetailsScreen2, stockLendingDetailsScreen2);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", u0e.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StockLendingDetailsScreen.f88403h0;
                        return (h) ((a1e.d) stockLendingDetailsScreen.X.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = StockLendingDetailsScreen.f88403h0;
                        return v.k((TextDelegate) stockLendingDetailsScreen.Z.getValue(), (RowDelegate) stockLendingDetailsScreen.f88404a0.getValue(), (CellDetailsChevronDelegate) stockLendingDetailsScreen.f88405b0.getValue(), (FullScreenStateDelegate) stockLendingDetailsScreen.c0.getValue(), (RowLoadingDelegate) stockLendingDetailsScreen.f88406d0.getValue(), (ListSubheaderDelegate) stockLendingDetailsScreen.f88407e0.getValue(), (CounterTextDelegate) stockLendingDetailsScreen.f0.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: i1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingDetailsScreen f157615b;

            {
                this.f157615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockLendingDetailsScreen stockLendingDetailsScreen = this.f157615b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockLendingDetailsScreen.f88403h0;
                        StockLendingDetailsScreen stockLendingDetailsScreen2 = this.f157615b;
                        phm.a aVar = (phm.a) ue0.e.j(stockLendingDetailsScreen2.m2()).a().get(u0e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new a1e.d(((a1e.b) aVar2.b()).f595l, new o0h.b(), new o0h.a(), stockLendingDetailsScreen2, stockLendingDetailsScreen2);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", u0e.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StockLendingDetailsScreen.f88403h0;
                        return (h) ((a1e.d) stockLendingDetailsScreen.X.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = StockLendingDetailsScreen.f88403h0;
                        return v.k((TextDelegate) stockLendingDetailsScreen.Z.getValue(), (RowDelegate) stockLendingDetailsScreen.f88404a0.getValue(), (CellDetailsChevronDelegate) stockLendingDetailsScreen.f88405b0.getValue(), (FullScreenStateDelegate) stockLendingDetailsScreen.c0.getValue(), (RowLoadingDelegate) stockLendingDetailsScreen.f88406d0.getValue(), (ListSubheaderDelegate) stockLendingDetailsScreen.f88407e0.getValue(), (CounterTextDelegate) stockLendingDetailsScreen.f0.getValue());
                }
            }
        });
        this.Z = w.y0(new hzl.a(5));
        this.f88404a0 = w.y0(new hzl.a(6));
        this.f88405b0 = w.y0(new hzl.a(7));
        this.c0 = w.y0(new hzl.a(8));
        this.f88406d0 = w.y0(new hzl.a(9));
        this.f88407e0 = w.y0(new hzl.a(10));
        this.f0 = w.y0(new hzl.a(11));
        final int i3 = 2;
        this.g0 = w.y0(new Function0(this) { // from class: i1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingDetailsScreen f157615b;

            {
                this.f157615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockLendingDetailsScreen stockLendingDetailsScreen = this.f157615b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockLendingDetailsScreen.f88403h0;
                        StockLendingDetailsScreen stockLendingDetailsScreen2 = this.f157615b;
                        phm.a aVar = (phm.a) ue0.e.j(stockLendingDetailsScreen2.m2()).a().get(u0e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new a1e.d(((a1e.b) aVar2.b()).f595l, new o0h.b(), new o0h.a(), stockLendingDetailsScreen2, stockLendingDetailsScreen2);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", u0e.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StockLendingDetailsScreen.f88403h0;
                        return (h) ((a1e.d) stockLendingDetailsScreen.X.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = StockLendingDetailsScreen.f88403h0;
                        return v.k((TextDelegate) stockLendingDetailsScreen.Z.getValue(), (RowDelegate) stockLendingDetailsScreen.f88404a0.getValue(), (CellDetailsChevronDelegate) stockLendingDetailsScreen.f88405b0.getValue(), (FullScreenStateDelegate) stockLendingDetailsScreen.c0.getValue(), (RowLoadingDelegate) stockLendingDetailsScreen.f88406d0.getValue(), (ListSubheaderDelegate) stockLendingDetailsScreen.f88407e0.getValue(), (CounterTextDelegate) stockLendingDetailsScreen.f0.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i1e.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new l0(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CellDetailsChevronDelegate) this.f88405b0.getValue()).f51821c), null, new i1e.b(2, 4, i1e.h.class, (i1e.h) this.Y.getValue(), "onCellDetailsChevronClicked", "onCellDetailsChevronClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ListSubheaderDelegate) this.f88407e0.getValue()).f52707c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.f88404a0.getValue()).f53218h), null, new i1e.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.c0.getValue()).f52371h.f121375b), null, new i1e.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75638b0() {
        return (List) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f157619a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f157620b);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final m h3() {
        ViewBinding value = this.U.getValue(this, f88403h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // n0h.a
    public final r m0() {
        return ((TextDelegate) this.Z.getValue()).d;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
