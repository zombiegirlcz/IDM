package qc9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$InputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingForQesResultScreenContract$InputData f244639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f244640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f244641c;
    public final e4m.e d;

    public f(c cVar, d dVar, WaitingForQesResultScreenContract$InputData waitingForQesResultScreenContract$InputData) {
        this.f244640b = dVar;
        this.f244639a = waitingForQesResultScreenContract$InputData;
        int i = 18;
        this.f244641c = e4m.b.b(new k0(cVar, this, 1, i));
        this.d = e4m.b.b(new k0(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f244640b.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
