package com.revolut.feature.payments.who_to_transfer.impl.transfer.selection;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b3a.f;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.feature.payments.who_to_transfer.impl.R$layout;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import frl.a;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ofm.q;
import rd0.e;
import s3a.l;
import te0.w;
import v0c.b;
import v2g.i;
import v4a.c;
import v4a.d;
import v4a.g;
import vc.s;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/transfer/selection/RecipientSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lv4a/g;", "Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionInputData;", "Lb3a/f;", "Lno/m;", "", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecipientSelectionScreen extends BaseRecyclerViewScreen<g, RecipientSelectionInputData, f> implements m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f80137h0 = {o0.f186429a.j(new h0(RecipientSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsSelectionBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final boolean V;
    public final int W;
    public final int X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f80138a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f80139b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f80140d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SwipeToActionDelegate f80141e0;
    public final Object f0;
    public final Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientSelectionScreen(RecipientSelectionInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137496c;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = true;
        this.W = R$layout.screen_payments_selection;
        this.X = R$id.paymentsSelectionScreen_recyclerView;
        this.Y = s.t(this, c.f);
        this.Z = w.y0(new b(this, inputData, 13));
        this.f80138a0 = w.y0(new uz8.s(29));
        this.f80139b0 = w.y0(new v4a.a(0));
        this.c0 = w.y0(new v4a.a(1));
        Lazy lazyY0 = w.y0(new v4a.a(2));
        this.f80140d0 = lazyY0;
        this.f80141e0 = new SwipeToActionDelegate((RowDelegate) lazyY0.getValue(), false);
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: v4a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecipientSelectionScreen f285995b;

            {
                this.f285995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecipientSelectionScreen recipientSelectionScreen = this.f285995b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecipientSelectionScreen.f80137h0;
                        return v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (BannerDelegate) recipientSelectionScreen.f80138a0.getValue(), (ActionsDelegate) recipientSelectionScreen.f80139b0.getValue(), (RewardsGridDelegate) recipientSelectionScreen.c0.getValue(), (RowDelegate) recipientSelectionScreen.f80140d0.getValue(), recipientSelectionScreen.f80141e0);
                    default:
                        KProperty[] kPropertyArr2 = RecipientSelectionScreen.f80137h0;
                        return (f) ((s3a.l) recipientSelectionScreen.Z.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: v4a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecipientSelectionScreen f285995b;

            {
                this.f285995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecipientSelectionScreen recipientSelectionScreen = this.f285995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecipientSelectionScreen.f80137h0;
                        return v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (BannerDelegate) recipientSelectionScreen.f80138a0.getValue(), (ActionsDelegate) recipientSelectionScreen.f80139b0.getValue(), (RewardsGridDelegate) recipientSelectionScreen.c0.getValue(), (RowDelegate) recipientSelectionScreen.f80140d0.getValue(), recipientSelectionScreen.f80141e0);
                    default:
                        KProperty[] kPropertyArr2 = RecipientSelectionScreen.f80137h0;
                        return (f) ((s3a.l) recipientSelectionScreen.Z.getValue()).f.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((v4a.m) T2()).v2(b3a.c.f12016a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final /* bridge */ /* synthetic */ void Z2(jki.m mVar, o oVar) {
        g3((g) mVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        h3().d.setItemAnimator(null);
        NavBarWithToolbar navBarWithToolbar = h3().f241923c;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new u29.c(navBarWithToolbar, this, continuation, 9), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57336l), null, new v44.e(this, navBarWithToolbar, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new uwe.f(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57337m), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((ActionsDelegate) this.f80139b0.getValue()).f51611c.f121375b, new i(11))), null, new d(this, continuation, 1), 3);
        r rVarMerge = r.merge(w.a0(((RewardsGridDelegate) this.c0.getValue()).f53209c.d, new i(12)), w.a0(((RowDelegate) this.f80140d0.getValue()).f53218h, new i(13)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(this.f80141e0.f, new i(10))), null, new d(this, continuation, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        y.g(h(), m2());
        LabeledVerticalScrollView labeledVerticalScrollView = h3().f241922b;
        RecyclerView recyclerView = h();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        labeledVerticalScrollView.d = recyclerView;
        NavBarWithToolbar navBarWithToolbar = h3().f241923c;
        Clause textLocalisedClause = ((RecipientSelectionInputData) this.G).f80015a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.payments_who_to_transfer_pay_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.payments_global_search_bar, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final /* bridge */ /* synthetic */ void Z2(n nVar, o oVar) {
        g3((g) nVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF93168b0() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.X;
    }

    public final void g3(g uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        koi.h hVarD3 = d3();
        List list = uiState.f286002a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((h3a.m) it8.next()).f149065b);
        }
        hVarD3.c(arrayList);
        LabeledVerticalScrollView labeledVerticalScrollView = h3().f241922b;
        List list2 = uiState.f286002a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((h3a.m) it9.next()).f149064a);
        }
        labeledVerticalScrollView.setLabels(arrayList2);
        h3().f241923c.setMenuItems(uiState.f286003b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    public final q3a.c h3() {
        ViewBinding value = this.Y.getValue(this, f80137h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q3a.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final v4a.f T2() {
        return (v4a.f) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
