package xmi;

import com.revolut.oauth.impl.network.service.OAuthService;
import com.youTransactor.uCube.rpc.Constants;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import ljl.q1;
import ne0.j;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import vc.s;
import xj0.i;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f307270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f307271b;

    public d(e eVar, int i) {
        this.f307270a = eVar;
        this.f307271b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f307270a;
        nj0.a aVar = eVar.f307272a;
        int i = this.f307271b;
        if (i == 0) {
            return new umi.a();
        }
        if (i == 1) {
            Retrofit retrofit = (Retrofit) eVar.f307275g.get();
            g.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCreate = retrofit.create(OAuthService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            OAuthService oAuthService = (OAuthService) objCreate;
            s.k(oAuthService);
            return new vmi.d(oAuthService, (j) eVar.f307276h.get(), eVar.d.a());
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            g.Companion.getClass();
            return new ne0.d(ne0.b.HASH);
        }
        ik0.b retrofitFactory = ((nj0.d) aVar).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((nj0.d) aVar).d();
        i factory = ((nj0.d) aVar).l();
        s.j(factory);
        q1 revolutSsoApi = eVar.f307273b;
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(revolutSsoApi, "revolutSsoApi");
        o gson = ikl.a.a();
        s.k(gson);
        e4m.a sessionTokenRepositoryProvider = ((q0) revolutSsoApi).P;
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(sessionTokenRepositoryProvider, "sessionTokenRepositoryProvider");
        kkl.b authenticationInterceptor = new kkl.b(gson, sessionTokenRepositoryProvider);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(authenticationInterceptor, "authenticationInterceptor");
        OkHttpClient okHttpClient = i.a(factory, null, false, false, u.c(authenticationInterceptor), null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
        tmi.b configuration = eVar.f307274c;
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, a0.d.r(configuration.getAuthHostUrl(), "/"), converterFactory, null, 24);
        s.k(retrofitA);
        return retrofitA;
    }
}
