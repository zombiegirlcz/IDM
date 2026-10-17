package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.internal.cf1;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.orca.workflow.WorkflowError;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class rg0 {
    public static final Map a(Throwable th10) {
        String strC;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        String strB = b(th10);
        if ((th10 instanceof WorkflowError.Unexpected) || (th10 instanceof cf1.h) || (th10 instanceof KycError.Unexpected) || (th10 instanceof si.g) || (th10 instanceof BavError.Unexpected) || (th10 instanceof ea0)) {
            strC = c(th10);
        } else if (th10 instanceof re1.b) {
            strC = ((re1.b) th10).getMessage();
        } else if (th10 instanceof QesError.Rejected) {
            strC = "rejected";
        } else if (th10 instanceof QesError.InvalidSignature) {
            strC = "invalid_signature";
        } else if (th10 instanceof QesError.OperationNotAllowed) {
            strC = "error - " + ((QesError.OperationNotAllowed) th10).getStatusCode();
        } else if (th10 instanceof QesError.Unexpected) {
            strC = "error - " + c(th10);
        } else {
            strC = null;
        }
        aim.f builder = new aim.f();
        builder.put("error", strB);
        if (strC != null) {
            builder.put("reason", strC);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static final String b(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        return th10 instanceof WorkflowError.ModuleError ? ((WorkflowError.ModuleError) th10).getReason() : th10 instanceof kh0 ? ((kh0) th10).getAlias() : d(th10);
    }

    private static final String c(Throwable th10) {
        String strD;
        Throwable cause = th10.getCause();
        if (cause != null && (strD = d(cause)) != null) {
            return strD;
        }
        String message = th10.getMessage();
        return message == null ? "n/a" : message;
    }

    private static final String d(Throwable th10) {
        if (th10 instanceof QesError) {
            QesError qesError = (QesError) th10;
            return ((qesError instanceof QesError.Rejected) || (qesError instanceof QesError.InvalidSignature) || (qesError instanceof QesError.OperationNotAllowed) || (qesError instanceof QesError.Unexpected)) ? "signature_failed" : qesError.getAlias();
        }
        if (th10 instanceof kh0) {
            return ((kh0) th10).getAlias();
        }
        if (!(th10 instanceof WorkflowError)) {
            String simpleName = th10.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
        WorkflowError workflowError = (WorkflowError) th10;
        if (workflowError instanceof WorkflowError.Canceled) {
            return "canceled";
        }
        if (workflowError instanceof WorkflowError.ModuleError) {
            return "module_error";
        }
        if (workflowError instanceof WorkflowError.InvalidWorkflowStatus) {
            return "invalid_workflow_status";
        }
        if (workflowError instanceof WorkflowError.InvalidSession) {
            return "invalid_session";
        }
        if (workflowError instanceof WorkflowError.ClientRejected) {
            return "client_rejected";
        }
        if (workflowError instanceof WorkflowError.ConfigurationNotSupported) {
            return "configuration_not_supported";
        }
        if (workflowError instanceof WorkflowError.Unexpected) {
            return "unexpected";
        }
        throw new NoWhenBranchMatchedException();
    }
}
