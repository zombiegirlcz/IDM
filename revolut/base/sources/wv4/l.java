package wv4;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import mx4.x;
import org.jetbrains.annotations.NotNull;
import wp4.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f300299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx4.h f300300b;

    public l(x contentListItemMapper, mx4.h actionFooterMapper) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        this.f300299a = contentListItemMapper;
        this.f300300b = actionFooterMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f300291a, new wuk.c(this), new wug.k(9), new j0(this, 11));
    }
}
