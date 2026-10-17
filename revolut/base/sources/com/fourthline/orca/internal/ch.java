package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.vision.document.ocr.OcrValidationError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ch {

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

    public static final er a(OcrValidationError ocrValidationError) {
        Intrinsics.checkNotNullParameter(ocrValidationError, "<this>");
        int i = a.$EnumSwitchMapping$0[ocrValidationError.ordinal()];
        if (i == 1) {
            return er.g.f28242a;
        }
        if (i == 2) {
            return er.e.f28238a;
        }
        if (i == 3) {
            return er.i.f28246a;
        }
        if (i == 4) {
            return er.a.f28230a;
        }
        if (i == 5) {
            return er.j.f28248a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
