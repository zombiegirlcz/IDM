package e2m;

import android.content.Context;
import com.trustdockekyc.core.backend.internal.infrastructure.api.p;
import com.trustdockekyc.core.backend.internal.infrastructure.api.r;
import i2m.i;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import m2m.m;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import vlm.j;
import w1m.h;
import w1m.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f122150h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i) {
        super(0);
        this.f = i;
        this.f122150h = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException {
        switch (this.f) {
            case 0:
                return (m) this.f122150h.f122160m.getValue();
            case 1:
                return (m) this.f122150h.f122160m.getValue();
            case 2:
                return (m) this.f122150h.f122160m.getValue();
            case 3:
                Context context = this.f122150h.d;
                Intrinsics.checkNotNullExpressionValue(context, "access$getAppContext$p(...)");
                return new m2m.b(context);
            case 4:
                d dVar = this.f122150h;
                l apiAuthParams = dVar.f122154b;
                if (apiAuthParams == null) {
                    throw new IllegalStateException("Transaction API is not prepared");
                }
                Context context2 = dVar.d;
                Intrinsics.checkNotNullExpressionValue(context2, "access$getAppContext$p(...)");
                String str = dVar.f122155c;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(apiAuthParams, "apiAuthParams");
                String strA = i2m.c.a(str);
                Retrofit.Builder builder = new Retrofit.Builder();
                OkHttpClient.a aVar = new OkHttpClient.a();
                aVar.f = false;
                TimeUnit unit = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(unit, "unit");
                aVar.f226085x = j.d("timeout", unit, 30L);
                aVar.h(30L, unit);
                aVar.f(30L, unit);
                aVar.d(30L, unit);
                aVar.a(new al.b(1));
                aVar.a(new al.b(2));
                aVar.b(new al.b(3));
                aVar.a(new i(context2, apiAuthParams));
                Retrofit.Builder builderBaseUrl = builder.client(new OkHttpClient(aVar)).baseUrl(strA);
                Intrinsics.h(builderBaseUrl);
                i2m.c.b(builderBaseUrl);
                Object objCreate = builderBaseUrl.build().create(r.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (r) objCreate;
            case 5:
                d dVar2 = this.f122150h;
                h apiAuthParams2 = dVar2.f122153a;
                Context context3 = dVar2.d;
                Intrinsics.checkNotNullExpressionValue(context3, "access$getAppContext$p(...)");
                String str2 = dVar2.f122155c;
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(apiAuthParams2, "apiAuthParams");
                String strA2 = i2m.c.a(str2);
                Retrofit.Builder builder2 = new Retrofit.Builder();
                OkHttpClient.a aVar2 = new OkHttpClient.a();
                aVar2.f = false;
                TimeUnit unit2 = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(unit2, "unit");
                aVar2.f226085x = j.d("timeout", unit2, 30L);
                aVar2.h(30L, unit2);
                aVar2.f(30L, unit2);
                aVar2.d(30L, unit2);
                aVar2.a(new al.b(1));
                aVar2.a(new al.b(2));
                aVar2.b(new al.b(3));
                aVar2.a(new i(context3, apiAuthParams2));
                Retrofit.Builder builderBaseUrl2 = builder2.client(new OkHttpClient(aVar2)).baseUrl(strA2);
                Intrinsics.h(builderBaseUrl2);
                i2m.c.b(builderBaseUrl2);
                Object objCreate2 = builderBaseUrl2.build().create(p.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                return (p) objCreate2;
            case 6:
                return (m2m.d) this.f122150h.k.getValue();
            default:
                return (m) this.f122150h.f122160m.getValue();
        }
    }
}
