package rhe;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lu5.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements qfe.a {

    @NotNull
    public static final c Companion = new c();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f254432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mhf.b f254433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f254434c;

    static {
        ProductId[] elements = {ProductId.SAVINGS, ProductId.SUBACCOUNT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public m(ImmutableMap productAccountsTransactionsFilterProviderMap, mhf.b transactionsFilterInteractor, r cryptoTransactionsFiltersProvider) {
        Intrinsics.checkNotNullParameter(productAccountsTransactionsFilterProviderMap, "productAccountsTransactionsFilterProviderMap");
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(cryptoTransactionsFiltersProvider, "cryptoTransactionsFiltersProvider");
        this.f254432a = productAccountsTransactionsFilterProviderMap;
        this.f254433b = transactionsFilterInteractor;
        this.f254434c = cryptoTransactionsFiltersProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(rhe.m r6, java.util.Set r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof rhe.d
            if (r0 == 0) goto L13
            r0 = r8
            rhe.d r0 = (rhe.d) r0
            int r1 = r0.f254412x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254412x = r1
            goto L18
        L13:
            rhe.d r0 = new rhe.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254412x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Set r7 = r0.u
            java.util.Set r7 = (java.util.Set) r7
            yhm.o.b(r8)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            lu5.r r8 = r6.f254434c
            r2 = 3
            akg.n r8 = ft5.b.a(r8, r4, r4, r2)
            rd3.k r2 = new rd3.k
            r5 = 28
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r2 = r7
            java.util.Set r2 = (java.util.Set) r2
            r0.u = r2
            r0.f254412x = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            tof.i7 r8 = (tof.i7) r8
            if (r8 == 0) goto L68
            mhf.b r6 = r6.f254433b
            java.util.Collection r7 = (java.util.Collection) r7
            r0 = 2
            tof.i7 r6 = mhf.b.a(r6, r8, r4, r7, r0)
            if (r6 != 0) goto L67
            return r8
        L67:
            return r6
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rhe.m.a(rhe.m, java.util.Set, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(rhe.m r8, kotlin.jvm.functions.Function1 r9, gim.c r10) throws java.lang.Exception {
        /*
            boolean r0 = r10 instanceof rhe.l
            if (r0 == 0) goto L13
            r0 = r10
            rhe.l r0 = (rhe.l) r0
            int r1 = r0.f254431w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254431w = r1
            goto L18
        L13:
            rhe.l r0 = new rhe.l
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.f254431w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            return r8
        L28:
            r8 = move-exception
            goto L93
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r8)
            r4 = 5000(0x1388, double:2.4703E-320)
            java.time.Duration r8 = java.time.Duration.ofMillis(r4)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "ofMillis(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)     // Catch: java.lang.Exception -> L28
            es.i r1 = new es.i     // Catch: java.lang.Exception -> L28
            r4 = 2
            r1.<init>(r4, r3, r9)     // Catch: java.lang.Exception -> L28
            r0.f254431w = r2     // Catch: java.lang.Exception -> L28
            java.time.Duration r9 = java.time.Duration.ZERO     // Catch: java.lang.Exception -> L28
            int r9 = r8.compareTo(r9)     // Catch: java.lang.Exception -> L28
            if (r9 > 0) goto L53
            r8 = 0
            goto L8b
        L53:
            java.time.temporal.ChronoUnit r9 = java.time.temporal.ChronoUnit.MILLIS     // Catch: java.lang.Exception -> L28
            java.time.Duration r9 = r9.getDuration()     // Catch: java.lang.Exception -> L28
            int r9 = r8.compareTo(r9)     // Catch: java.lang.Exception -> L28
            if (r9 > 0) goto L62
            r8 = 1
            goto L8b
        L62:
            long r4 = r8.getSeconds()     // Catch: java.lang.Exception -> L28
            r6 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L87
            long r4 = r8.getSeconds()     // Catch: java.lang.Exception -> L28
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L81
            int r9 = r8.getNano()     // Catch: java.lang.Exception -> L28
            r2 = 807000000(0x3019d7c0, float:5.5967675E-10)
            if (r9 >= r2) goto L81
            goto L87
        L81:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L8b
        L87:
            long r8 = r8.toMillis()     // Catch: java.lang.Exception -> L28
        L8b:
            java.lang.Object r8 = skm.h2.b(r8, r1, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r10) goto L92
            return r10
        L92:
            return r8
        L93:
            boolean r9 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r9 == 0) goto La1
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            rd0.d.a(r10, r3, r3, r8, r9)
            goto La5
        La1:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto La6
        La5:
            return r3
        La6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rhe.m.b(rhe.m, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
