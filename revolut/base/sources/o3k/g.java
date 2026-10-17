package o3k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import efm.d0;
import efm.r;
import i3k.l;
import i3k.m;
import kotlin.jvm.internal.Intrinsics;
import opf.z;
import sf0.h;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceAmountScreenContract$InputData f221843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final opf.b f221844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f221845c;
    public final g3k.d d;
    public final ang.f e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ypf.b f221846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f221847h;

    public g(RemittanceAmountScreenContract$InputData inputData, opf.b paymentsPocketInteractor, fk3.a configurationInteractor, g3k.d remittanceInteractor, ang.f userInteractor, n walletInteractor, h serverErrorParser, ypf.b scheduleAvailabilityInteractor, z transferFundingSourceInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(remittanceInteractor, "remittanceInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(scheduleAvailabilityInteractor, "scheduleAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        this.f221843a = inputData;
        this.f221844b = paymentsPocketInteractor;
        this.f221845c = configurationInteractor;
        this.d = remittanceInteractor;
        this.e = userInteractor;
        this.f = serverErrorParser;
        this.f221846g = scheduleAvailabilityInteractor;
        this.f221847h = transferFundingSourceInteractor;
    }

    public final d0 a() {
        d0 d0VarFirstOrError = m70.a.g(((ik3.c) this.f221845c).n(), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId r7, java.lang.String r8, java.lang.String r9, k1j.a r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof o3k.b
            if (r0 == 0) goto L13
            r0 = r11
            o3k.b r0 = (o3k.b) r0
            int r1 = r0.f221832y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221832y = r1
            goto L18
        L13:
            o3k.b r0 = new o3k.b
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f221830w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221832y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.core.model.account.AccountId r7 = r0.u
            yhm.o.b(r11)
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r9 = r0.v
            com.revolut.core.model.account.AccountId r7 = r0.u
            yhm.o.b(r11)
            goto L4f
        L3d:
            yhm.o.b(r11)
            r0.u = r7
            r0.v = r9
            r0.f221832y = r4
            opf.z r11 = r6.f221847h
            java.lang.Object r11 = r11.d(r7, r0, r8, r10)
            if (r11 != r1) goto L4f
            goto L5f
        L4f:
            com.revolut.feature.transfer.core.models.FundingSource r11 = (com.revolut.feature.transfer.core.models.FundingSource) r11
            if (r11 != 0) goto L68
            r0.u = r7
            r0.v = r5
            r0.f221832y = r3
            java.lang.Object r11 = r6.d(r7, r0, r9)
            if (r11 != r1) goto L60
        L5f:
            return r1
        L60:
            io3.d r11 = (io3.d) r11
            com.revolut.feature.transfer.core.models.PocketSource r8 = new com.revolut.feature.transfer.core.models.PocketSource
            r8.<init>(r11, r7, r5)
            return r8
        L68:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o3k.g.b(com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, k1j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData.NewTransfer r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3k.g.c(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData$NewTransfer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.core.model.account.AccountId r6, gim.c r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o3k.d
            if (r0 == 0) goto L13
            r0 = r7
            o3k.d r0 = (o3k.d) r0
            int r1 = r0.f221838y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221838y = r1
            goto L18
        L13:
            o3k.d r0 = new o3k.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f221836w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221838y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r8 = r0.v
            com.revolut.core.model.account.AccountId r6 = r0.u
            yhm.o.b(r7)
            goto L4e
        L3a:
            yhm.o.b(r7)
            efm.d0 r7 = r5.a()
            r0.u = r6
            r0.v = r8
            r0.f221838y = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4e
            goto L6c
        L4e:
            java.util.Set r7 = (java.util.Set) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.util.List r8 = zhm.v.l(r8)
            io3.l r2 = io3.l.CURRENT
            opf.b r4 = r5.f221844b
            ufm.i r6 = r4.b(r7, r8, r2, r6)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f221838y = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o3k.g.d(com.revolut.core.model.account.AccountId, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xi0.b r14, xi0.b r15, long r16, kq2.c r18, com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId r19, com.revolut.core.model.account.AccountId r20, java.lang.String r21, gim.c r22) {
        /*
            r13 = this;
            r1 = r22
            boolean r2 = r1 instanceof o3k.e
            if (r2 == 0) goto L16
            r2 = r1
            o3k.e r2 = (o3k.e) r2
            int r3 = r2.f221841y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f221841y = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            o3k.e r2 = new o3k.e
            r2.<init>(r13, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r9.f221839w
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.f221841y
            r11 = 1
            if (r2 == 0) goto L3a
            if (r2 != r11) goto L32
            xi0.b r2 = r9.v
            xi0.b r3 = r9.u
            yhm.o.b(r1)
            r12 = r3
            r3 = r1
            r1 = r12
            goto L5d
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r1)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r6 = r18
            r7 = r19
            r5 = r20
            r8 = r21
            vkm.d r3 = r0.g(r1, r2, r3, r5, r6, r7, r8)
            r9.u = r14
            r9.v = r15
            r9.f221841y = r11
            java.lang.Object r3 = vkm.q.x(r3, r9)
            if (r3 != r10) goto L5b
            return r10
        L5b:
            r1 = r14
            r2 = r15
        L5d:
            e3k.d r3 = (e3k.d) r3
            boolean r4 = r3 instanceof e3k.b
            if (r4 == 0) goto L6a
            e3k.b r3 = (e3k.b) r3
            z1k.o r1 = r3.f122337b
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId r1 = r1.f318882a
            return r1
        L6a:
            boolean r4 = r3 instanceof e3k.c
            if (r4 == 0) goto Lac
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Class r3 = r3.getClass()
            kotlin.jvm.internal.p0 r5 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KClass r3 = r5.b(r3)
            java.lang.String r3 = r3.m()
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData r5 = r13.f221843a
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r5 = r5.getF102028a()
            wi0.b r5 = r5.f101977a
            java.lang.String r5 = r5.f297794a
            java.lang.String r1 = r1.f306286a
            java.lang.String r2 = r2.f306286a
            java.lang.String r6 = ", recipientCountry="
            java.lang.String r7 = ", targetCurrency="
            java.lang.String r8 = "No routes available: routeDataType="
            java.lang.StringBuilder r3 = v0.a.m(r8, r3, r6, r5, r7)
            java.lang.String r5 = ", sourceCurrency="
            java.lang.String r1 = a0.d.u(r3, r1, r5, r2)
            r4.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r3 = 0
            rd0.d.a(r2, r3, r3, r4, r1)
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId$UNKNOWN r1 = com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId.UNKNOWN.f101919b
            return r1
        Lac:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o3k.g.e(xi0.b, xi0.b, long, kq2.c, com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId, com.revolut.core.model.account.AccountId, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o3k.f
            if (r0 == 0) goto L13
            r0 = r5
            o3k.f r0 = (o3k.f) r0
            int r1 = r0.f221842w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221842w = r1
            goto L18
        L13:
            o3k.f r0 = new o3k.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221842w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.e
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f221842w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            prf.g r0 = new prf.g
            kotlin.jvm.internal.Intrinsics.h(r5)
            wi0.b r5 = do3.q.y(r5)
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData r1 = r4.f221843a
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r1 = r1.getF102028a()
            wi0.b r1 = r1.f101977a
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3k.g.f(gim.c):java.lang.Object");
    }

    public final vkm.d g(xi0.b recipientCurrency, xi0.b senderCurrency, long j2, AccountId accountId, kq2.c cVar, RemittanceRouteId remittanceRouteId, String str) {
        Intrinsics.checkNotNullParameter(recipientCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(senderCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        wi0.b recipientCountry = this.f221843a.getF102028a().f101977a;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        String str2 = joint != null ? joint.f51413b : null;
        g3k.d dVar = this.d;
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        i3k.e eVar = dVar.f140303a;
        String recipientCountry2 = recipientCountry.f297794a;
        String recipientCurrency2 = recipientCurrency.f306286a;
        String senderCurrency2 = senderCurrency.f306286a;
        m mVar = (m) eVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(recipientCountry2, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency2, "recipientCurrency");
        Intrinsics.checkNotNullParameter(senderCurrency2, "senderCurrency");
        l lVar = new l(recipientCountry2, recipientCurrency2, senderCurrency2, j2, cVar, str2, str);
        r rVarConcatWith = mo3.a.n(mVar.f158255h.f(lVar, false)).concatWith(mVar.i.a(lVar, m.f158250m, true));
        Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "let(...)");
        if (j2 <= 0) {
            rVarConcatWith = mo3.a.n(rVarConcatWith);
        }
        r map = m70.a.g(rVarConcatWith, null, new nz7.g(25), 1).map(new o28.g(new g3k.b(remittanceRouteId, this), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(ue0.e.y(map, h0.f322473a, new a(this, 0)));
    }
}
