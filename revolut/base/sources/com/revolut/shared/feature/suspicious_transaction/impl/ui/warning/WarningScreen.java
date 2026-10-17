package com.revolut.shared.feature.suspicious_transaction.impl.ui.warning;

import aii.q;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreen;
import e58.d;
import ebl.a;
import ebl.e;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lal.m;
import sji.b;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/warning/WarningScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lebl/e;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/warning/WarningScreenContract$InputData;", "Laii/q;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WarningScreen extends BaseRecyclerViewScreen<e, WarningScreenContract$InputData, q> {
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarningScreen(WarningScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new a(0));
        this.V = w.y0(new d(this, inputData, 11));
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: ebl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WarningScreen f124384b;

            {
                this.f124384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f124384b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f124384b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((m) this.f124384b.V.getValue()).f193466c.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: ebl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WarningScreen f124384b;

            {
                this.f124384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f124384b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f124384b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((m) this.f124384b.V.getValue()).f193466c.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: ebl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WarningScreen f124384b;

            {
                this.f124384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarQ2 = this.f124384b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f124384b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((m) this.f124384b.V.getValue()).f193466c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (m) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (ebl.d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getV() {
        return (List) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        tal.d.b((NavBarWithToolbar) this.X.getValue(), uiState.f124388c);
        tal.d.a((TwinVerticalButton) this.W.getValue(), uiState.f124387b);
    }
}
