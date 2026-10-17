package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements qji.a, ooe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollectTaxResidencyFlowContract$InputData f162840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f162842c = this;
    public final e4m.e d = e4m.b.b(new idb.b(this, 13));

    public b(o oVar, CollectTaxResidencyFlowContract$InputData collectTaxResidencyFlowContract$InputData) {
        this.f162841b = oVar;
        this.f162840a = collectTaxResidencyFlowContract$InputData;
    }

    @Override // ooe.a
    public final u b() {
        return new u(this.f162841b, this.f162842c, 1);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
