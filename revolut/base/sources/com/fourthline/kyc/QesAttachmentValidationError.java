package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/kyc/QesAttachmentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_FILE_FORMAT", "FILE_NOT_FOUND", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class QesAttachmentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ QesAttachmentValidationError[] f26536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26537b;
    public static final QesAttachmentValidationError INVALID_FILE_FORMAT = new QesAttachmentValidationError("INVALID_FILE_FORMAT", 0);
    public static final QesAttachmentValidationError FILE_NOT_FOUND = new QesAttachmentValidationError("FILE_NOT_FOUND", 1);

    static {
        QesAttachmentValidationError[] qesAttachmentValidationErrorArrA = a();
        f26536a = qesAttachmentValidationErrorArrA;
        f26537b = s.n(qesAttachmentValidationErrorArrA);
    }

    private QesAttachmentValidationError(String str, int i) {
    }

    private static final /* synthetic */ QesAttachmentValidationError[] a() {
        return new QesAttachmentValidationError[]{INVALID_FILE_FORMAT, FILE_NOT_FOUND};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26537b;
    }

    public static QesAttachmentValidationError valueOf(String str) {
        return (QesAttachmentValidationError) Enum.valueOf(QesAttachmentValidationError.class, str);
    }

    public static QesAttachmentValidationError[] values() {
        return (QesAttachmentValidationError[]) f26536a.clone();
    }
}
