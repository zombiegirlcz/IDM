package com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreen;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lal.c;
import sji.b;
import te0.w;
import wrj.m;
import xal.d;
import xal.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/cancel/CancelScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxal/e;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/cancel/CancelScreenContract$InputData;", "Laii/q;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancelScreen extends BaseRecyclerViewScreen<e, CancelScreenContract$InputData, q> {
    public final InputChecklistDelegate U;
    public final List V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelScreen(CancelScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.U = inputChecklistDelegate;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.V = v.k(new RowDelegate(null, null, 7), inputChecklistDelegate);
        this.W = w.y0(new m(this, inputData, 22));
        this.X = w.y0(new Function0(this) { // from class: xal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelScreen f303903b;

            {
                this.f303903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f303903b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f303903b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.c) this.f303903b.W.getValue()).d.get();
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: xal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelScreen f303903b;

            {
                this.f303903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarQ2 = this.f303903b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f303903b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.c) this.f303903b.W.getValue()).d.get();
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: xal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelScreen f303903b;

            {
                this.f303903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f303903b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 1:
                        qji.b bVarQ22 = this.f303903b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.c) this.f303903b.W.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (d) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, rd0.e.b(this.U.f52518c), null, new xal.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        tal.d.b((NavBarWithToolbar) this.Y.getValue(), uiState.f303908c);
        tal.d.a((TwinVerticalButton) this.X.getValue(), uiState.f303907b);
    }
}
