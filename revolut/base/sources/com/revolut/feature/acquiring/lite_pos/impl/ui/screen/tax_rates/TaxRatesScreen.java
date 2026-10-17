package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.TaxRatesScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ff1.c;
import ff1.d;
import ff1.f;
import ff1.i;
import java.util.List;
import jd1.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import l9f.z;
import ld1.p;
import ld1.x;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/tax_rates/TaxRatesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lff1/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lff1/f;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxRatesScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, f> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60842d0 = {o0.f186429a.j(new h0(TaxRatesScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenTaxRatesBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListSubheaderDelegate f60843a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f60844b0;
    public final List c0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, o.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenTaxRatesBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.taxRatesScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.taxRatesScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new o((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TaxRatesScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_tax_rates;
        this.V = R$id.taxRatesScreen_recyclerView;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ff1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxRatesScreen f134691b;

            {
                this.f134691b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxRatesScreen taxRatesScreen = this.f134691b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxRatesScreen.f60842d0;
                        qji.b bVarQ2 = taxRatesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.di.TaxRatesScreenInjector");
                        ld1.l lVar = ((p) bVarQ2).f193985a;
                        x xVar = new x();
                        int i3 = 14;
                        xVar.f194009a = e4m.b.b(new z(lVar, xVar, 1, i3));
                        xVar.f194010b = e4m.b.b(new z(lVar, xVar, 0, i3));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr2 = TaxRatesScreen.f60842d0;
                        return (h) ((x) taxRatesScreen.X.getValue()).f194010b.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ff1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxRatesScreen f134691b;

            {
                this.f134691b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxRatesScreen taxRatesScreen = this.f134691b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxRatesScreen.f60842d0;
                        qji.b bVarQ2 = taxRatesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.di.TaxRatesScreenInjector");
                        ld1.l lVar = ((p) bVarQ2).f193985a;
                        x xVar = new x();
                        int i3 = 14;
                        xVar.f194009a = e4m.b.b(new z(lVar, xVar, 1, i3));
                        xVar.f194010b = e4m.b.b(new z(lVar, xVar, 0, i3));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr2 = TaxRatesScreen.f60842d0;
                        return (h) ((x) taxRatesScreen.X.getValue()).f194010b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.f60843a0 = listSubheaderDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f60844b0 = fullScreenStateDelegate;
        this.c0 = v.k(rowDelegate, listSubheaderDelegate, fullScreenStateDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (x) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ff1.h) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f60842d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((o) value).f172944b.f59410q), null, new ev7.b(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f60843a0.f52707c), null, new ff1.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f60844b0.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53218h), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f60842d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((o) value).f172944b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.U;
    }
}
