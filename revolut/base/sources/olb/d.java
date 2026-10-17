package olb;

import akg.n;
import boh.f;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsOnboardingData;
import ffk.t;
import gcd.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import ncd.h;
import rd0.e;
import w4l.k;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements ijb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final icd.a f226368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f226369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.shared.savings.impl.core.error.c f226370c;

    public d(icd.a sharedSavingsProductInteractor, t pricingPlanInteractor, com.revolut.feature.shared.savings.impl.core.error.c savingsErrorInterceptor) {
        Intrinsics.checkNotNullParameter(sharedSavingsProductInteractor, "sharedSavingsProductInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(savingsErrorInterceptor, "savingsErrorInterceptor");
        this.f226368a = sharedSavingsProductInteractor;
        this.f226369b = pricingPlanInteractor;
        this.f226370c = savingsErrorInterceptor;
    }

    public final n g(List filterByGroupTypes, List filterByProductStates, h savingsProductAccountType, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(savingsProductAccountType, "savingsProductAccountType");
        Intrinsics.checkNotNullParameter(filterByGroupTypes, "filterByGroupTypes");
        Intrinsics.checkNotNullParameter(filterByProductStates, "filterByProductStates");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(j(filterByGroupTypes, filterByProductStates, savingsProductAccountType, loadingStrategy), new h0() { // from class: olb.a
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((SavingsOnboardingData) obj2).f86614a;
            }
        });
    }

    public final n h(List filterByGroupTypes, List filterByProductStates) {
        Intrinsics.checkNotNullParameter(filterByGroupTypes, "filterByGroupTypes");
        Intrinsics.checkNotNullParameter(filterByProductStates, "filterByProductStates");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(e.b(this.f226369b.q()), g(filterByGroupTypes, filterByProductStates, h.PERSONAL, loadingStrategy)), new okk.d(7));
    }

    public final n i(List filterByGroupTypes, List filterByProductStates, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filterByGroupTypes, "filterByGroupTypes");
        Intrinsics.checkNotNullParameter(filterByProductStates, "filterByProductStates");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(e.b(this.f226369b.n()), g(filterByGroupTypes, filterByProductStates, h.PERSONAL, loadingStrategy)), new okk.d(6));
    }

    public final Flow j(List list, List list2, h hVar, k kVar) {
        return f.e(e.b(this.f226369b.q()), new kwg.e(this, hVar, kVar, list, list2, 15));
    }

    public final Flow k(Set productIds, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = this.f226368a.f160245a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (productIds.isEmpty()) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        Set set = productIds;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(gVar.f.b((String) it8.next(), loadingStrategy));
        }
        return u0.k(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof olb.b
            if (r0 == 0) goto L13
            r0 = r7
            olb.b r0 = (olb.b) r0
            int r1 = r0.f226364w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226364w = r1
            goto L18
        L13:
            olb.b r0 = new olb.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226364w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L5a
        L27:
            r6 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            icd.a r7 = r5.f226368a     // Catch: java.lang.Throwable -> L27
            r0.f226364w = r3     // Catch: java.lang.Throwable -> L27
            gcd.g r7 = r7.f160245a     // Catch: java.lang.Throwable -> L27
            r7.getClass()     // Catch: java.lang.Throwable -> L27
            ga9.v r2 = new ga9.v     // Catch: java.lang.Throwable -> L27
            r3 = 13
            r4 = 0
            r2.<init>(r7, r6, r4, r3)     // Catch: java.lang.Throwable -> L27
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L27
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L50
            goto L52
        L50:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
        L52:
            if (r6 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
        L57:
            if (r6 != r1) goto L5a
            return r1
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5d:
            com.revolut.feature.shared.savings.impl.core.error.c r7 = r5.f226370c
            java.lang.Throwable r6 = r7.b(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: olb.d.l(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(ncd.h r8, boolean r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof olb.c
            if (r0 == 0) goto L13
            r0 = r10
            olb.c r0 = (olb.c) r0
            int r1 = r0.f226367y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226367y = r1
            goto L18
        L13:
            olb.c r0 = new olb.c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f226365w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226367y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            goto L8a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            boolean r9 = r0.v
            ncd.h r8 = r0.u
            yhm.o.b(r10)
            goto L64
        L3b:
            yhm.o.b(r10)
            ffk.t r10 = r7.f226369b
            efm.r r10 = r10.q()
            ol6.b r2 = new ol6.b
            r6 = 1
            r2.<init>(r6)
            efm.r r10 = m70.a.g(r10, r5, r2, r4)
            efm.d0 r10 = r10.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            r0.u = r8
            r0.v = r9
            r0.f226367y = r4
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L64
            goto L89
        L64:
            hha.d r10 = (hha.d) r10
            java.lang.String r10 = r10.f152287a
            r0.u = r5
            r0.v = r9
            r0.f226367y = r3
            icd.a r2 = r7.f226368a
            gcd.g r2 = r2.f160245a
            x4l.c r2 = r2.e
            gcd.d r3 = new gcd.d
            r3.<init>(r10, r8)
            java.lang.Object r8 = r2.d(r3, r9, r0)
            if (r8 != r1) goto L80
            goto L82
        L80:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L82:
            if (r8 != r1) goto L85
            goto L87
        L85:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L87:
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: olb.d.m(ncd.h, boolean, gim.c):java.lang.Object");
    }
}
