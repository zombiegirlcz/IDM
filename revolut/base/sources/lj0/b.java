package lj0;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import ue8.c;
import ulm.h1;
import ulm.i1;
import ulm.j1;
import ulm.r1;
import ulm.s1;
import ulm.u0;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f195587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk0.a f195588b;

    public b(mzl.a classResolver, ij0.a networkConfiguration, fk0.a proxyRepository, x70.a systemClock) {
        Intrinsics.checkNotNullParameter(classResolver, "classResolver");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(proxyRepository, "proxyRepository");
        Intrinsics.checkNotNullParameter(systemClock, "systemClock");
        this.f195587a = networkConfiguration;
        this.f195588b = proxyRepository;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 request = hVar.e;
        u0 u0Var = request.f281097c;
        u0Var.getClass();
        a0.A(t0.f186434a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = u0Var.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(c.l(u0Var, i));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        boolean zContains = setUnmodifiableSet.contains("X-No-Debug-Delay");
        if (zContains) {
            i1 i1VarB = request.b();
            i1VarB.d("X-No-Debug-Delay");
            request = new j1(i1VarB);
        }
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            Object value = this.f195588b.f135703a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            if (!((SharedPreferences) value).getBoolean("PROXY_SETTINGS_ENABLED", false) && !od0.a.i()) {
                ij0.a aVar2 = this.f195587a;
                if (!zContains) {
                    SystemClock.sleep(aVar2.requestDelayMs());
                }
                if (aVar2.failingBackendEnabled()) {
                    Response.a aVar3 = new Response.a();
                    ResponseBody.Companion.getClass();
                    r1 body = s1.a("none", null);
                    Intrinsics.checkNotNullParameter(body, "body");
                    aVar3.f226102g = body;
                    aVar3.f226101c = 500;
                    Intrinsics.checkNotNullParameter("", "message");
                    aVar3.d = "";
                    aVar3.d(h1.HTTP_2);
                    Intrinsics.checkNotNullParameter(request, "request");
                    aVar3.f226099a = request;
                    return aVar3.a();
                }
            }
        }
        return hVar.b(request);
    }
}
