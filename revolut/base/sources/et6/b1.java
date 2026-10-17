package et6;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCustomersService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.o0 f129196a;

    public b1(au6.o0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f129196a = repository;
    }

    public final ufm.n a(lr6.e params) {
        Intrinsics.checkNotNullParameter(params, "params");
        au6.u0 u0Var = (au6.u0) this.f129196a;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        FreelancerCustomersService freelancerCustomersService = u0Var.f9626a;
        Intrinsics.checkNotNullParameter(params, "<this>");
        String str = params.f199397a;
        String str2 = params.f199398b;
        String str3 = params.f199399c;
        String str4 = params.d;
        Address address = params.e;
        efm.d0<com.revolut.feature.freelancer.impl.network.models.l> d0VarPostCustomer = freelancerCustomersService.postCustomer(new com.revolut.feature.freelancer.impl.network.models.h(null, str, str2, str3, str4, address != null ? oo3.a.d(address) : null));
        atg.n nVar = new atg.n(12, new au0.j0(4));
        d0VarPostCustomer.getClass();
        ufm.i iVar = new ufm.i(d0VarPostCustomer, nVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final efm.r b(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        au6.u0 u0Var = (au6.u0) this.f129196a;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return te0.w.f0(nim.a.w(u0Var.d.f(new au6.t0(id10), z), new ak7.g(id10, 14)));
    }
}
