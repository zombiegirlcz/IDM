package yh1;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import java.util.Collections;
import java.util.Set;
import xsl.q;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements ai1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressFlowContract$InputData f313702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh1.d f313703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f313704c;
    public final d d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f313705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.c f313706h;

    public d(e eVar, AddressFlowContract$InputData addressFlowContract$InputData, vh1.d dVar, x7a.d dVar2) {
        this.f313704c = eVar;
        this.f313702a = addressFlowContract$InputData;
        this.f313703b = dVar;
        int i = 22;
        this.e = e4m.b.b(new q(eVar, this, 1, i));
        this.f = e4m.b.b(new q(eVar, this, 0, i));
        this.f313705g = e4m.b.b(new q(eVar, this, 2, i));
        this.f313706h = e4m.c.a(dVar2);
    }

    @Override // ki1.a
    public final k b() {
        return new k(this.f313704c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
