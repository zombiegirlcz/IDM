package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRegistrationTermsScope$InputData f231682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231684c;

    public i0(v vVar, ApmRegistrationTermsScope$InputData apmRegistrationTermsScope$InputData) {
        this.f231682a = apmRegistrationTermsScope$InputData;
        int i = 1;
        this.f231683b = e4m.b.b(new f0(vVar, this, 1, i));
        this.f231684c = e4m.b.b(new f0(vVar, this, 0, i));
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
