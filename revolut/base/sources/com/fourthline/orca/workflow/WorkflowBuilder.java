package com.fourthline.orca.workflow;

import android.content.Context;
import com.fourthline.orca.Orca;
import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.ProductPresentationStep;
import com.fourthline.orca.internal.df;
import com.fourthline.orca.internal.fy;
import com.fourthline.orca.internal.lg1;
import com.fourthline.orca.internal.tg0;
import com.fourthline.orca.internal.vq0;
import com.fourthline.orca.internal.we1;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.orca.workflow.WorkflowError;
import ib.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mb.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0012\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\u000f*\f\u0012\b\u0012\u00060\tj\u0002`\n0\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/fourthline/orca/Orca;", "Landroid/content/Context;", "context", "", "validationCode", "Lmb/d;", "networkEnvironment", "Lcom/fourthline/orca/core/ProductCustomizationStep;", "Lcom/fourthline/orca/workflow/WorkflowCustomizationConfig;", "", "Lcom/fourthline/orca/workflow/WorkflowResult;", b.Workflow, "(Lcom/fourthline/orca/Orca;Landroid/content/Context;Ljava/lang/String;Lmb/d;)Lcom/fourthline/orca/core/ProductCustomizationStep;", "a", "(Landroid/content/Context;Ljava/lang/String;Lmb/d;)Lcom/fourthline/orca/core/ProductCustomizationStep;", "Lcom/fourthline/orca/core/ProductPresentationStep;", "Lcom/fourthline/orca/workflow/WorkflowDataDelegate;", "delegate", "addDelegate", "(Lcom/fourthline/orca/core/ProductPresentationStep;Lcom/fourthline/orca/workflow/WorkflowDataDelegate;)Lcom/fourthline/orca/core/ProductPresentationStep;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/workflow/WorkflowError;", "getWorkflowError", "(Lcom/fourthline/orca/qes/internal/error/QesError;)Lcom/fourthline/orca/workflow/WorkflowError;", "workflowError", "Lcom/fourthline/orca/bav/internal/error/BavError;", "(Lcom/fourthline/orca/bav/internal/error/BavError;)Lcom/fourthline/orca/workflow/WorkflowError;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "(Lcom/fourthline/orca/kyc/internal/error/KycError;)Lcom/fourthline/orca/workflow/WorkflowError;", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class WorkflowBuilder {
    private static final ProductCustomizationStep a(Context context, String str, d dVar) {
        fy fyVar = new fy(str);
        return new vq0(context, new WorkflowConfig(dVar), new df(fyVar), new WorkflowCustomizationConfig(null, 1, null), new lg1(dVar, "n/a", null, null, "n/a", "n/a", 12, null), new we1());
    }

    @NotNull
    public static final ProductPresentationStep<Unit> addDelegate(@NotNull ProductPresentationStep<Unit> productPresentationStep, @NotNull WorkflowDataDelegate delegate) {
        Intrinsics.checkNotNullParameter(productPresentationStep, "<this>");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (productPresentationStep instanceof vq0) {
            ((vq0) productPresentationStep).a(WorkflowBuilderFields.DATA_DELEGATE, delegate);
        }
        return productPresentationStep;
    }

    @NotNull
    public static final WorkflowError getWorkflowError(@NotNull QesError qesError) {
        Intrinsics.checkNotNullParameter(qesError, "<this>");
        if (qesError instanceof QesError.Canceled) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (qesError instanceof QesError.Rejected) {
            return WorkflowError.ClientRejected.INSTANCE;
        }
        if (qesError instanceof QesError.Unexpected) {
            return new WorkflowError.Unexpected(((QesError.Unexpected) qesError).getMessage());
        }
        return new WorkflowError.ModuleError("QualifiedElectronicSignature." + qesError.getAlias());
    }

    @NotNull
    public static final ProductCustomizationStep<WorkflowCustomizationConfig, Unit> workflow(@NotNull Orca orca, @NotNull Context context, @NotNull String validationCode, @NotNull d networkEnvironment) {
        Intrinsics.checkNotNullParameter(orca, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        tg0.a(context);
        return a(context, validationCode, networkEnvironment);
    }

    public static /* synthetic */ ProductCustomizationStep workflow$default(Orca orca, Context context, String str, d dVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            dVar = mb.b.f204053a;
        }
        return workflow(orca, context, str, dVar);
    }

    @NotNull
    public static final WorkflowError getWorkflowError(@NotNull BavError bavError) {
        Intrinsics.checkNotNullParameter(bavError, "<this>");
        if (bavError instanceof BavError.Canceled) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (bavError instanceof BavError.Unexpected) {
            return new WorkflowError.Unexpected(((BavError.Unexpected) bavError).getMessage());
        }
        if (bavError instanceof BavError.Generic) {
            return new WorkflowError.ModuleError("BankAccountVerification.Failed");
        }
        if (bavError instanceof BavError.KycRequired) {
            return new WorkflowError.ModuleError("BankAccountVerification.KycRequired");
        }
        if (bavError instanceof BavError.InvalidStatus) {
            return new WorkflowError.Unexpected("BankAccountVerification.InvalidStatus");
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final WorkflowError getWorkflowError(@NotNull KycError kycError) {
        Intrinsics.checkNotNullParameter(kycError, "<this>");
        if (kycError instanceof KycError.Canceled) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (kycError instanceof KycError.Unexpected) {
            return new WorkflowError.Unexpected(((KycError.Unexpected) kycError).getMessage());
        }
        return new WorkflowError.ModuleError("IdentityVerification." + kycError.getAlias());
    }
}
