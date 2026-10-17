package xp8;

import cli.y;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreenContract$InputData;
import hp3.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends oki.h implements dli.b {
    public final ChallengeEditRewardScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f307911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hp8.b f307912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f307913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f307914s;

    public l(n stateMapper, ChallengeEditRewardScreenContract$InputData inputData, wsg.n walletsInteractor, hp8.b juniorTasksInteractor, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = inputData;
        this.f307911p = walletsInteractor;
        this.f307912q = juniorTasksInteractor;
        this.f307913r = amountFormatter;
        this.f307914s = mra.d.b(this, new e(inputData.f77384c, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ChallengeEditRewardScreenContract$InputData challengeEditRewardScreenContract$InputData = this.o;
        yji.l.a1(this, rd0.e.b(this.f307911p.a0(challengeEditRewardScreenContract$InputData.f77383b, false)), null, null, new xjl.g(this, (Continuation) null, 13), 3);
        String juniorId = challengeEditRewardScreenContract$InputData.f77383b;
        hp8.b bVar = this.f307912q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        lp8.e eVar = (lp8.e) bVar.f154514a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        yji.l.a1(this, rd0.e.b(nim.a.w(eVar.d.f(juniorId, false), new r(21))), null, null, new k(this, null), 3);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g;
        y yVar = this.f307914s;
        if (z) {
            H2(yVar, new xf0.j(this, event, 27));
        } else {
            if (!(event instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new i(((e) ((j2) yVar.f22677a).getValue()).f307903a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f307914s;
    }
}
