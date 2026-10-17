package x0d;

import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingConfigService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wa7.j;
import wtc.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentOnboardingConfigService f301566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f301567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f301568c;
    public final x4l.c d;

    public b(SemiIndependentOnboardingConfigService service, ne0.d memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f301566a = service;
        this.f301567b = memoryCache;
        this.f301568c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 3), new x0b.c(this, 2), new wtj.c(this, 24), new wkg.e(this, continuation, 28), new j(this, continuation, 5));
    }
}
