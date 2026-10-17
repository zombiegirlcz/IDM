package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/kyc/KycInfoValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_PROVIDER", "INVALID_PERSON", "INVALID_ADDRESS", "INVALID_CONTACTS", "INVALID_SELFIE", "INVALID_DOCUMENT", "INVALID_SECONDARY_DOCUMENT", "INVALID_METADATA", "INVALID_DOCUMENTS_TO_SIGN", "INVALID_TAX_INFO", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class KycInfoValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ KycInfoValidationError[] f26515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26516b;
    public static final KycInfoValidationError INVALID_PROVIDER = new KycInfoValidationError("INVALID_PROVIDER", 0);
    public static final KycInfoValidationError INVALID_PERSON = new KycInfoValidationError("INVALID_PERSON", 1);
    public static final KycInfoValidationError INVALID_ADDRESS = new KycInfoValidationError("INVALID_ADDRESS", 2);
    public static final KycInfoValidationError INVALID_CONTACTS = new KycInfoValidationError("INVALID_CONTACTS", 3);
    public static final KycInfoValidationError INVALID_SELFIE = new KycInfoValidationError("INVALID_SELFIE", 4);
    public static final KycInfoValidationError INVALID_DOCUMENT = new KycInfoValidationError("INVALID_DOCUMENT", 5);
    public static final KycInfoValidationError INVALID_SECONDARY_DOCUMENT = new KycInfoValidationError("INVALID_SECONDARY_DOCUMENT", 6);
    public static final KycInfoValidationError INVALID_METADATA = new KycInfoValidationError("INVALID_METADATA", 7);
    public static final KycInfoValidationError INVALID_DOCUMENTS_TO_SIGN = new KycInfoValidationError("INVALID_DOCUMENTS_TO_SIGN", 8);
    public static final KycInfoValidationError INVALID_TAX_INFO = new KycInfoValidationError("INVALID_TAX_INFO", 9);

    static {
        KycInfoValidationError[] kycInfoValidationErrorArrA = a();
        f26515a = kycInfoValidationErrorArrA;
        f26516b = s.n(kycInfoValidationErrorArrA);
    }

    private KycInfoValidationError(String str, int i) {
    }

    private static final /* synthetic */ KycInfoValidationError[] a() {
        return new KycInfoValidationError[]{INVALID_PROVIDER, INVALID_PERSON, INVALID_ADDRESS, INVALID_CONTACTS, INVALID_SELFIE, INVALID_DOCUMENT, INVALID_SECONDARY_DOCUMENT, INVALID_METADATA, INVALID_DOCUMENTS_TO_SIGN, INVALID_TAX_INFO};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26516b;
    }

    public static KycInfoValidationError valueOf(String str) {
        return (KycInfoValidationError) Enum.valueOf(KycInfoValidationError.class, str);
    }

    public static KycInfoValidationError[] values() {
        return (KycInfoValidationError[]) f26515a.clone();
    }
}
