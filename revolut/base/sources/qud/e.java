package qud;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$InputData;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingControllerContract$InputData f249391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249393c;

    public e(c cVar, StakingControllerContract$InputData stakingControllerContract$InputData) {
        this.f249391a = stakingControllerContract$InputData;
        int i = 10;
        this.f249392b = e4m.b.b(new v1(cVar, this, 1, i));
        this.f249393c = e4m.b.b(new v1(cVar, this, 0, i));
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
