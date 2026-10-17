package h6i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0.a f149712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw9.d f149713b;

    public q0(cw9.d paymentsProductFeatureChecker, jx0.a transferCountryProfilesInteractor) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(transferCountryProfilesInteractor, "transferCountryProfilesInteractor");
        this.f149713b = paymentsProductFeatureChecker;
        this.f149712a = transferCountryProfilesInteractor;
    }

    public Object a(String str, gim.c cVar) {
        if (this.f149713b.a()) {
            return this.f149712a.k(str, cVar);
        }
        return null;
    }

    public Object b(gim.c cVar) {
        if (this.f149713b.a()) {
            return vkm.q.x(mo3.a.g(zi0.c.w(this.f149712a.t()), null, new h43.q(5), 1), cVar);
        }
        return null;
    }

    public Flow c() {
        return !this.f149713b.a() ? new go.g(new Data(zhm.r0.g(), null, false, 6, null), 2) : nim.a.A(nim.a.v(this.f149712a.q(), new qz9.b(1)), new qz9.b(2));
    }

    public q0(jx0.a transferCountryProfilesInteractor, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(transferCountryProfilesInteractor, "transferCountryProfilesInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f149712a = transferCountryProfilesInteractor;
        this.f149713b = paymentsProductFeatureChecker;
    }
}
