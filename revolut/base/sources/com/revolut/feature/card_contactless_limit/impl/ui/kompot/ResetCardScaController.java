package com.revolut.feature.card_contactless_limit.impl.ui.kompot;

import aii.q;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx2.b;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaContract$InputData;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaController;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import ew1.d;
import ex2.g;
import ex2.i;
import ex2.j;
import ex2.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nii.j0;
import nii.u1;
import nii.y0;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/impl/ui/kompot/ResetCardScaController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lex2/g;", "feature_card_contactless_limit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResetCardScaController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ResetCardScaController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final ResetCardScaContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ResetCardScaController(ResetCardScaContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ex2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetCardScaController f130347b;

            {
                this.f130347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ResetCardScaController resetCardScaController = this.f130347b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ResetCardScaController.S;
                        phm.a aVar = (phm.a) ue0.e.j(resetCardScaController.m2()).a().get(bx2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bx2.a.class, " is not found"));
                        }
                        bx2.a aVar3 = ((bx2.a) aVar2.b()).d;
                        ResetCardScaContract$InputData resetCardScaContract$InputData = resetCardScaController.K;
                        resetCardScaContract$InputData.getClass();
                        return new bx2.b(aVar3, resetCardScaContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ResetCardScaController.S;
                        return (b) ((bx2.b) resetCardScaController.L.getValue()).f19487c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ResetCardScaController.S;
                        ViewBinding value = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 3:
                        KProperty[] kPropertyArr4 = ResetCardScaController.S;
                        ViewBinding value2 = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    default:
                        KProperty[] kPropertyArr5 = ResetCardScaController.S;
                        ResetCardScaController resetCardScaController2 = this.f130347b;
                        return dli.f.a(resetCardScaController2, resetCardScaController2.d(), v.k(new FullScreenStateDelegate(), new ProgressDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ex2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetCardScaController f130347b;

            {
                this.f130347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ResetCardScaController resetCardScaController = this.f130347b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ResetCardScaController.S;
                        phm.a aVar = (phm.a) ue0.e.j(resetCardScaController.m2()).a().get(bx2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bx2.a.class, " is not found"));
                        }
                        bx2.a aVar3 = ((bx2.a) aVar2.b()).d;
                        ResetCardScaContract$InputData resetCardScaContract$InputData = resetCardScaController.K;
                        resetCardScaContract$InputData.getClass();
                        return new bx2.b(aVar3, resetCardScaContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ResetCardScaController.S;
                        return (b) ((bx2.b) resetCardScaController.L.getValue()).f19487c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ResetCardScaController.S;
                        ViewBinding value = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 3:
                        KProperty[] kPropertyArr4 = ResetCardScaController.S;
                        ViewBinding value2 = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    default:
                        KProperty[] kPropertyArr5 = ResetCardScaController.S;
                        ResetCardScaController resetCardScaController2 = this.f130347b;
                        return dli.f.a(resetCardScaController2, resetCardScaController2.d(), v.k(new FullScreenStateDelegate(), new ProgressDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        this.O = s.t(this, i.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ex2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetCardScaController f130347b;

            {
                this.f130347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ResetCardScaController resetCardScaController = this.f130347b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ResetCardScaController.S;
                        phm.a aVar = (phm.a) ue0.e.j(resetCardScaController.m2()).a().get(bx2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bx2.a.class, " is not found"));
                        }
                        bx2.a aVar3 = ((bx2.a) aVar2.b()).d;
                        ResetCardScaContract$InputData resetCardScaContract$InputData = resetCardScaController.K;
                        resetCardScaContract$InputData.getClass();
                        return new bx2.b(aVar3, resetCardScaContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ResetCardScaController.S;
                        return (b) ((bx2.b) resetCardScaController.L.getValue()).f19487c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ResetCardScaController.S;
                        ViewBinding value = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 3:
                        KProperty[] kPropertyArr4 = ResetCardScaController.S;
                        ViewBinding value2 = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    default:
                        KProperty[] kPropertyArr5 = ResetCardScaController.S;
                        ResetCardScaController resetCardScaController2 = this.f130347b;
                        return dli.f.a(resetCardScaController2, resetCardScaController2.d(), v.k(new FullScreenStateDelegate(), new ProgressDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: ex2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetCardScaController f130347b;

            {
                this.f130347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ResetCardScaController resetCardScaController = this.f130347b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ResetCardScaController.S;
                        phm.a aVar = (phm.a) ue0.e.j(resetCardScaController.m2()).a().get(bx2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bx2.a.class, " is not found"));
                        }
                        bx2.a aVar3 = ((bx2.a) aVar2.b()).d;
                        ResetCardScaContract$InputData resetCardScaContract$InputData = resetCardScaController.K;
                        resetCardScaContract$InputData.getClass();
                        return new bx2.b(aVar3, resetCardScaContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ResetCardScaController.S;
                        return (b) ((bx2.b) resetCardScaController.L.getValue()).f19487c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ResetCardScaController.S;
                        ViewBinding value = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 3:
                        KProperty[] kPropertyArr4 = ResetCardScaController.S;
                        ViewBinding value2 = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    default:
                        KProperty[] kPropertyArr5 = ResetCardScaController.S;
                        ResetCardScaController resetCardScaController2 = this.f130347b;
                        return dli.f.a(resetCardScaController2, resetCardScaController2.d(), v.k(new FullScreenStateDelegate(), new ProgressDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: ex2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResetCardScaController f130347b;

            {
                this.f130347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ResetCardScaController resetCardScaController = this.f130347b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ResetCardScaController.S;
                        phm.a aVar = (phm.a) ue0.e.j(resetCardScaController.m2()).a().get(bx2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bx2.a.class, " is not found"));
                        }
                        bx2.a aVar3 = ((bx2.a) aVar2.b()).d;
                        ResetCardScaContract$InputData resetCardScaContract$InputData = resetCardScaController.K;
                        resetCardScaContract$InputData.getClass();
                        return new bx2.b(aVar3, resetCardScaContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ResetCardScaController.S;
                        return (b) ((bx2.b) resetCardScaController.L.getValue()).f19487c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ResetCardScaController.S;
                        ViewBinding value = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 3:
                        KProperty[] kPropertyArr4 = ResetCardScaController.S;
                        ViewBinding value2 = resetCardScaController.O.getValue(resetCardScaController, ResetCardScaController.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    default:
                        KProperty[] kPropertyArr5 = ResetCardScaController.S;
                        ResetCardScaController resetCardScaController2 = this.f130347b;
                        return dli.f.a(resetCardScaController2, resetCardScaController2.d(), v.k(new FullScreenStateDelegate(), new ProgressDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.Q.getValue();
        twinVerticalButton.setMainButtonText(uiState.f130344b);
        twinVerticalButton.setMainButtonEnabled(uiState.f130345c);
        twinVerticalButton.setSecondaryButtonVisible(uiState.d);
        boolean z = uiState.e;
        ?? r87 = this.P;
        if (z) {
            ((NavBarWithToolbar) r87.getValue()).setMenuItems(u.c(new TextNavBarMenuItem("IGNORE_MENU_ITEM_ID", new TextLocalisedClause(R.string.common_action_ignore, null, null, 14), null, null, 12)));
        } else {
            ((NavBarWithToolbar) r87.getValue()).setMenuItems(f0.f322471a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        l lVar = (l) d();
        lVar.getClass();
        if (i2 == -1 && i == 0) {
            yji.l.a1(lVar, lVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.card_sca_limit_reset_success_title, null, null, 14), (Clause) (lVar.o.f ? new TextLocalisedClause(R$string.card_sca_limit_reset_success_text, null, null, 14) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new ev7.b(lVar, null, 7), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.K.e) {
            ((NavBarWithToolbar) this.P.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        }
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.Q.getValue();
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setFabEnabled(false);
        twinVerticalButton.setCollapsible(true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = this.K.e;
        ?? r06 = this.P;
        Continuation continuation = null;
        if (!z) {
            ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r06.getValue()).f59410q), new j(this, null, 0), 3);
        }
        ?? r72 = this.Q;
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) r72.getValue()).o0()), new j(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) r72.getValue()).p0()), new j(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r06.getValue()).o.f57403b), new d(this, continuation, 7), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final ex2.b d() {
        return (ex2.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
