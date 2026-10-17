package ha3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f150413a;

    public k(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f150413a = userInteractor;
    }

    public final ufm.i a() {
        ufm.i iVar = new ufm.i(this.f150413a.f(false), new ha1.s(9, new ha1.k(11)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
