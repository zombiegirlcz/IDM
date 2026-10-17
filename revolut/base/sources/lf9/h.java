package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xki.c, ng9.a, pg9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormFlowContract$InputData f194716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f194718c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194719g;

    public h(m mVar, FormFlowContract$InputData formFlowContract$InputData) {
        this.f194717b = mVar;
        this.f194716a = formFlowContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new l9f.z(mVar, this, 0, i));
        this.e = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.f = e4m.b.b(new l9f.z(mVar, this, 2, i));
        this.f194719g = e4m.b.b(new l9f.z(mVar, this, 3, i));
    }

    @Override // ng9.a
    public final v b() {
        return new v(this.f194717b, this.f194718c, 0);
    }

    @Override // pg9.a
    public final x c() {
        return new x(this.f194717b, this.f194718c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }
}
