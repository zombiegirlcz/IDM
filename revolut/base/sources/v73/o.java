package v73;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v6l.b0;
import v6l.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends yji.n implements k {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ic8.a f286548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f286549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wsg.n f286550n;
    public final ao.h o;

    public o(ic8.a juniorCardCommandsFactory, ang.f userInteractor, wsg.n walletsInteractor, ao.h juniorCoparentInteractor) {
        Intrinsics.checkNotNullParameter(juniorCardCommandsFactory, "juniorCardCommandsFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        this.f286548l = juniorCardCommandsFactory;
        this.f286549m = userInteractor;
        this.f286550n = walletsInteractor;
        this.o = juniorCoparentInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(v73.o r4, java.lang.String r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof v73.m
            if (r0 == 0) goto L16
            r0 = r6
            v73.m r0 = (v73.m) r0
            int r1 = r0.f286546w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f286546w = r1
            goto L1b
        L16:
            v73.m r0 = new v73.m
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286546w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L64
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            ang.f r6 = r4.f286549m
            r2 = 0
            efm.r r6 = r6.k(r2)
            efm.r r4 = r4.c3(r5)
            efm.r r4 = le.u1.d(r6, r4)
            v6l.b0 r5 = new v6l.b0
            r6 = 20
            r5.<init>(r6)
            efm.r r4 = nim.a.w(r4, r5)
            v25.g r5 = new v25.g
            r6 = 28
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            r0.f286546w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v73.o.Z2(v73.o, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(v73.o r4, java.lang.String r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof v73.n
            if (r0 == 0) goto L16
            r0 = r6
            v73.n r0 = (v73.n) r0
            int r1 = r0.f286547w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f286547w = r1
            goto L1b
        L16:
            v73.n r0 = new v73.n
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286547w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L70
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            efm.r r4 = r4.c3(r5)
            v6l.b0 r5 = new v6l.b0
            r6 = 18
            r5.<init>(r6)
            efm.r r4 = nim.a.w(r4, r5)
            v25.g r5 = new v25.g
            r6 = 27
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            v6l.b0 r5 = new v6l.b0
            r6 = 19
            r5.<init>(r6)
            v6l.e0 r6 = new v6l.e0
            r2 = 13
            r6.<init>(r2, r5)
            efm.r r4 = r4.map(r6)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.f286547w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L70
            return r1
        L70:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v73.o.b3(v73.o, java.lang.String, gim.c):java.lang.Object");
    }

    public final efm.r c3(String str) {
        efm.r map = m70.a.g(this.f286550n.b0(str), null, new v25.g(29), 1).map(new e0(12, new b0(21)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarFlatMap = map.flatMap(new e0(14, new v25.k(this, 16)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }
}
