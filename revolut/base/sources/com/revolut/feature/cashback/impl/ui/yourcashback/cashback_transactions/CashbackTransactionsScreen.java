package com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import s86.a;
import sa6.y;
import sd3.b;
import sd3.c;
import sd3.g;
import sd3.j;
import te0.w;
import vc.s;
import yc3.d;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/cashback_transactions/CashbackTransactionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lsd3/j;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/cashback_transactions/CashbackTransactionsScreenContract$InputData;", "Laii/q;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashbackTransactionsScreen extends BaseRecyclerViewScreen<j, CashbackTransactionsScreenContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65722e0 = {o0.f186429a.j(new h0(CashbackTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object U;
    public final Object V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65723a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65724b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65725d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackTransactionsScreen(CashbackTransactionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new a(this, inputData, 8));
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: sd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackTransactionsScreen f261810b;

            {
                this.f261810b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashbackTransactionsScreen cashbackTransactionsScreen = this.f261810b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackTransactionsScreen.f65722e0;
                        return (g) ((yc3.d) cashbackTransactionsScreen.U.getValue()).f312477h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackTransactionsScreen.f65722e0;
                        return new SwipeToActionDelegate((RowDelegate) cashbackTransactionsScreen.f65723a0.getValue(), false);
                    default:
                        return v.k((ListSubheaderDelegate) cashbackTransactionsScreen.Z.getValue(), (SwipeToActionDelegate) cashbackTransactionsScreen.f65724b0.getValue());
                }
            }
        });
        this.W = R$layout.screen_recycler_navbar;
        this.X = true;
        this.Y = s.t(this, b.f);
        this.Z = w.y0(new s8f.h(10));
        this.f65723a0 = w.y0(new s8f.h(11));
        final int i2 = 1;
        this.f65724b0 = w.y0(new Function0(this) { // from class: sd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackTransactionsScreen f261810b;

            {
                this.f261810b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashbackTransactionsScreen cashbackTransactionsScreen = this.f261810b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackTransactionsScreen.f65722e0;
                        return (g) ((yc3.d) cashbackTransactionsScreen.U.getValue()).f312477h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackTransactionsScreen.f65722e0;
                        return new SwipeToActionDelegate((RowDelegate) cashbackTransactionsScreen.f65723a0.getValue(), false);
                    default:
                        return v.k((ListSubheaderDelegate) cashbackTransactionsScreen.Z.getValue(), (SwipeToActionDelegate) cashbackTransactionsScreen.f65724b0.getValue());
                }
            }
        });
        this.c0 = w.y0(new s8f.h(12));
        final int i3 = 2;
        this.f65725d0 = w.y0(new Function0(this) { // from class: sd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackTransactionsScreen f261810b;

            {
                this.f261810b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CashbackTransactionsScreen cashbackTransactionsScreen = this.f261810b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackTransactionsScreen.f65722e0;
                        return (g) ((yc3.d) cashbackTransactionsScreen.U.getValue()).f312477h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CashbackTransactionsScreen.f65722e0;
                        return new SwipeToActionDelegate((RowDelegate) cashbackTransactionsScreen.f65723a0.getValue(), false);
                    default:
                        return v.k((ListSubheaderDelegate) cashbackTransactionsScreen.Z.getValue(), (SwipeToActionDelegate) cashbackTransactionsScreen.f65724b0.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174539b.setActions(v.l(uiState.f261817b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.f59410q), null, new s1k.b(this, null, 26), 3);
        r rVarFilter = g3().f174539b.s0().filter(new sc7.g(new y(22), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SingleChoiceDelegate) this.c0.getValue()).p()), null, new sd3.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.f65723a0.getValue()).f53218h), null, new sd3.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cashback_box_transactions_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cashback_box_transactions_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((d) this.U.getValue()).e.get()).d(u.c((SingleChoiceDelegate) this.c0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        j uiState = (j) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174539b.setActions(v.l(uiState.f261817b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f65725d0.getValue();
    }

    public final jii.m g3() {
        ViewBinding value = this.Y.getValue(this, f65722e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
