package eya;

import com.revolut.feature.referrals.shared.ui.impl.network.services.ReferralsTroubleshooterService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f130634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f130635b;

    public i(j jVar, int i) {
        this.f130634a = jVar;
        this.f130635b = i;
    }

    @Override // phm.a
    public final Object get() {
        j jVar = this.f130634a;
        ee0.a aVar = jVar.f130636a;
        nj0.a aVar2 = jVar.f130642l;
        int i = this.f130635b;
        if (i == 0) {
            return new ne0.d();
        }
        if (i == 1) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            yk0.a databaseSessionProvider = jVar.f130637b.b();
            s.j(databaseSessionProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            n.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.f(storageFactory, databaseSessionProvider, "REFERRALS_TROUBLESHOOTER_STORAGE", mapper, 0, null, 56);
        }
        if (i == 2) {
            l80.e eVarH = jVar.f.h();
            s.j(eVarH);
            return new cya.j(eVarH);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        ek.a converterFactory = ((nj0.d) aVar2).d();
        p9l.a referralsNetworkConfiguration = jVar.f130643m.f252760a;
        ik0.b retrofitFactory = ((nj0.d) aVar2).m();
        s.j(retrofitFactory);
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(referralsNetworkConfiguration, "referralsNetworkConfiguration");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, referralsNetworkConfiguration.getHostUrl(), converterFactory, null, 25).create(ReferralsTroubleshooterService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ReferralsTroubleshooterService referralsTroubleshooterService = (ReferralsTroubleshooterService) objCreate;
        s.k(referralsTroubleshooterService);
        return referralsTroubleshooterService;
    }
}
