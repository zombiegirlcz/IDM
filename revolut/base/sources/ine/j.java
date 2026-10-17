package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubmitTaxResidencyFlowContract$InputData f162861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162863c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f162864g;

    public j(o oVar, BaseFlow baseFlow, SubmitTaxResidencyFlowContract$InputData submitTaxResidencyFlowContract$InputData) {
        this.f162861a = submitTaxResidencyFlowContract$InputData;
        this.f162862b = e4m.b.b(e4m.c.a(baseFlow));
        int i = 16;
        this.f162863c = e4m.b.b(new i9e.l(oVar, this, 2, i));
        this.d = e4m.b.b(new i9e.l(oVar, this, 1, i));
        this.e = e4m.b.b(new i9e.l(oVar, this, 0, i));
        this.f = e4m.b.b(new i9e.l(oVar, this, 4, i));
        this.f162864g = e4m.b.b(new i9e.l(oVar, this, 3, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
