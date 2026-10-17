package cp5;

import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.remittance.models.CryptoBeneficiaryRecipientAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressDestinationTag;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import dp5.f;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import n14.k;
import qo5.g;
import qo5.j;
import qo5.m;
import wk5.h;
import wk5.i;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f107873a = r0.k(new Pair("ACTIVE", ko5.c.ACTIVE), new Pair("FAILED_SCREENING", ko5.c.FAILED_SCREENING), new Pair("SCREENING", ko5.c.SCREENING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f107874b = r0.k(new Pair("USER", i.USER), new Pair("INDIVIDUAL", i.INDIVIDUAL), new Pair("COMPANY", i.COMPANY));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final CryptoAddressRecipientDetails a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f248038a;
        i iVar = (i) u1.v(jVar.f248039b, f107874b);
        if (iVar == null) {
            iVar = i.UNSET;
        }
        i iVar2 = iVar;
        String str2 = jVar.f248040c;
        m mVar = jVar.d;
        return new CryptoAddressRecipientDetails(str, iVar2, str2, mVar != null ? new CryptoBeneficiaryRecipientAddress(mVar.f248042a, mVar.f248043b, mVar.f248044c, mVar.d) : null, jVar.e);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    public static final CryptoAddress b(f fVar, Function1 addressTypeLocalised) {
        wk5.a aVar;
        Iterator it8;
        String str;
        ko5.b bVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(addressTypeLocalised, "addressTypeLocalised");
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = fVar.f116747b;
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        String str3 = fVar.i;
        if (str3 == null || (aVar = (wk5.a) u1.v(str3, wk5.b.f298250a)) == null) {
            aVar = wk5.a.UNSPECIFIED;
        }
        wk5.a blockchain = aVar;
        String str4 = fVar.f116746a;
        String str5 = fVar.f116748c;
        String str6 = fVar.d;
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        CryptoAddressDestinationTag optional = cj9.c.m(blockchain) ? new CryptoAddressDestinationTag.Optional(str6) : CryptoAddressDestinationTag.None.f71070a;
        String str7 = fVar.e;
        boolean z = fVar.f;
        ko5.c cVar = (ko5.c) u1.v(fVar.f116749g, f107873a);
        if (cVar == null) {
            cVar = ko5.c.UNKNOWN;
        }
        ko5.c cVar2 = cVar;
        Iterable iterable = fVar.f116751j;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it9 = iterable.iterator();
        while (it9.hasNext()) {
            String str8 = (String) it9.next();
            ko5.b[] bVarArrValues = ko5.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    it8 = it9;
                    str = str4;
                    bVar = null;
                    break;
                }
                ko5.b bVar2 = bVarArrValues[i];
                it8 = it9;
                str = str4;
                if (a0.z(bVar2.name(), str8, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
                it9 = it8;
                str4 = str;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            it9 = it8;
            str4 = str;
        }
        String str9 = str4;
        Set setI1 = d0.i1(arrayList);
        boolean zJ = pd.b.j(fVar.f116750h);
        bl5.b bVar3 = fVar.k;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetailsX = bVar3 != null ? k.x(bVar3) : null;
        boolean zJ2 = pd.b.j(fVar.f116752l);
        dp5.d0 d0Var = fVar.f116753m;
        CryptoWithdrawLimits cryptoWithdrawLimitsS = d0Var != null ? v04.b.s(d0Var) : null;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(fVar.f116754n);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        cl5.a aVar3 = fVar.o;
        return new CryptoAddress(str9, bVarA, str5, optional, str7, z, cVar2, blockchain, setI1, zJ, cryptoAddressRecipientDetailsX, zJ2, cryptoWithdrawLimitsS, instantOfEpochMilli, aVar3 != null ? el5.a.a(aVar3) : null, (String) addressTypeLocalised.invoke(wk5.m.a(blockchain)));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    public static final qo5.d c(CryptoAddress cryptoAddress) {
        String str;
        String str2;
        qo5.c cVar;
        g gVar;
        Intrinsics.checkNotNullParameter(cryptoAddress, "<this>");
        String str3 = cryptoAddress.f71059a;
        String str4 = cryptoAddress.f71060b.f306286a;
        String str5 = cryptoAddress.f71061c;
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        CryptoAddressDestinationTag cryptoAddressDestinationTag = cryptoAddress.d;
        if (cryptoAddressDestinationTag instanceof CryptoAddressDestinationTag.Optional) {
            str = ((CryptoAddressDestinationTag.Optional) cryptoAddressDestinationTag).f71071a;
        } else {
            if (!(cryptoAddressDestinationTag instanceof CryptoAddressDestinationTag.None)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        String str6 = cryptoAddress.e;
        boolean z = cryptoAddress.f;
        String strG = u1.g(cryptoAddress.f71062g, f107873a);
        String strH = u1.h(cryptoAddress.f71063h, wk5.b.f298250a);
        Set set = cryptoAddress.i;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ko5.b) it8.next()).name());
        }
        boolean z3 = cryptoAddress.k;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddress.f71065l;
        j jVarD = cryptoAddressRecipientDetails != null ? d(cryptoAddressRecipientDetails) : null;
        boolean z4 = cryptoAddress.f71066m;
        CryptoWithdrawLimits cryptoWithdrawLimits = cryptoAddress.f71067n;
        ep5.c cVarF = cryptoWithdrawLimits != null ? v04.b.F(cryptoWithdrawLimits) : null;
        long epochMilli = cryptoAddress.o.toEpochMilli();
        CryptoAddressCounterparty cryptoAddressCounterparty = cryptoAddress.f71068p;
        if (cryptoAddressCounterparty != null) {
            Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
            String str7 = cryptoAddressCounterparty.f70977a;
            str2 = str;
            String str8 = cryptoAddressCounterparty.f70978b;
            wk5.g gVar2 = cryptoAddressCounterparty.f70979c;
            String strName = gVar2 != null ? gVar2.name() : null;
            h hVar = cryptoAddressCounterparty.d;
            String strName2 = hVar != null ? hVar.name() : null;
            wk5.d dVar = cryptoAddressCounterparty.e;
            String strName3 = dVar != null ? dVar.name() : null;
            String str9 = cryptoAddressCounterparty.f;
            CryptoAddressRecipientDetails cryptoAddressRecipientDetails2 = cryptoAddressCounterparty.f70980g;
            j jVarD2 = cryptoAddressRecipientDetails2 != null ? d(cryptoAddressRecipientDetails2) : null;
            wk5.f fVar = cryptoAddressCounterparty.f70981h;
            String strName4 = fVar != null ? fVar.name() : null;
            wk5.e eVar = cryptoAddressCounterparty.i;
            String strName5 = eVar != null ? eVar.name() : null;
            CryptoAddressCounterparty.OwnershipPayload ownershipPayload = cryptoAddressCounterparty.f70982j;
            if (ownershipPayload != null) {
                Intrinsics.checkNotNullParameter(ownershipPayload, "<this>");
                gVar = new g(ownershipPayload.f70983a);
            } else {
                gVar = null;
            }
            Instant instant = cryptoAddressCounterparty.k;
            cVar = new qo5.c(str7, str8, strName, strName2, strName3, str9, jVarD2, strName4, strName5, gVar, instant != null ? Long.valueOf(instant.toEpochMilli()) : null);
        } else {
            str2 = str;
            cVar = null;
        }
        return new qo5.d(str3, str6, str4, str5, str2, z, strG, strH, arrayList, z3, jVarD, z4, cVarF, epochMilli, cVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final j d(CryptoAddressRecipientDetails cryptoAddressRecipientDetails) {
        Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
        String str = cryptoAddressRecipientDetails.f70984a;
        String strG = u1.g(cryptoAddressRecipientDetails.f70985b, f107874b);
        String str2 = cryptoAddressRecipientDetails.f70986c;
        CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
        return new j(str, strG, str2, cryptoBeneficiaryRecipientAddress != null ? new m(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d) : null, cryptoAddressRecipientDetails.e);
    }
}
