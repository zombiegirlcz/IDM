package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.ExpirationDateData;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import com.fourthline.vision.internal.r5;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class l3 implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OcrDocumentExpirationDateValidator f36469b;

    public l3(@NotNull Function0<? extends DocumentType> documentTypeFactory, @NotNull OcrDocumentExpirationDateValidator ocrValidator) {
        Intrinsics.checkNotNullParameter(documentTypeFactory, "documentTypeFactory");
        Intrinsics.checkNotNullParameter(ocrValidator, "ocrValidator");
        this.f36468a = documentTypeFactory;
        this.f36469b = ocrValidator;
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
        r5.b bVar = udVar instanceof r5.b ? (r5.b) udVar : null;
        MrzInfo mrz = bVar != null ? bVar.getMrz() : null;
        if (!(mrz instanceof MrtdMrzInfo)) {
            return zhm.h0.f322473a;
        }
        MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrz;
        return toDocumentValidationErrors(this.f36469b.validate(new ExpirationDateData(mrtdMrzInfo.getIssuingCountry(), (DocumentType) this.f36468a.invoke(), mrtdMrzInfo.getExpirationDate())), mrtdMrzInfo.getValidationErrors());
    }
}
