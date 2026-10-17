package mz5;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import pz5.c;
import qz5.b;
import ulm.d;
import ulm.j1;
import ulm.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f210715b;

    public a(b authenticationInteractor, d coreNetworkAuthenticator) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkAuthenticator, "coreNetworkAuthenticator");
        this.f210715b = authenticationInteractor;
    }

    @Override // ulm.d
    public final j1 a(t1 t1Var, Response response) {
        j1 j1VarA;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f210715b.getClass();
        synchronized (this) {
            try {
                j1 j1Var = response.f226087a;
                String strB = this.f210715b.b();
                if (strB != null) {
                    String strA = j1Var.a("Authorization");
                    c.Companion.getClass();
                    if (Intrinsics.f(strA, pz5.b.a(strB))) {
                        String str = (String) this.f210715b.a().e();
                        Intrinsics.h(str);
                        j1VarA = v04.b.a(j1Var, str);
                    } else {
                        String strA2 = j1Var.a("Authorization");
                        j1VarA = (strA2 == null || strA2.equals(pz5.b.a(strB))) ? null : v04.b.a(j1Var, strB);
                    }
                } else {
                    String str2 = (String) this.f210715b.a().e();
                    Intrinsics.h(str2);
                    j1VarA = v04.b.a(j1Var, str2);
                }
            } finally {
            }
        }
        return j1VarA;
    }
}
