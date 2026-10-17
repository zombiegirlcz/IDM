package ubj;

import androidx.room.util.DBUtil;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.transaction.CryptoCounterpartyAddressEmbeddedEntity;
import com.revolut.data.database.models.transaction.CryptoCounterpartyDetailsEmbeddedEntity;
import com.revolut.data.database.models.transaction.CryptoCounterpartyEmbeddedEntity;
import com.revolut.feature.crypto.remittance.models.CounterpartyRequiredFields;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.remittance.models.CryptoBeneficiaryRecipientAddress;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.crypto_deposits.impl.network.CryptoDepositsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import lbj.k;
import le.u1;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import u4i.u;
import ufm.i;
import wk5.n;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements ibj.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoDepositsService f278921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f278922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f278923c;
    public final nbj.a d;
    public final o e;
    public final ik5.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f278924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f278925h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f278926j;
    public final re0.c k;

    public h(CryptoDepositsService api2, j memoryCache, j timed15mCache, nbj.a databaseDao, o gson, ik5.f cryptoRestrictedResponseProcessor, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(timed15mCache, "timed15mCache");
        Intrinsics.checkNotNullParameter(databaseDao, "databaseDao");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(cryptoRestrictedResponseProcessor, "cryptoRestrictedResponseProcessor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f278921a = api2;
        this.f278922b = memoryCache;
        this.f278923c = timed15mCache;
        this.d = databaseDao;
        this.e = gson;
        this.f = cryptoRestrictedResponseProcessor;
        final int i = 6;
        Function2 function2 = new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i2 = i;
                h hVar = this.f278914b;
                switch (i2) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar2 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar));
                            it9 = it8;
                        }
                        aVar2.getClass();
                        DBUtil.performBlocking(aVar2.f214082a, false, true, new n45.b(aVar2, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        };
        final int i2 = 2;
        this.f278924g = new w4l.f(function2, new a(this, i2), new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i22 = i2;
                h hVar = this.f278914b;
                switch (i22) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar2 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar));
                            it9 = it8;
                        }
                        aVar2.getClass();
                        DBUtil.performBlocking(aVar2.f214082a, false, true, new n45.b(aVar2, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        }, new u8c.c(19), new u(20), null, null, null, BERTags.FLAGS);
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i22 = i3;
                h hVar = this.f278914b;
                switch (i22) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar2 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar));
                            it9 = it8;
                        }
                        aVar2.getClass();
                        DBUtil.performBlocking(aVar2.f214082a, false, true, new n45.b(aVar2, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        };
        a aVar = new a(this, i3);
        final int i5 = 4;
        Function2 function23 = new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar2;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i22 = i5;
                h hVar = this.f278914b;
                switch (i22) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar22 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar2 = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar2 = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar2));
                            it9 = it8;
                        }
                        aVar22.getClass();
                        DBUtil.performBlocking(aVar22.f214082a, false, true, new n45.b(aVar22, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        };
        a aVar2 = new a(this, i5);
        final int i6 = 5;
        this.f278925h = new w4l.f(function22, aVar, function23, aVar2, new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar22;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i22 = i6;
                h hVar = this.f278914b;
                switch (i22) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar222 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar22 = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar22 = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar22));
                            it9 = it8;
                        }
                        aVar222.getClass();
                        DBUtil.performBlocking(aVar222.f214082a, false, true, new n45.b(aVar222, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 7;
        Function2 function24 = new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar22;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i22 = i21;
                h hVar = this.f278914b;
                switch (i22) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar222 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar22 = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar22 = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar22));
                            it9 = it8;
                        }
                        aVar222.getClass();
                        DBUtil.performBlocking(aVar222.f214082a, false, true, new n45.b(aVar222, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        };
        final int i22 = 0;
        this.i = new w4l.f(function24, new a(this, i22), new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar22;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i222 = i22;
                h hVar = this.f278914b;
                switch (i222) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar222 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar22 = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar22 = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar22));
                            it9 = it8;
                        }
                        aVar222.getClass();
                        DBUtil.performBlocking(aVar222.f214082a, false, true, new n45.b(aVar222, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i32 = 1;
        Continuation continuation = null;
        this.f278926j = new x4l.c(new f(this, continuation, i32), new a(this, i32), new Function2(this) { // from class: ubj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f278914b;

            {
                this.f278914b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                lbj.e eVar;
                lbj.c cVar;
                Iterator it8;
                CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity;
                lbj.a aVar22;
                String str;
                Map mapQ;
                String str2;
                CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity;
                String str3;
                CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity;
                String str4;
                lbj.d dVar;
                int i222 = i32;
                h hVar = this.f278914b;
                switch (i222) {
                    case 0:
                        n validation = (n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(validation, "validation");
                        hVar.f278923c.f("CACHE_KEY_RESTRICTION_VALIDATION", validation);
                        return Unit.f186387a;
                    case 1:
                        Unit domain = (Unit) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        hVar.f278922b.f("CACHE_KEY_ENSURE_FOR_AVAILABLE_BLOCKCHAINS", domain);
                        return Unit.f186387a;
                    case 2:
                        d params = (d) obj2;
                        CryptoDepositAddress cryptoAddress = (CryptoDepositAddress) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                        hVar.f278922b.f("CACHE_KEY_CRYPTO_ADDRESSES" + params.f278917a + params.f278918b.name(), cryptoAddress);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<List<tbj.b>> actionRequiredDeposits = hVar.f278921a.getActionRequiredDeposits();
                        c cVar2 = new c(0, new u8c.c(17));
                        actionRequiredDeposits.getClass();
                        i iVar = new i(actionRequiredDeposits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List actionRequiredDeposits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits2, "actionRequiredDeposits");
                        hVar.f278922b.f("CACHE_KEY_ACTION_REQUIRED_DEPOSITS", actionRequiredDeposits2);
                        return Unit.f186387a;
                    case 5:
                        List actionRequiredDeposits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(actionRequiredDeposits3, "actionRequiredDeposits");
                        nbj.a aVar222 = hVar.d;
                        List list = actionRequiredDeposits3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            yk5.a aVar3 = (yk5.a) it9.next();
                            Object obj4 = sbj.a.f261592a;
                            Intrinsics.checkNotNullParameter(aVar3, "<this>");
                            String str5 = aVar3.f314566a;
                            String strH = u1.h(aVar3.f314567b, sbj.b.f261595a);
                            yk5.d dVar2 = aVar3.f314568c;
                            if (dVar2 != null) {
                                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                                long epochMilli = dVar2.f314573a.toEpochMilli();
                                String str6 = dVar2.f314574b;
                                String str7 = dVar2.f314575c;
                                String str8 = dVar2.d;
                                dj0.d dVar3 = dVar2.e;
                                jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
                                yk5.c cVar3 = dVar2.f;
                                if (cVar3 != null) {
                                    ArrayList arrayList2 = cVar3.f314572a;
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) it10.next();
                                        String str9 = cryptoWithdrawFeesBreakdownDetail.f70990a;
                                        Iterator it11 = it10;
                                        String str10 = cryptoWithdrawFeesBreakdownDetail.f70991b;
                                        String str11 = cryptoWithdrawFeesBreakdownDetail.f70992c;
                                        jo3.b bVarA2 = hx7.a.A(cryptoWithdrawFeesBreakdownDetail.d);
                                        dj0.d dVar4 = cryptoWithdrawFeesBreakdownDetail.e;
                                        arrayList3.add(new k(bVarA2, str9, str10, dVar4 != null ? hx7.a.A(dVar4) : null, str11));
                                        it10 = it11;
                                    }
                                    dVar = new lbj.d(arrayList3);
                                } else {
                                    str4 = str7;
                                    dVar = null;
                                }
                                eVar = new lbj.e(epochMilli, str6, str4, str8, bVarA, dVar);
                            } else {
                                eVar = null;
                            }
                            List list2 = aVar3.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                String strH2 = u1.h((yk5.f) it12.next(), sbj.a.f);
                                if (strH2 != null) {
                                    arrayList4.add(strH2);
                                }
                            }
                            yk5.b bVar = aVar3.e;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                cVar = new lbj.c(bVar.f314570a, bVar.f314571b);
                            } else {
                                cVar = null;
                            }
                            CryptoAddressCounterparty cryptoAddressCounterparty = aVar3.f;
                            if (cryptoAddressCounterparty != null) {
                                Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
                                String str12 = cryptoAddressCounterparty.f70977a;
                                String str13 = cryptoAddressCounterparty.f70978b;
                                wk5.g gVar = cryptoAddressCounterparty.f70979c;
                                String strH3 = gVar != null ? u1.h(gVar, sbj.a.f261592a) : null;
                                wk5.h hVar2 = cryptoAddressCounterparty.d;
                                String strH4 = hVar2 != null ? u1.h(hVar2, sbj.a.f261593b) : null;
                                wk5.d dVar5 = cryptoAddressCounterparty.e;
                                String strH5 = dVar5 != null ? u1.h(dVar5, sbj.a.f261594c) : null;
                                String str14 = cryptoAddressCounterparty.f;
                                wk5.f fVar = cryptoAddressCounterparty.f70981h;
                                String strH6 = fVar != null ? u1.h(fVar, sbj.a.d) : null;
                                wk5.e eVar2 = cryptoAddressCounterparty.i;
                                String strH7 = eVar2 != null ? u1.h(eVar2, sbj.a.e) : null;
                                CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
                                if (ownershipPayload != null) {
                                    str = str12;
                                    mapQ = foh.i.q(new Pair("token", ownershipPayload.f70983a));
                                } else {
                                    str = str12;
                                    mapQ = null;
                                }
                                Instant instant = cryptoAddressCounterparty.k;
                                Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressCounterparty.f70980g;
                                if (cryptoAddressRecipientDetails != null) {
                                    Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
                                    String strName = cryptoAddressRecipientDetails.f70985b.name();
                                    String str15 = cryptoAddressRecipientDetails.f70984a;
                                    String str16 = cryptoAddressRecipientDetails.f70986c;
                                    String str17 = cryptoAddressRecipientDetails.e;
                                    CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
                                    if (cryptoBeneficiaryRecipientAddress != null) {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = new CryptoCounterpartyAddressEmbeddedEntity(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d);
                                    } else {
                                        str3 = str15;
                                        it8 = it9;
                                        str2 = str13;
                                        cryptoCounterpartyAddressEmbeddedEntity = null;
                                    }
                                    cryptoCounterpartyDetailsEmbeddedEntity = new CryptoCounterpartyDetailsEmbeddedEntity(strName, str3, str16, str17, cryptoCounterpartyAddressEmbeddedEntity);
                                } else {
                                    it8 = it9;
                                    str2 = str13;
                                    cryptoCounterpartyDetailsEmbeddedEntity = null;
                                }
                                cryptoCounterpartyEmbeddedEntity = new CryptoCounterpartyEmbeddedEntity(str, str2, strH3, strH4, strH5, str14, strH6, strH7, mapQ, lValueOf, cryptoCounterpartyDetailsEmbeddedEntity);
                            } else {
                                it8 = it9;
                                cryptoCounterpartyEmbeddedEntity = null;
                            }
                            CounterpartyRequiredFields counterpartyRequiredFields = aVar3.f314569g;
                            if (counterpartyRequiredFields != null) {
                                ArrayList arrayList5 = counterpartyRequiredFields.f70975a;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(((wk5.c) it13.next()).name());
                                }
                                ArrayList arrayList7 = counterpartyRequiredFields.f70976b;
                                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                                Iterator it14 = arrayList7.iterator();
                                while (it14.hasNext()) {
                                    arrayList8.add(((wk5.c) it14.next()).name());
                                }
                                aVar22 = new lbj.a(arrayList6, arrayList8);
                            } else {
                                aVar22 = null;
                            }
                            arrayList.add(new lbj.b(str5, strH, eVar, arrayList4, cVar, cryptoCounterpartyEmbeddedEntity, aVar22));
                            it9 = it8;
                        }
                        aVar222.getClass();
                        DBUtil.performBlocking(aVar222.f214082a, false, true, new n45.b(aVar222, arrayList, 28));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                        String str18 = params2.f278917a;
                        String strH8 = u1.h(params2.f278918b, wk5.b.f298250a);
                        if (strH8 == null) {
                            m70.a.c(t0.f186434a);
                            strH8 = "";
                        }
                        d0<Response<String>> addressResponse = cryptoDepositsService.getAddressResponse(str18, strH8);
                        c cVar4 = new c(2, new a(hVar, 6));
                        addressResponse.getClass();
                        i iVar2 = new i(addressResponse, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<Unit> d0VarValidateRestriction = hVar.f278921a.validateRestriction();
                        c cVar5 = new c(1, new u8c.c(20));
                        d0VarValidateRestriction.getClass();
                        i iVar3 = new i(d0VarValidateRestriction, cVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return ue0.e.I(iVar3, h0.f322473a, new a(hVar, 5));
                }
            }
        }, new rp1.c(2, 11, continuation), new nfj.i(3, 25, continuation));
        re0.d dVar = new re0.d(memoryCache, storage);
        u8c.c cVar = new u8c.c(18);
        u uVar = new u(18);
        u uVar2 = new u(19);
        f fVar = new f(this, continuation, 0);
        Type type = new TypeToken<al5.a>() { // from class: com.revolut.retail.feature.crypto_deposits.impl.repositories.CryptoDepositsRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.k = new re0.c(dVar, cVar, type, uVar, uVar2, fVar);
    }
}
