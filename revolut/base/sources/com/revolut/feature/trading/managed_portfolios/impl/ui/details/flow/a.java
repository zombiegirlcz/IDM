package com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowControllerContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s6f.b;
import zhm.f0;
import zjh.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final ManagedPortfoliosDetailsFlowControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f91316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f91317q;

    public a(ManagedPortfoliosDetailsFlowControllerContract$InputData inputData, f portfolioInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.o = inputData;
        this.f91316p = portfolioInteractor;
        s42.f fVar = new s42.f(this, 9);
        this.f91317q = d.a(this, ManagedPortfoliosDetailsFlowControllerContract$Step.PortfoliosDetails.f91313a, f0.f322471a, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof s6f.g
            if (r0 == 0) goto L13
            r0 = r7
            s6f.g r0 = (s6f.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            s6f.g r0 = new s6f.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f260342x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r5 = r0.f260341w
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId$Portfolio r6 = r0.v
            com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a r0 = r0.u
            yhm.o.b(r7)
            r2 = r5
            r5 = r0
            goto L5a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r7)
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId$Portfolio r7 = new com.revolut.feature.wealth.models.addmoney.TransferSubjectId$Portfolio
            r7.<init>(r6)
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r2 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.ROBO
            r0.u = r5
            r0.v = r7
            r0.f260341w = r2
            r0.z = r3
            xi0.a r3 = xi0.b.Companion
            r3.getClass()
            xi0.b r3 = xi0.b.i
            java.lang.Object r6 = r5.J2(r6, r3, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r4 = r7
            r7 = r6
            r6 = r4
        L5a:
            xi0.b r7 = (xi0.b) r7
            com.revolut.feature.wealth.api.declaration.WithdrawFeatureConfig$Destination r0 = new com.revolut.feature.wealth.api.declaration.WithdrawFeatureConfig$Destination
            r0.<init>(r6, r2, r7)
            r5.C1(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a.I2(com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.String r6, xi0.b r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof s6f.c
            if (r0 == 0) goto L13
            r0 = r8
            s6f.c r0 = (s6f.c) r0
            int r1 = r0.f260338w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260338w = r1
            goto L18
        L13:
            s6f.c r0 = new s6f.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260338w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            zjh.f r8 = r5.f91316p
            w4l.h r2 = w4l.h.f294642c
            efm.r r8 = r8.B(r6, r2)
            s6f.d r2 = new kotlin.jvm.internal.h0() { // from class: s6f.d
                static {
                    /*
                        s6f.d r0 = new s6f.d
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:s6f.d) s6f.d.f s6f.d
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: s6f.d.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.String r0 = "getBaseCurrency()Lcom/revolut/core/model/currency/Currency;"
                        r1 = 0
                        java.lang.Class<alc.n> r2 = alc.n.class
                        java.lang.String r3 = "baseCurrency"
                        r4.<init>(r2, r3, r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: s6f.d.<init>():void");
                }

                @Override // kotlin.jvm.internal.h0, wim.p
                public final java.lang.Object get(java.lang.Object r1) {
                    /*
                        r0 = this;
                        alc.n r1 = (alc.n) r1
                        xi0.b r1 = r1.i
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: s6f.d.get(java.lang.Object):java.lang.Object");
                }
            }
            efm.r r8 = nim.a.w(r8, r2)
            emc.a r2 = new emc.a
            r4 = 1
            r2.<init>(r6, r7, r4)
            r6 = 0
            r7 = 2
            efm.r r6 = m70.a.g(r8, r2, r6, r7)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f260338w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a.J2(java.lang.String, xi0.b, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91317q;
    }
}
