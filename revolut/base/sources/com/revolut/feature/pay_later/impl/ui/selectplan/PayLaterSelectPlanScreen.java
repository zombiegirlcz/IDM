package com.revolut.feature.pay_later.impl.ui.selectplan;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.impl.ui.selectplan.PayLaterSelectPlanScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ij9.b;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oi9.p;
import te0.w;
import ujb.v;
import uk9.c;
import uk9.e;
import uk9.f;
import vc.s;
import vkm.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/selectplan/PayLaterSelectPlanScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luk9/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterSelectPlanScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f78937e0 = {o0.f186429a.j(new h0(PayLaterSelectPlanScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f78938a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78939b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f78940d0;

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

    public PayLaterSelectPlanScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = b.f161739a;
        this.V = s.t(this, a.f);
        Lazy lazyY0 = w.y0(new v(7));
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new v(8));
        this.X = lazyY02;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: uk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterSelectPlanScreen f280700b;

            {
                this.f280700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayLaterSelectPlanScreen payLaterSelectPlanScreen = this.f280700b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterSelectPlanScreen.f78937e0;
                        return (j60.a) ((p) payLaterSelectPlanScreen.f78939b0.getValue()).f225555c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterSelectPlanScreen.f78937e0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterSelectPlanScreen.m2()).v;
                        p pVar = new p();
                        pVar.f225553a = e4m.b.b(e4m.c.a(payLaterSelectPlanScreen));
                        pVar.f225554b = e4m.b.b(new oi9.a(fVar, pVar, 2, 10));
                        pVar.f225555c = e4m.b.b(new oi9.a(fVar, pVar, 1, 10));
                        pVar.d = e4m.b.b(new oi9.a(fVar, pVar, 0, 10));
                        pVar.e = e4m.b.b(new oi9.a(fVar, pVar, 4, 10));
                        pVar.f = e4m.b.b(new oi9.a(fVar, pVar, 3, 10));
                        return pVar;
                    default:
                        KProperty[] kPropertyArr3 = PayLaterSelectPlanScreen.f78937e0;
                        return (e) ((p) payLaterSelectPlanScreen.f78939b0.getValue()).f.get();
                }
            }
        });
        this.Z = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.f78938a0 = true;
        this.f78939b0 = w.y0(new Function0(this) { // from class: uk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterSelectPlanScreen f280700b;

            {
                this.f280700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayLaterSelectPlanScreen payLaterSelectPlanScreen = this.f280700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterSelectPlanScreen.f78937e0;
                        return (j60.a) ((p) payLaterSelectPlanScreen.f78939b0.getValue()).f225555c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterSelectPlanScreen.f78937e0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterSelectPlanScreen.m2()).v;
                        p pVar = new p();
                        pVar.f225553a = e4m.b.b(e4m.c.a(payLaterSelectPlanScreen));
                        pVar.f225554b = e4m.b.b(new oi9.a(fVar, pVar, 2, 10));
                        pVar.f225555c = e4m.b.b(new oi9.a(fVar, pVar, 1, 10));
                        pVar.d = e4m.b.b(new oi9.a(fVar, pVar, 0, 10));
                        pVar.e = e4m.b.b(new oi9.a(fVar, pVar, 4, 10));
                        pVar.f = e4m.b.b(new oi9.a(fVar, pVar, 3, 10));
                        return pVar;
                    default:
                        KProperty[] kPropertyArr3 = PayLaterSelectPlanScreen.f78937e0;
                        return (e) ((p) payLaterSelectPlanScreen.f78939b0.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: uk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterSelectPlanScreen f280700b;

            {
                this.f280700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayLaterSelectPlanScreen payLaterSelectPlanScreen = this.f280700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterSelectPlanScreen.f78937e0;
                        return (j60.a) ((p) payLaterSelectPlanScreen.f78939b0.getValue()).f225555c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterSelectPlanScreen.f78937e0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterSelectPlanScreen.m2()).v;
                        p pVar = new p();
                        pVar.f225553a = e4m.b.b(e4m.c.a(payLaterSelectPlanScreen));
                        pVar.f225554b = e4m.b.b(new oi9.a(fVar, pVar, 2, 10));
                        pVar.f225555c = e4m.b.b(new oi9.a(fVar, pVar, 1, 10));
                        pVar.d = e4m.b.b(new oi9.a(fVar, pVar, 0, 10));
                        pVar.e = e4m.b.b(new oi9.a(fVar, pVar, 4, 10));
                        pVar.f = e4m.b.b(new oi9.a(fVar, pVar, 3, 10));
                        return pVar;
                    default:
                        KProperty[] kPropertyArr3 = PayLaterSelectPlanScreen.f78937e0;
                        return (e) ((p) payLaterSelectPlanScreen.f78939b0.getValue()).f.get();
                }
            }
        });
        this.f78940d0 = zhm.v.k((RowDelegate) lazyY0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (LargeActionButtonDelegate) lazyY02.getValue());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        this.U.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.f78939b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new uea.e(this, null, 7), 3);
        d dVarB = rd0.e.b(((RowDelegate) this.W.getValue()).f53218h);
        ?? r06 = this.c0;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new uk9.b(2, 4, e.class, (e) r06.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.X.getValue()).d.f121375b), null, new c(2, 4, e.class, (e) r06.getValue(), "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.Y.getValue()).d(zhm.v.k((RowDelegate) this.W.getValue(), (LargeActionButtonDelegate) this.X.getValue()));
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78940d0() {
        return this.f78940d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f280703b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f174539b.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Z;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, f78937e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f78938a0);
    }
}
