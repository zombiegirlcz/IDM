package com.onfido.android.sdk.capture.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"displayName", "", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDisplayName", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;)Ljava/lang/String;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CountryCodeExtensionsKt {
    @NotNull
    public static final String getDisplayName(@NotNull CountryCode countryCode) {
        String nativeName;
        Intrinsics.checkNotNullParameter(countryCode, "<this>");
        if (Intrinsics.f(countryCode.getLocaleName(), countryCode.getNativeName()) || (nativeName = countryCode.getNativeName()) == null || nativeName.length() == 0) {
            String localeName = countryCode.getLocaleName();
            return localeName == null ? countryCode.name() : localeName;
        }
        return countryCode.getLocaleName() + " | " + countryCode.getNativeName();
    }
}
