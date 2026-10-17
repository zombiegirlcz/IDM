package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c, ng9.a, pg9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillsCatalogueFlowContract$InputData f194683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f194685c = this;
    public final e4m.e d;

    public b(m mVar, BillsCatalogueFlowContract$InputData billsCatalogueFlowContract$InputData) {
        this.f194684b = mVar;
        this.f194683a = billsCatalogueFlowContract$InputData;
        this.d = e4m.b.b(new ld1.g(mVar, this, 7));
    }

    @Override // ng9.a
    public final v b() {
        return new v(this.f194684b, this.f194685c, 1);
    }

    @Override // pg9.a
    public final x c() {
        return new x(this.f194684b, this.f194685c, 1);
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
