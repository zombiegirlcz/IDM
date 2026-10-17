package com.revolut.feature.instruments.trend.collections.impl.ui.collection;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import fi7.b;
import fi7.c;
import fi7.d;
import fi7.f;
import fi7.l;
import fi7.n;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import z0h.s1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfi7/n;", "Lz0h/s1;", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsTrendCollectionController extends ViewController<q> implements dli.a, s1 {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(InstrumentsTrendCollectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final l K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final LargeActionButtonDelegate N;
    public final RowDelegate O;
    public final SingleChoiceDelegate P;
    public final TextDelegate Q;
    public final SwipeToActionDelegate R;
    public final Object S;
    public final int T;
    public final Object U;
    public final Object V;

    public InstrumentsTrendCollectionController(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new LargeActionButtonDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new SingleChoiceDelegate();
        this.Q = new TextDelegate();
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: fi7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsTrendCollectionController f135319b;

            {
                this.f135319b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsTrendCollectionController.W;
                        return (h) ((th7.a) ((gi7.a) this.f135319b.V.getValue())).f271311p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsTrendCollectionController.W;
                        InstrumentsTrendCollectionController instrumentsTrendCollectionController = this.f135319b;
                        return dli.f.a(instrumentsTrendCollectionController, instrumentsTrendCollectionController.d(), v.k(instrumentsTrendCollectionController.M, instrumentsTrendCollectionController.N, instrumentsTrendCollectionController.O, new RowLoadingDelegate(), instrumentsTrendCollectionController.Q, instrumentsTrendCollectionController.R), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsTrendCollectionController.W;
                        InstrumentsTrendCollectionController instrumentsTrendCollectionController2 = this.f135319b;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsTrendCollectionController2.m2()).a().get(th7.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", th7.d.class, " is not found"));
                        }
                        th7.b bVar = ((th7.b) ((th7.d) aVar2.b())).f271318l;
                        l lVar = instrumentsTrendCollectionController2.K;
                        lVar.getClass();
                        return new th7.a(bVar, instrumentsTrendCollectionController2, lVar, instrumentsTrendCollectionController2, new o5d.b(instrumentsTrendCollectionController2.R));
                }
            }
        });
        this.T = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: fi7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsTrendCollectionController f135319b;

            {
                this.f135319b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsTrendCollectionController.W;
                        return (h) ((th7.a) ((gi7.a) this.f135319b.V.getValue())).f271311p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsTrendCollectionController.W;
                        InstrumentsTrendCollectionController instrumentsTrendCollectionController = this.f135319b;
                        return dli.f.a(instrumentsTrendCollectionController, instrumentsTrendCollectionController.d(), v.k(instrumentsTrendCollectionController.M, instrumentsTrendCollectionController.N, instrumentsTrendCollectionController.O, new RowLoadingDelegate(), instrumentsTrendCollectionController.Q, instrumentsTrendCollectionController.R), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsTrendCollectionController.W;
                        InstrumentsTrendCollectionController instrumentsTrendCollectionController2 = this.f135319b;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsTrendCollectionController2.m2()).a().get(th7.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", th7.d.class, " is not found"));
                        }
                        th7.b bVar = ((th7.b) ((th7.d) aVar2.b())).f271318l;
                        l lVar = instrumentsTrendCollectionController2.K;
                        lVar.getClass();
                        return new th7.a(bVar, instrumentsTrendCollectionController2, lVar, instrumentsTrendCollectionController2, new o5d.b(instrumentsTrendCollectionController2.R));
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: fi7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsTrendCollectionController f135319b;

            {
                this.f135319b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsTrendCollectionController.W;
                        return (h) ((th7.a) ((gi7.a) this.f135319b.V.getValue())).f271311p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsTrendCollectionController.W;
                        InstrumentsTrendCollectionController instrumentsTrendCollectionController = this.f135319b;
                        return dli.f.a(instrumentsTrendCollectionController, instrumentsTrendCollectionController.d(), v.k(instrumentsTrendCollectionController.M, instrumentsTrendCollectionController.N, instrumentsTrendCollectionController.O, new RowLoadingDelegate(), instrumentsTrendCollectionController.Q, instrumentsTrendCollectionController.R), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsTrendCollectionController.W;
                        InstrumentsTrendCollectionController instrumentsTrendCollectionController2 = this.f135319b;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsTrendCollectionController2.m2()).a().get(th7.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", th7.d.class, " is not found"));
                        }
                        th7.b bVar = ((th7.b) ((th7.d) aVar2.b())).f271318l;
                        l lVar = instrumentsTrendCollectionController2.K;
                        lVar.getClass();
                        return new th7.a(bVar, instrumentsTrendCollectionController2, lVar, instrumentsTrendCollectionController2, new o5d.b(instrumentsTrendCollectionController2.R));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f135334a, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f135335b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setTopActions(uiState.f135336c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gi7.a) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((th7.a) ((gi7.a) this.V.getValue())).f271305g.get()).d(u.c(this.P));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.C0()), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new z(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new f9d.c(this, continuation, 18), 3);
        ViewController.P2(this, rd0.e.b(this.P.p()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new fi7.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fi7.h d() {
        return (fi7.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.Q.d);
    }
}
