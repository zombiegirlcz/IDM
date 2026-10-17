package ul2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ar6.c f280857a;

    public c(ar6.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f280857a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ul2.b
            if (r0 == 0) goto L13
            r0 = r7
            ul2.b r0 = (ul2.b) r0
            int r1 = r0.f280856w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280856w = r1
            goto L18
        L13:
            ul2.b r0 = new ul2.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280856w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L68
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            ar6.c r7 = r5.f280857a
            java.lang.String r2 = "remoteFileId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.feature.form_wizard.impl.network.services.FormWizardService r7 = r7.f8523a
            efm.d0 r6 = r7.validateFileUpload(r6)
            aqb.s r7 = new aqb.s
            r2 = 19
            r7.<init>(r2)
            aoa.h r2 = new aoa.h
            r4 = 11
            r2.<init>(r7, r4)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            ufm.n r6 = te0.w.i0(r7)
            r0.f280856w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.c.a(java.lang.String, gim.c):java.lang.Object");
    }
}
