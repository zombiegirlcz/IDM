package com.fourthline.core.mrz;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/core/mrz/IdlMrzInfoValidationError;", "Lcom/fourthline/core/mrz/ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_TOTAL_CHECKSUM", "INVALID_DOCUMENT_NUMBER", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdlMrzInfoValidationError implements ValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ IdlMrzInfoValidationError[] f26454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26455b;
    public static final IdlMrzInfoValidationError INVALID_TOTAL_CHECKSUM = new IdlMrzInfoValidationError("INVALID_TOTAL_CHECKSUM", 0);
    public static final IdlMrzInfoValidationError INVALID_DOCUMENT_NUMBER = new IdlMrzInfoValidationError("INVALID_DOCUMENT_NUMBER", 1);

    static {
        IdlMrzInfoValidationError[] idlMrzInfoValidationErrorArrA = a();
        f26454a = idlMrzInfoValidationErrorArrA;
        f26455b = s.n(idlMrzInfoValidationErrorArrA);
    }

    private IdlMrzInfoValidationError(String str, int i) {
    }

    private static final /* synthetic */ IdlMrzInfoValidationError[] a() {
        return new IdlMrzInfoValidationError[]{INVALID_TOTAL_CHECKSUM, INVALID_DOCUMENT_NUMBER};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26455b;
    }

    public static IdlMrzInfoValidationError valueOf(String str) {
        return (IdlMrzInfoValidationError) Enum.valueOf(IdlMrzInfoValidationError.class, str);
    }

    public static IdlMrzInfoValidationError[] values() {
        return (IdlMrzInfoValidationError[]) f26454a.clone();
    }
}
