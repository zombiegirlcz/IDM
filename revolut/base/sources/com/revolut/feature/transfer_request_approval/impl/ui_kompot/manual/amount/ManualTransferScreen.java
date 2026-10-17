package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt9.t;
import bu7.y;
import buf.a0;
import buf.a1;
import buf.f;
import buf.j;
import buf.k;
import buf.l;
import buf.u;
import buf.v;
import buf.x;
import buf.z;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import n5k.b;
import n5k.p;
import rd0.e;
import te0.w;
import vc.s;
import ytf.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/amount/ManualTransferScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lbuf/l;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/amount/ManualTransferContract$InputData;", "Lbuf/j;", "Lmga/i0;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualTransferScreen extends BaseRecyclerViewScreen<l, ManualTransferContract$InputData, j> implements i0 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92464k0 = {o0.f186429a.j(new h0(ManualTransferScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarActionfooterBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public b X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final LargeActionButtonDelegate f92465a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsDelegate f92466b0;
    public final CellDetailsActionDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final CellDetailsNoteDelegate f92467d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowDelegate f92468e0;
    public final HighlightTileDelegate f0;
    public final SelectableDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final TextDelegate f92469h0;
    public final ListSubheaderDelegate i0;
    public final Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualTransferScreen(ManualTransferContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbarwithavatar_actionfooter;
        this.V = R$id.screenRecyclerNavBarWithAvatarActionFooter_recyclerView;
        this.W = s.t(this, v.f);
        this.Y = w.y0(new u(this, inputData, 0));
        this.Z = w.y0(new y(6));
        this.f92465a0 = new LargeActionButtonDelegate();
        this.f92466b0 = new CellDetailsDelegate();
        this.c0 = new CellDetailsActionDelegate();
        this.f92467d0 = new CellDetailsNoteDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f92468e0 = rowDelegate;
        this.f0 = new HighlightTileDelegate();
        this.g0 = new SelectableDelegate(rowDelegate);
        this.f92469h0 = new TextDelegate();
        this.i0 = new ListSubheaderDelegate();
        this.j0 = w.y0(new bc1.b(this, 29));
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        a1 a1Var = (a1) T2();
        j60.a aVar = a1Var.z;
        if (aVar.j()) {
            j60.a.v(aVar, false, null, 3);
            return true;
        }
        a1Var.v2(f.f18798a);
        return true;
    }

    @Override // mga.i0
    public final r N0() {
        return this.f0.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174495c.f59338a), null, new buf.w(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174494b.f), null, new buf.w(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174494b.f58955g), null, new buf.w(this, continuation, 2), 3);
        ?? r62 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r62.getValue()).f.f121375b), null, new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(((CenteredAmountDelegate) r62.getValue()).e.f121375b, ((CenteredAmountDelegate) r62.getValue()).f51966j.f121375b, "merge(...)"), null, new buf.y(this, null), 3);
        r rVarFilter = this.g0.r().filter(new bs9.i0(9, new t(8)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new z(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.i0.d), null, new a0(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ?? r92 = this.Y;
        this.X = (b) ((d) r92.getValue()).A.get();
        ((j60.a) ((d) r92.getValue()).k.get()).d(zhm.v.k(this.f92465a0, this.f92466b0, this.c0, this.f92467d0, this.f92468e0, this.f0, this.f92469h0, this.g0));
        b bVar = this.X;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar).Z2(this.f92466b0, this.c0, this.f92467d0, this.f92465a0, this.f92469h0, this.f92468e0, this.f0);
        h3().f174495c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // mga.i0
    public final r a2() {
        return this.f92468e0.f53218h;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF78936d0() {
        return zhm.v.k(new RowLoadingDelegate(), (CenteredAmountDelegate) this.Z.getValue(), this.f92468e0, this.f0, this.g0, this.i0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = h3().f174493a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f174495c.setModel(uiState.f18812b);
        h3().f174494b.setModel(uiState.f18813c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final jii.a0 h3() {
        ViewBinding value = this.W.getValue(this, f92464k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.a0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final k T2() {
        return (k) this.j0.getValue();
    }
}
