package hp5;

import androidx.room.util.DBUtil;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWallet;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService;
import com.youTransactor.uCube.rpc.Constants;
import do3.q;
import dp4.z0;
import dp5.a0;
import dp5.h1;
import dp5.j0;
import dp5.k1;
import efm.d0;
import hp3.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import wim.z;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements no5.b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoWithdrawService f154482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f154483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f154484c;
    public final ne0.j d;
    public final ro5.d e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ik5.f f154485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f154486h;
    public final f01.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f154487j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final re0.c f154488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f154489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f154490n;
    public final w4l.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qe0.o f154491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final re0.c f154492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w4l.f f154493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w4l.f f154494s;

    public o(CryptoWithdrawService api2, ne0.j memoryCache, ne0.j timed15mCache, ne0.j timed30sCache, ro5.d databaseDao, ue0.c storage, ik5.f cryptoRestrictedResponseProcessor, CoroutineScope appCoroutineScope, f01.c uiKitResources, l80.e dateProvider, ik5.d cryptoAddressTypeUiMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(timed15mCache, "timed15mCache");
        Intrinsics.checkNotNullParameter(timed30sCache, "timed30sCache");
        Intrinsics.checkNotNullParameter(databaseDao, "databaseDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cryptoRestrictedResponseProcessor, "cryptoRestrictedResponseProcessor");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(cryptoAddressTypeUiMapper, "cryptoAddressTypeUiMapper");
        this.f154482a = api2;
        this.f154483b = memoryCache;
        this.f154484c = timed15mCache;
        this.d = timed30sCache;
        this.e = databaseDao;
        this.f = storage;
        this.f154485g = cryptoRestrictedResponseProcessor;
        this.f154486h = appCoroutineScope;
        this.i = uiKitResources;
        final int i = 0;
        this.f154487j = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar.f115083b.f306286a, dVar.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i2 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i2++;
                                    }
                                }
                                if (i2 >= 0) {
                                    arrayListF1.set(i2, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar2 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar2.f255882a, false, true, new pud.b(dVar2, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i3 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i3++;
                                }
                            }
                            if (i3 >= 0) {
                                arrayListF12.set(i3, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, null, null, null, null, 254);
        final int i2 = 6;
        this.k = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar.f115083b.f306286a, dVar.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar2 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar2.f255882a, false, true, new pud.b(dVar2, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i3 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i3++;
                                }
                            }
                            if (i3 >= 0) {
                                arrayListF12.set(i3, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, null, null, null, null, 254);
        re0.d dVar = new re0.d(memoryCache, storage);
        r rVar = new r(18);
        hkb.e eVar = new hkb.e(24);
        hkb.e eVar2 = new hkb.e(25);
        Continuation continuation = null;
        k kVar = new k(this, continuation, 1);
        Type type = new TypeToken<k1>() { // from class: com.revolut.feature.crypto.withdraw.impl.repositories.CryptoWithdrawRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f154488l = new re0.c(dVar, rVar, type, eVar, eVar2, kVar);
        final int i3 = 15;
        final int i5 = 16;
        this.f154489m = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i32 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i32 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i32++;
                                }
                            }
                            if (i32 >= 0) {
                                arrayListF12.set(i32, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 12), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i32 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i32 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i32++;
                                }
                            }
                            if (i32 >= 0) {
                                arrayListF12.set(i32, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 17;
        final int i21 = 1;
        this.f154490n = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i32 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i32 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i32++;
                                }
                            }
                            if (i32 >= 0) {
                                arrayListF12.set(i32, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 13), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i32 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i32 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i32++;
                                }
                            }
                            if (i32 >= 0) {
                                arrayListF12.set(i32, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 2;
        final int i32 = 3;
        final int i33 = 4;
        this.o = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 5), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 6), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 5;
        this.f154491p = q.f(new x4l.c(new k(this, continuation, 0), new r(14), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar2 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar2.f115083b.f306286a, dVar2.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar22 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar22.f255882a, false, true, new pud.b(dVar22, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new e31.i(25), new z0(this, continuation, 28)), appCoroutineScope);
        re0.d dVar2 = new re0.d(memoryCache, storage);
        r rVar2 = new r(15);
        hkb.e eVar3 = new hkb.e(22);
        hkb.e eVar4 = new hkb.e(23);
        e6d.f fVar = new e6d.f(this, continuation, 16);
        Type type2 = new TypeToken<al5.a>() { // from class: com.revolut.feature.crypto.withdraw.impl.repositories.CryptoWithdrawRepositoryImpl$special$$inlined$invoke$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        this.f154492q = new re0.c(dVar2, rVar2, type2, eVar3, eVar4, fVar);
        final int i59 = 7;
        final int i66 = 8;
        final int i74 = 9;
        new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 7), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 8), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i92 = 10;
        final int i96 = 11;
        final int i99 = 12;
        this.f154493r = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 9), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i96) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 10), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i99) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i100 = 13;
        final int i101 = 14;
        this.f154494s = new w4l.f(new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, new a(this, 11), new Function2(this) { // from class: hp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f154466b;

            {
                this.f154466b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<a0> feesForAddress;
                switch (i101) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        h params = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean zK = params.f154474b.k();
                        o oVar = this.f154466b;
                        if (zK) {
                            feesForAddress = oVar.f154482a.getInitialFeesForAddress(params.f154473a);
                        } else {
                            dj0.d dVar22 = params.f154474b;
                            feesForAddress = oVar.f154482a.getFeesForAddress(params.f154473a, dVar22.f115083b.f306286a, dVar22.f115082a, params.f154475c.f306286a, params.d);
                        }
                        b bVar = new b(new r(6), 0);
                        feesForAddress.getClass();
                        ufm.i iVar = new ufm.i(feesForAddress, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d params2 = (d) obj2;
                        CryptoAddressHostingCheckResult result = (CryptoAddressHostingCheckResult) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.f154466b.f154483b.f("CACHE_KEY_ADDRESS_HOSTING_CHECK_CACHE_KEY" + params2.a() + params2.b(), result);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        e params3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        o oVar2 = this.f154466b;
                        d0<List<dp5.f>> addresses = oVar2.f154482a.getAddresses(Boolean.valueOf(params3.f154469a));
                        b bVar2 = new b(new a(oVar2, 0), 3);
                        addresses.getClass();
                        ufm.i iVar2 = new ufm.i(addresses, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        e params4 = (e) obj2;
                        List cryptoAddresses = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                        ne0.j jVar = this.f154466b.f154483b;
                        List list = (List) jVar.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        if (list == null || list.isEmpty() || params4.f154470b) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", cryptoAddresses);
                        } else {
                            ArrayList arrayListF1 = zhm.d0.f1(list);
                            for (Object obj4 : cryptoAddresses) {
                                Iterator it8 = arrayListF1.iterator();
                                int i222 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i222 = -1;
                                    } else if (!Intrinsics.f(((CryptoAddress) it8.next()).f71059a, ((CryptoAddress) obj4).f71059a)) {
                                        i222++;
                                    }
                                }
                                if (i222 >= 0) {
                                    arrayListF1.set(i222, obj4);
                                } else {
                                    arrayListF1.add(obj4);
                                }
                            }
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF1);
                        }
                        if (params4.f154469a) {
                            jVar.f("CACHE_KEY_CRYPTO_ADDRESSES_ARE_HIDDEN_CACHED", Boolean.TRUE);
                        }
                        return Unit.f186387a;
                    case 4:
                        e params5 = (e) obj2;
                        List cryptoAddresses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddresses2, "cryptoAddresses");
                        ro5.d dVar222 = this.f154466b.e;
                        List list2 = cryptoAddresses2;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(cp5.a.c((CryptoAddress) it9.next()));
                        }
                        DBUtil.performBlocking(dVar222.f255882a, false, true, new pud.b(dVar222, arrayList, params5.f154470b, 8));
                        return Unit.f186387a;
                    case 5:
                        CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        ne0.j jVar2 = this.f154466b.f154483b;
                        List list3 = (List) jVar2.get("CACHE_KEY_CRYPTO_ADDRESSES");
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", u.c(cryptoAddress));
                        } else {
                            int size = list3.size();
                            ArrayList arrayListF12 = zhm.d0.f1(list3);
                            Iterator it10 = arrayListF12.iterator();
                            int i322 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i322 = -1;
                                } else if (!Intrinsics.f(((CryptoAddress) it10.next()).f71059a, cryptoAddress.f71059a)) {
                                    i322++;
                                }
                            }
                            if (i322 >= 0) {
                                arrayListF12.set(i322, cryptoAddress);
                            } else {
                                arrayListF12.add(size, cryptoAddress);
                            }
                            jVar2.f("CACHE_KEY_CRYPTO_ADDRESSES", arrayListF12);
                        }
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        i params6 = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params6, "params");
                        d0<a0> feesForReturnDeposit = this.f154466b.f154482a.getFeesForReturnDeposit(params6.f154476a, params6.f154477b);
                        b bVar3 = new b(new r(9), 4);
                        feesForReturnDeposit.getClass();
                        ufm.i iVar3 = new ufm.i(feesForReturnDeposit, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<dp5.r>> wallets = this.f154466b.f154482a.getWallets();
                        b bVar4 = new b(new r(20), 11);
                        wallets.getClass();
                        ufm.i iVar4 = new ufm.i(wallets, bVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        List cryptoWallets = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                        this.f154466b.f154483b.f("CACHE_KEY_CRYPTO_WALLETS", cryptoWallets);
                        return Unit.f186387a;
                    case 9:
                        List cryptoWallets2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cryptoWallets2, "cryptoWallets");
                        ro5.d dVar3 = this.f154466b.e;
                        List<CryptoWallet> list5 = cryptoWallets2;
                        ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                        for (CryptoWallet cryptoWallet : list5) {
                            Intrinsics.checkNotNullParameter(cryptoWallet, "<this>");
                            String str = cryptoWallet.f71084a;
                            String str2 = cryptoWallet.f71085b;
                            String strName = cryptoWallet.f71086c.name();
                            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoWallet.d;
                            ep5.c cVarF = null;
                            qo5.j jVarD = cryptoAddressRecipientDetails != null ? cp5.a.d(cryptoAddressRecipientDetails) : null;
                            List list6 = cryptoWallet.e;
                            boolean z = cryptoWallet.f;
                            String strName2 = cryptoWallet.f71087g.name();
                            CryptoWithdrawLimits cryptoWithdrawLimits = cryptoWallet.f71088h;
                            if (cryptoWithdrawLimits != null) {
                                cVarF = v04.b.F(cryptoWithdrawLimits);
                            }
                            arrayList2.add(new qo5.n(str, str2, strName, jVarD, list6, z, strName2, cVarF, cryptoWallet.i));
                        }
                        DBUtil.performBlocking(dVar3.f255882a, false, true, new ro5.b(dVar3, arrayList2, 0));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        xi0.b currency = (xi0.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        d0<dp5.d0> limits = this.f154466b.f154482a.getLimits(currency.f306286a);
                        b bVar5 = new b(new r(19), 10);
                        limits.getClass();
                        ufm.i iVar5 = new ufm.i(limits, bVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 11:
                        xi0.b currency2 = (xi0.b) obj2;
                        CryptoWithdrawLimits cryptoWithdrawLimits2 = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits2, "cryptoWithdrawLimits");
                        this.f154466b.d.f("CACHE_KEY_LIMITS_" + currency2.f306286a, cryptoWithdrawLimits2);
                        return Unit.f186387a;
                    case 12:
                        xi0.b currency3 = (xi0.b) obj2;
                        CryptoWithdrawLimits value = (CryptoWithdrawLimits) obj3;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f154466b.f.G(v04.b.F(value), j6.a.q("CryptoWithdraw_Limits", currency3.f306286a), z.d(o0.b(ep5.c.class)));
                        return Unit.f186387a;
                    case 13:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        o oVar3 = this.f154466b;
                        d0<Unit> d0VarValidateRestriction = oVar3.f154482a.validateRestriction();
                        b bVar6 = new b(new r(8), 2);
                        d0VarValidateRestriction.getClass();
                        ufm.i iVar6 = new ufm.i(d0VarValidateRestriction, bVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return ue0.e.I(iVar6, h0.f322473a, new a(oVar3, 2));
                    case 14:
                        wk5.n validation = (wk5.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        this.f154466b.f154484c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        f params7 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params7, "params");
                        d0<Map<String, h1>> blockchainRoughFees = this.f154466b.f154482a.getBlockchainRoughFees(params7.f154471a.f306286a, params7.f154472b);
                        b bVar7 = new b(new r(7), 1);
                        blockchainRoughFees.getClass();
                        ufm.i iVar7 = new ufm.i(blockchainRoughFees, bVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 16:
                        f params8 = (f) obj2;
                        Map fees = (Map) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        this.f154466b.f154483b.f("CACHE_KEY_BLOCKCHAIN_ROUGH_FEES" + params8.b().f306286a + params8.a(), fees);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        d params9 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params9, "params");
                        d0<dp5.i> addressHostingCheckResult = this.f154466b.f154482a.getAddressHostingCheckResult(params9.f154467a, params9.f154468b);
                        b bVar8 = new b(new r(10), 9);
                        addressHostingCheckResult.getClass();
                        ufm.i iVar8 = new ufm.i(addressHostingCheckResult, bVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return ue0.e.D(iVar8, new r(16));
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static final String b(o oVar, wk5.k kVar) {
        return oVar.i.b(ik5.d.a(kVar)).toString();
    }

    public final pfm.r c(efm.b bVar) {
        sfm.b bVarG = bVar.g(no5.b.a(this, true, null, false, 6));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        t tVarL = mo3.a.n(bVarG).ignoreElements().l(new a08.d(this, 29));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return te0.w.g0(tVarL);
    }

    public final ufm.n d(ko5.m request) {
        Intrinsics.checkNotNullParameter(request, "request");
        d0<j0> d0VarExecuteWithdrawOrderV2 = this.f154482a.executeWithdrawOrderV2(vc.o.C(request), new wj0.b("IDEMPOTENCY_TAG_CRYPTO_WITHDRAW_V2"));
        m mVar = m.f;
        h35.c cVar = new h35.c();
        d0VarExecuteWithdrawOrderV2.getClass();
        ufm.i iVar = new ufm.i(d0VarExecuteWithdrawOrderV2, cVar, 1);
        int i = 3;
        ufm.f fVar = new ufm.f(iVar, new b(new a(this, i), 5), i);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return te0.w.i0(fVar);
    }
}
