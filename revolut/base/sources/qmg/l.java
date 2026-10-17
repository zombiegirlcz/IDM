package qmg;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistContract$InputData;
import jid.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.r0;
import vkm.q;
import vkm.z1;
import wli.x;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements b {
    public final emg.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final emg.a f247831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kge.d f247832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f247833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f247834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final UserChecklistContract$InputData f247835t;
    public final z1 u;
    public final y v;

    public l(o mapper, emg.a adoptionJourneyInteractor, emg.a userChecklistInteractor, kge.d adoptionJourneySlotManagerDelegate, z fincrimeChecklistSlotManagerDelegate, x deeplinkHandler, UserChecklistContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(adoptionJourneyInteractor, "adoptionJourneyInteractor");
        Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
        Intrinsics.checkNotNullParameter(adoptionJourneySlotManagerDelegate, "adoptionJourneySlotManagerDelegate");
        Intrinsics.checkNotNullParameter(fincrimeChecklistSlotManagerDelegate, "fincrimeChecklistSlotManagerDelegate");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = adoptionJourneyInteractor;
        this.f247831p = userChecklistInteractor;
        this.f247832q = adoptionJourneySlotManagerDelegate;
        this.f247833r = fincrimeChecklistSlotManagerDelegate;
        this.f247834s = deeplinkHandler;
        this.f247835t = inputData;
        this.u = q.b(0, 7, null);
        this.v = mra.d.b(this, new a(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u, new r0(continuation, this, this.f247835t.f94614c ? w4l.h.f294642c : w4l.i.f294643c, 13)), null, null, new qc3.c(this, continuation, 27), 3);
        l2(new qc8.b(this, continuation, 11), new yi5.b(26));
    }

    public final emg.a I2() {
        UserChecklistContentType userChecklistContentType = this.f247835t.f94613b;
        if (Intrinsics.f(userChecklistContentType, UserChecklistContentType.AdoptionJourney.f94595a)) {
            return this.o;
        }
        if (Intrinsics.f(userChecklistContentType, UserChecklistContentType.FincrimeChecklist.f94596a)) {
            return this.f247831p;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void P1() {
        I2().h(this.f247835t.f94613b);
        I2().b(cmg.a.NONE);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2().j(this.f247835t.f94613b);
        n2(new k(this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
