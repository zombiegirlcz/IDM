package js4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt4.h f178141a;

    public p(vt4.h suggestedBarDelegateMapper) {
        Intrinsics.checkNotNullParameter(suggestedBarDelegateMapper, "suggestedBarDelegateMapper");
        this.f178141a = suggestedBarDelegateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f178124a, new jpl.e(this, 13), new jme.f(this, 17), new j75.i(this, 13));
    }
}
