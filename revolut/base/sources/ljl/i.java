package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.choose_challenge.ChooseChallengeContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChooseChallengeContract$InputData f195974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f195975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195976c = e4m.b.b(new kw5.e(this, 29));

    public i(q0 q0Var, c cVar, ChooseChallengeContract$InputData chooseChallengeContract$InputData) {
        this.f195975b = cVar;
        this.f195974a = chooseChallengeContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f195975b.Q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f195975b.P.get());
    }
}
