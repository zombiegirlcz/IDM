package cng;

import asi.d;
import hx7.e;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Interceptor {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hng.b f25419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f25420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f25421c;

    public b(hng.b selectedRegisteredIdentityIdRepository, d userSessionInteractor) {
        Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdRepository, "selectedRegisteredIdentityIdRepository");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        this.f25419a = selectedRegisteredIdentityIdRepository;
        this.f25420b = userSessionInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!this.f25421c) {
            h hVar = (h) chain;
            return hVar.b(hVar.e);
        }
        h hVar2 = (h) chain;
        j1 j1Var = hVar2.e;
        String strA = j1Var.a("X-Registered-Identity");
        if (strA != null && strA.length() != 0) {
            return hVar2.b(j1Var);
        }
        String str = null;
        Object[] objArr = 0;
        if (jh.d.h(this.f25420b.a())) {
            str = (String) e0.E(g.f186406a, new bv4.h(this, objArr == true ? 1 : 0, 27));
            if (str == null) {
                Regex regex = d0m.b.f110450a;
                e.h(new IllegalStateException(j6.a.q("Missing X-Registered-Identity for ", d0m.b.a(hVar2.e.f281095a.i))));
            }
        }
        if (str == null) {
            return hVar2.b(hVar2.e);
        }
        i1 i1VarB = j1Var.b();
        i1VarB.a("X-Registered-Identity", str);
        return hVar2.b(new j1(i1VarB));
    }
}
