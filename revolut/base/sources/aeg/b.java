package aeg;

import a9d.p;
import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f3576a;

    public b(p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f3576a = travelHotelsFeatureInteractor;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f3577a, new aed.a(this, 5), new p(18), new a15.n(this, domainState, 10));
    }
}
