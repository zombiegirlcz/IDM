package su9;

import a80.h;
import android.content.Context;
import b22.j;
import bhm.f;
import bkl.g;
import cdh.m;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import e8h.k;
import e8h.o;
import efm.d0;
import efm.r;
import efm.w;
import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oim.n;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDate;
import tf1.l0;
import tgm.e;
import tnb.g0;
import ufm.i;
import vkm.d;
import xzg.b0;
import xzg.e0;
import xzg.z;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements p, f, hm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f265693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f265694b;

    public c(tl0.a base64Wrapper, g ssoStateJwtPayloadJsonDecoder) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ssoStateJwtPayloadJsonDecoder, "ssoStateJwtPayloadJsonDecoder");
        this.f265693a = base64Wrapper;
        this.f265694b = ssoStateJwtPayloadJsonDecoder;
    }

    @Override // hm.a
    public void a(String extractedValue, boolean z) {
        n nVar = (n) this.f265694b;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        zp0.p pVar = (zp0.p) this.f265693a;
        String strReplace = pVar.f324136m.replace(extractedValue, "");
        if (!z) {
            nVar.invoke(Boolean.FALSE, null, null, strReplace);
            return;
        }
        try {
            nVar.invoke(Boolean.valueOf(z), LocalDate.parse(extractedValue, pVar.f324138p).toDate(), null, extractedValue);
        } catch (IllegalFieldValueException e) {
            nVar.invoke(Boolean.valueOf(z), null, e, strReplace);
        } catch (IllegalInstantException e2) {
            nVar.invoke(Boolean.valueOf(z), null, e2, strReplace);
        } catch (IllegalArgumentException e4) {
            nVar.invoke(Boolean.valueOf(z), null, e4, strReplace);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a3, code lost:
    
        r0 = new zh.b[]{r7, r5}[1].f322203b;
        r1 = r22 - r0.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        if (r6 >= r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
    
        r23[r4 + r6] = 0;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        java.lang.System.arraycopy(r0, 0, r23, r4 + r1, r0.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su9.c.c(int, int[]):void");
    }

    @Override // bhm.g
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable d(gim.c r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su9.c.d(gim.c):java.io.Serializable");
    }

    public d0 e(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        String canonicalPath = file.getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath, "getCanonicalPath(...)");
        if (a0.H(canonicalPath, ((Context) this.f265694b).getFilesDir().getCanonicalPath() + File.separator, false)) {
            return d0.m(file);
        }
        i iVar = new i(((h) ((zk0.b) this.f265693a)).l("RevolutChat"), new z1i.n(new j(this, file), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r11 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f265693a
            pn2.d r0 = (pn2.d) r0
            boolean r1 = r11 instanceof yp2.c
            if (r1 == 0) goto L17
            r1 = r11
            yp2.c r1 = (yp2.c) r1
            int r2 = r1.f315766y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f315766y = r2
            goto L1c
        L17:
            yp2.c r1 = new yp2.c
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.f315764w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f315766y
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L4b
            if (r3 == r6) goto L47
            if (r3 == r5) goto L41
            if (r3 != r4) goto L39
            java.util.List r10 = r1.v
            java.util.List r10 = (java.util.List) r10
            com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus r0 = r1.u
            yhm.o.b(r11)
            goto Lb3
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus r10 = r1.u
            yhm.o.b(r11)
            goto L79
        L47:
            yhm.o.b(r11)
            goto L65
        L4b:
            yhm.o.b(r11)
            r1.f315766y = r6
            r0.getClass()
            oqk.i r11 = new oqk.i
            r3 = 27
            r11.<init>(r0, r10, r7, r3)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r10, r11, r1)
            if (r11 != r2) goto L65
            goto Laf
        L65:
            r10 = r11
            com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus r10 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus) r10
            mn2.a r11 = r10.f64064a
            mn2.a r3 = mn2.a.OVERSTAP
            if (r11 != r3) goto L7f
            r1.u = r10
            r1.f315766y = r5
            java.io.Serializable r11 = r9.d(r1)
            if (r11 != r2) goto L79
            goto Laf
        L79:
            java.util.List r11 = (java.util.List) r11
        L7b:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L82
        L7f:
            zhm.f0 r11 = zhm.f0.f322471a
            goto L7b
        L82:
            mn2.a r3 = r11.f64064a
            mn2.a r5 = mn2.a.CASS
            if (r3 == r5) goto L8c
            mn2.a r5 = mn2.a.MOBILITY
            if (r3 != r5) goto Lb6
        L8c:
            wn2.d r3 = r11.f64065b
            wn2.d r5 = wn2.d.FULL
            if (r3 != r5) goto Lb6
            r1.u = r11
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            r1.v = r3
            r1.f315766y = r4
            r0.getClass()
            pe2.l r3 = new pe2.l
            r4 = 18
            r3.<init>(r0, r7, r4)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r3, r1)
            if (r0 != r2) goto Lb0
        Laf:
            return r2
        Lb0:
            r8 = r0
            r0 = r11
            r11 = r8
        Lb3:
            java.util.List r11 = (java.util.List) r11
            goto Lbb
        Lb6:
            zhm.f0 r0 = zhm.f0.f322471a
            r8 = r0
            r0 = r11
            r11 = r8
        Lbb:
            com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview r1 = new com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview
            r1.<init>(r0, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: su9.c.f(java.lang.String, gim.c):java.lang.Object");
    }

    public m g(x9h.g router, w0h.f widgetDataProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        return new m(router, widgetDataProvider, (ish.a0) this.f265693a, (cdh.n) this.f265694b);
    }

    public d h(wgl.d params) {
        zel.b bVar;
        Intrinsics.checkNotNullParameter(params, "params");
        yhl.g gVar = (yhl.g) this.f265693a;
        bil.a aVar = (bil.a) this.f265694b;
        Intrinsics.checkNotNullParameter(params, "params");
        Map map = aVar.f15531a;
        if (params instanceof wgl.c) {
            bVar = zel.b.TOP_MOVERS;
        } else if (params instanceof wgl.b) {
            bVar = zel.b.MOST_TRADED;
        } else {
            if (!(params instanceof wgl.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = zel.b.MOST_OWNED;
        }
        String tradeDiscoveryKey = ((xhl.a) r0.h(bVar, map)).a(params);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(tradeDiscoveryKey, "tradeDiscoveryKey");
        os2.g gVar2 = gVar.f314179a;
        Intrinsics.checkNotNullParameter(tradeDiscoveryKey, "tradeDiscoveryKey");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) gVar2.f229224b).b(tradeDiscoveryKey, loadingStrategy);
    }

    public r i(z assetType, b0 timeSpan, e0 mostTradedStorageStrategy) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(mostTradedStorageStrategy, "mostTradedStorageStrategy");
        o oVar = (o) this.f265693a;
        k params = new k(assetType, timeSpan, mostTradedStorageStrategy);
        Intrinsics.checkNotNullParameter(params, "params");
        w wVarApply = ((x8h.e0) this.f265694b).apply(oVar.d.f(params, false));
        Intrinsics.i(wVarApply, "null cannot be cast to non-null type io.reactivex.Observable<com.revolut.data.model.Data<kotlin.collections.Map<com.revolut.feature.wealth.api.domain.model.MostTradedAssetsSection, kotlin.collections.List<com.revolut.feature.wealth.api.domain.model.MostTradedAssetWithInstrument>>>>");
        return (r) wVarApply;
    }

    @Override // bhm.g
    public boolean isEmpty() {
        return ((ugm.a) ((AtomicReference) this.f265694b).get()) == ((ugm.a) ((AtomicReference) this.f265693a).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r9 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(n61.b r8, gim.c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f265694b
            d3j.b r0 = (d3j.b) r0
            boolean r1 = r9 instanceof v4j.b
            if (r1 == 0) goto L17
            r1 = r9
            v4j.b r1 = (v4j.b) r1
            int r2 = r1.f286102x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f286102x = r2
            goto L1c
        L17:
            v4j.b r1 = new v4j.b
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f286102x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r9)
            goto L86
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            int r8 = r1.u
            yhm.o.b(r9)
            goto L62
        L3c:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f265693a
            com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData r9 = (com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData) r9
            java.lang.String r9 = a5j.b.a(r9)
            if (r9 != 0) goto L4b
            r9 = r5
            goto L4c
        L4b:
            r9 = 0
        L4c:
            if (r9 == 0) goto L96
            com.revolut.domain.models.beneficiary.BeneficiaryMatchScope r3 = com.revolut.domain.models.beneficiary.BeneficiaryMatchScope.ACCOUNT_DETAILS
            ufm.n r8 = r0.e(r8, r3)
            r1.u = r9
            r1.f286102x = r5
            java.lang.Object r8 = nim.a.b(r8, r1)
            if (r8 != r2) goto L5f
            goto L85
        L5f:
            r6 = r9
            r9 = r8
            r8 = r6
        L62:
            n61.e r9 = (n61.e) r9
            boolean r3 = r9 instanceof n61.f
            if (r3 == 0) goto L96
            n61.f r9 = (n61.f) r9
            java.lang.String r9 = r9.f212683a
            w4l.h r3 = w4l.h.f294642c
            efm.r r9 = r0.j(r9, r3)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r0 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r1.u = r8
            r1.f286102x = r4
            java.lang.Object r9 = nim.a.b(r9, r1)
            if (r9 != r2) goto L86
        L85:
            return r2
        L86:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            java.lang.Object r8 = r9.getContent()
            f5j.a r8 = (f5j.a) r8
            if (r8 == 0) goto L96
            v4j.l r9 = new v4j.l
            r9.<init>(r8)
            return r9
        L96:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: su9.c.j(n61.b, gim.c):java.lang.Object");
    }

    @Override // bhm.g
    public boolean offer(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        ugm.a aVar = new ugm.a();
        aVar.f280044a = obj2;
        ((ugm.a) ((AtomicReference) this.f265693a).getAndSet(aVar)).lazySet(aVar);
        return true;
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        try {
            ((e) this.f265694b).f271211c.accept(th10);
        } catch (Throwable th11) {
            ce9.m.F(th11);
            th10 = new CompositeException(th10, th11);
        }
        ((p) this.f265693a).onError(th10);
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        ((p) this.f265693a).onSubscribe(disposable);
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ((p) this.f265693a).onSuccess(obj2);
    }

    @Override // bhm.g
    public Object poll() {
        ugm.a aVar;
        AtomicReference atomicReference = (AtomicReference) this.f265694b;
        ugm.a aVar2 = (ugm.a) atomicReference.get();
        ugm.a aVar3 = (ugm.a) aVar2.get();
        if (aVar3 != null) {
            Object obj2 = aVar3.f280044a;
            aVar3.f280044a = null;
            atomicReference.lazySet(aVar3);
            return obj2;
        }
        if (aVar2 == ((ugm.a) ((AtomicReference) this.f265693a).get())) {
            return null;
        }
        do {
            aVar = (ugm.a) aVar2.get();
        } while (aVar == null);
        Object obj3 = aVar.f280044a;
        aVar.f280044a = null;
        atomicReference.lazySet(aVar);
        return obj3;
    }

    public c(d4m.a upiConfirmationMandateContentProvider, d4m.a upiConfirmationAmendmentContentProvider) {
        Intrinsics.checkNotNullParameter(upiConfirmationMandateContentProvider, "upiConfirmationMandateContentProvider");
        Intrinsics.checkNotNullParameter(upiConfirmationAmendmentContentProvider, "upiConfirmationAmendmentContentProvider");
        this.f265693a = upiConfirmationMandateContentProvider;
        this.f265694b = upiConfirmationAmendmentContentProvider;
    }

    public c(BeneficiaryCreationKompotInputData inputData, d3j.b beneficiaryInteractor, a5j.b beneficiaryCreationFlowModelUtils) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryCreationFlowModelUtils, "beneficiaryCreationFlowModelUtils");
        this.f265693a = inputData;
        this.f265694b = beneficiaryInteractor;
    }

    public c(ish.a0 widgetsUiInteractor, cdh.n topMoversWidgetSelectionCache) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(topMoversWidgetSelectionCache, "topMoversWidgetSelectionCache");
        this.f265693a = widgetsUiInteractor;
        this.f265694b = topMoversWidgetSelectionCache;
    }

    public c(yhl.g tradeDiscoveryInteractor, bil.a collectionKeyMapper) {
        Intrinsics.checkNotNullParameter(tradeDiscoveryInteractor, "tradeDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(collectionKeyMapper, "collectionKeyMapper");
        this.f265693a = tradeDiscoveryInteractor;
        this.f265694b = collectionKeyMapper;
    }

    public c(o repository, x8h.e0 transformer) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f265693a = repository;
        this.f265694b = transformer;
    }

    public c(l0 widgetFlowHelper, ryc.a widgetDefaultStateProvider) {
        Intrinsics.checkNotNullParameter(widgetFlowHelper, "widgetFlowHelper");
        Intrinsics.checkNotNullParameter(widgetDefaultStateProvider, "widgetDefaultStateProvider");
        this.f265693a = widgetFlowHelper;
        this.f265694b = widgetDefaultStateProvider;
    }

    public c(wa7.m hiddenAccountsInteractor, za7.c hiddenBalancesIdProvider) {
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenBalancesIdProvider, "hiddenBalancesIdProvider");
        this.f265693a = hiddenAccountsInteractor;
        this.f265694b = hiddenBalancesIdProvider;
    }

    public c(yu9.e paymentBubbleTagFactory, sj5.a depositTransactionStateChecker, hk5.c withdrawalTransactionStateChecker) {
        Intrinsics.checkNotNullParameter(paymentBubbleTagFactory, "paymentBubbleTagFactory");
        Intrinsics.checkNotNullParameter(depositTransactionStateChecker, "depositTransactionStateChecker");
        Intrinsics.checkNotNullParameter(withdrawalTransactionStateChecker, "withdrawalTransactionStateChecker");
        this.f265693a = paymentBubbleTagFactory;
        this.f265694b = depositTransactionStateChecker;
    }

    public c(g0 cryptoExchangeFeesFeatureChecker, vf5.d cryptoExchangeFeesTierBoundsInteractor) {
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesFeatureChecker, "cryptoExchangeFeesFeatureChecker");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesTierBoundsInteractor, "cryptoExchangeFeesTierBoundsInteractor");
        this.f265693a = cryptoExchangeFeesFeatureChecker;
        this.f265694b = cryptoExchangeFeesTierBoundsInteractor;
    }

    public c(Context context, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f265693a = fileSystemRepository;
        this.f265694b = context;
    }

    public c(kb8.a searchableItemProvider, trk.a assetType) {
        Intrinsics.checkNotNullParameter(searchableItemProvider, "searchableItemProvider");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f265693a = searchableItemProvider;
        this.f265694b = assetType;
    }

    public c(pn2.d repository, xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f265693a = repository;
        this.f265694b = recurringPaymentInteractor;
    }

    public c(ppk.f ratesInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f265693a = ratesInteractor;
        this.f265694b = walletInteractor;
    }

    public c(usc.a fiatExchangeOrderQuoteInteractor, o7.b orderQuoteInteractor) {
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteInteractor, "fiatExchangeOrderQuoteInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        this.f265693a = fiatExchangeOrderQuoteInteractor;
        this.f265694b = orderQuoteInteractor;
    }

    public c(tul.b sorter, xge.b0 repository) {
        Intrinsics.checkNotNullParameter(sorter, "sorter");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f265693a = sorter;
        this.f265694b = repository;
    }

    public c(zh.a aVar) {
        this.f265693a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f265694b = arrayList;
        arrayList.add(new zh.b(aVar, new int[]{1}));
    }

    public c() {
        AtomicReference atomicReference = new AtomicReference();
        this.f265693a = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.f265694b = atomicReference2;
        ugm.a aVar = new ugm.a();
        atomicReference2.lazySet(aVar);
    }

    public c(wv0.b create, wv0.b configure) {
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(configure, "configure");
        this.f265693a = create;
        this.f265694b = configure;
    }

    public c(e eVar, p pVar) {
        this.f265694b = eVar;
        this.f265693a = pVar;
    }

    public c(zp0.p pVar, n nVar) {
        this.f265693a = pVar;
        this.f265694b = nVar;
    }

    public c(aoi.h trace) {
        AtomicBoolean reported = new AtomicBoolean(false);
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(reported, "reported");
        this.f265693a = trace;
        this.f265694b = reported;
    }

    public c(vzc.b bVar, vzc.c cVar) {
        this.f265693a = cVar;
        this.f265694b = e4m.b.b(new d2h.b(bVar, 29, cVar, this));
    }
}
