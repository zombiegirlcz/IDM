package c62;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1.b f21584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.a f21585b;

    public d(vw1.b aliasRepository, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f21584a = aliasRepository;
        this.f21585b = idempotencyKeyHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:27:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(zz1.f r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof c62.b
            if (r0 == 0) goto L13
            r0 = r10
            c62.b r0 = (c62.b) r0
            int r1 = r0.f21581y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21581y = r1
            goto L18
        L13:
            c62.b r0 = new c62.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f21579w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21581y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L6e
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            int r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L5d
        L3e:
            yhm.o.b(r10)
            java.lang.String r10 = r9.f326483a
            zz1.e r9 = r9.f326484b
            r2 = 5
        L46:
            zz1.e r5 = zz1.e.COMPLETED
            if (r9 == r5) goto L79
            if (r2 <= 0) goto L79
            r0.u = r10
            r0.v = r2
            r0.f21581y = r4
            r5 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = skm.k0.b(r5, r0)
            if (r9 != r1) goto L5b
            goto L6d
        L5b:
            r9 = r2
            r2 = r10
        L5d:
            r0.u = r2
            r0.v = r9
            r0.f21581y = r3
            vw1.b r10 = r8.f21584a
            uy1.j r10 = (uy1.j) r10
            java.lang.Object r10 = r10.h(r2, r0)
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            zz1.f r10 = (zz1.f) r10
            zz1.e r10 = r10.f326484b
            int r9 = r9 + (-1)
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
            goto L46
        L79:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c62.d.a(zz1.f, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(com.revolut.feature.apm.core.models.alias.Alias r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof c62.c
            if (r0 == 0) goto L13
            r0 = r9
            c62.c r0 = (c62.c) r0
            int r1 = r0.f21583x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21583x = r1
            goto L18
        L13:
            c62.c r0 = new c62.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21583x
            vw1.b r3 = r7.f21584a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            zz1.e r8 = r0.u
            yhm.o.b(r9)
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r9)
            goto L5f
        L3d:
            yhm.o.b(r9)
            goto L54
        L41:
            yhm.o.b(r9)
            java.lang.String r9 = "IDEMPOTENCY_TAG_DELETE_ALIAS"
            wj0.a r2 = r7.f21585b
            r2.a(r9)
            r0.f21583x = r6
            java.lang.Object r9 = vw1.b.b(r3, r8, r0)
            if (r9 != r1) goto L54
            goto L73
        L54:
            zz1.f r9 = (zz1.f) r9
            r0.f21583x = r5
            java.lang.Enum r9 = r7.a(r9, r0)
            if (r9 != r1) goto L5f
            goto L73
        L5f:
            zz1.e r9 = (zz1.e) r9
            boolean r8 = nz8.d.l(r9)
            if (r8 == 0) goto L74
            r0.u = r9
            r0.f21583x = r4
            uy1.j r3 = (uy1.j) r3
            java.lang.Object r8 = r3.j(r6, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c62.d.b(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Enum");
    }
}
