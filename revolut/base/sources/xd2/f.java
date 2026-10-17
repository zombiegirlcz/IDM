package xd2;

import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends yji.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vw1.b f304235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wj0.a f304236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ang.f f304237n;

    public f(vw1.b aliasRepository, wj0.a idempotencyKeyHolder, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f304235l = aliasRepository;
        this.f304236m = idempotencyKeyHolder;
        this.f304237n = userInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(xd2.f r8, zz1.f r9, gim.c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof xd2.b
            if (r0 == 0) goto L16
            r0 = r10
            xd2.b r0 = (xd2.b) r0
            int r1 = r0.f304229y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f304229y = r1
            goto L1b
        L16:
            xd2.b r0 = new xd2.b
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f304227w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304229y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            int r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L60
        L41:
            yhm.o.b(r10)
            java.lang.String r10 = r9.f326483a
            r2 = 5
        L47:
            zz1.e r5 = r9.f326484b
            zz1.e r6 = zz1.e.COMPLETED
            if (r5 == r6) goto L7a
            if (r2 <= 0) goto L7a
            r0.u = r10
            r0.v = r2
            r0.f304229y = r4
            r5 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = skm.k0.b(r5, r0)
            if (r9 != r1) goto L5e
            goto L70
        L5e:
            r9 = r2
            r2 = r10
        L60:
            vw1.b r10 = r8.f304235l
            r0.u = r2
            r0.v = r9
            r0.f304229y = r3
            uy1.j r10 = (uy1.j) r10
            java.lang.Object r10 = r10.h(r2, r0)
            if (r10 != r1) goto L71
        L70:
            return r1
        L71:
            zz1.f r10 = (zz1.f) r10
            int r9 = r9 + (-1)
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
            goto L47
        L7a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.f.Z2(xd2.f, zz1.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(xd2.f r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof xd2.c
            if (r0 == 0) goto L13
            r0 = r5
            xd2.c r0 = (xd2.c) r0
            int r1 = r0.f304230w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304230w = r1
            goto L18
        L13:
            xd2.c r0 = new xd2.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304230w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r4 = r4.f304237n
            r5 = 0
            efm.d0 r4 = r4.f(r5)
            r0.f304230w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            java.lang.String r4 = r5.i
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.f.b3(xd2.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final fim.a c3(xd2.f r5, java.lang.String r6, com.revolut.feature.apm.core.models.alias.AliasType r7, zz1.j r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof xd2.d
            if (r0 == 0) goto L13
            r0 = r9
            xd2.d r0 = (xd2.d) r0
            int r1 = r0.f304231w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304231w = r1
            goto L18
        L13:
            xd2.d r0 = new xd2.d
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304231w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            return r4
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r9)
            zz1.k r9 = new zz1.k
            r9.<init>(r7, r6, r8)
            vw1.b r5 = r5.f304235l
            r0.f304231w = r3
            uy1.j r5 = (uy1.j) r5
            java.lang.Object r5 = r5.k(r9, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.f.c3(xd2.f, java.lang.String, com.revolut.feature.apm.core.models.alias.AliasType, zz1.j, gim.c):fim.a");
    }

    public final Object d3(String str, AliasType aliasType, zz1.j jVar, Function1 function1, gim.i iVar) {
        Object objY2 = Y2(iVar, new e(aliasType, str, this, jVar, function1, null));
        return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
    }
}
