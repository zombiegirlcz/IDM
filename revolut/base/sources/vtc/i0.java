package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityDelayInputData f291990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f291991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f291992c;

    public i0(k0 k0Var, SecurityDelayInputData securityDelayInputData) {
        this.f291990a = securityDelayInputData;
        int i = 22;
        this.f291991b = e4m.b.b(new vn2.l(k0Var, this, 1, i));
        this.f291992c = e4m.b.b(new vn2.l(k0Var, this, 0, i));
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
