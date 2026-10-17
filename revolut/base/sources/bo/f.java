package bo;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import no.j2;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class f extends nri.a implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f17250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.c f17251c;
    public final Clock d;
    public final yh0.c e;
    public final j2 f;

    public f(ifm.b appDisposable, ve0.c storage, Clock clock, yh0.c integrityCheckEventProvider, j2 settingsEventsTracker) {
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(integrityCheckEventProvider, "integrityCheckEventProvider");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        this.f17250b = appDisposable;
        this.f17251c = storage;
        this.d = clock;
        this.e = integrityCheckEventProvider;
        this.f = settingsEventsTracker;
    }

    @Override // nri.a
    public final void i3() {
        r rVarFilter = this.e.d.filter(new ag.j(new an0.e(2), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        s sVar = new s(this, 1);
        r rVarOnErrorResumeNext = rVarFilter.onErrorResumeNext(new a31.a(new c(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new e(0, sVar), new e(0, d.f17247a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(this.f17250b, cVarSubscribe);
    }
}
