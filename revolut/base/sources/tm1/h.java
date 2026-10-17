package tm1;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements e {
    public final en1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f272154p;

    public h(en1.a onboardingInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = onboardingInteractor;
        this.f272154p = mra.d.b(this, c.f272151a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272154p;
    }
}
