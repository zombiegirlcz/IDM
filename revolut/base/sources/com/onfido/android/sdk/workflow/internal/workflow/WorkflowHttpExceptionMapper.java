package com.onfido.android.sdk.workflow.internal.workflow;

import com.onfido.android.sdk.capture.utils.NetworkExtensionsKt;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import com.onfido.android.sdk.capture.utils.mapper.Mapper;
import com.onfido.android.sdk.workflow.internal.network.OnfidoHttpException;
import com.onfido.workflow.OnfidoWorkflow;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/workflow/internal/workflow/WorkflowHttpExceptionMapper;", "Lcom/onfido/android/sdk/capture/utils/mapper/Mapper;", "", "Lcom/onfido/workflow/OnfidoWorkflow$WorkflowException;", "jsonParser", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "map", "input", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WorkflowHttpExceptionMapper implements Mapper<Throwable, OnfidoWorkflow.WorkflowException> {

    @NotNull
    private final Json jsonParser;

    public WorkflowHttpExceptionMapper(@NotNull Json jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
    }

    @Override // com.onfido.android.sdk.capture.utils.mapper.Mapper
    @NotNull
    public OnfidoWorkflow.WorkflowException map(@NotNull Throwable input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strHttpErrorBodyString = NetworkExtensionsKt.httpErrorBodyString(input);
        if (StringExtensionsKt.isNotNullOrEmpty(strHttpErrorBodyString)) {
            Json json = this.jsonParser;
            Intrinsics.h(strHttpErrorBodyString);
            OnfidoHttpException onfidoHttpException = (OnfidoHttpException) json.b(d.v(json.f187949b, o0.b(OnfidoHttpException.class)), strHttpErrorBodyString);
            return Intrinsics.f(onfidoHttpException.getType(), "unsupported_sdk_version") ? new OnfidoWorkflow.WorkflowException.WorkflowInsufficientVersionException(onfidoHttpException.getMessage()) : new OnfidoWorkflow.WorkflowException.WorkflowHttpException(onfidoHttpException.getMessage(), input);
        }
        String message = input.getMessage();
        if (message == null) {
            message = "";
        }
        return new OnfidoWorkflow.WorkflowException.WorkflowUnknownException(message, input);
    }
}
