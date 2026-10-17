package h23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import j23.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements m {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f148645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.f f148646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k23.b f148647c;
    public final gte.a d;
    public final q89.e e;
    public final al4.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f23.m f148648g;

    public k(OrderNewCardTabControllerContract$InputData inputData, k23.f sharedDataSource, k23.b cardDesignsProvider, gte.a featureToggleInteractor, q89.e onboardingInteractor, al4.b comboCardInteractor, f23.m orderCoordinator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        Intrinsics.checkNotNullParameter(cardDesignsProvider, "cardDesignsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(orderCoordinator, "orderCoordinator");
        this.f148645a = inputData;
        this.f148646b = sharedDataSource;
        this.f148647c = cardDesignsProvider;
        this.d = featureToggleInteractor;
        this.e = onboardingInteractor;
        this.f = comboCardInteractor;
        this.f148648g = orderCoordinator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(e13.a r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof h23.h
            if (r0 == 0) goto L13
            r0 = r13
            h23.h r0 = (h23.h) r0
            int r1 = r0.f148640w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148640w = r1
            goto L18
        L13:
            h23.h r0 = new h23.h
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f148640w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L54
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            f23.b r4 = new f23.b
            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData r13 = r11.f148645a
            com.revolut.feature.card_order_new.api.CardOrderAccountWrapper r2 = r13.f65113c
            com.revolut.core.model.account.AccountId r5 = com.revolut.feature.card_order_new.api.a.a(r2)
            com.revolut.retail.core.navigation.NaviCommand r6 = r13.d
            pi3.h r7 = r13.f65116j
            java.lang.String r8 = r13.f
            zn3.a r9 = r13.e
            com.revolut.analytics.tracking.v3.AnalyticsProduct r10 = r13.k
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f148640w = r3
            f23.m r13 = r11.f148648g
            java.lang.Object r12 = r13.g3(r12, r4, r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            j23.f r12 = j23.f.f170665a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h23.k.a(e13.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(e13.a r12, h93.l0 r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof h23.i
            if (r0 == 0) goto L13
            r0 = r14
            h23.i r0 = (h23.i) r0
            int r1 = r0.f148641w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148641w = r1
            goto L18
        L13:
            h23.i r0 = new h23.i
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f148641w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L54
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r14)
            f23.b r4 = new f23.b
            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData r14 = r11.f148645a
            com.revolut.feature.card_order_new.api.CardOrderAccountWrapper r2 = r14.f65113c
            com.revolut.core.model.account.AccountId r5 = com.revolut.feature.card_order_new.api.a.a(r2)
            com.revolut.retail.core.navigation.NaviCommand r6 = r14.d
            pi3.h r7 = r14.f65116j
            java.lang.String r8 = r14.f
            zn3.a r9 = r14.e
            com.revolut.analytics.tracking.v3.AnalyticsProduct r10 = r14.k
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f148641w = r3
            f23.m r14 = r11.f148648g
            java.lang.Object r12 = r14.f3(r12, r13, r4, r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            j23.f r12 = j23.f.f170665a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h23.k.b(e13.a, h93.l0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb A[PHI: r1 r4 r5 r13 r14
      0x00eb: PHI (r1v6 boolean) = (r1v5 boolean), (r1v7 boolean) binds: [B:57:0x00e7, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r4v2 do3.n) = (r4v1 do3.n), (r4v4 do3.n) binds: [B:57:0x00e7, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r5v1 e13.a) = (r5v0 e13.a), (r5v2 e13.a) binds: [B:57:0x00e7, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r13v14 boolean) = (r13v12 boolean), (r13v20 boolean) binds: [B:57:0x00e7, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r14v19 java.lang.Object) = (r14v18 java.lang.Object), (r14v2 java.lang.Object) binds: [B:57:0x00e7, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    @Override // j23.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h23.k.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(m23.b r10, e13.a r11, boolean r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h23.k.d(m23.b, e13.a, boolean, gim.c):java.lang.Object");
    }
}
