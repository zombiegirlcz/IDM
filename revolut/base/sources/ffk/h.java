package ffk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cha.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f134832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dha.b f134833b;

    public h(t pricingPlanInteractor, dha.b repository) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f134832a = pricingPlanInteractor;
        this.f134833b = repository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ffk.b
            if (r0 == 0) goto L13
            r0 = r13
            ffk.b r0 = (ffk.b) r0
            int r1 = r0.f134818w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134818w = r1
            goto L18
        L13:
            ffk.b r0 = new ffk.b
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134818w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L6b
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L5c
        L36:
            yhm.o.b(r13)
            r0.f134818w = r4
            dha.b r13 = r10.f134833b
            r5 = r13
            pfk.s r5 = (pfk.s) r5
            r5.getClass()
            pfk.m r4 = new pfk.m
            r9 = 0
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L59:
            if (r11 != r1) goto L5c
            goto L6a
        L5c:
            ffk.t r11 = r10.f134832a
            rfm.f0 r11 = r11.y()
            r0.f134818w = r3
            java.lang.Object r13 = nim.a.b(r11, r0)
            if (r13 != r1) goto L6b
        L6a:
            return r1
        L6b:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.h.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (i(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ffk.c
            if (r0 == 0) goto L13
            r0 = r13
            ffk.c r0 = (ffk.c) r0
            int r1 = r0.f134820w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134820w = r1
            goto L18
        L13:
            ffk.c r0 = new ffk.c
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134820w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L65
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L5c
        L36:
            yhm.o.b(r13)
            r0.f134820w = r4
            dha.b r13 = r10.f134833b
            r5 = r13
            pfk.s r5 = (pfk.s) r5
            r5.getClass()
            pfk.m r4 = new pfk.m
            r9 = 1
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L59:
            if (r11 != r1) goto L5c
            goto L64
        L5c:
            r0.f134820w = r3
            java.lang.Object r11 = r10.i(r0)
            if (r11 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.h.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (i(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ffk.d
            if (r0 == 0) goto L13
            r0 = r13
            ffk.d r0 = (ffk.d) r0
            int r1 = r0.f134824w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134824w = r1
            goto L18
        L13:
            ffk.d r0 = new ffk.d
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134824w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L65
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L5c
        L36:
            yhm.o.b(r13)
            r0.f134824w = r4
            dha.b r13 = r10.f134833b
            r5 = r13
            pfk.s r5 = (pfk.s) r5
            r5.getClass()
            pfk.m r4 = new pfk.m
            r9 = 3
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L59:
            if (r11 != r1) goto L5c
            goto L64
        L5c:
            r0.f134824w = r3
            java.lang.Object r11 = r10.i(r0)
            if (r11 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.h.d(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d e() {
        pfk.s sVar = (pfk.s) this.f134833b;
        sVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return sVar.f235691l.b(Unit.f186387a, loadingStrategy);
    }

    public final Flow f(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(rd0.e.b(this.f134832a.v(w4l.h.f294642c)), new f0d.l(this, loadingStrategy, 27));
    }

    public final cxe.u g() {
        return nim.a.y(vkm.q.Q(zi0.c.w(f(w4l.h.f294642c)), new f5h.b((Continuation) null, this, 5)), new fe9.f(19));
    }

    public final vkm.d h(zm3.a contact, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if ((contact instanceof zm3.e) || (contact instanceof zm3.f) || (contact instanceof zm3.n) || (contact instanceof zm3.o)) {
            throw new IllegalArgumentException(a0.d.q("Contact type ", contact.getClass(), " is not supported for the Family Plan"));
        }
        if (!(contact instanceof zm3.l)) {
            throw new NoWhenBranchMatchedException();
        }
        String code = ((zm3.l) contact).getCode();
        pfk.s sVar = (pfk.s) this.f134833b;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return sVar.f.b(code, loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ffk.f
            if (r0 == 0) goto L13
            r0 = r7
            ffk.f r0 = (ffk.f) r0
            int r1 = r0.f134830w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134830w = r1
            goto L18
        L13:
            ffk.f r0 = new ffk.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134830w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L84
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L5e
        L36:
            yhm.o.b(r7)
            ffk.t r7 = r6.f134832a
            w4l.h r2 = w4l.h.f294642c
            efm.r r7 = r7.v(r2)
            fci.e0 r2 = new fci.e0
            r5 = 7
            r2.<init>(r5)
            r5 = 0
            efm.r r7 = m70.a.g(r7, r5, r2, r4)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f134830w = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L5e
            goto L83
        L5e:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r7 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r7
            lha.o r2 = r7.f81142t
            if (r2 != 0) goto L67
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L67:
            hha.d r7 = r7.f81129a
            java.lang.String r7 = r7.f152287a
            r0.f134830w = r3
            dha.b r3 = r6.f134833b
            pfk.s r3 = (pfk.s) r3
            x4l.c r3 = r3.e
            pfk.i r5 = new pfk.i
            r5.<init>(r2, r7)
            java.lang.Object r7 = r3.d(r5, r4, r0)
            if (r7 != r1) goto L7f
            goto L81
        L7f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L81:
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.h.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (i(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ffk.g
            if (r0 == 0) goto L13
            r0 = r13
            ffk.g r0 = (ffk.g) r0
            int r1 = r0.f134831w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134831w = r1
            goto L18
        L13:
            ffk.g r0 = new ffk.g
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134831w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L65
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L5c
        L36:
            yhm.o.b(r13)
            r0.f134831w = r4
            dha.b r13 = r10.f134833b
            r5 = r13
            pfk.s r5 = (pfk.s) r5
            r5.getClass()
            pfk.m r4 = new pfk.m
            r9 = 5
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L59:
            if (r11 != r1) goto L5c
            goto L64
        L5c:
            r0.f134831w = r3
            java.lang.Object r11 = r10.i(r0)
            if (r11 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.h.j(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
