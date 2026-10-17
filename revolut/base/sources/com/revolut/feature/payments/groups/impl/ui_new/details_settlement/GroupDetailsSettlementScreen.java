package com.revolut.feature.payments.groups.impl.ui_new.details_settlement;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import fb6.j;
import fp3.a;
import ft9.d;
import ft9.g;
import ft9.h;
import ft9.i;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr9.r;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/details_settlement/GroupDetailsSettlementScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lft9/h;", "Lcom/revolut/feature/payments/groups/impl/ui_new/details_settlement/GroupDetailsSettlementScreenContract$InputData;", "Laii/q;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupDetailsSettlementScreen extends BaseRxRecyclerViewScreen<h, GroupDetailsSettlementScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(GroupDetailsSettlementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int X;
    public final int Y;
    public final ao.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f79415a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f79416b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f79417d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f79418e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupDetailsSettlementScreen(GroupDetailsSettlementScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.X = R$layout.screen_recycler_navbar;
        this.Y = R$id.recyclerView;
        this.Z = s.t(this, d.f);
        this.f79415a0 = true;
        this.f79416b0 = w.y0(new j(this, inputData, 25));
        this.c0 = w.y0(new a(this, 6));
        Lazy lazyY0 = w.y0(new ft3.h0(12));
        this.f79417d0 = lazyY0;
        this.f79418e0 = v.k((CellDetailsChevronDelegate) lazyY0.getValue(), new PlainTextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r) this.f79416b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f174539b.f59410q), null, new ft.d(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CellDetailsChevronDelegate) this.f79417d0.getValue()).f51821c), null, new ft9.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        i3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getJ0() {
        return this.f79418e0;
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
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f137970a);
        NavBarWithToolbar navBarWithToolbar = i3().f174539b;
        g gVar = uiState.f137971b;
        navBarWithToolbar.setEndIconImage(gVar.f137967a);
        navBarWithToolbar.setEndIconBadgeImage(gVar.f137968b);
        MoneyClause moneyClause = gVar.f137969c;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(gVar.e);
        navBarWithToolbar.setSecondDescriptionText(gVar.d);
    }

    public final m i3() {
        ViewBinding value = this.Z.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f79415a0);
    }
}
