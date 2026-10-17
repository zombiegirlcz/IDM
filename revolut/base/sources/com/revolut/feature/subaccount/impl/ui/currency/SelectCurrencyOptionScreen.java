package com.revolut.feature.subaccount.impl.ui.currency;

import a32.g;
import a8e.e;
import a8e.h;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.subaccount.impl.R$id;
import com.revolut.feature.subaccount.impl.R$layout;
import com.revolut.feature.subaccount.impl.ui.currency.SelectCurrencyOptionScreen;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import r6e.k;
import r6e.o;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/currency/SelectCurrencyOptionScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "La8e/h;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "La8e/e;", "Lno/m;", "<init>", "()V", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectCurrencyOptionScreen extends BaseRxRecyclerViewScreen<h, IOData$EmptyInput, e> implements m {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(SelectCurrencyOptionScreen.class, "binding", "getBinding()Lcom/revolut/feature/subaccount/impl/databinding/ScreenSelectCurrencyOptionBinding;", 0))};
    public final AnalyticsProduct.Retail X;
    public final Object Y;
    public final ao.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f89053a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f89054b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f89055d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f89056e0;
    public final boolean f0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, p6e.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/subaccount/impl/databinding/ScreenSelectCurrencyOptionBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.selectCurrencyOptionScreen_footer;
            if (((FooterTextView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.selectCurrencyOptionScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.selectCurrencyOptionScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new p6e.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public SelectCurrencyOptionScreen() {
        super(IOData$EmptyInput.f98299a);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137495b;
        this.X = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        Lazy lazyY0 = w.y0(new g(20));
        this.Y = lazyY0;
        this.Z = s.t(this, a.f);
        this.f89053a0 = u.c((RowDelegate) lazyY0.getValue());
        final int i = 0;
        this.f89054b0 = w.y0(new Function0(this) { // from class: a8e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCurrencyOptionScreen f2185b;

            {
                this.f2185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectCurrencyOptionScreen selectCurrencyOptionScreen = this.f2185b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectCurrencyOptionScreen.g0;
                        phm.a aVar = (phm.a) ue0.e.j(selectCurrencyOptionScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        r6e.k kVar = new r6e.k();
                        kVar.f251761a = e4m.b.b(new qy7.f(oVar, kVar, 1, 15));
                        kVar.f251762b = e4m.b.b(new qy7.f(oVar, kVar, 0, 15));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr2 = SelectCurrencyOptionScreen.g0;
                        return (g) ((r6e.k) selectCurrencyOptionScreen.f89054b0.getValue()).f251762b.get();
                }
            }
        });
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: a8e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCurrencyOptionScreen f2185b;

            {
                this.f2185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectCurrencyOptionScreen selectCurrencyOptionScreen = this.f2185b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectCurrencyOptionScreen.g0;
                        phm.a aVar = (phm.a) ue0.e.j(selectCurrencyOptionScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        r6e.k kVar = new r6e.k();
                        kVar.f251761a = e4m.b.b(new qy7.f(oVar, kVar, 1, 15));
                        kVar.f251762b = e4m.b.b(new qy7.f(oVar, kVar, 0, 15));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr2 = SelectCurrencyOptionScreen.g0;
                        return (g) ((r6e.k) selectCurrencyOptionScreen.f89054b0.getValue()).f251762b.get();
                }
            }
        });
        this.f89055d0 = R$layout.screen_select_currency_option;
        this.f89056e0 = R$id.selectCurrencyOptionScreen_recyclerView;
        this.f0 = true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.f89054b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (a8e.g) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Z.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i = 0;
        BaseRxRecyclerViewScreen.g3(this, ((p6e.a) value).f233251b.f59410q, new Function1(this) { // from class: a8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCurrencyOptionScreen f2183b;

            {
                this.f2183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                SelectCurrencyOptionScreen selectCurrencyOptionScreen = this.f2183b;
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = SelectCurrencyOptionScreen.g0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((i) ((g) selectCurrencyOptionScreen.c0.getValue())).v2(e.a.f2187a);
                        break;
                    default:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr2 = SelectCurrencyOptionScreen.g0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Object obj3 = model.u;
                        u6e.a selected = obj3 instanceof u6e.a ? (u6e.a) obj3 : null;
                        if (selected != null) {
                            i iVar = (i) ((g) selectCurrencyOptionScreen.c0.getValue());
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(selected, "selected");
                            iVar.l2(new a1a.a(iVar, selected, null, 22), new yi5.b(26));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i2 = 1;
        BaseRxRecyclerViewScreen.g3(this, ((RowDelegate) this.Y.getValue()).f53218h, new Function1(this) { // from class: a8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCurrencyOptionScreen f2183b;

            {
                this.f2183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                SelectCurrencyOptionScreen selectCurrencyOptionScreen = this.f2183b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = SelectCurrencyOptionScreen.g0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((i) ((g) selectCurrencyOptionScreen.c0.getValue())).v2(e.a.f2187a);
                        break;
                    default:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr2 = SelectCurrencyOptionScreen.g0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Object obj3 = model.u;
                        u6e.a selected = obj3 instanceof u6e.a ? (u6e.a) obj3 : null;
                        if (selected != null) {
                            i iVar = (i) ((g) selectCurrencyOptionScreen.c0.getValue());
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(selected, "selected");
                            iVar.l2(new a1a.a(iVar, selected, null, 22), new yi5.b(26));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Z.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((p6e.a) value).f233251b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vaults_content_type_selector_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vaults_content_type_selector_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78908e0() {
        return this.f89053a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.f89056e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.f89055d0;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f0);
    }
}
