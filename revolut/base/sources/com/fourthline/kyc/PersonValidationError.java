package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/kyc/PersonValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_FIRST_NAME", "INVALID_LAST_NAME", "INVALID_GENDER", "INVALID_NATIONALITY_CODE", "INVALID_BIRTH_DATE", "INVALID_BIRTH_COUNTRY_CODE", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class PersonValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ PersonValidationError[] f26524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26525b;
    public static final PersonValidationError INVALID_FIRST_NAME = new PersonValidationError("INVALID_FIRST_NAME", 0);
    public static final PersonValidationError INVALID_LAST_NAME = new PersonValidationError("INVALID_LAST_NAME", 1);
    public static final PersonValidationError INVALID_GENDER = new PersonValidationError("INVALID_GENDER", 2);
    public static final PersonValidationError INVALID_NATIONALITY_CODE = new PersonValidationError("INVALID_NATIONALITY_CODE", 3);
    public static final PersonValidationError INVALID_BIRTH_DATE = new PersonValidationError("INVALID_BIRTH_DATE", 4);
    public static final PersonValidationError INVALID_BIRTH_COUNTRY_CODE = new PersonValidationError("INVALID_BIRTH_COUNTRY_CODE", 5);

    static {
        PersonValidationError[] personValidationErrorArrA = a();
        f26524a = personValidationErrorArrA;
        f26525b = s.n(personValidationErrorArrA);
    }

    private PersonValidationError(String str, int i) {
    }

    private static final /* synthetic */ PersonValidationError[] a() {
        return new PersonValidationError[]{INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_GENDER, INVALID_NATIONALITY_CODE, INVALID_BIRTH_DATE, INVALID_BIRTH_COUNTRY_CODE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26525b;
    }

    public static PersonValidationError valueOf(String str) {
        return (PersonValidationError) Enum.valueOf(PersonValidationError.class, str);
    }

    public static PersonValidationError[] values() {
        return (PersonValidationError[]) f26524a.clone();
    }
}
