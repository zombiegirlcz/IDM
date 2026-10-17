package e0f;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.network.models.topup.CardTopupFeeDto;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class z implements y51.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p71.a f121703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f121704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f121705c;
    public final wwh.a d;
    public final sh3.a e;
    public final dha.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l93.f f121706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f121707h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f121708j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f121709l;

    public z(p71.a externalCardsRepository, wsg.n walletInteractor, ang.f userInteractor, wwh.a cpgInteractor, sh3.a checkoutInteractor, dha.c pricingPlansRepository, l93.f revolutCardsInteractor, gte.a featureToggleInteractor, lfm.c compositeDisposable, i deleteExternalCardInteractor) {
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(deleteExternalCardInteractor, "deleteExternalCardInteractor");
        this.f121703a = externalCardsRepository;
        this.f121704b = walletInteractor;
        this.f121705c = userInteractor;
        this.d = cpgInteractor;
        this.e = checkoutInteractor;
        this.f = pricingPlansRepository;
        this.f121706g = revolutCardsInteractor;
        this.f121707h = featureToggleInteractor;
        this.i = deleteExternalCardInteractor;
        ihm.f fVarD = v0.a.d("create(...)");
        ihm.f fVarD2 = v0.a.d("create(...)");
        ihm.f fVarD3 = v0.a.d("create(...)");
        this.f121708j = v0.a.d("create(...)");
        ihm.f fVarD4 = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        ihm.f fVarD5 = v0.a.d("create(...)");
        this.f121709l = v0.a.d("create(...)");
        efm.r rVarSwitchMap = te0.w.w0(fVarD).switchMap(new k(new dz7.k(this, 20), 6));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarFlatMapSingle = rVarSwitchMap.flatMapSingle(new ag.j(new akl.s(this, 10), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        efm.r rVarDoOnNext = rVarFlatMapSingle.doOnNext(new k(new ald.o(1, fVarD2, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 3), 7));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        efm.r rVarOnErrorResumeNext = rVarDoOnNext.onErrorResumeNext(new n(0, new bo.c(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m(0, t.f121686a), new m(0, u.f121690a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        te0.w.j0(compositeDisposable, cVarSubscribe);
        efm.r rVarSwitchMap2 = te0.w.w0(fVarD3).switchMap(new k(new l(this, 2), 8));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarOnErrorResumeNext2 = rVarSwitchMap2.onErrorResumeNext(new n(0, new bo.c(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new m(0, v.f121692a), new m(0, w.f121696a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        te0.w.j0(compositeDisposable, cVarSubscribe2);
        efm.r rVarSwitchMap3 = te0.w.w0(fVarD4).switchMap(new k(new l(this, 3), 9));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        efm.r rVarOnErrorResumeNext3 = rVarSwitchMap3.onErrorResumeNext(new n(0, new bo.c(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new m(0, x.f121700a), new m(0, y.f121702a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe3, "subscribe(...)");
        te0.w.j0(compositeDisposable, cVarSubscribe3);
        efm.b bVarSwitchMapCompletable = te0.w.w0(fVarD5).switchMapCompletable(new k(new l(this, 4), 11));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        n nVar = new n(0, new bo.c(new BreadcrumbException(), 1));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, nVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new m(0, s.f121683a), r.f121675a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(compositeDisposable, hVarW);
    }

    public static t61.g f(t61.g gVar) {
        t61.j jVarB = gVar.b();
        return t61.g.a(gVar, jVarB != null ? t61.j.a(jVarB) : null);
    }

    public final ufm.n a(long j2, String externalCardId, String currency) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter("", "issuerId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        u21.k kVar = (u21.k) this.f121703a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter("", "issuerId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        HashMap map = new HashMap();
        if (!kotlin.text.d0.W(externalCardId)) {
            map.put("externalCardId", externalCardId);
        }
        if (!kotlin.text.d0.W("")) {
            map.put("externalCardIssuerId", "");
        }
        efm.d0<CardTopupFeeDto> topUpByCardFee = kVar.f276535a.getTopUpByCardFee(map, currency, j2);
        u21.a aVar = new u21.a(5, new u21.b(5));
        topUpByCardFee.getClass();
        pfm.z zVar = new pfm.z(new ufm.i(topUpByCardFee, aVar, 1), 1, new tc7.m0(19), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return te0.w.i0(zVar);
    }

    public final ufm.n b(dj0.d amount, String firstNineDigits) {
        Intrinsics.checkNotNullParameter(firstNineDigits, "firstNineDigits");
        Intrinsics.checkNotNullParameter(amount, "amount");
        u21.k kVar = (u21.k) this.f121703a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(firstNineDigits, "firstNineDigits");
        Intrinsics.checkNotNullParameter(amount, "amount");
        efm.d0<CardTopupFeeDto> firstCardTopupFee = kVar.f276535a.getFirstCardTopupFee(firstNineDigits, amount.f115083b.f306286a, amount.f115082a);
        u21.a aVar = new u21.a(6, new u21.b(7));
        firstCardTopupFee.getClass();
        pfm.z zVar = new pfm.z(new ufm.i(firstCardTopupFee, aVar, 1), 1, new tc7.m0(20), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return te0.w.i0(zVar);
    }

    public final efm.r c(String id10, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "externalCardId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        u21.k kVar = (u21.k) this.f121703a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarSwitchMap = kVar.f276538g.e(id10, loadingStrategy).switchMap(new dz7.l(new j(this, id10, 0), 29));
        if (this.f121707h.a(TopupApi$Toggles.ExternalCardsAvailability.f90465c)) {
            rVarSwitchMap = rVarSwitchMap.map(new k(new dz7.k(this, 18), 0));
        }
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "transformIfFeatureDisabled(...)");
        return rVarSwitchMap;
    }

    public final efm.r d() {
        efm.r rVarB = ((u21.k) this.f121703a).b();
        if (!this.f121707h.a(TopupApi$Toggles.ExternalCardsAvailability.f90465c)) {
            return rVarB;
        }
        efm.r map = rVarB.map(new dz7.l(new dz7.k(this, 16), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final pfm.f e(String str) {
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(str);
        wsg.n nVar = this.f121704b;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        pfm.f fVarO = efm.b.o(zhm.v.k(nVar.n0(bVarA, personal), nVar.i0(personal), new pfm.h(((pfk.p0) this.f).e(), 4), ((ei3.m) this.e).m(AccountId.Personal.f51414a), ((ha3.x) this.f121706g).C(), ((u21.k) this.f121703a).c()));
        Intrinsics.checkNotNullExpressionValue(fVarO, "merge(...)");
        return fVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dj0.d r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.z.g(dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e0f.q
            if (r0 == 0) goto L13
            r0 = r7
            e0f.q r0 = (e0f.q) r0
            int r1 = r0.f121669x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121669x = r1
            goto L18
        L13:
            e0f.q r0 = new e0f.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121669x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L4d
        L38:
            yhm.o.b(r7)
            ang.f r7 = r5.f121705c
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.u = r6
            r0.f121669x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4d
            goto L7c
        L4d:
            do3.n r7 = (do3.n) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.X0
            boolean r7 = te0.w.S(r7, r2)
            if (r7 == 0) goto L7e
            if (r6 == 0) goto L7e
            r0.u = r6
            r0.f121669x = r3
            p71.a r6 = r5.f121703a
            u21.k r6 = (u21.k) r6
            r6.getClass()
            u21.j r7 = new u21.j
            r2 = 0
            r7.<init>(r6, r2, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r7, r0)
            if (r6 != r1) goto L7d
        L7c:
            return r1
        L7d:
            return r6
        L7e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.z.h(boolean, gim.c):java.lang.Object");
    }
}
