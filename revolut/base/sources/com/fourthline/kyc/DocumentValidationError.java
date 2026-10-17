package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/kyc/DocumentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_TYPE", "INVALID_NUMBER", "INVALID_ISSUE_DATE", "INVALID_IMAGES", "INVALID_NFC_ATTACHMENT", "INVALID_VIDEO_LENGTH", "INVALID_VIDEO_LOCATION", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class DocumentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentValidationError[] f26502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26503b;
    public static final DocumentValidationError INVALID_TYPE = new DocumentValidationError("INVALID_TYPE", 0);
    public static final DocumentValidationError INVALID_NUMBER = new DocumentValidationError("INVALID_NUMBER", 1);
    public static final DocumentValidationError INVALID_ISSUE_DATE = new DocumentValidationError("INVALID_ISSUE_DATE", 2);
    public static final DocumentValidationError INVALID_IMAGES = new DocumentValidationError("INVALID_IMAGES", 3);
    public static final DocumentValidationError INVALID_NFC_ATTACHMENT = new DocumentValidationError("INVALID_NFC_ATTACHMENT", 4);
    public static final DocumentValidationError INVALID_VIDEO_LENGTH = new DocumentValidationError("INVALID_VIDEO_LENGTH", 5);
    public static final DocumentValidationError INVALID_VIDEO_LOCATION = new DocumentValidationError("INVALID_VIDEO_LOCATION", 6);

    static {
        DocumentValidationError[] documentValidationErrorArrA = a();
        f26502a = documentValidationErrorArrA;
        f26503b = s.n(documentValidationErrorArrA);
    }

    private DocumentValidationError(String str, int i) {
    }

    private static final /* synthetic */ DocumentValidationError[] a() {
        return new DocumentValidationError[]{INVALID_TYPE, INVALID_NUMBER, INVALID_ISSUE_DATE, INVALID_IMAGES, INVALID_NFC_ATTACHMENT, INVALID_VIDEO_LENGTH, INVALID_VIDEO_LOCATION};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26503b;
    }

    public static DocumentValidationError valueOf(String str) {
        return (DocumentValidationError) Enum.valueOf(DocumentValidationError.class, str);
    }

    public static DocumentValidationError[] values() {
        return (DocumentValidationError[]) f26502a.clone();
    }
}
