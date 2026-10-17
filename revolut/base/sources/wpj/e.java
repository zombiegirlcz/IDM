package wpj;

import com.revolut.retail.feature.impl.analytics_cycle.budget_suggestion.network.BudgetSuggestionConfigService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lzi.q;
import lzi.r;
import lzi.s;
import lzi.t;
import org.jetbrains.annotations.NotNull;
import wa7.j;
import wde.f;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements a {

    @NotNull
    private static final c Companion = new c();
    public static final q e = new q(v.k(new t(lzi.v.VERY_LOW, -25), new r(lzi.v.AMBITIOUS, -25, -5), new r(lzi.v.SUGGESTED, -5, 5), new r(lzi.v.COMFORTABLE, 5, 25), new s(lzi.v.TOO_HIGH, 25)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BudgetSuggestionConfigService f299347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f299348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f299349c;
    public final x4l.c d;

    public e(BudgetSuggestionConfigService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f299347a = service;
        this.f299348b = memoryCache;
        this.f299349c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new pti.s(this, continuation, 29), new b(this, 0), new f(this, 24), new wkg.e(this, continuation, 12), new j(this, continuation, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(wpj.e r6, gim.c r7) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wpj.e.a(wpj.e, gim.c):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        this.f299348b.remove("budget_suggestion_config");
        this.f299349c.clear();
    }
}
