package tq1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements br1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagoPAFlowDestination.InputData f273497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f273498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f273499c = this;
    public final e4m.e d;
    public final e4m.e e;

    public h(d dVar, PagoPAFlowDestination.InputData inputData) {
        this.f273498b = dVar;
        this.f273497a = inputData;
        this.d = e4m.b.b(new g(dVar, this, 1));
        this.e = e4m.b.b(new g(dVar, this, 0));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
