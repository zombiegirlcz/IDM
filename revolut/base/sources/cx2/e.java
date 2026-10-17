package cx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends ori.a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f109886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f109887c;
    public final ha3.d d;
    public final fk3.b e;

    public e(d state, l93.f revolutCardsInteractor, ha3.d cardScaInteractor, fk3.b configurationRepository) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardScaInteractor, "cardScaInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f109886b = state;
        this.f109887c = revolutCardsInteractor;
        this.d = cardScaInteractor;
        this.e = configurationRepository;
    }

    @Override // ori.a, nri.a
    public final void i3() {
    }
}
