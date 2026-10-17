package com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.impl.R$id;
import com.revolut.feature.payments.groups.impl.R$layout;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import com.revolut.kompot.navigable.a;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pgk.f;
import pt4.d;
import pt9.b;
import pt9.c;
import pt9.e;
import pt9.g;
import pt9.i;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/group_details_settings_name/GroupSettingsNameScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lpt9/c;", "Lcom/revolut/feature/payments/groups/impl/ui_new/group_details_settings_name/GroupSettingsNameContract$InputData;", "Lpt9/b;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupSettingsNameScreen extends BaseRxRecyclerViewScreen<c, GroupSettingsNameContract$InputData, b> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(GroupSettingsNameScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/groups/impl/databinding/ScreenPaymentsGroupDetailsSettingsNameBinding;", 0))};
    public final int X;
    public final int Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f79489a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f79490b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InputTextDelegate f79491d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f79492e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSettingsNameScreen(GroupSettingsNameContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.X = R$layout.screen_payments_group_details_settings_name;
        this.Y = R$id.pgbGroupSettingsName_recyclerView;
        this.Z = s.t(this, e.f);
        this.f79489a0 = true;
        this.f79490b0 = w.y0(new d(this, inputData, 1));
        this.c0 = w.y0(new f(this, 22));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f79491d0 = inputTextDelegate;
        this.f79492e0 = u.c(inputTextDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        c uiState = (c) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f239634a);
        h3().f145953b.setEnabled(uiState.f239635b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (kr9.s) this.f79490b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        gr9.b bVarH3 = h3();
        Continuation continuation = null;
        a.g2(this, rd0.e.b(bVarH3.f145954c.f59410q), null, new pt9.f(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(bVarH3.f145953b.o), null, new pt9.f(this, continuation, 1), 3);
        a.g2(this, rd0.e.b(this.f79491d0.e.f121375b), null, new g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        gr9.b bVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = bVarH3.f145954c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_groups_customisation_name_edit_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_groups_customisation_name_edit_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = bVarH3.f145953b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.payments_groups_customisation_name_edit_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        c uiState = (c) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f239634a);
        h3().f145953b.setEnabled(uiState.f239635b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF79492e0() {
        return this.f79492e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.X;
    }

    public final gr9.b h3() {
        ViewBinding value = this.Z.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gr9.b) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f79489a0);
    }
}
