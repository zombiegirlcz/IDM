package jzh;

import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.common.StatusDialogViewPayload;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.exchange.MarketOrderExchangeContract$ExchangeResultPayload;
import com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qzh.a f179832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rzh.c f179833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yzh.a f179834c;
    public final szh.a d;
    public final zzh.a e;
    public final k7i.i f;

    public k(qzh.a marketOrderExchangeModelExtension, rzh.c fxOrderModelExtension, yzh.a recurringBuyExtension, szh.a savingsExchangeExtension, zzh.a tpslOrderModelExtension, k7i.i firmPriceDevianceChecker) {
        Intrinsics.checkNotNullParameter(marketOrderExchangeModelExtension, "marketOrderExchangeModelExtension");
        Intrinsics.checkNotNullParameter(fxOrderModelExtension, "fxOrderModelExtension");
        Intrinsics.checkNotNullParameter(recurringBuyExtension, "recurringBuyExtension");
        Intrinsics.checkNotNullParameter(savingsExchangeExtension, "savingsExchangeExtension");
        Intrinsics.checkNotNullParameter(tpslOrderModelExtension, "tpslOrderModelExtension");
        Intrinsics.checkNotNullParameter(firmPriceDevianceChecker, "firmPriceDevianceChecker");
        this.f179832a = marketOrderExchangeModelExtension;
        this.f179833b = fxOrderModelExtension;
        this.f179834c = recurringBuyExtension;
        this.d = savingsExchangeExtension;
        this.e = tpslOrderModelExtension;
        this.f = firmPriceDevianceChecker;
    }

    public static d0 a(nii.h hVar) {
        nii.g gVar = hVar instanceof nii.g ? (nii.g) hVar : null;
        if (gVar != null) {
            d0 d0VarH = h(gVar.f216153b);
            if (d0VarH != null) {
                return d0VarH;
            }
            ExchangeResult exchangeResult = ((MarketOrderExchangeContract$ExchangeResultPayload) gVar.f216152a).f96789a;
            ExchangeResult.Success success = exchangeResult instanceof ExchangeResult.Success ? (ExchangeResult.Success) exchangeResult : null;
            if (success != null) {
                String str = success.f72156g;
                String str2 = success.i;
                if (str2 == null) {
                    str2 = success.f72157h;
                }
                return new w(str, str2, success.f72158j);
            }
        }
        return null;
    }

    public static d0 h(n1 n1Var) {
        StakingAvailability stakingAvailability;
        if (n1Var instanceof l1) {
            Parcelable parcelableA = ((l1) n1Var).f216190a.a();
            StatusDialogViewPayload statusDialogViewPayload = parcelableA instanceof StatusDialogViewPayload ? (StatusDialogViewPayload) parcelableA : null;
            String str = statusDialogViewPayload != null ? statusDialogViewPayload.f96786a : null;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -206899188) {
                    if (iHashCode != -186643696) {
                        if (iHashCode == 786161841 && str.equals("ID_BUTTON_STAKE")) {
                            ExchangeStakingData exchangeStakingData = statusDialogViewPayload.f96787b;
                            StakingProduct stakingProduct = (exchangeStakingData == null || (stakingAvailability = exchangeStakingData.f96800b) == null) ? null : stakingAvailability.f88058a;
                            if (stakingProduct != null) {
                                return new y(stakingProduct.d, exchangeStakingData.f96799a, stakingProduct, exchangeStakingData.f96800b.f88059b);
                            }
                        }
                    } else if (str.equals("ID_BUTTON_SET_CRYPTO_SPARE_CHANGE")) {
                        xi0.b bVar = statusDialogViewPayload.d;
                        xi0.b bVar2 = statusDialogViewPayload.f96788c;
                        if (!cp5.d.z(bVar)) {
                            bVar = cp5.d.z(bVar2) ? bVar2 : null;
                        }
                        if (bVar != null) {
                            return new v(bVar);
                        }
                    }
                } else if (str.equals("ID_BUTTON_SET_CRYPTO_RECURRING_BUY")) {
                    xi0.b bVar3 = statusDialogViewPayload.d;
                    xi0.b bVar4 = cp5.d.z(bVar3) ? bVar3 : null;
                    if (bVar4 == null) {
                        bVar4 = statusDialogViewPayload.f96788c;
                    }
                    return new x(bVar4);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jzh.e
            if (r0 == 0) goto L13
            r0 = r6
            jzh.e r0 = (jzh.e) r0
            int r1 = r0.f179818w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179818w = r1
            goto L18
        L13:
            jzh.e r0 = new jzh.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179818w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f179818w = r3
            yzh.a r6 = r4.f179834c
            java.lang.Object r6 = r6.Z2(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            nii.h r6 = (nii.h) r6
            boolean r5 = r6 instanceof nii.g
            r0 = 0
            if (r5 == 0) goto L47
            nii.g r6 = (nii.g) r6
            goto L48
        L47:
            r6 = r0
        L48:
            if (r6 == 0) goto L54
            jzh.z r5 = new jzh.z
            java.lang.Object r6 = r6.f216152a
            qua.p r6 = (qua.p) r6
            r5.<init>(r6)
            return r5
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.k.b(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jzh.f
            if (r0 == 0) goto L13
            r0 = r6
            jzh.f r0 = (jzh.f) r0
            int r1 = r0.f179820w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179820w = r1
            goto L18
        L13:
            jzh.f r0 = new jzh.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179820w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f179820w = r3
            rzh.c r6 = r4.f179833b
            java.lang.Object r6 = r6.Z2(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            nii.h r6 = (nii.h) r6
            boolean r5 = r6 instanceof nii.g
            r0 = 0
            if (r5 == 0) goto L47
            nii.g r6 = (nii.g) r6
            goto L48
        L47:
            r6 = r0
        L48:
            if (r6 == 0) goto L54
            jzh.b0 r5 = new jzh.b0
            java.lang.Object r6 = r6.f216152a
            com.revolut.feature.exchange.models.ExchangeOrder r6 = (com.revolut.feature.exchange.models.ExchangeOrder) r6
            r5.<init>(r6)
            return r5
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.k.c(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jzh.g
            if (r0 == 0) goto L13
            r0 = r6
            jzh.g r0 = (jzh.g) r0
            int r1 = r0.f179821w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179821w = r1
            goto L18
        L13:
            jzh.g r0 = new jzh.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179821w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f179821w = r3
            zzh.a r6 = r4.e
            java.lang.Object r6 = r6.Z2(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            nii.h r6 = (nii.h) r6
            boolean r5 = r6 instanceof nii.g
            r0 = 0
            if (r5 == 0) goto L47
            nii.g r6 = (nii.g) r6
            goto L48
        L47:
            r6 = r0
        L48:
            if (r6 == 0) goto L54
            jzh.c0 r5 = new jzh.c0
            java.lang.Object r6 = r6.f216152a
            com.revolut.feature.exchange.models.ExchangeOrder r6 = (com.revolut.feature.exchange.models.ExchangeOrder) r6
            r5.<init>(r6)
            return r5
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.k.d(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r5, boolean r6, gim.c r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.k.e(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jzh.i
            if (r0 == 0) goto L13
            r0 = r6
            jzh.i r0 = (jzh.i) r0
            int r1 = r0.f179828x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179828x = r1
            goto L18
        L13:
            jzh.i r0 = new jzh.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179828x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            jzh.k r5 = r0.u
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L46
        L29:
            r5 = move-exception
            goto L55
        L2b:
            r5 = move-exception
            goto L61
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r6)
            qzh.a r6 = r4.f179832a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.u = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f179828x = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r6 = r6.Z2(r5, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            nii.h r6 = (nii.h) r6     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r5.getClass()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            jzh.d0 r5 = a(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            jzh.b r6 = new jzh.b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            return r6
        L55:
            k7i.i r6 = r4.f
            boolean r6 = r6.s(r5)
            if (r6 == 0) goto L60
            jzh.a r5 = jzh.a.f179812a
            return r5
        L60:
            throw r5
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.k.f(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jzh.j
            if (r0 == 0) goto L13
            r0 = r6
            jzh.j r0 = (jzh.j) r0
            int r1 = r0.f179831w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179831w = r1
            goto L18
        L13:
            jzh.j r0 = new jzh.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179831w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f179831w = r3
            szh.a r6 = r4.d
            java.lang.Object r6 = r6.Z2(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            nii.h r6 = (nii.h) r6
            boolean r5 = r6 instanceof nii.g
            r0 = 0
            if (r5 == 0) goto L47
            nii.g r6 = (nii.g) r6
            goto L48
        L47:
            r6 = r0
        L48:
            if (r6 == 0) goto L55
            nii.n1 r5 = r6.f216153b
            jzh.d0 r5 = h(r5)
            if (r5 != 0) goto L54
            jzh.a0 r5 = jzh.a0.f179813a
        L54:
            return r5
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.k.g(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }
}
