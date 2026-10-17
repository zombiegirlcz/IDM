package t4l;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import sri.m;
import vkm.q;
import vkm.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends nri.a implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f268008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f268009c;
    public final m d;
    public final rql.b e;
    public final su9.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final arh.a f268010g;

    public d(CoroutineScope coroutineScope, gte.a featureTogglesInteractor, m navigator, rql.b ssoReauthenticationRequestRepository, su9.c ssoJwtDecoder, arh.a wealthProtectionSsoAnimationScreenshotInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(featureTogglesInteractor, "featureTogglesInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRequestRepository, "ssoReauthenticationRequestRepository");
        Intrinsics.checkNotNullParameter(ssoJwtDecoder, "ssoJwtDecoder");
        Intrinsics.checkNotNullParameter(wealthProtectionSsoAnimationScreenshotInteractor, "wealthProtectionSsoAnimationScreenshotInteractor");
        this.f268008b = coroutineScope;
        this.f268009c = featureTogglesInteractor;
        this.d = navigator;
        this.e = ssoReauthenticationRequestRepository;
        this.f = ssoJwtDecoder;
        this.f268010g = wealthProtectionSsoAnimationScreenshotInteractor;
    }

    @Override // nri.a
    public final void i3() {
        q.G(new q0(this.e.f256599a, new c(this, null), 1), this.f268008b);
    }
}
