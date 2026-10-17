package hy2;

import kotlin.jvm.internal.Intrinsics;
import v6l.s;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f156712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f156713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ix2.e f156714c;
    public final qz0.j d;
    public final h e;
    public final gte.a f;

    public j(s cardRepository, n walletInteractor, ix2.e cardDesigns3dTextureUrlImageProvider, qz0.j urlImagesRepository, h cardDesignRenderAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cardDesigns3dTextureUrlImageProvider, "cardDesigns3dTextureUrlImageProvider");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        Intrinsics.checkNotNullParameter(cardDesignRenderAvailabilityInteractor, "cardDesignRenderAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f156712a = cardRepository;
        this.f156713b = walletInteractor;
        this.f156714c = cardDesigns3dTextureUrlImageProvider;
        this.d = urlImagesRepository;
        this.e = cardDesignRenderAvailabilityInteractor;
        this.f = featureToggleInteractor;
    }
}
