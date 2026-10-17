package com.onfido.android.sdk.capture.ui.country_selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/country_selection/CountryAlternatives;", "", "(Ljava/lang/String;I)V", "NO_COUNTRY", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryAlternatives {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CountryAlternatives[] $VALUES;
    public static final CountryAlternatives NO_COUNTRY = new CountryAlternatives("NO_COUNTRY", 0);

    private static final /* synthetic */ CountryAlternatives[] $values() {
        return new CountryAlternatives[]{NO_COUNTRY};
    }

    static {
        CountryAlternatives[] countryAlternativesArr$values = $values();
        $VALUES = countryAlternativesArr$values;
        $ENTRIES = s.n(countryAlternativesArr$values);
    }

    private CountryAlternatives(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CountryAlternatives valueOf(String str) {
        return (CountryAlternatives) Enum.valueOf(CountryAlternatives.class, str);
    }

    public static CountryAlternatives[] values() {
        return (CountryAlternatives[]) $VALUES.clone();
    }
}
