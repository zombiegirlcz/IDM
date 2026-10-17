package ffk;

import kotlin.jvm.internal.Intrinsics;
import pfk.t0;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f134827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f134828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f134829c;

    public e0(t0 repository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f134827a = repository;
        this.f134828b = userInteractor;
        this.f134829c = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ffk.d0
            if (r0 == 0) goto L13
            r0 = r8
            ffk.d0 r0 = (ffk.d0) r0
            int r1 = r0.f134825w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134825w = r1
            goto L18
        L13:
            ffk.d0 r0 = new ffk.d0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134825w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L57
        L36:
            yhm.o.b(r8)
            r0.f134825w = r4
            pfk.t0 r8 = r6.f134827a
            r8.getClass()
            pfk.s0 r2 = new pfk.s0
            r4 = 0
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L54:
            if (r7 != r1) goto L57
            goto L65
        L57:
            ang.f r7 = r6.f134828b
            pfm.h r7 = r7.i()
            r0.f134825w = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.e0.a(java.lang.String, gim.c):java.lang.Object");
    }
}
