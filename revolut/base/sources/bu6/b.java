package bu6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$SepaDirectDebit;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ks6.l;
import ks6.m;
import ks6.n;
import ks6.q;
import ks6.r;
import ks6.s;
import lr6.h0;
import mt6.a;
import pr6.j;
import pr6.o;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static final pr6.e a(q qVar) {
        String str;
        lr6.a aVar;
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3;
        dj0.d dVar;
        or6.g gVar;
        ?? arrayList;
        ?? arrayList2;
        String str2;
        or6.c cVar;
        String str3;
        or6.e eVar;
        or6.f fVar;
        or6.f fVar2;
        or6.e eVar2;
        or6.a aVar2;
        or6.a aVar3;
        or6.a aVar4;
        or6.a aVar5;
        or6.a aVar6;
        or6.a aVar7;
        or6.a aVar8;
        or6.a aVar9;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String value = qVar.f189236a;
        Intrinsics.checkNotNullParameter(value, "value");
        lr6.a aVarValueOf = lr6.a.valueOf(qVar.f189237b);
        LocalDateTime localDateTime4 = qVar.f189238c;
        LocalDateTime localDateTime5 = qVar.d;
        LocalDateTime localDateTime6 = qVar.e;
        dj0.d dVarV = hx7.a.v(qVar.f);
        dj0.d dVarV2 = hx7.a.v(qVar.f189239g);
        jo3.b bVar = qVar.f189240h;
        dj0.d dVarV3 = bVar != null ? hx7.a.v(bVar) : null;
        jo3.b bVar2 = qVar.i;
        dj0.d dVarV4 = bVar2 != null ? hx7.a.v(bVar2) : null;
        pr6.d dVarValueOf = pr6.d.valueOf(qVar.f189241j);
        j jVarValueOf = j.valueOf(qVar.k);
        n nVar = qVar.f189242l;
        if (nVar != null) {
            String bin = nVar.getBin();
            String lastFour = nVar.getLastFour();
            m checks = nVar.getChecks();
            if (checks != null) {
                String avsLine1 = checks.getAvsLine1();
                str = value;
                if (avsLine1 != null) {
                    or6.a[] aVarArrValues = or6.a.values();
                    aVar = aVarValueOf;
                    int length = aVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            aVar9 = null;
                            break;
                        }
                        aVar9 = aVarArrValues[i];
                        int i2 = i;
                        int i3 = length;
                        if (a0.z(aVar9.name(), avsLine1, true)) {
                            break;
                        }
                        i = i2 + 1;
                        length = i3;
                    }
                    aVar2 = aVar9;
                } else {
                    aVar = aVarValueOf;
                    aVar2 = null;
                }
                String avsPostal = checks.getAvsPostal();
                if (avsPostal != null) {
                    or6.a[] aVarArrValues2 = or6.a.values();
                    localDateTime = localDateTime4;
                    int length2 = aVarArrValues2.length;
                    localDateTime2 = localDateTime5;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            aVar8 = null;
                            break;
                        }
                        aVar8 = aVarArrValues2[i5];
                        int i6 = length2;
                        int i21 = i5;
                        if (a0.z(aVar8.name(), avsPostal, true)) {
                            break;
                        }
                        i5 = i21 + 1;
                        length2 = i6;
                    }
                    aVar3 = aVar8;
                } else {
                    localDateTime = localDateTime4;
                    localDateTime2 = localDateTime5;
                    aVar3 = null;
                }
                String cvv = checks.getCvv();
                if (cvv != null) {
                    or6.a[] aVarArrValues3 = or6.a.values();
                    int length3 = aVarArrValues3.length;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= length3) {
                            localDateTime3 = localDateTime6;
                            aVar7 = null;
                            break;
                        }
                        aVar7 = aVarArrValues3[i22];
                        int i32 = i22;
                        localDateTime3 = localDateTime6;
                        if (a0.z(aVar7.name(), cvv, true)) {
                            break;
                        }
                        i22 = i32 + 1;
                        localDateTime6 = localDateTime3;
                    }
                    aVar4 = aVar7;
                } else {
                    localDateTime3 = localDateTime6;
                    aVar4 = null;
                }
                String threeds = checks.getThreeds();
                if (threeds != null) {
                    or6.a[] aVarArrValues4 = or6.a.values();
                    int length4 = aVarArrValues4.length;
                    int i33 = 0;
                    while (true) {
                        if (i33 >= length4) {
                            dVar = dVarV;
                            aVar6 = null;
                            break;
                        }
                        aVar6 = aVarArrValues4[i33];
                        int i43 = i33;
                        dVar = dVarV;
                        if (a0.z(aVar6.name(), threeds, true)) {
                            break;
                        }
                        i33 = i43 + 1;
                        dVarV = dVar;
                    }
                    aVar5 = aVar6;
                } else {
                    dVar = dVarV;
                    aVar5 = null;
                }
                cVar = new or6.c(aVar2, aVar3, aVar4, aVar5);
            } else {
                str = value;
                aVar = aVarValueOf;
                localDateTime = localDateTime4;
                localDateTime2 = localDateTime5;
                localDateTime3 = localDateTime6;
                dVar = dVarV;
                cVar = null;
            }
            String expiry = nVar.getExpiry();
            String scheme = nVar.getScheme();
            if (scheme != null) {
                or6.e[] eVarArrValues = or6.e.values();
                int length5 = eVarArrValues.length;
                int i59 = 0;
                while (true) {
                    if (i59 >= length5) {
                        str3 = expiry;
                        eVar2 = null;
                        break;
                    }
                    eVar2 = eVarArrValues[i59];
                    str3 = expiry;
                    or6.e[] eVarArr = eVarArrValues;
                    if (a0.z(eVar2.name(), scheme, true)) {
                        break;
                    }
                    i59++;
                    expiry = str3;
                    eVarArrValues = eVarArr;
                }
                eVar = eVar2;
            } else {
                str3 = expiry;
                eVar = null;
            }
            String type = nVar.getType();
            if (type != null) {
                or6.f[] fVarArrValues = or6.f.values();
                int length6 = fVarArrValues.length;
                int i66 = 0;
                while (true) {
                    if (i66 >= length6) {
                        fVar2 = null;
                        break;
                    }
                    fVar2 = fVarArrValues[i66];
                    or6.f[] fVarArr = fVarArrValues;
                    if (a0.z(fVar2.name(), type, true)) {
                        break;
                    }
                    i66++;
                    fVarArrValues = fVarArr;
                }
                fVar = fVar2;
            } else {
                fVar = null;
            }
            Boolean commercial = nVar.getCommercial();
            String brand = nVar.getBrand();
            String countryName = nVar.getCountryName();
            String countryCode = nVar.getCountryCode();
            gVar = new or6.g(bin, lastFour, cVar, str3, eVar, fVar, commercial, brand, countryName, countryCode != null ? com.bumptech.glide.d.c(countryCode) : null);
        } else {
            str = value;
            aVar = aVarValueOf;
            localDateTime = localDateTime4;
            localDateTime2 = localDateTime5;
            localDateTime3 = localDateTime6;
            dVar = dVarV;
            gVar = null;
        }
        String str4 = qVar.f189243m;
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = str4 != null ? new AcquiringPayment$SepaDirectDebit(str4) : null;
        List list = qVar.f189244n;
        if (list != null) {
            List<r> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (r rVar : list2) {
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                arrayList.add(new AcquiringPaymentFee(mo3.a.o(rVar.getMoney()), pr6.h.valueOf(rVar.getType())));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        List list3 = qVar.o;
        if (list3 != null) {
            List<s> list4 = list3;
            arrayList2 = new ArrayList(w.t(list4, 10));
            for (s sVar : list4) {
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                LocalDateTime createdAt = sVar.getCreatedAt();
                LocalDateTime updatedAt = sVar.getUpdatedAt();
                pr6.n nVarValueOf = pr6.n.valueOf(sVar.getType());
                pr6.m mVarValueOf = pr6.m.valueOf(sVar.getState());
                dj0.d dVarO = mo3.a.o(sVar.getReservedAmount());
                LocalDateTime releaseDate = sVar.getReleaseDate();
                jo3.a releasedAmount = sVar.getReleasedAmount();
                arrayList2.add(new o(createdAt, updatedAt, nVarValueOf, mVarValueOf, dVarO, releaseDate, releasedAmount != null ? mo3.a.o(releasedAmount) : null, sVar.getTransactionId()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = f0.f322471a;
        }
        ?? r172 = arrayList2;
        ks6.o oVar = qVar.f189245p;
        pr6.c cVar2 = oVar != null ? new pr6.c(oVar.getId(), oVar.getFullName(), oVar.getBusinessName(), oVar.getEmail(), oVar.getPhone(), oVar.getCardholderName()) : null;
        String value2 = qVar.f189246q;
        if (value2 != null) {
            Intrinsics.checkNotNullParameter(value2, "value");
            str2 = value2;
        } else {
            str2 = null;
        }
        l lVar = qVar.f189247r;
        return new pr6.e(str, aVar, localDateTime, localDateTime2, localDateTime3, dVar, dVarV2, dVarV3, dVarV4, dVarValueOf, jVarValueOf, gVar, acquiringPayment$SepaDirectDebit, arrayList, r172, cVar2, str2, lVar != null ? new lr6.h(com.bumptech.glide.d.c(lVar.getCountryCode()), lVar.getStreetLine1(), lVar.getStreetLine2(), lVar.getRegion(), lVar.getCity(), lVar.getPostcode()) : null, qVar.f189248s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b6  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pr6.e b(lt6.b r35) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu6.b.b(lt6.b):pr6.e");
    }

    public static final qr6.c c(mt6.a aVar) {
        h0 h0Var;
        qr6.b bVar;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String eventType = aVar.getEventType();
        qr6.b[] bVarArrValues = qr6.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            h0Var = null;
            if (i2 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i2];
            if (a0.z(bVar.name(), eventType, true)) {
                break;
            }
            i2++;
        }
        if (bVar == null) {
            return null;
        }
        LocalDateTime localDateTimeY = oi0.d.Y(aVar.getTimestamp());
        a.C1176a attribute = aVar.getAttribute();
        Long amount = attribute != null ? attribute.getAmount() : null;
        a.C1176a attribute2 = aVar.getAttribute();
        String currency = attribute2 != null ? attribute2.getCurrency() : null;
        if (amount == null || currency == null) {
            dVar = null;
        } else {
            long jLongValue = amount.longValue();
            xi0.b.Companion.getClass();
            dVar = new dj0.d(jLongValue, xi0.a.a(currency));
        }
        String refundTransactionId = aVar.getRefundTransactionId();
        String failureReason = aVar.getFailureReason();
        if (failureReason != null) {
            h0[] h0VarArrValues = h0.values();
            int length2 = h0VarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                h0 h0Var2 = h0VarArrValues[i];
                if (a0.z(h0Var2.name(), failureReason, true)) {
                    h0Var = h0Var2;
                    break;
                }
                i++;
            }
        }
        return new qr6.c(bVar, localDateTimeY, dVar, refundTransactionId, h0Var);
    }

    public static final q d(pr6.e eVar) {
        jo3.b bVar;
        String str;
        String str2;
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        n nVar;
        m mVar;
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String str4 = eVar.f238938a;
        String strName = eVar.f238939b.name();
        LocalDateTime localDateTime3 = eVar.f238940c;
        LocalDateTime localDateTime4 = eVar.d;
        LocalDateTime localDateTime5 = eVar.e;
        jo3.b bVarA = hx7.a.A(eVar.f);
        jo3.b bVarA2 = hx7.a.A(eVar.f238941g);
        dj0.d dVar = eVar.f238942h;
        jo3.b bVarA3 = dVar != null ? hx7.a.A(dVar) : null;
        dj0.d dVar2 = eVar.i;
        jo3.b bVarA4 = dVar2 != null ? hx7.a.A(dVar2) : null;
        String strName2 = eVar.f238943j.name();
        String strName3 = eVar.k.name();
        or6.g gVar = eVar.f238944l;
        if (gVar != null) {
            String str5 = gVar.f228069a;
            bVar = bVarA3;
            String str6 = gVar.f228070b;
            or6.c cVar = gVar.f228071c;
            str = str4;
            if (cVar != null) {
                str2 = strName;
                or6.a aVar = cVar.f228066a;
                String strName4 = aVar != null ? aVar.name() : null;
                localDateTime = localDateTime3;
                or6.a aVar2 = cVar.f228067b;
                String strName5 = aVar2 != null ? aVar2.name() : null;
                localDateTime2 = localDateTime4;
                or6.a aVar3 = cVar.f228068c;
                String strName6 = aVar3 != null ? aVar3.name() : null;
                or6.a aVar4 = cVar.d;
                mVar = new m(strName4, strName5, strName6, aVar4 != null ? aVar4.name() : null);
            } else {
                str2 = strName;
                localDateTime = localDateTime3;
                localDateTime2 = localDateTime4;
                mVar = null;
            }
            String str7 = gVar.d;
            or6.e eVar2 = gVar.e;
            String strName7 = eVar2 != null ? eVar2.name() : null;
            or6.f fVar = gVar.f;
            String strName8 = fVar != null ? fVar.name() : null;
            Boolean bool = gVar.f228072g;
            String str8 = gVar.f228073h;
            String str9 = gVar.i;
            wi0.b bVar2 = gVar.f228074j;
            nVar = new n(str5, str6, mVar, str7, strName7, strName8, bool, str8, str9, bVar2 != null ? bVar2.f297794a : null);
        } else {
            bVar = bVarA3;
            str = str4;
            str2 = strName;
            localDateTime = localDateTime3;
            localDateTime2 = localDateTime4;
            nVar = null;
        }
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = eVar.f238945m;
        String str10 = acquiringPayment$SepaDirectDebit != null ? acquiringPayment$SepaDirectDebit.f73364a : null;
        List<AcquiringPaymentFee> list = eVar.f238946n;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AcquiringPaymentFee acquiringPaymentFee : list) {
            Intrinsics.checkNotNullParameter(acquiringPaymentFee, "<this>");
            arrayList.add(new r(mo3.a.p(acquiringPaymentFee.f73365a), acquiringPaymentFee.f73366b.name()));
        }
        List<o> list2 = eVar.o;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (o oVar : list2) {
            Intrinsics.checkNotNullParameter(oVar, str3);
            LocalDateTime localDateTime6 = oVar.f238954a;
            LocalDateTime localDateTime7 = oVar.f238955b;
            String str11 = str3;
            String strName9 = oVar.f238956c.name();
            String strName10 = oVar.d.name();
            jo3.a aVarP = mo3.a.p(oVar.e);
            LocalDateTime localDateTime8 = oVar.f;
            dj0.d dVar3 = oVar.f238957g;
            arrayList2.add(new s(localDateTime6, localDateTime7, strName10, strName9, aVarP, localDateTime8, dVar3 != null ? mo3.a.p(dVar3) : null, oVar.f238958h));
            str3 = str11;
        }
        pr6.c cVar2 = eVar.f238947p;
        ks6.o oVar2 = cVar2 != null ? new ks6.o(cVar2.f238935a, cVar2.f238936b, cVar2.f238937c, cVar2.d, cVar2.e, cVar2.f) : null;
        String str12 = eVar.f238948q;
        String str13 = str12 == null ? null : str12;
        lr6.h hVar = eVar.f238949r;
        return new q(str, str2, localDateTime, localDateTime2, localDateTime5, bVarA, bVarA2, bVar, bVarA4, strName2, strName3, nVar, str10, arrayList, arrayList2, oVar2, str13, hVar != null ? new l(hVar.f199404a.f297794a, hVar.f199405b, hVar.f199406c, hVar.d, hVar.e, hVar.f) : null, eVar.f238950s);
    }
}
