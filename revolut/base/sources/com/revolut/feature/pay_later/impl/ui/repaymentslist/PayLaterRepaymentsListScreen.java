package com.revolut.feature.pay_later.impl.ui.repaymentslist;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.impl.ui.repaymentslist.PayLaterRepaymentsListScreen;
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
import mc9.n;
import nfj.j2;
import nk4.d;
import nk9.c;
import nk9.i;
import no.m;
import oi9.o;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/repaymentslist/PayLaterRepaymentsListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnk9/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterRepaymentsListScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, q> implements m {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PayLaterRepaymentsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f78918a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78919b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f78920d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f78921e0;

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

    public PayLaterRepaymentsListScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = b.f161739a;
        this.V = s.t(this, a.f);
        Lazy lazyY0 = w.y0(new d(5));
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new d(6));
        this.X = lazyY02;
        Lazy lazyY03 = w.y0(new d(7));
        this.Y = lazyY03;
        this.Z = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.f78918a0 = true;
        final int i2 = 0;
        this.f78919b0 = w.y0(new Function0(this) { // from class: nk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterRepaymentsListScreen f216758b;

            {
                this.f216758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PayLaterRepaymentsListScreen payLaterRepaymentsListScreen = this.f216758b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterRepaymentsListScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(payLaterRepaymentsListScreen.m2()).a().get(oi9.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oi9.f.class, " is not found"));
                        }
                        oi9.f fVar = ((oi9.f) aVar2.b()).v;
                        oi9.o oVar = new oi9.o();
                        oVar.f225550a = e4m.b.b(e4m.c.a(payLaterRepaymentsListScreen));
                        int i5 = 9;
                        oVar.f225551b = e4m.b.b(new oi9.a(fVar, oVar, 2, i5));
                        oVar.f225552c = e4m.b.b(new oi9.a(fVar, oVar, 1, i5));
                        oVar.d = e4m.b.b(new oi9.a(fVar, oVar, 0, i5));
                        oVar.e = e4m.b.b(new oi9.a(fVar, oVar, 4, i5));
                        oVar.f = e4m.b.b(new oi9.a(fVar, oVar, 3, i5));
                        return oVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterRepaymentsListScreen.f0;
                        return (h) ((oi9.o) payLaterRepaymentsListScreen.f78919b0.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterRepaymentsListScreen.f0;
                        return (j60.a) ((oi9.o) payLaterRepaymentsListScreen.f78919b0.getValue()).f225552c.get();
                }
            }
        });
        this.c0 = w.y0(new Function0(this) { // from class: nk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterRepaymentsListScreen f216758b;

            {
                this.f216758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PayLaterRepaymentsListScreen payLaterRepaymentsListScreen = this.f216758b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterRepaymentsListScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(payLaterRepaymentsListScreen.m2()).a().get(oi9.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oi9.f.class, " is not found"));
                        }
                        oi9.f fVar = ((oi9.f) aVar2.b()).v;
                        oi9.o oVar = new oi9.o();
                        oVar.f225550a = e4m.b.b(e4m.c.a(payLaterRepaymentsListScreen));
                        int i5 = 9;
                        oVar.f225551b = e4m.b.b(new oi9.a(fVar, oVar, 2, i5));
                        oVar.f225552c = e4m.b.b(new oi9.a(fVar, oVar, 1, i5));
                        oVar.d = e4m.b.b(new oi9.a(fVar, oVar, 0, i5));
                        oVar.e = e4m.b.b(new oi9.a(fVar, oVar, 4, i5));
                        oVar.f = e4m.b.b(new oi9.a(fVar, oVar, 3, i5));
                        return oVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterRepaymentsListScreen.f0;
                        return (h) ((oi9.o) payLaterRepaymentsListScreen.f78919b0.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterRepaymentsListScreen.f0;
                        return (j60.a) ((oi9.o) payLaterRepaymentsListScreen.f78919b0.getValue()).f225552c.get();
                }
            }
        });
        final int i3 = 2;
        this.f78920d0 = w.y0(new Function0(this) { // from class: nk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterRepaymentsListScreen f216758b;

            {
                this.f216758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                PayLaterRepaymentsListScreen payLaterRepaymentsListScreen = this.f216758b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterRepaymentsListScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(payLaterRepaymentsListScreen.m2()).a().get(oi9.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oi9.f.class, " is not found"));
                        }
                        oi9.f fVar = ((oi9.f) aVar2.b()).v;
                        oi9.o oVar = new oi9.o();
                        oVar.f225550a = e4m.b.b(e4m.c.a(payLaterRepaymentsListScreen));
                        int i5 = 9;
                        oVar.f225551b = e4m.b.b(new oi9.a(fVar, oVar, 2, i5));
                        oVar.f225552c = e4m.b.b(new oi9.a(fVar, oVar, 1, i5));
                        oVar.d = e4m.b.b(new oi9.a(fVar, oVar, 0, i5));
                        oVar.e = e4m.b.b(new oi9.a(fVar, oVar, 4, i5));
                        oVar.f = e4m.b.b(new oi9.a(fVar, oVar, 3, i5));
                        return oVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterRepaymentsListScreen.f0;
                        return (h) ((oi9.o) payLaterRepaymentsListScreen.f78919b0.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterRepaymentsListScreen.f0;
                        return (j60.a) ((oi9.o) payLaterRepaymentsListScreen.f78919b0.getValue()).f225552c.get();
                }
            }
        });
        this.f78921e0 = v.k((RowDelegate) lazyY0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) lazyY02.getValue(), (LargeActionButtonDelegate) lazyY03.getValue(), new ProgressStepsDelegate());
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
        return (o) this.f78919b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new j2(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.s0()), null, new nk9.b(2, 4, nk9.h.class, T2(), "onActionClicked", "onActionClicked(Lcom/revolut/core/ui_kit/views/ActionsView$Item;)V"), 3);
        ?? r122 = this.W;
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) r122.getValue()).f53218h), null, new c(2, 4, nk9.h.class, T2(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) r122.getValue()).f53226s), null, new n(2, T2(), nk9.h.class, "onClauseClicked", "onClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.X.getValue()).f52371h.f121375b), null, new nk9.d(2, 4, nk9.h.class, T2(), "onFullScreenStateClicked", "onFullScreenStateClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.Y.getValue()).d.f121375b), null, new nk9.e(2, 4, nk9.h.class, T2(), "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.f78920d0.getValue()).d(v.k((RowDelegate) this.W.getValue(), (LargeActionButtonDelegate) this.Y.getValue()));
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78921e0() {
        return this.f78921e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, jki.o oVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f216762b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f216763c;
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
            z = true;
        } else {
            z = false;
        }
        navBarWithToolbar.setDescriptionVisible(z);
        navBarWithToolbar.setActions(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.Z;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final nk9.h T2() {
        return (nk9.h) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f78918a0);
    }
}
