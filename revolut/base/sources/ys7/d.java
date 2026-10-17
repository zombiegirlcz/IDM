package ys7;

import com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditStateService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import wf0.r0;
import y5b.b0;
import ya6.y;
import yo7.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCreditStateService f316419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f316420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f316421c;

    public d(InsuranceCreditStateService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f316419a = service;
        this.f316420b = memoryCache;
        Continuation continuation = null;
        this.f316421c = new x4l.c(new b0(this, continuation, 6), new p(this, 18), new yi3.d(this, 17), new r0(2, 26, continuation), new y(3, 1, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ys7.d r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ys7.c
            if (r0 == 0) goto L13
            r0 = r9
            ys7.c r0 = (ys7.c) r0
            int r1 = r0.f316418w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316418w = r1
            goto L18
        L13:
            ys7.c r0 = new ys7.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f316418w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L3d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditStateService r7 = r7.f316419a
            r0.f316418w = r3
            java.lang.Object r9 = r7.getInsuranceState(r8, r0)
            if (r9 != r1) goto L3d
            return r1
        L3d:
            zr7.q r9 = (zr7.q) r9
            zr7.p r7 = r9.getInsuranceState()
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            boolean r8 = r7 instanceof zr7.p.c
            if (r8 == 0) goto La3
            zr7.p$c r7 = (zr7.p.c) r7
            java.util.List r7 = r7.getPolicies()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = zhm.w.t(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L63:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L9d
            java.lang.Object r9 = r7.next()
            zr7.o r9 = (zr7.o) r9
            java.lang.String r0 = r9.getId()
            java.lang.String r9 = r9.getState()
            xr7.b[] r1 = xr7.b.values()
            int r2 = r1.length
            r4 = 0
        L7d:
            if (r4 >= r2) goto L8f
            r5 = r1[r4]
            java.lang.String r6 = r5.name()
            boolean r6 = kotlin.text.a0.z(r6, r9, r3)
            if (r6 == 0) goto L8c
            goto L90
        L8c:
            int r4 = r4 + 1
            goto L7d
        L8f:
            r5 = 0
        L90:
            if (r5 != 0) goto L94
            xr7.b r5 = xr7.b.UNKNOWN
        L94:
            xr7.a r9 = new xr7.a
            r9.<init>(r0, r5)
            r8.add(r9)
            goto L63
        L9d:
            xr7.e r7 = new xr7.e
            r7.<init>(r8)
            return r7
        La3:
            zr7.p$a r8 = zr7.p.a.f324650a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r8 == 0) goto Lae
            xr7.c r7 = xr7.c.f308289a
            return r7
        Lae:
            zr7.p$b r8 = zr7.p.b.f324651a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r7 == 0) goto Lb9
            xr7.d r7 = xr7.d.f308290a
            return r7
        Lb9:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ys7.d.a(ys7.d, java.lang.String, gim.c):java.lang.Object");
    }
}
