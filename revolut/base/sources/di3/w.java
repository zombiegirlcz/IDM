package di3;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.PreorderCardResult;
import com.revolut.feature.checkout.models.PreorderPlanAndCardResult;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import com.revolut.feature.checkout.models.PreorderResult;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import h93.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q89.e f114908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh3.b f114909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f114910c;
    public final mt8.d d;
    public final bd3.a e;
    public final xoj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fk3.a f114911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ffk.t f114912h;
    public final hy2.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z43.a f114913j;
    public final vx2.c k;

    public w(q89.e onboardingInteractor, rh3.b routeProvider, sf0.h serverErrorParser, mt8.d kycInteractor, bd3.a cashbackInteractor, xoj.a featuresInteractor, fk3.a configurationInteractor, ffk.t pricingPlanInteractor, hy2.f cardDesignInteractor, z43.a cardPersonalisationInteractor, vx2.c juniorCardRequestHandler) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(routeProvider, "routeProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(cardPersonalisationInteractor, "cardPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestHandler, "juniorCardRequestHandler");
        this.f114908a = onboardingInteractor;
        this.f114909b = routeProvider;
        this.f114910c = serverErrorParser;
        this.d = kycInteractor;
        this.e = cashbackInteractor;
        this.f = featuresInteractor;
        this.f114911g = configurationInteractor;
        this.f114912h = pricingPlanInteractor;
        this.i = cardDesignInteractor;
        this.f114913j = cardPersonalisationInteractor;
        this.k = juniorCardRequestHandler;
    }

    public static f0 a(PreorderResult preorderResult) {
        if (preorderResult instanceof PreorderCardResult.CardIssued) {
            return ((PreorderCardResult.CardIssued) preorderResult).f65854a;
        }
        if (preorderResult instanceof PreorderCardResult.Preordered) {
            return ((PreorderCardResult.Preordered) preorderResult).f65858b;
        }
        if (preorderResult instanceof PreorderPlanAndCardResult.PlanPreorderedCardIssued) {
            return ((PreorderPlanAndCardResult.PlanPreorderedCardIssued) preorderResult).f65864b.f65854a;
        }
        if (preorderResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardIssued) {
            return ((PreorderPlanAndCardResult.PlanSubscribedCardIssued) preorderResult).f65868b.f65854a;
        }
        if (preorderResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardPreorder) {
            return ((PreorderPlanAndCardResult.PlanSubscribedCardPreorder) preorderResult).f65870b.f65858b;
        }
        if (preorderResult instanceof PreorderPlanAndCardResult.Preordered) {
            return ((PreorderPlanAndCardResult.Preordered) preorderResult).f65872b.f65858b;
        }
        if ((preorderResult instanceof PreorderCardResult.Error) || (preorderResult instanceof PreorderPlanAndCardResult.PlanPreorderedCardError) || (preorderResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardError) || (preorderResult instanceof PreorderPlanAndCardResult.PlanError) || (preorderResult instanceof PreorderPlanResult.Error) || (preorderResult instanceof PreorderPlanResult.Preordered) || (preorderResult instanceof PreorderPlanResult.Subscribed)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final n b(PreorderPlanAndCardResult preorderPlanAndCardResult, boolean z) {
        boolean z3 = preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.Preordered;
        rh3.b bVar = this.f114909b;
        if (z3) {
            return new l(((gi3.c) bVar).e(preorderPlanAndCardResult, z));
        }
        if (!(preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanError) && !(preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardError)) {
            if (preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardPreorder) {
                return new l(((gi3.c) bVar).e(preorderPlanAndCardResult, z));
            }
            if (preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardIssued) {
                f0 f0Var = ((PreorderPlanAndCardResult.PlanSubscribedCardIssued) preorderPlanAndCardResult).f65868b.f65854a;
                return new l(f0Var.f150112c ? ((gi3.c) bVar).d(preorderPlanAndCardResult) : ((gi3.c) bVar).b(f0Var, preorderPlanAndCardResult));
            }
            if (preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanPreorderedCardError) {
                return new l(((gi3.c) bVar).c());
            }
            if (preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanPreorderedCardIssued) {
                return new m(((vh3.c) ((gi3.c) bVar).f144076b).a());
            }
            throw new NoWhenBranchMatchedException();
        }
        return new l(((gi3.c) bVar).c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h93.f0 r9, java.lang.String r10, com.revolut.core.model.account.AccountId r11, com.revolut.analytics.tracking.v3.AnalyticsProduct r12, com.revolut.retail.core.navigation.NaviCommand r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.c(h93.f0, java.lang.String, com.revolut.core.model.account.AccountId, com.revolut.analytics.tracking.v3.AnalyticsProduct, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    public final l d(PreorderCardResult preorderCardResult, boolean z) {
        StatusViewConfiguration statusViewConfigurationC;
        boolean z3 = preorderCardResult instanceof PreorderCardResult.Preordered;
        rh3.b bVar = this.f114909b;
        if (z3) {
            statusViewConfigurationC = ((gi3.c) bVar).e(preorderCardResult, z);
        } else if (preorderCardResult instanceof PreorderCardResult.CardIssued) {
            f0 f0Var = ((PreorderCardResult.CardIssued) preorderCardResult).f65854a;
            statusViewConfigurationC = f0Var.f150112c ? ((gi3.c) bVar).d(preorderCardResult) : ((gi3.c) bVar).b(f0Var, preorderCardResult);
        } else {
            if (!(preorderCardResult instanceof PreorderCardResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            statusViewConfigurationC = ((gi3.c) bVar).c();
        }
        return new l(statusViewConfigurationC);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[PHI: r9 r10 r11 r12
      0x0090: PHI (r9v4 com.revolut.feature.checkout.models.PreorderResult) = 
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v2 com.revolut.feature.checkout.models.PreorderResult)
      (r9v27 com.revolut.feature.checkout.models.PreorderResult)
     binds: [B:73:0x013c, B:70:0x0126, B:61:0x00eb, B:63:0x0106, B:58:0x00e5, B:49:0x00bc, B:39:0x008c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r10v1 com.revolut.core.model.account.AccountId) = 
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v0 com.revolut.core.model.account.AccountId)
      (r10v19 com.revolut.core.model.account.AccountId)
     binds: [B:73:0x013c, B:70:0x0126, B:61:0x00eb, B:63:0x0106, B:58:0x00e5, B:49:0x00bc, B:39:0x008c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r11v1 com.revolut.analytics.tracking.v3.AnalyticsProduct) = 
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v0 com.revolut.analytics.tracking.v3.AnalyticsProduct)
      (r11v9 com.revolut.analytics.tracking.v3.AnalyticsProduct)
     binds: [B:73:0x013c, B:70:0x0126, B:61:0x00eb, B:63:0x0106, B:58:0x00e5, B:49:0x00bc, B:39:0x008c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r12v1 com.revolut.retail.core.navigation.NaviCommand) = 
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v0 com.revolut.retail.core.navigation.NaviCommand)
      (r12v2 com.revolut.retail.core.navigation.NaviCommand)
     binds: [B:73:0x013c, B:70:0x0126, B:61:0x00eb, B:63:0x0106, B:58:0x00e5, B:49:0x00bc, B:39:0x008c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.os.Parcelable r9, com.revolut.core.model.account.AccountId r10, com.revolut.analytics.tracking.v3.AnalyticsProduct r11, com.revolut.retail.core.navigation.NaviCommand r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.e(android.os.Parcelable, com.revolut.core.model.account.AccountId, com.revolut.analytics.tracking.v3.AnalyticsProduct, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    public final Object f(PreorderResult preorderResult, AccountId accountId, boolean z, gim.i iVar) {
        StatusViewConfiguration statusViewConfigurationC;
        boolean z3 = preorderResult instanceof PreorderPlanAndCardResult;
        sf0.h hVar = this.f114910c;
        rh3.b bVar = this.f114909b;
        q89.e eVar = this.f114908a;
        if (z3) {
            PreorderPlanAndCardResult preorderPlanAndCardResult = (PreorderPlanAndCardResult) preorderResult;
            boolean zC = ((db9.d) eVar).c();
            if (zC && (preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardIssued)) {
                return b(preorderPlanAndCardResult, z);
            }
            if (!zC || !(preorderPlanAndCardResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardError)) {
                return b(preorderPlanAndCardResult, z);
            }
            ServerError serverErrorA = hVar.a(((PreorderPlanAndCardResult.PlanSubscribedCardError) preorderPlanAndCardResult).f65866b.f65856a);
            return serverErrorA == null ? new l(((gi3.c) bVar).c()) : g(serverErrorA, accountId, iVar);
        }
        if (preorderResult instanceof PreorderCardResult) {
            PreorderCardResult preorderCardResult = (PreorderCardResult) preorderResult;
            boolean zC2 = ((db9.d) eVar).c();
            if (zC2 && (preorderCardResult instanceof PreorderCardResult.CardIssued)) {
                return d(preorderCardResult, z);
            }
            if (!zC2 || !(preorderCardResult instanceof PreorderCardResult.Error)) {
                return d(preorderCardResult, z);
            }
            ServerError serverErrorA2 = hVar.a(((PreorderCardResult.Error) preorderCardResult).f65856a);
            return serverErrorA2 == null ? new l(((gi3.c) bVar).c()) : g(serverErrorA2, accountId, iVar);
        }
        if (!(preorderResult instanceof PreorderPlanResult)) {
            throw new NoWhenBranchMatchedException();
        }
        PreorderPlanResult preorderPlanResult = (PreorderPlanResult) preorderResult;
        if (preorderPlanResult instanceof PreorderPlanResult.Preordered) {
            statusViewConfigurationC = ((gi3.c) bVar).e(preorderPlanResult, false);
        } else if (preorderPlanResult instanceof PreorderPlanResult.Subscribed) {
            statusViewConfigurationC = ((gi3.c) bVar).d(preorderPlanResult);
        } else {
            if (!(preorderPlanResult instanceof PreorderPlanResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            statusViewConfigurationC = ((gi3.c) bVar).c();
        }
        return new l(statusViewConfigurationC);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.error.data.model.ServerError r22, com.revolut.core.model.account.AccountId r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.g(com.revolut.core.error.data.model.ServerError, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (j(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof di3.r
            if (r0 == 0) goto L13
            r0 = r8
            di3.r r0 = (di3.r) r0
            int r1 = r0.f114901w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114901w = r1
            goto L18
        L13:
            di3.r r0 = new di3.r
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114901w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            goto L42
        L36:
            yhm.o.b(r8)
            r0.f114901w = r4
            java.lang.Object r6 = r5.i(r6, r7, r0)
            if (r6 != r1) goto L42
            goto L4a
        L42:
            r0.f114901w = r3
            java.lang.Object r6 = r5.j(r0)
            if (r6 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.h(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (skm.e0.o(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r6.k.b(r7, r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof di3.s
            if (r0 == 0) goto L13
            r0 = r9
            di3.s r0 = (di3.s) r0
            int r1 = r0.f114904y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114904y = r1
            goto L18
        L13:
            di3.s r0 = new di3.s
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f114902w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114904y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L71
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.String r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            goto L5e
        L3b:
            r9 = move-exception
            goto L55
        L3d:
            r7 = move-exception
            goto L77
        L3f:
            yhm.o.b(r9)
            di3.u r9 = new di3.u     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            r2 = 0
            r9.<init>(r6, r5, r2)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            r0.u = r7     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            r0.v = r8     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            r0.f114904y = r4     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            java.lang.Object r9 = skm.e0.o(r9, r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L3d
            if (r9 != r1) goto L5e
            goto L70
        L55:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r5, r5, r9, r2)
        L5e:
            if (r7 == 0) goto L74
            if (r8 == 0) goto L74
            r0.u = r5
            r0.v = r5
            r0.f114904y = r3
            vx2.c r9 = r6.k
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L74:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L77:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.i(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof di3.v
            if (r0 == 0) goto L13
            r0 = r6
            di3.v r0 = (di3.v) r0
            int r1 = r0.f114907w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114907w = r1
            goto L18
        L13:
            di3.v r0 = new di3.v
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114907w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L4e
        L28:
            r6 = move-exception
            goto L45
        L2a:
            r6 = move-exception
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            di3.u r6 = new di3.u     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r6.<init>(r5, r3, r4)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f114907w = r4     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r6 = skm.e0.o(r6, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 != r1) goto L4e
            return r1
        L45:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r6, r0)
        L4e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.w.j(gim.c):java.lang.Object");
    }
}
