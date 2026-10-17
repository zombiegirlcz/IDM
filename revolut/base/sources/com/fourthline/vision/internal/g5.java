package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g5 implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j6 f36237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e8 f36238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f36239c;
    private final boolean d;

    public g5(@NotNull DocumentType type, @NotNull j6 faceDetector, @NotNull e8 imageConverter) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        this.f36237a = faceDetector;
        this.f36238b = imageConverter;
        this.f36239c = zhm.v.k(DocumentType.PASSPORT, DocumentType.ID_CARD);
        this.d = !r3.contains(type);
    }

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
        return zhm.h0.f322473a;
    }
}
