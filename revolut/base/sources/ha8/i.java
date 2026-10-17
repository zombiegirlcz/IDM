package ha8;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import vkm.q;
import wsg.n;
import yji.l;
import zhm.c0;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements f {
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.k f150466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f150467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kbb.c f150468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o7.d f150469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f150470t;
    public final vii.b u;

    public i(j stateMapper, hj8.a juniorProfileInteractor, ybl.k tradingAccountsInteractor, n walletInteractor, kbb.c juniorConfigInteractor, o7.d jisaDateOfBirthValidator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(jisaDateOfBirthValidator, "jisaDateOfBirthValidator");
        this.o = juniorProfileInteractor;
        this.f150466p = tradingAccountsInteractor;
        this.f150467q = walletInteractor;
        this.f150468r = juniorConfigInteractor;
        this.f150469s = jisaDateOfBirthValidator;
        this.f150470t = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = new vii.b();
    }

    public static final boolean I2(i iVar, e eVar) {
        cfl.b[] elements = {cfl.b.CREATED, cfl.b.TERMINATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return eVar.d == u98.a.ELIGIBLE && eVar.f150462b && kotlin.collections.d.y0(elements).contains(eVar.f150463c);
    }

    public static String J2(com.revolut.feature.junior_profile.api.models.a aVar, KClass kClass) {
        if (aVar instanceof JuniorBankingProfile) {
            return ((JuniorBankingProfile) aVar).f77103j;
        }
        if (!(aVar instanceof com.revolut.feature.junior_profile.api.models.c)) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.junior_profile.api.models.f fVar = (com.revolut.feature.junior_profile.api.models.f) d0.d0(c0.N(((com.revolut.feature.junior_profile.api.models.c) aVar).f77119j, nim.a.o(kClass)));
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new g6f.l(continuation, this, 27)), null, null, new h(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150470t;
    }
}
