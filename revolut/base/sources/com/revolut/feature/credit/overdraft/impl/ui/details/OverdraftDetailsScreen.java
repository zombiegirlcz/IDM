package com.revolut.feature.credit.overdraft.impl.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u95.b;
import u95.c;
import u95.d;
import u95.f;
import u95.g;
import u95.i;
import u95.j;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu95/j;", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OverdraftDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(OverdraftDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final OverdraftDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public OverdraftDetailsScreen(OverdraftDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: u95.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverdraftDetailsScreen f278389b;

            {
                this.f278389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OverdraftDetailsScreen overdraftDetailsScreen = this.f278389b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OverdraftDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(overdraftDetailsScreen.m2()).a().get(k95.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k95.a.class, " is not found"));
                        }
                        k95.a aVar3 = (k95.a) aVar2.b();
                        Intrinsics.i(aVar3, "null cannot be cast to non-null type com.revolut.feature.credit.overdraft.impl.ui.details.di.OverdraftDetailsScreenInjector");
                        k95.a aVar4 = aVar3.f182273j;
                        OverdraftDetailsScreenContract$InputData overdraftDetailsScreenContract$InputData = overdraftDetailsScreen.K;
                        overdraftDetailsScreenContract$InputData.getClass();
                        return new k95.b(aVar4, overdraftDetailsScreen, overdraftDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OverdraftDetailsScreen.W;
                        return (i) ((k95.b) overdraftDetailsScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = OverdraftDetailsScreen.W;
                        OverdraftDetailsScreen overdraftDetailsScreen2 = this.f278389b;
                        return dli.f.a(overdraftDetailsScreen2, overdraftDetailsScreen2.R2(), v.k((FullScreenStateDelegate) overdraftDetailsScreen2.P.getValue(), (AccountCellItemDelegate) overdraftDetailsScreen2.Q.getValue(), (RowDelegate) overdraftDetailsScreen2.R.getValue(), (CellDetailsDelegate) overdraftDetailsScreen2.S.getValue(), (ListSubheaderDelegate) overdraftDetailsScreen2.T.getValue(), new TextDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: u95.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverdraftDetailsScreen f278389b;

            {
                this.f278389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OverdraftDetailsScreen overdraftDetailsScreen = this.f278389b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OverdraftDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(overdraftDetailsScreen.m2()).a().get(k95.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k95.a.class, " is not found"));
                        }
                        k95.a aVar3 = (k95.a) aVar2.b();
                        Intrinsics.i(aVar3, "null cannot be cast to non-null type com.revolut.feature.credit.overdraft.impl.ui.details.di.OverdraftDetailsScreenInjector");
                        k95.a aVar4 = aVar3.f182273j;
                        OverdraftDetailsScreenContract$InputData overdraftDetailsScreenContract$InputData = overdraftDetailsScreen.K;
                        overdraftDetailsScreenContract$InputData.getClass();
                        return new k95.b(aVar4, overdraftDetailsScreen, overdraftDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OverdraftDetailsScreen.W;
                        return (i) ((k95.b) overdraftDetailsScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = OverdraftDetailsScreen.W;
                        OverdraftDetailsScreen overdraftDetailsScreen2 = this.f278389b;
                        return dli.f.a(overdraftDetailsScreen2, overdraftDetailsScreen2.R2(), v.k((FullScreenStateDelegate) overdraftDetailsScreen2.P.getValue(), (AccountCellItemDelegate) overdraftDetailsScreen2.Q.getValue(), (RowDelegate) overdraftDetailsScreen2.R.getValue(), (CellDetailsDelegate) overdraftDetailsScreen2.S.getValue(), (ListSubheaderDelegate) overdraftDetailsScreen2.T.getValue(), new TextDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new u6h.h(15));
        this.Q = w.y0(new u6h.h(16));
        this.R = w.y0(new u6h.h(17));
        this.S = w.y0(new u6h.h(18));
        this.T = w.y0(new u6h.h(19));
        this.U = w.y0(new u6h.h(20));
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: u95.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverdraftDetailsScreen f278389b;

            {
                this.f278389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OverdraftDetailsScreen overdraftDetailsScreen = this.f278389b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OverdraftDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(overdraftDetailsScreen.m2()).a().get(k95.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k95.a.class, " is not found"));
                        }
                        k95.a aVar3 = (k95.a) aVar2.b();
                        Intrinsics.i(aVar3, "null cannot be cast to non-null type com.revolut.feature.credit.overdraft.impl.ui.details.di.OverdraftDetailsScreenInjector");
                        k95.a aVar4 = aVar3.f182273j;
                        OverdraftDetailsScreenContract$InputData overdraftDetailsScreenContract$InputData = overdraftDetailsScreen.K;
                        overdraftDetailsScreenContract$InputData.getClass();
                        return new k95.b(aVar4, overdraftDetailsScreen, overdraftDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OverdraftDetailsScreen.W;
                        return (i) ((k95.b) overdraftDetailsScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = OverdraftDetailsScreen.W;
                        OverdraftDetailsScreen overdraftDetailsScreen2 = this.f278389b;
                        return dli.f.a(overdraftDetailsScreen2, overdraftDetailsScreen2.R2(), v.k((FullScreenStateDelegate) overdraftDetailsScreen2.P.getValue(), (AccountCellItemDelegate) overdraftDetailsScreen2.Q.getValue(), (RowDelegate) overdraftDetailsScreen2.R.getValue(), (CellDetailsDelegate) overdraftDetailsScreen2.S.getValue(), (ListSubheaderDelegate) overdraftDetailsScreen2.T.getValue(), new TextDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k95.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.overdraft_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.overdraft_details_title, null, null, 14), null);
        ((j60.a) ((k95.b) this.N.getValue()).d.get()).d(u.c((RowDelegate) this.U.getValue()));
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new u07.b(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(((AccountCellItemDelegate) this.Q.getValue()).f51551c.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.S.getValue()).d), new u95.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.U.getValue()).f53218h), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
