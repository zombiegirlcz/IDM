package fkb;

import cli.k;
import cli.n;
import cli.y;
import cli.z;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements z {
    public final PauseChallengeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ugc.a f135743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f135744q;

    public f(PauseChallengeScreenContract$InputData inputData, n stateMapper, ugc.a savingsChallengeInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        this.o = inputData;
        this.f135743p = savingsChallengeInteractor;
        this.f135744q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135744q;
    }
}
