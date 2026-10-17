package vj1;

import akl.v;
import com.revolut.feature.advised_components.network.AdvisedComponentsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import vge.z1;
import vh2.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvisedComponentsService f289629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f289630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f289631c;
    public final gte.a d;
    public final x4l.c e;

    public b(AdvisedComponentsService service, d memoryCache, c storage, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289629a = service;
        this.f289630b = memoryCache;
        this.f289631c = storage;
        this.d = featureToggleInteractor;
        Continuation continuation = null;
        this.e = new x4l.c(new v(this, continuation, 3), new j(this, 9), new vh9.b(this, 3), new z1(this, continuation, 2), new ska.c(this, continuation, 29));
    }
}
