package ww4;

import al4.n;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f300613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f300614b;

    public j(n creditCardInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f300613a = creditCardInteractor;
        this.f300614b = creditCardFeatureInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ww4.i
            if (r0 == 0) goto L13
            r0 = r7
            ww4.i r0 = (ww4.i) r0
            int r1 = r0.f300612x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300612x = r1
            goto L18
        L13:
            ww4.i r0 = new ww4.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300612x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            yw4.f r7 = yw4.f.IN_APP_STATEMENT
            r0.u = r6
            r0.f300612x = r4
            om4.k0 r2 = r5.f300614b
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L61
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            r7 = 0
            r0.u = r7
            r0.f300612x = r3
            al4.n r7 = r5.f300613a
            om4.x2 r7 = (om4.x2) r7
            java.lang.Object r6 = r7.u(r6, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ww4.j.a(java.lang.String, gim.c):java.lang.Object");
    }
}
