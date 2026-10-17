package vw3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sp3.a f292617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a34.c f292618b;

    public d(sp3.a creditDataMonitoringFacade, a34.c repository) {
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f292617a = creditDataMonitoringFacade;
        this.f292618b = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, java.lang.String r13, nu3.e r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof vw3.c
            if (r0 == 0) goto L13
            r0 = r15
            vw3.c r0 = (vw3.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vw3.c r0 = new vw3.c
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f292615x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            return r15
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            nu3.e r14 = r0.f292614w
            java.lang.String r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r15)
        L3b:
            r6 = r12
            r7 = r13
            r8 = r14
            goto L7c
        L3f:
            yhm.o.b(r15)
            bs3.g r15 = bs3.g.INCOGNIA
            long r5 = r14.f219199a
            double r5 = (double) r5
            r2 = 100
            double r7 = (double) r2
            double r5 = r5 / r7
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "format(...)"
            java.lang.String r6 = "%.2f"
            java.lang.String r2 = a0.d.v(r2, r4, r6, r5)
            java.lang.String r5 = "credit_value"
            java.util.Map r2 = a0.d.x(r5, r2)
            bs3.i r5 = new bs3.i
            java.lang.String r6 = "offer"
            r5.<init>(r6, r2, r15)
            r0.u = r12
            r0.v = r13
            r0.f292614w = r14
            r0.z = r4
            sp3.a r15 = r11.f292617a
            qq3.g r15 = (qq3.g) r15
            java.lang.Object r15 = r15.a(r5, r0)
            if (r15 != r1) goto L3b
            goto L9b
        L7c:
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f292614w = r12
            r0.z = r3
            a34.c r5 = r11.f292618b
            r5.getClass()
            a34.a r4 = new a34.a
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L9c
        L9b:
            return r1
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vw3.d.a(java.lang.String, java.lang.String, nu3.e, gim.c):java.lang.Object");
    }
}
