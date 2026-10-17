package i4b;

import android.content.Context;
import au6.s1;
import au6.z0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import ggk.t0;
import ggk.u0;
import hha.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.a1;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements kfm.o, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f158330b;

    public f(a26.s function) {
        this.f158329a = 16;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f158330b = function;
    }

    public void a(Flow flow, Function1 consumer) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        com.revolut.kompot.navigable.a.g2((CfdOrderReviewScreen) this.f158330b, flow, null, new fi7.s(2, consumer, kotlin.jvm.internal.s.class, "suspendConversion0", "bind$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 3);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f158329a) {
            case 13:
                return ((cu8.u) this.f158330b).invoke(obj2);
            default:
                return ((a26.s) this.f158330b).invoke(obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r0 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f158330b
            g11.b r0 = (g11.b) r0
            boolean r1 = r7 instanceof d11.a
            if (r1 == 0) goto L17
            r1 = r7
            d11.a r1 = (d11.a) r1
            int r2 = r1.f110478w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f110478w = r2
            goto L1c
        L17:
            d11.a r1 = new d11.a
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f110478w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r7)
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)
            goto L4d
        L3a:
            yhm.o.b(r7)
            r1.f110478w = r5
            com.revolut.crypto.challenge.impl.service.ChallengeRewardsService r7 = r0.f139516c
            java.lang.Object r7 = r7.claim(r1)
            if (r7 != r2) goto L48
            goto L4a
        L48:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L4a:
            if (r7 != r2) goto L4d
            goto L5c
        L4d:
            r1.f110478w = r4
            x4l.c r7 = r0.e
            kotlin.Unit r0 = kotlin.Unit.f186387a
            java.lang.Object r7 = r7.d(r0, r5, r1)
            if (r7 != r2) goto L5a
            r0 = r7
        L5a:
            if (r0 != r2) goto L5d
        L5c:
            return r2
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4b.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(c02.j r19, java.lang.String r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4b.f.c(c02.j, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(c02.j r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof eu1.j
            if (r0 == 0) goto L13
            r0 = r7
            eu1.j r0 = (eu1.j) r0
            int r1 = r0.f129474w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129474w = r1
            goto L18
        L13:
            eu1.j r0 = new eu1.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129474w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r4.f158330b
            xt1.d r7 = (xt1.d) r7
            ufm.n r5 = r7.a(r5, r6)
            r0.f129474w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4b.f.d(c02.j, java.lang.String, gim.c):java.lang.Object");
    }

    public fd6.b e() {
        return new fd6.b((hd6.a) this.f158330b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof db9.a
            if (r0 == 0) goto L13
            r0 = r6
            db9.a r0 = (db9.a) r0
            int r1 = r0.f112683w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112683w = r1
            goto L18
        L13:
            db9.a r0 = new db9.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112683w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f158330b
            qb9.b r6 = (qb9.b) r6
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            x4l.c r6 = r6.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r6 = r6.b(r2, r4)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f112683w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            pd9.a r6 = (pd9.a) r6
            java.util.List r6 = r6.f235127c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4b.f.f(gim.c):java.lang.Object");
    }

    public Object g(u0 u0Var, gim.i iVar) {
        if (u0Var instanceof ggk.q0) {
            Object objL1 = ((wli.x) this.f158330b).L1(((ggk.q0) u0Var).f143772b, lg0.a.OPEN_BROWSER, Boolean.FALSE, iVar);
            return objL1 == fim.a.COROUTINE_SUSPENDED ? objL1 : Unit.f186387a;
        }
        if (!(u0Var instanceof ggk.p0) && !(u0Var instanceof ggk.r0) && !(u0Var instanceof ggk.s0) && !(u0Var instanceof t0)) {
            throw new NoWhenBranchMatchedException();
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PlanPageBenefitDescriptionClickHandler", "benefit description " + u0Var + " click is not supported", null, h0Var);
        return Unit.f186387a;
    }

    public ufm.i h(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f158330b;
        ArrayList arrayList = new ArrayList(zhm.w.t(linkedHashSet, 10));
        Iterator it8 = linkedHashSet.iterator();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (!it8.hasNext()) {
                ufm.i iVar = new ufm.i(new rfm.l(obj2, arrayList, 3), new z0(new ax9.a(0), 19), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            xo9.i iVar2 = (xo9.i) next;
            ufm.i iVar3 = new ufm.i(iVar2.b(code), new z0(new auj.o(iVar2, 14), 18), 1);
            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
            arrayList.add(ue0.e.D(iVar3, new abf.n(i, this, 3)));
            i = i2;
        }
    }

    public boolean i() {
        return ((jla.h) this.f158330b).d("CRYPTO_SPARE_CHANGE", null).a();
    }

    public vkm.y j(ld6.g gVar) {
        return rd0.e.e(nim.a.A(nim.a.v(((kd6.a) this.f158330b).a(), new e87.e(gVar, 19)), new ebi.i(16)), zhm.h0.f322473a, new a82.q(3, 15, null));
    }

    public vkm.d k(w0 tier) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        efm.r map = ((ffk.t) this.f158330b).n().map(new ch6.d(new cjk.h(tier, 0), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    public Object l(String str, gim.i iVar) {
        Object objD = ((y1e.b) this.f158330b).d.d(str, false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    public void m(Object obj2) {
        ((de.h) this.f158330b).set(obj2);
    }

    public void n(Exception exc2) {
        ((de.h) this.f158330b).setException(exc2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public /* synthetic */ void onSuccess(Object obj2) {
        ((fi0.a) this.f158330b).invoke(obj2);
    }

    public f(cu8.u function) {
        this.f158329a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f158330b = function;
    }

    public f(fi0.a function) {
        this.f158329a = 28;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f158330b = function;
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f158329a = i;
        this.f158330b = obj2;
    }

    public f(l7l.b cryptoRecipientDetailsNameValidator) {
        this.f158329a = 6;
        Intrinsics.checkNotNullParameter(cryptoRecipientDetailsNameValidator, "cryptoRecipientDetailsNameValidator");
        this.f158330b = cryptoRecipientDetailsNameValidator;
    }

    public f(ael.d0 stocksInteractor) {
        this.f158329a = 20;
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.f158330b = stocksInteractor;
    }

    public f(w4l.f portfolioMetricsDod) {
        this.f158329a = 21;
        Intrinsics.checkNotNullParameter(portfolioMetricsDod, "portfolioMetricsDod");
        this.f158330b = portfolioMetricsDod;
    }

    public f(yhl.d corporateEventsInteractor) {
        this.f158329a = 11;
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        this.f158330b = corporateEventsInteractor;
    }

    public f(s1 repository) {
        this.f158329a = 24;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f158330b = repository;
    }

    public f(cbk.c apmMapper) {
        this.f158329a = 9;
        Intrinsics.checkNotNullParameter(apmMapper, "apmMapper");
        this.f158330b = apmMapper;
    }

    public f(jla.h productCatalogueInteractor) {
        this.f158329a = 3;
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f158330b = productCatalogueInteractor;
    }

    public f(cq9.g inputData) {
        this.f158329a = 23;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f158330b = inputData;
    }

    public f(g11.b repository) {
        this.f158329a = 12;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f158330b = repository;
    }

    public f(hd6.a legalEntityConfiguration) {
        this.f158329a = 27;
        Intrinsics.checkNotNullParameter(legalEntityConfiguration, "legalEntityConfiguration");
        this.f158330b = legalEntityConfiguration;
    }

    public f(rg.a internal) {
        this.f158329a = 2;
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f158330b = internal;
    }

    public f(wli.x deeplinkHandler) {
        this.f158329a = 17;
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f158330b = deeplinkHandler;
    }

    public f(Context appContext) {
        this.f158329a = 8;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f158330b = appContext;
    }

    public f(qb9.b onboardingCountriesRepository) {
        this.f158329a = 14;
        Intrinsics.checkNotNullParameter(onboardingCountriesRepository, "onboardingCountriesRepository");
        this.f158330b = onboardingCountriesRepository;
    }

    public f(y1e.b repository) {
        this.f158329a = 5;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f158330b = repository;
    }

    public f(l4i.a amountConverter) {
        this.f158329a = 18;
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f158330b = amountConverter;
    }

    public f(prl.e repository) {
        this.f158329a = 1;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f158330b = repository;
    }

    public f(ImmutableSet qrCodeHandlers, rw9.a deeplinkQrHandler) {
        this.f158329a = 4;
        Intrinsics.checkNotNullParameter(qrCodeHandlers, "qrCodeHandlers");
        Intrinsics.checkNotNullParameter(deeplinkQrHandler, "deeplinkQrHandler");
        this.f158330b = a1.m(qrCodeHandlers, deeplinkQrHandler);
    }

    public f(c10.g visionInitialization) {
        this.f158329a = 7;
        Intrinsics.checkNotNullParameter(visionInitialization, "visionInitialization");
        this.f158330b = visionInitialization;
    }

    public f(ffk.t pricingPlanInteractor) {
        this.f158329a = 10;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f158330b = pricingPlanInteractor;
    }

    public f(z3e.c storiesInteractor) {
        this.f158329a = 26;
        Intrinsics.checkNotNullParameter(storiesInteractor, "storiesInteractor");
        this.f158330b = storiesInteractor;
    }

    public f(kd6.a legalEntityRegionProvider) {
        this.f158329a = 22;
        Intrinsics.checkNotNullParameter(legalEntityRegionProvider, "legalEntityRegionProvider");
        this.f158330b = legalEntityRegionProvider;
    }

    public f(xt1.d repository) {
        this.f158329a = 25;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f158330b = repository;
    }

    public f(ufm.g performanceInteractor) {
        this.f158329a = 19;
        Intrinsics.checkNotNullParameter(performanceInteractor, "performanceInteractor");
        this.f158330b = performanceInteractor;
    }
}
