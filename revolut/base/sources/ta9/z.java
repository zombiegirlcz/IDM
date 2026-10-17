package ta9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingListAwaitingScreenContract$InputData f269289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f269290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f269291c;

    public z(m mVar, o oVar, WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData) {
        this.f269289a = waitingListAwaitingScreenContract$InputData;
        int i = 25;
        this.f269290b = e4m.b.b(new t0b.l(mVar, this, 1, i));
        this.f269291c = e4m.b.b(new t0b.l(mVar, this, 0, i));
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
