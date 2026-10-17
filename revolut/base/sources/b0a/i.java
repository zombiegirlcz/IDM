package b0a;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import wl3.u;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y21.c f11637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f11638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz9.e f11639c;
    public final iz9.c d;

    public i(y21.c optOutRepository, u revolutContactPaymentsSettingsInteractor, iz9.e socialPaymentsInteractor, iz9.c transactionsInteractor) {
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f11637a = optOutRepository;
        this.f11638b = revolutContactPaymentsSettingsInteractor;
        this.f11639c = socialPaymentsInteractor;
        this.d = transactionsInteractor;
    }

    public final r a(zm3.l lVar) {
        return ue0.e.H(m70.a.e(this.f11638b.e(lVar), new axd.e(5), new axd.e(6)), h0.f322473a, new ax9.a(26));
    }
}
