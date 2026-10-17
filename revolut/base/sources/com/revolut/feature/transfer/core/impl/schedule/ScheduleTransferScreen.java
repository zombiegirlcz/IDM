package com.revolut.feature.transfer.core.impl.schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.g;
import no.k;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import xfj.a;
import xo8.i0;
import xo8.u;
import xpf.c;
import xpf.d;
import xpf.f;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/schedule/ScheduleTransferScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxpf/c;", "Lcom/revolut/feature/transfer/core/api/schedule/ScheduleTransferInputData;", "Ldpf/c;", "Lno/k;", "Companion", "a", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScheduleTransferScreen extends BaseRecyclerViewScreen<c, ScheduleTransferInputData, dpf.c> implements k {
    public AnalyticsContext U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f92179a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final DatePickerDelegate f92180b0;
    public final SingleChoiceDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InputTextDelegate f92181d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f92182e0;
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(ScheduleTransferScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenScheduleTransferBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleTransferScreen(ScheduleTransferInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.f92146h;
        this.V = R$layout.screen_schedule_transfer;
        this.W = R$id.scheduleTransferScreen_recyclerView;
        this.X = s.t(this, d.f);
        int i = 9;
        this.Y = w.y0(new a(this, inputData, i));
        this.Z = w.y0(new xge.h(this, i));
        this.f92179a0 = true;
        this.f92180b0 = new DatePickerDelegate();
        this.c0 = new SingleChoiceDelegate();
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f92181d0 = inputTextDelegate;
        this.f92182e0 = v.k(inputTextDelegate, new PlainTextWarningDelegate());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((xpf.h) T2()).v2(dpf.a.f116875a);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getV() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        InputTextDelegate inputTextDelegate = this.f92181d0;
        r map = r.merge(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b).map(new u(1, new i0(10)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new xpf.e(this, continuation, 0), 3);
        r map2 = this.f92180b0.f52176c.f121375b.map(new u(2, new i0(11)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map2), null, new xpf.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.p()), null, new f(this, null), 3);
        kpf.a aVarH3 = h3();
        com.revolut.kompot.navigable.a.g2(this, e.b(aVarH3.f188228c.o0()), null, new xpf.g(this, continuation, 0), 3);
        NavBarWithToolbar navBarWithToolbar = aVarH3.f188227b;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new xpf.g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new xpf.e(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((g) this.Y.getValue()).d.get()).d(v.k(this.f92180b0, this.c0));
        kpf.a aVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = aVarH3.f188227b;
        ScheduleTransferInputData scheduleTransferInputData = (ScheduleTransferInputData) this.G;
        navBarWithToolbar.setToolbarTitle(scheduleTransferInputData.f92142a);
        NavBarWithToolbar scheduleTransferScreenNavBarWithToolbar = aVarH3.f188227b;
        Intrinsics.checkNotNullExpressionValue(scheduleTransferScreenNavBarWithToolbar, "scheduleTransferScreenNavBarWithToolbar");
        scheduleTransferScreenNavBarWithToolbar.setTitle(scheduleTransferInputData.f92142a, null);
        scheduleTransferScreenNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        TwinVerticalButton twinVerticalButton = aVarH3.f188228c;
        twinVerticalButton.setMainButtonText(scheduleTransferInputData.d);
        twinVerticalButton.setMainButtonCustomE2ETestId("SCHEDULE_TRANSFER_SCREEN_SCHEDULE_MAIN_BUTTON_TAG");
        twinVerticalButton.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF87162e0() {
        return this.f92182e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(c uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        kpf.a aVarH3 = h3();
        aVarH3.f188227b.setMenuItems(uiState.f307962b);
        aVarH3.f188228c.setMainButtonEnabled(uiState.d);
        TwinVerticalButton scheduleTransferScreenTwinVerticalButton = aVarH3.f188228c;
        Intrinsics.checkNotNullExpressionValue(scheduleTransferScreenTwinVerticalButton, "scheduleTransferScreenTwinVerticalButton");
        TwinVerticalButton.setDescription$default(scheduleTransferScreenTwinVerticalButton, uiState.f307963c, null, null, 6, null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.V;
    }

    public final kpf.a h3() {
        ViewBinding value = this.X.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kpf.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final xpf.b T2() {
        return (xpf.b) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f92179a0);
    }
}
