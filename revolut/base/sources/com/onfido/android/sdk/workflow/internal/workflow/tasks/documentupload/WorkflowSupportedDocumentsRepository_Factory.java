package com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkflowSupportedDocumentsRepository_Factory implements b {

    public static final class InstanceHolder {
        private static final WorkflowSupportedDocumentsRepository_Factory INSTANCE = new WorkflowSupportedDocumentsRepository_Factory();

        private InstanceHolder() {
        }
    }

    public static WorkflowSupportedDocumentsRepository_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WorkflowSupportedDocumentsRepository newInstance() {
        return new WorkflowSupportedDocumentsRepository();
    }

    @Override // com.onfido.javax.inject.Provider
    public WorkflowSupportedDocumentsRepository get() {
        return newInstance();
    }
}
