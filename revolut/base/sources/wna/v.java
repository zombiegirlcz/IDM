package wna;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f298768a;

    public v(u sectionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(sectionMapper, "sectionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f298768a = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new q((List) iii.c.f(domainState.f298741a, new wl3.d(26), new wm9.k(4), new vh2.o(this, domainState, 21)));
    }
}
