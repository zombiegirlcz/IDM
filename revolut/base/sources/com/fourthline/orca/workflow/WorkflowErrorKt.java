package com.fourthline.orca.workflow;

import com.fourthline.orca.internal.cf1;
import com.fourthline.orca.workflow.WorkflowError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/fourthline/orca/internal/cf1;", "Lcom/fourthline/orca/workflow/WorkflowError;", "getPublic", "(Lcom/fourthline/orca/internal/cf1;)Lcom/fourthline/orca/workflow/WorkflowError;", "public", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class WorkflowErrorKt {
    @NotNull
    public static final WorkflowError getPublic(@NotNull cf1 cf1Var) {
        Intrinsics.checkNotNullParameter(cf1Var, "<this>");
        if (cf1Var instanceof cf1.a) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (cf1Var instanceof cf1.d) {
            return new WorkflowError.InvalidSession(((cf1.d) cf1Var).getMessage());
        }
        if (cf1Var instanceof cf1.f) {
            return new WorkflowError.ModuleError(((cf1.f) cf1Var).b() + ".KycRequired");
        }
        if (cf1Var instanceof cf1.g) {
            return new WorkflowError.ModuleError(((cf1.g) cf1Var).b() + ".PendingVerification");
        }
        if (cf1Var instanceof cf1.e) {
            return WorkflowError.InvalidWorkflowStatus.INSTANCE;
        }
        if (cf1Var instanceof cf1.c) {
            return new WorkflowError.ConfigurationNotSupported(((cf1.c) cf1Var).getMessage());
        }
        if (cf1Var instanceof cf1.h) {
            return new WorkflowError.Unexpected(((cf1.h) cf1Var).getMessage());
        }
        throw new NoWhenBranchMatchedException();
    }
}
