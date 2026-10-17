package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportTermsScreenContract$InputData f155968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155970c;
    public final e4m.e d;

    public v(q qVar, TransportTermsScreenContract$InputData transportTermsScreenContract$InputData) {
        this.f155969b = qVar;
        this.f155968a = transportTermsScreenContract$InputData;
        int i = 13;
        this.f155970c = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.d = e4m.b.b(new hjg.b(qVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155969b.f155949n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
