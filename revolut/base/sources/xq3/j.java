package xq3;

import efm.d0;
import ft3.d1;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import xo8.i0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr3.k f308077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xr3.l f308078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final up3.b f308079c;

    public j(xr3.k repository, xr3.l creditApplicationWorkflowRepository, up3.b creditFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(creditApplicationWorkflowRepository, "creditApplicationWorkflowRepository");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        this.f308077a = repository;
        this.f308078b = creditApplicationWorkflowRepository;
        this.f308079c = creditFeatureAvailabilityInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r13 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable d(xq3.j r8, ft3.d1 r9, java.lang.String r10, com.revolut.feature.credit.application.api.models.IntendedPricingPlan r11, ft3.a1 r12, gim.c r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof xq3.h
            if (r0 == 0) goto L14
            r0 = r13
            xq3.h r0 = (xq3.h) r0
            int r1 = r0.f308075w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f308075w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xq3.h r0 = new xq3.h
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f308075w
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            yhm.o.b(r13)
            goto L6f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            xq3.j r8 = r6.u
            yhm.o.b(r13)
            goto L4e
        L3a:
            yhm.o.b(r13)
            xr3.l r1 = r8.f308078b
            r6.u = r8
            r6.f308075w = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L4e
            goto L6e
        L4e:
            wp3.f r13 = (wp3.f) r13
            xr3.k r8 = r8.f308077a
            java.lang.String r9 = r13.a()
            r10 = 0
            r6.u = r10
            r6.f308075w = r7
            r8.getClass()
            xr3.j r11 = new xr3.j
            r12 = 3
            r11.<init>(r8, r9, r10, r12)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r8, r11, r6)
            if (r13 != r0) goto L6f
        L6e:
            return r0
        L6f:
            it3.d r13 = (it3.d) r13
            it3.b r8 = new it3.b
            r8.<init>(r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.j.d(xq3.j, ft3.d1, java.lang.String, com.revolut.feature.credit.application.api.models.IntendedPricingPlan, ft3.a1, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e(xq3.j r5, ft3.d1 r6, java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof xq3.i
            if (r0 == 0) goto L13
            r0 = r8
            xq3.i r0 = (xq3.i) r0
            int r1 = r0.f308076w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308076w = r1
            goto L18
        L13:
            xq3.i r0 = new xq3.i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308076w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            xq3.j r5 = r0.u
            yhm.o.b(r8)
            goto L48
        L38:
            yhm.o.b(r8)
            xr3.l r8 = r5.f308078b
            r0.u = r5
            r0.f308076w = r4
            java.lang.Object r8 = r8.b(r6, r7, r0)
            if (r8 != r1) goto L48
            goto L68
        L48:
            wp3.g r8 = (wp3.g) r8
            xr3.k r5 = r5.f308077a
            java.lang.String r6 = r8.a()
            r7 = 0
            r0.u = r7
            r0.f308076w = r3
            r5.getClass()
            xr3.j r8 = new xr3.j
            r2 = 3
            r8.<init>(r5, r6, r7, r2)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r5, r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            it3.d r8 = (it3.d) r8
            it3.b r5 = new it3.b
            r5.<init>(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.j.e(xq3.j, ft3.d1, java.lang.String, gim.c):java.io.Serializable");
    }

    public static Object g(j jVar, Set set, gim.c cVar) {
        xr3.k kVar = jVar.f308077a;
        kVar.getClass();
        xge.f fVar = new xge.f(set, kVar, w4l.i.f294643c, null, 14);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, fVar, cVar);
    }

    public final Object a(String str, gim.c cVar) {
        xr3.k kVar = this.f308077a;
        kVar.getClass();
        xr3.j jVar = new xr3.j(kVar, str, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, jVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ft3.d1 r6, yp3.e r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof xq3.f
            if (r0 == 0) goto L13
            r0 = r8
            xq3.f r0 = (xq3.f) r0
            int r1 = r0.f308071x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308071x = r1
            goto L18
        L13:
            xq3.f r0 = new xq3.f
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308071x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ft3.d1 r6 = r0.u
            yhm.o.b(r8)
            goto L5e
        L38:
            yhm.o.b(r8)
            int[] r8 = xq3.e.f308069c
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L4f
            if (r7 != r3) goto L49
            r7 = r4
            goto L64
        L49:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L4f:
            up3.b r7 = r5.f308079c
            r0.u = r6
            r0.f308071x = r4
            xq3.q r7 = (xq3.q) r7
            java.lang.Object r8 = r7.g(r6, r0)
            if (r8 != r1) goto L5e
            goto L91
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
        L64:
            if (r7 == 0) goto L93
            xr3.k r7 = r5.f308077a
            r8 = 0
            r0.u = r8
            r0.f308071x = r3
            qe0.s r8 = r7.f
            r8.d = r4
            java.lang.String r8 = "productClassification"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            x4l.c r8 = r7.f308227h
            xr3.i r2 = new xr3.i
            r2.<init>(r6)
            qe0.s r6 = r7.f
            w4l.i r7 = w4l.i.f294643c
            java.lang.String r3 = "EligibilityCache"
            w4l.k r6 = r6.c(r3, r7)
            vkm.d r6 = r8.b(r2, r6)
            java.lang.Object r6 = c8g.a.h(r6, r0)
            if (r6 != r1) goto L92
        L91:
            return r1
        L92:
            return r6
        L93:
            it3.g r6 = it3.i.Companion
            it3.h r7 = it3.h.MAINTENANCE
            r6.getClass()
            it3.i r6 = it3.g.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.j.b(ft3.d1, yp3.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ft3.d1 r16, java.lang.String r17, com.revolut.feature.credit.application.api.models.IntendedPricingPlan r18, ft3.a1 r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.j.c(ft3.d1, java.lang.String, com.revolut.feature.credit.application.api.models.IntendedPricingPlan, ft3.a1, gim.c):java.lang.Object");
    }

    public final Object f(String str, gim.c cVar) {
        xr3.k kVar = this.f308077a;
        kVar.getClass();
        xr3.j jVar = new xr3.j(kVar, str, null, 3);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, jVar, cVar);
    }

    public final pfm.z h() {
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(rd0.e.c(i(w4l.j.f294644c), kotlin.coroutines.g.f186406a)), null, new xlb.l(17), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        cs3.b.Companion.getClass();
        return ue0.e.F(d0VarFirstOrError, cs3.a.a());
    }

    public final vkm.y i(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        xr3.k kVar = this.f308077a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.e(n14.k.p(kVar.f308226g.b(Unit.f186387a, loadingStrategy), new i0(14)), h0.f322473a, new v77.c(12));
    }

    public final cxe.u k(d1 productClassification) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        return n14.k.p(vkm.q.q(boh.f.e(((q) this.f308079c).f(productClassification), new xpe.c(this, productClassification, 4))), new i0(13));
    }
}
