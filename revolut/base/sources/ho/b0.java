package ho;

import ho.n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpk.c f154144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo.f f154145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no.q f154146c;

    public b0(gpk.c analyticsCoroutineScopeProvider, uo.f eventsBuilder, no.q repository) {
        Intrinsics.checkNotNullParameter(analyticsCoroutineScopeProvider, "analyticsCoroutineScopeProvider");
        Intrinsics.checkNotNullParameter(eventsBuilder, "eventsBuilder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f154144a = analyticsCoroutineScopeProvider;
        this.f154145b = eventsBuilder;
        this.f154146c = repository;
    }

    @Override // ho.t
    public final void e2(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof n.a) {
            CoroutineScope coroutineScopeC = this.f154144a.c();
            p0 p0Var = p0.f264001a;
            skm.e0.C(coroutineScopeC, elm.f.f127540b, null, new a0(this, event, null), 2);
        }
    }
}
