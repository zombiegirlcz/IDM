package bo9;

import b6b.m;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CounterPartyDetailsScreenContract$InputData f17342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f17344c;
    public final e4m.e d;
    public final e4m.e e;

    public b(c cVar, CounterPartyDetailsScreenContract$InputData counterPartyDetailsScreenContract$InputData) {
        this.f17343b = cVar;
        this.f17342a = counterPartyDetailsScreenContract$InputData;
        int i = 23;
        this.f17344c = e4m.b.b(new m(cVar, this, 1, i));
        this.d = e4m.b.b(new m(cVar, this, 0, i));
        this.e = e4m.b.b(new m(cVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
