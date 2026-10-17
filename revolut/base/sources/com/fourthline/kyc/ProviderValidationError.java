package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/kyc/ProviderValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_NAME", "INVALID_CLIENT_NUMBER", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ProviderValidationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ ProviderValidationError[] f26531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26532b;
    public static final ProviderValidationError INVALID_NAME = new ProviderValidationError("INVALID_NAME", 0);
    public static final ProviderValidationError INVALID_CLIENT_NUMBER = new ProviderValidationError("INVALID_CLIENT_NUMBER", 1);

    static {
        ProviderValidationError[] providerValidationErrorArrA = a();
        f26531a = providerValidationErrorArrA;
        f26532b = s.n(providerValidationErrorArrA);
    }

    private ProviderValidationError(String str, int i) {
    }

    private static final /* synthetic */ ProviderValidationError[] a() {
        return new ProviderValidationError[]{INVALID_NAME, INVALID_CLIENT_NUMBER};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26532b;
    }

    public static ProviderValidationError valueOf(String str) {
        return (ProviderValidationError) Enum.valueOf(ProviderValidationError.class, str);
    }

    public static ProviderValidationError[] values() {
        return (ProviderValidationError[]) f26531a.clone();
    }
}
