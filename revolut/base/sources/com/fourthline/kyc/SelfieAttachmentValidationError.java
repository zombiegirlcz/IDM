package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/kyc/SelfieAttachmentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_IMAGE", "INVALID_TIMESTAMP", "INVALID_LOCATION", "INVALID_VIDEO_LENGTH", "INVALID_VIDEO_LOCATION", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class SelfieAttachmentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ SelfieAttachmentValidationError[] f26543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26544b;
    public static final SelfieAttachmentValidationError INVALID_IMAGE = new SelfieAttachmentValidationError("INVALID_IMAGE", 0);
    public static final SelfieAttachmentValidationError INVALID_TIMESTAMP = new SelfieAttachmentValidationError("INVALID_TIMESTAMP", 1);
    public static final SelfieAttachmentValidationError INVALID_LOCATION = new SelfieAttachmentValidationError("INVALID_LOCATION", 2);
    public static final SelfieAttachmentValidationError INVALID_VIDEO_LENGTH = new SelfieAttachmentValidationError("INVALID_VIDEO_LENGTH", 3);
    public static final SelfieAttachmentValidationError INVALID_VIDEO_LOCATION = new SelfieAttachmentValidationError("INVALID_VIDEO_LOCATION", 4);

    static {
        SelfieAttachmentValidationError[] selfieAttachmentValidationErrorArrA = a();
        f26543a = selfieAttachmentValidationErrorArrA;
        f26544b = s.n(selfieAttachmentValidationErrorArrA);
    }

    private SelfieAttachmentValidationError(String str, int i) {
    }

    private static final /* synthetic */ SelfieAttachmentValidationError[] a() {
        return new SelfieAttachmentValidationError[]{INVALID_IMAGE, INVALID_TIMESTAMP, INVALID_LOCATION, INVALID_VIDEO_LENGTH, INVALID_VIDEO_LOCATION};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26544b;
    }

    public static SelfieAttachmentValidationError valueOf(String str) {
        return (SelfieAttachmentValidationError) Enum.valueOf(SelfieAttachmentValidationError.class, str);
    }

    public static SelfieAttachmentValidationError[] values() {
        return (SelfieAttachmentValidationError[]) f26543a.clone();
    }
}
