package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendWalletsListControllerContract$InputData f323914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f323915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f323916c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f323917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f323918h;
    public final e4m.e i;

    public j(d dVar, CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData) {
        this.f323915b = dVar;
        this.f323914a = cryptoSendWalletsListControllerContract$InputData;
        int i = 23;
        this.f323916c = e4m.b.b(new k0(dVar, this, 1, i));
        this.d = e4m.b.b(new k0(dVar, this, 0, i));
        this.e = e4m.b.b(new k0(dVar, this, 3, i));
        this.f = e4m.b.b(new k0(dVar, this, 2, i));
        this.f323917g = e4m.b.b(new k0(dVar, this, 5, i));
        this.f323918h = e4m.b.b(new k0(dVar, this, 4, i));
        this.i = e4m.b.b(new k0(dVar, this, 6, i));
    }

    public final gr5.a b() {
        d dVar = this.f323915b;
        l80.e eVarH = dVar.f323893n.h();
        vc.s.j(eVarH);
        e3a.b bVar = (e3a.b) ((s3a.k) dVar.C).f259536k0.get();
        vc.s.j(bVar);
        return new gr5.a(eVarH, bVar);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get(), (yji.n) this.f323918h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
