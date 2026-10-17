package js7;

import kotlin.jvm.internal.Intrinsics;
import ys7.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ys7.a f178148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f178149b;

    public b(ys7.a cancelRepository, h insuranceDetailsRepository) {
        Intrinsics.checkNotNullParameter(cancelRepository, "cancelRepository");
        Intrinsics.checkNotNullParameter(insuranceDetailsRepository, "insuranceDetailsRepository");
        this.f178148a = cancelRepository;
        this.f178149b = insuranceDetailsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof js7.a
            if (r0 == 0) goto L13
            r0 = r14
            js7.a r0 = (js7.a) r0
            int r1 = r0.f178147y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178147y = r1
            goto L18
        L13:
            js7.a r0 = new js7.a
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f178145w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178147y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.v
            yhm.o.b(r14)
            return r12
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L5c
        L3b:
            yhm.o.b(r14)
            r0.u = r12
            r0.f178147y = r4
            ys7.a r6 = r11.f178148a
            r6.getClass()
            y65.l r5 = new y65.l
            r10 = 13
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)
            if (r14 != r1) goto L5b
            goto L79
        L5b:
            r12 = r7
        L5c:
            r13 = r14
            qs7.a r13 = (qs7.a) r13
            r0.u = r9
            r0.v = r14
            r0.f178147y = r3
            ys7.h r13 = r11.f178149b
            x4l.c r13 = r13.d
            ys7.f r2 = new ys7.f
            r2.<init>(r12)
            java.lang.Object r12 = r13.e(r2, r0)
            if (r12 != r1) goto L75
            goto L77
        L75:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L77:
            if (r12 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: js7.b.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
