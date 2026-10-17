package uqj;

import boh.f;
import com.revolut.data.model.Data;
import go.g;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import uif.d;
import vkm.q;
import w4l.k;
import wqj.j;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements jzi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wqj.a f282195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wpj.a f282196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f282197c;

    public b(wqj.a budgetRepository, wpj.a budgetSuggestionConfigRepository, wsg.b walletsInteractor) {
        Intrinsics.checkNotNullParameter(budgetRepository, "budgetRepository");
        Intrinsics.checkNotNullParameter(budgetSuggestionConfigRepository, "budgetSuggestionConfigRepository");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        this.f282195a = budgetRepository;
        this.f282196b = budgetSuggestionConfigRepository;
        this.f282197c = walletsInteractor;
    }

    public final Flow a(String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return f.e(q.q(nim.a.v(this.f282197c.d(str, loadingStrategy), new upc.b(23))), new d(this, loadingStrategy, 17));
    }

    public final Flow b(String str, LocalDate from, LocalDate to6, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = (j) this.f282195a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return (!from.isBefore(to6) || (to6.isAfter(from.plusMonths(12L)) && from.isBefore(to6.minusMonths(12L)))) ? new g(new Data(null, new IllegalArgumentException("Budget history range must be non-empty and cannot exceed 12 months"), false, 5, null), 2) : jVar.f299479h.b(new wqj.d(str, from, to6), loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (((wqj.j) r4).b(r6, r2, r11, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, java.util.LinkedHashSet r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof uqj.a
            if (r0 == 0) goto L13
            r0 = r12
            uqj.a r0 = (uqj.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            uqj.a r0 = new uqj.a
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f282194y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            goto La5
        L2c:
            r10 = move-exception
            goto Laa
        L2f:
            r10 = move-exception
            goto Lb1
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            int r10 = r0.f282193x
            int r11 = r0.f282192w
            uqj.b r2 = r0.v
            java.util.LinkedHashSet r4 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r8 = r12
            r12 = r11
            r11 = r4
            r4 = r2
            r2 = r8
            goto L81
        L4b:
            yhm.o.b(r12)
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            boolean r12 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            if (r12 == 0) goto L59
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            return r10
        L59:
            wsg.b r12 = r9.f282197c     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            kotlinx.coroutines.flow.Flow r10 = r12.d(r10, r2)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            up5.k r12 = new up5.k     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r2 = 14
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            jhi.b r10 = mo3.a.g(r10, r5, r12, r4)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.u = r11     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.v = r9     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r12 = 0
            r0.f282192w = r12     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f282193x = r12     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.A = r4     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.Object r10 = vkm.q.x(r10, r0)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            if (r10 != r1) goto L7e
            goto La4
        L7e:
            r4 = r9
            r2 = r10
            r10 = r12
        L81:
            kotlin.Pair r2 = (kotlin.Pair) r2     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.Object r2 = r2.f186385a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            fo3.c r2 = (fo3.c) r2     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            wqj.a r4 = r4.f282195a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.String r6 = r2.f136801a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.String r7 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            xi0.b r2 = r2.d     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.u = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.v = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f282192w = r12     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.f282193x = r10     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            r0.A = r3     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            wqj.j r4 = (wqj.j) r4     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.Object r10 = r4.b(r6, r2, r11, r0)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            if (r10 != r1) goto La5
        La4:
            return r1
        La5:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2f
            return r10
        Laa:
            yhm.m$a r11 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
            return r10
        Lb1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uqj.b.c(java.lang.String, java.util.LinkedHashSet, gim.c):java.lang.Object");
    }
}
