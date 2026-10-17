package com.revolut.feature.pay_later.impl.ui.selectpayment;

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
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.impl.ui.selectpayment.PayLaterSelectRepaymentScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ij9.b;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import th9.k;
import tk5.c;
import tk9.e;
import tk9.f;
import vc.s;
import vkm.d;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/selectpayment/PayLaterSelectRepaymentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltk9/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterSelectRepaymentScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f78933e0 = {o0.f186429a.j(new h0(PayLaterSelectRepaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final int Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f78934a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78935b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f78936d0;

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

    public PayLaterSelectRepaymentScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = b.f161739a;
        this.V = s.t(this, a.f);
        Lazy lazyY0 = w.y0(new k(11));
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new k(12));
        this.X = lazyY02;
        this.Y = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.Z = true;
        final int i2 = 0;
        this.f78934a0 = w.y0(new Function0(this) { // from class: tk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterSelectRepaymentScreen f271914b;

            {
                this.f271914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PayLaterSelectRepaymentScreen payLaterSelectRepaymentScreen = this.f271914b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterSelectRepaymentScreen.f78933e0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterSelectRepaymentScreen.m2()).v;
                        oi9.q qVar = new oi9.q();
                        qVar.f225556a = e4m.b.b(e4m.c.a(payLaterSelectRepaymentScreen));
                        qVar.f225557b = e4m.b.b(new oi9.a(fVar, qVar, 2, 11));
                        qVar.f225558c = e4m.b.b(new oi9.a(fVar, qVar, 1, 11));
                        qVar.d = e4m.b.b(new oi9.a(fVar, qVar, 0, 11));
                        qVar.e = e4m.b.b(new oi9.a(fVar, qVar, 4, 11));
                        qVar.f = e4m.b.b(new oi9.a(fVar, qVar, 3, 11));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterSelectRepaymentScreen.f78933e0;
                        return (e) ((oi9.q) payLaterSelectRepaymentScreen.f78934a0.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterSelectRepaymentScreen.f78933e0;
                        return (j60.a) ((oi9.q) payLaterSelectRepaymentScreen.f78934a0.getValue()).f225558c.get();
                }
            }
        });
        this.f78935b0 = w.y0(new Function0(this) { // from class: tk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterSelectRepaymentScreen f271914b;

            {
                this.f271914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PayLaterSelectRepaymentScreen payLaterSelectRepaymentScreen = this.f271914b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterSelectRepaymentScreen.f78933e0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterSelectRepaymentScreen.m2()).v;
                        oi9.q qVar = new oi9.q();
                        qVar.f225556a = e4m.b.b(e4m.c.a(payLaterSelectRepaymentScreen));
                        qVar.f225557b = e4m.b.b(new oi9.a(fVar, qVar, 2, 11));
                        qVar.f225558c = e4m.b.b(new oi9.a(fVar, qVar, 1, 11));
                        qVar.d = e4m.b.b(new oi9.a(fVar, qVar, 0, 11));
                        qVar.e = e4m.b.b(new oi9.a(fVar, qVar, 4, 11));
                        qVar.f = e4m.b.b(new oi9.a(fVar, qVar, 3, 11));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterSelectRepaymentScreen.f78933e0;
                        return (e) ((oi9.q) payLaterSelectRepaymentScreen.f78934a0.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterSelectRepaymentScreen.f78933e0;
                        return (j60.a) ((oi9.q) payLaterSelectRepaymentScreen.f78934a0.getValue()).f225558c.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: tk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterSelectRepaymentScreen f271914b;

            {
                this.f271914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                PayLaterSelectRepaymentScreen payLaterSelectRepaymentScreen = this.f271914b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterSelectRepaymentScreen.f78933e0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterSelectRepaymentScreen.m2()).v;
                        oi9.q qVar = new oi9.q();
                        qVar.f225556a = e4m.b.b(e4m.c.a(payLaterSelectRepaymentScreen));
                        qVar.f225557b = e4m.b.b(new oi9.a(fVar, qVar, 2, 11));
                        qVar.f225558c = e4m.b.b(new oi9.a(fVar, qVar, 1, 11));
                        qVar.d = e4m.b.b(new oi9.a(fVar, qVar, 0, 11));
                        qVar.e = e4m.b.b(new oi9.a(fVar, qVar, 4, 11));
                        qVar.f = e4m.b.b(new oi9.a(fVar, qVar, 3, 11));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterSelectRepaymentScreen.f78933e0;
                        return (e) ((oi9.q) payLaterSelectRepaymentScreen.f78934a0.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterSelectRepaymentScreen.f78933e0;
                        return (j60.a) ((oi9.q) payLaterSelectRepaymentScreen.f78934a0.getValue()).f225558c.get();
                }
            }
        });
        this.f78936d0 = v.k((RowDelegate) lazyY0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (LargeActionButtonDelegate) lazyY02.getValue());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.U.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (oi9.q) this.f78934a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.f78935b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, f78933e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new c(this, null, 1), 3);
        d dVarB = rd0.e.b(((RowDelegate) this.W.getValue()).f53218h);
        ?? r06 = this.f78935b0;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new tk9.b(2, 4, e.class, (e) r06.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.X.getValue()).d.f121375b), null, new tk9.c(2, 4, e.class, (e) r06.getValue(), "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.c0.getValue()).d(v.k((RowDelegate) this.W.getValue(), (LargeActionButtonDelegate) this.X.getValue()));
        ViewBinding value = this.V.getValue(this, f78933e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_later_repayment_select_upcoming_repayment, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF89101e0() {
        return this.f78936d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
