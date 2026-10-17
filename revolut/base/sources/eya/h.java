package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardDetailsScreenContract$Input f130631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130633c;
    public final e4m.e d;

    public h(j jVar, RewardDetailsScreenContract$Input rewardDetailsScreenContract$Input) {
        this.f130632b = jVar;
        this.f130631a = rewardDetailsScreenContract$Input;
        int i = 28;
        this.f130633c = e4m.b.b(new ea2.p(jVar, this, 1, i));
        this.d = e4m.b.b(new ea2.p(jVar, this, 0, i));
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
