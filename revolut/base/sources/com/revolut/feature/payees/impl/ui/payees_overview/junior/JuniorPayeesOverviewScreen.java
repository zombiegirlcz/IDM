package com.revolut.feature.payees.impl.ui.payees_overview.junior;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.payees.impl.ui.payees_overview.junior.JuniorPayeesOverviewScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import um9.c;
import um9.d;
import um9.f;
import um9.g;
import um9.h;
import um9.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_overview/junior/JuniorPayeesOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lum9/g;", "Ldli/a;", "Lum9/i;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPayeesOverviewScreen extends ViewController<g> implements dli.a {
    public final f K;
    public final int L;
    public final RowDelegate M;
    public final ListSubheaderDelegate N;
    public final SwipeToActionDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorPayeesOverviewScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new ListSubheaderDelegate();
        this.O = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: um9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPayeesOverviewScreen f281270b;

            {
                this.f281270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorPayeesOverviewScreen juniorPayeesOverviewScreen = this.f281270b;
                switch (i2) {
                    case 0:
                        int i3 = R$id.recyclerView;
                        JuniorPayeesOverviewScreen juniorPayeesOverviewScreen2 = this.f281270b;
                        return dli.f.a(juniorPayeesOverviewScreen2, (h) juniorPayeesOverviewScreen2.R.getValue(), v.k(juniorPayeesOverviewScreen2.O, new RowLoadingDelegate(), juniorPayeesOverviewScreen2.N, new FullScreenStateDelegate(), juniorPayeesOverviewScreen2.M), i3, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = juniorPayeesOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_overview.junior.di.JuniorPayeesOverviewScreenInjector");
                        hm9.g gVar = (hm9.g) bVarU2;
                        hm9.b bVar = gVar.f153563b;
                        hm9.g gVar2 = gVar.f153564c;
                        f fVar = juniorPayeesOverviewScreen.K;
                        fVar.getClass();
                        return new hm9.a(bVar, gVar2, fVar);
                    default:
                        return (h) ((hm9.a) juniorPayeesOverviewScreen.Q.getValue()).f153544c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: um9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPayeesOverviewScreen f281270b;

            {
                this.f281270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorPayeesOverviewScreen juniorPayeesOverviewScreen = this.f281270b;
                switch (i22) {
                    case 0:
                        int i3 = R$id.recyclerView;
                        JuniorPayeesOverviewScreen juniorPayeesOverviewScreen2 = this.f281270b;
                        return dli.f.a(juniorPayeesOverviewScreen2, (h) juniorPayeesOverviewScreen2.R.getValue(), v.k(juniorPayeesOverviewScreen2.O, new RowLoadingDelegate(), juniorPayeesOverviewScreen2.N, new FullScreenStateDelegate(), juniorPayeesOverviewScreen2.M), i3, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = juniorPayeesOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_overview.junior.di.JuniorPayeesOverviewScreenInjector");
                        hm9.g gVar = (hm9.g) bVarU2;
                        hm9.b bVar = gVar.f153563b;
                        hm9.g gVar2 = gVar.f153564c;
                        f fVar = juniorPayeesOverviewScreen.K;
                        fVar.getClass();
                        return new hm9.a(bVar, gVar2, fVar);
                    default:
                        return (h) ((hm9.a) juniorPayeesOverviewScreen.Q.getValue()).f153544c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: um9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPayeesOverviewScreen f281270b;

            {
                this.f281270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorPayeesOverviewScreen juniorPayeesOverviewScreen = this.f281270b;
                switch (i22) {
                    case 0:
                        int i32 = R$id.recyclerView;
                        JuniorPayeesOverviewScreen juniorPayeesOverviewScreen2 = this.f281270b;
                        return dli.f.a(juniorPayeesOverviewScreen2, (h) juniorPayeesOverviewScreen2.R.getValue(), v.k(juniorPayeesOverviewScreen2.O, new RowLoadingDelegate(), juniorPayeesOverviewScreen2.N, new FullScreenStateDelegate(), juniorPayeesOverviewScreen2.M), i32, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = juniorPayeesOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_overview.junior.di.JuniorPayeesOverviewScreenInjector");
                        hm9.g gVar = (hm9.g) bVarU2;
                        hm9.b bVar = gVar.f153563b;
                        hm9.g gVar2 = gVar.f153564c;
                        f fVar = juniorPayeesOverviewScreen.K;
                        fVar.getClass();
                        return new hm9.a(bVar, gVar2, fVar);
                    default:
                        return (h) ((hm9.a) juniorPayeesOverviewScreen.Q.getValue()).f153544c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hm9.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ListSubheaderDelegate listSubheaderDelegate = this.N;
        ViewController.P2(this, rd0.e.b(listSubheaderDelegate.e), new um9.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(listSubheaderDelegate.f52707c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
