package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final osg.b f185504c;
    public final ao.h d;
    public final ogm.i e;
    public final hj8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f185505g;

    public h1(CoroutineScope coroutineScope, h0 commonDataSource, osg.b walletInteractor, ao.h juniorCoparentInteractor, ogm.i juniorTransferSettingsInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorTransferSettingsInteractor, "juniorTransferSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f185502a = coroutineScope;
        this.f185503b = commonDataSource;
        this.f185504c = walletInteractor;
        this.d = juniorCoparentInteractor;
        this.e = juniorTransferSettingsInteractor;
        this.f = juniorProfileInteractor;
        this.f185505g = yhm.j.b(new k98.a(this, 17));
    }
}
