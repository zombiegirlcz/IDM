package q13;

import kotlin.jvm.internal.Intrinsics;
import u13.g;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f241339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zi1.d f241340b;

    public d(g deliveryRepository, zi1.d addressInteractor) {
        Intrinsics.checkNotNullParameter(deliveryRepository, "deliveryRepository");
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        this.f241339a = deliveryRepository;
        this.f241340b = addressInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(q13.d r8, java.lang.String r9, gim.c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof q13.b
            if (r0 == 0) goto L16
            r0 = r10
            q13.b r0 = (q13.b) r0
            int r1 = r0.f241337w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f241337w = r1
            goto L1b
        L16:
            q13.b r0 = new q13.b
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241337w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L59
        L29:
            r3 = r10
            goto L4d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            u13.g r8 = r8.f241339a     // Catch: java.lang.Throwable -> L59
            r0.f241337w = r3     // Catch: java.lang.Throwable -> L59
            tqh.j r10 = new tqh.j     // Catch: java.lang.Throwable -> L59
            r2 = 24
            r3 = 0
            r10.<init>(r8, r9, r3, r2)     // Catch: java.lang.Throwable -> L59
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L59
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r10 = skm.e0.J(r8, r10, r0)     // Catch: java.lang.Throwable -> L59
            if (r10 != r1) goto L29
            return r1
        L4d:
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L59
            return r2
        L57:
            r2 = r8
            goto L5c
        L59:
            r0 = move-exception
            r8 = r0
            goto L57
        L5c:
            boolean r8 = r2 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L6a
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L6a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q13.d.a(q13.d, java.lang.String, gim.c):java.lang.Object");
    }
}
