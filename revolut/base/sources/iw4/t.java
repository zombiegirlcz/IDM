package iw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt4.h f168960a;

    public t(vt4.h suggestedBarDelegateMapper) {
        Intrinsics.checkNotNullParameter(suggestedBarDelegateMapper, "suggestedBarDelegateMapper");
        this.f168960a = suggestedBarDelegateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f168950a, new iui.a(this, 24), new iui.b(this, 16), new igh.o(this, 19));
    }
}
