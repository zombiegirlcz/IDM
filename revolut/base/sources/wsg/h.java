package wsg;

import atg.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f299725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f299726c;

    public /* synthetic */ h(n nVar, boolean z, int i) {
        this.f299724a = i;
        this.f299725b = nVar;
        this.f299726c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f299724a;
        boolean z = this.f299726c;
        n nVar = this.f299725b;
        switch (i) {
            case 0:
                psg.a walletProfile = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
                String walletId = walletProfile.f239484a;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                return ((v) nVar.f299736b).j(walletId, n.q0(z));
            case 1:
                String registeredIdentityId = (String) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentityId, "it");
                qsg.b bVar = nVar.f299736b;
                w4l.k loadingStrategy = n.q0(z);
                v vVar = (v) bVar;
                Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.w(u1.d(vVar.k(registeredIdentityId, loadingStrategy), vVar.n("PARAM_ALL_WALLETS", loadingStrategy)), new arf.h(20));
            default:
                String registeredIdentityId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentityId2, "it");
                v vVar2 = (v) nVar.f299736b;
                Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                pfm.d dVarQ = efm.b.q(vVar2.f9082j.g(registeredIdentityId2, z), ((atg.h) vVar2.e).f.g(Unit.f186387a, z));
                Intrinsics.checkNotNullExpressionValue(dVarQ, "mergeArrayDelayError(...)");
                return dVarQ;
        }
    }
}
