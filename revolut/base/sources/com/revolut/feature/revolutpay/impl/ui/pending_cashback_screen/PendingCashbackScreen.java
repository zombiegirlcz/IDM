package com.revolut.feature.revolutpay.impl.ui.pending_cashback_screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.R$id;
import com.revolut.feature.revolutpay.impl.R$layout;
import com.revolut.feature.revolutpay.impl.ui.pending_cashback_screen.PendingCashbackScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import java.util.List;
import k9c.d;
import k9c.g;
import k9c.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m7c.b;
import no.m;
import p12.f0;
import p7c.o;
import p7c.r;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/pending_cashback_screen/PendingCashbackScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lk9c/h;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingCashbackScreen extends BaseRecyclerViewScreen<h, IOData$EmptyInput, q> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PendingCashbackScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/impl/databinding/ScreenPendingCashbackBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final ao.h X;
    public final FullScreenStateDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f84512a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f84513b0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/revolutpay/impl/databinding/ScreenPendingCashbackBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.pendingCashbackScreen_footerTextView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.pendingCashbackScreen_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.pendingCashbackScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new b((ControllerContainerCoordinatorLayout) p0, footerTextView, navBarWithToolbar);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public PendingCashbackScreen() {
        super(IOData$EmptyInput.f98299a);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.d;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_pending_cashback;
        this.W = R$id.pendingCashbackScreen_recyclerView;
        this.X = s.t(this, a.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: k9c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingCashbackScreen f182309b;

            {
                this.f182309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PendingCashbackScreen pendingCashbackScreen = this.f182309b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PendingCashbackScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(pendingCashbackScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        o oVar = new o();
                        oVar.f233653a = e4m.b.b(e4m.c.a(pendingCashbackScreen));
                        int i3 = 21;
                        oVar.f233654b = e4m.b.b(new f0(rVar, oVar, 0, i3));
                        oVar.f233655c = e4m.b.b(new f0(rVar, oVar, 2, i3));
                        oVar.d = e4m.b.b(new f0(rVar, oVar, 3, i3));
                        oVar.e = e4m.b.b(new f0(rVar, oVar, 1, i3));
                        return oVar;
                    default:
                        KProperty[] kPropertyArr2 = PendingCashbackScreen.c0;
                        return (g) ((o) pendingCashbackScreen.Z.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.f84512a0 = v.k(new RowDelegate(null, null, 7), new CounterTextDelegate(), new ListSubheaderDelegate(), fullScreenStateDelegate, new RowLoadingDelegate());
        this.f84513b0 = w.y0(new Function0(this) { // from class: k9c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingCashbackScreen f182309b;

            {
                this.f182309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PendingCashbackScreen pendingCashbackScreen = this.f182309b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingCashbackScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(pendingCashbackScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        o oVar = new o();
                        oVar.f233653a = e4m.b.b(e4m.c.a(pendingCashbackScreen));
                        int i3 = 21;
                        oVar.f233654b = e4m.b.b(new f0(rVar, oVar, 0, i3));
                        oVar.f233655c = e4m.b.b(new f0(rVar, oVar, 2, i3));
                        oVar.d = e4m.b.b(new f0(rVar, oVar, 3, i3));
                        oVar.e = e4m.b.b(new f0(rVar, oVar, 1, i3));
                        return oVar;
                    default:
                        KProperty[] kPropertyArr2 = PendingCashbackScreen.c0;
                        return (g) ((o) pendingCashbackScreen.Z.getValue()).e.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (o) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f84513b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f203381c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f203380b.f58608l), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f52371h.f121375b), null, new k9c.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f203381c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF84512a0() {
        return this.f84512a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f203381c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Clause clause = uiState.f182312b;
        Clause clause2 = uiState.f182313c;
        if (clause != null) {
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setEndIconImage(uiState.d);
        navBarWithToolbar.setEndIconBadgeImage(uiState.e);
        h3().f203380b.setTextClause(uiState.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final b h3() {
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }
}
