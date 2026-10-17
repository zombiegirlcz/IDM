package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlowContract$InputData;
import java.util.Set;
import kl.b0;
import kyk.n;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsFlowContract$InputData f191293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0h.a f191294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f191295c;
    public final h d = this;
    public final e4m.e e;
    public final e4m.e f;

    public h(c cVar, o0h.a aVar, WealthNewsFlowContract$InputData wealthNewsFlowContract$InputData) {
        this.f191295c = cVar;
        this.f191293a = wealthNewsFlowContract$InputData;
        this.f191294b = aVar;
        int i = 4;
        this.e = e4m.b.b(new n(this, 0, i));
        this.f = e4m.b.b(new n(this, 1, i));
    }

    public final b0 b() {
        return nga.c.B(this.f191294b, this.f191295c.k.a());
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
