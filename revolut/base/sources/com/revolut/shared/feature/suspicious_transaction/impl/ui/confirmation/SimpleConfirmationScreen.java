package com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lal.h;
import rd0.e;
import sji.b;
import te0.w;
import y1a.a;
import yal.c;
import yal.d;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/confirmation/SimpleConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyal/d;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/confirmation/SimpleConfirmationScreenContract$InputData;", "Laii/q;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleConfirmationScreen extends BaseRecyclerViewScreen<d, SimpleConfirmationScreenContract$InputData, q> {
    public final RowDelegate U;
    public final List V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleConfirmationScreen(SimpleConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = u.c(rowDelegate);
        this.W = w.y0(new a(this, inputData, 13));
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: yal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleConfirmationScreen f312069b;

            {
                this.f312069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f312069b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f312069b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (c) ((h) this.f312069b.W.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: yal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleConfirmationScreen f312069b;

            {
                this.f312069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f312069b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f312069b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (c) ((h) this.f312069b.W.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: yal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleConfirmationScreen f312069b;

            {
                this.f312069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarQ2 = this.f312069b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f312069b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (c) ((h) this.f312069b.W.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.U.f53226s), null, new y83.d(this, (Continuation) null, 7), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(d uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        tal.d.b((NavBarWithToolbar) this.Y.getValue(), uiState.f312073c);
        tal.d.a((TwinVerticalButton) this.X.getValue(), uiState.f312072b);
    }
}
