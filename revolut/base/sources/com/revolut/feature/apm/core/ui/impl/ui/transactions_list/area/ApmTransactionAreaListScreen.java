package com.revolut.feature.apm.core.ui.impl.ui.transactions_list.area;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.area.ApmTransactionAreaListScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e12.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m12.d;
import nuh.j;
import o42.b;
import o42.c;
import o42.g;
import p12.j0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transactions_list/area/ApmTransactionAreaListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lo42/g;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmTransactionAreaListScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ApmTransactionAreaListScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenApmTransactionListBinding;", 0))};
    public final ApmTransactionAreaListInputData K;
    public final f L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ApmTransactionAreaListScreen(ApmTransactionAreaListInputData inputData, f extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        this.M = R$layout.screen_apm_transaction_list;
        this.N = true;
        this.O = s.t(this, b.f);
        this.P = w.y0(new o23.b(6));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: o42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTransactionAreaListScreen f221978b;

            {
                this.f221978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmTransactionAreaListScreen apmTransactionAreaListScreen = this.f221978b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTransactionAreaListScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) apmTransactionAreaListScreen.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTransactionAreaListScreen.V;
                        ApmTransactionAreaListScreen apmTransactionAreaListScreen2 = this.f221978b;
                        return dli.f.a(apmTransactionAreaListScreen2, (h) apmTransactionAreaListScreen2.U.getValue(), v.k((RowDelegate) apmTransactionAreaListScreen2.P.getValue(), (SwipeToActionDelegate) apmTransactionAreaListScreen2.Q.getValue(), (FullScreenStateDelegate) apmTransactionAreaListScreen2.R.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate()), R$id.apmTransactionList_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmTransactionAreaListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmTransactionAreaListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        e12.f fVar = apmTransactionAreaListScreen.L;
                        fVar.getClass();
                        return new j0(vVar, fVar);
                    default:
                        KProperty[] kPropertyArr4 = ApmTransactionAreaListScreen.V;
                        return (h) ((j0) apmTransactionAreaListScreen.T.getValue()).f231690c.get();
                }
            }
        });
        this.R = w.y0(new o23.b(7));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: o42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTransactionAreaListScreen f221978b;

            {
                this.f221978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmTransactionAreaListScreen apmTransactionAreaListScreen = this.f221978b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTransactionAreaListScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) apmTransactionAreaListScreen.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTransactionAreaListScreen.V;
                        ApmTransactionAreaListScreen apmTransactionAreaListScreen2 = this.f221978b;
                        return dli.f.a(apmTransactionAreaListScreen2, (h) apmTransactionAreaListScreen2.U.getValue(), v.k((RowDelegate) apmTransactionAreaListScreen2.P.getValue(), (SwipeToActionDelegate) apmTransactionAreaListScreen2.Q.getValue(), (FullScreenStateDelegate) apmTransactionAreaListScreen2.R.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate()), R$id.apmTransactionList_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmTransactionAreaListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmTransactionAreaListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        e12.f fVar = apmTransactionAreaListScreen.L;
                        fVar.getClass();
                        return new j0(vVar, fVar);
                    default:
                        KProperty[] kPropertyArr4 = ApmTransactionAreaListScreen.V;
                        return (h) ((j0) apmTransactionAreaListScreen.T.getValue()).f231690c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: o42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTransactionAreaListScreen f221978b;

            {
                this.f221978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmTransactionAreaListScreen apmTransactionAreaListScreen = this.f221978b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTransactionAreaListScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) apmTransactionAreaListScreen.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTransactionAreaListScreen.V;
                        ApmTransactionAreaListScreen apmTransactionAreaListScreen2 = this.f221978b;
                        return dli.f.a(apmTransactionAreaListScreen2, (h) apmTransactionAreaListScreen2.U.getValue(), v.k((RowDelegate) apmTransactionAreaListScreen2.P.getValue(), (SwipeToActionDelegate) apmTransactionAreaListScreen2.Q.getValue(), (FullScreenStateDelegate) apmTransactionAreaListScreen2.R.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate()), R$id.apmTransactionList_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmTransactionAreaListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmTransactionAreaListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        e12.f fVar = apmTransactionAreaListScreen.L;
                        fVar.getClass();
                        return new j0(vVar, fVar);
                    default:
                        KProperty[] kPropertyArr4 = ApmTransactionAreaListScreen.V;
                        return (h) ((j0) apmTransactionAreaListScreen.T.getValue()).f231690c.get();
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: o42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTransactionAreaListScreen f221978b;

            {
                this.f221978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ApmTransactionAreaListScreen apmTransactionAreaListScreen = this.f221978b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTransactionAreaListScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) apmTransactionAreaListScreen.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTransactionAreaListScreen.V;
                        ApmTransactionAreaListScreen apmTransactionAreaListScreen2 = this.f221978b;
                        return dli.f.a(apmTransactionAreaListScreen2, (h) apmTransactionAreaListScreen2.U.getValue(), v.k((RowDelegate) apmTransactionAreaListScreen2.P.getValue(), (SwipeToActionDelegate) apmTransactionAreaListScreen2.Q.getValue(), (FullScreenStateDelegate) apmTransactionAreaListScreen2.R.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate()), R$id.apmTransactionList_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmTransactionAreaListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmTransactionAreaListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        e12.f fVar = apmTransactionAreaListScreen.L;
                        fVar.getClass();
                        return new j0(vVar, fVar);
                    default:
                        KProperty[] kPropertyArr4 = ApmTransactionAreaListScreen.V;
                        return (h) ((j0) apmTransactionAreaListScreen.T.getValue()).f231690c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (o42.h) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((d) value).f201199b;
        ApmTransactionAreaListInputData apmTransactionAreaListInputData = this.K;
        navBarWithToolbar.setToolbarTitle(apmTransactionAreaListInputData.f62310a);
        navBarWithToolbar.setTitle(apmTransactionAreaListInputData.f62310a, null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((d) value).f201199b.f59410q), null, new j(this, null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), null, new o42.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
