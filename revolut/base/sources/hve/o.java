package hve;

import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import com.revolut.feature.topup_screen.impl.data.network.service.TopupMethodsService;
import com.revolut.feature.topup_screen.impl.data.repository.topup_methods.TopUpMethodsRequest;
import dp4.z0;
import g2e.m0;
import hu1.h0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import vkm.z1;
import wim.z;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f155848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopupMethodsService f155849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoredMethodService f155850c;
    public final nue.d d;
    public final nue.a e;
    public final kve.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xoj.a f155851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f155852h;
    public final awe.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CoroutineScope f155853j;
    public final x4l.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z1 f155854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j2 f155855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f155856n;
    public final qe0.o o;

    public o(ne0.j memoryCache, TopupMethodsService service, StoredMethodService storedMethodService, nue.f dtoMapper, nue.d entityMapper, nue.a cardSteeringSuggestedMethodDtoMapper, nue.b savedMethodMapper, kve.a storage, xoj.a featuresInteractor, gte.a featureToggleInteractor, awe.c topUpMethodResolver, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storedMethodService, "storedMethodService");
        Intrinsics.checkNotNullParameter(dtoMapper, "dtoMapper");
        Intrinsics.checkNotNullParameter(entityMapper, "entityMapper");
        Intrinsics.checkNotNullParameter(cardSteeringSuggestedMethodDtoMapper, "cardSteeringSuggestedMethodDtoMapper");
        Intrinsics.checkNotNullParameter(savedMethodMapper, "savedMethodMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(topUpMethodResolver, "topUpMethodResolver");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f155848a = memoryCache;
        this.f155849b = service;
        this.f155850c = storedMethodService;
        this.d = entityMapper;
        this.e = cardSteeringSuggestedMethodDtoMapper;
        this.f = storage;
        this.f155851g = featuresInteractor;
        this.f155852h = featureToggleInteractor;
        this.i = topUpMethodResolver;
        this.f155853j = appCoroutineScope;
        Continuation continuation = null;
        this.k = new x4l.c(new ghl.l(this, continuation, 10), new hs4.l(this, 24), new hfb.d(this, 28), new l(this, continuation, 1), new m0(this, continuation, 22));
        this.f155854l = q.b(1, 5, null);
        this.f155855m = q.c(null);
        x4l.c cVar = new x4l.c(new ghl.l(this, continuation, 9), new h0(22), new ht1.l(21), new l(this, continuation, 0), new z0(this, continuation, 29));
        this.f155856n = cVar;
        this.o = do3.q.f(cVar, appCoroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hve.o r10, java.lang.String r11, com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.o.a(hve.o, java.lang.String, com.revolut.feature.topup_screen.api.model.TopUpMethodsContext, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(hve.o r5, com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId r6, java.lang.String r7, com.revolut.domain.models.topup.methods.b r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.o.b(hve.o, com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId, java.lang.String, com.revolut.domain.models.topup.methods.b, gim.c):java.lang.Object");
    }

    public final void c(TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        kve.b bVar = (kve.b) this.f;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        bVar.f190095a.I0(kve.b.e(topUpMethodsContext.f90550a, topUpMethodsContext.f90551b));
        this.f155848a.remove(hx7.b.t(topUpMethodsContext));
    }

    public final Object d(TopUpMethodsContext topUpMethodsContext, gim.c cVar) {
        hsd.c cVar2 = new hsd.c(this, topUpMethodsContext, (Continuation) null, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, cVar2, cVar);
    }

    public final TopupMethod e(TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        TopupMethod topupMethod = (TopupMethod) this.f155848a.get(hx7.b.t(topUpMethodsContext));
        if (topupMethod != null) {
            return topupMethod;
        }
        kve.b bVar = (kve.b) this.f;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        fue.a aVar = (fue.a) j6.a.k(fue.a.class, bVar.f190095a, kve.b.e(topUpMethodsContext.f90550a, topUpMethodsContext.f90551b));
        if (aVar != null) {
            try {
                return nue.b.a(aVar);
            } catch (Exception e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        return null;
    }

    public final vkm.d f(yte.n contextType, boolean z, w4l.k loadingStrategy, CheckoutContext checkoutContext) {
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.k.b(new TopUpMethodsRequest(contextType, Boolean.valueOf(z), checkoutContext), loadingStrategy);
    }

    public final Object g(yte.n nVar, boolean z, CheckoutContext checkoutContext, gim.c cVar) {
        Object objD = this.k.d(new TopUpMethodsRequest(nVar, Boolean.valueOf(z), checkoutContext), true, cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r12.emit(r5, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r12.emit(r5, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r12, com.revolut.domain.models.topup.methods.b r13, com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof hve.k
            if (r0 == 0) goto L13
            r0 = r15
            hve.k r0 = (hve.k) r0
            int r1 = r0.f155842x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155842x = r1
            goto L18
        L13:
            hve.k r0 = new hve.k
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f155842x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r15)
            goto Lb3
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            yhm.o.b(r15)
            goto L99
        L3a:
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r14 = r0.u
            yhm.o.b(r15)
            goto L69
        L40:
            yhm.o.b(r15)
            com.revolut.domain.models.topup.methods.TopupMethod r15 = r11.e(r14)
            if (r15 != 0) goto L4c
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L4c:
            boolean r2 = r15 instanceof com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod
            if (r2 == 0) goto Lb6
            com.revolut.domain.models.topup.methods.TopupMethod$StoredMethod r15 = (com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod) r15
            java.lang.String r15 = r15.getF60502a()
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r15, r12)
            if (r12 == 0) goto Lb6
            r0.u = r14
            r0.f155842x = r5
            awe.c r12 = r11.i
            java.lang.Object r15 = r12.c(r13, r14, r0)
            if (r15 != r1) goto L69
            goto Lb2
        L69:
            r6 = r15
            com.revolut.domain.models.topup.methods.TopupMethod r6 = (com.revolut.domain.models.topup.methods.TopupMethod) r6
            vkm.z1 r12 = r11.f155854l
            r13 = 0
            if (r6 != 0) goto L9c
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r2 = "No default method found in methods after deleting method"
            r15.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r13, r13, r15, r2)
            r11.c(r14)
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r13
            r0.f155842x = r4
            java.lang.Object r12 = r12.emit(r5, r0)
            if (r12 != r1) goto L99
            goto Lb2
        L99:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L9c:
            r11.i(r6, r14)
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 2
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r13
            r0.f155842x = r3
            java.lang.Object r12 = r12.emit(r5, r0)
            if (r12 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lb6:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.o.h(java.lang.String, com.revolut.domain.models.topup.methods.b, com.revolut.feature.topup_screen.api.model.TopUpMethodsContext, gim.c):java.lang.Object");
    }

    public final void i(TopupMethod domain, TopUpMethodsContext topUpMethodsContext) {
        TopupMethod topupMethod;
        fue.a methodEntity;
        Intrinsics.checkNotNullParameter(domain, "method");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        Intrinsics.checkNotNullParameter(domain, "domain");
        if (domain instanceof TopupMethod.OtherMethod) {
            methodEntity = nue.b.b(domain, ((TopupMethod.OtherMethod) domain).f60440a.name(), null, null, null, null, null);
            topupMethod = domain;
        } else {
            topupMethod = domain;
            if (topupMethod instanceof TopupMethod.StoredMethod.Card) {
                TopupMethod.StoredMethod.Card card = (TopupMethod.StoredMethod.Card) topupMethod;
                String str = card.f60455a;
                String strName = card.k.name();
                String str2 = card.f60461l;
                CardholderVerificationStatus cardholderVerificationStatus = card.f60462m;
                methodEntity = nue.b.b(topupMethod, "STORED_CARD", str, strName, str2, cardholderVerificationStatus != null ? cardholderVerificationStatus.name() : null, card.f60463n);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.Openbanking) {
                TopupMethod.StoredMethod.Openbanking openbanking = (TopupMethod.StoredMethod.Openbanking) topupMethod;
                methodEntity = nue.b.b(topupMethod, "OPEN_BANKING", openbanking.f60481a, openbanking.f60486j.name(), null, null, null);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.PayTo) {
                TopupMethod.StoredMethod.PayTo payTo = (TopupMethod.StoredMethod.PayTo) topupMethod;
                methodEntity = nue.b.b(topupMethod, "PAY_TO", payTo.f60490a, payTo.f60495j.name(), null, null, payTo.k);
            } else if (topupMethod instanceof TopupMethod.SuggestedMethod.OpenBankingInstitution) {
                methodEntity = nue.b.b(topupMethod, "SUGGESTED", ((TopupMethod.SuggestedMethod.OpenBankingInstitution) topupMethod).f60509b, null, null, null, null);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.NetBanking) {
                TopupMethod.StoredMethod.NetBanking netBanking = (TopupMethod.StoredMethod.NetBanking) topupMethod;
                methodEntity = nue.b.b(topupMethod, netBanking.f60480j ? "MCY_NET_BANKING" : "NET_BANKING", netBanking.f60475a, netBanking.k.name(), null, null, null);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.UpiApp) {
                TopupMethod.StoredMethod.UpiApp upiApp = (TopupMethod.StoredMethod.UpiApp) topupMethod;
                methodEntity = nue.b.b(topupMethod, upiApp.f60507j ? "MCY_UPI_APP" : "UPI_APP", upiApp.f60502a, upiApp.k.name(), null, null, null);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) {
                TopupMethod.StoredMethod.PixSmartTransfer pixSmartTransfer = (TopupMethod.StoredMethod.PixSmartTransfer) topupMethod;
                methodEntity = nue.b.b(topupMethod, "PIX_SMART_TRANSFER", pixSmartTransfer.f60496a, pixSmartTransfer.f60501j.name(), null, null, null);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.Akahu) {
                TopupMethod.StoredMethod.Akahu akahu = (TopupMethod.StoredMethod.Akahu) topupMethod;
                methodEntity = nue.b.b(topupMethod, "AKAHU", akahu.f60449a, akahu.f60454j.name(), null, null, null);
            } else if (topupMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect) {
                TopupMethod.StoredMethod.GmoPgBankDirect gmoPgBankDirect = (TopupMethod.StoredMethod.GmoPgBankDirect) topupMethod;
                methodEntity = nue.b.b(topupMethod, "GMO_PG_BANK_DIRECT", gmoPgBankDirect.f60467a, gmoPgBankDirect.f60472j.name(), null, null, null);
            } else {
                if (topupMethod instanceof TopupMethod.SuggestedMethod.OpenbankingStoredMethod) {
                    IllegalStateException illegalStateException = new IllegalStateException("Suggested OB stored method shouldn't be saved in cache, should be mapped to appropriate StoredMethod top-up method");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (topupMethod instanceof TopupMethod.SuggestedMethod.OtherMethod) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Suggested other method shouldn't be saved in cache, should be mapped to appropriate Other top-up method");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    if (!(topupMethod instanceof TopupMethod.SuggestedMethod.PixSmartTransferInstitution)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException3 = new IllegalStateException("Suggested PixSmartTransferInstitution shouldn't be saved in cache, it's only used as recommended method without preselection");
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                }
                methodEntity = null;
            }
        }
        if (methodEntity != null) {
            kve.b bVar = (kve.b) this.f;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(methodEntity, "methodEntity");
            Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
            bVar.f190095a.G(methodEntity, kve.b.e(topUpMethodsContext.f90550a, topUpMethodsContext.f90551b), z.d(o0.b(fue.a.class)));
            this.f155848a.f(hx7.b.t(topUpMethodsContext), topupMethod);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r5.emit(r10, r2) == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof hve.m
            if (r2 == 0) goto L17
            r2 = r1
            hve.m r2 = (hve.m) r2
            int r3 = r2.f155845x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f155845x = r3
            goto L1c
        L17:
            hve.m r2 = new hve.m
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f155845x
            vkm.z1 r5 = r0.f155854l
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L47
            if (r4 == r8) goto L40
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            yhm.o.b(r1)
            goto L85
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r1)
            goto L6c
        L40:
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r4 = r2.u
            yhm.o.b(r1)
            r1 = r4
            goto L61
        L47:
            yhm.o.b(r1)
            com.revolut.data.model.Data r10 = new com.revolut.data.model.Data
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r10.<init>(r11, r12, r13, r14, r15)
            r1 = r17
            r2.u = r1
            r2.f155845x = r8
            java.lang.Object r4 = r5.emit(r10, r2)
            if (r4 != r3) goto L61
            goto L84
        L61:
            r2.u = r9
            r2.f155845x = r7
            java.lang.Object r1 = r0.d(r1, r2)
            if (r1 != r3) goto L6c
            goto L84
        L6c:
            r11 = r1
            com.revolut.domain.models.topup.methods.TopupMethod r11 = (com.revolut.domain.models.topup.methods.TopupMethod) r11
            if (r11 == 0) goto L88
            com.revolut.data.model.Data r10 = new com.revolut.data.model.Data
            r14 = 2
            r15 = 0
            r12 = 0
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r2.u = r9
            r2.f155845x = r6
            java.lang.Object r1 = r5.emit(r10, r2)
            if (r1 != r3) goto L85
        L84:
            return r3
        L85:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L88:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.o.j(com.revolut.feature.topup_screen.api.model.TopUpMethodsContext, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r17.f155854l.emit(r11, r8) == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r18, boolean r19, com.revolut.feature.topup_screen.api.model.CheckoutContext r20, gim.c r21) throws java.lang.Throwable {
        /*
            r17 = this;
            r2 = r17
            r0 = r21
            boolean r1 = r0 instanceof hve.n
            if (r1 == 0) goto L18
            r1 = r0
            hve.n r1 = (hve.n) r1
            int r3 = r1.f155847x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r1.f155847x = r3
        L16:
            r8 = r1
            goto L1e
        L18:
            hve.n r1 = new hve.n
            r1.<init>(r2, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.v
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.f155847x
            r10 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r10) goto L30
            yhm.o.b(r0)
            goto L7d
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            boolean r1 = r8.u
            yhm.o.b(r0)
            goto L63
        L3e:
            yhm.o.b(r0)
            com.revolut.domain.models.topup.methods.TopupMethod r4 = r17.e(r18)
            r5 = r19
            r8.u = r5
            r8.f155847x = r3
            hve.g r0 = new hve.g
            r7 = 0
            r1 = 0
            r3 = r18
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r1, r0, r8)
            if (r0 != r9) goto L61
            goto L7c
        L61:
            r1 = r19
        L63:
            r12 = r0
            com.revolut.domain.models.topup.methods.TopupMethod r12 = (com.revolut.domain.models.topup.methods.TopupMethod) r12
            com.revolut.data.model.Data r11 = new com.revolut.data.model.Data
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r8.u = r1
            r8.f155847x = r10
            vkm.z1 r0 = r2.f155854l
            java.lang.Object r0 = r0.emit(r11, r8)
            if (r0 != r9) goto L7d
        L7c:
            return r9
        L7d:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.o.k(com.revolut.feature.topup_screen.api.model.TopUpMethodsContext, boolean, com.revolut.feature.topup_screen.api.model.CheckoutContext, gim.c):java.lang.Object");
    }
}
