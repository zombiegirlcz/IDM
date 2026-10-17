package com.fourthline.vision.document.ocr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "ISSUING_COUNTRY_NOT_SUPPORTED", "DOCUMENT_TYPE_NOT_SUPPORTED", "NATIONALITY_NOT_SUPPORTED", "DOCUMENT_EXPIRED", "PERSON_NOT_ADULT", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OcrValidationError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OcrValidationError[] $VALUES;
    public static final OcrValidationError ISSUING_COUNTRY_NOT_SUPPORTED = new OcrValidationError("ISSUING_COUNTRY_NOT_SUPPORTED", 0);
    public static final OcrValidationError DOCUMENT_TYPE_NOT_SUPPORTED = new OcrValidationError("DOCUMENT_TYPE_NOT_SUPPORTED", 1);
    public static final OcrValidationError NATIONALITY_NOT_SUPPORTED = new OcrValidationError("NATIONALITY_NOT_SUPPORTED", 2);
    public static final OcrValidationError DOCUMENT_EXPIRED = new OcrValidationError("DOCUMENT_EXPIRED", 3);
    public static final OcrValidationError PERSON_NOT_ADULT = new OcrValidationError("PERSON_NOT_ADULT", 4);

    private static final /* synthetic */ OcrValidationError[] $values() {
        return new OcrValidationError[]{ISSUING_COUNTRY_NOT_SUPPORTED, DOCUMENT_TYPE_NOT_SUPPORTED, NATIONALITY_NOT_SUPPORTED, DOCUMENT_EXPIRED, PERSON_NOT_ADULT};
    }

    static {
        OcrValidationError[] ocrValidationErrorArr$values = $values();
        $VALUES = ocrValidationErrorArr$values;
        $ENTRIES = s.n(ocrValidationErrorArr$values);
    }

    private OcrValidationError(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OcrValidationError valueOf(String str) {
        return (OcrValidationError) Enum.valueOf(OcrValidationError.class, str);
    }

    public static OcrValidationError[] values() {
        return (OcrValidationError[]) $VALUES.clone();
    }
}
