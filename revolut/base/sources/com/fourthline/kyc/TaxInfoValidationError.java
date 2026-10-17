package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/kyc/TaxInfoValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_TAXPAYER_IDENTIFICATION_NUMBER", "INVALID_TAXATION_COUNTRY_CODE", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class TaxInfoValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ TaxInfoValidationError[] f26547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26548b;
    public static final TaxInfoValidationError INVALID_TAXPAYER_IDENTIFICATION_NUMBER = new TaxInfoValidationError("INVALID_TAXPAYER_IDENTIFICATION_NUMBER", 0);
    public static final TaxInfoValidationError INVALID_TAXATION_COUNTRY_CODE = new TaxInfoValidationError("INVALID_TAXATION_COUNTRY_CODE", 1);

    static {
        TaxInfoValidationError[] taxInfoValidationErrorArrA = a();
        f26547a = taxInfoValidationErrorArrA;
        f26548b = s.n(taxInfoValidationErrorArrA);
    }

    private TaxInfoValidationError(String str, int i) {
    }

    private static final /* synthetic */ TaxInfoValidationError[] a() {
        return new TaxInfoValidationError[]{INVALID_TAXPAYER_IDENTIFICATION_NUMBER, INVALID_TAXATION_COUNTRY_CODE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26548b;
    }

    public static TaxInfoValidationError valueOf(String str) {
        return (TaxInfoValidationError) Enum.valueOf(TaxInfoValidationError.class, str);
    }

    public static TaxInfoValidationError[] values() {
        return (TaxInfoValidationError[]) f26547a.clone();
    }
}
