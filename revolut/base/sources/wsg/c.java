package wsg;

import atg.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f299713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4l.k f299714c;

    public /* synthetic */ c(n nVar, w4l.k kVar, int i) {
        this.f299712a = i;
        this.f299713b = nVar;
        this.f299714c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String it8 = (String) obj2;
        switch (this.f299712a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((v) this.f299713b.f299736b).k(it8, this.f299714c);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                v vVar = (v) this.f299713b.f299736b;
                Intrinsics.checkNotNullParameter(it8, "registeredIdentityId");
                w4l.k loadingStrategy = this.f299714c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.w(u1.d(vVar.k(it8, loadingStrategy), vVar.n("PARAM_ALL_WALLETS", loadingStrategy)), new arf.h(18));
        }
    }
}
