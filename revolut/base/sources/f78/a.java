package f78;

import android.hardware.Camera;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import mp.p;
import r10.d;
import te8.e;
import uam.k;
import uam.l;
import wsg.n;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f132562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f132563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f132564c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f132565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f132566h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f132567j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f132568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f132569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f132570n;

    public a(Camera.Parameters cameraParameters) {
        Intrinsics.checkNotNullParameter(cameraParameters, "cameraParameters");
        this.f132562a = cameraParameters;
        this.f132563b = j.b(new k(this, 1));
        this.f132564c = j.b(new k(this, 2));
        this.d = j.b(new k(this, 6));
        this.e = j.b(new k(this, 5));
        this.f = j.b(new k(this, 9));
        this.f132565g = j.b(new k(this, 7));
        this.f132566h = j.b(new k(this, 11));
        this.i = j.b(new k(this, 10));
        this.f132567j = j.b(new k(this, 8));
        this.k = j.b(l.f);
        this.f132568l = j.b(new k(this, 0));
        this.f132569m = j.b(new k(this, 3));
        this.f132570n = j.b(new k(this, 4));
    }

    public a(d juniorAccountGraduationDataSource, h78.a juniorBasePocketFinder, ic8.b juniorCardRequestInteractor, a61.a juniorCurrentBalanceDelegate, b0 juniorPartnershipsActionInteractor, r10.a juniorPocketWithTransactionsDelegate, hj8.a juniorProfileInteractor, m78.d juniorTransactionsInteractor, x79.a onHoldAccountInteractor, f revolutCardsInteractor, ang.f userInteractor, n walletInteractor, e juniorAccountInteractor, zf8.n juniorAccountStatesProvider, p multicurrencyDiscoverAvailableDelegate) {
        Intrinsics.checkNotNullParameter(juniorAccountGraduationDataSource, "juniorAccountGraduationDataSource");
        Intrinsics.checkNotNullParameter(juniorBasePocketFinder, "juniorBasePocketFinder");
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorCurrentBalanceDelegate, "juniorCurrentBalanceDelegate");
        Intrinsics.checkNotNullParameter(juniorPartnershipsActionInteractor, "juniorPartnershipsActionInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketWithTransactionsDelegate, "juniorPocketWithTransactionsDelegate");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorTransactionsInteractor, "juniorTransactionsInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(multicurrencyDiscoverAvailableDelegate, "multicurrencyDiscoverAvailableDelegate");
        this.f132562a = juniorAccountGraduationDataSource;
        this.f132563b = juniorCardRequestInteractor;
        this.f132564c = juniorCurrentBalanceDelegate;
        this.d = juniorPartnershipsActionInteractor;
        this.e = juniorPocketWithTransactionsDelegate;
        this.f = juniorProfileInteractor;
        this.f132565g = juniorTransactionsInteractor;
        this.f132566h = onHoldAccountInteractor;
        this.i = revolutCardsInteractor;
        this.f132567j = userInteractor;
        this.k = walletInteractor;
        this.f132568l = juniorAccountInteractor;
        this.f132569m = juniorAccountStatesProvider;
        this.f132570n = multicurrencyDiscoverAvailableDelegate;
    }
}
