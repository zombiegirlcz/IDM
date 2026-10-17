package com.revolut.feature.pay_later.impl.ui.accountdetails;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import ihm.f;
import ij9.b;
import java.util.List;
import jj9.d;
import jj9.g;
import jj9.i;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import oi9.e;
import oj9.c;
import te0.w;
import tx0.t3;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/accountdetails/PayLaterAccountDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljj9/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "Lno/k;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterAccountDetailsScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, q> implements m, k {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(PayLaterAccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f78871a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78872b0;
    public AnalyticsContext c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f78873d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f78874e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final List f78875h0;

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

    public PayLaterAccountDetailsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = b.f161739a;
        this.V = s.t(this, a.f);
        this.W = w.y0(new ja3.b(28));
        Lazy lazyY0 = w.y0(new ja3.b(29));
        this.X = lazyY0;
        final int i = 0;
        Lazy lazyY02 = w.y0(new jj9.b(0));
        this.Y = lazyY02;
        final int i2 = 1;
        Lazy lazyY03 = w.y0(new jj9.b(1));
        this.Z = lazyY03;
        Lazy lazyY04 = w.y0(new jj9.b(2));
        this.f78871a0 = lazyY04;
        Lazy lazyY05 = w.y0(new ja3.b(27));
        this.f78872b0 = lazyY05;
        this.f78873d0 = R$layout.screen_recycler_navbar;
        this.f78874e0 = true;
        this.f0 = w.y0(new Function0(this) { // from class: jj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterAccountDetailsScreen f174779b;

            {
                this.f174779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PayLaterAccountDetailsScreen payLaterAccountDetailsScreen = this.f174779b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterAccountDetailsScreen.i0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterAccountDetailsScreen.m2()).v;
                        oi9.e eVar = new oi9.e();
                        eVar.f225492a = e4m.b.b(e4m.c.a(payLaterAccountDetailsScreen));
                        eVar.f225493b = e4m.b.b(new oi9.a(fVar, eVar, 2, 2));
                        eVar.f225494c = e4m.b.b(new oi9.a(fVar, eVar, 1, 2));
                        eVar.d = e4m.b.b(new oi9.a(fVar, eVar, 0, 2));
                        eVar.e = e4m.b.b(new oi9.a(fVar, eVar, 4, 2));
                        eVar.f = e4m.b.b(new oi9.a(fVar, eVar, 3, 2));
                        eVar.f225495g = e4m.b.b(new oi9.a(fVar, eVar, 6, 2));
                        eVar.f225496h = e4m.b.b(new oi9.a(fVar, eVar, 5, 2));
                        eVar.i = e4m.b.b(new oi9.a(fVar, eVar, 8, 2));
                        eVar.f225497j = e4m.b.b(new oi9.a(fVar, eVar, 7, 2));
                        eVar.k = e4m.b.b(new oi9.a(fVar, eVar, 10, 2));
                        eVar.f225498l = e4m.b.b(new oi9.a(fVar, eVar, 9, 2));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr2 = PayLaterAccountDetailsScreen.i0;
                        return (h) ((oi9.e) payLaterAccountDetailsScreen.f0.getValue()).f225498l.get();
                }
            }
        });
        this.g0 = j.c(yhm.k.NONE, new Function0(this) { // from class: jj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterAccountDetailsScreen f174779b;

            {
                this.f174779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PayLaterAccountDetailsScreen payLaterAccountDetailsScreen = this.f174779b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterAccountDetailsScreen.i0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterAccountDetailsScreen.m2()).v;
                        oi9.e eVar = new oi9.e();
                        eVar.f225492a = e4m.b.b(e4m.c.a(payLaterAccountDetailsScreen));
                        eVar.f225493b = e4m.b.b(new oi9.a(fVar, eVar, 2, 2));
                        eVar.f225494c = e4m.b.b(new oi9.a(fVar, eVar, 1, 2));
                        eVar.d = e4m.b.b(new oi9.a(fVar, eVar, 0, 2));
                        eVar.e = e4m.b.b(new oi9.a(fVar, eVar, 4, 2));
                        eVar.f = e4m.b.b(new oi9.a(fVar, eVar, 3, 2));
                        eVar.f225495g = e4m.b.b(new oi9.a(fVar, eVar, 6, 2));
                        eVar.f225496h = e4m.b.b(new oi9.a(fVar, eVar, 5, 2));
                        eVar.i = e4m.b.b(new oi9.a(fVar, eVar, 8, 2));
                        eVar.f225497j = e4m.b.b(new oi9.a(fVar, eVar, 7, 2));
                        eVar.k = e4m.b.b(new oi9.a(fVar, eVar, 10, 2));
                        eVar.f225498l = e4m.b.b(new oi9.a(fVar, eVar, 9, 2));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr2 = PayLaterAccountDetailsScreen.i0;
                        return (h) ((oi9.e) payLaterAccountDetailsScreen.f0.getValue()).f225498l.get();
                }
            }
        });
        this.f78875h0 = v.k((RowDelegate) lazyY0.getValue(), (ListSubheaderDelegate) lazyY04.getValue(), (CellDetailsActionDelegate) lazyY03.getValue(), (CellDetailsChevronDelegate) lazyY02.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new CellDetailsBarRatingDelegate(), new TextDelegate(), new CellDetailsDelegate(), (BannerDelegate) lazyY05.getValue());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.c0 = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        this.U.getClass();
        return b.f161740b;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getC0() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (jj9.h) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new j2c.b(this, null, 27), 3);
        f fVar = ((LargeActionButtonDelegate) this.W.getValue()).d.f121375b;
        f fVar2 = ((CellDetailsChevronDelegate) this.Y.getValue()).f51821c;
        f fVar3 = ((CellDetailsActionDelegate) this.Z.getValue()).d;
        ?? r4 = this.X;
        f fVar4 = ((RowDelegate) r4.getValue()).f53218h;
        r map = ((RowDelegate) r4.getValue()).f53226s.map(new jeg.h(new jj3.a(this, 1), 12));
        r map2 = ((j60.a) ((e) this.f0.getValue()).f225494c.get()).C().map(new jeg.h(new jj3.a(2), 13));
        r rVarA0 = w.a0(h3().f174539b.q0(), new jj3.a(3));
        ?? r102 = this.f78871a0;
        r rVarMerge = r.merge(v.k(fVar, fVar2, fVar3, fVar4, map, map2, rVarA0, ((ListSubheaderDelegate) r102.getValue()).e, ((ListSubheaderDelegate) r102.getValue()).d));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new jij.h(this, (Continuation) null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, c.a((jj9.h) this.g0.getValue(), (BannerDelegate) this.f78872b0.getValue()), null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        t3 t3Var = t3.TWO_LINES;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.I0(t3Var, false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((e) this.f0.getValue()).f225494c.get()).d(v.k((RowDelegate) this.X.getValue(), (LargeActionButtonDelegate) this.W.getValue(), new ListCellDelegate()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78875h0() {
        return this.f78875h0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g gVar = uiState.f174789a;
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        if (gVar instanceof d) {
            d dVar = (d) gVar;
            yx4.b bVar = dVar.f174786c;
            navBarWithToolbar.setTitle(dVar.f174784a, null);
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pay_later_product_name, null, null, 14));
            navBarWithToolbar.setDescriptionText(dVar.f174785b);
            navBarWithToolbar.setDescriptionClickPayload(bVar == null ? Unit.f186387a : bVar);
            navBarWithToolbar.setDescriptionClickable(bVar != null ? c0.TEXT_AND_ICON : c0.NONE);
            navBarWithToolbar.setEndIconImage(dVar.d);
            navBarWithToolbar.l0();
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.H0(false);
        } else if (gVar instanceof jj9.f) {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.I0(t3.PROFILE, false);
        } else {
            if (!(gVar instanceof jj9.e)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            navBarWithToolbar.j0(false);
        }
        this.c0 = new AnalyticsContext(uiState.f174791c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF78873d0() {
        return this.f78873d0;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f78874e0);
    }
}
