package jdi;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.c, ydi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketFlowContract$InputData f173093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f173094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f173095c = this;
    public final e4m.e d = e4m.b.b(new j1a.k(this, 8));

    public f(c cVar, RevPointsPocketFlowContract$InputData revPointsPocketFlowContract$InputData) {
        this.f173094b = cVar;
        this.f173093a = revPointsPocketFlowContract$InputData;
    }

    @Override // ydi.b
    public final ydi.a b() {
        return new h(this.f173094b, this.f173095c);
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
