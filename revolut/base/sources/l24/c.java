package l24;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f191616a;

    public c(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f191616a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.util.Map r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l24.b
            if (r0 == 0) goto L13
            r0 = r8
            l24.b r0 = (l24.b) r0
            int r1 = r0.f191615y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191615y = r1
            goto L18
        L13:
            l24.b r0 = new l24.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f191613w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191615y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ft3.d1 r7 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r8)
            goto L77
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            java.lang.String r8 = "contextId"
            java.lang.Object r8 = r7.get(r8)
            boolean r2 = r8 instanceof java.lang.String
            r4 = 0
            if (r2 == 0) goto L44
            java.lang.String r8 = (java.lang.String) r8
            goto L45
        L44:
            r8 = r4
        L45:
            java.lang.String r2 = "creditProduct"
            java.lang.Object r2 = r7.get(r2)
            boolean r5 = r2 instanceof java.lang.String
            if (r5 == 0) goto L52
            java.lang.String r2 = (java.lang.String) r2
            goto L53
        L52:
            r2 = r4
        L53:
            if (r2 == 0) goto L5a
            ft3.d1 r2 = ft3.g1.b(r2)
            goto L5b
        L5a:
            r2 = r4
        L5b:
            if (r2 == 0) goto L8e
            if (r8 != 0) goto L60
            goto L8e
        L60:
            ang.f r7 = r6.f191616a
            r4 = 0
            efm.d0 r7 = r7.f(r4)
            r0.u = r8
            r0.v = r2
            r0.f191615y = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            r0 = r8
            r8 = r7
            r7 = r2
        L77:
            do3.n r8 = (do3.n) r8
            nv3.a r1 = new nv3.a
            ft3.j1 r2 = r7.E2()
            gt3.f r7 = r7.A4()
            kotlin.jvm.internal.Intrinsics.h(r8)
            wi0.b r8 = do3.q.y(r8)
            r1.<init>(r0, r2, r7, r8)
            return r1
        L8e:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not enough data to create a CreditBiometricPayload, parameters = "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "CreditBiometricVerificationProviderImpl"
            rd0.d.a(r0, r1, r7, r4, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l24.c.a(java.util.Map, gim.c):java.io.Serializable");
    }
}
