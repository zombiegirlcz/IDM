package nfe;

import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlowContract$EmptyState;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlowContract$InputData;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlow;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n7h.c;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends g implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetailSuspiciousTransactionContainerFlowContract$InputData f214899t;
    public final RetailSuspiciousTransactionContainerFlowContract$Step u;
    public final RetailSuspiciousTransactionContainerFlowContract$EmptyState v;

    public b(RetailSuspiciousTransactionContainerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f214899t = inputData;
        this.u = inputData.f89451c;
        this.v = RetailSuspiciousTransactionContainerFlowContract$EmptyState.f89448a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RetailSuspiciousTransactionContainerFlowContract$Step step = (RetailSuspiciousTransactionContainerFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof RetailSuspiciousTransactionContainerFlowContract$Step.SuspiciousTransactionHome)) {
            throw new NoWhenBranchMatchedException();
        }
        RetailSuspiciousTransactionContainerFlowContract$InputData retailSuspiciousTransactionContainerFlowContract$InputData = this.f214899t;
        SuspiciousTransactionFlow suspiciousTransactionFlow = new SuspiciousTransactionFlow(new SuspiciousTransactionFlowContract$InputData(retailSuspiciousTransactionContainerFlowContract$InputData.f89449a, retailSuspiciousTransactionContainerFlowContract$InputData.f89450b, SuspiciousTransactionFlowContract$Step.Loading.f104989a));
        c cVar = new c(this, 27);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        suspiciousTransactionFlow.J = cVar;
        return suspiciousTransactionFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
