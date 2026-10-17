package com.revolut.feature.payinstore.impl.ui.screen;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avj.o;
import aw0.j8;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payinstore.impl.R$id;
import com.revolut.feature.payinstore.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q97.p1;
import qba.b;
import qm2.c;
import qn9.a;
import qn9.d;
import qn9.g;
import qn9.k;
import qn9.l;
import qn9.m;
import qn9.q;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payinstore/impl/ui/screen/PayInStoreScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqn9/m;", "Lcom/revolut/feature/payinstore/impl/ui/screen/PayInStoreScreenContract$InputData;", "Lqn9/k;", "feature_pay_in_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayInStoreScreen extends BaseRecyclerViewScreen<m, PayInStoreScreenContract$InputData, k> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79044d0 = {o0.f186429a.j(new h0(PayInStoreScreen.class, "binding", "getBinding()Lcom/revolut/feature/payinstore/impl/databinding/ScreenPayInStoreConfirmationBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final CenteredAmountDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f79045a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f79046b0;
    public final Object c0;

    public PayInStoreScreen(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        PayInStoreScreenContract$InputData inputData = new PayInStoreScreenContract$InputData(orderId);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        super(inputData);
        this.U = R$layout.screen_pay_in_store_confirmation;
        this.V = R$id.payInStore_recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        this.Y = w.y0(new b(this, inputData, 18));
        CenteredAmountDelegate centeredAmountDelegate = new CenteredAmountDelegate(new c(this, 2));
        this.Z = centeredAmountDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f79045a0 = rowDelegate;
        this.f79046b0 = v.k(centeredAmountDelegate, new RowLoadingDelegate(), rowDelegate, new FullScreenStateDelegate());
        this.c0 = w.y0(new p1(this, 14));
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((q) T2()).v2(g.f247882a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (kn9.c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        String currencyCode;
        String pocketId;
        if (i != 4 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null || (pocketId = intent.getStringExtra("argPocketId")) == null) {
            return;
        }
        q qVar = (q) T2();
        qVar.getClass();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        qVar.x2(new o(currencyCode, pocketId, 26));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f154075b.f59338a), null, new qn9.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.e.f121375b), null, new qn9.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f154076c.o), null, new qn9.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f79045a0.f53220l), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f154075b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101501a0() {
        return this.f79046b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f154075b.setModel(new j8(uiState.f247886a, null, uiState.f247887b, null, 24));
        h3().f154076c.setEnabled(uiState.d);
        h3().f154076c.setText(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    public final hn9.a h3() {
        ViewBinding value = this.X.getValue(this, f79044d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hn9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
