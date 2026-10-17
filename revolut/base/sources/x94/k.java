package x94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f303553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y94.c f303554c;

    public k(g state, y94.c creditDocumentInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(creditDocumentInteractor, "creditDocumentInteractor");
        this.f303553b = state;
        this.f303554c = creditDocumentInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 j3(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "documentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            x94.g r1 = r8.f303553b
            te0.e r1 = r1.U()
            boolean r2 = r1.isInitialized()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.get()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.f186385a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r9)
            if (r2 == 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L3f
            te0.s r2 = te0.s.f270018a
            efm.r r1 = r1.c(r2)
            if (r1 == 0) goto L3f
            x8i.h r2 = new x8i.h
            r3 = 3
            r2.<init>(r3)
            x8i.g r3 = new x8i.g
            r4 = 18
            r3.<init>(r4, r2)
            efm.r r1 = r1.map(r3)
            if (r1 == 0) goto L3f
            goto L7c
        L3f:
            y94.c r1 = r8.f303554c
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            su3.a r2 = new su3.a
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r0)
            r6 = 0
            r7 = 60
            java.lang.String r3 = "https://assets.revolut.com/credit/loans/terms/lt/credit_registers.html"
            java.lang.String r4 = ""
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            ufm.b r0 = efm.d0.m(r2)
            java.lang.String r1 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            efm.r r0 = r0.x()
            java.lang.String r1 = "toObservable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            x94.j r1 = new x94.j
            r2 = 0
            r1.<init>(r8, r9, r2)
            x8i.g r9 = new x8i.g
            r2 = 13
            r9.<init>(r2, r1)
            efm.r r1 = r0.doOnNext(r9)
        L7c:
            efm.d0 r9 = r1.firstOrError()
            java.lang.String r0 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x94.k.j3(java.lang.String):efm.d0");
    }
}
