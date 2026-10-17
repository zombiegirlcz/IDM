package com.revolut.chat.ui.archive;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.chat.ui.archive.ArchiveScreen;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.x;
import h40.b;
import h40.c;
import h40.f;
import h40.g;
import h40.i;
import h40.j;
import h40.k;
import h40.l;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/ui/archive/ArchiveScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh40/c;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ArchiveScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ArchiveScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RowDelegate K;
    public final LabelButtonDelegate L;
    public final SwipeToActionDelegate M;
    public final ProgressStepVerticalV2Delegate N;
    public final ContainerDelegate O;
    public final int P;
    public final h Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public ArchiveScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.K = rowDelegate;
        LabelButtonDelegate labelButtonDelegate = new LabelButtonDelegate();
        this.L = labelButtonDelegate;
        final int i = 0;
        this.M = new SwipeToActionDelegate(rowDelegate, false);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = new ProgressStepVerticalV2Delegate();
        this.N = progressStepVerticalV2Delegate;
        final int i2 = 1;
        final int i3 = 2;
        final int i5 = 3;
        this.O = new ContainerDelegate(v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), rowDelegate, labelButtonDelegate, progressStepVerticalV2Delegate, new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), null, 6);
        this.P = R$layout.screen_recycler_navbar;
        this.Q = s.t(this, a.f);
        this.R = w.y0(new Function0(this) { // from class: h40.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArchiveScreen f149261b;

            {
                this.f149261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i;
                ArchiveScreen archiveScreen = this.f149261b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = ArchiveScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(archiveScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((h30.w) ((i40.a) aVar2.b()).q().mo3808a(archiveScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = ArchiveScreen.V;
                        x xVar = (x) archiveScreen.R.getValue();
                        switch (xVar.f148978a) {
                            case 0:
                                return (b) xVar.f148985m.get();
                            default:
                                return (b) xVar.f148985m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ArchiveScreen.V;
                        x xVar2 = (x) archiveScreen.R.getValue();
                        switch (xVar2.f148978a) {
                            case 0:
                                return (ep6.n) xVar2.f148982h.get();
                            default:
                                return (ep6.n) xVar2.f148982h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = ArchiveScreen.V;
                        int i21 = R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
                        ArchiveScreen archiveScreen2 = this.f149261b;
                        return dli.f.a(archiveScreen2, archiveScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, listSubheaderDelegate, archiveScreen2.N, archiveScreen2.L, archiveScreen2.K, archiveScreen2.O, archiveScreen2.M), i21, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: h40.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArchiveScreen f149261b;

            {
                this.f149261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i2;
                ArchiveScreen archiveScreen = this.f149261b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = ArchiveScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(archiveScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((h30.w) ((i40.a) aVar2.b()).q().mo3808a(archiveScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = ArchiveScreen.V;
                        x xVar = (x) archiveScreen.R.getValue();
                        switch (xVar.f148978a) {
                            case 0:
                                return (b) xVar.f148985m.get();
                            default:
                                return (b) xVar.f148985m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ArchiveScreen.V;
                        x xVar2 = (x) archiveScreen.R.getValue();
                        switch (xVar2.f148978a) {
                            case 0:
                                return (ep6.n) xVar2.f148982h.get();
                            default:
                                return (ep6.n) xVar2.f148982h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = ArchiveScreen.V;
                        int i21 = R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
                        ArchiveScreen archiveScreen2 = this.f149261b;
                        return dli.f.a(archiveScreen2, archiveScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, listSubheaderDelegate, archiveScreen2.N, archiveScreen2.L, archiveScreen2.K, archiveScreen2.O, archiveScreen2.M), i21, null, null, null, 56);
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: h40.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArchiveScreen f149261b;

            {
                this.f149261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i3;
                ArchiveScreen archiveScreen = this.f149261b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = ArchiveScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(archiveScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((h30.w) ((i40.a) aVar2.b()).q().mo3808a(archiveScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = ArchiveScreen.V;
                        x xVar = (x) archiveScreen.R.getValue();
                        switch (xVar.f148978a) {
                            case 0:
                                return (b) xVar.f148985m.get();
                            default:
                                return (b) xVar.f148985m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ArchiveScreen.V;
                        x xVar2 = (x) archiveScreen.R.getValue();
                        switch (xVar2.f148978a) {
                            case 0:
                                return (ep6.n) xVar2.f148982h.get();
                            default:
                                return (ep6.n) xVar2.f148982h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = ArchiveScreen.V;
                        int i21 = R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
                        ArchiveScreen archiveScreen2 = this.f149261b;
                        return dli.f.a(archiveScreen2, archiveScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, listSubheaderDelegate, archiveScreen2.N, archiveScreen2.L, archiveScreen2.K, archiveScreen2.O, archiveScreen2.M), i21, null, null, null, 56);
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: h40.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArchiveScreen f149261b;

            {
                this.f149261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                ArchiveScreen archiveScreen = this.f149261b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = ArchiveScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(archiveScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((h30.w) ((i40.a) aVar2.b()).q().mo3808a(archiveScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = ArchiveScreen.V;
                        x xVar = (x) archiveScreen.R.getValue();
                        switch (xVar.f148978a) {
                            case 0:
                                return (b) xVar.f148985m.get();
                            default:
                                return (b) xVar.f148985m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ArchiveScreen.V;
                        x xVar2 = (x) archiveScreen.R.getValue();
                        switch (xVar2.f148978a) {
                            case 0:
                                return (ep6.n) xVar2.f148982h.get();
                            default:
                                return (ep6.n) xVar2.f148982h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = ArchiveScreen.V;
                        int i21 = R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
                        ArchiveScreen archiveScreen2 = this.f149261b;
                        return dli.f.a(archiveScreen2, archiveScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, listSubheaderDelegate, archiveScreen2.N, archiveScreen2.L, archiveScreen2.K, archiveScreen2.O, archiveScreen2.M), i21, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f149259b, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new gqh.o(this, null, 15), 3);
        RowDelegate rowDelegate = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52124g), null, new h40.h(this, null, 0), 3);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.e), null, new h40.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.f.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.f53006g.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.i), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53219j), null, new h40.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
