package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.money_request.impl.R$id;
import com.revolut.retail.feature.payments.money_request.impl.R$layout;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsScreen;
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
import xki.e;
import yhm.d;
import z6k.a0;
import z6k.b0;
import z6k.c0;
import z6k.d0;
import z6k.e0;
import z6k.f;
import z6k.g;
import z6k.y;
import z6k.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/details/MoneyRequestDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lz6k/h;", "feature_payments_money_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class MoneyRequestDetailsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(MoneyRequestDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/money_request/impl/databinding/ScreenMoneyRequestDetailsBinding;", 0))};
    public final MoneyRequestDetailsContract$InputData K;
    public final h L;
    public final ActionsDelegate M;
    public final CellDetailsDelegate N;
    public final CellDetailsChevronDelegate O;
    public final CellDetailsPhotoDelegate P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final CellDetailsAttachmentDelegate S;
    public final boolean T;
    public final int U;
    public final Object V;
    public final Object W;
    public final Object X;

    public MoneyRequestDetailsScreen(MoneyRequestDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, y.f);
        this.M = new ActionsDelegate();
        this.N = new CellDetailsDelegate();
        this.O = new CellDetailsChevronDelegate();
        this.P = new CellDetailsPhotoDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new CellDetailsAttachmentDelegate();
        this.T = true;
        this.U = R$layout.screen_money_request_details;
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: z6k.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyRequestDetailsScreen f319808b;

            {
                this.f319808b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MoneyRequestDetailsScreen moneyRequestDetailsScreen = this.f319808b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyRequestDetailsScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(moneyRequestDetailsScreen.m2()).a().get(t6k.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
                        }
                        t6k.c cVar = ((t6k.c) aVar2.b()).f268376n;
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = moneyRequestDetailsScreen.K;
                        moneyRequestDetailsContract$InputData.getClass();
                        return new t6k.b(cVar, moneyRequestDetailsScreen, moneyRequestDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyRequestDetailsScreen.Y;
                        return (g) ((t6k.b) moneyRequestDetailsScreen.V.getValue()).f268367l.get();
                    default:
                        KProperty[] kPropertyArr3 = MoneyRequestDetailsScreen.Y;
                        MoneyRequestDetailsScreen moneyRequestDetailsScreen2 = this.f319808b;
                        return tki.g.a(moneyRequestDetailsScreen2, moneyRequestDetailsScreen2.d(), zhm.v.k(new CellDetailsActionableIconDelegate(), moneyRequestDetailsScreen2.S, moneyRequestDetailsScreen2.N, new CellDetailsNoteDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new IconDelegate(), moneyRequestDetailsScreen2.M, moneyRequestDetailsScreen2.O, moneyRequestDetailsScreen2.P, moneyRequestDetailsScreen2.Q, moneyRequestDetailsScreen2.R), R$id.mrDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: z6k.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyRequestDetailsScreen f319808b;

            {
                this.f319808b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MoneyRequestDetailsScreen moneyRequestDetailsScreen = this.f319808b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyRequestDetailsScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(moneyRequestDetailsScreen.m2()).a().get(t6k.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
                        }
                        t6k.c cVar = ((t6k.c) aVar2.b()).f268376n;
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = moneyRequestDetailsScreen.K;
                        moneyRequestDetailsContract$InputData.getClass();
                        return new t6k.b(cVar, moneyRequestDetailsScreen, moneyRequestDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyRequestDetailsScreen.Y;
                        return (g) ((t6k.b) moneyRequestDetailsScreen.V.getValue()).f268367l.get();
                    default:
                        KProperty[] kPropertyArr3 = MoneyRequestDetailsScreen.Y;
                        MoneyRequestDetailsScreen moneyRequestDetailsScreen2 = this.f319808b;
                        return tki.g.a(moneyRequestDetailsScreen2, moneyRequestDetailsScreen2.d(), zhm.v.k(new CellDetailsActionableIconDelegate(), moneyRequestDetailsScreen2.S, moneyRequestDetailsScreen2.N, new CellDetailsNoteDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new IconDelegate(), moneyRequestDetailsScreen2.M, moneyRequestDetailsScreen2.O, moneyRequestDetailsScreen2.P, moneyRequestDetailsScreen2.Q, moneyRequestDetailsScreen2.R), R$id.mrDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: z6k.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyRequestDetailsScreen f319808b;

            {
                this.f319808b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MoneyRequestDetailsScreen moneyRequestDetailsScreen = this.f319808b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyRequestDetailsScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(moneyRequestDetailsScreen.m2()).a().get(t6k.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
                        }
                        t6k.c cVar = ((t6k.c) aVar2.b()).f268376n;
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = moneyRequestDetailsScreen.K;
                        moneyRequestDetailsContract$InputData.getClass();
                        return new t6k.b(cVar, moneyRequestDetailsScreen, moneyRequestDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyRequestDetailsScreen.Y;
                        return (g) ((t6k.b) moneyRequestDetailsScreen.V.getValue()).f268367l.get();
                    default:
                        KProperty[] kPropertyArr3 = MoneyRequestDetailsScreen.Y;
                        MoneyRequestDetailsScreen moneyRequestDetailsScreen2 = this.f319808b;
                        return tki.g.a(moneyRequestDetailsScreen2, moneyRequestDetailsScreen2.d(), zhm.v.k(new CellDetailsActionableIconDelegate(), moneyRequestDetailsScreen2.S, moneyRequestDetailsScreen2.N, new CellDetailsNoteDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new IconDelegate(), moneyRequestDetailsScreen2.M, moneyRequestDetailsScreen2.O, moneyRequestDetailsScreen2.P, moneyRequestDetailsScreen2.Q, moneyRequestDetailsScreen2.R), R$id.mrDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        z6k.h uiState = (z6k.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        f fVar = uiState.f319791b;
        z6k.c cVar = fVar instanceof z6k.c ? (z6k.c) fVar : null;
        if (cVar == null) {
            return;
        }
        Clause clause = cVar.f319785b;
        MoneyClause moneyClause = cVar.f319784a;
        NavBarWithToolbar mrDetailsNavBarWithToolbar = d3().f212833b;
        Intrinsics.checkNotNullExpressionValue(mrDetailsNavBarWithToolbar, "mrDetailsNavBarWithToolbar");
        mrDetailsNavBarWithToolbar.setTitle(moneyClause, null);
        mrDetailsNavBarWithToolbar.setToolbarTitle(moneyClause);
        mrDetailsNavBarWithToolbar.setSecondDescriptionText(cVar.f319786c);
        mrDetailsNavBarWithToolbar.setSecondDescriptionVisible(true);
        mrDetailsNavBarWithToolbar.setDescriptionVisible(clause != null);
        if (clause != null) {
            mrDetailsNavBarWithToolbar.setDescriptionText(clause);
        }
        mrDetailsNavBarWithToolbar.setEndIconImage(cVar.d);
        mrDetailsNavBarWithToolbar.setEndIconBadge(cVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t6k.b) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f212833b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f212833b.f59410q), new z(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51611c.f121375b), new a0(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new b0(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new c0(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51886c), new z(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51821c), new d0(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f51808c), new a0(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.e), new e0(this, null), 3);
    }

    public final n6k.a d3() {
        ViewBinding value = this.L.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n6k.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.T);
    }
}
