package com.onfido.android.sdk.capture.internal.ui.countryselection;

import com.onfido.android.sdk.capture.utils.CountryCodeExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/BaseAdapterItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CountrySelectionAdapter$filterBy$newItems$3 extends u implements Function1<BaseAdapterItem, Comparable<?>> {
    public static final CountrySelectionAdapter$filterBy$newItems$3 INSTANCE = new CountrySelectionAdapter$filterBy$newItems$3();

    public CountrySelectionAdapter$filterBy$newItems$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(@NotNull BaseAdapterItem it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return CountryCodeExtensionsKt.getDisplayName(((CountryAvailability) it8).getCountryCode());
    }
}
