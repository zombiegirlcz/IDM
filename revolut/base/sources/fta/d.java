package fta;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import fa0.q;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaffleScreenContract$InputData f137991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f137993c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f137994g;

    public d(b bVar, c cVar, ViewController viewController, RaffleScreenContract$InputData raffleScreenContract$InputData) {
        this.f137992b = bVar;
        this.f137991a = raffleScreenContract$InputData;
        this.f137993c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new q(bVar, this, 0, 29));
        this.e = e4m.b.b(new q(bVar, this, 1, 29));
        this.f = e4m.b.b(new q(bVar, this, 3, 29));
        this.f137994g = e4m.b.b(new q(bVar, this, 2, 29));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
