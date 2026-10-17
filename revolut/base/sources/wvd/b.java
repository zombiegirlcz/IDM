package wvd;

import com.revolut.feature.staking.impl.service.consent.AutoStakingConsentService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import wkg.e;
import wtc.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f300312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f300313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutoStakingConsentService f300314c;
    public final x4l.c d;

    public b(c storage, j memoryCache, AutoStakingConsentService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f300312a = storage;
        this.f300313b = memoryCache;
        this.f300314c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 1), new wpj.b(this, 21), new wtj.c(this, 5), new e(this, continuation, 18), new wa7.j(this, continuation, 3));
    }
}
