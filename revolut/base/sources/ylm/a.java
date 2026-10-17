package ylm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.k0;
import mmm.l0;
import mmm.v0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ulm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f314741a = new a();

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) throws IOException {
        zlm.f jVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h chain2 = (zlm.h) chain;
        q qVar = chain2.f323308a;
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (qVar) {
            if (!qVar.f314789q) {
                throw new IllegalStateException("released");
            }
            if (qVar.f314787n || qVar.f314786m || qVar.f314788p || qVar.o) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f186387a;
        }
        k kVar = qVar.i;
        Intrinsics.h(kVar);
        s sVarA = kVar.a();
        OkHttpClient client = qVar.f314779a;
        sVarA.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        v60.g gVar = sVarA.f314796h;
        bmm.u uVar = sVarA.f314797j;
        if (uVar != null) {
            jVar = new bmm.w(client, sVarA, chain2, uVar);
        } else {
            sVarA.e.setSoTimeout(chain2.f323311g);
            v0 v0VarTimeout = ((l0) gVar.h()).f207282a.timeout();
            long j2 = chain2.f323311g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v0VarTimeout.g(j2, timeUnit);
            ((k0) gVar.f()).f207279a.timeout().g(chain2.f323312h, timeUnit);
            jVar = new amm.j(client, sVarA, gVar);
        }
        j jVar2 = new j(qVar, qVar.e, kVar, jVar);
        qVar.f314785l = jVar2;
        qVar.f314791s = jVar2;
        synchronized (qVar) {
            qVar.f314786m = true;
            qVar.f314787n = true;
        }
        if (qVar.f314790r) {
            throw new IOException("Canceled");
        }
        return zlm.h.a(chain2, 0, jVar2, null, 0, 0, 61).b(chain2.e);
    }
}
