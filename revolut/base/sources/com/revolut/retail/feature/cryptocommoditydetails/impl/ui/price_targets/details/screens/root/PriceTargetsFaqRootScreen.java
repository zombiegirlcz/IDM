package com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.R$string;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root.PriceTargetsFaqRootScreen;
import fdj.e;
import grl.k9;
import java.util.List;
import jki.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import pdj.d;
import pdj.f;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/screens/root/PriceTargetsFaqRootScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljki/n;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lpdj/d;", "Lno/m;", "<init>", "()V", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PriceTargetsFaqRootScreen extends BaseRecyclerViewScreen<n, IOData$EmptyInput, d> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PriceTargetsFaqRootScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final boolean V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f100163a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f100164b0;

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public PriceTargetsFaqRootScreen() {
        super(IOData$EmptyInput.f98299a);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137498h;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = true;
        this.W = R$layout.screen_recycler_navbar;
        this.X = s.t(this, a.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: pdj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceTargetsFaqRootScreen f235261b;

            {
                this.f235261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PriceTargetsFaqRootScreen priceTargetsFaqRootScreen = this.f235261b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PriceTargetsFaqRootScreen.c0;
                        return (f) ((fdj.e) priceTargetsFaqRootScreen.f100164b0.getValue()).f133967b.get();
                    default:
                        KProperty[] kPropertyArr2 = PriceTargetsFaqRootScreen.c0;
                        qji.b bVarQ2 = priceTargetsFaqRootScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root.di.PriceTargetsFaqRootScreenInjector");
                        fdj.e eVar = new fdj.e();
                        int i3 = 4;
                        eVar.f133966a = e4m.b.b(new fd2.n(eVar, 1, i3));
                        eVar.f133967b = e4m.b.b(new fd2.n(eVar, 0, i3));
                        return eVar;
                }
            }
        });
        Lazy lazyY0 = w.y0(new pdg.d(13));
        this.Z = lazyY0;
        this.f100163a0 = u.c((CellDetailsChevronDelegate) lazyY0.getValue());
        final int i2 = 1;
        this.f100164b0 = w.y0(new Function0(this) { // from class: pdj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceTargetsFaqRootScreen f235261b;

            {
                this.f235261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PriceTargetsFaqRootScreen priceTargetsFaqRootScreen = this.f235261b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PriceTargetsFaqRootScreen.c0;
                        return (f) ((fdj.e) priceTargetsFaqRootScreen.f100164b0.getValue()).f133967b.get();
                    default:
                        KProperty[] kPropertyArr2 = PriceTargetsFaqRootScreen.c0;
                        qji.b bVarQ2 = priceTargetsFaqRootScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root.di.PriceTargetsFaqRootScreenInjector");
                        fdj.e eVar = new fdj.e();
                        int i3 = 4;
                        eVar.f133966a = e4m.b.b(new fd2.n(eVar, 1, i3));
                        eVar.f133967b = e4m.b.b(new fd2.n(eVar, 0, i3));
                        return eVar;
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (e) this.f100164b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new p0l.d(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.Z.getValue()).f51821c), null, new pdj.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        ihm.f fVar = navBarWithToolbar.f59409p.f57336l;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.commodity_price_targets_faq_root_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.commodity_price_targets_faq_root_screen_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.commodity_price_targets_faq_root_screen_description, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF100163a0() {
        return this.f100163a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
