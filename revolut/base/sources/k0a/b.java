package k0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f180006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0a.b f180007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f180008c;

    public b(n8b.a countryInteractor, c emptyStateItemsMapper, j0a.b contactAvatarModelMapper, gte.a featureToggleInteractor, j0a.c contactSubtitleMapper) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(emptyStateItemsMapper, "emptyStateItemsMapper");
        Intrinsics.checkNotNullParameter(contactAvatarModelMapper, "contactAvatarModelMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(contactSubtitleMapper, "contactSubtitleMapper");
        this.f180006a = countryInteractor;
        this.f180007b = contactAvatarModelMapper;
        this.f180008c = featureToggleInteractor;
    }
}
