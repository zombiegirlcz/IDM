package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements qji.a, soe.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxNumberInputFlowContract$InputData f162872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f162874c = this;
    public final e4m.e d;
    public final e4m.e e;

    public m(o oVar, TaxNumberInputFlowContract$InputData taxNumberInputFlowContract$InputData) {
        this.f162873b = oVar;
        this.f162872a = taxNumberInputFlowContract$InputData;
        int i = 18;
        this.d = e4m.b.b(new i9e.l(oVar, this, 0, i));
        this.e = e4m.b.b(new i9e.l(oVar, this, 1, i));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f162873b, this.f162874c, 3);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // soe.a
    public final w j() {
        return new w(this.f162873b, this.f162874c, 2);
    }
}
