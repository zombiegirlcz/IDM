package jj0;

import cn0.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.i1;
import ulm.j1;
import ulm.y0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f174622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.c f174623b;

    public g(h twoFactorCodeProvider, ij0.c revolutHostChecker) {
        Intrinsics.checkNotNullParameter(twoFactorCodeProvider, "twoFactorCodeProvider");
        Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
        this.f174622a = twoFactorCodeProvider;
        this.f174623b = revolutHostChecker;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        String url2 = j1Var.f281095a.i;
        if (!((ij0.d) this.f174623b).a(url2)) {
            return hVar.b(j1Var);
        }
        i1 i1VarB = j1Var.b();
        h hVar2 = this.f174622a;
        Intrinsics.checkNotNullParameter(url2, "url");
        zm0.d dVar = (zm0.d) hVar2.f25341a.remove(url2);
        if (dVar != null) {
            String str2 = dVar.f323319a;
            zm0.e eVar = dVar.f323320b;
            int i = f.f174621a[eVar.ordinal()];
            if (i == 1) {
                str = "X-Verify-Password";
            } else if (i == 2) {
                str = "X-Verify-Code";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (str != null) {
                if (d0.W(str2)) {
                    throw new IllegalStateException(("OTP can not be empty for type=" + eVar).toString());
                }
                i1VarB.a(str, str2);
            }
        }
        return hVar.b(new j1(i1VarB));
    }
}
