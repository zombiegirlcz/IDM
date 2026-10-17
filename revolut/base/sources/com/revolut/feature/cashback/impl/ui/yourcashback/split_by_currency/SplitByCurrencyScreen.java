package com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency.SplitByCurrencyScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import x0f.g;
import x5a.d;
import xd3.c;
import yc3.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/split_by_currency/SplitByCurrencyScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxd3/c;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitByCurrencyScreen extends BaseRecyclerViewScreen<c, IOData$EmptyInput, q> implements m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65732b0 = {o0.f186429a.j(new h0(SplitByCurrencyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final Object V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65733a0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public SplitByCurrencyScreen() {
        super(IOData$EmptyInput.f98299a);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137495b;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: xd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitByCurrencyScreen f304250b;

            {
                this.f304250b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SplitByCurrencyScreen splitByCurrencyScreen = this.f304250b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SplitByCurrencyScreen.f65732b0;
                        qji.b bVarQ2 = splitByCurrencyScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency.di.SplitByCurrencyScreenInjector");
                        yc3.a aVar = ((yc3.h) bVarQ2).f312486b;
                        f fVar = new f();
                        fVar.f312481a = e4m.b.b(new xsl.q(aVar, fVar, 1, 19));
                        fVar.f312482b = e4m.b.b(new xsl.q(aVar, fVar, 0, 19));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr2 = SplitByCurrencyScreen.f65732b0;
                        return (d) ((f) splitByCurrencyScreen.V.getValue()).f312482b.get();
                }
            }
        });
        this.W = R$layout.screen_recycler_navbar;
        this.X = true;
        this.Y = s.t(this, a.f);
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: xd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitByCurrencyScreen f304250b;

            {
                this.f304250b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SplitByCurrencyScreen splitByCurrencyScreen = this.f304250b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitByCurrencyScreen.f65732b0;
                        qji.b bVarQ2 = splitByCurrencyScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency.di.SplitByCurrencyScreenInjector");
                        yc3.a aVar = ((yc3.h) bVarQ2).f312486b;
                        f fVar = new f();
                        fVar.f312481a = e4m.b.b(new xsl.q(aVar, fVar, 1, 19));
                        fVar.f312482b = e4m.b.b(new xsl.q(aVar, fVar, 0, 19));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr2 = SplitByCurrencyScreen.f65732b0;
                        return (d) ((f) splitByCurrencyScreen.V.getValue()).f312482b.get();
                }
            }
        });
        this.f65733a0 = w.y0(new d(22));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (xd3.d) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Y.getValue(this, f65732b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((jii.m) value).f174539b.f59410q), null, new g(this, null, 10), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Y.getValue(this, f65732b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cashback_product_plan_breakdown_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cashback_product_plan_breakdown_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.cashback_product_plan_breakdown_caption, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f65733a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
