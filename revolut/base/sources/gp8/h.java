package gp8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChallengeEditRewardScreenContract$InputData f145306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f145307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f145308c;

    public h(n nVar, i iVar, ChallengeEditRewardScreenContract$InputData challengeEditRewardScreenContract$InputData) {
        this.f145307b = nVar;
        this.f145306a = challengeEditRewardScreenContract$InputData;
        this.f145308c = e4m.b.b(new g2j.k(nVar, this, 23));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f145307b.f145327g.n();
        vc.s.j(languageProvider);
        yp8.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, true, false, 48);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
