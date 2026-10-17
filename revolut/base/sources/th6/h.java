package th6;

import com.revolut.feature.external_accounts.impl.repository.network.IndiaUpiService;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndiaUpiService f271276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f271277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f271278c;

    public h(ne0.j memoryCache, IndiaUpiService service, ue0.c indiaUpiStorage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(indiaUpiStorage, "indiaUpiStorage");
        this.f271276a = service;
        this.f271277b = indiaUpiStorage;
        Continuation continuation = null;
        int i = 4;
        this.f271278c = new x4l.c(new pti.d(this, continuation, 28), new bek.c(memoryCache, i), new bek.d(memoryCache, i), new t9h.b(this, continuation, 15), new sne.e(this, continuation, 3));
    }

    public static String a(TopUpMethodsContext topUpMethodsContext) {
        if (topUpMethodsContext != null) {
            String str = topUpMethodsContext.f90550a;
            yte.n nVar = topUpMethodsContext.f90551b;
            strS = j6.a.s("TopUpMethodsContext(currencyCode=", str, ", contextType=", nVar != null ? nVar.name() : null, ")");
        }
        return j6.a.q("UPI_PRESELECTED_METHOD_ID-", strS);
    }
}
