package eqb;

import com.revolut.feature.retail.savings.impl.upgrades.data.network.SavingsUpgradeService;
import dp4.a1;
import dp4.f1;
import eh3.s;
import enb.f;
import eq4.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsUpgradeService f128417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f128418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f128419c;
    public final x4l.c d;

    public b(SavingsUpgradeService service, j memoryCache, c savingsStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(savingsStorage, "savingsStorage");
        this.f128417a = service;
        this.f128418b = memoryCache;
        this.f128419c = savingsStorage;
        Continuation continuation = null;
        this.d = new x4l.c(new a1(this, continuation, 20), new g(this, 4), new s(this, 20), new f(this, continuation, 15), new f1(this, continuation, 10));
    }

    public static String a(String str) {
        return j6.a.q("savings_upgrades_key_", str);
    }
}
