package bkf;

import akf.t1;
import akf.u1;
import akf.v1;
import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends n implements s0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f16407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f16408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f16409n;
    public final gte.a o;

    public h(h0 commonDataSource, m1 juniorDataSource, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        i customCryptoCommodityExchangeActionsProvider = i.f224256b;
        Intrinsics.checkNotNullParameter(customCryptoCommodityExchangeActionsProvider, "customCryptoCommodityExchangeActionsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f16407l = commonDataSource;
        this.f16408m = juniorDataSource;
        this.f16409n = customCryptoCommodityExchangeActionsProvider;
        this.o = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bkf.e
            if (r0 == 0) goto L13
            r0 = r5
            bkf.e r0 = (bkf.e) r0
            int r1 = r0.f16403w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16403w = r1
            goto L18
        L13:
            bkf.e r0 = new bkf.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16403w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wd6.h r5 = wd6.h.MARKET
            r0.f16403w = r3
            java.lang.Object r5 = r4.b3(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.h.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(wd6.h r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof bkf.f
            if (r2 == 0) goto L17
            r2 = r1
            bkf.f r2 = (bkf.f) r2
            int r3 = r2.f16405x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f16405x = r3
            goto L1c
        L17:
            bkf.f r2 = new bkf.f
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f16405x
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            wd6.h r2 = r2.u
            yhm.o.b(r1)
            r9 = r2
            goto L4d
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r1)
            klf.h0 r1 = r0.f16407l
            kotlinx.coroutines.flow.SharedFlow r1 = r1.d()
            r4 = r17
            r2.u = r4
            r2.f16405x = r5
            java.lang.Object r1 = vkm.q.x(r1, r2)
            if (r1 != r3) goto L4c
            return r3
        L4c:
            r9 = r4
        L4d:
            tof.a3 r1 = (tof.a3) r1
            tof.p0 r2 = r1.z
            tof.p0 r3 = tof.p0.BUY
            r4 = 0
            if (r2 != r3) goto L5c
            dj0.d r1 = r1.k
            xi0.b r1 = r1.f115083b
        L5a:
            r8 = r1
            goto L68
        L5c:
            tof.o3 r1 = r1.J
            if (r1 == 0) goto L67
            dj0.d r1 = r1.f272965a
            if (r1 == 0) goto L67
            xi0.b r1 = r1.f115083b
            goto L5a
        L67:
            r8 = r4
        L68:
            if (r8 != 0) goto L6d
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L6d:
            com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles$MoveMoneyExchangeEntryPointsMoved r1 = com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c
            gte.a r2 = r0.o
            jte.d r2 = (jte.d) r2
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L95
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r1 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r2 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney r3 = new com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$CurrencyAccount r5 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$CurrencyAccount
            r5.<init>(r8)
            com.revolut.shared.feature.move_money.api.navigation.a r6 = com.revolut.shared.feature.move_money.api.navigation.a.TARGET
            r7 = 4
            r3.<init>(r5, r6, r7)
            r5 = 6
            r2.<init>(r3, r4, r5)
            r1.<init>(r2, r4)
            r0.A2(r1)
            goto Lb2
        L95:
            wd6.h r1 = wd6.h.RECURRING
            if (r9 != r1) goto L9b
        L99:
            r13 = r5
            goto L9d
        L9b:
            r5 = 0
            goto L99
        L9d:
            wd6.c r10 = wd6.c.CRYPTO_ONLY
            com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig$Buy r6 = new com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig$Buy
            r14 = 0
            r15 = 3553(0xde1, float:4.979E-42)
            r7 = 0
            com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior$Default r11 = com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior.Default.f96860a
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.c(r6)
            r0.A2(r1)
        Lb2:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.h.b3(wd6.h, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (this.f16409n.g() == null) {
            return a10.b.B(v1.Companion, t1.BUY_AGAIN, str) ? Z2((gim.c) continuation) : Intrinsics.f(str, u1.a(t1.SET_RECURRING_BUY)) ? c3((gim.c) continuation) : Boolean.FALSE;
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bkf.g
            if (r0 == 0) goto L13
            r0 = r5
            bkf.g r0 = (bkf.g) r0
            int r1 = r0.f16406w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16406w = r1
            goto L18
        L13:
            bkf.g r0 = new bkf.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16406w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wd6.h r5 = wd6.h.RECURRING
            r0.f16406w = r3
            java.lang.Object r5 = r4.b3(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.h.c3(gim.c):java.lang.Object");
    }
}
