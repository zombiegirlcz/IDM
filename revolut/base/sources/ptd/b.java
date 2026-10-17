package ptd;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xld.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f239654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f239655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f239656c;
    public final al4.n d;

    public b(r0 jointAccountsInteractor, n walletInteractor, hj8.a juniorProfileInteractor, al4.n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.f239654a = jointAccountsInteractor;
        this.f239655b = walletInteractor;
        this.f239656c = juniorProfileInteractor;
        this.d = creditCardInteractor;
    }
}
