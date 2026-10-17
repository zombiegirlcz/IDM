package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/kyc/DocumentAttachmentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_IMAGE", "INVALID_FILE_ATTACHMENT", "INVALID_FILE_SIDE", "INVALID_TIMESTAMP", "INVALID_LOCATION", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class DocumentAttachmentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentAttachmentValidationError[] f26500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26501b;
    public static final DocumentAttachmentValidationError INVALID_IMAGE = new DocumentAttachmentValidationError("INVALID_IMAGE", 0);
    public static final DocumentAttachmentValidationError INVALID_FILE_ATTACHMENT = new DocumentAttachmentValidationError("INVALID_FILE_ATTACHMENT", 1);
    public static final DocumentAttachmentValidationError INVALID_FILE_SIDE = new DocumentAttachmentValidationError("INVALID_FILE_SIDE", 2);
    public static final DocumentAttachmentValidationError INVALID_TIMESTAMP = new DocumentAttachmentValidationError("INVALID_TIMESTAMP", 3);
    public static final DocumentAttachmentValidationError INVALID_LOCATION = new DocumentAttachmentValidationError("INVALID_LOCATION", 4);

    static {
        DocumentAttachmentValidationError[] documentAttachmentValidationErrorArrA = a();
        f26500a = documentAttachmentValidationErrorArrA;
        f26501b = s.n(documentAttachmentValidationErrorArrA);
    }

    private DocumentAttachmentValidationError(String str, int i) {
    }

    private static final /* synthetic */ DocumentAttachmentValidationError[] a() {
        return new DocumentAttachmentValidationError[]{INVALID_IMAGE, INVALID_FILE_ATTACHMENT, INVALID_FILE_SIDE, INVALID_TIMESTAMP, INVALID_LOCATION};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26501b;
    }

    public static DocumentAttachmentValidationError valueOf(String str) {
        return (DocumentAttachmentValidationError) Enum.valueOf(DocumentAttachmentValidationError.class, str);
    }

    public static DocumentAttachmentValidationError[] values() {
        return (DocumentAttachmentValidationError[]) f26500a.clone();
    }
}
