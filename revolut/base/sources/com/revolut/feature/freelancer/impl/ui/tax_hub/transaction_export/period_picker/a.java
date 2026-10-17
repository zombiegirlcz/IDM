package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period f74411a;

    public a(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f74411a = selectedPeriod;
    }

    @Override // com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period a() {
        return this.f74411a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f74411a, ((a) obj2).f74411a);
    }

    public final int hashCode() {
        return this.f74411a.hashCode();
    }
}
