package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import com.fourthline.vision.internal.r5;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class c3 implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrCountryAndTypeValidator f36065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36066b;

    public c3(@NotNull OcrCountryAndTypeValidator ocrValidator, @NotNull Function0<? extends DocumentType> documentTypeFactory) {
        Intrinsics.checkNotNullParameter(ocrValidator, "ocrValidator");
        Intrinsics.checkNotNullParameter(documentTypeFactory, "documentTypeFactory");
        this.f36065a = ocrValidator;
        this.f36066b = documentTypeFactory;
    }

    private final DocumentType getDocumentType() {
        return (DocumentType) this.f36066b.invoke();
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
        MrtdMrzInfo mrtdMrzInfo = mrz instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrz : null;
        if (mrtdMrzInfo == null) {
            return zhm.h0.f322473a;
        }
        return toDocumentValidationErrors(this.f36065a.validate(new yhm.r(mrtdMrzInfo.getIssuingCountry(), getDocumentType(), mrtdMrzInfo.getNationality())), mrtdMrzInfo.getValidationErrors());
    }
}
