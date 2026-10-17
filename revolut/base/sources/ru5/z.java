package ru5;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kkf.r6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import tof.a3;
import vkm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends jki.g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActivityScreenContract$InputData f257438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dv5.l f257439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final iva.a f257440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dtc.i f257441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dv5.a f257442t;
    public final lu5.k u;
    public final lu5.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final uu5.a f257443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pu5.e f257444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final pu5.a f257445y;
    public final j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 stateMapper, ActivityScreenContract$InputData inputData, dv5.l presentationModel, iva.a recurringBuysNavigationProvider, dtc.i transactionSearchFactory, dv5.a ordersSearcher, lu5.k cryptoTransactionFilterProvider, lu5.d cryptoTransactionFilterMapper, uu5.a monthTabHandler, lu5.b cryptoTransactionFilterDelegate, pu5.e cryptoTransactionDetailsNavigator, pu5.a cryptoOrderDetailsNavigator) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(transactionSearchFactory, "transactionSearchFactory");
        Intrinsics.checkNotNullParameter(ordersSearcher, "ordersSearcher");
        Intrinsics.checkNotNullParameter(cryptoTransactionFilterProvider, "cryptoTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(cryptoTransactionFilterMapper, "cryptoTransactionFilterMapper");
        Intrinsics.checkNotNullParameter(monthTabHandler, "monthTabHandler");
        Intrinsics.checkNotNullParameter(cryptoTransactionFilterDelegate, "cryptoTransactionFilterDelegate");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsNavigator, "cryptoOrderDetailsNavigator");
        this.f257438p = inputData;
        this.f257439q = presentationModel;
        this.f257440r = recurringBuysNavigationProvider;
        this.f257441s = transactionSearchFactory;
        this.f257442t = ordersSearcher;
        this.u = cryptoTransactionFilterProvider;
        this.v = cryptoTransactionFilterMapper;
        this.f257443w = monthTabHandler;
        this.f257444x = cryptoTransactionDetailsNavigator;
        this.f257445y = cryptoOrderDetailsNavigator;
        this.z = new j(inputData.e == lt5.a.DEFI ? pt5.b.TRANSACTIONS : inputData.f71426a, inputData.f71427b, 2046);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(ru5.z r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ru5.p
            if (r0 == 0) goto L13
            r0 = r9
            ru5.p r0 = (ru5.p) r0
            int r1 = r0.f257432x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257432x = r1
            goto L18
        L13:
            ru5.p r0 = new ru5.p
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257432x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r9)
            r0.u = r8
            r0.f257432x = r3
            java.lang.Object r9 = r7.A2(r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            zsc.h r9 = (zsc.h) r9
            zsc.l r0 = zsc.m.Companion
            r0.getClass()
            zsc.m r8 = zsc.l.a(r8)
            zsc.f r0 = new zsc.f
            r0.<init>(r9, r8)
            jki.i r8 = r7.t2()
            ru5.j r8 = (ru5.j) r8
            com.revolut.data.model.Data r8 = r8.d
            r9 = 0
            java.lang.Object r1 = r8.getContent()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L96
            whf.p r1 = (whf.p) r1     // Catch: java.lang.Throwable -> L85
            java.util.List r2 = r1.f297646a     // Catch: java.lang.Throwable -> L85
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L85
            r4.<init>()     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L85
        L6e:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r5 == 0) goto L87
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L85
            r6 = r5
            tof.a3 r6 = (tof.a3) r6     // Catch: java.lang.Throwable -> L85
            boolean r6 = r0.a(r6)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L6e
            r4.add(r5)     // Catch: java.lang.Throwable -> L85
            goto L6e
        L85:
            r0 = move-exception
            goto La5
        L87:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L85
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L85
            if (r0 == r2) goto L97
            whf.p r1 = whf.p.a(r4, r1)     // Catch: java.lang.Throwable -> L85
            goto L97
        L96:
            r1 = r9
        L97:
            java.lang.Throwable r0 = r8.getError()     // Catch: java.lang.Throwable -> L85
            boolean r2 = r8.getLoading()     // Catch: java.lang.Throwable -> L85
            com.revolut.data.model.Data r3 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L85
            r3.<init>(r1, r0, r2)     // Catch: java.lang.Throwable -> L85
            goto Lae
        La5:
            com.revolut.data.model.Data r3 = new com.revolut.data.model.Data
            boolean r8 = r8.getLoading()
            r3.<init>(r9, r0, r8)
        Lae:
            rtl.s r8 = new rtl.s
            r9 = 6
            r8.<init>(r3, r9)
            r7.x2(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru5.z.y2(ru5.z, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru5.q
            if (r0 == 0) goto L13
            r0 = r5
            ru5.q r0 = (ru5.q) r0
            int r1 = r0.f257433w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257433w = r1
            goto L18
        L13:
            ru5.q r0 = new ru5.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257433w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            dtc.i r5 = r4.f257441s
            ufm.i r5 = r5.a()
            r0.f257433w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru5.z.A2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B2(qua.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru5.v
            if (r0 == 0) goto L13
            r0 = r6
            ru5.v r0 = (ru5.v) r0
            int r1 = r0.f257435w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257435w = r1
            goto L18
        L13:
            ru5.v r0 = new ru5.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257435w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            iva.a r6 = r4.f257440r
            pva.d r6 = (pva.d) r6
            ufm.i r5 = r6.b(r5)
            r0.f257435w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r6)
            r5.<init>(r6)
            r4.C1(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru5.z.B2(qua.p, gim.c):java.lang.Object");
    }

    public final void C2(a3 a3Var) {
        C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(a3Var), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow v1Var;
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new qna.n(q2(), this, 25)), new r3k.c(null, this, 13)), null, new u(this, null), 3);
        ActivityScreenContract$InputData activityScreenContract$InputData = this.f257438p;
        if (activityScreenContract$InputData.e != lt5.a.DEFI) {
            CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode = ((j) t2()).f257422l;
            ft5.a params = new ft5.a(activityScreenContract$InputData.f71429g, 6);
            lu5.k kVar = this.u;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(params, "params");
            if (currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies) {
                v1Var = new hy1.b0(new r6(new r6(new g48.r(mo3.a.g(rd0.e.b(gt5.a.b(kVar.f200033a, osg.b.n(kVar.f200034b, zhm.v.k(io3.l.CURRENT, io3.l.REVX_FIAT), 1), null, n9l.b.SEC_60, 2)), null, null, 3), 28), 15), 16), kVar, params, 22);
            } else {
                if (!(currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency)) {
                    throw new NoWhenBranchMatchedException();
                }
                v1Var = new v1(new lu5.f(kVar, params, null));
            }
            yji.l.b1(this, v1Var, null, new r(this, null), 3);
            CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode2 = ((j) t2()).f257422l;
            CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency singleCurrency = currencyMode2 instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency ? (CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) currencyMode2 : null;
            yji.l.b1(this, rd0.e.b(this.f257439q.b(singleCurrency != null ? singleCurrency.f71405a : null)), null, new s(this, null), 3);
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }

    public final void z2() {
        String str = ((j) t2()).f257419g;
        if (d0.W(str)) {
            x2(new rsl.c(25));
        } else {
            n2(new rm6.c(this, str, null, 20), new whi.b(6));
        }
    }
}
