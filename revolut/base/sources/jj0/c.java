package jj0;

import com.revolut.core.error.data.model.ServerError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.t1;
import xj0.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ulm.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.b f174616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f174617c;
    public final yf.c d;

    public c(sf0.b expiredAccessTokenChecker, e tokenRefreshCoordinator, yf.c tokenEncoder) {
        Intrinsics.checkNotNullParameter(expiredAccessTokenChecker, "expiredAccessTokenChecker");
        Intrinsics.checkNotNullParameter(tokenRefreshCoordinator, "tokenRefreshCoordinator");
        Intrinsics.checkNotNullParameter(tokenEncoder, "tokenEncoder");
        this.f174616b = expiredAccessTokenChecker;
        this.f174617c = tokenRefreshCoordinator;
        this.d = tokenEncoder;
    }

    @Override // ulm.d
    public final j1 a(t1 t1Var, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(response, "response");
        ServerError serverErrorB = this.f174616b.f262251a.b(response);
        j1 j1Var = response.f226087a;
        if (serverErrorB == null || serverErrorB.getF51362a() != 9039) {
            return null;
        }
        hmi.e eVarA = this.f174617c.a(j1Var.a("Authorization"));
        if (!(eVarA instanceof hmi.d)) {
            if (eVarA.equals(hmi.c.f153981a) || (eVarA instanceof hmi.b)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String strM = this.d.m(((hmi.d) eVarA).a());
        i1 i1VarB = j1Var.b();
        i1VarB.b("Authorization", strM);
        String str = j1Var.f281096b;
        if (nim.a.B(str)) {
            i1VarB.c(str, new h(j1Var.d));
        }
        return new j1(i1VarB);
    }
}
