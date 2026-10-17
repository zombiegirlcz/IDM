package ge1;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f143215a;

    public l(j catalogueScreenMapper) {
        Intrinsics.checkNotNullParameter(catalogueScreenMapper, "catalogueScreenMapper");
        this.f143215a = catalogueScreenMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f143208a, new gd8.j(this, 9), new gcc.c(this, 6), new fyg.b(this, domainState, 12));
    }
}
