package com.revolut.feature.suspicious_transaction.impl.declaration;

import aii.u;
import com.revolut.feature.suspicious_transaction.impl.declaration.SuspiciousTransactionFeatureFlowStep;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlow;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlowContract$InputData;
import com.revolut.feature.suspicious_transaction.impl.flow.RetailSuspiciousTransactionContainerFlowContract$Step;
import com.revolut.kompot.FeatureFlowStep;
import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousTransactionFeatureConfig;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nhi.c;
import ohi.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b {
    @Override // ohi.b
    public final com.revolut.kompot.navigable.a a(FeatureFlowStep featureFlowStep, g flowModel) {
        SuspiciousTransactionFeatureFlowStep step = (SuspiciousTransactionFeatureFlowStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(step instanceof SuspiciousTransactionFeatureFlowStep.SuspiciousTransactionFlow)) {
            throw new NoWhenBranchMatchedException();
        }
        SuspiciousTransactionFeatureFlowStep.SuspiciousTransactionFlow suspiciousTransactionFlow = (SuspiciousTransactionFeatureFlowStep.SuspiciousTransactionFlow) step;
        return new RetailSuspiciousTransactionContainerFlow(new RetailSuspiciousTransactionContainerFlowContract$InputData(suspiciousTransactionFlow.getF89446a(), suspiciousTransactionFlow.getF89447b(), RetailSuspiciousTransactionContainerFlowContract$Step.SuspiciousTransactionHome.f89452a));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    @Override // ohi.b
    public final c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof SuspiciousTransactionFeatureConfig.SuspiciousTransaction)) {
            return null;
        }
        SuspiciousTransactionFeatureConfig.SuspiciousTransaction suspiciousTransaction = (SuspiciousTransactionFeatureConfig.SuspiciousTransaction) destination;
        return new c(new SuspiciousTransactionFeatureFlowStep.SuspiciousTransactionFlow(suspiciousTransaction.f104982a, suspiciousTransaction.f104983b));
    }
}
