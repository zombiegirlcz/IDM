package nd1;

import id1.o;
import kotlin.jvm.internal.Intrinsics;
import n1g.p;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad1.a f214293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f214294b;

    public i(ad1.a amountInteractor, o currencyRepository) {
        Intrinsics.checkNotNullParameter(amountInteractor, "amountInteractor");
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        this.f214293a = amountInteractor;
        this.f214294b = currencyRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r8 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r8 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:25:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nd1.i r8, gim.c r9) {
        /*
            ad1.a r0 = r8.f214293a
            boolean r1 = r9 instanceof nd1.d
            if (r1 == 0) goto L15
            r1 = r9
            nd1.d r1 = (nd1.d) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            nd1.d r1 = new nd1.d
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r8 = r1.f214284y
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r2 = r1.f214283x
            xi0.b r4 = r1.f214282w
            java.lang.Object r6 = r1.v
            java.util.Iterator r7 = r1.u
            yhm.o.b(r8)
            goto L93
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            yhm.o.b(r8)
            goto L6a
        L41:
            yhm.o.b(r8)
            r8 = r0
            sfc.e r8 = (sfc.e) r8
            gr6.i r8 = r8.d
            et6.a1 r8 = (et6.a1) r8
            java.util.Set r2 = et6.a1.d
            akg.n r8 = r8.c(r2)
            se0.a r2 = new se0.a
            r6 = 21
            r2.<init>(r6)
            akg.n r8 = nim.a.v(r8, r2)
            r2 = 3
            jhi.b r8 = mo3.a.g(r8, r5, r5, r2)
            r1.A = r4
            java.lang.Object r8 = vkm.q.x(r8, r1)
            if (r8 != r9) goto L6a
            goto L92
        L6a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r7 = r8
        L72:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9a
            java.lang.Object r6 = r7.next()
            r4 = r6
            xi0.b r4 = (xi0.b) r4
            r1.u = r7
            r1.v = r6
            r1.f214282w = r4
            r1.f214283x = r2
            r1.A = r3
            r8 = r0
            sfc.e r8 = (sfc.e) r8
            java.lang.Object r8 = r8.b(r1)
            if (r8 != r9) goto L93
        L92:
            return r9
        L93:
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r4, r8)
            if (r8 == 0) goto L72
            return r6
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.i.a(nd1.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nd1.e
            if (r0 == 0) goto L13
            r0 = r6
            nd1.e r0 = (nd1.e) r0
            int r1 = r0.f214285w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214285w = r1
            goto L18
        L13:
            nd1.e r0 = new nd1.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214285w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L46
        L36:
            yhm.o.b(r6)
            n1g.p r6 = r5.d()
            r0.f214285w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L46
            goto L54
        L46:
            xi0.b r6 = (xi0.b) r6
            r0.f214285w = r3
            ad1.a r2 = r5.f214293a
            sfc.e r2 = (sfc.e) r2
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.i.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof nd1.f
            if (r0 == 0) goto L13
            r0 = r7
            nd1.f r0 = (nd1.f) r0
            int r1 = r0.f214287x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214287x = r1
            goto L18
        L13:
            nd1.f r0 = new nd1.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214287x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.u
            yhm.o.b(r7)
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            r0.f214287x = r4
            ad1.a r7 = r6.f214293a
            sfc.e r7 = (sfc.e) r7
            java.io.Serializable r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L56
        L48:
            n1g.p r2 = r6.d()
            r0.u = r7
            r0.f214287x = r3
            java.lang.Object r0 = vkm.q.x(r2, r0)
            if (r0 != r1) goto L57
        L56:
            return r1
        L57:
            r5 = r0
            r0 = r7
            r7 = r5
        L5a:
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.i.c(gim.c):java.lang.Object");
    }

    public final p d() {
        return new p(this.f214294b.f160406a, this, 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nd1.h
            if (r0 == 0) goto L13
            r0 = r6
            nd1.h r0 = (nd1.h) r0
            int r1 = r0.f214292x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214292x = r1
            goto L18
        L13:
            nd1.h r0 = new nd1.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214292x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            id1.o r0 = r0.u
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            id1.o r6 = r5.f214294b
            r0.u = r6
            r0.f214292x = r3
            ad1.a r2 = r5.f214293a
            sfc.e r2 = (sfc.e) r2
            java.io.Serializable r0 = r2.a(r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            r4 = r0
            r0 = r6
            r6 = r4
        L48:
            xi0.b r6 = (xi0.b) r6
            vkm.j2 r0 = r0.f160406a
            r0.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.i.e(gim.c):java.lang.Object");
    }
}
