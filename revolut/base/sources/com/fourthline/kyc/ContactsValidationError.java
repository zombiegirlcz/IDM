package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/kyc/ContactsValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_EMAIL", "INVALID_PHONE", "INVALID_MOBILE", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ContactsValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ ContactsValidationError[] f26491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26492b;
    public static final ContactsValidationError INVALID_EMAIL = new ContactsValidationError("INVALID_EMAIL", 0);
    public static final ContactsValidationError INVALID_PHONE = new ContactsValidationError("INVALID_PHONE", 1);
    public static final ContactsValidationError INVALID_MOBILE = new ContactsValidationError("INVALID_MOBILE", 2);

    static {
        ContactsValidationError[] contactsValidationErrorArrA = a();
        f26491a = contactsValidationErrorArrA;
        f26492b = s.n(contactsValidationErrorArrA);
    }

    private ContactsValidationError(String str, int i) {
    }

    private static final /* synthetic */ ContactsValidationError[] a() {
        return new ContactsValidationError[]{INVALID_EMAIL, INVALID_PHONE, INVALID_MOBILE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26492b;
    }

    public static ContactsValidationError valueOf(String str) {
        return (ContactsValidationError) Enum.valueOf(ContactsValidationError.class, str);
    }

    public static ContactsValidationError[] values() {
        return (ContactsValidationError[]) f26491a.clone();
    }
}
