package nz5;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Interceptor {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz5.d f220953a;

    public c(qz5.d registeredIdentityIdInteractor) {
        Intrinsics.checkNotNullParameter(registeredIdentityIdInteractor, "registeredIdentityIdInteractor");
        this.f220953a = registeredIdentityIdInteractor;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        j1 j1Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        qz5.d dVar = this.f220953a;
        j jVar = dVar.f250368a;
        String str = (String) jVar.get("REGISTERED_IDENTITY_ID_KEY");
        if (str == null) {
            str = (String) j6.a.k(String.class, dVar.f250369b, "REGISTERED_IDENTITY_ID_KEY");
            if (str != null) {
                jVar.f("REGISTERED_IDENTITY_ID_KEY", str);
            } else {
                str = null;
            }
        }
        if (str != null) {
            i1 i1VarB = ((h) chain).e.b();
            i1VarB.b("X-Business-Registered-Identity", str);
            j1Var = new j1(i1VarB);
        } else {
            j1Var = ((h) chain).e;
        }
        return ((h) chain).b(j1Var);
    }
}
