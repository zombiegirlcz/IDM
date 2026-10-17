package p5f;

import com.revolut.feature.trading.managed_portfolios.impl.data.network.investor_updates.InvestorUpdatesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import o29.l;
import om4.m1;
import or4.i;
import q5f.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestorUpdatesService f233112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f233113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f233114c;
    public final x4l.c d;

    public b(InvestorUpdatesService service, h networkMapper, ue0.c storage, ne0.d cache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f233112a = service;
        this.f233113b = storage;
        this.f233114c = cache;
        nt.e eVar = new nt.e(2, this, b.class, "getFromStorage", "getFromStorage(Ljava/lang/String;)Lcom/revolut/feature/trading/managed_portfolios/impl/domain/investor_update/model/InvestorUpdateDetails;", 4, 26);
        m1 m1Var = new m1(1, this, b.class, "getFromMemory", "getFromMemory(Ljava/lang/String;)Lcom/revolut/feature/trading/managed_portfolios/impl/domain/investor_update/model/InvestorUpdateDetails;", 0, 21);
        Continuation continuation = null;
        this.d = new x4l.c(new l(this, continuation, 14), m1Var, new i(this, 29), eVar, new l1(this, continuation, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p5f.a
            if (r0 == 0) goto L13
            r0 = r6
            p5f.a r0 = (p5f.a) r0
            int r1 = r0.f233111w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233111w = r1
            goto L18
        L13:
            p5f.a r0 = new p5f.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233111w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f233111w = r3
            com.revolut.feature.trading.managed_portfolios.impl.data.network.investor_updates.InvestorUpdatesService r6 = r4.f233112a
            java.lang.Object r6 = r6.getInvestorUpdateById(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            q5f.f r6 = (q5f.f) r6
            z5f.h r5 = q5f.h.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5f.b.a(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // phm.a
    public final Object get() {
        return this.d;
    }
}
