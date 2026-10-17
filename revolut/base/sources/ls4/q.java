package ls4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt4.h f199626a;

    public q(vt4.h suggestedBarDelegateMapper) {
        Intrinsics.checkNotNullParameter(suggestedBarDelegateMapper, "suggestedBarDelegateMapper");
        this.f199626a = suggestedBarDelegateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f199614a, new loc.a(this, 21), new lnk.o(this, 6), new lk7.n(this, 5));
    }
}
