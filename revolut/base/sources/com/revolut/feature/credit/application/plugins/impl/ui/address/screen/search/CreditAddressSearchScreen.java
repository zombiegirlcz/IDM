package com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search;

import android.text.InputFilter;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.kompot.common.R$layout;
import dw3.v0;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsh.e;
import nuh.j;
import o10.c;
import o44.a;
import o44.f;
import o44.h;
import o44.i;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address/screen/search/CreditAddressSearchScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lo44/i;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address/screen/search/CreditAddressSearchScreenContract$InputData;", "Lo44/h;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditAddressSearchScreen extends PluginRecyclerViewScreen<i, CreditAddressSearchScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CreditAddressSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int V;
    public final Object W;
    public final Object X;
    public final ao.h Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListCellDelegate f66960a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f66961b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditAddressSearchScreen(CreditAddressSearchScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_recycler_navbar;
        this.W = w.y0(new e(this, inputData, 17));
        this.X = w.y0(new c(this, 4));
        this.Y = s.t(this, a.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Z = fullScreenStateDelegate;
        ListCellDelegate listCellDelegate = new ListCellDelegate();
        this.f66960a0 = listCellDelegate;
        this.f66961b0 = v.k(new RowLoadingDelegate(), fullScreenStateDelegate, listCellDelegate);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        T2().v2(f.f221996a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (v0) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.f59409p.f57336l), null, new j(this, continuation, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f52371h.f121375b), null, new o44.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.f59409p.f57337m), null, new nwc.f(this, continuation, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f66960a0.f52692c), null, new o44.c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSearchInputFilters(v.k(new InputFilter.AllCaps(), new ij1.a()));
        navBarWithToolbar.setSearchInput(new TextClause(((CreditAddressSearchScreenContract$InputData) this.G).f66962a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF66961b0() {
        return this.f66961b0;
    }

    public final m g3() {
        ViewBinding value = this.Y.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final o44.m T2() {
        return (o44.m) this.X.getValue();
    }
}
