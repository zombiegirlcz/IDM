package qc9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import java.util.Set;
import oc9.x;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsScreenContract$InputData f244636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f244637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f244638c;
    public final e4m.e d;

    public e(c cVar, d dVar, QesTermsScreenContract$InputData qesTermsScreenContract$InputData) {
        this.f244637b = dVar;
        this.f244636a = qesTermsScreenContract$InputData;
        this.f244638c = e4m.b.b(new ppd.j(cVar, dVar, this, 1, 7));
        this.d = e4m.b.b(new ppd.j(cVar, dVar, this, 0, 7));
    }

    @Override // qc9.o
    public final x a() {
        return (x) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f244637b.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
