package qth;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.polling.PollingControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PollingControllerContract$InputData f249124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249125b;

    public d(g gVar, i iVar, PollingControllerContract$InputData pollingControllerContract$InputData) {
        this.f249124a = pollingControllerContract$InputData;
        this.f249125b = e4m.b.b(new d2h.b(gVar, 23, iVar, this));
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
