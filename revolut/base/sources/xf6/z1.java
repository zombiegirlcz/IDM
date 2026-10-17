package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpdateLimitsScreenContract$InputData f305188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f305189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305190c;
    public final e4m.e d;
    public final e4m.e e;

    public z1(y1 y1Var, UpdateLimitsScreenContract$InputData updateLimitsScreenContract$InputData) {
        this.f305189b = y1Var;
        this.f305188a = updateLimitsScreenContract$InputData;
        int i = 4;
        this.f305190c = e4m.b.b(new t1(y1Var, this, 2, i));
        this.d = e4m.b.b(new t1(y1Var, this, 1, i));
        this.e = e4m.b.b(new t1(y1Var, this, 0, i));
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
