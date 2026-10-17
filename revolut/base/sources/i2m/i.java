package i2m;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import w1m.l;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158063a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f158064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f158065c;

    public i(Context context, w1m.h apiAuthParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiAuthParams, "apiAuthParams");
        this.f158065c = apiAuthParams;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f158064b = applicationContext;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        switch (this.f158063a) {
            case 0:
                Intrinsics.checkNotNullParameter(chain, "chain");
                zlm.h hVar = (zlm.h) chain;
                i1 i1VarB = hVar.e.b();
                i1VarB.d("X-Transaction-Token");
                i1VarB.a("X-Transaction-Token", ((l) this.f158065c).f293897a);
                i1VarB.a("X-Native-App-SDK-OS", "android");
                i1VarB.a("X-Native-App-SDK-Version", "1.7.3");
                String packageName = this.f158064b.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                i1VarB.a("X-Bundle-Id", packageName);
                return hVar.b(new j1(i1VarB));
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                zlm.h hVar2 = (zlm.h) chain;
                i1 i1VarB2 = hVar2.e.b();
                i1VarB2.d("X-Project-Id");
                i1VarB2.a("X-Project-Id", ((w1m.h) this.f158065c).f293894a);
                i1VarB2.a("X-Native-App-SDK-OS", "android");
                i1VarB2.a("X-Native-App-SDK-Version", "1.7.3");
                String packageName2 = this.f158064b.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
                i1VarB2.a("X-Bundle-Id", packageName2);
                return hVar2.b(new j1(i1VarB2));
        }
    }

    public i(Context context, l apiAuthParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiAuthParams, "apiAuthParams");
        this.f158065c = apiAuthParams;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f158064b = applicationContext;
    }
}
