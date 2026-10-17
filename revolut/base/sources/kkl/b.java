package kkl;

import akl.f1;
import akl.n1;
import ald.m;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.sso.impl.domain.models.SessionToken;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import retrofit2.HttpException;
import skm.e0;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zhm.h0;
import zlm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f185133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f185134b;

    public b(o gson, phm.a sessionTokenRepositoryProvider) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(sessionTokenRepositoryProvider, "sessionTokenRepositoryProvider");
        this.f185133a = gson;
        this.f185134b = sessionTokenRepositoryProvider;
    }

    public static Response c(h hVar, j1 j1Var, String str) {
        String strConcat = "Bearer ".concat(str);
        i1 i1VarB = j1Var.b();
        i1VarB.a("Authorization", strConcat);
        return hVar.b(new j1(i1VarB));
    }

    public final String a(String str, boolean z) {
        try {
            SessionToken sessionToken = (SessionToken) e0.E(g.f186406a, new m(this, z, str, (Continuation) null, 28));
            if (sessionToken != null) {
                return sessionToken.getF106160a();
            }
            return null;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final Response b(h hVar, j1 j1Var, String str, Response response) {
        synchronized (this) {
            try {
                SessionToken sessionTokenC = ((n1) ((f1) this.f185134b.get())).c();
                String f106160a = sessionTokenC != null ? sessionTokenC.getF106160a() : null;
                if (f106160a == null || str.equals(f106160a)) {
                    f106160a = a(null, true);
                }
                if (f106160a != null) {
                    response.close();
                    response = c(hVar, j1Var, f106160a);
                }
            } finally {
            }
        }
        return response;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        String strA;
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        mkl.d dVar = (mkl.d) j1Var.c(mkl.d.class);
        if (dVar instanceof mkl.b) {
            strA = ((mkl.b) dVar).f206501a;
        } else if (dVar instanceof mkl.a) {
            strA = null;
        } else if (dVar instanceof mkl.c) {
            strA = a(((mkl.c) dVar).a(), false);
        } else {
            if (dVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            strA = a(null, false);
        }
        if (strA == null) {
            return hVar.b(j1Var);
        }
        Response responseC = c(hVar, j1Var, strA);
        int i = responseC.d;
        o oVar = this.f185133a;
        if (i == 401) {
            ServerErrorException.Companion companion = ServerErrorException.INSTANCE;
            HttpException httpException = new HttpException(retrofit2.Response.error(responseC.h(Long.MAX_VALUE), responseC));
            companion.getClass();
            if (ServerErrorException.Companion.c(httpException, oVar).f.getF51362a() == Integer.parseInt("9004")) {
                return b(hVar, j1Var, strA, responseC);
            }
        } else if (i == 403) {
            ServerErrorException.Companion companion2 = ServerErrorException.INSTANCE;
            HttpException httpException2 = new HttpException(retrofit2.Response.error(responseC.h(Long.MAX_VALUE), responseC));
            companion2.getClass();
            if (ServerErrorException.Companion.c(httpException2, oVar).f.getF51362a() == Integer.parseInt("9100")) {
                return b(hVar, j1Var, strA, responseC);
            }
        }
        return responseC;
    }
}
