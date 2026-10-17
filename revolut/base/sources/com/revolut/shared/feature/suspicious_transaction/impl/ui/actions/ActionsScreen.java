package com.revolut.shared.feature.suspicious_transaction.impl.ui.actions;

import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import v0c.b;
import val.c;
import val.d;
import val.f;
import val.g;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/actions/ActionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lval/g;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/actions/ActionsScreenContract$InputData;", "", "Companion", "a", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsScreen extends BaseRecyclerViewScreen<g, ActionsScreenContract$InputData, Object> {
    public final ListCellDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f105006a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f105005b0 = {o0.f186429a.j(new h0(ActionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsScreen(ActionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = new ListCellDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: val.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionsScreen f287331b;

            {
                this.f287331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ActionsScreen actionsScreen = this.f287331b;
                switch (i2) {
                    case 0:
                        ActionsScreen.Companion companion = ActionsScreen.INSTANCE;
                        return v.k(new PlainTextDelegate(), actionsScreen.U, new TextDelegate(), new InputDisclosureDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        ActionsScreen.Companion companion2 = ActionsScreen.INSTANCE;
                        qji.b bVarQ2 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        ActionsScreen.Companion companion3 = ActionsScreen.INSTANCE;
                        qji.b bVarQ22 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        ActionsScreen.Companion companion4 = ActionsScreen.INSTANCE;
                        return (f) ((lal.b) actionsScreen.W.getValue()).f193430c.get();
                }
            }
        });
        this.W = w.y0(new b(this, inputData, 23));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: val.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionsScreen f287331b;

            {
                this.f287331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ActionsScreen actionsScreen = this.f287331b;
                switch (i22) {
                    case 0:
                        ActionsScreen.Companion companion = ActionsScreen.INSTANCE;
                        return v.k(new PlainTextDelegate(), actionsScreen.U, new TextDelegate(), new InputDisclosureDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        ActionsScreen.Companion companion2 = ActionsScreen.INSTANCE;
                        qji.b bVarQ2 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        ActionsScreen.Companion companion3 = ActionsScreen.INSTANCE;
                        qji.b bVarQ22 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        ActionsScreen.Companion companion4 = ActionsScreen.INSTANCE;
                        return (f) ((lal.b) actionsScreen.W.getValue()).f193430c.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: val.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionsScreen f287331b;

            {
                this.f287331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ActionsScreen actionsScreen = this.f287331b;
                switch (i22) {
                    case 0:
                        ActionsScreen.Companion companion = ActionsScreen.INSTANCE;
                        return v.k(new PlainTextDelegate(), actionsScreen.U, new TextDelegate(), new InputDisclosureDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        ActionsScreen.Companion companion2 = ActionsScreen.INSTANCE;
                        qji.b bVarQ2 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        ActionsScreen.Companion companion3 = ActionsScreen.INSTANCE;
                        qji.b bVarQ22 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        ActionsScreen.Companion companion4 = ActionsScreen.INSTANCE;
                        return (f) ((lal.b) actionsScreen.W.getValue()).f193430c.get();
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: val.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionsScreen f287331b;

            {
                this.f287331b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ActionsScreen actionsScreen = this.f287331b;
                switch (i22) {
                    case 0:
                        ActionsScreen.Companion companion = ActionsScreen.INSTANCE;
                        return v.k(new PlainTextDelegate(), actionsScreen.U, new TextDelegate(), new InputDisclosureDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        ActionsScreen.Companion companion2 = ActionsScreen.INSTANCE;
                        qji.b bVarQ2 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        ActionsScreen.Companion companion3 = ActionsScreen.INSTANCE;
                        qji.b bVarQ22 = actionsScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        ActionsScreen.Companion companion4 = ActionsScreen.INSTANCE;
                        return (f) ((lal.b) actionsScreen.W.getValue()).f193430c.get();
                }
            }
        });
        this.f105006a0 = s.t(this, c.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (lal.b) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getJ0() {
        return (List) this.V.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        a.g2(this, e.b(this.U.f52692c), null, new val.b(this, null), 3);
        ViewBinding value = this.f105006a0.getValue(this, f105005b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        knm.b.v(kli.a.k(m2(), 60.0f), recyclerView);
        tal.c cVar = uiState.f287335b;
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.X.getValue();
        twinVerticalButton.setVisibility(0);
        twinVerticalButton.setCollapsible(cVar.f269368b);
        twinVerticalButton.setMainButtonText((Clause) cVar.f269367a.f269364a);
        twinVerticalButton.setSecondaryButtonVisible(true);
        a.g2(this, e.b(twinVerticalButton.n0()), null, new d(twinVerticalButton, cVar, null), 3);
        tal.d.b((NavBarWithToolbar) this.Y.getValue(), uiState.f287336c);
    }
}
