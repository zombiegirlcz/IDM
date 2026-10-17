package cf7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LotteryEnrollmentControllerContract$InputData f23617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f23618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f23619c;
    public final e4m.e d;
    public final e4m.e e;

    public h(b bVar, ViewController viewController, LotteryEnrollmentControllerContract$InputData lotteryEnrollmentControllerContract$InputData) {
        this.f23618b = bVar;
        this.f23617a = lotteryEnrollmentControllerContract$InputData;
        this.f23619c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new bt7.e(bVar, this, 1, i));
        this.e = e4m.b.b(new bt7.e(bVar, this, 0, i));
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
