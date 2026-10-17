package com.revolut.feature.pay_later.impl.ui.repayamount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import ij9.b;
import java.util.List;
import jii.s;
import jki.o;
import kae.d;
import kk9.c;
import kk9.f;
import kk9.j;
import kk9.k;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/repayamount/PayLaterRepayAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lkk9/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterRepayAmountScreen extends BaseRecyclerViewScreen<k, IOData$EmptyInput, q> implements m {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PayLaterRepayAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final h V;
    public final Object W;
    public final Object X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f78905a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78906b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f78907d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f78908e0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return s.a(p0);
        }
    }

    public PayLaterRepayAmountScreen() {
        super(IOData$EmptyInput.f98299a);
        b bVar = b.f161739a;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = vc.s.t(this, a.f);
        final int i = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: kk9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterRepayAmountScreen f184524b;

            {
                this.f184524b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayLaterRepayAmountScreen payLaterRepayAmountScreen = this.f184524b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterRepayAmountScreen.f0;
                        return new CenteredAmountDelegate(new kj4.c(payLaterRepayAmountScreen, 4));
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterRepayAmountScreen.f0;
                        return new oi9.m(kotlin.jvm.internal.s.n(payLaterRepayAmountScreen.m2()).v);
                    default:
                        KProperty[] kPropertyArr3 = PayLaterRepayAmountScreen.f0;
                        return (j) ((oi9.m) payLaterRepayAmountScreen.f78906b0.getValue()).f225540c.get();
                }
            }
        });
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new ka9.b(22));
        this.X = lazyY02;
        this.Y = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.Z = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
        final int i2 = 1;
        this.f78905a0 = true;
        this.f78906b0 = w.y0(new Function0(this) { // from class: kk9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterRepayAmountScreen f184524b;

            {
                this.f184524b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayLaterRepayAmountScreen payLaterRepayAmountScreen = this.f184524b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterRepayAmountScreen.f0;
                        return new CenteredAmountDelegate(new kj4.c(payLaterRepayAmountScreen, 4));
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterRepayAmountScreen.f0;
                        return new oi9.m(kotlin.jvm.internal.s.n(payLaterRepayAmountScreen.m2()).v);
                    default:
                        KProperty[] kPropertyArr3 = PayLaterRepayAmountScreen.f0;
                        return (j) ((oi9.m) payLaterRepayAmountScreen.f78906b0.getValue()).f225540c.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: kk9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterRepayAmountScreen f184524b;

            {
                this.f184524b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayLaterRepayAmountScreen payLaterRepayAmountScreen = this.f184524b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterRepayAmountScreen.f0;
                        return new CenteredAmountDelegate(new kj4.c(payLaterRepayAmountScreen, 4));
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterRepayAmountScreen.f0;
                        return new oi9.m(kotlin.jvm.internal.s.n(payLaterRepayAmountScreen.m2()).v);
                    default:
                        KProperty[] kPropertyArr3 = PayLaterRepayAmountScreen.f0;
                        return (j) ((oi9.m) payLaterRepayAmountScreen.f78906b0.getValue()).f225540c.get();
                }
            }
        });
        this.f78907d0 = true;
        this.f78908e0 = v.k(new RowLoadingDelegate(), (CenteredAmountDelegate) lazyY0.getValue(), (FullScreenStateDelegate) lazyY02.getValue());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final boolean getX() {
        return this.f78907d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (oi9.m) this.f78906b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarFooterNextbuttonToolbar.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().o), null, new c(this, continuation, 1), 3);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = h3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarFooterNextbuttonFooterView.f58608l), null, new d(this, continuation, 15), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar2 = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar2, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar2.j0(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.f78908e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        Clause textClause = uiState.f184539a;
        if (textClause == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(textClause);
        Clause clause = uiState.f184541c;
        if (clause != null) {
            FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = h3().f174558c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
            screenRecyclerNavbarFooterNextbuttonFooterView.setTextClause(clause);
        }
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView2 = h3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView2, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView2.setVisibility(clause != null ? 0 : 8);
        f fVar = uiState.d;
        if (fVar != null) {
            i3().setText(fVar.f184529a);
            i3().setEnabled(fVar.f184530b);
            i3().setTag(fVar.f184531c);
        }
        i3().setVisibility(fVar != null ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Y;
    }

    public final s h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (s) value;
    }

    public final LargeActionButton i3() {
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = h3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        return screenRecyclerNavbarFooterNextbuttonButton;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f78905a0);
    }
}
