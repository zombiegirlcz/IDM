package qud;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.staking.api.model.StakingProduct;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f249394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249396c;

    public f(c cVar, StakingProduct stakingProduct) {
        this.f249394a = stakingProduct;
        int i = 11;
        this.f249395b = e4m.b.b(new v1(cVar, this, 1, i));
        this.f249396c = e4m.b.b(new v1(cVar, this, 0, i));
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
