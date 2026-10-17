package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ur extends ty {
    private final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(String workflowId, List bodyParts) {
        super("documentVideoUpload", workflowId, bodyParts, "workflow_upload_document_video");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(bodyParts, "bodyParts");
        this.f = true;
    }

    @Override // com.fourthline.orca.internal.le
    public boolean d() {
        return this.f;
    }
}
