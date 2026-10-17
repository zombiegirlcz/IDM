package com.revolut.feature.revolutpay.impl.ui.request_cvv;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.R$id;
import com.revolut.feature.revolutpay.impl.R$layout;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import efm.r;
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
import kotlinx.coroutines.flow.Flow;
import kpl.b;
import l9c.a;
import l9c.c;
import l9c.e;
import l9c.f;
import l9c.g;
import p7c.q;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/request_cvv/RequestCvvScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ll9c/g;", "Lcom/revolut/feature/revolutpay/impl/ui/request_cvv/RequestCvvScreenContract$InputData;", "Ll9c/e;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RequestCvvScreen extends BaseRecyclerViewScreen<g, RequestCvvScreenContract$InputData, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f84514b0 = {o0.f186429a.j(new h0(RequestCvvScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/impl/databinding/ScreenRequestCvvBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final InputTextDelegate X;
    public final List Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f84515a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestCvvScreen(RequestCvvScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_request_cvv;
        this.V = R$id.requestCvvScreen_recyclerView;
        this.W = s.t(this, a.f);
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.X = inputTextDelegate;
        this.Y = u.c(inputTextDelegate);
        this.Z = w.y0(new b(this, inputData, 20));
        this.f84515a0 = w.y0(new kob.a(this, 21));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f203383b.setEnabled(uiState.f193127b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final Flow P2() {
        return rd0.e.b(this.X.e.f121375b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (q) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.f84515a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        r map = this.X.e.f121375b.filter(new l5i.b(18, new l5a.u(23))).map(new l5i.b(19, new l5a.u(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new l1g.e(this, (Continuation) null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f203383b.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f203384c.f59410q), null, new c(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f203384c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.revolut_pay_input_cvv_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.revolut_pay_input_cvv_title, null, null, 14));
        g3().f203383b.setText(new TextLocalisedClause(R$string.revolut_pay_input_cvv_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        g uiState = (g) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f203383b.setEnabled(uiState.f193127b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final RecyclerView.LayoutManager a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(m2(), 2, 8);
        screenGridLayoutManager.setSpanSizeLookup(new l9c.b());
        return screenGridLayoutManager;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    public final m7c.c g3() {
        ViewBinding value = this.W.getValue(this, f84514b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m7c.c) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
