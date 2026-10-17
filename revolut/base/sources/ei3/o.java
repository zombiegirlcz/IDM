package ei3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import ulm.b1;
import ulm.r1;
import ulm.s1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.o f126396a;

    public o(kg.o gson, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(gson, "gson");
                this.f126396a = gson;
                break;
            default:
                Intrinsics.checkNotNullParameter(gson, "gson");
                this.f126396a = gson;
                break;
        }
    }

    public pql.c a(ResponseBody responseBody) {
        if (responseBody == null) {
            return new pql.b(new IllegalStateException(), "Empty body");
        }
        s1 s1Var = ResponseBody.Companion;
        mmm.h hVarClone = responseBody.source().getBuffer().clone();
        b1 b1VarContentType = responseBody.contentType();
        long jContentLength = responseBody.contentLength();
        s1Var.getClass();
        String str = null;
        try {
            vql.d dVar = (vql.d) this.f126396a.c(s1.b(hVarClone, b1VarContentType, jContentLength).string(), vql.d.class);
            if (!(dVar instanceof vql.a)) {
                if (dVar instanceof vql.c) {
                    return new pql.b(new IllegalStateException(), ((vql.c) dVar).getMessage());
                }
                throw new NoWhenBranchMatchedException();
            }
            vql.a aVar = (vql.a) dVar;
            List acceptedAuthenticationContexts = aVar.getAcceptedAuthenticationContexts();
            if (acceptedAuthenticationContexts == null) {
                acceptedAuthenticationContexts = v.l(aVar.getAcceptedLevel());
            }
            String state = aVar.getState();
            String message = aVar.getMessage();
            String value = aVar.getAccountId();
            if (value != null) {
                Intrinsics.checkNotNullParameter(value, "value");
                str = value;
            }
            return new pql.a(state, message, str, acceptedAuthenticationContexts);
        } catch (Throwable th10) {
            return new pql.b(th10, null);
        }
    }

    public n b(Throwable error) {
        r1 r1VarM;
        Intrinsics.checkNotNullParameter(error, "error");
        HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
        if (httpException == null || (r1VarM = i26.l.m(httpException)) == null) {
            return null;
        }
        try {
            return (n) this.f126396a.c(r1VarM.string(), n.class);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
