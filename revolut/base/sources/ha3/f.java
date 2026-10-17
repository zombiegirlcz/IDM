package ha3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v6l.d f150401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wif.a f150402b;

    public f(v6l.d repo, wif.a userFeaturesChecker) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        this.f150401a = repo;
        this.f150402b = userFeaturesChecker;
    }

    public final efm.r a(b93.b cardCode) {
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        return nim.a.w(b(false), new e(cardCode, 0));
    }

    public final efm.r b(boolean z) {
        efm.r rVarFlatMap = this.f150402b.d(wog.a.CARDS).flatMap(new ha1.s(3, new gae.a(this, z, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }
}
