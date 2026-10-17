package vge;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class v1 {

    @NotNull
    private static final r1 Companion = new r1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xge.a f289038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f289039b;

    public v1(xge.a accountSpacesInteractor, ImmutableMap accountDataSourcesMap) {
        Intrinsics.checkNotNullParameter(accountSpacesInteractor, "accountSpacesInteractor");
        Intrinsics.checkNotNullParameter(accountDataSourcesMap, "accountDataSourcesMap");
        this.f289038a = accountSpacesInteractor;
        this.f289039b = accountDataSourcesMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vge.t1
            if (r0 == 0) goto L13
            r0 = r10
            vge.t1 r0 = (vge.t1) r0
            int r1 = r0.f289009x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289009x = r1
            goto L18
        L13:
            vge.t1 r0 = new vge.t1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289009x
            r3 = 0
            nie.d r4 = nie.d.f215687a
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L30
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r9 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            goto L55
        L2c:
            r10 = move-exception
            goto L5b
        L2e:
            r9 = move-exception
            goto L78
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yhm.o.b(r10)
            kotlin.time.b$a r10 = kotlin.time.b.INSTANCE     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            pkm.e r10 = pkm.e.MILLISECONDS     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r6 = 1000(0x3e8, double:4.94E-321)
            long r6 = kotlin.time.c.h(r6, r10)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            vge.u1 r10 = new vge.u1     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r10.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r0.u = r9     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f289009x = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = skm.h2.e(r6, r10, r0)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            if (r10 != r1) goto L55
            return r1
        L55:
            nie.f r10 = (nie.f) r10     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            if (r10 != 0) goto L5a
            return r4
        L5a:
            return r10
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't resolve last-selected eligibility for the descriptor: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r10)
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            rd0.d.a(r10, r3, r3, r0, r9)
            return r4
        L78:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.v1.a(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main, gim.c):java.lang.Object");
    }

    public final Flow b(ProductAccountDescriptor$Value descriptor) {
        Flow flowM;
        Object obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            obj2 = this.f289039b.get(descriptor.getF89727a());
        } catch (Throwable th10) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't retrieve needed product account flow for the descriptor: " + descriptor, th10);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            flowM = null;
        }
        if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        flowM = ((pfe.b) obj2).m(descriptor.getF89728b());
        if (flowM != null) {
            return flowM;
        }
        return new v0b.b(((xge.g) this.f289038a).b(sfe.a.RELOAD, new qfe.k(descriptor.getF89728b().f89729a)), descriptor, 6);
    }
}
