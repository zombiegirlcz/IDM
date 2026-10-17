package y1l;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreenContract$InputData;
import i7d.n;
import i7d.o;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f310411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelStatusPartnerScreenContract$InputData f310412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f310413c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(b bVar, d dVar, TravelStatusPartnerScreenContract$InputData travelStatusPartnerScreenContract$InputData, i7d.i iVar) {
        this.f310413c = bVar;
        this.f310411a = iVar;
        this.f310412b = travelStatusPartnerScreenContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new q(bVar, this, 1, i));
        this.e = e4m.b.b(new q(bVar, this, 0, i));
        this.f = e4m.b.b(new q(bVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        o oVar = (o) this.d.get();
        h7d.e.a(oVar);
        return ImmutableSet.of(oVar);
    }

    @Override // xki.e
    public final Set g() {
        n nVar = (n) this.e.get();
        h7d.c.a(nVar);
        return ImmutableSet.of(nVar);
    }
}
