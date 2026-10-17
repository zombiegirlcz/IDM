package o95;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t95.e f223083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f223084b;

    public i(t95.e repository, g overdraftProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(overdraftProductFeatureTogglesInteractor, "overdraftProductFeatureTogglesInteractor");
        this.f223083a = repository;
        this.f223084b = overdraftProductFeatureTogglesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(w4l.k r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o95.h
            if (r0 == 0) goto L13
            r0 = r7
            o95.h r0 = (o95.h) r0
            int r1 = r0.f223082w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223082w = r1
            goto L18
        L13:
            o95.h r0 = new o95.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223082w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L4d
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            o95.g r7 = r5.f223084b
            wkm.l r6 = r7.l(r6)
            o4a.a r7 = new o4a.a
            r2 = 23
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r3, r7, r4)
            r0.f223082w = r4
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
        L55:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            r0 = r7
            f95.d r0 = (f95.d) r0
            f95.e r0 = r0.f132831b
            f95.e r1 = f95.e.ACTIVE
            if (r0 != r1) goto L55
            r3 = r7
        L69:
            f95.d r3 = (f95.d) r3
            if (r3 == 0) goto L70
            java.lang.String r6 = r3.f132830a
            return r6
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No active overdraft facility found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o95.i.a(w4l.k, gim.c):java.lang.Object");
    }
}
