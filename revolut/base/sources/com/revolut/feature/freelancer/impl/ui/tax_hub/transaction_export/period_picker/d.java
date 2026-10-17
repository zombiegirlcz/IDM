package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.feature.statements.api.models.TaxPeriod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f74415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period f74416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaxPeriod f74417c;

    public d(ArrayList availablePeriods, TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod, TaxPeriod taxPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        this.f74415a = availablePeriods;
        this.f74416b = selectedPeriod;
        this.f74417c = taxPeriod;
    }

    @Override // com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e
    public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period a() {
        return this.f74416b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f74415a.equals(dVar.f74415a) && this.f74416b.equals(dVar.f74416b) && this.f74417c.equals(dVar.f74417c);
    }

    public final int hashCode() {
        return this.f74417c.hashCode() + ((this.f74416b.hashCode() + (this.f74415a.hashCode() * 31)) * 31);
    }
}
