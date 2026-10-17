package q9g;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.x0;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Interceptor {

    @NotNull
    private static final C1337a Companion = new C1337a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f243891b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f243892a;

    /* JADX INFO: renamed from: q9g.a$a, reason: collision with other inner class name */
    public static final class C1337a {
        private C1337a() {
        }
    }

    static {
        String[] elements = {"availability", "types", "popular", "discover", "boosted", "filters", "sorting"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f243891b = kotlin.collections.d.y0(elements);
    }

    public static boolean a(x0 x0Var) {
        ArrayList arrayList = x0Var.f;
        return arrayList.size() >= 3 && Intrinsics.f(arrayList.get(0), "travels") && Intrinsics.f(arrayList.get(1), "properties");
    }

    public static boolean b(ArrayList arrayList) {
        if (arrayList.size() == 4 && Intrinsics.f(arrayList.get(3), "rooms")) {
            return !f243891b.contains(arrayList.get(2));
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        String strF;
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        x0 x0Var = j1Var.f281095a;
        if (a(x0Var)) {
            ArrayList arrayList = x0Var.f;
            if (((arrayList.size() == 3 && !f243891b.contains(arrayList.get(2))) || b(arrayList)) && (str = this.f243892a) != null) {
                i1 i1VarB = j1Var.b();
                i1VarB.b("X-Search-Session-Id", str);
                j1Var = new j1(i1VarB);
            }
        }
        Response responseB = hVar.b(j1Var);
        if (a(x0Var)) {
            ArrayList arrayList2 = x0Var.f;
            if (((arrayList2.size() == 3 && Intrinsics.f(arrayList2.get(2), "availability")) || ((arrayList2.size() == 3 && !f243891b.contains(arrayList2.get(2))) || b(arrayList2))) && (strF = responseB.f("X-Search-Session-Id", null)) != null) {
                this.f243892a = strF;
            }
        }
        return responseB;
    }
}
