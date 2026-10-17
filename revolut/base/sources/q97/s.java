package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oih.j f243779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.i f243780b;

    public s(t97.c productCellProvider, oih.j wealthStocksAccountCommandProvider, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f243779a = wealthStocksAccountCommandProvider;
        this.f243780b = productGroupAvailabilityInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.BONDS;
    }

    @Override // p97.c
    public final efm.r b() {
        return rd0.e.c(new pkg.e(vkm.q.q(mo3.a.e(nim.a.u(new r(2, null), ((ael.h0) this.f243780b).b(cfl.p.BONDS)), new ku1.f0(22), new q92.f(3))), this, 13), kotlin.coroutines.g.f186406a);
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        ufm.i iVar = new ufm.i(oih.j.a(this.f243779a, sih.b.BONDS, null, 2), new q3d.c(26, new h(3)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
