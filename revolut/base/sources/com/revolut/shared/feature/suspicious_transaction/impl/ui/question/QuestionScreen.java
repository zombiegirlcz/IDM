package com.revolut.shared.feature.suspicious_transaction.impl.ui.question;

import aee.g;
import buf.u;
import c64.a;
import cbl.c;
import cbl.d;
import cbl.e;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreen;
import efm.r;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lal.f;
import sji.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/question/QuestionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcbl/e;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/question/QuestionScreenContract$InputData;", "Lcbl/c;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuestionScreen extends BaseRecyclerViewScreen<e, QuestionScreenContract$InputData, c> {
    public final InputDisclosureDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionScreen(QuestionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = new InputDisclosureDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: cbl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuestionScreen f22890b;

            {
                this.f22890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QuestionScreen questionScreen = this.f22890b;
                switch (i2) {
                    case 0:
                        return v.k(new PlainTextDelegate(), new ListCellDelegate(), new TextDelegate(), questionScreen.U, new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        qji.b bVarQ2 = questionScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        qji.b bVarQ22 = questionScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.f) questionScreen.W.getValue()).f193441c.get();
                }
            }
        });
        this.W = w.y0(new u(this, inputData, 25));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: cbl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuestionScreen f22890b;

            {
                this.f22890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QuestionScreen questionScreen = this.f22890b;
                switch (i22) {
                    case 0:
                        return v.k(new PlainTextDelegate(), new ListCellDelegate(), new TextDelegate(), questionScreen.U, new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        qji.b bVarQ2 = questionScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        qji.b bVarQ22 = questionScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.f) questionScreen.W.getValue()).f193441c.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: cbl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuestionScreen f22890b;

            {
                this.f22890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QuestionScreen questionScreen = this.f22890b;
                switch (i22) {
                    case 0:
                        return v.k(new PlainTextDelegate(), new ListCellDelegate(), new TextDelegate(), questionScreen.U, new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        qji.b bVarQ2 = questionScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        qji.b bVarQ22 = questionScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.f) questionScreen.W.getValue()).f193441c.get();
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: cbl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuestionScreen f22890b;

            {
                this.f22890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                QuestionScreen questionScreen = this.f22890b;
                switch (i22) {
                    case 0:
                        return v.k(new PlainTextDelegate(), new ListCellDelegate(), new TextDelegate(), questionScreen.U, new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate());
                    case 1:
                        qji.b bVarQ2 = questionScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ2).G();
                    case 2:
                        qji.b bVarQ22 = questionScreen.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).y();
                    default:
                        return (d) ((lal.f) questionScreen.W.getValue()).f193441c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (f) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (d) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF78908e0() {
        return (List) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ((TwinVerticalButton) this.X.getValue()).setVisibility(8);
        tal.d.b((NavBarWithToolbar) this.Y.getValue(), uiState.f22895b);
        r map = this.U.f52538c.map(new a(new c8i.c(23), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new g(2, (d) this.Z.getValue(), d.class, "onAnswerSelected", "onAnswerSelected(Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialogAnswer;)V", 4, 18), 3);
    }
}
