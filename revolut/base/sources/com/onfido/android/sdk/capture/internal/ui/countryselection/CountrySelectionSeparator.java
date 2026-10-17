package com.onfido.android.sdk.capture.internal.ui.countryselection;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionSeparator;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/BaseAdapterItem;", "type", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionSeparatorType;", "(Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionSeparatorType;)V", "getType", "()Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionSeparatorType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CountrySelectionSeparator extends BaseAdapterItem {

    @NotNull
    private final CountrySelectionSeparatorType type;

    public CountrySelectionSeparator(@NotNull CountrySelectionSeparatorType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public static /* synthetic */ CountrySelectionSeparator copy$default(CountrySelectionSeparator countrySelectionSeparator, CountrySelectionSeparatorType countrySelectionSeparatorType, int i, Object obj2) {
        if ((i & 1) != 0) {
            countrySelectionSeparatorType = countrySelectionSeparator.type;
        }
        return countrySelectionSeparator.copy(countrySelectionSeparatorType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CountrySelectionSeparatorType getType() {
        return this.type;
    }

    @NotNull
    public final CountrySelectionSeparator copy(@NotNull CountrySelectionSeparatorType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CountrySelectionSeparator(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CountrySelectionSeparator) && this.type == ((CountrySelectionSeparator) other).type;
    }

    @NotNull
    public final CountrySelectionSeparatorType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "CountrySelectionSeparator(type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
