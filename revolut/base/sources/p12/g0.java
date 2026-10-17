package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTerms$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class g0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRegistrationTerms$InputData f231671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231673c;

    public g0(v vVar, ApmRegistrationTerms$InputData apmRegistrationTerms$InputData) {
        this.f231671a = apmRegistrationTerms$InputData;
        int i = 0;
        this.f231672b = e4m.b.b(new f0(vVar, this, 1, i));
        this.f231673c = e4m.b.b(new f0(vVar, this, 0, i));
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
