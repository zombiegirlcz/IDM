package b4g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f12350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90.b f12351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f12352c;

    public m0(ne0.j memoryCache, i90.b uuidUtils, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f12350a = memoryCache;
        this.f12351b = uuidUtils;
        this.f12352c = storage;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof b4g.k0
            if (r0 == 0) goto L13
            r0 = r9
            b4g.k0 r0 = (b4g.k0) r0
            int r1 = r0.f12343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12343w = r1
            goto L18
        L13:
            b4g.k0 r0 = new b4g.k0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12343w
            r3 = 0
            java.lang.String r4 = "SEARCH_SESSION_ID_MEMORY_KEY"
            ne0.j r5 = r8.f12350a
            r6 = 1
            if (r2 == 0) goto L34
            if (r2 != r6) goto L2c
            yhm.o.b(r9)
            goto L52
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            yhm.o.b(r9)
            java.lang.Object r9 = r5.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L5b
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            az.i r2 = new az.i
            r7 = 6
            r2.<init>(r8, r3, r7)
            r0.f12343w = r6
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L5a
            r5.f(r4, r9)
            return r9
        L5a:
            return r3
        L5b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b4g.m0.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b4g.l0
            if (r0 == 0) goto L13
            r0 = r8
            b4g.l0 r0 = (b4g.l0) r0
            int r1 = r0.f12347x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12347x = r1
            goto L18
        L13:
            b4g.l0 r0 = new b4g.l0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12347x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r0 = r0.u
            yhm.o.b(r8)
            goto L54
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            i90.b r8 = r7.f12351b
            java.lang.String r2 = "toString(...)"
            java.lang.String r8 = wp5.y.u(r8, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            avk.i r4 = new avk.i
            r5 = 0
            r6 = 23
            r4.<init>(r7, r8, r5, r6)
            r0.u = r8
            r0.f12347x = r3
            java.lang.Object r0 = skm.e0.J(r2, r4, r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            r0 = r8
        L54:
            ne0.j r8 = r7.f12350a
            java.lang.String r1 = "SEARCH_SESSION_ID_MEMORY_KEY"
            r8.f(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4g.m0.b(gim.c):java.lang.Object");
    }
}
