package qxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationTargetingOnboardingService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import pti.s;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingService f250059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f250060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f250061c;
    public final x4l.c d;

    public c(RevPointsPersonalisationTargetingOnboardingService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f250059a = service;
        this.f250060b = storage;
        this.f250061c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 6), new qtb.c(this, 15), new qm2.c(this, 18), new b(this, continuation, 0), new q(this, continuation, 19), new b(this, continuation, 1));
    }
}
