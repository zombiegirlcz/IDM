package kek;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$InputData;
import java.util.Set;
import jm4.c3;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesFlowContract$InputData f183127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f183128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f183129c = this;
    public final e4m.e d;

    public d(c cVar, PodNomineesFlowContract$InputData podNomineesFlowContract$InputData) {
        this.f183128b = cVar;
        this.f183127a = podNomineesFlowContract$InputData;
        this.d = e4m.b.b(new c3(cVar, this, 14));
    }

    public final qek.a b() {
        c cVar = this.f183128b;
        v60.e eVarA = cVar.d.a();
        s.j(eVarA);
        sf0.h hVarB = cVar.e.b();
        s.j(hVarB);
        return new qek.a(hVarB, eVarA);
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
