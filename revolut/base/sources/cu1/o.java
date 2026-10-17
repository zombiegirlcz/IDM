package cu1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements mu1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlikFlowDestination.InputData f108768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f108769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f108770c = this;
    public final e4m.e d;

    public o(k kVar, BlikFlowDestination.InputData inputData) {
        this.f108769b = kVar;
        this.f108768a = inputData;
        this.d = e4m.b.b(new n(kVar, this));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
