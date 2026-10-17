package y91;

import bla.c;
import java.util.List;
import java.util.Map;
import jla.h;
import jla.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f311735a;

    public b(h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f311735a = productCatalogueInteractor;
    }

    public final boolean a(String str) {
        return this.f311735a.d(str, null) == c.ENABLED;
    }

    public final x91.a b() {
        String str;
        Map map;
        jla.c cVarC = bla.b.c(this.f311735a, "STATEMENTS");
        if (cVarC != null) {
            Intrinsics.checkNotNullParameter("account_confirmation_flow", "code");
            k kVar = cVarC.f175657b;
            List list = (kVar == null || (map = kVar.d) == null) ? null : (List) map.get("account_confirmation_flow");
            if (list != null && (str = (String) d0.d0(list)) != null) {
                for (x91.a aVar : x91.a.values()) {
                    if (a0.z(aVar.name(), str, true)) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public final boolean c() {
        return a("ACCOUNT.joint_account");
    }

    public final boolean d() {
        return a("ACCOUNT.linked_account");
    }
}
