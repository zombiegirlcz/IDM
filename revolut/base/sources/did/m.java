package did;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsMapViewScreenContract$InputData f115039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115041c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f115042g;

    public m(d dVar, ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData) {
        this.f115040b = dVar;
        this.f115039a = shopsMapViewScreenContract$InputData;
        this.f115041c = e4m.b.b(new db1.f(dVar, this, 1, 11));
        this.d = e4m.b.b(new db1.f(dVar, this, 0, 11));
        this.e = e4m.b.b(new db1.f(dVar, this, 3, 11));
        this.f = e4m.b.b(new db1.f(dVar, this, 2, 11));
        this.f115042g = e4m.b.b(new db1.f(dVar, this, 4, 11));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
