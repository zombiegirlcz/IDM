package com.fourthline.core.mrz;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/mrz/MrtdMrzInfoValidationError;", "Lcom/fourthline/core/mrz/ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_DOCUMENT_CODE", "INVALID_ISSUING_COUNTRY", "INVALID_DOCUMENT_NUMBER", "INVALID_EXPIRATION_DATE", "INVALID_FIRST_NAMES", "INVALID_LAST_NAMES", "TRUNCATED_NAMES", "INVALID_BIRTH_DATE", "INVALID_NATIONALITY", "INVALID_GENDER", "INVALID_TOTAL_CHECKSUM", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MrtdMrzInfoValidationError implements ValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ MrtdMrzInfoValidationError[] f26463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26464b;
    public static final MrtdMrzInfoValidationError INVALID_DOCUMENT_CODE = new MrtdMrzInfoValidationError("INVALID_DOCUMENT_CODE", 0);
    public static final MrtdMrzInfoValidationError INVALID_ISSUING_COUNTRY = new MrtdMrzInfoValidationError("INVALID_ISSUING_COUNTRY", 1);
    public static final MrtdMrzInfoValidationError INVALID_DOCUMENT_NUMBER = new MrtdMrzInfoValidationError("INVALID_DOCUMENT_NUMBER", 2);
    public static final MrtdMrzInfoValidationError INVALID_EXPIRATION_DATE = new MrtdMrzInfoValidationError("INVALID_EXPIRATION_DATE", 3);
    public static final MrtdMrzInfoValidationError INVALID_FIRST_NAMES = new MrtdMrzInfoValidationError("INVALID_FIRST_NAMES", 4);
    public static final MrtdMrzInfoValidationError INVALID_LAST_NAMES = new MrtdMrzInfoValidationError("INVALID_LAST_NAMES", 5);
    public static final MrtdMrzInfoValidationError TRUNCATED_NAMES = new MrtdMrzInfoValidationError("TRUNCATED_NAMES", 6);
    public static final MrtdMrzInfoValidationError INVALID_BIRTH_DATE = new MrtdMrzInfoValidationError("INVALID_BIRTH_DATE", 7);
    public static final MrtdMrzInfoValidationError INVALID_NATIONALITY = new MrtdMrzInfoValidationError("INVALID_NATIONALITY", 8);
    public static final MrtdMrzInfoValidationError INVALID_GENDER = new MrtdMrzInfoValidationError("INVALID_GENDER", 9);
    public static final MrtdMrzInfoValidationError INVALID_TOTAL_CHECKSUM = new MrtdMrzInfoValidationError("INVALID_TOTAL_CHECKSUM", 10);

    static {
        MrtdMrzInfoValidationError[] mrtdMrzInfoValidationErrorArrA = a();
        f26463a = mrtdMrzInfoValidationErrorArrA;
        f26464b = s.n(mrtdMrzInfoValidationErrorArrA);
    }

    private MrtdMrzInfoValidationError(String str, int i) {
    }

    private static final /* synthetic */ MrtdMrzInfoValidationError[] a() {
        return new MrtdMrzInfoValidationError[]{INVALID_DOCUMENT_CODE, INVALID_ISSUING_COUNTRY, INVALID_DOCUMENT_NUMBER, INVALID_EXPIRATION_DATE, INVALID_FIRST_NAMES, INVALID_LAST_NAMES, TRUNCATED_NAMES, INVALID_BIRTH_DATE, INVALID_NATIONALITY, INVALID_GENDER, INVALID_TOTAL_CHECKSUM};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26464b;
    }

    public static MrtdMrzInfoValidationError valueOf(String str) {
        return (MrtdMrzInfoValidationError) Enum.valueOf(MrtdMrzInfoValidationError.class, str);
    }

    public static MrtdMrzInfoValidationError[] values() {
        return (MrtdMrzInfoValidationError[]) f26463a.clone();
    }
}
