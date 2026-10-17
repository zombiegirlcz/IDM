package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MandateLimitInputScreenContract$InputData f305118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f305119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305120c;
    public final e4m.e d;

    public v1(y1 y1Var, MandateLimitInputScreenContract$InputData mandateLimitInputScreenContract$InputData) {
        this.f305119b = y1Var;
        this.f305118a = mandateLimitInputScreenContract$InputData;
        int i = 1;
        this.f305120c = e4m.b.b(new t1(y1Var, this, 1, i));
        this.d = e4m.b.b(new t1(y1Var, this, 0, i));
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
