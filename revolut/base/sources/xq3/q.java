package xq3;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import ft3.d1;
import ft3.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements up3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f308091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f308092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f308093c;
    public final gte.a d;

    public q(y creditProductClassificationInteractor, jla.h productCatalogueInteractor, xoj.a featuresInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(creditProductClassificationInteractor, "creditProductClassificationInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f308091a = creditProductClassificationInteractor;
        this.f308092b = productCatalogueInteractor;
        this.f308093c = featuresInteractor;
        this.d = featureToggleInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xq3.m b(ft3.d1 r6) {
        /*
            ft3.j1 r0 = r6.f137810a
            it3.k r1 = r6.f137812c
            int[] r2 = xq3.n.d
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            r3 = -1
            r4 = 1
            switch(r0) {
                case 1: goto L81;
                case 2: goto L81;
                case 3: goto L81;
                case 4: goto L81;
                case 5: goto L81;
                case 6: goto L6e;
                case 7: goto L3a;
                case 8: goto L1e;
                case 9: goto L1b;
                case 10: goto L1b;
                case 11: goto L1b;
                case 12: goto L1b;
                case 13: goto L1b;
                case 14: goto L1b;
                case 15: goto L18;
                case 16: goto L18;
                case 17: goto L18;
                default: goto L12;
            }
        L12:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L18:
            xq3.m r6 = xq3.m.ALWAYS_ENABLED
            return r6
        L1b:
            xq3.m r6 = xq3.m.LEGACY_FEATURE
            return r6
        L1e:
            gt3.f r6 = r6.f137811b
            boolean r0 = r6 instanceof gt3.d
            if (r0 == 0) goto L27
            r2 = r6
            gt3.d r2 = (gt3.d) r2
        L27:
            if (r2 != 0) goto L2a
            goto L32
        L2a:
            int[] r6 = xq3.n.f308086c
            int r0 = r2.ordinal()
            r3 = r6[r0]
        L32:
            if (r3 != r4) goto L37
            xq3.m r6 = xq3.m.PRODUCT_CATALOGUE
            return r6
        L37:
            xq3.m r6 = xq3.m.LEGACY_FEATURE
            return r6
        L3a:
            java.lang.String r0 = "<this>"
            r3 = 0
            if (r1 == 0) goto L51
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            it3.k r5 = it3.k.CC_SECURED_RETAIL
            if (r1 == r5) goto L4d
            it3.k r5 = it3.k.CC_SECURED
            if (r1 != r5) goto L4b
            goto L4d
        L4b:
            r5 = r3
            goto L4e
        L4d:
            r5 = r4
        L4e:
            if (r5 != r4) goto L51
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L57
            xq3.m r6 = xq3.m.PRODUCT_CATALOGUE
            return r6
        L57:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            ft3.j1 r6 = r6.f137810a
            ft3.j1 r0 = ft3.j1.CREDIT_CARD
            if (r6 != r0) goto L66
            it3.k r6 = it3.k.CC_BUILDER
            if (r1 != r6) goto L66
            com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles$CreditBuilderCardEntryPoint r2 = com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c
        L66:
            if (r2 == 0) goto L6b
            xq3.m r6 = xq3.m.FEATURE_TOGGLE
            return r6
        L6b:
            xq3.m r6 = xq3.m.LEGACY_FEATURE
            return r6
        L6e:
            if (r1 != 0) goto L71
            goto L79
        L71:
            int[] r6 = xq3.n.f308085b
            int r0 = r1.ordinal()
            r3 = r6[r0]
        L79:
            if (r3 != r4) goto L7e
            xq3.m r6 = xq3.m.ALWAYS_ENABLED
            return r6
        L7e:
            xq3.m r6 = xq3.m.PRODUCT_CATALOGUE
            return r6
        L81:
            xq3.m r6 = xq3.m.PRODUCT_CATALOGUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.q.b(ft3.d1):xq3.m");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:25:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xq3.o
            if (r0 == 0) goto L13
            r0 = r7
            xq3.o r0 = (xq3.o) r0
            int r1 = r0.f308089y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308089y = r1
            goto L18
        L13:
            xq3.o r0 = new xq3.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f308087w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308089y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r2 = r0.v
            java.util.Iterator r5 = r0.u
            yhm.o.b(r7)
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            xq3.y r7 = r6.f308091a
            r7.getClass()
            java.util.Set r7 = xq3.y.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L51
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L51
        L4f:
            r3 = r4
            goto L78
        L51:
            java.util.Iterator r7 = r7.iterator()
            r5 = r7
            r2 = r4
        L57:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4f
            java.lang.Object r7 = r5.next()
            ft3.d1 r7 = (ft3.d1) r7
            r0.u = r5
            r0.v = r2
            r0.f308089y = r3
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 != r1) goto L70
            return r1
        L70:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L57
        L78:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.q.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(ft3.d1 r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.q.c(ft3.d1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ft3.d1 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xq3.p
            if (r0 == 0) goto L13
            r0 = r7
            xq3.p r0 = (xq3.p) r0
            int r1 = r0.f308090w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308090w = r1
            goto L18
        L13:
            xq3.p r0 = new xq3.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308090w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            xoj.a r7 = r5.f308093c
            cpj.b r7 = (cpj.b) r7
            efm.d0 r7 = r7.h()
            xq3.l r2 = new xq3.l
            r4 = 1
            r2.<init>(r6, r4)
            xo8.u r6 = new xo8.u
            r4 = 5
            r6.<init>(r4, r2)
            ufm.i r2 = new ufm.i
            r4 = 1
            r2.<init>(r7, r6, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.f308090w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.q.d(ft3.d1, gim.c):java.lang.Object");
    }

    public final boolean e(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint creditBuilderCardEntryPoint = (d1Var.f137810a == j1.CREDIT_CARD && d1Var.f137812c == it3.k.CC_BUILDER) ? CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c : null;
        return creditBuilderCardEntryPoint != null && ((jte.d) this.d).c(creditBuilderCardEntryPoint);
    }

    public final Flow f(d1 productClassification) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        int i = n.f308084a[b(productClassification).ordinal()];
        if (i == 1) {
            return nim.a.v(rd0.e.b(((cpj.b) this.f308093c).f107969a.b(false)), new l(productClassification, 0));
        }
        if (i == 2) {
            return zi0.c.i(Boolean.valueOf(c(productClassification)));
        }
        if (i == 3) {
            return zi0.c.i(Boolean.valueOf(e(productClassification)));
        }
        if (i == 4) {
            return new go.g(new Data(Boolean.TRUE, null, false, 6, null), 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object g(d1 d1Var, gim.c cVar) {
        int i = n.f308084a[b(d1Var).ordinal()];
        boolean zC = true;
        if (i == 1) {
            return d(d1Var, cVar);
        }
        if (i == 2) {
            zC = c(d1Var);
        } else if (i == 3) {
            zC = e(d1Var);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(zC);
    }

    public final boolean h(d1 productClassification) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        int i = n.f308084a[b(productClassification).ordinal()];
        if (i == 1) {
            yoj.c cVarB = tp3.b.b(productClassification);
            if (cVarB == null || !yoj.b.k(((cpj.b) this.f308093c).g(cVarB, yoj.d.DISABLED))) {
                return false;
            }
        } else {
            if (i == 2) {
                return c(productClassification);
            }
            if (i == 3) {
                return e(productClassification);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
