package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlowContract$Input;
import java.util.Set;
import jm4.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements oqh.c, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerRedesignFlowContract$Input f177058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f177059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f177060c = this;
    public final e4m.e d = e4m.b.b(new n1(this, 17));

    public t(w wVar, ScreenerRedesignFlowContract$Input screenerRedesignFlowContract$Input) {
        this.f177059b = wVar;
        this.f177058a = screenerRedesignFlowContract$Input;
    }

    @Override // oqh.c
    public final oqh.a c() {
        r10.d dVar = new r10.d();
        dVar.f250818a = this.f177059b;
        dVar.f250819b = this.f177060c;
        return dVar;
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
