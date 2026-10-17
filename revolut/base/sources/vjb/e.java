package vjb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreenContract$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PauseChallengeScreenContract$InputData f289688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f289689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f289690c;

    public e(g gVar, PauseChallengeScreenContract$InputData pauseChallengeScreenContract$InputData) {
        this.f289688a = pauseChallengeScreenContract$InputData;
        int i = 20;
        this.f289689b = e4m.b.b(new r2(gVar, this, 1, i));
        this.f289690c = e4m.b.b(new r2(gVar, this, 0, i));
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
