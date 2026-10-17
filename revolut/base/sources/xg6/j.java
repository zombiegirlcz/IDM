package xg6;

import com.revolut.data.network.models.openbanking.AuthorizationRequestDto;
import com.revolut.data.network.models.openbanking.OneOffTopupRequestDto;
import com.revolut.data.network.models.openbanking.TopUpResponseDto;
import com.revolut.data.network.models.openbanking.penny_verification.PennyAuthorisationResultDto;
import com.revolut.data.network.models.topup.PayToMandateTopupRequestDto;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.data.network.services.ExternalInstitutionsService;
import com.revolut.domain.models.topup.TopUpContext;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.Locale;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import retrofit2.Response;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements oe6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r71.a f305582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsg.b f305583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f305584c;
    public final xoj.a d;
    public final qr0.i e;
    public final y91.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fk3.a f305585g;

    public j(r71.a externalInstitutionsRepository, qsg.b walletsRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor, xoj.a featuresInteractor, qr0.i earlyCreditRepository, y91.b accountsProductFeatureChecker, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(externalInstitutionsRepository, "externalInstitutionsRepository");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(earlyCreditRepository, "earlyCreditRepository");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f305582a = externalInstitutionsRepository;
        this.f305583b = walletsRepository;
        this.f305584c = transactionsInteractor;
        this.d = featuresInteractor;
        this.e = earlyCreditRepository;
        this.f = accountsProductFeatureChecker;
        this.f305585g = configurationInteractor;
    }

    public final boolean a(String externalInstitutionName) {
        Intrinsics.checkNotNullParameter(externalInstitutionName, "externalInstitutionName");
        Intrinsics.checkNotNullExpressionValue(externalInstitutionName.toLowerCase(Locale.ROOT), "toLowerCase(...)");
        return !Intrinsics.f(r2, "dbs");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(dj0.d r11, gim.c r12, java.lang.String r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof xg6.g
            if (r0 == 0) goto L13
            r0 = r12
            xg6.g r0 = (xg6.g) r0
            int r1 = r0.f305580w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305580w = r1
            goto L18
        L13:
            xg6.g r0 = new xg6.g
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305580w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L28
            goto L4f
        L28:
            r0 = move-exception
            r11 = r0
            goto L57
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            yhm.o.b(r12)
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            qr0.i r5 = r10.e     // Catch: java.lang.Throwable -> L28
            r0.f305580w = r3     // Catch: java.lang.Throwable -> L28
            th6.e r4 = new th6.e     // Catch: java.lang.Throwable -> L28
            r9 = 0
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            skm.p0 r11 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28
            elm.f r11 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r12 = skm.e0.J(r11, r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r12 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L28
            r12.getClass()     // Catch: java.lang.Throwable -> L28
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L5d
        L57:
            yhm.m$a r12 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r11)
        L5d:
            java.lang.Throwable r11 = yhm.m.a(r12)
            if (r11 != 0) goto L64
            goto L6f
        L64:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r13 = rd0.c.ERROR
            rd0.d.a(r13, r8, r8, r11, r12)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L6f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xg6.j.b(dj0.d, gim.c, java.lang.String):java.io.Serializable");
    }

    public final efm.r c(String institutionId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return m70.a.g(nim.a.w(oVar.i.e(Unit.f186387a, loadingStrategy), new vb2.r(institutionId, 23)), null, null, 3);
    }

    public final d0 d(String institutionId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d0 d0VarFirstOrError = nim.a.w(oVar.i.e(Unit.f186387a, loadingStrategy), new vb2.r(institutionId, 23)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final rfm.w e() {
        rfm.o oVar = new rfm.o(new w21.c((w21.o) this.f305582a, 0));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        return te0.w.h0(oVar);
    }

    public final ufm.n f(UUID idempotencyKey, String institutionId, String str, String str2, dj0.d money, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        ExternalInstitutionsService externalInstitutionsService = oVar.f293931a;
        String str3 = money.f115083b.f306286a;
        long j2 = money.f115082a;
        String string = idempotencyKey.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        d0<TopUpResponseDto> d0VarOneOffTopup = externalInstitutionsService.oneOffTopup(new OneOffTopupRequestDto(institutionId, str, str2, j2, str3, string, TopUpContextMapperKt.toWalletId(topUpContext), TopUpContextMapperKt.toDto(topUpContext)));
        w21.m mVar = w21.m.f;
        vf0.q qVar = new vf0.q(15);
        d0VarOneOffTopup.getClass();
        ufm.i iVar = new ufm.i(d0VarOneOffTopup, qVar, 1);
        int i = 3;
        ufm.f fVar = new ufm.f(iVar, new vz4.c(new vx9.v(oVar, i, institutionId, str), 10), i);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return te0.w.i0(fVar);
    }

    public final ufm.n g(y61.d urlData) {
        Intrinsics.checkNotNullParameter(urlData, "urlData");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(urlData, "urlData");
        d0<Response<PennyAuthorisationResultDto>> pennyAuthorisationResult = oVar.f293931a.getPennyAuthorisationResult(urlData.b(), urlData.a(), "NAME_MATCH");
        vz4.c cVar = new vz4.c(new w2.c(24), 14);
        pennyAuthorisationResult.getClass();
        ufm.i iVar = new ufm.i(pennyAuthorisationResult, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xg6.i
            if (r0 == 0) goto L13
            r0 = r7
            xg6.i r0 = (xg6.i) r0
            int r1 = r0.f305581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305581w = r1
            goto L18
        L13:
            xg6.i r0 = new xg6.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305581w
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            yhm.o.b(r7)
            goto L54
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            e7l.g$b r7 = e7l.g.b.f123407a
            fk3.a r2 = r6.f305585g
            ik3.c r2 = (ik3.c) r2
            efm.r r7 = r2.k(r7)
            efm.r r7 = m70.a.g(r7, r4, r4, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f305581w = r5
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            e7l.f r7 = (e7l.f) r7
            e7l.a r0 = r7.C0
            int[] r1 = xg6.e.f305579a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L89
            r1 = 2
            if (r0 == r1) goto L6e
            if (r0 != r3) goto L68
            goto L6e
        L68:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            e7l.a r7 = r7.C0
            java.lang.String r7 = r7.a()
            java.lang.String r1 = "One-off command requested for auth type "
            java.lang.String r7 = j6.a.q(r1, r7)
            r0.<init>(r7)
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r0, r7)
            r5 = 0
        L89:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xg6.j.h(gim.c):java.lang.Object");
    }

    public final sfm.b i(w4l.k loadingStrategy, oe6.g purpose) {
        Object objM;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        if (Intrinsics.f(purpose, oe6.d.f224553a)) {
            d0 d0VarE = ((cpj.b) this.d).e(yoj.c.EXTERNAL_ACCOUNTS_TOPUP, yoj.d.DISABLED);
            h hVar = h.f;
            objM = new ufm.i(d0VarE, new x2l.a(5, false), 1);
            Intrinsics.checkNotNullExpressionValue(objM, "map(...)");
        } else if (Intrinsics.f(purpose, oe6.b.f224551a)) {
            objM = d0.m(Boolean.valueOf(this.f.a("ACCOUNT.linked_account")));
            Intrinsics.checkNotNullExpressionValue(objM, "just(...)");
        } else {
            if (!Intrinsics.f(purpose, oe6.c.f224552a) && !(purpose instanceof oe6.e)) {
                throw new NoWhenBranchMatchedException();
            }
            objM = d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(objM, "just(...)");
        }
        sfm.b bVar = new sfm.b(objM, new x9h.d(28, new wtl.f(purpose, 19, this, loadingStrategy)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final efm.r j(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!this.f.a("ACCOUNT.linked_account")) {
            return te0.w.h(zi0.c.P(f0.f322471a, false, null, 3));
        }
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return oVar.f293936j.e(Unit.f186387a, loadingStrategy);
    }

    public final pfm.r k(dj0.d money, String mandateId) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(money, "money");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(money, "money");
        return te0.w.g0(oVar.f293931a.payToMandateTopup(new PayToMandateTopupRequestDto(mandateId, money.f115082a, money.f115083b.f306286a, "PAY_TO"), new wj0.b("TOPUP_IDEMPOTENCY_TAG")));
    }

    public final pfm.r l(String institutionId, String iban) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(iban, "iban");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(iban, "iban");
        pfm.h hVar = new pfm.h(new r2d.e(iban, 24, oVar, institutionId), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return te0.w.g0(hVar);
    }

    public final void m(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        ue0.c cVar = oVar.f293933c;
        cVar.G(institutionId, "ONE_OFF_TOP_UP_INSTITUTION_ID_KEY", wim.z.d(o0.b(String.class)));
        cVar.I0("ONE_OFF_TOP_UP_BRANCH_ID_KEY");
    }

    public final pfm.r n(String institutionId, String code, String str) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(code, "code");
        w21.o oVar = (w21.o) this.f305582a;
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(code, "code");
        return te0.w.g0(oVar.f293931a.uploadInstitutionData(new AuthorizationRequestDto(institutionId, null, null, code, null, str, null, null, Constants.TAG_PCI_PED_CHECKSUM, null)));
    }
}
