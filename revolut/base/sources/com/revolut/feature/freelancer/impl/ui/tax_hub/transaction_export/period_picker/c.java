package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f74413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period f74414b;

    public c(List availablePeriods, TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f74413a = availablePeriods;
        this.f74414b = selectedPeriod;
    }

    @Override // com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period a() {
        return this.f74414b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f74413a, cVar.f74413a) && Intrinsics.f(this.f74414b, cVar.f74414b);
    }

    public final int hashCode() {
        return this.f74414b.hashCode() + (this.f74413a.hashCode() * 31);
    }
}
