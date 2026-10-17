package p5f;

import com.revolut.feature.trading.managed_portfolios.impl.data.network.investor_updates.InvestorUpdatesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import o29.l;
import om4.m1;
import q5f.h;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestorUpdatesService f233118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f233119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f233120c;
    public final x4l.c d;

    public e(InvestorUpdatesService service, h networkMapper, ue0.c storage, ne0.d cache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f233118a = service;
        this.f233119b = storage;
        this.f233120c = cache;
        nt.e eVar = new nt.e(2, this, e.class, "getFromStorage", "getFromStorage(Lcom/revolut/feature/trading/managed_portfolios/impl/data/network/investor_updates/dod/InvestorUpdatesParams;)Ljava/util/List;", 4, 27);
        m1 m1Var = new m1(1, this, e.class, "getFromMemory", "getFromMemory(Lcom/revolut/feature/trading/managed_portfolios/impl/data/network/investor_updates/dod/InvestorUpdatesParams;)Ljava/util/List;", 0, 22);
        Continuation continuation = null;
        this.d = new x4l.c(new l(this, continuation, 15), m1Var, new c(this, 0), eVar, new l1(this, continuation, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(p5f.f r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p5f.d
            if (r0 == 0) goto L13
            r0 = r6
            p5f.d r0 = (p5f.d) r0
            int r1 = r0.f233117w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233117w = r1
            goto L18
        L13:
            p5f.d r0 = new p5f.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233117w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f233121a
            r0.f233117w = r3
            com.revolut.feature.trading.managed_portfolios.impl.data.network.investor_updates.InvestorUpdatesService r6 = r4.f233118a
            r2 = 0
            java.lang.Object r6 = r6.getInvestorUpdates(r5, r2, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r5 = q5f.h.b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5f.e.a(p5f.f, gim.c):java.io.Serializable");
    }

    @Override // phm.a
    public final Object get() {
        return this.d;
    }
}
