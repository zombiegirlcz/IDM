package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/kyc/NfcAttachmentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_MRZ", "INVALID_TIMESTAMP", "INVALID_LOCATION", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class NfcAttachmentValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ NfcAttachmentValidationError[] f26517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26518b;
    public static final NfcAttachmentValidationError INVALID_MRZ = new NfcAttachmentValidationError("INVALID_MRZ", 0);
    public static final NfcAttachmentValidationError INVALID_TIMESTAMP = new NfcAttachmentValidationError("INVALID_TIMESTAMP", 1);
    public static final NfcAttachmentValidationError INVALID_LOCATION = new NfcAttachmentValidationError("INVALID_LOCATION", 2);

    static {
        NfcAttachmentValidationError[] nfcAttachmentValidationErrorArrA = a();
        f26517a = nfcAttachmentValidationErrorArrA;
        f26518b = s.n(nfcAttachmentValidationErrorArrA);
    }

    private NfcAttachmentValidationError(String str, int i) {
    }

    private static final /* synthetic */ NfcAttachmentValidationError[] a() {
        return new NfcAttachmentValidationError[]{INVALID_MRZ, INVALID_TIMESTAMP, INVALID_LOCATION};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26518b;
    }

    public static NfcAttachmentValidationError valueOf(String str) {
        return (NfcAttachmentValidationError) Enum.valueOf(NfcAttachmentValidationError.class, str);
    }

    public static NfcAttachmentValidationError[] values() {
        return (NfcAttachmentValidationError[]) f26517a.clone();
    }
}
