package emi;

import cmi.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f127669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cmi.a f127670c;

    public d(n coordinator, cmi.a lifecycleLogger) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(lifecycleLogger, "lifecycleLogger");
        this.f127669b = coordinator;
        this.f127670c = lifecycleLogger;
    }

    @Override // nri.a
    public final void i3() {
        ((nri.a) this.f127669b).init();
        this.f127670c.getClass();
    }
}
