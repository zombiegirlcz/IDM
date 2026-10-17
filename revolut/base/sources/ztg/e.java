package ztg;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_cpg.impl.network.CardPaymentsGatewayService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okhttp3.OkHttpClient;
import pd7.q;
import retrofit2.Retrofit;
import uz7.r;
import uz7.v;
import vc.s;
import zhm.h0;
import zu8.u;
import zxb.j0;
import zxb.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f325127c;

    public /* synthetic */ e(Object obj2, int i, int i2) {
        this.f325125a = i2;
        this.f325127c = obj2;
        this.f325126b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        int i = this.f325125a;
        int i2 = this.f325126b;
        Object obj2 = this.f325127c;
        switch (i) {
            case 0:
                f fVar = (f) obj2;
                if (i2 == 0) {
                    return new sug.k((cli.n) fVar.f325129b.get(), fVar.f325128a);
                }
                if (i2 == 1) {
                    return new sug.l();
                }
                throw new AssertionError(i2);
            case 1:
                if (i2 == 0) {
                    u uVar = (u) obj2;
                    return new ew8.e(uVar.f325384a, e4m.b.a(uVar.f325385b));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                fw8.b.Companion.getClass();
                od0.a aVar = od0.a.f224253a;
                if (od0.a.c() == od0.l.MOCK) {
                    return gw8.a.f147281a;
                }
                try {
                    Object objNewInstance = Class.forName("com.revolut.feature.idnow.eid.IdnowEidSdkProviderImpl").getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.revolut.feature.idnow.eid.IdnowEidSdkProvider");
                    return ((q) objNewInstance).provideIdnowEidSdk();
                } catch (Exception e) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unable to load IDnow eID SDK", e);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return null;
                }
            case 2:
                zwh.c cVar = (zwh.c) obj2;
                nj0.a aVar2 = cVar.f325955a;
                Context context = cVar.f325957c;
                switch (i2) {
                    case 0:
                        return new exh.b((ixh.a) cVar.e.get(), (exh.k) cVar.f325961l.get());
                    case 1:
                        return new ixh.b();
                    case 2:
                        return new exh.g(cVar.a(), new exh.j(cVar.a()));
                    case 3:
                        Retrofit retrofit = (Retrofit) cVar.f325959h.get();
                        zwh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(CardPaymentsGatewayService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        CardPaymentsGatewayService cardPaymentsGatewayService = (CardPaymentsGatewayService) objCreate;
                        s.k(cardPaymentsGatewayService);
                        return cardPaymentsGatewayService;
                    case 4:
                        ik0.b retrofitFactory = ((nj0.d) aVar2).m();
                        s.j(retrofitFactory);
                        OkHttpClient okHttpClient = (OkHttpClient) cVar.f325958g.get();
                        xwh.a cpgNetworkConfiguration = cVar.f325956b;
                        zwh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                        Intrinsics.checkNotNullParameter(cpgNetworkConfiguration, "cpgNetworkConfiguration");
                        String hostUrl = cpgNetworkConfiguration.getHostUrl();
                        String strR = a0.y(hostUrl, "/", false) ? hostUrl : null;
                        if (strR == null) {
                            strR = a0.d.r(cpgNetworkConfiguration.getHostUrl(), "/");
                        }
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, strR, null, null, 28);
                        s.k(retrofitA);
                        return retrofitA;
                    case 5:
                        xj0.i okHttpClientFactory = ((nj0.d) aVar2).l();
                        s.j(okHttpClientFactory);
                        gxh.a headersInterceptor = (gxh.a) cVar.f.get();
                        zwh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                        Intrinsics.checkNotNullParameter(headersInterceptor, "headersInterceptor");
                        return xj0.i.a(okHttpClientFactory, null, false, false, null, zhm.u.c(headersInterceptor), null, Constants.TAG_MPOS_MODULE_STATE);
                    case 6:
                        return new gxh.b();
                    case 7:
                        return new ywh.a(context);
                    case 8:
                        return new ywh.b(context);
                    default:
                        throw new AssertionError(i2);
                }
            case 3:
                j0 j0Var = ((m0) obj2).f326222a;
                if (i2 == 0) {
                    eub.a aVarA = j0Var.a();
                    s.j(aVarA);
                    return new ldi.g(aVarA, 2);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                eub.a aVarA2 = j0Var.a();
                s.j(aVarA2);
                return new ldi.g(aVarA2, 3);
            case 4:
                if (i2 == 0) {
                    return new az4.c((p) ((zy4.b) obj2).f326365a.get());
                }
                if (i2 == 1) {
                    return new az4.d();
                }
                throw new AssertionError(i2);
            default:
                zz7.c cVar2 = (zz7.c) obj2;
                switch (i2) {
                    case 0:
                        hri.b bVar = cVar2.f326543a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar2 = cVar2.f326543a;
                        return new iri.j();
                    case 2:
                        return new hy7.k();
                    case 3:
                        return new ln.c();
                    case 4:
                        gVar = new hy7.g((hy7.c) cVar2.i.get());
                        break;
                    case 5:
                        gVar = new hy7.j((ln.a) cVar2.f326548j.get());
                        break;
                    case 6:
                        l80.e eVarH = cVar2.f326544b.h();
                        s.j(eVarH);
                        gVar = new fy7.h(eVarH);
                        break;
                    case 7:
                        wm.e eVar = (wm.e) cVar2.f326551n.get();
                        fx7.a aVarA3 = cVar2.f326545c.a();
                        s.j(aVarA3);
                        l80.e eVarH2 = cVar2.f326544b.h();
                        s.j(eVarH2);
                        gVar = new fy7.f(eVar, aVarA3, new gy7.a(eVarH2), cVar2.a());
                        break;
                    case 8:
                        return new wm.a();
                    case 9:
                        return new cn.e();
                    case 10:
                        return new ym.d();
                    case 11:
                        return new um.c();
                    case 12:
                        g3l.a aVar3 = (g3l.a) cVar2.f326555s.get();
                        fx7.f fVarB = cVar2.f326545c.b();
                        s.j(fVarB);
                        uz7.a aVar4 = (uz7.a) cVar2.v.get();
                        uz7.b bVar3 = (uz7.b) cVar2.f326557w.get();
                        sf0.h hVarB = cVar2.e.b();
                        s.j(hVarB);
                        gVar = new e08.c(aVar3, fVarB, aVar4, bVar3, hVarB, cVar2.a());
                        break;
                    case 13:
                        return new g3l.g();
                    case 14:
                        e4m.e eVar2 = cVar2.f326546g;
                        ex7.a aVar5 = cVar2.f326545c;
                        ifm.b bVar4 = (ifm.b) eVar2.get();
                        fx7.f fVarB2 = aVar5.b();
                        s.j(fVarB2);
                        fx7.a aVarA4 = aVar5.a();
                        s.j(aVarA4);
                        return new uz7.p(bVar4, fVarB2, aVarA4, (uz7.c) cVar2.f326556t.get(), new l08.a(), new v(), (fy7.d) cVar2.u.get());
                    case 15:
                        gVar = new r((fy7.e) cVar2.f326550m.get());
                        break;
                    case 16:
                        fy7.e eVar3 = (fy7.e) cVar2.f326550m.get();
                        fx7.a aVarA5 = cVar2.f326545c.a();
                        s.j(aVarA5);
                        gVar = new fy7.g(eVar3, aVarA5);
                        break;
                    case 17:
                        ln.a aVar6 = (ln.a) cVar2.f326548j.get();
                        nhi.j jVar = (nhi.j) cVar2.d.d.get();
                        s.j(jVar);
                        gVar = new uz7.q(aVar6, jVar);
                        break;
                    case 18:
                        cVar2.getClass();
                        gVar = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        break;
                    case 19:
                        return new mm.d();
                    case 20:
                        ex7.a aVar7 = cVar2.f326545c;
                        ex7.a aVar8 = cVar2.f326545c;
                        fx7.f fVarB3 = aVar7.b();
                        s.j(fVarB3);
                        fx7.g gVarC = aVar8.c();
                        s.j(gVarC);
                        fx7.l lVarD = aVar8.d();
                        s.j(lVarD);
                        return new hz7.b(fVarB3, gVarC, lVarD, (g3l.a) cVar2.f326555s.get(), (ln.a) cVar2.f326548j.get(), cVar2.a());
                    case 21:
                        fx7.g gVarC2 = cVar2.f326545c.c();
                        s.j(gVarC2);
                        fx7.l lVarD2 = cVar2.f326545c.d();
                        s.j(lVarD2);
                        return new du8.b(gVarC2, lVarD2, cVar2.a());
                    case 22:
                        return new dy7.e((wm.e) cVar2.f326551n.get());
                    case 23:
                        return new sm.e();
                    case 24:
                        return new om.c();
                    default:
                        throw new AssertionError(i2);
                }
                return gVar;
        }
    }
}
