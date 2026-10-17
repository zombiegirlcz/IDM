package xj0;

import com.revolut.core.error.data.model.ServerError;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Interceptor {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wj0.a f306445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f306446b;

    public f(wj0.a idempotencyKeyHolder, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f306445a = idempotencyKeyHolder;
        this.f306446b = serverErrorParser;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        ServerError serverErrorB;
        ServerError serverErrorB2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        wj0.b bVar = (wj0.b) j1Var.c(wj0.b.class);
        if (bVar == null) {
            return hVar.b(j1Var);
        }
        String str = bVar.f297953a;
        wj0.a aVar = this.f306445a;
        String strB = aVar.b(str);
        i1 i1VarB = j1Var.b();
        if (strB != null) {
            i1VarB.a("X-Idempotency-Key", strB);
        } else {
            String simpleName = f.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Couldn't find idempotency key for ", str, " tag"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, simpleName, null, illegalStateException, h0Var);
        }
        Response responseB = hVar.b(new j1(i1VarB));
        int i = responseB.d;
        sf0.h hVar2 = this.f306446b;
        if ((i != 401 || (serverErrorB2 = hVar2.b(responseB)) == null || serverErrorB2.getF51362a() != 9401) && i != 409 && ((i != 422 || (serverErrorB = hVar2.b(responseB)) == null || serverErrorB.getF51362a() != 9014) && 400 <= i && i < 500)) {
            aVar.a(str);
        }
        return responseB;
    }
}
