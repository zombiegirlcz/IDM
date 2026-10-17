package hp4;

import cli.n;
import cli.o;
import hp3.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rm4.c f154460a;

    public m(rm4.c cardsSectionMapper) {
        Intrinsics.checkNotNullParameter(cardsSectionMapper, "cardsSectionMapper");
        this.f154460a = cardsSectionMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f154450a, new r(this, 5), new hkb.e(21), new hnc.a(this, 2));
    }
}
