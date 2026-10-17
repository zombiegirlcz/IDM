package nal;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.shared.feature.suspicious_transaction.api.models.Action;
import com.revolut.shared.feature.suspicious_transaction.api.models.ActionButton;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlow;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import mx0.v9;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SuspiciousTransactionFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SuspiciousTransactionFlow suspiciousTransactionFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = suspiciousTransactionFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$StepQ2;
        Action action;
        Action action2;
        int i = this.u;
        SuspiciousTransactionFlow suspiciousTransactionFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar2 = (com.revolut.shared.feature.suspicious_transaction.impl.flow.a) ((d) suspiciousTransactionFlow.W.getValue());
                SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step = (SuspiciousTransactionFlowContract$Step) aVar2.A2().f98430b;
                if (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Screen) {
                    ActionButton actionButton = (ActionButton) d0.e0(0, ((SuspiciousTransactionFlowContract$Step.Screen) suspiciousTransactionFlowContract$Step).a().b());
                    if (actionButton != null && (action = actionButton.f104902c) != null) {
                        aVar2.T2(action);
                    }
                } else if (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Action) {
                    aVar2.l2(new l(aVar2, null, 0), new v9(1, aVar2, com.revolut.shared.feature.suspicious_transaction.impl.flow.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 26));
                } else if ((suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Warning) && (suspiciousTransactionFlowContract$StepQ2 = aVar2.Q2()) != null) {
                    aVar2.R2(suspiciousTransactionFlowContract$StepQ2);
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar4 = (com.revolut.shared.feature.suspicious_transaction.impl.flow.a) ((d) suspiciousTransactionFlow.W.getValue());
                SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step2 = (SuspiciousTransactionFlowContract$Step) aVar4.A2().f98430b;
                if (suspiciousTransactionFlowContract$Step2 instanceof SuspiciousTransactionFlowContract$Step.Screen) {
                    ActionButton actionButton2 = (ActionButton) d0.e0(1, ((SuspiciousTransactionFlowContract$Step.Screen) suspiciousTransactionFlowContract$Step2).a().b());
                    if (actionButton2 != null && (action2 = actionButton2.f104902c) != null) {
                        aVar4.T2(action2);
                    }
                } else if (suspiciousTransactionFlowContract$Step2 instanceof SuspiciousTransactionFlowContract$Step.Action) {
                    aVar4.l2(new l(aVar4, null, 1), new v9(1, aVar4, com.revolut.shared.feature.suspicious_transaction.impl.flow.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 27));
                } else if (suspiciousTransactionFlowContract$Step2 instanceof SuspiciousTransactionFlowContract$Step.Warning) {
                    aVar4.l2(new l(aVar4, null, 0), new v9(1, aVar4, com.revolut.shared.feature.suspicious_transaction.impl.flow.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 26));
                }
                break;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = SuspiciousTransactionFlow.X;
                ((NavBarWithToolbar) suspiciousTransactionFlow.U.getValue()).setExpanded(false, true);
                ControllerContainerFrameLayout suspiciousTransactionContainer = suspiciousTransactionFlow.h3().f172527b;
                Intrinsics.checkNotNullExpressionValue(suspiciousTransactionContainer, "suspiciousTransactionContainer");
                View viewI = s.i(suspiciousTransactionContainer, new Class[]{RecyclerView.class}, null);
                RecyclerView recyclerView = viewI instanceof RecyclerView ? (RecyclerView) viewI : null;
                if (recyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    recyclerView.smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount() - 1);
                }
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                suspiciousTransactionFlow.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
