package w38;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xfe.a;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r38.b f294201a;

    public p(r38.b jointProductInteractor, u38.d mapper) {
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f294201a = jointProductInteractor;
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new o(accountId, this, null), ((r38.l) this.f294201a).f(w4l.h.f294642c));
    }

    @Override // pfe.b
    public final Object g(ProductAccountId productAccountId, Continuation continuation) {
        return a.C1695a.f305241a;
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        return sfe.a0.f262402a;
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new n(accountId, this, null), ((r38.l) this.f294201a).f(w4l.h.f294642c));
    }
}
