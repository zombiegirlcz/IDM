package dfj;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q3 implements bej.m {

    @NotNull
    public static final l3 Companion = new l3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f114080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f114081c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.v1 f114082a;

    static {
        pkm.e eVar = pkm.e.SECONDS;
        f114080b = kotlin.time.c.g(1, eVar);
        f114081c = kotlin.time.c.g(5, eVar);
    }

    public q3(nfj.v1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f114082a = repository;
    }

    public static void b(String str, Exception exc2) {
        if (exc2 != null) {
            Set setW = m72.b.w("EsimStatementsInteractorImpl", str);
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimStatementsInteractorImpl", null, exc2, setW);
        } else {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimStatementsInteractorImpl", str, null, h0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dfj.o3
            if (r0 == 0) goto L13
            r0 = r7
            dfj.o3 r0 = (dfj.o3) r0
            int r1 = r0.f114060w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114060w = r1
            goto L18
        L13:
            dfj.o3 r0 = new dfj.o3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114060w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L43
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            dfj.p3 r7 = new dfj.p3
            r7.<init>(r6, r5, r4)
            r0.f114060w = r3
            long r2 = dfj.q3.f114081c
            java.lang.Object r7 = skm.h2.e(r2, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            bej.k r7 = (bej.k) r7
            if (r7 != 0) goto L53
            bej.j r6 = new bej.j
            r7 = 0
            r6.<init>(r7)
            java.lang.String r7 = "getStatementWithRetries: EsimStatementResult.Failure offline=false, timeout reached"
            b(r7, r4)
            return r6
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.q3.a(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
