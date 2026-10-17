package fta;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.raffle.impl.flow.RaffleFlowContract$InputData;
import f4g.m;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaffleFlowContract$InputData f137988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f137990c = this;
    public final e4m.e d;

    public c(b bVar, RaffleFlowContract$InputData raffleFlowContract$InputData) {
        this.f137989b = bVar;
        this.f137988a = raffleFlowContract$InputData;
        this.d = e4m.b.b(new m(bVar, this, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
