package o24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.g1;
import ft3.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mtj.k;
import nfj.l1;
import nx2.f;
import nya.b0;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f221483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f221484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.c f221485c;
    public final aq3.a d;
    public final x4l.c e;

    public e(CreditPluginsService creditPluginsService, ne0.d memoryCache, ve0.c storage, aq3.a checklistAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(checklistAvailabilityProvider, "checklistAvailabilityProvider");
        this.f221483a = creditPluginsService;
        this.f221484b = memoryCache;
        this.f221485c = storage;
        this.d = checklistAvailabilityProvider;
        Continuation continuation = null;
        int i = 13;
        this.e = new x4l.c(new k(this, continuation, 26), new b0(this, 21), new f(this, i), new nwc.f(this, continuation, i), new l1(this, continuation, 7));
    }

    public static String a(a aVar) {
        String strI;
        String str;
        it3.k kVar = aVar.f221480c;
        j1 j1Var = aVar.f221478a;
        String strQ = kVar != null ? j6.a.q("_", kVar.name()) : null;
        if (strQ == null) {
            strQ = "";
        }
        int i = c.f221481a[aVar.f221479b.ordinal()];
        if (i == 1) {
            strI = g1.i(j1Var);
            str = "discoverItem_v2";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strI = g1.i(j1Var);
            str = "discoverItem_v3_";
        }
        return p.a.p(str, strI, strQ);
    }
}
