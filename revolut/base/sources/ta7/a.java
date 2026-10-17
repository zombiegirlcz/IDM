package ta7;

import com.revolut.feature.hidden_accounts.impl.network.HiddenAccountsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;
import vfg.p;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f269111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ila.b f269112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rk0.c f269113c;
    public final nj0.a d;
    public final jge.i e;
    public final ika.f f;

    public a(nj0.a aVar, rk0.c cVar, ite.a aVar2, ila.b bVar, ika.f fVar, jge.i iVar) {
        this.f269111a = aVar2;
        this.f269112b = bVar;
        this.f269113c = cVar;
        this.d = aVar;
        this.e = iVar;
        this.f = fVar;
    }

    public final p a() {
        return new p(i(), new xa7.a());
    }

    public final kbb.c b() {
        wa7.m mVarI = i();
        za7.b bVar = new za7.b();
        zja.a aVarA = ((ika.b) this.f).a();
        s.j(aVarA);
        return new kbb.c(mVarI, bVar, aVarA);
    }

    public final wa7.p c() {
        return new wa7.p(i(), 1);
    }

    public final wa7.m d() {
        return i();
    }

    public final wa7.p e() {
        return new wa7.p(i(), 0);
    }

    public final za7.c f() {
        return new za7.c();
    }

    public final su9.c g() {
        return new su9.c(i(), new za7.c());
    }

    public final za7.d h() {
        return new za7.d();
    }

    public final wa7.m i() {
        gte.a aVarB = this.f269111a.b();
        s.j(aVarB);
        jla.h hVarA = this.f269112b.a();
        mk0.a aVarA = this.f269113c.a();
        s.j(aVarA);
        Retrofit retrofit = ((nj0.d) this.d).f();
        o.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(HiddenAccountsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        HiddenAccountsService hiddenAccountsService = (HiddenAccountsService) objCreate;
        s.k(hiddenAccountsService);
        return new wa7.m(aVarB, hVarA, aVarA, new zjh.c(hiddenAccountsService), this.e.a());
    }
}
