package x0d;

import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingInvitationService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wa7.j;
import wtc.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentOnboardingInvitationService f301571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f301572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f301573c;
    public final x4l.c d;

    public e(SemiIndependentOnboardingInvitationService service, ne0.d memoryCache, xe0.e storage, y0d.a guardianInvitationResultMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(guardianInvitationResultMapper, "guardianInvitationResultMapper");
        this.f301571a = service;
        this.f301572b = memoryCache;
        this.f301573c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 4), new x0b.c(this, 3), new wtj.c(this, 25), new wkg.e(this, continuation, 29), new j(this, continuation, 6));
    }
}
