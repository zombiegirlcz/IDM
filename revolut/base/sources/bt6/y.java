package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubTransactionExportFlowContract$InputData f18396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f18398c = this;
    public final e4m.e d;
    public final e4m.e e;

    public y(b bVar, TaxHubTransactionExportFlowContract$InputData taxHubTransactionExportFlowContract$InputData) {
        this.f18397b = bVar;
        this.f18396a = taxHubTransactionExportFlowContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new b6b.m(bVar, this, 0, i));
        this.e = e4m.b.b(new b6b.m(bVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
