package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.orca.workflow.WorkflowBuilder;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowErrorKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gy implements zq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnProductCompleted f29072a;

    public gy(OnProductCompleted completionBlock) {
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        this.f29072a = completionBlock;
    }

    @Override // com.fourthline.orca.internal.zq0
    public void a(Object obj2) {
        WorkflowError workflowError;
        Object objA;
        OnProductCompleted onProductCompleted = this.f29072a;
        Throwable thA = yhm.m.a(obj2);
        if (thA == null) {
            objA = Unit.f186387a;
        } else {
            if (thA instanceof KycError) {
                workflowError = WorkflowBuilder.getWorkflowError((KycError) thA);
            } else if (thA instanceof QesError) {
                workflowError = WorkflowBuilder.getWorkflowError((QesError) thA);
            } else if (thA instanceof BavError) {
                workflowError = WorkflowBuilder.getWorkflowError((BavError) thA);
            } else {
                if (!(thA instanceof cf1)) {
                    wz.a("Wrong error type is provided to `WorkflowProductResultRepository`: " + thA);
                    throw new KotlinNothingValueException();
                }
                workflowError = WorkflowErrorKt.getPublic((cf1) thA);
            }
            objA = yhm.o.a(workflowError);
        }
        onProductCompleted.onResult(objA);
    }
}
