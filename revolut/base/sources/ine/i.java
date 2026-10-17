package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements xki.c, soe.a, ooe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleTinCollectionFlowContract$InputData f162858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f162860c = this;
    public final e4m.e d = e4m.b.b(new idb.b(this, 18));

    public i(o oVar, SingleTinCollectionFlowContract$InputData singleTinCollectionFlowContract$InputData) {
        this.f162859b = oVar;
        this.f162858a = singleTinCollectionFlowContract$InputData;
    }

    @Override // ooe.a
    public final u b() {
        return new u(this.f162859b, this.f162860c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // soe.a
    public final w j() {
        return new w(this.f162859b, this.f162860c, 1);
    }
}
