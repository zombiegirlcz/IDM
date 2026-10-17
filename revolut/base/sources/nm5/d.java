package nm5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f217176a;

    public d(b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f217176a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof nm5.c
            if (r0 == 0) goto L13
            r0 = r10
            nm5.c r0 = (nm5.c) r0
            int r1 = r0.f217175w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f217175w = r1
            goto L18
        L13:
            nm5.c r0 = new nm5.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f217175w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L28
        L26:
            r3 = r10
            goto L50
        L28:
            r0 = move-exception
            r9 = r0
            r2 = r9
            goto L5a
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            yhm.o.b(r10)
            nm5.b r10 = r8.f217176a     // Catch: java.lang.Throwable -> L28
            r0.f217175w = r3     // Catch: java.lang.Throwable -> L28
            r10.getClass()     // Catch: java.lang.Throwable -> L28
            njj.n0 r2 = new njj.n0     // Catch: java.lang.Throwable -> L28
            r3 = 5
            r4 = 0
            r2.<init>(r10, r9, r4, r3)     // Catch: java.lang.Throwable -> L28
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = skm.e0.J(r9, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r10 != r1) goto L26
            return r1
        L50:
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28
            return r2
        L5a:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nm5.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
