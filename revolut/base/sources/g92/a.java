package g92;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnrollmentDetailsScreenContract$InputData f141428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141430c;

    public a(e eVar, f fVar, EnrollmentDetailsScreenContract$InputData enrollmentDetailsScreenContract$InputData) {
        this.f141428a = enrollmentDetailsScreenContract$InputData;
        int i = 10;
        this.f141429b = e4m.b.b(new fta.e(eVar, this, 1, i));
        this.f141430c = e4m.b.b(new fta.e(eVar, this, 0, i));
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
