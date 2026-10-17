package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/kyc/SecondaryDocumentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_TYPE", "INVALID_ISSUE_DATE", "INVALID_IMAGES", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class SecondaryDocumentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ SecondaryDocumentValidationError[] f26541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26542b;
    public static final SecondaryDocumentValidationError INVALID_TYPE = new SecondaryDocumentValidationError("INVALID_TYPE", 0);
    public static final SecondaryDocumentValidationError INVALID_ISSUE_DATE = new SecondaryDocumentValidationError("INVALID_ISSUE_DATE", 1);
    public static final SecondaryDocumentValidationError INVALID_IMAGES = new SecondaryDocumentValidationError("INVALID_IMAGES", 2);

    static {
        SecondaryDocumentValidationError[] secondaryDocumentValidationErrorArrA = a();
        f26541a = secondaryDocumentValidationErrorArrA;
        f26542b = s.n(secondaryDocumentValidationErrorArrA);
    }

    private SecondaryDocumentValidationError(String str, int i) {
    }

    private static final /* synthetic */ SecondaryDocumentValidationError[] a() {
        return new SecondaryDocumentValidationError[]{INVALID_TYPE, INVALID_ISSUE_DATE, INVALID_IMAGES};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26542b;
    }

    public static SecondaryDocumentValidationError valueOf(String str) {
        return (SecondaryDocumentValidationError) Enum.valueOf(SecondaryDocumentValidationError.class, str);
    }

    public static SecondaryDocumentValidationError[] values() {
        return (SecondaryDocumentValidationError[]) f26541a.clone();
    }
}
