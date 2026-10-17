package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1h.f f193214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferProgressScreenContract$InputData f193215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f193216c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f193218h;
    public final e4m.e i;

    public r(k kVar, q qVar, TransferProgressScreenContract$InputData transferProgressScreenContract$InputData, h1h.f fVar) {
        this.f193216c = kVar;
        this.f193214a = fVar;
        this.f193215b = transferProgressScreenContract$InputData;
        int i = 26;
        this.d = e4m.b.b(new kr9.m(kVar, this, 1, i));
        this.e = e4m.b.b(new kr9.m(kVar, this, 0, i));
        this.f = e4m.b.b(e4m.c.a(fVar));
        int i2 = 26;
        this.f193217g = e4m.b.b(new kr9.m(kVar, this, 3, i2));
        this.f193218h = e4m.b.b(new kr9.m(kVar, this, 2, i2));
        this.i = e4m.b.b(new kr9.m(kVar, this, 4, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f193217g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f193218h.get());
    }
}
