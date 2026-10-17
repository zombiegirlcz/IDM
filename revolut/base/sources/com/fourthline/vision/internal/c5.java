package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import com.fourthline.vision.internal.r5;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class c5 implements a6 {
    @Override // com.fourthline.vision.internal.a6
    public /* bridge */ DocumentValidationError toDocumentValidationError(@NotNull OcrValidationError ocrValidationError, @NotNull List<? extends ValidationError> list) {
        return super.toDocumentValidationError(ocrValidationError, list);
    }

    @Override // com.fourthline.vision.internal.a6
    @NotNull
    public /* bridge */ Set<DocumentValidationError> toDocumentValidationErrors(@NotNull Set<? extends OcrValidationError> set, @NotNull List<? extends ValidationError> list) {
        return super.toDocumentValidationErrors(set, list);
    }

    @Override // com.fourthline.vision.internal.a6, com.fourthline.vision.internal.ee
    public Object validate(@NotNull ud udVar, @NotNull sd sdVar, @NotNull Continuation<? super Set<? extends DocumentValidationError>> continuation) {
        boolean zIsAutoDetectAvailable = ((DocumentScannerStep) sdVar.getStepType()).isAutoDetectAvailable();
        r5.b bVar = udVar instanceof r5.b ? (r5.b) udVar : null;
        MrzInfo mrz = bVar != null ? bVar.getMrz() : null;
        return !zIsAutoDetectAvailable ? zhm.h0.f322473a : mrz == null ? zhm.y0.b(DocumentValidationError.MRZ_NOT_DETECTED) : !mrz.getValidationErrors().isEmpty() ? zhm.y0.b(DocumentValidationError.MRZ_NOT_VALID) : zhm.h0.f322473a;
    }
}
