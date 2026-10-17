package com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import j3c.y;
import j68.a;
import j82.q;
import j83.b;
import j83.c;
import j83.d;
import j83.k;
import j83.l;
import java.util.List;
import jii.x;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/reactivate/chargeback/TerminatedCardChargebackScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lj83/l;", "Lcom/revolut/feature/card_screen/impl/kompot/reactivate/chargeback/TerminatedCardChargebackScreenContract$InputData;", "Lj83/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TerminatedCardChargebackScreen extends BaseRecyclerViewScreen<l, TerminatedCardChargebackScreenContract$InputData, k> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65492e0 = {o0.f186429a.j(new h0(TerminatedCardChargebackScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int U;
    public final boolean V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65493a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65494b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65495d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminatedCardChargebackScreen(TerminatedCardChargebackScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_two_buttons;
        this.V = true;
        this.W = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new a(this, inputData, 3));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: j83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminatedCardChargebackScreen f172104b;

            {
                this.f172104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TerminatedCardChargebackScreen terminatedCardChargebackScreen = this.f172104b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TerminatedCardChargebackScreen.f65492e0;
                        return (m) ((z73.h) terminatedCardChargebackScreen.Y.getValue()).f319903c.get();
                    default:
                        KProperty[] kPropertyArr2 = TerminatedCardChargebackScreen.f65492e0;
                        return v.k((RowDelegate) terminatedCardChargebackScreen.f65493a0.getValue(), (LargeActionButtonDelegate) terminatedCardChargebackScreen.f65494b0.getValue(), (FullScreenStateDelegate) terminatedCardChargebackScreen.c0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        this.f65493a0 = w.y0(new y(25));
        this.f65494b0 = w.y0(new y(26));
        this.c0 = w.y0(new y(27));
        final int i2 = 1;
        this.f65495d0 = w.y0(new Function0(this) { // from class: j83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminatedCardChargebackScreen f172104b;

            {
                this.f172104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TerminatedCardChargebackScreen terminatedCardChargebackScreen = this.f172104b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TerminatedCardChargebackScreen.f65492e0;
                        return (m) ((z73.h) terminatedCardChargebackScreen.Y.getValue()).f319903c.get();
                    default:
                        KProperty[] kPropertyArr2 = TerminatedCardChargebackScreen.f65492e0;
                        return v.k((RowDelegate) terminatedCardChargebackScreen.f65493a0.getValue(), (LargeActionButtonDelegate) terminatedCardChargebackScreen.f65494b0.getValue(), (FullScreenStateDelegate) terminatedCardChargebackScreen.c0.getValue(), new RowLoadingDelegate());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        l uiState = (l) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174574c.setDescriptionText(uiState.f172112b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z73.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174574c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174573b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().e.o), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((RowDelegate) this.f65493a0.getValue()).f53218h, new j7b.l(4))), null, new q(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f65494b0.getValue()).d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.c0.getValue()).f52371h.f121375b), null, new j83.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174574c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_reactivate_chargeback_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_reactivate_chargeback_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        g3().f174573b.setText(new TextLocalisedClause(R$string.card_reactivate_chargeback_reactivate_and_cancel_button, null, null, 14));
        g3().f174573b.o(LargeActionButton.ButtonStyle.f58725a);
        g3().e.setText(new TextLocalisedClause(R$string.card_reactivate_chargeback_go_back_button, null, null, 14));
        g3().e.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        l uiState = (l) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174574c.setDescriptionText(uiState.f172112b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f65495d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final x g3() {
        ViewBinding value = this.X.getValue(this, f65492e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final j83.m T2() {
        return (j83.m) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
