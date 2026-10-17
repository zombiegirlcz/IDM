package nj0;

import android.content.Context;
import java.io.File;
import java.util.Optional;
import kg.o;
import kj0.h;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import okhttp3.OkHttpClient;
import qj0.k;
import qj0.m;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import xj0.i;
import xj0.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f216291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f216292b;

    public c(d dVar, int i) {
        this.f216291a = dVar;
        this.f216292b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f216291a;
        int i = this.f216292b;
        switch (i) {
            case 0:
                l70.e eVar = dVar.f216293a;
                return new wj0.a(new i90.b(), (j) dVar.f216304r.get());
            case 1:
                return new ne0.d();
            case 2:
                xj0.c factory = (xj0.c) dVar.u.get();
                qj0.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new xj0.d(factory.f306439a, factory.f306440b, factory.f306441c);
            case 3:
                bk0.e eVarH = dVar.h();
                x60.a aVarA = dVar.f216294b.a();
                s.j(aVarA);
                return new xj0.c(eVarH, aVarA, (ij0.c) dVar.f216306t.get(), ((oad.a) dVar.d).d());
            case 4:
                ij0.a aVar = dVar.f216295c;
                x60.a aVarA2 = dVar.f216294b.a();
                s.j(aVarA2);
                return qgh.c.x(aVar, aVarA2);
            case 5:
                return new l();
            case 6:
                Context context = dVar.f216298j;
                qj0.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                File file = new File(context.getCacheDir(), "okhttp");
                xj0.j jVar = new xj0.j();
                yk0.a aVarB = dVar.k.b();
                s.j(aVarB);
                return new yj0.j(file, jVar, aVarB);
            case 7:
                OkHttpClient okHttpClient = (OkHttpClient) dVar.A.get();
                ij0.a networkConfiguration = dVar.f216295c;
                k.Companion.getClass();
                Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
                String baseUrl = networkConfiguration.getBaseUrl();
                s.k(baseUrl);
                o gson = fe0.c.a();
                Intrinsics.checkNotNullParameter(gson, "gson");
                GsonConverterFactory factory2 = GsonConverterFactory.create(gson);
                Intrinsics.checkNotNullExpressionValue(factory2, "create(...)");
                s.k(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                kj0.d circuitBreakerStateTransitionTracker = (kj0.d) dVar.B.get();
                Intrinsics.checkNotNullParameter(circuitBreakerStateTransitionTracker, "circuitBreakerStateTransitionTracker");
                kj0.a aVar2 = new kj0.a(new kj0.g(0), circuitBreakerStateTransitionTracker);
                h hVar = (h) dVar.C.get();
                ih0.b bVarF = dVar.f216296g.f();
                s.j(bVarF);
                return new jk0.c(okHttpClient, baseUrl, factory2, aVar2, hVar, bVarF, ((pj0.a) dVar.f216303q).a());
            case 8:
                i okHttpClientFactory = (i) dVar.z.get();
                qj0.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                return i.a(okHttpClientFactory, null, false, false, null, null, null, 255);
            case 9:
                yj0.g gVarC = dVar.c();
                jm0.a aVar3 = dVar.e;
                rj0.a aVar4 = dVar.i;
                ij0.a aVar5 = dVar.f216295c;
                gmi.a aVar6 = dVar.d;
                ulm.d dVarB = ((oad.a) aVar6).b();
                s.j(dVarB);
                yj0.h hVarG = dVar.g();
                b80.c cVarP = dVar.f216293a.p();
                s.j(cVarP);
                xj0.a aVar7 = new xj0.a(cVarP);
                Context context2 = dVar.f216298j;
                qj0.d.Companion.getClass();
                lj0.b bVar = new lj0.b(new mzl.a(), aVar5, (fk0.a) dVar.f216309y.get(), new x70.a());
                nz5.a aVar8 = new nz5.a(aVar4);
                xj0.d dVar2 = (xj0.d) dVar.v.get();
                bk0.b bVar2 = new bk0.b();
                wj0.a aVar9 = (wj0.a) dVar.f216305s.get();
                sf0.h hVarB = dVar.f216301n.b();
                s.j(hVarB);
                xj0.f fVar = new xj0.f(aVar9, hVarB);
                qm0.b bVarE = aVar3.e();
                yh0.a aVarC = dVar.f216296g.c();
                ak0.c cVar = new ak0.c(aVar5);
                yj0.j jVar2 = (yj0.j) dVar.f216308x.get();
                gk0.a aVar10 = new gk0.a();
                xj0.k kVar = (xj0.k) dVar.f216307w.get();
                sj0.b bVarN = dVar.n();
                ek0.a aVar11 = new ek0.a();
                fk0.a aVar12 = (fk0.a) dVar.f216309y.get();
                nz5.a aVarC2 = dVar.f216294b.c();
                qm0.i iVar = new qm0.i(new yf.c(aVar3.f175898g));
                qql.b bVarA = dVar.o.a();
                jj0.g gVarE = ((oad.a) aVar6).e();
                s.j(gVarE);
                ak0.a aVar13 = new ak0.a(aVar5);
                Optional optionalC = ((oad.a) aVar6).c();
                s.j(optionalC);
                Optional optionalA = ((oad.a) aVar6).a();
                s.j(optionalA);
                return new dk0.c(gVarC, dVarB, hVarG, aVar5, aVar7, context2, bVar, aVar8, dVar2, bVar2, fVar, bVarE, aVarC, cVar, aVar4, jVar2, aVar10, kVar, bVarN, aVar11, aVar12, aVarC2, iVar, bVarA, gVarE, aVar13, optionalC, optionalA);
            case 10:
                return new fk0.a(dVar.f216298j);
            case 11:
                return new kj0.d();
            case 12:
                return m.a((kj0.d) dVar.B.get());
            case 13:
                return qgh.c.g((i) dVar.z.get());
            default:
                throw new AssertionError(i);
        }
    }
}
