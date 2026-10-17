package tv7;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv7.d f274730a;

    public l(xv7.d contactsSectionMapper) {
        Intrinsics.checkNotNullParameter(contactsSectionMapper, "contactsSectionMapper");
        this.f274730a = contactsSectionMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f274721a, new tsk.j(this, 13), new tq0.j(this, 23), new tch.c(this, 10));
    }
}
