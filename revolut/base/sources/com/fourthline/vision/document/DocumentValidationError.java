package com.fourthline.vision.document;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/vision/document/DocumentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "ISSUING_COUNTRY_NOT_SUPPORTED", "DOCUMENT_TYPE_NOT_SUPPORTED", "NATIONALITY_NOT_SUPPORTED", "DOCUMENT_EXPIRED", "PERSON_NOT_ADULT", "DOCUMENT_TYPE_INVALID", "MRZ_NOT_VALID", "MRZ_NOT_DETECTED", "PHOTO_DETECTED", "PHOTO_NOT_DETECTED", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentValidationError[] f35909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35910b;
    public static final DocumentValidationError ISSUING_COUNTRY_NOT_SUPPORTED = new DocumentValidationError("ISSUING_COUNTRY_NOT_SUPPORTED", 0);
    public static final DocumentValidationError DOCUMENT_TYPE_NOT_SUPPORTED = new DocumentValidationError("DOCUMENT_TYPE_NOT_SUPPORTED", 1);
    public static final DocumentValidationError NATIONALITY_NOT_SUPPORTED = new DocumentValidationError("NATIONALITY_NOT_SUPPORTED", 2);
    public static final DocumentValidationError DOCUMENT_EXPIRED = new DocumentValidationError("DOCUMENT_EXPIRED", 3);
    public static final DocumentValidationError PERSON_NOT_ADULT = new DocumentValidationError("PERSON_NOT_ADULT", 4);
    public static final DocumentValidationError DOCUMENT_TYPE_INVALID = new DocumentValidationError("DOCUMENT_TYPE_INVALID", 5);
    public static final DocumentValidationError MRZ_NOT_VALID = new DocumentValidationError("MRZ_NOT_VALID", 6);
    public static final DocumentValidationError MRZ_NOT_DETECTED = new DocumentValidationError("MRZ_NOT_DETECTED", 7);
    public static final DocumentValidationError PHOTO_DETECTED = new DocumentValidationError("PHOTO_DETECTED", 8);
    public static final DocumentValidationError PHOTO_NOT_DETECTED = new DocumentValidationError("PHOTO_NOT_DETECTED", 9);

    private static final /* synthetic */ DocumentValidationError[] $values() {
        return new DocumentValidationError[]{ISSUING_COUNTRY_NOT_SUPPORTED, DOCUMENT_TYPE_NOT_SUPPORTED, NATIONALITY_NOT_SUPPORTED, DOCUMENT_EXPIRED, PERSON_NOT_ADULT, DOCUMENT_TYPE_INVALID, MRZ_NOT_VALID, MRZ_NOT_DETECTED, PHOTO_DETECTED, PHOTO_NOT_DETECTED};
    }

    static {
        DocumentValidationError[] documentValidationErrorArr$values = $values();
        f35909a = documentValidationErrorArr$values;
        f35910b = s.n(documentValidationErrorArr$values);
    }

    private DocumentValidationError(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f35910b;
    }

    public static DocumentValidationError valueOf(String str) {
        return (DocumentValidationError) Enum.valueOf(DocumentValidationError.class, str);
    }

    public static DocumentValidationError[] values() {
        return (DocumentValidationError[]) f35909a.clone();
    }
}
