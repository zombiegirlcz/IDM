package w9j;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f295745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f295746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc5.a f295747c;
    public final gte.a d;
    public final ow5.b e;

    public e(l61.a userCompanyInteractor, f userInteractor, hc5.a cryptoAccountInteractor, gte.a featureToggleInteractor, ow5.b cryptoIsraelExpansionChecker) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoIsraelExpansionChecker, "cryptoIsraelExpansionChecker");
        this.f295745a = userCompanyInteractor;
        this.f295746b = userInteractor;
        this.f295747c = cryptoAccountInteractor;
        this.d = featureToggleInteractor;
        this.e = cryptoIsraelExpansionChecker;
    }
}
