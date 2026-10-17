package fd2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements kd2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDealFlowDestination.InputData f133877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f133878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f133879c = this;
    public final e4m.e d;

    public j(g gVar, IDealFlowDestination.InputData inputData) {
        this.f133878b = gVar;
        this.f133877a = inputData;
        this.d = e4m.b.b(new i(gVar, this));
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
