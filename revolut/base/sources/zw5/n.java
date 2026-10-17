package zw5;

import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract$InputData;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteParams;
import com.revolut.feature.wealth.impl.data.repositories.CollectionsRepository$Companion;
import efm.r;
import java.util.List;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import xzg.o;
import ymk.u;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends jki.g implements e {
    public final ae5.a A;
    public a2 B;
    public final a C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionAmountScreenContract$InputData f325744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8h.g f325745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f325746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f325747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f325748t;
    public final vw5.a u;
    public final xw5.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ww5.a f325749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vo9.a f325750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final djb.n f325751y;
    public final zrc.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p stateMapper, CryptoCommodityBuyCollectionAmountScreenContract$InputData inputData, x8h.g collectionsInteractor, wsg.n walletInteractor, w80.b amountFormatter, j60.a bottomDialogExtension, uw5.b collectionMapper, vw5.a collectionBuyFlowDialogMapper, xw5.d sharedDialogDisplayer, ww5.a firstTimeBuyingDialogProvider, vo9.a paymentPocketMapper, djb.n savingsAccountsDetailsInteractor, zrc.d cryptoScaInteractor, ae5.a cryptoConvertDialogDisclaimerExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(collectionMapper, "collectionMapper");
        Intrinsics.checkNotNullParameter(collectionBuyFlowDialogMapper, "collectionBuyFlowDialogMapper");
        Intrinsics.checkNotNullParameter(sharedDialogDisplayer, "sharedDialogDisplayer");
        Intrinsics.checkNotNullParameter(firstTimeBuyingDialogProvider, "firstTimeBuyingDialogProvider");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        this.f325744p = inputData;
        this.f325745q = collectionsInteractor;
        this.f325746r = walletInteractor;
        this.f325747s = amountFormatter;
        this.f325748t = bottomDialogExtension;
        this.u = collectionBuyFlowDialogMapper;
        this.v = sharedDialogDisplayer;
        this.f325749w = firstTimeBuyingDialogProvider;
        this.f325750x = paymentPocketMapper;
        this.f325751y = savingsAccountsDetailsInteractor;
        this.z = cryptoScaInteractor;
        this.A = cryptoConvertDialogDisclaimerExtension;
        xi0.a aVar = xi0.b.Companion;
        String str = inputData.f71538a;
        aVar.getClass();
        dj0.d dVar = new dj0.d(0L, xi0.a.a(str));
        Data data = new Data(null, null, true, 3, null);
        this.C = new a(dVar, new dj0.d(inputData.f71540c, xi0.a.a(str)), new CollectionQuote(f0.f322471a, dVar, dVar, dVar, dVar, dVar, dVar, dVar, null), null, null, null, data, false);
    }

    public static void A2(n nVar, q0i.i iVar, String str, dj0.d dVar, dj0.d dVar2, List list, int i) {
        if ((i & 1) != 0) {
            iVar = ((a) nVar.t2()).e;
        }
        q0i.i iVar2 = iVar;
        if ((i & 2) != 0) {
            str = ((a) nVar.t2()).f;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            dVar = ((a) nVar.t2()).f325724a;
        }
        dj0.d totalRequestedAmount = dVar;
        if ((i & 8) != 0) {
            dVar2 = ((a) nVar.t2()).f325725b;
        }
        dj0.d pocketBalance = dVar2;
        if ((i & 16) != 0) {
            list = ((a) nVar.t2()).d;
        }
        List list2 = list;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(totalRequestedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        List collectionCurrencies = list2 == null ? ((xzg.m) zi0.c.I(((a) nVar.t2()).f325727g)).d : list2;
        a2 a2Var = nVar.B;
        if (a2Var != null) {
            a2Var.f(null);
        }
        x8h.g gVar = nVar.f325745q;
        String collectionId = nVar.f325744p.f71539b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(totalRequestedAmount, "totalRequestedAmount");
        Intrinsics.checkNotNullParameter(collectionCurrencies, "collectionCurrencies");
        com.revolut.feature.wealth.impl.data.repositories.a aVar = gVar.f303339a;
        CollectionQuoteParams collectionQuoteParams = new CollectionQuoteParams((String) null, collectionCurrencies, totalRequestedAmount, 5);
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(collectionQuoteParams, "collectionQuoteParams");
        r rVarF = aVar.f95518n.f(new CollectionsRepository$Companion.CollectionQuoteRequestInfo(collectionId, collectionQuoteParams), true);
        yrk.e onError = new yrk.e(nVar, 24, iVar2, str2);
        Intrinsics.checkNotNullParameter(rVarF, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        r rVarDoOnNext = rVarF.doOnNext(new v4a.i(8, new v25.k(onError, 11)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        r rVarDoOnNext2 = rVarDoOnNext.doOnNext(new zmg.c(new h(nVar, 0), 28));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
        nVar.B = yji.l.b1(nVar, new u(rd0.e.b(m70.a.g(rVarDoOnNext2, null, null, 3)), totalRequestedAmount, 17), null, new sxg.h(2, nVar, totalRequestedAmount, pocketBalance, list2, iVar2, str2, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r3.Z2() == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(zw5.n r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw5.n.y2(zw5.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(zw5.n r11, xi0.b r12, java.lang.String r13, k1j.a r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw5.n.z2(zw5.n, xi0.b, java.lang.String, k1j.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        xi0.a aVar = xi0.b.Companion;
        CryptoCommodityBuyCollectionAmountScreenContract$InputData cryptoCommodityBuyCollectionAmountScreenContract$InputData = this.f325744p;
        String str = cryptoCommodityBuyCollectionAmountScreenContract$InputData.f71538a;
        aVar.getClass();
        xi0.b currency = xi0.a.a(str);
        String str2 = cryptoCommodityBuyCollectionAmountScreenContract$InputData.d;
        k1j.a aVar2 = k1j.a.POCKETS;
        Intrinsics.checkNotNullParameter(currency, "currency");
        n2(new xkl.e(str2, currency, this, aVar2, (Continuation) null), new whi.b(6));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new zp5.g(this, continuation, 7), new whi.b(6));
        yji.l.b1(this, rd0.e.b(this.f325745q.b(this.f325744p.f71539b, o.CRYPTO)), null, new zt4.l(this, continuation, 10), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.C;
    }
}
