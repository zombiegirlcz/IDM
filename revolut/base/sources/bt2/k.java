package bt2;

import be7.s;
import bt2.g;
import cli.y;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.data.model.Data;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import skm.a2;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements h {
    public final vu.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vu.g f18268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f18269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f18270r;

    public k(vu.d repository, vu.g resourceProvider, cli.n stateMapper, ReferralAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = repository;
        this.f18268p = resourceProvider;
        RewardTargetAccount rewardTargetAccount = inputData.f64355a;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.f18269q = mra.d.b(this, new e(rewardTargetAccount, data, data2, data3, "", false, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        rs2.n nVar = (rs2.n) this.o;
        x4l.c cVar = nVar.f256958h;
        Unit unit = Unit.f186387a;
        Continuation continuation = null;
        yji.l.b1(this, q.Q(cVar.c(unit, true), new r3k.c(continuation, nVar, 12)), null, new j(this, null, 0), 3);
        yji.l.b1(this, q.Q(nVar.i.c(unit, true), new r3k.c(continuation, nVar, 12)), null, new j(this, null, 1), 3);
        yji.l.b1(this, q.Q(nVar.f256959j.b(unit, w4l.i.f294643c), new r3k.c(continuation, nVar, 12)), null, new j(this, null, 2), 3);
    }

    public final void J2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            I2();
            return;
        }
        if (obj2 instanceof RewardTargetAccount) {
            n2(new s(this, (RewardTargetAccount) obj2, null, 28), new whi.b(6));
        } else if (Intrinsics.f(listId, "SIGN_UP_PERSONAL_ID")) {
            C2(g.b.f18265a);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f18269q;
    }
}
