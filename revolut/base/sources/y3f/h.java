package y3f;

import com.revolut.feature.trading.impl.data.network.TradingTransactionsService;
import dfl.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w3f.h0;
import w3f.k0;
import yhm.m;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingTransactionsService f310705a;

    public h(TradingTransactionsService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f310705a = service;
    }

    public static e4f.b d(k0 k0Var) throws Throwable {
        Object objA;
        if (!k0Var.getPageInfo().getLast() && k0Var.getPageInfo().getStartFrom() == null) {
            throw new IllegalStateException("Trading transactions history response must provide the next anchor");
        }
        List<h0> items = k0Var.getItems();
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : items) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA = u3f.d.i(h0Var);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof yhm.n) {
                objA = null;
            }
            i0 i0Var = (i0) objA;
            if (i0Var != null) {
                arrayList.add(i0Var);
            }
        }
        return new e4f.b(arrayList, k0Var.getPageInfo().getStartFrom(), k0Var.getPageInfo().getStartAfter(), k0Var.getPageInfo().getLast());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r18, long r20, gim.c r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof y3f.e
            if (r2 == 0) goto L18
            r2 = r1
            y3f.e r2 = (y3f.e) r2
            int r3 = r2.f310700x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f310700x = r3
        L16:
            r15 = r2
            goto L1e
        L18:
            y3f.e r2 = new y3f.e
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r15.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r15.f310700x
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            y3f.h r2 = r15.u
            yhm.o.b(r1)
            goto L62
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            java.lang.Long r11 = new java.lang.Long
            r5 = r18
            r11.<init>(r5)
            java.lang.Long r12 = new java.lang.Long
            r5 = r20
            r12.<init>(r5)
            r15.u = r0
            r15.f310700x = r4
            com.revolut.feature.trading.impl.data.network.TradingTransactionsService r3 = r0.f310705a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 100
            r16 = 639(0x27f, float:8.95E-43)
            java.lang.Object r1 = com.revolut.feature.trading.impl.data.network.TradingTransactionsService.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 != r2) goto L61
            return r2
        L61:
            r2 = r0
        L62:
            w3f.k0 r1 = (w3f.k0) r1
            r2.getClass()
            e4f.b r1 = d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3f.h.a(long, long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r8, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof y3f.f
            if (r0 == 0) goto L14
            r0 = r10
            y3f.f r0 = (y3f.f) r0
            int r1 = r0.f310702x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f310702x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            y3f.f r0 = new y3f.f
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f310702x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r8 = r6.u
            yhm.o.b(r10)
            goto L55
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            java.time.Instant r10 = java.time.Instant.ofEpochMilli(r8)
            r3 = 120(0x78, double:5.93E-322)
            java.time.temporal.ChronoUnit r1 = java.time.temporal.ChronoUnit.DAYS
            java.time.Instant r10 = r10.minus(r3, r1)
            long r3 = r10.toEpochMilli()
            r6.u = r8
            r6.f310702x = r2
            r1 = r7
            r2 = r3
            r4 = r8
            java.lang.Object r10 = r1.a(r2, r4, r6)
            if (r10 != r0) goto L54
            return r0
        L54:
            r8 = r4
        L55:
            r0 = r10
            e4f.b r0 = (e4f.b) r0
            boolean r1 = r0.d
            if (r1 != 0) goto L79
            java.lang.Long r0 = r0.f122542b
            if (r0 == 0) goto L71
            long r0 = r0.longValue()
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L69
            goto L79
        L69:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Trading transactions history anchor must move backwards"
            r8.<init>(r9)
            throw r8
        L71:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        L79:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y3f.h.b(long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof y3f.g
            if (r2 == 0) goto L18
            r2 = r1
            y3f.g r2 = (y3f.g) r2
            int r3 = r2.f310704x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f310704x = r3
        L16:
            r15 = r2
            goto L1e
        L18:
            y3f.g r2 = new y3f.g
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r15.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r15.f310704x
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            y3f.h r2 = r15.u
            yhm.o.b(r1)
            goto L55
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            r15.u = r0
            r15.f310704x = r4
            com.revolut.feature.trading.impl.data.network.TradingTransactionsService r3 = r0.f310705a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 5
            r16 = 1023(0x3ff, float:1.434E-42)
            java.lang.Object r1 = com.revolut.feature.trading.impl.data.network.TradingTransactionsService.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 != r2) goto L54
            return r2
        L54:
            r2 = r0
        L55:
            w3f.k0 r1 = (w3f.k0) r1
            r2.getClass()
            e4f.b r1 = d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3f.h.c(gim.c):java.lang.Object");
    }
}
