package zx7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f326085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f326086c;
    public final fx7.f d;
    public final e0m.c e;

    public q(ifm.b flowDisposable, l state, fx7.f interactor) {
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f326085b = flowDisposable;
        this.f326086c = state;
        this.d = interactor;
        this.e = new e0m.c(new m(this, 0));
    }
}
