package com.onfido.android.sdk.capture.internal.ui.countryselection;

import com.onfido.android.sdk.capture.utils.CountryCodeExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/BaseAdapterItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CountrySelectionAdapter$filterBy$newItems$2 extends u implements Function1<BaseAdapterItem, Comparable<?>> {
    final /* synthetic */ String $searchTerm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectionAdapter$filterBy$newItems$2(String str) {
        super(1);
        this.$searchTerm = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(@NotNull BaseAdapterItem it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Integer.valueOf(d0.Q(CountryCodeExtensionsKt.getDisplayName(((CountryAvailability) it8).getCountryCode()), this.$searchTerm, 0, true));
    }
}
