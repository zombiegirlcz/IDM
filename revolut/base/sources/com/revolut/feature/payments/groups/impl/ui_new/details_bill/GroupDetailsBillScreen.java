package com.revolut.feature.payments.groups.impl.ui_new.details_bill;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bc1.a;
import bc1.b;
import bs9.i0;
import bt9.e;
import bt9.f;
import bt9.g;
import bt9.i;
import bt9.l;
import bt9.n;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import efm.r;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr9.p;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lbt9/n;", "Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData;", "Laii/q;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupDetailsBillScreen extends BaseRxRecyclerViewScreen<n, GroupDetailsBillScreenContract$InputData, q> {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79404k0 = {o0.f186429a.j(new h0(GroupDetailsBillScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int X;
    public final int Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f79405a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f79406b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ActionsDelegate f79407d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowDelegate f79408e0;
    public final CellDetailsChevronDelegate f0;
    public final CellDetailsAttachmentDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final FullScreenStateDelegate f79409h0;
    public final TwinHorizontalButtonDelegate i0;
    public final List j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupDetailsBillScreen(GroupDetailsBillScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.X = R$layout.screen_recycler_navbar;
        this.Y = R$id.recyclerView;
        this.Z = s.t(this, e.f);
        this.f79405a0 = true;
        int i = 28;
        this.f79406b0 = w.y0(new a(this, inputData, i));
        this.c0 = w.y0(new b(this, i));
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f79407d0 = actionsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f79408e0 = rowDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f0 = cellDetailsChevronDelegate;
        CellDetailsAttachmentDelegate cellDetailsAttachmentDelegate = new CellDetailsAttachmentDelegate();
        this.g0 = cellDetailsAttachmentDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f79409h0 = fullScreenStateDelegate;
        this.i0 = new TwinHorizontalButtonDelegate();
        this.j0 = v.k(actionsDelegate, listSubheaderDelegate, rowDelegate, cellDetailsChevronDelegate, cellDetailsAttachmentDelegate, fullScreenStateDelegate, new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((bt9.w) T2()).v2(q.f5292a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.f79406b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(i3().f174539b.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.f79407d0.f51611c.f121375b, new bs9.e(25))), null, new bt9.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.f79408e0.f53218h, new bs9.e(26))), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f0.f51821c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.g0.f51808c), null, new bt9.h(this, continuation, 1), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.i0;
        r rVarFilter = twinHorizontalButtonDelegate.d.f121375b.filter(new i0(4, new bs9.e(27)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new f(this, continuation, 3), 3);
        r rVarFilter2 = twinHorizontalButtonDelegate.f53572c.f121375b.filter(new i0(5, new bs9.e(28)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f79409h0.f52371h.f121375b), null, new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        i3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        p pVar = (p) this.f79406b0.getValue();
        switch (pVar.f188782a) {
            case 0:
                aVar = (j60.a) pVar.f.get();
                break;
            default:
                aVar = (j60.a) pVar.f.get();
                break;
        }
        aVar.d(u.c(this.i0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getJ0() {
        return this.j0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
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
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final void Z2(n uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f18471a);
        NavBarWithToolbar navBarWithToolbar = i3().f174539b;
        l lVar = uiState.f18472b;
        if (lVar == null) {
            navBarWithToolbar.setLoadingVisible(true);
            navBarWithToolbar.setEndIconImage(null);
            navBarWithToolbar.setEndIconBadgeImage(null);
            navBarWithToolbar.setTitle(null, null);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setSecondDescriptionVisible(false);
            return;
        }
        MoneyClause moneyClause = lVar.f18470c;
        navBarWithToolbar.setLoadingVisible(false);
        navBarWithToolbar.setEndIconImage(lVar.f18468a);
        navBarWithToolbar.setEndIconBadgeImage(lVar.f18469b);
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(lVar.e);
        navBarWithToolbar.setSecondDescriptionText(lVar.d);
    }

    public final m i3() {
        ViewBinding value = this.Z.getValue(this, f79404k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final bt9.m T2() {
        return (bt9.m) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f79405a0);
    }
}
