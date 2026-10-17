package e58;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AccountId.Joint f122785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f122786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f122787r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j mapper, AccountId.Joint accountId, gte.a featureToggleInteractor) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f122785p = accountId;
        this.f122786q = featureToggleInteractor;
        this.f122787r = a.f122776a;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f122787r;
    }
}
