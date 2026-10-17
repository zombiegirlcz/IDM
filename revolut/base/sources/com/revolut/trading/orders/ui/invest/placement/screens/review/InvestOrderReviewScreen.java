package com.revolut.trading.orders.ui.invest.placement.screens.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$InputData;
import hul.p;
import hul.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import mga.i0;
import te0.w;
import tx0.s3;
import tx0.t3;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhul/n;", "", "Lmga/i0;", "Locf/c;", "Lisl/h;", "Lkvl/g;", "Ld1h/j;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderReviewScreen extends ViewController<hul.n> implements tki.c, i0, ocf.c, isl.h, kvl.g, d1h.j {
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(InvestOrderReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final InvestOrderReviewScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f106935a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f106936b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AccountCellItemDelegate f106937d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f106938e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final FooterTextDelegate f106939h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f106940k0;

    public InvestOrderReviewScreen(InvestOrderReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, hul.d.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
        final int i2 = 2;
        this.O = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
        final int i3 = 5;
        this.P = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
        this.Q = w.y0(new ht1.e(23));
        this.R = w.y0(new ht1.e(24));
        this.S = w.y0(new ht1.e(25));
        this.T = w.y0(new ht1.e(26));
        this.U = w.y0(new ht1.e(27));
        this.V = w.y0(new ht1.e(29));
        this.W = w.y0(new hul.c(0));
        this.X = w.y0(new ht1.e(28));
        this.Y = w.y0(new hul.c(1));
        this.Z = w.y0(new hul.c(2));
        this.f106935a0 = w.y0(new hul.c(3));
        this.f106936b0 = w.y0(new hul.c(4));
        this.c0 = w.y0(new hul.c(5));
        this.f106937d0 = new AccountCellItemDelegate();
        final int i5 = 6;
        this.f106938e0 = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
        this.f0 = w.y0(new hul.c(6));
        this.g0 = w.y0(new hul.c(7));
        this.f106939h0 = new FooterTextDelegate();
        final int i6 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
        final int i21 = 3;
        this.j0 = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
        final int i22 = 4;
        this.f106940k0 = w.y0(new Function0(this) { // from class: hul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderReviewScreen f155709b;

            {
                this.f155709b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                InvestOrderReviewScreen investOrderReviewScreen = this.f155709b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen2 = this.f155709b;
                        qji.b bVarU2 = investOrderReviewScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.review.di.InvestOrderReviewScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = investOrderReviewScreen2.K;
                        investOrderReviewScreenContract$InputData.getClass();
                        return new xsl.g(pVar, fVar2, investOrderReviewScreen2, investOrderReviewScreenContract$InputData, investOrderReviewScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((TextDelegate) investOrderReviewScreen.V.getValue(), investOrderReviewScreen.getF106877b0(), investOrderReviewScreen.getU(), (PlainTextDelegate) investOrderReviewScreen.W.getValue(), (PlainTextWarningDelegate) investOrderReviewScreen.X.getValue(), investOrderReviewScreen.getX(), investOrderReviewScreen.getZ(), (CellDetailsActionableIconDelegate) investOrderReviewScreen.Z.getValue(), (CellDetailsNoteDelegate) investOrderReviewScreen.U.getValue(), (ActionWidgetDelegate) investOrderReviewScreen.f106935a0.getValue(), (CellDetailsLoadingDelegate) investOrderReviewScreen.c0.getValue(), investOrderReviewScreen.getO(), (HighlightTileDelegate) investOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate(), new ListSubheaderDelegate(), (ExpandableCellDelegate) investOrderReviewScreen.g0.getValue(), investOrderReviewScreen.f106939h0);
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                        return (p) ((xsl.g) investOrderReviewScreen.N.getValue()).K.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                        return zhm.v.k((PlainTextDelegate) investOrderReviewScreen.W.getValue(), investOrderReviewScreen.getW(), investOrderReviewScreen.getX(), investOrderReviewScreen.f106937d0, (SwipeToActionDelegate) investOrderReviewScreen.f106938e0.getValue(), investOrderReviewScreen.getF106877b0());
                    case 4:
                        KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                        InvestOrderReviewScreen investOrderReviewScreen3 = this.f155709b;
                        p pVarR2 = investOrderReviewScreen3.R2();
                        List list = (List) investOrderReviewScreen3.i0.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = investOrderReviewScreen3.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
                        return tki.g.a(investOrderReviewScreen3, pVarR2, list, screenRecyclerNavbarActionFooterRecyclerView.getId(), null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                        ((xsl.g) investOrderReviewScreen.N.getValue()).getClass();
                        return new jul.m();
                    default:
                        KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                        return new SwipeToActionDelegate(investOrderReviewScreen.f106937d0, false);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        hul.q qVar2 = uiState.f155758a;
        Clause clause = qVar2.f155756b;
        screenRecyclerNavbarActionFooterNavBar.setTitle(clause, null);
        screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(clause);
        s3 s3Var = qVar2.f155755a;
        if (s3Var != null) {
            screenRecyclerNavbarActionFooterNavBar.setEndImage(s3Var);
        } else {
            screenRecyclerNavbarActionFooterNavBar.setEndImage((yy0.l) null);
        }
        screenRecyclerNavbarActionFooterNavBar.setDescriptionText(qVar2.f155757c);
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionVisible(false);
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionText(null);
        if (qVar2.d) {
            screenRecyclerNavbarActionFooterNavBar.I0(t3.TWO_LINES, false);
        } else {
            screenRecyclerNavbarActionFooterNavBar.l0();
        }
        screenRecyclerNavbarActionFooterNavBar.setHeaderDisclaimerSticky(qVar2.e);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setModel(uiState.f155760c);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getF106939h0() {
        return this.f106939h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ocf.c
    /* JADX INFO: renamed from: M1 */
    public final BannerDelegate getU() {
        return (BannerDelegate) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final efm.r N0() {
        return ((HighlightTileDelegate) this.R.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // d1h.j
    /* JADX INFO: renamed from: Q */
    public final FullScreenStateDelegate getO() {
        return (FullScreenStateDelegate) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (xsl.g) this.N.getValue();
    }

    @Override // kvl.g
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final AccountCellItemDelegate getF106937d0() {
        return this.f106937d0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((xsl.g) this.N.getValue()).f308627h.get()).d((List) this.j0.getValue());
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((jul.m) this.P.getValue()).getClass();
        TextLocalisedClause textLocalisedClauseA = jul.m.a();
        screenRecyclerNavbarActionFooterNavBar.setTitle(textLocalisedClauseA, null);
        screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(textLocalisedClauseA);
        screenRecyclerNavbarActionFooterNavBar.setDescriptionVisible(true);
    }

    @Override // mga.i0
    public final efm.r a2() {
        return getF106877b0().f53218h;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarActionFooterNavBar.f59410q), new hul.e(this, null, 0), 3);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarActionFooterActionFooterView.f), new hul.e(this, null, 1), 3);
        vkm.d dVarB = rd0.e.b(((TextDelegate) this.V.getValue()).d);
        vkm.d dVarB2 = rd0.e.b(this.f106939h0.e.f121375b);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
        ViewController.P2(this, vkm.q.J(dVarB, dVarB2, rd0.e.b(screenRecyclerNavbarActionFooterActionFooterView2.e)), new hul.f(this, continuation, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(getZ().d), rd0.e.b(((CellDetailsActionableIconDelegate) this.Z.getValue()).f51807c), rd0.e.b(((CellDetailsNoteDelegate) this.U.getValue()).d), rd0.e.b(((ExpandableCellDelegate) this.g0.getValue()).f52255c), rd0.e.b(getX().d)), new hul.f(this, continuation, 1), 3);
        ?? r06 = this.X;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((PlainTextWarningDelegate) r06.getValue()).f52940c), rd0.e.b((ihm.f) ((PlainTextWarningDelegate) r06.getValue()).f.getValue())), new hul.f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(getW().d.f121375b), new hul.g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kvl.g
    /* JADX INFO: renamed from: c */
    public final RowDelegate getF106877b0() {
        return (RowDelegate) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kvl.g
    /* JADX INFO: renamed from: c0 */
    public final LargeActionButtonDelegate getW() {
        return (LargeActionButtonDelegate) this.f106936b0.getValue();
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.O.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174532a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // isl.h
    /* JADX INFO: renamed from: j */
    public final CellDetailsDelegate getX() {
        return (CellDetailsDelegate) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f106940k0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kvl.g
    /* JADX INFO: renamed from: p1 */
    public final CellDetailsActionDelegate getZ() {
        return (CellDetailsActionDelegate) this.Y.getValue();
    }

    @Override // d1h.j
    public final Flow y() {
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        return rd0.e.b((ihm.f) screenRecyclerNavbarActionFooterNavBar.f59406n.f258290b);
    }
}
