package com.onfido.android.sdk.workflow.internal.workflow;

import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkflowHttpExceptionMapper_Factory implements b {
    private final Provider jsonParserProvider;

    public WorkflowHttpExceptionMapper_Factory(Provider provider) {
        this.jsonParserProvider = provider;
    }

    public static WorkflowHttpExceptionMapper_Factory create(Provider provider) {
        return new WorkflowHttpExceptionMapper_Factory(provider);
    }

    public static WorkflowHttpExceptionMapper newInstance(Json json) {
        return new WorkflowHttpExceptionMapper(json);
    }

    @Override // com.onfido.javax.inject.Provider
    public WorkflowHttpExceptionMapper get() {
        return newInstance((Json) this.jsonParserProvider.get());
    }
}
