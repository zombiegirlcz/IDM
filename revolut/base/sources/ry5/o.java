package ry5;

import cli.y;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ry5.i;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements h {
    public final nw5.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f258236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ce9.j f258237q;

    public o(g stateMapper, nw5.i cryptoSortedAssetsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cryptoSortedAssetsProvider, "cryptoSortedAssetsProvider");
        this.o = cryptoSortedAssetsProvider;
        this.f258236p = mra.d.b(this, new f(new ce9.p(null, null, 61), 2), stateMapper, null, false, 12);
        this.f258237q = new ce9.j(new ru5.m(22), new rl8.d(this, 21));
    }

    @Override // yji.l
    public final void I1() {
        rxb.b bVar = new rxb.b(18);
        y yVar = this.f258236p;
        H2(yVar, bVar);
        ce9.j jVar = this.f258237q;
        yji.l.a1(this, rd0.e.b(jVar.e), null, null, new rt4.o(this, null, 12), 3);
        m70.a.c(t0.f186434a);
        H2(yVar, new rvc.k("", 2));
        io3.h.a(jVar, ce9.n.REFRESH);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zF = Intrinsics.f(event, i.a.f258229a);
        ce9.j jVar = this.f258237q;
        if (zF) {
            io3.h.a(jVar, ce9.n.RETRY_LAST_PAGE);
            return;
        }
        if (!(event instanceof j)) {
            if (event instanceof k) {
                k kVar = (k) event;
                io3.h.p(jVar, kVar.f258231a, kVar.f258232b);
                return;
            } else {
                if (!(event instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                H2(this.f258236p, new rvc.k(((l) event).f258233a, 2));
                io3.h.a(jVar, ce9.n.REFRESH);
                return;
            }
        }
        Pair pair = ((j) event).f258230a;
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey key = y1d.a.f310359c;
        String from = ((xi0.b) pair.f186385a).f306286a;
        String to6 = ((xi0.b) pair.f186386b).f306286a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        xi0.b.Companion.getClass();
        cp5.d.d(new Pair(xi0.a.a(from), xi0.a.a(to6)));
        C2(new gfd.d(u.c(key.f86866a + "-" + from + "-" + to6)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f258236p;
    }
}
