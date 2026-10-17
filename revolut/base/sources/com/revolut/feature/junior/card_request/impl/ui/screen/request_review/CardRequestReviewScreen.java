package com.revolut.feature.junior.card_request.impl.ui.screen.request_review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.card_request.impl.R$string;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ltf.b;
import m98.c;
import m98.d;
import m98.g;
import m98.i;
import m98.j;
import m98.p;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior/card_request/impl/ui/screen/request_review/CardRequestReviewScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lm98/j;", "Lcom/revolut/feature/junior/card_request/impl/ui/screen/request_review/CardRequestReviewScreenContract$InputData;", "Lm98/i;", "Companion", "a", "feature_junior_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardRequestReviewScreen extends BaseRecyclerViewScreen<j, CardRequestReviewScreenContract$InputData, i> {
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f76728a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f76729b0;
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CardRequestReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRequestReviewScreen(CardRequestReviewScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        this.V = R$id.recyclerView;
        this.W = true;
        this.X = s.t(this, c.f);
        this.Y = w.y0(new b(this, inputData, 21));
        this.Z = new FullScreenStateDelegate();
        final int i = 0;
        this.f76728a0 = w.y0(new Function0(this) { // from class: m98.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardRequestReviewScreen f203637b;

            {
                this.f203637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardRequestReviewScreen cardRequestReviewScreen = this.f203637b;
                switch (i2) {
                    case 0:
                        CardRequestReviewScreen.Companion companion = CardRequestReviewScreen.INSTANCE;
                        return (p) ((h98.h) cardRequestReviewScreen.Y.getValue()).f.get();
                    default:
                        CardRequestReviewScreen.Companion companion2 = CardRequestReviewScreen.INSTANCE;
                        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
                        FullScreenStateDelegate fullScreenStateDelegate = cardRequestReviewScreen.Z;
                        ?? r110 = cardRequestReviewScreen.Y;
                        return v.k(rowDelegate, fullScreenStateDelegate, new NewRevolutCardDelegate((int) (((c90.c) ((h98.h) r110.getValue()).d.get()).c() * 0.8f)), new NewRevolutCardLoadingDelegate((int) (((c90.c) ((h98.h) r110.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new ListSubheaderDelegate());
                }
            }
        });
        final int i2 = 1;
        this.f76729b0 = w.y0(new Function0(this) { // from class: m98.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardRequestReviewScreen f203637b;

            {
                this.f203637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardRequestReviewScreen cardRequestReviewScreen = this.f203637b;
                switch (i22) {
                    case 0:
                        CardRequestReviewScreen.Companion companion = CardRequestReviewScreen.INSTANCE;
                        return (p) ((h98.h) cardRequestReviewScreen.Y.getValue()).f.get();
                    default:
                        CardRequestReviewScreen.Companion companion2 = CardRequestReviewScreen.INSTANCE;
                        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
                        FullScreenStateDelegate fullScreenStateDelegate = cardRequestReviewScreen.Z;
                        ?? r110 = cardRequestReviewScreen.Y;
                        return v.k(rowDelegate, fullScreenStateDelegate, new NewRevolutCardDelegate((int) (((c90.c) ((h98.h) r110.getValue()).d.get()).c() * 0.8f)), new NewRevolutCardLoadingDelegate((int) (((c90.c) ((h98.h) r110.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new ListSubheaderDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (h98.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (p) this.f76728a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(h3().f174567b.f59410q), null, new d(this, continuation, 0), 3);
        a.g2(this, e.b(h3().d.c()), null, new d(this, continuation, 1), 3);
        a.g2(this, e.b(h3().d.d()), null, new d(this, continuation, 2), 3);
        a.g2(this, e.b(this.Z.f52371h.f121375b), null, new m98.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174567b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinHorizontalButton twinHorizontalButton = h3().d;
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.junior_card_request_actions_reject, null, null, 14));
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinHorizontalButton.setPrimaryButtonEnabled(false);
        twinHorizontalButton.setPrimaryButtonLoadingTag("REJECT_BUTTON_TAG");
        twinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.junior_card_request_actions_approve, null, null, 14));
        twinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setSecondaryButtonEnabled(false);
        twinHorizontalButton.setSecondaryButtonLoadingTag("APPROVE_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f76729b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174567b;
        g gVar = uiState.f203645a;
        boolean z = uiState.f203647c;
        if (gVar instanceof g.a) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            navBarWithToolbar.setSecondDescriptionVisible(false);
        } else {
            if (!(gVar instanceof m98.h)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            m98.h hVar = (m98.h) gVar;
            navBarWithToolbar.setTitle(hVar.f203642a, null);
            navBarWithToolbar.setSecondDescriptionText(hVar.f203643b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
        h3().d.setPrimaryButtonEnabled(z);
        h3().d.setSecondaryButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.U;
    }

    public final jii.v h3() {
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
