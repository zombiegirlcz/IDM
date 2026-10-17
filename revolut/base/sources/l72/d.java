package l72;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a72.h f192505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a72.a f192506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f192507c;

    public d(a72.h repository, a72.a cardRepository, l93.f cardsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        this.f192505a = repository;
        this.f192506b = cardRepository;
        this.f192507c = cardsInteractor;
    }
}
