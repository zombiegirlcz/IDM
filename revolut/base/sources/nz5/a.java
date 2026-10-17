package nz5;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okhttp3.Interceptor;
import okhttp3.Response;
import retrofit2.Invocation;
import ulm.i1;
import ulm.j1;
import ulm.v0;
import ulm.x0;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220951a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f220952b;

    public a(List headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f220952b = headers;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        String strB;
        j1 j1Var;
        Invocation invocation;
        x0 url2;
        Method method;
        switch (this.f220951a) {
            case 0:
                Intrinsics.checkNotNullParameter(chain, "chain");
                ((qz5.b) this.f220952b).getClass();
                synchronized (this) {
                    strB = ((qz5.b) this.f220952b).b();
                    if (strB == null) {
                        strB = (String) ((qz5.b) this.f220952b).a().e();
                    }
                    break;
                }
                h hVar = (h) chain;
                j1 j1Var2 = hVar.e;
                Intrinsics.h(strB);
                return hVar.b(v04.b.a(j1Var2, strB));
            case 1:
                Intrinsics.checkNotNullParameter(chain, "chain");
                h hVar2 = (h) chain;
                i1 i1VarB = hVar2.e.b();
                for (oz5.a aVar : (List) this.f220952b) {
                    i1VarB.a(aVar.name(), aVar.value());
                }
                return hVar2.b(new j1(i1VarB));
            case 2:
                Intrinsics.checkNotNullParameter(chain, "chain");
                h hVar3 = (h) chain;
                j1 j1Var3 = hVar3.e;
                x0 x0Var = j1Var3.f281095a;
                od0.a aVar2 = od0.a.f224253a;
                if (od0.a.e() && ((rj0.a) this.f220952b).c()) {
                    String str = x0Var.d;
                    String str2 = x0Var.d;
                    if (a0.y(str, "failover.revolut.codes", false) ? false : a0.y(str2, "revolut.codes", false)) {
                        v0 v0VarG = x0Var.g();
                        v0VarG.c(a0.D(str2, "revolut.codes", "failover.revolut.codes", false));
                        x0 url3 = v0VarG.b();
                        i1 i1VarB2 = j1Var3.b();
                        Intrinsics.checkNotNullParameter(url3, "url");
                        i1VarB2.f281089a = url3;
                        j1Var3 = new j1(i1VarB2);
                    }
                }
                return hVar3.b(j1Var3);
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                h hVar4 = (h) chain;
                j1 j1Var4 = hVar4.e;
                Intrinsics.checkNotNullParameter(j1Var4, "<this>");
                if (j1Var4.a("X-Force-Global-Host-Routing") != null) {
                    i1 i1VarB3 = j1Var4.b();
                    i1VarB3.d("X-Force-Global-Host-Routing");
                    j1Var = new j1(i1VarB3);
                } else {
                    j1Var = j1Var4;
                }
                x0 url4 = j1Var.f281095a;
                Intrinsics.checkNotNullParameter(j1Var4, "<this>");
                if (Intrinsics.f(j1Var4.a("X-Force-Global-Host-Routing"), "true") || j1Var4.c(w60.d.class) != null || ((invocation = (Invocation) j1Var4.c(Invocation.class)) != null && (method = invocation.method()) != null && method.isAnnotationPresent(w60.c.class))) {
                    return hVar4.b(j1Var);
                }
                w60.b bVar = (w60.b) this.f220952b;
                Intrinsics.checkNotNullParameter(url4, "url");
                String strB2 = bVar.b(url4.d);
                if (strB2.equals(url4.d)) {
                    url2 = url4;
                } else {
                    v0 v0VarG2 = url4.g();
                    v0VarG2.c(strB2);
                    url2 = v0VarG2.b();
                }
                if (url2.equals(url4)) {
                    return hVar4.b(j1Var);
                }
                i1 i1VarB4 = j1Var.b();
                Intrinsics.checkNotNullParameter(url2, "url");
                i1VarB4.f281089a = url2;
                return hVar4.b(new j1(i1VarB4));
        }
    }

    public a(qz5.b authenticationInteractor) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        this.f220952b = authenticationInteractor;
    }

    public a(w60.b urlProvider) {
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        this.f220952b = urlProvider;
    }

    public a(rj0.a featureToggles) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f220952b = featureToggles;
    }
}
