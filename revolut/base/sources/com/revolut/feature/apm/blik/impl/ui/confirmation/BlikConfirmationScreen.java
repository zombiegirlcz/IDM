package com.revolut.feature.apm.blik.impl.ui.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.MapLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwoLogosHeaderDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.impl.R$id;
import com.revolut.feature.apm.blik.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kob.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kpl.b;
import kr.h2;
import ku1.e;
import ku1.f;
import ku1.g;
import ku1.m;
import ku1.n;
import ku1.o;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/confirmation/BlikConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lku1/o;", "Lcom/revolut/feature/apm/blik/impl/ui/confirmation/BlikConfirmationScreenContract$InputData;", "Lku1/m;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlikConfirmationScreen extends BaseRecyclerViewScreen<o, BlikConfirmationScreenContract$InputData, m> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61666e0 = {o0.f186429a.j(new h0(BlikConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/blik/impl/databinding/ScreenBlikConfirmationBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61667a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f61668b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f61669d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlikConfirmationScreen(BlikConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_blik_confirmation;
        this.V = R$id.blikConfirmation_recyclerView;
        this.W = true;
        this.X = s.t(this, e.f);
        this.Y = w.y0(new b(this, inputData, 3));
        this.Z = w.y0(new a(this, 5));
        Lazy lazyY0 = w.y0(new h2(16));
        this.f61667a0 = lazyY0;
        Lazy lazyY02 = w.y0(new h2(17));
        this.f61668b0 = lazyY02;
        Lazy lazyY03 = w.y0(new h2(18));
        this.c0 = lazyY03;
        this.f61669d0 = v.k(new TwoLogosHeaderDelegate(), (TimerDelegate) lazyY03.getValue(), (RowDelegate) lazyY02.getValue(), new RowLoadingDelegate(), new MapLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (MapDelegate) lazyY0.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, jki.o oVar) {
        o uiState = (o) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        this.z = false;
        TwinVerticalButton twinVerticalButton = g3().f9464b;
        boolean z = uiState.f189619b;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (cu1.m) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (n) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f9464b.o0()), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f9464b.p0()), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TimerDelegate) this.c0.getValue()).d.f121375b), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.f61668b0.getValue()).f53220l), null, new g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        TwinVerticalButton twinVerticalButton = g3().f9464b;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.blik_transaction_confirmation_action_confirm, null, null, 14));
        twinVerticalButton.setMainButtonLoadingTag("MAIN_BUTTON_LOADING_TAG");
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.blik_transaction_confirmation_action_reject, null, null, 14));
        twinVerticalButton.setSecondaryButtonLoadingTag("SECONDARY_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, jki.o oVar) {
        o uiState = (o) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        this.z = false;
        TwinVerticalButton twinVerticalButton = g3().f9464b;
        boolean z = uiState.f189619b;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF106556a0() {
        return this.f61669d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.V;
    }

    public final au1.b g3() {
        ViewBinding value = this.X.getValue(this, f61666e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (au1.b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
