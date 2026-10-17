package gp8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChallengesOverviewContract$InputData f145315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f145316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f145317c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f145318g;

    public k(n nVar, ChallengesOverviewContract$InputData challengesOverviewContract$InputData) {
        this.f145316b = nVar;
        this.f145315a = challengesOverviewContract$InputData;
        int i = 16;
        this.d = e4m.b.b(new e0(nVar, this, 0, i));
        this.e = e4m.b.b(new e0(nVar, this, 3, i));
        this.f = e4m.b.b(new e0(nVar, this, 2, i));
        this.f145318g = e4m.b.b(new e0(nVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
