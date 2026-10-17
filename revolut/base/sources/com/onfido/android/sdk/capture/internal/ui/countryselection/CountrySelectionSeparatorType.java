package com.onfido.android.sdk.capture.internal.ui.countryselection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionSeparatorType;", "", "(Ljava/lang/String;I)V", "SUGGESTED_COUNTRY", "ALL_COUNTRIES", "SEPARATOR", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountrySelectionSeparatorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CountrySelectionSeparatorType[] $VALUES;
    public static final CountrySelectionSeparatorType SUGGESTED_COUNTRY = new CountrySelectionSeparatorType("SUGGESTED_COUNTRY", 0);
    public static final CountrySelectionSeparatorType ALL_COUNTRIES = new CountrySelectionSeparatorType("ALL_COUNTRIES", 1);
    public static final CountrySelectionSeparatorType SEPARATOR = new CountrySelectionSeparatorType("SEPARATOR", 2);

    private static final /* synthetic */ CountrySelectionSeparatorType[] $values() {
        return new CountrySelectionSeparatorType[]{SUGGESTED_COUNTRY, ALL_COUNTRIES, SEPARATOR};
    }

    static {
        CountrySelectionSeparatorType[] countrySelectionSeparatorTypeArr$values = $values();
        $VALUES = countrySelectionSeparatorTypeArr$values;
        $ENTRIES = s.n(countrySelectionSeparatorTypeArr$values);
    }

    private CountrySelectionSeparatorType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CountrySelectionSeparatorType valueOf(String str) {
        return (CountrySelectionSeparatorType) Enum.valueOf(CountrySelectionSeparatorType.class, str);
    }

    public static CountrySelectionSeparatorType[] values() {
        return (CountrySelectionSeparatorType[]) $VALUES.clone();
    }
}
