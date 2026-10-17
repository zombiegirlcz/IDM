package p19;

import f19.h;
import f39.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r19.e;
import w4l.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f231882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f231883b;

    public a(c lifestyleFeaturesProvider, e repository) {
        Intrinsics.checkNotNullParameter(lifestyleFeaturesProvider, "lifestyleFeaturesProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f231882a = lifestyleFeaturesProvider;
        this.f231883b = repository;
    }

    public final Flow a(h placementReference, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(placementReference, "placementReference");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new a9h.a(this, placementReference, loadingStrategy, (Continuation) null, 20), c.b(this.f231882a));
    }
}
