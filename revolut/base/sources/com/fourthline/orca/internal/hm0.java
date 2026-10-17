package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.vision.document.DocumentScannerStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hm0 implements ap {
    @Override // com.fourthline.orca.internal.ap
    public c81 a(DocumentScannerStep step, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return c81.a.a(c81.f27404a, R.string.step_poa_capture_message, 0, 2, null);
    }

    @Override // com.fourthline.orca.internal.ap
    public c81 a(DocumentScannerStep step, DocumentType documentType, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return c81.b.f27406b;
    }
}
