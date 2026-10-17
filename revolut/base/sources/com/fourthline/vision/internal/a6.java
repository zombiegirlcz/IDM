package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface a6 extends ee {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OcrValidationError.values().length];
            try {
                iArr[OcrValidationError.ISSUING_COUNTRY_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OcrValidationError.DOCUMENT_TYPE_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OcrValidationError.NATIONALITY_NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OcrValidationError.DOCUMENT_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OcrValidationError.PERSON_NOT_ADULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    default DocumentValidationError toDocumentValidationError(@NotNull OcrValidationError ocrValidationError, @NotNull List<? extends ValidationError> mrzValidationErrors) {
        Intrinsics.checkNotNullParameter(ocrValidationError, "<this>");
        Intrinsics.checkNotNullParameter(mrzValidationErrors, "mrzValidationErrors");
        int i = a.$EnumSwitchMapping$0[ocrValidationError.ordinal()];
        if (i == 1) {
            if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_ISSUING_COUNTRY)) {
                return null;
            }
            return DocumentValidationError.ISSUING_COUNTRY_NOT_SUPPORTED;
        }
        if (i == 2) {
            return DocumentValidationError.DOCUMENT_TYPE_NOT_SUPPORTED;
        }
        if (i == 3) {
            if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_NATIONALITY)) {
                return null;
            }
            return DocumentValidationError.NATIONALITY_NOT_SUPPORTED;
        }
        if (i == 4) {
            if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE)) {
                return null;
            }
            return DocumentValidationError.DOCUMENT_EXPIRED;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_BIRTH_DATE)) {
            return null;
        }
        return DocumentValidationError.PERSON_NOT_ADULT;
    }

    @NotNull
    default Set<DocumentValidationError> toDocumentValidationErrors(@NotNull Set<? extends OcrValidationError> set, @NotNull List<? extends ValidationError> mrzValidationErrors) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(mrzValidationErrors, "mrzValidationErrors");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = set.iterator();
        while (it8.hasNext()) {
            DocumentValidationError documentValidationError = toDocumentValidationError((OcrValidationError) it8.next(), mrzValidationErrors);
            if (documentValidationError != null) {
                arrayList.add(documentValidationError);
            }
        }
        return zhm.d0.i1(arrayList);
    }

    @Override // com.fourthline.vision.internal.ee
    /* synthetic */ Object validate(@NotNull ud udVar, @NotNull sd sdVar, @NotNull Continuation continuation);
}
