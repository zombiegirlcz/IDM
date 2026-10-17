package zh6;

import bek.d;
import com.revolut.feature.external_accounts.impl.repository.network.IndiaNetBankingService;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import wtc.b0;
import yte.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndiaNetBankingService f322239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f322240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f322241c;

    public c(j memoryCache, IndiaNetBankingService service, ue0.c indiaNetBankingStorage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(indiaNetBankingStorage, "indiaNetBankingStorage");
        this.f322239a = service;
        this.f322240b = indiaNetBankingStorage;
        Continuation continuation = null;
        int i = 10;
        this.f322241c = new x4l.c(new b0(this, continuation, 16), new bek.c(memoryCache, i), new d(memoryCache, i), new z3f.b(this, continuation, 14), new wa7.j(this, continuation, 25));
    }

    public static String a(TopUpMethodsContext topUpMethodsContext) {
        if (topUpMethodsContext != null) {
            String str = topUpMethodsContext.f90550a;
            n nVar = topUpMethodsContext.f90551b;
            strS = j6.a.s("TopUpMethodsContext(currencyCode=", str, ", contextType=", nVar != null ? nVar.name() : null, ")");
        }
        return j6.a.q("NET_BANKING_PRESELECTED_METHOD_ID-", strS);
    }
}
