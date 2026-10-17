package ffk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cha.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dha.a f134815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f134816b;

    public a(dha.a creditPlansRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(creditPlansRepository, "creditPlansRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f134815a = creditPlansRepository;
        this.f134816b = featureToggleInteractor;
    }
}
