package zlm;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.j1;
import ulm.y0;
import ylm.q;
import ylm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f323308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f323309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f323310c;
    public final ylm.j d;
    public final j1 e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f323311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f323312h;
    public int i;

    public h(q call, ArrayList interceptors, int i, ylm.j jVar, j1 request, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f323308a = call;
        this.f323309b = interceptors;
        this.f323310c = i;
        this.d = jVar;
        this.e = request;
        this.f = i2;
        this.f323311g = i3;
        this.f323312h = i5;
    }

    public static h a(h hVar, int i, ylm.j jVar, j1 j1Var, int i2, int i3, int i5) {
        if ((i5 & 1) != 0) {
            i = hVar.f323310c;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            jVar = hVar.d;
        }
        ylm.j jVar2 = jVar;
        if ((i5 & 4) != 0) {
            j1Var = hVar.e;
        }
        j1 request = j1Var;
        int i21 = hVar.f;
        if ((i5 & 16) != 0) {
            i2 = hVar.f323311g;
        }
        int i22 = i2;
        if ((i5 & 32) != 0) {
            i3 = hVar.f323312h;
        }
        Intrinsics.checkNotNullParameter(request, "request");
        return new h(hVar.f323308a, hVar.f323309b, i6, jVar2, request, i21, i22, i3);
    }

    public final Response b(j1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f323309b;
        int size = arrayList.size();
        int i = this.f323310c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        ylm.j jVar = this.d;
        if (jVar != null) {
            if (!((v) jVar.f314772c.b()).f(request.f281095a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        h hVarA = a(this, i2, null, request, 0, 0, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseIntercept = interceptor.intercept(hVarA);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (jVar == null || i2 >= arrayList.size() || hVarA.i == 1) {
            return responseIntercept;
        }
        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
    }
}
