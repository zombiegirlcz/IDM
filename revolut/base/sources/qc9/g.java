package qc9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreenContract$InputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingAuthScreenContract$InputData f244642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f244643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f244644c;
    public final e4m.e d;
    public final e4m.e e;

    public g(c cVar, d dVar, WaitingAuthScreenContract$InputData waitingAuthScreenContract$InputData) {
        this.f244643b = dVar;
        this.f244642a = waitingAuthScreenContract$InputData;
        int i = 19;
        this.f244644c = new k0(cVar, this, 1, i);
        this.d = e4m.b.b(new k0(cVar, this, 2, i));
        this.e = e4m.b.b(new k0(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f244643b.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
