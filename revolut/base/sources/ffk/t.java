package ffk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import fag.m0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pfk.i0;
import pfk.n0;
import pfk.p0;
import pfk.v0;
import pfk.w0;
import rfm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dha.c f134850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f134851b;

    public t(dha.c pricingPlansRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f134850a = pricingPlansRepository;
        this.f134851b = dateProvider;
    }

    public static hha.g c(hha.d dVar, hha.i iVar) {
        int i = n.f134842a[iVar.ordinal()];
        Object obj2 = null;
        if (i == 1) {
            Iterator it8 = dVar.f152291h.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((hha.g) next).f152306a, jli.e.f175845h)) {
                    obj2 = next;
                    break;
                }
            }
            return (hha.g) obj2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it9 = dVar.f152291h.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (Intrinsics.f(((hha.g) next2).f152306a, jli.e.f175842b)) {
                obj2 = next2;
                break;
            }
        }
        return (hha.g) obj2;
    }

    public static efm.r u(t tVar, String planId, hha.i billingCode, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        return ((p0) tVar.f134850a).c(planId, billingCode, null, null, null, z, null);
    }

    public static vkm.d w(t tVar, SubscriptionPreviewId previewId) {
        v0 v0Var;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(previewId, "previewId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p0 p0Var = (p0) tVar.f134850a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(previewId, "previewId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = p0Var.f235673j;
        Intrinsics.checkNotNullParameter(previewId, "previewId");
        if (previewId instanceof SubscriptionPreviewId.GiftedPlan) {
            SubscriptionPreviewId.GiftedPlan giftedPlan = (SubscriptionPreviewId.GiftedPlan) previewId;
            v0Var = new v0(giftedPlan.f81153a, null, giftedPlan.f81154b);
        } else if (Intrinsics.f(previewId, SubscriptionPreviewId.Global.f81155a)) {
            v0Var = new v0("global", null, null);
        } else {
            if (!(previewId instanceof SubscriptionPreviewId.Plan)) {
                throw new NoWhenBranchMatchedException();
            }
            SubscriptionPreviewId.Plan plan = (SubscriptionPreviewId.Plan) previewId;
            String str = plan.f81156a;
            hha.i iVar = plan.f81157b;
            v0Var = new v0(str, iVar != null ? cp5.d.X(iVar) : null, null);
        }
        return cVar.b(v0Var, loadingStrategy);
    }

    public static f0 z(t tVar, String planId, hha.i iVar, String str, boolean z, Integer num, int i) {
        String str2 = (i & 4) != 0 ? null : str;
        boolean z3 = (i & 8) != 0 ? false : z;
        Integer num2 = (i & 128) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(planId, "planId");
        p0 p0Var = (p0) tVar.f134850a;
        f0 f0VarF = p0Var.f(planId, iVar, z3, str2, null, null, null, num2).f(p0Var.e());
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ffk.o
            if (r0 == 0) goto L13
            r0 = r8
            ffk.o r0 = (ffk.o) r0
            int r1 = r0.f134843w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134843w = r1
            goto L18
        L13:
            ffk.o r0 = new ffk.o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134843w
            dha.c r3 = r7.f134850a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L69
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yhm.o.b(r8)
            goto L5a
        L38:
            yhm.o.b(r8)
            r0.f134843w = r5
            r8 = r3
            pfk.p0 r8 = (pfk.p0) r8
            r8.getClass()
            pfk.m0 r2 = new pfk.m0
            r5 = 0
            r6 = 0
            r2.<init>(r8, r5, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L57:
            if (r8 != r1) goto L5a
            goto L68
        L5a:
            pfk.p0 r3 = (pfk.p0) r3
            rfm.f0 r8 = r3.e()
            r0.f134843w = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.t.a(gim.c):java.lang.Object");
    }

    public final Object b(gwl.c cVar) {
        w4l.f fVar = ((p0) this.f134850a).f235671g;
        int i = jli.h.f175850a;
        Unit unit = Unit.f186387a;
        efm.b bVarIgnoreElements = mo3.a.n(fVar.e(unit, w4l.j.f294644c)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        Object objA = nim.a.a(ue0.e.v(bVarIgnoreElements), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = unit;
        }
        return objA == aVar ? objA : unit;
    }

    public final hha.d d() {
        w0 w0Var = (w0) ((p0) this.f134850a).d.get("CACHE_KEY_SUBSCRIPTION_WITH_PLANS");
        PricingPlanSubscription pricingPlanSubscriptionA = w0Var != null ? w0Var.a() : null;
        if (pricingPlanSubscriptionA != null) {
            return pricingPlanSubscriptionA.f81129a;
        }
        return null;
    }

    public final efm.d0 e() {
        efm.d0 d0VarFirstOrError = m70.a.g(q(), null, new fci.e0(10), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final efm.d0 f(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(n(), new f9g.l(planId, 12)), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final akg.n g(String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p0 p0Var = (p0) this.f134850a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(p0Var.f235675m.b(Unit.f186387a, loadingStrategy), new f9g.l(str, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ffk.q
            if (r0 == 0) goto L13
            r0 = r6
            ffk.q r0 = (ffk.q) r0
            int r1 = r0.f134847w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134847w = r1
            goto L18
        L13:
            ffk.q r0 = new ffk.q
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134847w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            w4l.j r6 = w4l.j.f294644c
            efm.r r6 = r5.v(r6)
            fci.e0 r2 = new fci.e0
            r4 = 9
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f134847w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r6 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r6
            hha.z r6 = r6.f81136m
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.t.h(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(java.lang.String r6, hha.i r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ffk.p
            if (r0 == 0) goto L13
            r0 = r8
            ffk.p r0 = (ffk.p) r0
            int r1 = r0.f134846y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134846y = r1
            goto L18
        L13:
            ffk.p r0 = new ffk.p
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f134844w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134846y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ffk.t r6 = r0.v
            hha.i r7 = r0.u
            yhm.o.b(r8)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            efm.r r6 = r5.r(r6)
            fci.e0 r8 = new fci.e0
            r2 = 13
            r8.<init>(r2)
            efm.r r6 = m70.a.g(r6, r4, r8, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r0.u = r7
            r0.v = r5
            r0.f134846y = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r6 = r5
        L5d:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            hha.d r8 = (hha.d) r8
            r6.getClass()
            hha.g r6 = c(r8, r7)
            if (r6 == 0) goto L70
            hha.z r6 = r6.f
            return r6
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.t.i(java.lang.String, hha.i, gim.c):java.io.Serializable");
    }

    public final ufm.f j() {
        efm.d0 d0VarFirstOrError = m70.a.g(n(), null, new fci.e0(12), 1).firstOrError();
        l lVar = new l(0, new fe9.f(23));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, lVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.t(iVar, h0.f322473a);
    }

    public final ufm.n k() {
        efm.d0<gfk.b0> pricingPlanSubscription = ((p0) this.f134850a).f235668a.getPricingPlanSubscription();
        n0 n0Var = n0.f;
        o0.a aVar = new o0.a();
        pricingPlanSubscription.getClass();
        ufm.i iVar = new ufm.i(pricingPlanSubscription, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ffk.s
            if (r0 == 0) goto L13
            r0 = r7
            ffk.s r0 = (ffk.s) r0
            int r1 = r0.f134849w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134849w = r1
            goto L18
        L13:
            ffk.s r0 = new ffk.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134849w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L72
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            w4l.j r7 = w4l.j.f294644c
            efm.r r7 = r6.v(r7)
            fci.e0 r2 = new fci.e0
            r4 = 14
            r2.<init>(r4)
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r2, r3)
            efm.d0 r7 = r7.firstOrError()
            ffk.k r2 = new ffk.k
            r4 = 0
            r2.<init>(r6, r4)
            fag.m0 r4 = new fag.m0
            r5 = 25
            r4.<init>(r2, r5)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            pfm.z r7 = ue0.e.F(r2, r7)
            r0.f134849w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.t.l(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r5, hha.i r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ffk.r
            if (r0 == 0) goto L13
            r0 = r7
            ffk.r r0 = (ffk.r) r0
            int r1 = r0.f134848w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134848w = r1
            goto L18
        L13:
            ffk.r r0 = new ffk.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134848w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L71
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            efm.r r5 = r4.r(r5)
            fci.e0 r7 = new fci.e0
            r2 = 8
            r7.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r7, r3)
            efm.d0 r5 = r5.firstOrError()
            f0d.l r7 = new f0d.l
            r2 = 28
            r7.<init>(r4, r6, r2)
            fag.m0 r6 = new fag.m0
            r2 = 26
            r6.<init>(r7, r2)
            r5.getClass()
            ufm.i r7 = new ufm.i
            r2 = 1
            r7.<init>(r5, r6, r2)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            pfm.z r5 = ue0.e.F(r7, r5)
            r0.f134848w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.t.m(java.lang.String, hha.i, gim.c):java.lang.Object");
    }

    public final efm.r n() {
        return ((p0) this.f134850a).b();
    }

    public final efm.r o() {
        return nim.a.w(u1.d(q(), nim.a.w(((p0) this.f134850a).b(), new k(this, 2))), new k(this, 1));
    }

    public final efm.r p() {
        p0 p0Var = (p0) this.f134850a;
        return nim.a.w(p0Var.f235671g.f(Unit.f186387a, false), new i0(p0Var, 1));
    }

    public final efm.r q() {
        return nim.a.w(v(w4l.h.f294642c), new fe9.f(21));
    }

    public final efm.r r(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = nim.a.w(n(), new f9g.l(id10, 9)).map(new m0(new f9g.l(id10, 10), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final sfm.b s(iha.a aVar, boolean z, PricingPlanUpdateSource pricingPlanUpdateSource) {
        sfm.b bVar = new sfm.b(j(), new m0(new ard.t(this, aVar, z, pricingPlanUpdateSource, 6), 28), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final efm.r t(boolean z) {
        return ((p0) this.f134850a).f235672h.f(Unit.f186387a, z);
    }

    public final efm.r v(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((p0) this.f134850a).a(loadingStrategy);
    }

    public final efm.r x() {
        return nim.a.w(o(), new fe9.f(24));
    }

    public final f0 y() {
        return ((p0) this.f134850a).e();
    }
}
