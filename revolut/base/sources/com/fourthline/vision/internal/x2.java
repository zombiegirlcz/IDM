package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import com.fourthline.vision.internal.r5;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class x2 implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrBirthDateValidator f37090a;

    public x2(@NotNull OcrBirthDateValidator ocrValidator) {
        Intrinsics.checkNotNullParameter(ocrValidator, "ocrValidator");
        this.f37090a = ocrValidator;
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
        return toDocumentValidationErrors(this.f37090a.validate(mrtdMrzInfo.getBirthDate()), mrtdMrzInfo.getValidationErrors());
    }
}
