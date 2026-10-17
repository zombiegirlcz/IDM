package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xgd.b;
import xgd.d;
import xgd.f;
import xgd.k;
import xgd.n;
import xgd.p;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxgd/n;", "Ltki/c;", "Lxgd/p;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditWatchlistsController extends ViewController<n> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EditWatchlistsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EditWatchlistsControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;
    public final Object R;
    public final SmallActionButtonDelegate S;
    public final Object T;

    public EditWatchlistsController(EditWatchlistsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditWatchlistsController f305675b;

            {
                this.f305675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditWatchlistsController editWatchlistsController = this.f305675b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditWatchlistsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(editWatchlistsController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = editWatchlistsController.K;
                        editWatchlistsControllerContract$InputData.getClass();
                        return new vgd.a(bVar, editWatchlistsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditWatchlistsController.U;
                        return (k) ((vgd.a) editWatchlistsController.N.getValue()).f288840b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EditWatchlistsController.U;
                        return new j(editWatchlistsController);
                    case 3:
                        KProperty[] kPropertyArr4 = EditWatchlistsController.U;
                        return new ItemTouchHelper(new tw0.n((j) editWatchlistsController.Q.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = EditWatchlistsController.U;
                        EditWatchlistsController editWatchlistsController2 = this.f305675b;
                        return tki.g.a(editWatchlistsController2, editWatchlistsController2.d(), v.k(new FullScreenStateDelegate(), editWatchlistsController2.P, new RowLoadingDelegate(), editWatchlistsController2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditWatchlistsController f305675b;

            {
                this.f305675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditWatchlistsController editWatchlistsController = this.f305675b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditWatchlistsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(editWatchlistsController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = editWatchlistsController.K;
                        editWatchlistsControllerContract$InputData.getClass();
                        return new vgd.a(bVar, editWatchlistsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditWatchlistsController.U;
                        return (k) ((vgd.a) editWatchlistsController.N.getValue()).f288840b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EditWatchlistsController.U;
                        return new j(editWatchlistsController);
                    case 3:
                        KProperty[] kPropertyArr4 = EditWatchlistsController.U;
                        return new ItemTouchHelper(new tw0.n((j) editWatchlistsController.Q.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = EditWatchlistsController.U;
                        EditWatchlistsController editWatchlistsController2 = this.f305675b;
                        return tki.g.a(editWatchlistsController2, editWatchlistsController2.d(), v.k(new FullScreenStateDelegate(), editWatchlistsController2.P, new RowLoadingDelegate(), editWatchlistsController2.S), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditWatchlistsController f305675b;

            {
                this.f305675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditWatchlistsController editWatchlistsController = this.f305675b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditWatchlistsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(editWatchlistsController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = editWatchlistsController.K;
                        editWatchlistsControllerContract$InputData.getClass();
                        return new vgd.a(bVar, editWatchlistsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditWatchlistsController.U;
                        return (k) ((vgd.a) editWatchlistsController.N.getValue()).f288840b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EditWatchlistsController.U;
                        return new j(editWatchlistsController);
                    case 3:
                        KProperty[] kPropertyArr4 = EditWatchlistsController.U;
                        return new ItemTouchHelper(new tw0.n((j) editWatchlistsController.Q.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = EditWatchlistsController.U;
                        EditWatchlistsController editWatchlistsController2 = this.f305675b;
                        return tki.g.a(editWatchlistsController2, editWatchlistsController2.d(), v.k(new FullScreenStateDelegate(), editWatchlistsController2.P, new RowLoadingDelegate(), editWatchlistsController2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: xgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditWatchlistsController f305675b;

            {
                this.f305675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EditWatchlistsController editWatchlistsController = this.f305675b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditWatchlistsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(editWatchlistsController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = editWatchlistsController.K;
                        editWatchlistsControllerContract$InputData.getClass();
                        return new vgd.a(bVar, editWatchlistsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditWatchlistsController.U;
                        return (k) ((vgd.a) editWatchlistsController.N.getValue()).f288840b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EditWatchlistsController.U;
                        return new j(editWatchlistsController);
                    case 3:
                        KProperty[] kPropertyArr4 = EditWatchlistsController.U;
                        return new ItemTouchHelper(new tw0.n((j) editWatchlistsController.Q.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = EditWatchlistsController.U;
                        EditWatchlistsController editWatchlistsController2 = this.f305675b;
                        return tki.g.a(editWatchlistsController2, editWatchlistsController2.d(), v.k(new FullScreenStateDelegate(), editWatchlistsController2.P, new RowLoadingDelegate(), editWatchlistsController2.S), 0, null, null, null, 60);
                }
            }
        });
        this.S = new SmallActionButtonDelegate();
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: xgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditWatchlistsController f305675b;

            {
                this.f305675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                EditWatchlistsController editWatchlistsController = this.f305675b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditWatchlistsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(editWatchlistsController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = editWatchlistsController.K;
                        editWatchlistsControllerContract$InputData.getClass();
                        return new vgd.a(bVar, editWatchlistsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditWatchlistsController.U;
                        return (k) ((vgd.a) editWatchlistsController.N.getValue()).f288840b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EditWatchlistsController.U;
                        return new j(editWatchlistsController);
                    case 3:
                        KProperty[] kPropertyArr4 = EditWatchlistsController.U;
                        return new ItemTouchHelper(new tw0.n((j) editWatchlistsController.Q.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = EditWatchlistsController.U;
                        EditWatchlistsController editWatchlistsController2 = this.f305675b;
                        return tki.g.a(editWatchlistsController2, editWatchlistsController2.d(), v.k(new FullScreenStateDelegate(), editWatchlistsController2.P, new RowLoadingDelegate(), editWatchlistsController2.S), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        String str = uiState.f305689b;
        xgd.o oVar2 = qVar instanceof xgd.o ? (xgd.o) qVar : null;
        if (oVar2 == null || !oVar2.f305687a || str == null) {
            return;
        }
        ScreenContentRecyclerView recyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        koi.b bVarF = y.f(recyclerView, str);
        if (bVarF != null) {
            ((ItemTouchHelper) this.R.getValue()).startDrag(bVarF);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vgd.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.watchlists_edit_watchlists_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.watchlists_edit_watchlists_done_action, null, null, 14));
        ((ItemTouchHelper) this.R.getValue()).attachToRecyclerView(d3().d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new xgd.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new xgd.c(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, new wvl.b(rd0.e.b(rowDelegate.f53223p), 25), new d(this, null, 0), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(rowDelegate.k), 26), new d(this, null, 1), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(rowDelegate.f53227t), 24), new xgd.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53336c.f121375b), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
