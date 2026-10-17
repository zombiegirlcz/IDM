package ryi;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rwg.e0;
import ryd.l;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f258387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f258388b;

    public k(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f258387a = w.y0(new e0(10));
        this.f258388b = w.y0(new e0(11));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(domainState.f258376a, new ryd.k(2), new l(3), new rbe.c(this, domainState, 18)), !domainState.f258377b.isEmpty());
    }
}
