package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p71.a f121612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w71.b f121613b;

    public i(p71.a externalCardsRepository, w71.b topUpRepository) {
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(topUpRepository, "topUpRepository");
        this.f121612a = externalCardsRepository;
        this.f121613b = topUpRepository;
    }
}
