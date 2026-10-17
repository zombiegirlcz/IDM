package qq4;

import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import qjj.g;
import qpb.i;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rm4.c f248491a;

    public f(rm4.c cardsSectionMapper) {
        Intrinsics.checkNotNullParameter(cardsSectionMapper, "cardsSectionMapper");
        this.f248491a = cardsSectionMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f248484a, new i(this, 15), new g(this, 26), new qbg.j(this, 13));
    }
}
