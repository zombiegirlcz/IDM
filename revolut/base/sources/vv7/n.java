package vv7;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vrl.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv7.d f292468a;

    public n(xv7.d contactsSectionMapper) {
        Intrinsics.checkNotNullParameter(contactsSectionMapper, "contactsSectionMapper");
        this.f292468a = contactsSectionMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f292461a, new i0(this), new l(this, 0), new vjh.c(this, 8));
    }
}
