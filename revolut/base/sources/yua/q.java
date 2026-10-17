package yua;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import efm.d0;
import efm.r;
import g48.r0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.v;
import qua.z;
import r10.t;
import rfm.f0;
import skm.p0;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements xua.a {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s71.a f316963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f316964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f316965c;
    public final al4.p d;
    public final y45.h e;
    public final ti9.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f316966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wsg.n f316967h;
    public final com.revolut.domain.interactors.transactions.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l80.e f316968j;
    public final kg.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lal.a f316969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final eli.j f316970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f316971n;
    public final dva.a o;

    public q(s71.a repository, xoj.a featuresInteractor, gte.a featureToggleInteractor, al4.p creditCardProductFeatureTogglesInteractor, y45.h loanProductFeatureTogglesInteractor, ti9.h payLaterProductFeatureTogglesInteractor, r0 jointAccountsInteractor, wsg.n walletInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, l80.e dateProvider, kg.o gson, lal.a transferLocationInteractor, eli.j twoFaErrorHandler, t recurringPaymentJuniorAccountsInteractor, dva.a hiddenPaymentsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureTogglesInteractor, "payLaterProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(transferLocationInteractor, "transferLocationInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(recurringPaymentJuniorAccountsInteractor, "recurringPaymentJuniorAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenPaymentsInteractor, "hiddenPaymentsInteractor");
        this.f316963a = repository;
        this.f316964b = featuresInteractor;
        this.f316965c = featureToggleInteractor;
        this.d = creditCardProductFeatureTogglesInteractor;
        this.e = loanProductFeatureTogglesInteractor;
        this.f = payLaterProductFeatureTogglesInteractor;
        this.f316966g = jointAccountsInteractor;
        this.f316967h = walletInteractor;
        this.i = transactionsInteractor;
        this.f316968j = dateProvider;
        this.k = gson;
        this.f316969l = transferLocationInteractor;
        this.f316970m = twoFaErrorHandler;
        this.f316971n = recurringPaymentJuniorAccountsInteractor;
        this.o = hiddenPaymentsInteractor;
    }

    public final d0 f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        d0 d0VarG = new ufm.i(m(), new yta.c(3, new c(this, id10, 0)), 0).g(sjg.a.a(this.f316970m));
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        return d0VarG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r11, java.lang.String r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof yua.k
            if (r0 == 0) goto L13
            r0 = r13
            yua.k r0 = (yua.k) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yua.k r0 = new yua.k
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f316948x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            goto La0
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            java.lang.String r11 = r0.f316947w
            s71.a r12 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r13)
        L3c:
            r5 = r11
            goto L5a
        L3e:
            yhm.o.b(r13)
            ufm.b r13 = r10.m()
            r0.u = r12
            s71.a r2 = r10.f316963a
            r0.v = r2
            r0.f316947w = r11
            r0.z = r4
            java.lang.Object r13 = nim.a.b(r13, r0)
            if (r13 != r1) goto L56
            goto L9f
        L56:
            r5 = r2
            r2 = r12
            r12 = r5
            goto L3c
        L5a:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            hbd.a r13 = (hbd.a) r13
            r11 = 0
            r0.u = r11
            r0.v = r11
            r0.f316947w = r11
            r0.z = r3
            a31.x r12 = (a31.x) r12
            com.revolut.data.network.services.RecurringPaymentService r3 = r12.f999a
            com.revolut.data.network.models.recurringpayment.ActivateSubscriptionRequest r4 = new com.revolut.data.network.models.recurringpayment.ActivateSubscriptionRequest
            if (r2 != 0) goto L74
            r7 = r11
            goto L75
        L74:
            r7 = r2
        L75:
            r8 = 2
            r9 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r11 = "SUBSCRIPTION_BRAND_BLOCK"
            efm.d0 r11 = r3.activateSubscription(r4, r11)
            ufm.i r11 = r12.d(r11, r13, r2)
            ufm.n r11 = te0.w.i0(r11)
            pfm.h r12 = new pfm.h
            r13 = 4
            r12.<init>(r11, r13)
            java.lang.String r11 = "ignoreElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.lang.Object r11 = nim.a.a(r12, r0)
            if (r11 != r1) goto L9b
            goto L9d
        L9b:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L9d:
            if (r11 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yua.q.g(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.HashSet r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yua.l
            if (r0 == 0) goto L13
            r0 = r9
            yua.l r0 = (yua.l) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yua.l r0 = new yua.l
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f316951x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.util.HashSet r7 = r0.f316950w
            s71.a r8 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r9)
            goto L57
        L3c:
            yhm.o.b(r9)
            ufm.b r9 = r6.m()
            r0.u = r8
            s71.a r2 = r6.f316963a
            r0.v = r2
            r0.f316950w = r7
            r0.z = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L54
            goto L6f
        L54:
            r5 = r2
            r2 = r8
            r8 = r5
        L57:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            hbd.a r9 = (hbd.a) r9
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f316950w = r4
            r0.z = r3
            a31.x r8 = (a31.x) r8
            java.lang.Object r7 = r8.a(r7, r9, r2, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yua.q.h(java.util.HashSet, java.lang.String, gim.c):java.lang.Object");
    }

    public final r i(r rVar, Function2 function2) {
        return rd0.e.c(ta6.a.f(rd0.e.b(rVar), rd0.e.e(this.o.a(), h0.f322473a, new x18.c()), new y69.e(function2, null, 4)), kotlin.coroutines.g.f186406a);
    }

    public final ufm.i j(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        ufm.i iVar = new ufm.i(m(), new yta.c(2, new c(this, id10, 6)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i k(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        f0 f0VarF = new pfm.a(m(), new yta.c(14, new b(this, id10, str, 1)), 4).f(d0.m(qua.q.SUCCESS));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return ue0.e.D(f0VarF, new g(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yua.m
            if (r0 == 0) goto L13
            r0 = r9
            yua.m r0 = (yua.m) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yua.m r0 = new yua.m
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f316954x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L8f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r7 = r0.f316953w
            s71.a r8 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r9)
            goto L57
        L3c:
            yhm.o.b(r9)
            ufm.b r9 = r6.m()
            r0.u = r8
            s71.a r2 = r6.f316963a
            r0.v = r2
            r0.f316953w = r7
            r0.z = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L54
            goto L8e
        L54:
            r5 = r2
            r2 = r8
            r8 = r5
        L57:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            hbd.a r9 = (hbd.a) r9
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f316953w = r4
            r0.z = r3
            a31.x r8 = (a31.x) r8
            com.revolut.data.network.services.RecurringPaymentService r3 = r8.f999a
            if (r2 != 0) goto L6e
            r2 = r4
        L6e:
            efm.b r2 = r3.deleteSubscription(r7, r2)
            pfm.h r7 = r8.f(r7, r9)
            pfm.a r7 = r2.e(r7)
            java.lang.String r8 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            pfm.r r7 = te0.w.g0(r7)
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L8c:
            if (r7 != r1) goto L8f
        L8e:
            return r1
        L8f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yua.q.l(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final ufm.b m() {
        return w.o0(p0.f264003c, new y7i.h(this, null, 23));
    }

    public final sfm.b n(qua.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        sfm.b bVar = new sfm.b(m(), new yta.c(17, new yrb.i(this, type, 14)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final sfm.b o(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        sfm.b bVar = new sfm.b(m(), new yta.c(11, new c(this, id10, 3)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final r p(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return pd.b.r(nim.a.w(xua.a.b(this, null, 2), new f(z, this, 1)), new c(this, cardId, 4));
    }

    public final sfm.b q(String... receiverIds) {
        Intrinsics.checkNotNullParameter(receiverIds, "receiverIds");
        sfm.b bVar = new sfm.b(m(), new yta.c(15, new yrb.i(this, receiverIds, 13)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final sfm.b r(String receiverId) {
        Intrinsics.checkNotNullParameter(receiverId, "receiverId");
        sfm.b bVar = new sfm.b(m(), new yta.c(21, new c(this, receiverId, 5)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final r s(boolean z, z zVar, boolean z3) {
        sfm.b bVar = new sfm.b(m(), new yta.c(13, new f(z3, this, 0)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        sfm.b bVar2 = new sfm.b(new ufm.i(this.f316967h.E(AccountId.Personal.f51414a), new nd.m(), 1), new yta.c(18, new xnd.c(bVar, zVar, 7)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
        return nim.a.w(bVar2, new xyh.n(z, 16));
    }

    public final pfm.a t(boolean z) {
        pfm.a aVar = new pfm.a(m(), new h(new f(this, z), 0), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a u(qua.p pVar, boolean z) {
        String strE = pVar.e();
        int i = 10;
        pfm.a aVar = new pfm.a(m(), new yta.c(i, new w43.b(z, this, pVar.getId(), strE, 6)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a v(qua.p pVar, boolean z) {
        String strE = pVar.e();
        pfm.a aVar = new pfm.a(m(), new yta.c(6, new d(z, this, pVar, strE)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a w(String id10, fva.e frequency, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        pfm.a aVar = new pfm.a(m(), new yta.c(9, new e(this, id10, frequency, str, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a x(String id10, fva.e frequency, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        pfm.a aVar = new pfm.a(m(), new yta.c(12, new e(this, id10, frequency, str, 1)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final ufm.i y(qua.p payment, TransferReasonsValues transferReasonsValues, String str, v vVar) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        ufm.i iVar = new ufm.i(m(), new yta.c(24, new ryd.f((Object) this, (Object) payment, (Object) transferReasonsValues, str, (Object) vVar, 17)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r7, fva.e r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yua.p
            if (r0 == 0) goto L13
            r0 = r9
            yua.p r0 = (yua.p) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yua.p r0 = new yua.p
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f316961x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L96
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            fva.e r8 = r0.f316960w
            java.lang.String r7 = r0.v
            s71.a r2 = r0.u
            yhm.o.b(r9)
            goto L54
        L3c:
            yhm.o.b(r9)
            ufm.b r9 = r6.m()
            s71.a r2 = r6.f316963a
            r0.u = r2
            r0.v = r7
            r0.f316960w = r8
            r0.z = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L54
            goto L95
        L54:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            hbd.a r9 = (hbd.a) r9
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f316960w = r4
            r0.z = r3
            a31.x r2 = (a31.x) r2
            com.revolut.data.network.services.RecurringPaymentService r3 = r2.f999a
            com.revolut.data.network.models.recurringpayment.UpdateSubscriptionFrequencyRequest r5 = new com.revolut.data.network.models.recurringpayment.UpdateSubscriptionFrequencyRequest
            o9l.t r8 = com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapperKt.toDto(r8)
            r5.<init>(r8, r4)
            java.lang.String r8 = "SUBSCRIPTION_BRAND_BLOCK"
            efm.d0 r7 = r3.updateSubscriptionFrequency(r7, r5, r8)
            ufm.i r7 = r2.d(r7, r9, r4)
            ufm.n r7 = te0.w.i0(r7)
            pfm.h r8 = new pfm.h
            r9 = 4
            r8.<init>(r7, r9)
            java.lang.String r7 = "ignoreElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            java.lang.Object r7 = nim.a.a(r8, r0)
            if (r7 != r1) goto L91
            goto L93
        L91:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L93:
            if (r7 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yua.q.z(java.lang.String, fva.e, gim.c):java.lang.Object");
    }
}
