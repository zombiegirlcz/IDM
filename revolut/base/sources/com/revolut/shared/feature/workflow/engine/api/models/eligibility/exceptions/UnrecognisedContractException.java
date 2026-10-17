package com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/eligibility/exceptions/UnrecognisedContractException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnrecognisedContractException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnrecognisedContractException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
