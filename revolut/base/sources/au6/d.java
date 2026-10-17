package au6;

import com.revolut.feature.freelancer.common.models.FreelancerAccountClosure;
import com.revolut.feature.freelancer.common.models.FreelancerAccountClosureState;
import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.freelancer.common.models.FreelancerSettings;
import com.revolut.feature.freelancer.common.models.MerchantDisabledFeature;
import com.revolut.feature.freelancer.common.models.MerchantFeatureEnableStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function3 {
    public /* synthetic */ FreelancerAccountOnboardingState u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(3, continuation);
        this.v = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.v, (Continuation) obj4);
        dVar.u = (FreelancerAccountOnboardingState) obj3;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r162;
        ?? r172;
        com.revolut.feature.freelancer.impl.network.models.p0 p0Var;
        com.revolut.feature.freelancer.impl.network.models.p pVar;
        ?? r173;
        com.revolut.feature.freelancer.impl.network.models.m mVar;
        ?? r174;
        f fVar = this.v;
        ue0.c cVar = fVar.f9525c;
        FreelancerAccountOnboardingState freelancerAccountOnboardingState = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded;
        Class cls = Boolean.TYPE;
        if (z) {
            ft6.b bVar = fVar.e;
            FreelancerAccountDetails domain = ((FreelancerAccountOnboardingState.Onboarded) freelancerAccountOnboardingState).f73273a;
            ?? r4 = bVar.d;
            ?? r87 = bVar.f;
            Intrinsics.checkNotNullParameter(domain, "domain");
            FreelancerSettings domain2 = domain.f73269a;
            Intrinsics.checkNotNullParameter(domain2, "domain");
            com.revolut.feature.freelancer.impl.network.models.p0 p0Var2 = new com.revolut.feature.freelancer.impl.network.models.p0(domain2.f73331a, domain2.f73332b);
            FreelancerPermissions domain3 = domain.f73270b;
            Intrinsics.checkNotNullParameter(domain3, "domain");
            boolean z3 = domain3.f73321a;
            boolean z4 = domain3.f73322b;
            boolean z6 = domain3.f73323c;
            lr6.e0 e0Var = domain3.d;
            com.revolut.feature.freelancer.impl.network.models.a aVar2 = null;
            com.revolut.feature.freelancer.impl.network.models.j0 j0Var = new com.revolut.feature.freelancer.impl.network.models.j0(e0Var != null ? le.u1.h(e0Var, r87) : null, z3, z4, z6, domain3.e);
            List list = domain.f73271c;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                String strH = le.u1.h((lr6.a0) it8.next(), bVar.f137939b);
                if (strH != null) {
                    arrayList.add(strH);
                }
            }
            List list2 = domain.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                String strH2 = le.u1.h((lr6.b0) it9.next(), r4);
                if (strH2 != null) {
                    arrayList2.add(strH2);
                }
            }
            List list3 = domain.e;
            ArrayList arrayList3 = new ArrayList();
            Iterator it10 = list3.iterator();
            ?? r42 = r4;
            ?? r810 = r87;
            while (it10.hasNext()) {
                MerchantDisabledFeature domain4 = (MerchantDisabledFeature) it10.next();
                Intrinsics.checkNotNullParameter(domain4, "domain");
                Iterator it11 = it10;
                String strH3 = le.u1.h(domain4.f73335a, r42);
                if (strH3 == null) {
                    r162 = r42;
                    r174 = r810;
                    p0Var = p0Var2;
                    mVar = null;
                } else {
                    r162 = r42;
                    lr6.e0 e0Var2 = domain4.f73336b;
                    String strH4 = e0Var2 != null ? le.u1.h(e0Var2, r810) : null;
                    MerchantFeatureEnableStep domain5 = domain4.f73337c;
                    if (domain5 != null) {
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        ?? r175 = r810;
                        if (domain5 instanceof MerchantFeatureEnableStep.Action) {
                            String strA = ft6.a.ACTION.a();
                            p0Var = p0Var2;
                            String strH5 = le.u1.h(((MerchantFeatureEnableStep.Action) domain5).f73338a, bVar.f137940c);
                            r172 = r175;
                            if (strH5 != null) {
                                pVar = new com.revolut.feature.freelancer.impl.network.models.p(strA, strH5);
                                r173 = r175;
                            }
                        } else {
                            p0Var = p0Var2;
                            if (!(domain5 instanceof MerchantFeatureEnableStep.DeepLink)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pVar = new com.revolut.feature.freelancer.impl.network.models.p(ft6.a.DEEP_LINK.a(), ((MerchantFeatureEnableStep.DeepLink) domain5).f73339a.f173629c);
                            r173 = r175;
                        }
                        mVar = new com.revolut.feature.freelancer.impl.network.models.m(strH3, strH4, pVar);
                        r174 = r173;
                    } else {
                        r172 = r810;
                        p0Var = p0Var2;
                    }
                    pVar = null;
                    r173 = r172;
                    mVar = new com.revolut.feature.freelancer.impl.network.models.m(strH3, strH4, pVar);
                    r174 = r173;
                }
                if (mVar != null) {
                    arrayList3.add(mVar);
                }
                it10 = it11;
                r42 = r162;
                r810 = r174;
                p0Var2 = p0Var;
            }
            com.revolut.feature.freelancer.impl.network.models.p0 p0Var3 = p0Var2;
            FreelancerAccountClosure domain6 = domain.f;
            Intrinsics.checkNotNullParameter(domain6, "domain");
            FreelancerAccountClosureState freelancerAccountClosureState = domain6.f73265a;
            if (Intrinsics.f(freelancerAccountClosureState, FreelancerAccountClosureState.Closed.Manually.f73266a)) {
                aVar2 = new com.revolut.feature.freelancer.impl.network.models.a();
            } else if (!Intrinsics.f(freelancerAccountClosureState, FreelancerAccountClosureState.Closed.Unknown.f73267a) && !Intrinsics.f(freelancerAccountClosureState, FreelancerAccountClosureState.NotClosed.f73268a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.G(new com.revolut.feature.freelancer.impl.network.models.b(p0Var3, j0Var, arrayList, arrayList2, arrayList3, aVar2), "KEY_VALID_PRO_ACCOUNT_DETAILS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.b.class)));
            cVar.G(Boolean.TRUE, "STORAGE_KEY_IS_MERCHANT_ONBOARDED", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
            cVar.I0("STORAGE_CACHE_KEY_MERCHANT_PENDING_REASON");
        } else if (freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.NotOnboarded) {
            cVar.G(Boolean.FALSE, "STORAGE_KEY_IS_MERCHANT_ONBOARDED", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
            cVar.I0("STORAGE_CACHE_KEY_MERCHANT_PENDING_REASON");
        } else {
            if (!(freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Pending)) {
                throw new NoWhenBranchMatchedException();
            }
            com.revolut.data.database.models.openbanking.d.D(cls, cVar, "STORAGE_KEY_IS_MERCHANT_ONBOARDED", Boolean.FALSE);
            cVar.G(((FreelancerAccountOnboardingState.Pending) freelancerAccountOnboardingState).f73274a, "STORAGE_CACHE_KEY_MERCHANT_PENDING_REASON", wim.z.d(kotlin.jvm.internal.o0.b(lr6.u.class)));
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
