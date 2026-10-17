package guf;

import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.quotes.TransferQuoteRequest;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSender;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalApi$Toggles;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import g48.r;
import gs2.t;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import opf.z;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferInputData f146917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.b f146918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f146919c;
    public final bqf.d d;
    public final bqf.g e;
    public final fk3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lx1.d f146920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cl3.a f146921h;
    public final z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1j.b f146922j;
    public final gte.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d3j.b f146923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rga.c f146924m;

    public m(ManualTransferInputData inputData, o7.b orderQuoteInteractor, ang.f userInteractor, bqf.d trustInteractor, bqf.g trustedPayeeChecker, fk3.a configurationInteractor, lx1.d apmContactsInteractor, cl3.a contactInteractor, z transferFundingSourceInteractor, t1j.b transferQuoteInteractor, gte.a featureToggleInteractor, d3j.b beneficiaryInteractor, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(contactInteractor, "contactInteractor");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f146917a = inputData;
        this.f146918b = orderQuoteInteractor;
        this.f146919c = userInteractor;
        this.d = trustInteractor;
        this.e = trustedPayeeChecker;
        this.f = configurationInteractor;
        this.f146920g = apmContactsInteractor;
        this.f146921h = contactInteractor;
        this.i = transferFundingSourceInteractor;
        this.f146922j = transferQuoteInteractor;
        this.k = featureToggleInteractor;
        this.f146923l = beneficiaryInteractor;
        this.f146924m = priceQuoteTraceIdHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof guf.c
            if (r0 == 0) goto L13
            r0 = r6
            guf.c r0 = (guf.c) r0
            int r1 = r0.f146904w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146904w = r1
            goto L18
        L13:
            guf.c r0 = new guf.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146904w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L67
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            boolean r6 = r5 instanceof com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.MoneyRequestApproval
            if (r6 == 0) goto L50
            r6 = r5
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval r6 = (com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.MoneyRequestApproval) r6
            com.revolut.domain.models.moneyrequest.MoneyRequest r6 = r6.f92452b
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel r6 = r6.f60316c
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel$Bizum r2 = com.revolut.domain.models.moneyrequest.MoneyRequestChannel.Bizum.f60331b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L50
            dj0.d r5 = r5.f92449a
            xi0.b r5 = r5.f115083b
            java.lang.String r5 = r5.f306286a
            java.util.Set r5 = zhm.y0.b(r5)
            return r5
        L50:
            fk3.a r5 = r4.f
            ik3.c r5 = (ik3.c) r5
            efm.r r5 = r5.n()
            r6 = 3
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            r0.f146904w = r3
            java.lang.Object r6 = nim.a.c(r5, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.util.Set r6 = (java.util.Set) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.a(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId r5, gim.c r6, java.lang.String r7, k1j.a r8) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof guf.d
            if (r0 == 0) goto L13
            r0 = r6
            guf.d r0 = (guf.d) r0
            int r1 = r0.f146905w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146905w = r1
            goto L18
        L13:
            guf.d r0 = new guf.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146905w
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
            r0.f146905w = r3
            opf.z r6 = r4.i
            java.lang.Object r6 = r6.d(r5, r0, r7, r8)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.transfer.core.models.FundingSource r6 = (com.revolut.feature.transfer.core.models.FundingSource) r6
            if (r6 == 0) goto L42
            return r6
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Selected balance can't be provided"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.b(com.revolut.core.model.account.AccountId, gim.c, java.lang.String, k1j.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.c(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof guf.f
            if (r0 == 0) goto L13
            r0 = r6
            guf.f r0 = (guf.f) r0
            int r1 = r0.f146909w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146909w = r1
            goto L18
        L13:
            guf.f r0 = new guf.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146909w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L61
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            o7.b r6 = r4.f146918b
            efm.r r5 = r6.p(r5)
            r6 = 3
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            efm.d0 r5 = r5.firstOrError()
            guf.g r6 = guf.g.f
            dug.e r6 = new dug.e
            r2 = 28
            r6.<init>(r2)
            r5.getClass()
            ufm.i r2 = new ufm.i
            r2.<init>(r5, r6, r3)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.f146909w = r3
            java.lang.Object r6 = nim.a.b(r2, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.d(com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams, gim.c):java.lang.Object");
    }

    public final Object e(ManualTransferData manualTransferData, gim.c cVar) {
        LegacyOrderQuoteParams legacyOrderQuoteParamsF = f(manualTransferData);
        Asset asset = legacyOrderQuoteParamsF.f104735b;
        Asset asset2 = legacyOrderQuoteParamsF.f104734a;
        Continuation continuation = null;
        if (((jte.d) this.k).c(TransferRequestApprovalApi$Toggles.PaymentsChargesMigrationMoneyRequest.f92447c)) {
            TransferRequestApprovalData transferRequestApprovalData = this.f146917a.f79597a;
            if (transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval) {
                Intrinsics.checkNotNullParameter(legacyOrderQuoteParamsF, "<this>");
                if (!Intrinsics.f(asset2.f104720b, asset.f104720b)) {
                    Object objD = d(legacyOrderQuoteParamsF, cVar);
                    return objD == fim.a.COROUTINE_SUSPENDED ? objD : (hrf.c) objD;
                }
            } else {
                if (!(transferRequestApprovalData instanceof TransferRequestApprovalData.MoneyRequestApproval)) {
                    throw new NoWhenBranchMatchedException();
                }
                dj0.d dVar = transferRequestApprovalData.f92449a;
                xi0.b bVar = manualTransferData.f;
                FundingSource fundingSource = manualTransferData.f92455a;
                String strT = czi.c.t(fundingSource);
                CountryProfile countryProfileA = fundingSource.getF92264h();
                TransferQuoteSender transferQuoteSender = new TransferQuoteSender(strT, countryProfileA != null ? countryProfileA.f92231a : null, bVar);
                TransferQuoteUserIdentifier transferQuoteUserIdentifier = manualTransferData.e;
                if (transferQuoteUserIdentifier != null) {
                    String strB = this.f146924m.b("payments_money_request_price_quote");
                    Object objZ = q.z(rd0.e.e(new r(mo3.a.g(nim.a.v(this.f146922j.l(new TransferQuoteRequest(dVar, transferQuoteSender, transferQuoteUserIdentifier, strB == null ? null : strB, 16)), new t(14)), null, null, 3), 1), h0.f322473a, new g23.j(3, 18, continuation)), cVar);
                    return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : (hrf.c) objZ;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(legacyOrderQuoteParamsF, "<this>");
            if (!Intrinsics.f(asset2.f104720b, asset.f104720b)) {
                Object objD2 = d(legacyOrderQuoteParamsF, cVar);
                return objD2 == fim.a.COROUTINE_SUSPENDED ? objD2 : (hrf.c) objD2;
            }
        }
        return null;
    }

    public final LegacyOrderQuoteParams f(ManualTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        TransferRequestApprovalData transferRequestApprovalData = this.f146917a.f79597a;
        xi0.b bVar = transferData.f;
        xi0.b bVar2 = transferRequestApprovalData.getF92449a().f115083b;
        double dK = transferRequestApprovalData.getF92449a().f115082a / cp5.d.k(bVar2);
        f8l.c cVar = cp5.d.z(bVar2) ? f8l.c.CRYPTO : cp5.d.y(bVar2) ? f8l.c.COMMODITY : f8l.c.FIAT;
        Asset asset = new Asset(cp5.d.z(bVar) ? f8l.c.CRYPTO : cp5.d.y(bVar) ? f8l.c.COMMODITY : f8l.c.FIAT, bVar.f306286a, bVar);
        Asset asset2 = new Asset(cVar, bVar2.f306286a, bVar2);
        f8l.e eVar = f8l.e.MARKET;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dK);
        f8l.b bVar3 = f8l.b.TO;
        f8l.b bVar4 = f8l.b.FROM;
        String strB = this.f146924m.b("payments_money_request_price_quote");
        if (strB == null) {
            strB = null;
        }
        return new LegacyOrderQuoteParams(asset, asset2, eVar, bigDecimalValueOf, bVar3, bVar4, null, false, null, null, null, null, null, strB, 7936);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r8 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r8 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r8 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.domain.models.moneyrequest.MoneyRequest r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof guf.i
            if (r0 == 0) goto L13
            r0 = r8
            guf.i r0 = (guf.i) r0
            int r1 = r0.f146911w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146911w = r1
            goto L18
        L13:
            guf.i r0 = new guf.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146911w
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)
            goto La6
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r8)
            goto L7a
        L3a:
            yhm.o.b(r8)
            goto L5f
        L3e:
            yhm.o.b(r8)
            java.lang.String r8 = f6k.a.a(r7)
            if (r8 != 0) goto L48
            goto Lb6
        L48:
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel r7 = r7.f60316c
            boolean r2 = r7 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestChannel.Revolut
            if (r2 == 0) goto L69
            cl3.a r7 = r6.f146921h
            wl3.h r7 = (wl3.h) r7
            rfm.z r7 = r7.b(r8)
            r0.f146911w = r4
            java.lang.Object r8 = nim.a.i(r7, r0)
            if (r8 != r1) goto L5f
            goto La5
        L5f:
            zm3.a r8 = (zm3.a) r8
            if (r8 == 0) goto Lb6
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient$Internal r7 = new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient$Internal
            r7.<init>(r8)
            return r7
        L69:
            boolean r2 = r7 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestChannel.APM
            if (r2 == 0) goto L84
            r0.f146911w = r5
            lx1.d r7 = r6.f146920g
            fy1.o r7 = (fy1.o) r7
            java.lang.Object r8 = r7.e(r8, r0)
            if (r8 != r1) goto L7a
            goto La5
        L7a:
            com.revolut.feature.apm.core.models.recipients.ApmContact r8 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r8
            if (r8 == 0) goto Lb6
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient$Apm r7 = new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient$Apm
            r7.<init>(r8)
            return r7
        L84:
            boolean r7 = r7 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestChannel.BankBeneficiary
            if (r7 == 0) goto Lb8
            d3j.b r7 = r6.f146923l
            w4l.h r2 = w4l.h.f294642c
            efm.r r7 = r7.j(r8, r2)
            efm.r r7 = zi0.c.J(r7)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f146911w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto La6
        La5:
            return r1
        La6:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r7 = r8.getContent()
            f5j.a r7 = (f5j.a) r7
            if (r7 == 0) goto Lb6
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient$BankBeneficiary r8 = new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient$BankBeneficiary
            r8.<init>(r7)
            return r8
        Lb6:
            r7 = 0
            return r7
        Lb8:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.g(com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof guf.j
            if (r0 == 0) goto L13
            r0 = r5
            guf.j r0 = (guf.j) r0
            int r1 = r0.f146912w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146912w = r1
            goto L18
        L13:
            guf.j r0 = new guf.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146912w
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
            ang.f r5 = r4.f146919c
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f146912w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            wi0.a r0 = wi0.b.Companion
            com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData r1 = r4.f146917a
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData r1 = r1.f79597a
            boolean r2 = r1 instanceof com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.GroupBillsApproval
            java.lang.String r3 = ""
            if (r2 == 0) goto L56
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r1)
            goto L6d
        L56:
            boolean r2 = r1 instanceof com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.MoneyRequestApproval
            if (r2 == 0) goto L81
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval r1 = (com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.MoneyRequestApproval) r1
            com.revolut.domain.models.moneyrequest.MoneyRequest r1 = r1.f92452b
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty r1 = r1.f60320l
            java.lang.String r1 = r1.getD()
            if (r1 != 0) goto L6c
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r1)
            goto L6d
        L6c:
            r3 = r1
        L6d:
            r0.getClass()
            wi0.b r0 = wi0.a.a(r3)
            prf.g r1 = new prf.g
            kotlin.jvm.internal.Intrinsics.h(r5)
            wi0.b r5 = do3.q.y(r5)
            r1.<init>(r5, r0)
            return r1
        L81:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.GroupBillsApproval r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof guf.k
            if (r0 == 0) goto L13
            r0 = r6
            guf.k r0 = (guf.k) r0
            int r1 = r0.f146913w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146913w = r1
            goto L18
        L13:
            guf.k r0 = new guf.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146913w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L66
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = r5.d
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r5, r2)
            r6.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L45:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r5.next()
            com.revolut.feature.payments.groups.models.GroupMemberSettleInfo r2 = (com.revolut.feature.payments.groups.models.GroupMemberSettleInfo) r2
            oq9.o r2 = r2.f79503a
            r6.add(r2)
            goto L45
        L57:
            bqf.g r5 = r4.e
            efm.d0 r5 = r5.d(r6)
            r0.f146913w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            com.revolut.feature.transfer.models.transfer.TransferTrustData r5 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            kotlin.jvm.internal.Intrinsics.h(r6)
            boolean r6 = r6.booleanValue()
            r0 = 0
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.i(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$GroupBillsApproval, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.MoneyRequestApproval r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof guf.l
            if (r0 == 0) goto L13
            r0 = r10
            guf.l r0 = (guf.l) r0
            int r1 = r0.f146916y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146916y = r1
            goto L18
        L13:
            guf.l r0 = new guf.l
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f146914w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146916y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r9 = r0.v
            yhm.o.b(r10)
            goto L8a
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval r9 = r0.u
            yhm.o.b(r10)
            goto L72
        L3b:
            yhm.o.b(r10)
            com.revolut.domain.models.moneyrequest.MoneyRequest r10 = r9.f92452b
            java.lang.String r10 = f6k.a.a(r10)
            if (r10 != 0) goto L4d
            com.revolut.feature.transfer.models.transfer.TransferTrustData r9 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r10 = 0
            r9.<init>(r10, r5)
            return r9
        L4d:
            com.revolut.domain.models.moneyrequest.MoneyRequest r2 = r9.f92452b
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel r2 = r2.f60316c
            boolean r6 = r2 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestChannel.Revolut
            if (r6 == 0) goto L58
            iy9.d r2 = iy9.d.USER
            goto L65
        L58:
            boolean r6 = r2 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestChannel.APM
            if (r6 == 0) goto L5f
            iy9.d r2 = iy9.d.BENEFICIARY
            goto L65
        L5f:
            boolean r2 = r2 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestChannel.BankBeneficiary
            if (r2 == 0) goto L96
            iy9.d r2 = iy9.d.BENEFICIARY
        L65:
            r0.u = r9
            r0.f146916y = r4
            bqf.d r4 = r8.d
            java.lang.Object r10 = r4.b(r10, r2, r0)
            if (r10 != r1) goto L72
            goto L86
        L72:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r10 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r10
            com.revolut.domain.models.moneyrequest.MoneyRequest r9 = r9.f92452b
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty r9 = r9.f60320l
            r0.u = r5
            r0.v = r10
            r0.f146916y = r3
            bqf.g r2 = r8.e
            java.lang.Object r9 = r2.b(r9, r0)
            if (r9 != r1) goto L87
        L86:
            return r1
        L87:
            r7 = r10
            r10 = r9
            r9 = r7
        L8a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r0 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r0.<init>(r10, r9)
            return r0
        L96:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: guf.m.j(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval, gim.c):java.lang.Object");
    }
}
