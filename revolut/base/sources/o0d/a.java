package o0d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreenContract$InputData;
import java.util.Set;
import nng.n;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentActivationDetailsScreenContract$InputData f221196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f221197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f221198c;

    public a(c cVar, SemiIndependentActivationDetailsScreenContract$InputData semiIndependentActivationDetailsScreenContract$InputData) {
        this.f221197b = cVar;
        this.f221196a = semiIndependentActivationDetailsScreenContract$InputData;
        this.f221198c = e4m.b.b(new n(cVar, this, 10));
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
