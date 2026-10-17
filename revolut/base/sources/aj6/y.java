package aj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi6.o f5436a;

    public y(hi6.o selectionUiStateMapper) {
        Intrinsics.checkNotNullParameter(selectionUiStateMapper, "selectionUiStateMapper");
        this.f5436a = selectionUiStateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f5407b, new aik.d(4), new a8a.a(this, domainState, 1), new a15.n(this, domainState, 16));
    }
}
