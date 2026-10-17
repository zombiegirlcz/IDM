package ok5;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zm3.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f225898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f225899x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, l lVar, xi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f225898w = lVar;
        this.f225899x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f225898w, this.f225899x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r9 == r0) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            zm3.l r2 = r8.f225898w
            r3 = 2
            r4 = 1
            ok5.d r5 = r8.v
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r9)
            goto L5c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            goto L2c
        L20:
            yhm.o.b(r9)
            r8.u = r4
            java.io.Serializable r9 = ok5.d.e3(r5, r2, r8)
            if (r9 != r0) goto L2c
            goto L5b
        L2c:
            xi0.b r9 = (xi0.b) r9
            if (r9 != 0) goto L3b
            xi0.b r9 = r8.f225899x
            if (r9 != 0) goto L3b
            xi0.a r9 = xi0.b.Companion
            r9.getClass()
            xi0.b r9 = xi0.b.H
        L3b:
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData r1 = r5.f225902l
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint r1 = r1.d
            boolean r4 = r1 instanceof com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.Deposit
            if (r4 == 0) goto L70
            y8k.b r1 = r5.f225907r
            dj0.d r4 = new dj0.d
            r6 = 0
            r4.<init>(r6, r9)
            r9 = 0
            r6 = 8
            ufm.b r9 = q8k.g.a(r1, r2, r4, r9, r6)
            r8.u = r3
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L5c
        L5b:
            return r0
        L5c:
            com.revolut.retail.core.navigation.feature.FeatureConfig r9 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            kotlin.jvm.internal.Intrinsics.h(r9)
            r1.<init>(r9)
            r0.<init>(r1)
            aii.n r9 = r5.A2(r0)
            return r9
        L70:
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$DepositWidget r9 = com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.DepositWidget.f70939a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r1, r9)
            if (r9 != 0) goto L97
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$OrdersWidget r9 = com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.OrdersWidget.f70940a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r1, r9)
            if (r9 != 0) goto L97
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$TakeProfitStopLossBuy r9 = com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.TakeProfitStopLossBuy.f70942a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r1, r9)
            if (r9 != 0) goto L97
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$RecurringStrategy r9 = com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.RecurringStrategy.f70941a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r1, r9)
            if (r9 == 0) goto L91
            goto L97
        L91:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L97:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData r0 = r5.f225902l
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint r0 = r0.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Contacts page should not be visible for "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " entrypoint"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ok5.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
