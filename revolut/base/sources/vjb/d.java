package vjb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreenContract$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManageChallengeScreenContract$InputData f289685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f289686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f289687c;

    public d(g gVar, ManageChallengeScreenContract$InputData manageChallengeScreenContract$InputData) {
        this.f289685a = manageChallengeScreenContract$InputData;
        int i = 19;
        this.f289686b = e4m.b.b(new r2(gVar, this, 1, i));
        this.f289687c = e4m.b.b(new r2(gVar, this, 0, i));
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
