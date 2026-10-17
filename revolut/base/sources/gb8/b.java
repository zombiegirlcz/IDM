package gb8;

import com.revolut.feature.junior.pending_graduation.impl.data.service.JuniorGraduationService;
import dp4.z0;
import g75.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorGraduationService f142230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f142231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f142232c;
    public final ue0.c d;
    public final x4l.c e;

    public b(JuniorGraduationService service, gte.a featureToggleInteractor, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f142230a = service;
        this.f142231b = featureToggleInteractor;
        this.f142232c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new e6d.f(this, continuation, 9), new g4k.e(this, 21), new i(this, 10), new g85.f(this, continuation, 2), new z0(this, continuation, 18));
    }
}
