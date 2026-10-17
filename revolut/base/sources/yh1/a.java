package yh1;

import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddAddressScreenContract$InputData f313690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f313691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f313692c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wpg.g f313693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wpg.g f313694h;
    public final wpg.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f313695j;

    public a(e eVar, d dVar, AddAddressScreenContract$InputData addAddressScreenContract$InputData) {
        this.f313690a = addAddressScreenContract$InputData;
        this.f313691b = e4m.b.b(new wpg.g(eVar, dVar, this, 1, 17));
        int i = 17;
        this.f313692c = e4m.b.b(new wpg.g(eVar, dVar, this, 0, i));
        this.d = e4m.b.b(new wpg.g(eVar, dVar, this, 4, i));
        this.e = e4m.b.b(new wpg.g(eVar, dVar, this, 3, i));
        this.f = e4m.b.b(new wpg.g(eVar, dVar, this, 5, i));
        this.f313693g = new wpg.g(eVar, dVar, this, 6, i);
        this.f313694h = new wpg.g(eVar, dVar, this, 7, i);
        this.i = new wpg.g(eVar, dVar, this, 8, i);
        this.f313695j = e4m.b.b(new wpg.g(eVar, dVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((n) this.f313692c.get());
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
