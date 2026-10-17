package jlf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f175737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f175738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cl3.a f175739n;

    public e(h0 commonDataSource, gte.a featureToggleInteractor, cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f175737l = commonDataSource;
        this.f175738m = featureToggleInteractor;
        this.f175739n = contactsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Z2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jlf.c
            if (r0 == 0) goto L13
            r0 = r7
            jlf.c r0 = (jlf.c) r0
            int r1 = r0.f175733w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175733w = r1
            goto L18
        L13:
            jlf.c r0 = new jlf.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175733w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L4f
        L28:
            r6 = move-exception
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            if (r6 == 0) goto L5b
            int r7 = r6.length()
            if (r7 != 0) goto L3e
            goto L5b
        L3e:
            cl3.a r7 = r5.f175739n     // Catch: java.lang.Exception -> L28
            wl3.h r7 = (wl3.h) r7     // Catch: java.lang.Exception -> L28
            rfm.z r6 = r7.b(r6)     // Catch: java.lang.Exception -> L28
            r0.f175733w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = nim.a.i(r6, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L4f
            return r1
        L4f:
            zm3.a r7 = (zm3.a) r7     // Catch: java.lang.Exception -> L28
            return r7
        L52:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r6, r7)
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jlf.e.Z2(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r22, java.lang.String r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jlf.e.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
