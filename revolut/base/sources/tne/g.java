package tne;

import cli.n;
import cli.y;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements dli.b {
    public final LimitOrderAmountSelectorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f272435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nne.b f272436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f272437r;

    public g(n stateMapper, LimitOrderAmountSelectorScreenContract$InputData inputData, w80.b amountFormatter, nne.b taxExemptionInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(taxExemptionInteractor, "taxExemptionInteractor");
        this.o = inputData;
        this.f272435p = amountFormatter;
        this.f272436q = taxExemptionInteractor;
        TaxExemptionAggregate taxExemptionAggregate = inputData.f89997a;
        dj0.d dVar = taxExemptionAggregate.d;
        this.f272437r = mra.d.b(this, new d(taxExemptionAggregate, amountFormatter.e(dVar == null ? taxExemptionAggregate.e : dVar)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272437r;
    }
}
