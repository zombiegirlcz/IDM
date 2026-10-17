package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lm extends ty {
    private final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(String workflowId, List bodyParts) {
        super("nfcImageUpload", workflowId, bodyParts, null, 8, null);
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(bodyParts, "bodyParts");
        this.f = true;
    }

    @Override // com.fourthline.orca.internal.le
    public boolean d() {
        return this.f;
    }
}
