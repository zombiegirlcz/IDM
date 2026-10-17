package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period f74412a;

    public b(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f74412a = selectedPeriod;
    }

    @Override // com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period a() {
        return this.f74412a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f74412a, ((b) obj2).f74412a);
    }

    public final int hashCode() {
        return this.f74412a.hashCode();
    }
}
