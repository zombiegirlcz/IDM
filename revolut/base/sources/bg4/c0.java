package bg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f15099a;

    public c0(d0 uiStateFactory) {
        Intrinsics.checkNotNullParameter(uiStateFactory, "uiStateFactory");
        this.f15099a = uiStateFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (v) iii.c.f(domainState.f15104a, new bek.a(this, 9), new bb2.t(this, 20), new b1c.p(this, domainState, 12));
    }
}
