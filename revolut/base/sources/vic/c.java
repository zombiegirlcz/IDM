package vic;

import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$State;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.e;
import uxe.l;
import vgg.a0;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements j, e {
    public final RewardRegistrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f289564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bgc.e f289565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf0.h f289566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qki.d f289567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f289568t;

    public c(RewardRegistrationFlowContract$InputData inputData, d rewardRegistrationStatusDialogFactory, bgc.e rewardsInteractor, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardRegistrationStatusDialogFactory, "rewardRegistrationStatusDialogFactory");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f289564p = rewardRegistrationStatusDialogFactory;
        this.f289565q = rewardsInteractor;
        this.f289566r = serverErrorParser;
        this.f289567s = hx7.e.b(this, new RewardRegistrationFlowContract$State(""));
        this.f289568t = d8l.d.a(this, new a0(15));
    }

    @Override // yki.j
    public final void M0() {
        l2(new l(this, null, 23), new yi5.b(26));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f289567s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f289568t;
    }
}
