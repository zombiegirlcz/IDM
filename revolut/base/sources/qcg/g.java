package qcg;

import aw0.d0;
import cli.j;
import cli.n;
import cli.o;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import ocg.m;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f244785b = new d0(167, 180);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f244786a;

    public g(i recentlySavedMapper, a favoriteLocationMapper) {
        Intrinsics.checkNotNullParameter(recentlySavedMapper, "recentlySavedMapper");
        Intrinsics.checkNotNullParameter(favoriteLocationMapper, "favoriteLocationMapper");
        this.f244786a = recentlySavedMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        ocg.g domainState = (ocg.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m(zhm.d0.E0(v.l(domainState.f224236b.getContent()), (Collection) iii.c.f(domainState.f224235a, new qc7.c(this, 14), new qc8.a(8), new qbg.j(this, 3))));
    }
}
