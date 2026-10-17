package com.revolut.feature.pay_later.impl.ui.planslist;

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
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import exe.k;
import g85.f;
import gk9.i;
import gk9.j;
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
import oi9.l;
import rd0.e;
import te0.w;
import vc.s;
import vkm.d;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/planslist/PayLaterPlansListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgk9/j;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterPlansListScreen extends BaseRecyclerViewScreen<j, IOData$EmptyInput, q> implements m {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PayLaterPlansListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f78899a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f78900b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f78901d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f78902e0;

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

    public PayLaterPlansListScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = b.f161739a;
        this.V = s.t(this, a.f);
        Lazy lazyY0 = w.y0(new gaa.b(24));
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new gaa.b(25));
        this.X = lazyY02;
        Lazy lazyY03 = w.y0(new gaa.b(26));
        this.Y = lazyY03;
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: gk9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterPlansListScreen f144353b;

            {
                this.f144353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayLaterPlansListScreen payLaterPlansListScreen = this.f144353b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterPlansListScreen.f0;
                        return (j60.a) ((oi9.l) payLaterPlansListScreen.c0.getValue()).f225537c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterPlansListScreen.f0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterPlansListScreen.m2()).v;
                        oi9.l lVar = new oi9.l();
                        lVar.f225535a = e4m.b.b(e4m.c.a(payLaterPlansListScreen));
                        int i3 = 6;
                        lVar.f225536b = e4m.b.b(new oi9.a(fVar, lVar, 2, i3));
                        lVar.f225537c = e4m.b.b(new oi9.a(fVar, lVar, 1, i3));
                        lVar.d = e4m.b.b(new oi9.a(fVar, lVar, 0, i3));
                        lVar.e = e4m.b.b(new oi9.a(fVar, lVar, 4, i3));
                        lVar.f = e4m.b.b(new oi9.a(fVar, lVar, 3, i3));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr3 = PayLaterPlansListScreen.f0;
                        return (i) ((oi9.l) payLaterPlansListScreen.c0.getValue()).f.get();
                }
            }
        });
        this.f78899a0 = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.f78900b0 = true;
        this.c0 = w.y0(new Function0(this) { // from class: gk9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterPlansListScreen f144353b;

            {
                this.f144353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayLaterPlansListScreen payLaterPlansListScreen = this.f144353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterPlansListScreen.f0;
                        return (j60.a) ((oi9.l) payLaterPlansListScreen.c0.getValue()).f225537c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterPlansListScreen.f0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterPlansListScreen.m2()).v;
                        oi9.l lVar = new oi9.l();
                        lVar.f225535a = e4m.b.b(e4m.c.a(payLaterPlansListScreen));
                        int i3 = 6;
                        lVar.f225536b = e4m.b.b(new oi9.a(fVar, lVar, 2, i3));
                        lVar.f225537c = e4m.b.b(new oi9.a(fVar, lVar, 1, i3));
                        lVar.d = e4m.b.b(new oi9.a(fVar, lVar, 0, i3));
                        lVar.e = e4m.b.b(new oi9.a(fVar, lVar, 4, i3));
                        lVar.f = e4m.b.b(new oi9.a(fVar, lVar, 3, i3));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr3 = PayLaterPlansListScreen.f0;
                        return (i) ((oi9.l) payLaterPlansListScreen.c0.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.f78901d0 = w.y0(new Function0(this) { // from class: gk9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterPlansListScreen f144353b;

            {
                this.f144353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayLaterPlansListScreen payLaterPlansListScreen = this.f144353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterPlansListScreen.f0;
                        return (j60.a) ((oi9.l) payLaterPlansListScreen.c0.getValue()).f225537c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterPlansListScreen.f0;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterPlansListScreen.m2()).v;
                        oi9.l lVar = new oi9.l();
                        lVar.f225535a = e4m.b.b(e4m.c.a(payLaterPlansListScreen));
                        int i32 = 6;
                        lVar.f225536b = e4m.b.b(new oi9.a(fVar, lVar, 2, i32));
                        lVar.f225537c = e4m.b.b(new oi9.a(fVar, lVar, 1, i32));
                        lVar.d = e4m.b.b(new oi9.a(fVar, lVar, 0, i32));
                        lVar.e = e4m.b.b(new oi9.a(fVar, lVar, 4, i32));
                        lVar.f = e4m.b.b(new oi9.a(fVar, lVar, 3, i32));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr3 = PayLaterPlansListScreen.f0;
                        return (i) ((oi9.l) payLaterPlansListScreen.c0.getValue()).f.get();
                }
            }
        });
        this.f78902e0 = v.k((RowDelegate) lazyY0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) lazyY02.getValue(), (LargeActionButtonDelegate) lazyY03.getValue(), new ProgressStepsDelegate());
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
        return (l) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f78901d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new f(this, null, 16), 3);
        ?? r110 = this.W;
        d dVarB = e.b(((RowDelegate) r110.getValue()).f53218h);
        ?? r122 = this.f78901d0;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new gk9.d(2, 4, i.class, (i) r122.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) r110.getValue()).f53226s), null, new k(2, (i) r122.getValue(), i.class, "onClauseClicked", "onClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.X.getValue()).f52371h.f121375b), null, new gk9.e(2, 4, i.class, (i) r122.getValue(), "onFullScreenStateClicked", "onFullScreenStateClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.Y.getValue()).d.f121375b), null, new gk9.f(2, 4, i.class, (i) r122.getValue(), "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.Z.getValue()).d(v.k((RowDelegate) this.W.getValue(), (LargeActionButtonDelegate) this.Y.getValue()));
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78902e0() {
        return this.f78902e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f144358b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f144359c;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.f78899a0;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f78900b0);
    }
}
