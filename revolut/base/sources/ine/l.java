package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxMissingRationaleFlowContract$InputData f162867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f162869c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f162870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f162871h;
    public final e4m.e i;

    public l(o oVar, BaseFlow baseFlow, TaxMissingRationaleFlowContract$InputData taxMissingRationaleFlowContract$InputData) {
        this.f162868b = oVar;
        this.f162867a = taxMissingRationaleFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseFlow));
        int i = 17;
        this.e = e4m.b.b(new i9e.l(oVar, this, 2, i));
        this.f = e4m.b.b(new i9e.l(oVar, this, 1, i));
        this.f162870g = e4m.b.b(new i9e.l(oVar, this, 0, i));
        this.f162871h = e4m.b.b(new i9e.l(oVar, this, 4, i));
        this.i = e4m.b.b(new i9e.l(oVar, this, 3, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f162870g.get());
    }
}
