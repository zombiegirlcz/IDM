package com.onfido.android.sdk.capture.internal.ui.countryselection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedPoaCountry;", "", "countryCodeAlpha2", "", "countryCodeAlpha3", "countryEnglishName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCodeAlpha2", "()Ljava/lang/String;", "getCountryCodeAlpha3", "getCountryEnglishName", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SupportedPoaCountry {

    @NotNull
    private final String countryCodeAlpha2;

    @NotNull
    private final String countryCodeAlpha3;

    @NotNull
    private final String countryEnglishName;

    public SupportedPoaCountry(@NotNull String countryCodeAlpha2, @NotNull String countryCodeAlpha3, @NotNull String countryEnglishName) {
        Intrinsics.checkNotNullParameter(countryCodeAlpha2, "countryCodeAlpha2");
        Intrinsics.checkNotNullParameter(countryCodeAlpha3, "countryCodeAlpha3");
        Intrinsics.checkNotNullParameter(countryEnglishName, "countryEnglishName");
        this.countryCodeAlpha2 = countryCodeAlpha2;
        this.countryCodeAlpha3 = countryCodeAlpha3;
        this.countryEnglishName = countryEnglishName;
    }

    @NotNull
    public final String getCountryCodeAlpha2() {
        return this.countryCodeAlpha2;
    }

    @NotNull
    public final String getCountryCodeAlpha3() {
        return this.countryCodeAlpha3;
    }

    @NotNull
    public final String getCountryEnglishName() {
        return this.countryEnglishName;
    }
}
