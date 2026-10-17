package mjl;

import akl.e1;
import akl.f0;
import akl.f1;
import akl.i0;
import akl.n1;
import akl.o0;
import android.content.Context;
import au0.x3;
import com.revolut.sso.impl.data.db.SsoDatabase;
import com.revolut.sso.impl.network.services.AuthenticationService;
import com.revolut.sso.impl.network.services.OAuthUserInfoService;
import com.revolut.sso.impl.network.services.UserInfoService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import ljl.g2;
import ljl.i2;
import ljl.r1;
import ljl.t1;
import ljl.v1;
import ljl.w1;
import ljl.x1;
import ljl.y1;
import ljl.z1;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import skm.a0;
import skm.p0;
import skm.z;
import ulm.b1;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f206094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f206095b;

    public l(m mVar, int i) {
        this.f206094a = mVar;
        this.f206095b = i;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f206094a;
        int i = this.f206095b;
        switch (i) {
            case 0:
                Retrofit retrofit = (Retrofit) mVar.F.get();
                t1.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(OAuthUserInfoService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                OAuthUserInfoService oAuthUserInfoService = (OAuthUserInfoService) objCreate;
                s.k(oAuthUserInfoService);
                return new f0(oAuthUserInfoService, (ue0.c) mVar.G.get(), (ne0.j) mVar.A.get());
            case 1:
                ik0.b retrofitFactory = ((nj0.d) mVar.f206096a).m();
                s.j(retrofitFactory);
                Json json = (Json) mVar.u.get();
                OkHttpClient okHttpClient = mVar.c();
                yil.b ssoConfiguration = mVar.f206102l.f248575j;
                List coreCallAdapters = pj0.e.a();
                t1.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Intrinsics.checkNotNullParameter(ssoConfiguration, "ssoConfiguration");
                Intrinsics.checkNotNullParameter(coreCallAdapters, "coreCallAdapters");
                Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, ssoConfiguration.getHostUrl(), p.a.g(b1.Companion, "application/json", json), coreCallAdapters, 8);
                s.k(retrofitA);
                return retrofitA;
            case 2:
                z1 z1Var = mVar.f206097b;
                Json jsonA = af0.b.a();
                s.k(jsonA);
                return jsonA;
            case 3:
                z1 z1Var2 = mVar.f206097b;
                qqk.b bVar = mVar.f206102l;
                kg.o oVarA = ikl.a.a();
                s.k(oVarA);
                CoroutineScope coroutineScope = (CoroutineScope) mVar.v.get();
                AuthenticationService authenticationServiceG = l70.h.g((Retrofit) mVar.f206110w.get());
                o0 o0Var = (o0) mVar.D.get();
                uil.a aVarA = mVar.f206106q.a();
                s.j(aVarA);
                return new n1(oVarA, coroutineScope, authenticationServiceG, o0Var, aVarA, bVar.b(), bVar.a(), (ne0.j) mVar.A.get(), (a0) mVar.E.get());
            case 4:
                r1 r1Var = mVar.k;
                return rd0.e.a(p0.f264003c);
            case 5:
                ik0.b bVarM = ((nj0.d) mVar.f206096a).m();
                s.j(bVarM);
                kg.o oVarA2 = ikl.a.a();
                s.k(oVarA2);
                return x1.a(bVarM, v1.a(oVarA2), mVar.c(), mVar.f206102l.f248575j, pj0.e.a());
            case 6:
                UserInfoService userInfoServiceZ = w1.z((Retrofit) mVar.f206110w.get());
                tjl.b bVar2 = (tjl.b) mVar.f206112y.get();
                tjl.d dVar = (tjl.d) mVar.z.get();
                ne0.j jVar = (ne0.j) mVar.A.get();
                uil.a aVarA2 = mVar.f206106q.a();
                s.j(aVarA2);
                x80.a aVarQ = mVar.d.q();
                s.j(aVarQ);
                dm0.d dVarD = mVar.f.d();
                s.j(dVarD);
                return new e1(userInfoServiceZ, bVar2, dVar, jVar, aVarA2, aVarQ, dVarD, new x3(mVar.e), mVar.f206102l.a(), e4m.b.a(mVar.C));
            case 7:
                return w1.g(mVar.f206103m, (SsoDatabase) mVar.f206111x.get());
            case 8:
                y1 y1Var = mVar.f206103m;
                Context context = mVar.e;
                de0.a aVarA3 = ((cl0.a) mVar.f206104n).a();
                s.j(aVarA3);
                yk0.a aVarB = mVar.o.b();
                s.j(aVarB);
                return w1.u(y1Var, context, aVarA3, aVarB);
            case 9:
                return w1.y(mVar.f206103m, (SsoDatabase) mVar.f206111x.get());
            case 10:
                i2 i2Var = mVar.f206105p;
                return new ne0.d(ne0.b.HASH);
            case 11:
                r10.f fVarK = ((nj0.d) mVar.f206096a).k();
                bk0.e eVarH = ((nj0.d) mVar.f206096a).h();
                qqk.b bVar3 = mVar.f206102l;
                return new akl.y1(fVarK, eVarH, bVar3.f248575j, bVar3.a(), (f1) mVar.B.get());
            case 12:
                r1 r1Var2 = mVar.k;
                return new aod.a(z.f264021a, 4);
            case 13:
                i2 i2Var2 = mVar.f206105p;
                ee0.a aVar = mVar.f206107r;
                je0.d dVarD2 = aVar.d();
                s.j(dVarD2);
                yk0.a aVarB2 = mVar.o.b();
                s.j(aVarB2);
                xe0.f fVarF = aVar.f();
                s.j(fVarF);
                return w1.w(i2Var2, dVarD2, aVarB2, fVarF);
            case 14:
                z1 z1Var3 = mVar.f206097b;
                tql.a aVar2 = mVar.i;
                kg.o oVarA3 = ikl.a.a();
                s.k(oVarA3);
                lkl.b bVar4 = new lkl.b(oVarA3);
                rql.a aVarB3 = aVar2.b();
                s.j(aVarB3);
                xjl.i iVar = (xjl.i) mVar.L.get();
                nkl.b bVar5 = new nkl.b((xjl.h) mVar.N.get());
                rql.a aVarB4 = aVar2.b();
                s.j(aVarB4);
                return new fkl.f(bVar4, aVarB3, new yol.b(iVar, bVar5, aVarB4));
            case 15:
                wjl.b bVar6 = (wjl.b) mVar.I.get();
                xm0.a aVar3 = (xm0.a) mVar.o.F.get();
                s.j(aVar3);
                return new xjl.i(bVar6, new i0(aVar3, (ue0.c) mVar.J.get(), (ne0.j) mVar.K.get()));
            case 16:
                return new wjl.c();
            case 17:
                i2 i2Var3 = mVar.f206105p;
                ee0.a aVar4 = mVar.f206107r;
                kg.o gson = ikl.a.a();
                s.k(gson);
                le0.b factory = aVar4.c();
                s.j(factory);
                Intrinsics.checkNotNullParameter(gson, "gson");
                Intrinsics.checkNotNullParameter(factory, "factory");
                le0.a aVarA4 = factory.a(gson);
                fni.a aVar5 = mVar.f.f175897c;
                xe0.f fVarF2 = aVar4.f();
                s.j(fVarF2);
                return bq.i.z(i2Var3, aVarA4, aVar5, fVarF2);
            case 18:
                i2 i2Var4 = mVar.f206105p;
                return new ne0.d(ne0.b.HASH);
            case 19:
                return new xjl.h((ne0.j) mVar.A.get(), (ue0.c) mVar.M.get(), (CoroutineScope) mVar.v.get());
            case 20:
                i2 i2Var5 = mVar.f206105p;
                ee0.a aVar6 = mVar.f206107r;
                kg.o gson2 = ikl.a.a();
                s.k(gson2);
                le0.b factory2 = aVar6.c();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(gson2, "gson");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                le0.a aVarA5 = factory2.a(gson2);
                yk0.a aVarB5 = mVar.o.b();
                s.j(aVarB5);
                xe0.f fVarF3 = aVar6.f();
                s.j(fVarF3);
                return w1.t(i2Var5, aVarA5, aVarB5, fVarF3);
            case 21:
                Context context2 = mVar.e;
                g2.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new qz0.n(context2, null, null);
            default:
                throw new AssertionError(i);
        }
    }
}
