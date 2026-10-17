package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/kyc/AddressValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_STREET", "INVALID_STREET_NUMBER", "INVALID_POSTAL_CODE", "INVALID_CITY", "INVALID_COUNTRY_CODE", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class AddressValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AddressValidationError[] f26471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26472b;
    public static final AddressValidationError INVALID_STREET = new AddressValidationError("INVALID_STREET", 0);
    public static final AddressValidationError INVALID_STREET_NUMBER = new AddressValidationError("INVALID_STREET_NUMBER", 1);
    public static final AddressValidationError INVALID_POSTAL_CODE = new AddressValidationError("INVALID_POSTAL_CODE", 2);
    public static final AddressValidationError INVALID_CITY = new AddressValidationError("INVALID_CITY", 3);
    public static final AddressValidationError INVALID_COUNTRY_CODE = new AddressValidationError("INVALID_COUNTRY_CODE", 4);

    static {
        AddressValidationError[] addressValidationErrorArrA = a();
        f26471a = addressValidationErrorArrA;
        f26472b = s.n(addressValidationErrorArrA);
    }

    private AddressValidationError(String str, int i) {
    }

    private static final /* synthetic */ AddressValidationError[] a() {
        return new AddressValidationError[]{INVALID_STREET, INVALID_STREET_NUMBER, INVALID_POSTAL_CODE, INVALID_CITY, INVALID_COUNTRY_CODE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26472b;
    }

    public static AddressValidationError valueOf(String str) {
        return (AddressValidationError) Enum.valueOf(AddressValidationError.class, str);
    }

    public static AddressValidationError[] values() {
        return (AddressValidationError[]) f26471a.clone();
    }
}
