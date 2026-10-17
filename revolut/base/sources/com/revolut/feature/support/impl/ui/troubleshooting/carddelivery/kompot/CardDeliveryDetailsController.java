package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.m6;
import aw0.n6;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$InputData;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ede.d;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import qee.e;
import qee.f;
import qee.g;
import qee.i;
import qee.j;
import te0.w;
import tki.c;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/support/impl/ui/troubleshooting/carddelivery/kompot/CardDeliveryDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lqee/c;", "Companion", "a", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeliveryDetailsController extends ViewController<q> implements c {
    public final CardDeliveryDetailsContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CardDeliveryDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public CardDeliveryDetailsController(CardDeliveryDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qee.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryDetailsController f245125b;

            {
                this.f245125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardDeliveryDetailsController cardDeliveryDetailsController = this.f245125b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cardDeliveryDetailsController.m2()).a().get(ede.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ede.e.class, " is not found"));
                        }
                        ede.e eVar = ((ede.e) aVar2.b()).f125010h;
                        CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = cardDeliveryDetailsController.K;
                        cardDeliveryDetailsContract$InputData.getClass();
                        return new ede.d(eVar, cardDeliveryDetailsController, cardDeliveryDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryDetailsController.X;
                        return (a) ((ede.d) cardDeliveryDetailsController.L.getValue()).f125005g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryDetailsController.X;
                        return cardDeliveryDetailsController.d3().f174534c;
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryDetailsController.X;
                        CardDeliveryDetailsController cardDeliveryDetailsController2 = this.f245125b;
                        return tki.g.a(cardDeliveryDetailsController2, cardDeliveryDetailsController2.d(), zhm.v.k((RowDelegate) cardDeliveryDetailsController2.Q.getValue(), (ListCellDelegate) cardDeliveryDetailsController2.R.getValue(), (CellDetailsChevronDelegate) cardDeliveryDetailsController2.S.getValue(), (ListSubheaderDelegate) cardDeliveryDetailsController2.T.getValue()), cardDeliveryDetailsController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qee.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryDetailsController f245125b;

            {
                this.f245125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardDeliveryDetailsController cardDeliveryDetailsController = this.f245125b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cardDeliveryDetailsController.m2()).a().get(ede.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ede.e.class, " is not found"));
                        }
                        ede.e eVar = ((ede.e) aVar2.b()).f125010h;
                        CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = cardDeliveryDetailsController.K;
                        cardDeliveryDetailsContract$InputData.getClass();
                        return new ede.d(eVar, cardDeliveryDetailsController, cardDeliveryDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryDetailsController.X;
                        return (a) ((ede.d) cardDeliveryDetailsController.L.getValue()).f125005g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryDetailsController.X;
                        return cardDeliveryDetailsController.d3().f174534c;
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryDetailsController.X;
                        CardDeliveryDetailsController cardDeliveryDetailsController2 = this.f245125b;
                        return tki.g.a(cardDeliveryDetailsController2, cardDeliveryDetailsController2.d(), zhm.v.k((RowDelegate) cardDeliveryDetailsController2.Q.getValue(), (ListCellDelegate) cardDeliveryDetailsController2.R.getValue(), (CellDetailsChevronDelegate) cardDeliveryDetailsController2.S.getValue(), (ListSubheaderDelegate) cardDeliveryDetailsController2.T.getValue()), cardDeliveryDetailsController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_action_footer;
        this.O = s.t(this, e.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qee.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryDetailsController f245125b;

            {
                this.f245125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardDeliveryDetailsController cardDeliveryDetailsController = this.f245125b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cardDeliveryDetailsController.m2()).a().get(ede.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ede.e.class, " is not found"));
                        }
                        ede.e eVar = ((ede.e) aVar2.b()).f125010h;
                        CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = cardDeliveryDetailsController.K;
                        cardDeliveryDetailsContract$InputData.getClass();
                        return new ede.d(eVar, cardDeliveryDetailsController, cardDeliveryDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryDetailsController.X;
                        return (a) ((ede.d) cardDeliveryDetailsController.L.getValue()).f125005g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryDetailsController.X;
                        return cardDeliveryDetailsController.d3().f174534c;
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryDetailsController.X;
                        CardDeliveryDetailsController cardDeliveryDetailsController2 = this.f245125b;
                        return tki.g.a(cardDeliveryDetailsController2, cardDeliveryDetailsController2.d(), zhm.v.k((RowDelegate) cardDeliveryDetailsController2.Q.getValue(), (ListCellDelegate) cardDeliveryDetailsController2.R.getValue(), (CellDetailsChevronDelegate) cardDeliveryDetailsController2.S.getValue(), (ListSubheaderDelegate) cardDeliveryDetailsController2.T.getValue()), cardDeliveryDetailsController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new qba.c(13));
        this.R = w.y0(new qba.c(14));
        this.S = w.y0(new qba.c(15));
        this.T = w.y0(new qba.c(16));
        this.U = w.y0(new qba.c(17));
        this.V = w.y0(new qba.c(18));
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: qee.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryDetailsController f245125b;

            {
                this.f245125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardDeliveryDetailsController cardDeliveryDetailsController = this.f245125b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cardDeliveryDetailsController.m2()).a().get(ede.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ede.e.class, " is not found"));
                        }
                        ede.e eVar = ((ede.e) aVar2.b()).f125010h;
                        CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = cardDeliveryDetailsController.K;
                        cardDeliveryDetailsContract$InputData.getClass();
                        return new ede.d(eVar, cardDeliveryDetailsController, cardDeliveryDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryDetailsController.X;
                        return (a) ((ede.d) cardDeliveryDetailsController.L.getValue()).f125005g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryDetailsController.X;
                        return cardDeliveryDetailsController.d3().f174534c;
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryDetailsController.X;
                        CardDeliveryDetailsController cardDeliveryDetailsController2 = this.f245125b;
                        return tki.g.a(cardDeliveryDetailsController2, cardDeliveryDetailsController2.d(), zhm.v.k((RowDelegate) cardDeliveryDetailsController2.Q.getValue(), (ListCellDelegate) cardDeliveryDetailsController2.R.getValue(), (CellDetailsChevronDelegate) cardDeliveryDetailsController2.S.getValue(), (ListSubheaderDelegate) cardDeliveryDetailsController2.T.getValue()), cardDeliveryDetailsController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        qee.c uiState = (qee.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView actionFooterView = d3().f174533b;
        if (!uiState.f245123b) {
            actionFooterView.setVisibility(8);
        } else {
            actionFooterView.setVisibility(0);
            actionFooterView.setModel(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.support_troubleshooting_card_action_reorder_card, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((d) this.L.getValue()).e.get()).d(v.k((LargeActionButtonDelegate) this.U.getValue(), (RowDelegate) this.V.getValue()));
        ?? r110 = this.P;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) r110.getValue();
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.delivery_details_header, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if (this.K.e == uce.c.REORDER_CARD) {
            ((NavBarWithToolbar) r110.getValue()).setMenuItems(u.c(new TextNavBarMenuItem("NAVBAR_DONE_BUTTON_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, 12)));
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r62 = this.P;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r62.getValue()).f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r62.getValue()).o.f57403b), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((ListCellDelegate) this.R.getValue()).d), new g(this, null, 1), 3);
        ?? r64 = this.Q;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r64.getValue()).f53226s), new g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r64.getValue()).f53220l), new qee.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsChevronDelegate) this.S.getValue()).f51821c), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.U.getValue()).d.f121375b), new j(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qee.a d() {
        return (qee.a) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }
}
