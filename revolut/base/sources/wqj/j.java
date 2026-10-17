package wqj;

import com.revolut.retail.feature.impl.budget.network.BudgetService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lzi.n;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import th6.p;
import w2a.q;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements a {

    @NotNull
    private static final f Companion = new f();
    public static final long i = TimeUnit.SECONDS.toMillis(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BudgetService f299475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f299476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f299477c;
    public final rqj.h d;
    public final l80.e e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f299478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f299479h;

    public j(BudgetService service, ne0.d memoryCache, ue0.c storage, rqj.h budgetHistoryDao, l80.e dateProvider, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(budgetHistoryDao, "budgetHistoryDao");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f299475a = service;
        this.f299476b = memoryCache;
        this.f299477c = storage;
        this.d = budgetHistoryDao;
        this.e = dateProvider;
        this.f = ((ze0.c) forceReloadStrategyFactory).b(i);
        Continuation continuation = null;
        final int i2 = 0;
        this.f299478g = new x4l.c(new p(this, continuation, 29), new Function1(this) { // from class: wqj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f299459b;

            {
                this.f299459b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (od0.i) this.f299459b.f299476b.get(params.a());
                    default:
                        d params2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (n) this.f299459b.f299476b.get(params2.d);
                }
            }
        }, new Function2(this) { // from class: wqj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f299461b;

            {
                this.f299461b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        e params = (e) obj2;
                        od0.i budget = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(budget, "budget");
                        this.f299461b.f299476b.f(params.a(), budget);
                        break;
                    default:
                        d params2 = (d) obj2;
                        n history = (n) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(history, "history");
                        this.f299461b.f299476b.f(params2.d, history);
                        break;
                }
                return Unit.f186387a;
            }
        }, new wka.e(this, continuation, 17), new sne.e(this, continuation, 29));
        final int i3 = 1;
        this.f299479h = new x4l.c(new g(this, continuation, 0), new Function1(this) { // from class: wqj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f299459b;

            {
                this.f299459b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (od0.i) this.f299459b.f299476b.get(params.a());
                    default:
                        d params2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (n) this.f299459b.f299476b.get(params2.d);
                }
            }
        }, new Function2(this) { // from class: wqj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f299461b;

            {
                this.f299461b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        e params = (e) obj2;
                        od0.i budget = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(budget, "budget");
                        this.f299461b.f299476b.f(params.a(), budget);
                        break;
                    default:
                        d params2 = (d) obj2;
                        n history = (n) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(history, "history");
                        this.f299461b.f299476b.f(params2.d, history);
                        break;
                }
                return Unit.f186387a;
            }
        }, new wih.c(this, continuation, 11), new q(this, continuation, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof wqj.h
            if (r0 == 0) goto L13
            r0 = r11
            wqj.h r0 = (wqj.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            wqj.h r0 = new wqj.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f299471y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            x4l.c r3 = r9.f299479h
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            wqj.d r10 = r0.f299470x
            java.time.LocalDate r1 = r0.f299469w
            wqj.d r2 = r0.v
            java.time.LocalDate r0 = r0.u
            yhm.o.b(r11)
            goto Laa
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            yhm.o.b(r11)
            l80.e r11 = r9.e
            l80.f r11 = (l80.f) r11
            java.time.LocalDate r11 = r11.e()
            r5 = 1
            java.time.LocalDate r11 = r11.plusDays(r5)
            r5 = 12
            java.time.LocalDate r2 = r11.minusMonths(r5)
            wqj.d r5 = new wqj.d
            kotlin.jvm.internal.Intrinsics.h(r2)
            r5.<init>(r10, r2, r11)
            java.lang.String r6 = r5.e
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            ue0.c r8 = r9.f299477c
            java.lang.Object r6 = j6.a.k(r7, r8, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6c
            java.time.LocalDate r6 = java.time.LocalDate.parse(r6)
            goto L6d
        L6c:
            r6 = 0
        L6d:
            if (r6 == 0) goto L77
            java.lang.Comparable r6 = cim.c.k(r2, r6)
            java.time.LocalDate r6 = (java.time.LocalDate) r6
            if (r6 != 0) goto L78
        L77:
            r6 = r2
        L78:
            boolean r7 = r6.isBefore(r11)
            if (r7 != 0) goto L81
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L81:
            java.lang.String r7 = "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r7)
            java.lang.String r7 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.String r7 = "to"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            wqj.d r7 = new wqj.d
            r7.<init>(r10, r6, r11)
            r0.u = r2
            r0.v = r5
            r0.f299469w = r6
            r0.f299470x = r7
            r0.A = r4
            java.lang.Object r10 = r3.d(r7, r4, r0)
            if (r10 != r1) goto La6
            return r1
        La6:
            r0 = r2
            r2 = r5
            r1 = r6
            r10 = r7
        Laa:
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r1, r0)
            if (r11 != 0) goto Lbf
            ne0.d r11 = r9.f299476b
            java.lang.String r10 = r10.d
            java.lang.Object r10 = r11.get(r10)
            lzi.n r10 = (lzi.n) r10
            if (r10 == 0) goto Lbf
            r3.g(r2, r10)
        Lbf:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wqj.j.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if (a(r3, r1) != r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r14, xi0.b r15, java.util.Set r16, gim.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wqj.j.b(java.lang.String, xi0.b, java.util.Set, gim.c):java.lang.Object");
    }
}
