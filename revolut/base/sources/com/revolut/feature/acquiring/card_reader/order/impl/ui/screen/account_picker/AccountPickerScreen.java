package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.card_reader.order.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import h1k.a;
import hb1.b;
import hb1.e;
import hb1.f;
import hb1.g;
import java.util.List;
import jki.h;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import te0.w;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/account_picker/AccountPickerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lhb1/g;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/account_picker/AccountPickerScreenContract$InputData;", "Lhb1/e;", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountPickerScreen extends BaseScreen<g, AccountPickerScreenContract$InputData, e> {
    public final RowDelegate M;
    public final List N;
    public final int O;
    public final Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerScreen(AccountPickerScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = u.c(rowDelegate);
        this.O = R$layout.screen_card_reader_account_picker;
        this.P = w.y0(new a(this, inputData, 12));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ((rp0.m) S2().f112642c.get()).k(new y(uiState.f150553a, new t(uiState.f150554b, null, null, 30), l.WINDOW, null, null, null, 1016));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (f) S2().f112643g.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new akf.u(q.t(rd0.e.b(((rp0.m) S2().f112642c.get()).h()), 1), 1), null, new gqh.o(this, null, 26), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) S2().d.get()).d(this.N);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        ((rp0.m) S2().f112642c.get()).b(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final db1.a S2() {
        return (db1.a) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.O;
    }
}
