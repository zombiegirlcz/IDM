package dd9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import java.util.Set;
import oc9.x;
import qc9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsScreenContract$InputData f113127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f113128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f113129c;

    public d(e eVar, f fVar, QesTermsScreenContract$InputData qesTermsScreenContract$InputData) {
        this.f113127a = qesTermsScreenContract$InputData;
        this.f113128b = e4m.b.b(new afj.d(eVar, fVar, this, 1, 24));
        this.f113129c = e4m.b.b(new afj.d(eVar, fVar, this, 0, 24));
    }

    @Override // qc9.o
    public final x a() {
        return (x) this.f113129c.get();
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
