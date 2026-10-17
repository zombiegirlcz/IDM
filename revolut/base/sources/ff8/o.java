package ff8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_core.impl.services.JuniorAccountService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import pf8.p;
import pf8.q;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements j {

    @NotNull
    public static final m Companion = new m();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAccountService f134784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f134785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f134786c;
    public final w4l.f d;

    static {
        Type type = new TypeToken<List<? extends cf8.a>>() { // from class: com.revolut.feature.junior_core.impl.repositories.JuniorProductsRepositoryImpl$Companion$JUNIOR_LIST_PRODUCTS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public o(JuniorAccountService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f134784a = service;
        this.f134785b = memoryCache;
        this.f134786c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ff8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f134781b;

            {
                this.f134781b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                df8.e eVar;
                df8.m mVar;
                Integer numValueOf;
                int i2 = i;
                o oVar = this.f134781b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<xe8.a>> youthUsersProducts = oVar.f134784a.getYouthUsersProducts(registeredIdentityId);
                        n nVar = n.f;
                        dug.e eVar2 = new dug.e(20);
                        youthUsersProducts.getClass();
                        ufm.i iVar = new ufm.i(youthUsersProducts, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        oVar.f134785b.f(m.a(o.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    default:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = oVar.f134786c;
                        String strA = m.a(o.Companion, registeredIdentityId3);
                        String str = "<this>";
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        List list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            of8.b bVar = (of8.b) it8.next();
                            Intrinsics.checkNotNullParameter(bVar, str);
                            String str2 = bVar.f224748a;
                            pf8.a aVar = bVar.f224749b;
                            Intrinsics.checkNotNullParameter(aVar, str);
                            df8.a aVar2 = new df8.a(aVar.f235504a.name());
                            pf8.o oVar2 = bVar.f224750c;
                            Intrinsics.checkNotNullParameter(oVar2, str);
                            df8.k kVar = new df8.k(oVar2.f235522a.name());
                            pf8.e eVar3 = bVar.d;
                            Intrinsics.checkNotNullParameter(eVar3, str);
                            String strName = eVar3.f235511a.name();
                            pf8.d dVar = eVar3.f235512b;
                            if (dVar != null) {
                                Intrinsics.checkNotNullParameter(dVar, str);
                                eVar = new df8.e(hx7.a.A(dVar.f235509a), hx7.a.A(dVar.f235510b));
                            } else {
                                eVar = null;
                            }
                            df8.f fVar = new df8.f(strName, eVar);
                            p pVar = bVar.e;
                            Intrinsics.checkNotNullParameter(pVar, str);
                            df8.l lVar = new df8.l(pVar.f235523a.name());
                            pf8.n nVar2 = bVar.f;
                            Intrinsics.checkNotNullParameter(nVar2, str);
                            df8.d dVar2 = new df8.d(nVar2.f235521a.name());
                            pf8.c cVar2 = bVar.f224751g;
                            Intrinsics.checkNotNullParameter(cVar2, str);
                            df8.c cVar3 = new df8.c(cVar2.f235507a.name(), cVar2.f235508b);
                            pf8.b bVar2 = bVar.f224752h;
                            Intrinsics.checkNotNullParameter(bVar2, str);
                            Iterator it9 = it8;
                            df8.b bVar3 = new df8.b(bVar2.f235505a, bVar2.f235506b);
                            q qVar = bVar.i;
                            if (qVar != null) {
                                Intrinsics.checkNotNullParameter(qVar, str);
                                mVar = new df8.m(qVar.f235524a.name());
                            } else {
                                mVar = null;
                            }
                            pf8.k kVar2 = bVar.f224753j;
                            Intrinsics.checkNotNullParameter(kVar2, str);
                            df8.i iVar2 = new df8.i(kVar2.f235518a.name());
                            pf8.j jVar = bVar.k;
                            Intrinsics.checkNotNullParameter(jVar, str);
                            df8.h hVar = new df8.h(jVar.f235517a.name());
                            df8.j jVarD0 = ue8.c.d0(bVar.f224754l);
                            df8.j jVarD02 = ue8.c.d0(bVar.f224755m);
                            df8.j jVarD03 = ue8.c.d0(bVar.f224756n);
                            df8.j jVarD04 = ue8.c.d0(bVar.o);
                            pf8.i iVar3 = bVar.f224757p;
                            Intrinsics.checkNotNullParameter(iVar3, str);
                            String str3 = str;
                            String strName2 = iVar3.f235515a.name();
                            pf8.h hVar2 = iVar3.f235516b;
                            if (hVar2 instanceof pf8.f) {
                                numValueOf = Integer.valueOf(((pf8.f) hVar2).f235513a);
                            } else {
                                if (!(hVar2 instanceof pf8.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                numValueOf = null;
                            }
                            arrayList.add(new cf8.a(str2, aVar2, kVar, fVar, lVar, dVar2, cVar3, bVar3, mVar, iVar2, hVar, jVarD0, jVarD02, jVarD03, jVarD04, new df8.g(strName2, numValueOf)));
                            it8 = it9;
                            str = str3;
                        }
                        cVar.G(arrayList, strA, kii.e.o(cf8.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: ff8.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f134783b;

            {
                this.f134783b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                of8.a aVar;
                of8.a aVar2;
                of8.a aVar3;
                pf8.d dVar;
                Iterator it8;
                of8.a aVar4;
                pf8.e eVar;
                of8.a aVar5;
                df8.c cVar;
                of8.a aVar6;
                cf8.a aVar7;
                q qVar;
                of8.a aVar8;
                String str;
                of8.a aVar9;
                pf8.m mVar;
                pf8.m mVar2;
                pf8.m mVar3;
                pf8.j jVar;
                pf8.m mVar4;
                pf8.m mVar5;
                pf8.i iVar;
                of8.a aVar10;
                of8.a aVar11;
                switch (i) {
                    case 0:
                        String registeredIdentityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        return (List) this.f134783b.f134785b.get(m.a(o.Companion, registeredIdentityId));
                    default:
                        String registeredIdentityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        List list = (List) this.f134783b.f134786c.T2(m.a(o.Companion, registeredIdentityId2), o.e);
                        if (list == null) {
                            return null;
                        }
                        String str2 = "<this>";
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            cf8.a aVar12 = (cf8.a) it9.next();
                            Intrinsics.checkNotNullParameter(aVar12, str2);
                            String userId = aVar12.getUserId();
                            df8.a weeklyAllowance = aVar12.getWeeklyAllowance();
                            Intrinsics.checkNotNullParameter(weeklyAllowance, str2);
                            String state = weeklyAllowance.getState();
                            of8.a[] aVarArrValues = of8.a.values();
                            int length = aVarArrValues.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    aVar = aVarArrValues[i2];
                                    if (!a0.z(aVar.name(), state, true)) {
                                        i2++;
                                    }
                                } else {
                                    aVar = null;
                                }
                            }
                            if (aVar == null) {
                                aVar = of8.a.ENABLED;
                            }
                            pf8.a aVar13 = new pf8.a(aVar);
                            df8.k tasks = aVar12.getTasks();
                            Intrinsics.checkNotNullParameter(tasks, str2);
                            String state2 = tasks.getState();
                            of8.a[] aVarArrValues2 = of8.a.values();
                            int length2 = aVarArrValues2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length2) {
                                    aVar2 = aVarArrValues2[i3];
                                    if (!a0.z(aVar2.name(), state2, true)) {
                                        i3++;
                                    }
                                } else {
                                    aVar2 = null;
                                }
                            }
                            if (aVar2 == null) {
                                aVar2 = of8.a.ENABLED;
                            }
                            pf8.o oVar = new pf8.o(aVar2);
                            df8.f monthlyTopupLimit = aVar12.getMonthlyTopupLimit();
                            Intrinsics.checkNotNullParameter(monthlyTopupLimit, str2);
                            String state3 = monthlyTopupLimit.getState();
                            of8.a[] aVarArrValues3 = of8.a.values();
                            int length3 = aVarArrValues3.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length3) {
                                    aVar3 = aVarArrValues3[i5];
                                    if (!a0.z(aVar3.name(), state3, true)) {
                                        i5++;
                                    }
                                } else {
                                    aVar3 = null;
                                }
                            }
                            if (aVar3 == null) {
                                aVar3 = of8.a.DISABLED;
                            }
                            of8.a aVar14 = aVar3;
                            df8.e moneyUsage = monthlyTopupLimit.getMoneyUsage();
                            if (moneyUsage != null) {
                                Intrinsics.checkNotNullParameter(moneyUsage, str2);
                                dVar = new pf8.d(hx7.a.v(moneyUsage.getUsed()), hx7.a.v(moneyUsage.getLimit()));
                            } else {
                                dVar = null;
                            }
                            pf8.e eVar2 = new pf8.e(aVar14, dVar);
                            df8.l vaults = aVar12.getVaults();
                            Intrinsics.checkNotNullParameter(vaults, str2);
                            String state4 = vaults.getState();
                            of8.a[] aVarArrValues4 = of8.a.values();
                            int length4 = aVarArrValues4.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length4) {
                                    aVar4 = aVarArrValues4[i6];
                                    it8 = it9;
                                    if (!a0.z(aVar4.name(), state4, true)) {
                                        i6++;
                                        it9 = it8;
                                    }
                                } else {
                                    it8 = it9;
                                    aVar4 = null;
                                }
                            }
                            if (aVar4 == null) {
                                aVar4 = of8.a.ENABLED;
                            }
                            p pVar = new p(aVar4);
                            df8.d deposits = aVar12.getDeposits();
                            Intrinsics.checkNotNullParameter(deposits, str2);
                            String state5 = deposits.getState();
                            of8.a[] aVarArrValues5 = of8.a.values();
                            int length5 = aVarArrValues5.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 < length5) {
                                    aVar5 = aVarArrValues5[i21];
                                    eVar = eVar2;
                                    if (!a0.z(aVar5.name(), state5, true)) {
                                        i21++;
                                        eVar2 = eVar;
                                    }
                                } else {
                                    eVar = eVar2;
                                    aVar5 = null;
                                }
                            }
                            if (aVar5 == null) {
                                aVar5 = of8.a.ENABLED;
                            }
                            pf8.n nVar = new pf8.n(aVar5);
                            df8.c coparents = aVar12.getCoparents();
                            Intrinsics.checkNotNullParameter(coparents, str2);
                            String state6 = coparents.getState();
                            of8.a[] aVarArrValues6 = of8.a.values();
                            int length6 = aVarArrValues6.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length6) {
                                    aVar6 = aVarArrValues6[i22];
                                    cVar = coparents;
                                    if (!a0.z(aVar6.name(), state6, true)) {
                                        i22++;
                                        coparents = cVar;
                                    }
                                } else {
                                    cVar = coparents;
                                    aVar6 = null;
                                }
                            }
                            if (aVar6 == null) {
                                aVar6 = of8.a.ENABLED;
                            }
                            pf8.c cVar2 = new pf8.c(aVar6, cVar.getForeignCoParentsAllowed());
                            df8.b cards = aVar12.getCards();
                            Intrinsics.checkNotNullParameter(cards, str2);
                            pf8.b bVar = new pf8.b(cards.getMaxCardsCount(), cards.getMaxOrderVirtualCardLimit());
                            df8.m virtualCards = aVar12.getVirtualCards();
                            if (virtualCards != null) {
                                Intrinsics.checkNotNullParameter(virtualCards, str2);
                                String state7 = virtualCards.getState();
                                of8.a[] aVarArrValues7 = of8.a.values();
                                int length7 = aVarArrValues7.length;
                                int i32 = 0;
                                while (true) {
                                    if (i32 < length7) {
                                        aVar11 = aVarArrValues7[i32];
                                        of8.a[] aVarArr = aVarArrValues7;
                                        aVar7 = aVar12;
                                        if (!a0.z(aVar11.name(), state7, true)) {
                                            i32++;
                                            aVarArrValues7 = aVarArr;
                                            aVar12 = aVar7;
                                        }
                                    } else {
                                        aVar7 = aVar12;
                                        aVar11 = null;
                                    }
                                }
                                if (aVar11 == null) {
                                    aVar11 = of8.a.ENABLED;
                                }
                                qVar = new q(aVar11);
                            } else {
                                aVar7 = aVar12;
                                qVar = null;
                            }
                            df8.i paymentLinks = aVar7.getPaymentLinks();
                            Intrinsics.checkNotNullParameter(paymentLinks, str2);
                            String state8 = paymentLinks.getState();
                            of8.a[] aVarArrValues8 = of8.a.values();
                            int length8 = aVarArrValues8.length;
                            int i33 = 0;
                            while (true) {
                                if (i33 < length8) {
                                    aVar8 = aVarArrValues8[i33];
                                    of8.a[] aVarArr2 = aVarArrValues8;
                                    int i43 = length8;
                                    if (!a0.z(aVar8.name(), state8, true)) {
                                        i33++;
                                        aVarArrValues8 = aVarArr2;
                                        length8 = i43;
                                    }
                                } else {
                                    aVar8 = null;
                                }
                            }
                            if (aVar8 == null) {
                                aVar8 = of8.a.UNAVAILABLE;
                            }
                            pf8.k kVar = new pf8.k(aVar8);
                            df8.h partnerships = aVar7.getPartnerships();
                            Intrinsics.checkNotNullParameter(partnerships, str2);
                            String state9 = partnerships.getState();
                            of8.a[] aVarArrValues9 = of8.a.values();
                            int length9 = aVarArrValues9.length;
                            int i59 = 0;
                            while (true) {
                                if (i59 < length9) {
                                    aVar9 = aVarArrValues9[i59];
                                    int i66 = i59;
                                    str = str2;
                                    if (!a0.z(aVar9.name(), state9, true)) {
                                        i59 = i66 + 1;
                                        str2 = str;
                                    }
                                } else {
                                    str = str2;
                                    aVar9 = null;
                                }
                            }
                            if (aVar9 == null) {
                                aVar9 = of8.a.UNAVAILABLE;
                            }
                            pf8.j jVar2 = new pf8.j(aVar9);
                            df8.j googlePay = aVar7.getGooglePay();
                            if (googlePay == null || (mVar = ue8.c.V(googlePay)) == null) {
                                mVar = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            df8.j applePay = aVar7.getApplePay();
                            if (applePay == null || (mVar2 = ue8.c.V(applePay)) == null) {
                                mVar2 = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            pf8.m mVarV = ue8.c.V(aVar7.getP2pTransfers());
                            if (mVarV == null) {
                                mVarV = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            pf8.m mVar6 = mVarV;
                            df8.j firstPartyNfcPayments = aVar7.getFirstPartyNfcPayments();
                            if (firstPartyNfcPayments == null || (mVar3 = ue8.c.V(firstPartyNfcPayments)) == null) {
                                mVar3 = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            df8.g multicurrency = aVar7.getMulticurrency();
                            pf8.m mVar7 = mVar;
                            pf8.h fVar = pf8.g.f235514a;
                            if (multicurrency != null) {
                                jVar = jVar2;
                                String state10 = multicurrency.getState();
                                mVar4 = mVar2;
                                of8.a[] aVarArrValues10 = of8.a.values();
                                mVar5 = mVar3;
                                int length10 = aVarArrValues10.length;
                                int i74 = 0;
                                while (true) {
                                    if (i74 < length10) {
                                        aVar10 = aVarArrValues10[i74];
                                        int i92 = i74;
                                        int i96 = length10;
                                        if (!a0.z(aVar10.name(), state10, true)) {
                                            i74 = i92 + 1;
                                            length10 = i96;
                                        }
                                    } else {
                                        aVar10 = null;
                                    }
                                }
                                if (aVar10 == null) {
                                    aVar10 = of8.a.UNAVAILABLE;
                                }
                                of8.a aVar15 = aVar10;
                                if (aVar15 != of8.a.UNAVAILABLE && multicurrency.getMinAgeExchange() != null) {
                                    fVar = new pf8.f(multicurrency.getMinAgeExchange().intValue());
                                }
                                iVar = new pf8.i(aVar15, fVar);
                            } else {
                                jVar = jVar2;
                                mVar4 = mVar2;
                                mVar5 = mVar3;
                                iVar = new pf8.i(of8.a.UNAVAILABLE, fVar);
                            }
                            arrayList.add(new of8.b(userId, aVar13, oVar, eVar, pVar, nVar, cVar2, bVar, qVar, kVar, jVar, mVar7, mVar4, mVar6, mVar5, iVar));
                            it9 = it8;
                            str2 = str;
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: ff8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f134781b;

            {
                this.f134781b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                df8.e eVar;
                df8.m mVar;
                Integer numValueOf;
                int i22 = i2;
                o oVar = this.f134781b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<xe8.a>> youthUsersProducts = oVar.f134784a.getYouthUsersProducts(registeredIdentityId);
                        n nVar = n.f;
                        dug.e eVar2 = new dug.e(20);
                        youthUsersProducts.getClass();
                        ufm.i iVar = new ufm.i(youthUsersProducts, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        oVar.f134785b.f(m.a(o.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    default:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = oVar.f134786c;
                        String strA = m.a(o.Companion, registeredIdentityId3);
                        String str = "<this>";
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        List list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            of8.b bVar = (of8.b) it8.next();
                            Intrinsics.checkNotNullParameter(bVar, str);
                            String str2 = bVar.f224748a;
                            pf8.a aVar = bVar.f224749b;
                            Intrinsics.checkNotNullParameter(aVar, str);
                            df8.a aVar2 = new df8.a(aVar.f235504a.name());
                            pf8.o oVar2 = bVar.f224750c;
                            Intrinsics.checkNotNullParameter(oVar2, str);
                            df8.k kVar = new df8.k(oVar2.f235522a.name());
                            pf8.e eVar3 = bVar.d;
                            Intrinsics.checkNotNullParameter(eVar3, str);
                            String strName = eVar3.f235511a.name();
                            pf8.d dVar = eVar3.f235512b;
                            if (dVar != null) {
                                Intrinsics.checkNotNullParameter(dVar, str);
                                eVar = new df8.e(hx7.a.A(dVar.f235509a), hx7.a.A(dVar.f235510b));
                            } else {
                                eVar = null;
                            }
                            df8.f fVar = new df8.f(strName, eVar);
                            p pVar = bVar.e;
                            Intrinsics.checkNotNullParameter(pVar, str);
                            df8.l lVar = new df8.l(pVar.f235523a.name());
                            pf8.n nVar2 = bVar.f;
                            Intrinsics.checkNotNullParameter(nVar2, str);
                            df8.d dVar2 = new df8.d(nVar2.f235521a.name());
                            pf8.c cVar2 = bVar.f224751g;
                            Intrinsics.checkNotNullParameter(cVar2, str);
                            df8.c cVar3 = new df8.c(cVar2.f235507a.name(), cVar2.f235508b);
                            pf8.b bVar2 = bVar.f224752h;
                            Intrinsics.checkNotNullParameter(bVar2, str);
                            Iterator it9 = it8;
                            df8.b bVar3 = new df8.b(bVar2.f235505a, bVar2.f235506b);
                            q qVar = bVar.i;
                            if (qVar != null) {
                                Intrinsics.checkNotNullParameter(qVar, str);
                                mVar = new df8.m(qVar.f235524a.name());
                            } else {
                                mVar = null;
                            }
                            pf8.k kVar2 = bVar.f224753j;
                            Intrinsics.checkNotNullParameter(kVar2, str);
                            df8.i iVar2 = new df8.i(kVar2.f235518a.name());
                            pf8.j jVar = bVar.k;
                            Intrinsics.checkNotNullParameter(jVar, str);
                            df8.h hVar = new df8.h(jVar.f235517a.name());
                            df8.j jVarD0 = ue8.c.d0(bVar.f224754l);
                            df8.j jVarD02 = ue8.c.d0(bVar.f224755m);
                            df8.j jVarD03 = ue8.c.d0(bVar.f224756n);
                            df8.j jVarD04 = ue8.c.d0(bVar.o);
                            pf8.i iVar3 = bVar.f224757p;
                            Intrinsics.checkNotNullParameter(iVar3, str);
                            String str3 = str;
                            String strName2 = iVar3.f235515a.name();
                            pf8.h hVar2 = iVar3.f235516b;
                            if (hVar2 instanceof pf8.f) {
                                numValueOf = Integer.valueOf(((pf8.f) hVar2).f235513a);
                            } else {
                                if (!(hVar2 instanceof pf8.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                numValueOf = null;
                            }
                            arrayList.add(new cf8.a(str2, aVar2, kVar, fVar, lVar, dVar2, cVar3, bVar3, mVar, iVar2, hVar, jVarD0, jVarD02, jVarD03, jVarD04, new df8.g(strName2, numValueOf)));
                            it8 = it9;
                            str = str3;
                        }
                        cVar.G(arrayList, strA, kii.e.o(cf8.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: ff8.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f134783b;

            {
                this.f134783b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                of8.a aVar;
                of8.a aVar2;
                of8.a aVar3;
                pf8.d dVar;
                Iterator it8;
                of8.a aVar4;
                pf8.e eVar;
                of8.a aVar5;
                df8.c cVar;
                of8.a aVar6;
                cf8.a aVar7;
                q qVar;
                of8.a aVar8;
                String str;
                of8.a aVar9;
                pf8.m mVar;
                pf8.m mVar2;
                pf8.m mVar3;
                pf8.j jVar;
                pf8.m mVar4;
                pf8.m mVar5;
                pf8.i iVar;
                of8.a aVar10;
                of8.a aVar11;
                switch (i2) {
                    case 0:
                        String registeredIdentityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        return (List) this.f134783b.f134785b.get(m.a(o.Companion, registeredIdentityId));
                    default:
                        String registeredIdentityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        List list = (List) this.f134783b.f134786c.T2(m.a(o.Companion, registeredIdentityId2), o.e);
                        if (list == null) {
                            return null;
                        }
                        String str2 = "<this>";
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            cf8.a aVar12 = (cf8.a) it9.next();
                            Intrinsics.checkNotNullParameter(aVar12, str2);
                            String userId = aVar12.getUserId();
                            df8.a weeklyAllowance = aVar12.getWeeklyAllowance();
                            Intrinsics.checkNotNullParameter(weeklyAllowance, str2);
                            String state = weeklyAllowance.getState();
                            of8.a[] aVarArrValues = of8.a.values();
                            int length = aVarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    aVar = aVarArrValues[i22];
                                    if (!a0.z(aVar.name(), state, true)) {
                                        i22++;
                                    }
                                } else {
                                    aVar = null;
                                }
                            }
                            if (aVar == null) {
                                aVar = of8.a.ENABLED;
                            }
                            pf8.a aVar13 = new pf8.a(aVar);
                            df8.k tasks = aVar12.getTasks();
                            Intrinsics.checkNotNullParameter(tasks, str2);
                            String state2 = tasks.getState();
                            of8.a[] aVarArrValues2 = of8.a.values();
                            int length2 = aVarArrValues2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length2) {
                                    aVar2 = aVarArrValues2[i3];
                                    if (!a0.z(aVar2.name(), state2, true)) {
                                        i3++;
                                    }
                                } else {
                                    aVar2 = null;
                                }
                            }
                            if (aVar2 == null) {
                                aVar2 = of8.a.ENABLED;
                            }
                            pf8.o oVar = new pf8.o(aVar2);
                            df8.f monthlyTopupLimit = aVar12.getMonthlyTopupLimit();
                            Intrinsics.checkNotNullParameter(monthlyTopupLimit, str2);
                            String state3 = monthlyTopupLimit.getState();
                            of8.a[] aVarArrValues3 = of8.a.values();
                            int length3 = aVarArrValues3.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length3) {
                                    aVar3 = aVarArrValues3[i5];
                                    if (!a0.z(aVar3.name(), state3, true)) {
                                        i5++;
                                    }
                                } else {
                                    aVar3 = null;
                                }
                            }
                            if (aVar3 == null) {
                                aVar3 = of8.a.DISABLED;
                            }
                            of8.a aVar14 = aVar3;
                            df8.e moneyUsage = monthlyTopupLimit.getMoneyUsage();
                            if (moneyUsage != null) {
                                Intrinsics.checkNotNullParameter(moneyUsage, str2);
                                dVar = new pf8.d(hx7.a.v(moneyUsage.getUsed()), hx7.a.v(moneyUsage.getLimit()));
                            } else {
                                dVar = null;
                            }
                            pf8.e eVar2 = new pf8.e(aVar14, dVar);
                            df8.l vaults = aVar12.getVaults();
                            Intrinsics.checkNotNullParameter(vaults, str2);
                            String state4 = vaults.getState();
                            of8.a[] aVarArrValues4 = of8.a.values();
                            int length4 = aVarArrValues4.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length4) {
                                    aVar4 = aVarArrValues4[i6];
                                    it8 = it9;
                                    if (!a0.z(aVar4.name(), state4, true)) {
                                        i6++;
                                        it9 = it8;
                                    }
                                } else {
                                    it8 = it9;
                                    aVar4 = null;
                                }
                            }
                            if (aVar4 == null) {
                                aVar4 = of8.a.ENABLED;
                            }
                            p pVar = new p(aVar4);
                            df8.d deposits = aVar12.getDeposits();
                            Intrinsics.checkNotNullParameter(deposits, str2);
                            String state5 = deposits.getState();
                            of8.a[] aVarArrValues5 = of8.a.values();
                            int length5 = aVarArrValues5.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 < length5) {
                                    aVar5 = aVarArrValues5[i21];
                                    eVar = eVar2;
                                    if (!a0.z(aVar5.name(), state5, true)) {
                                        i21++;
                                        eVar2 = eVar;
                                    }
                                } else {
                                    eVar = eVar2;
                                    aVar5 = null;
                                }
                            }
                            if (aVar5 == null) {
                                aVar5 = of8.a.ENABLED;
                            }
                            pf8.n nVar = new pf8.n(aVar5);
                            df8.c coparents = aVar12.getCoparents();
                            Intrinsics.checkNotNullParameter(coparents, str2);
                            String state6 = coparents.getState();
                            of8.a[] aVarArrValues6 = of8.a.values();
                            int length6 = aVarArrValues6.length;
                            int i222 = 0;
                            while (true) {
                                if (i222 < length6) {
                                    aVar6 = aVarArrValues6[i222];
                                    cVar = coparents;
                                    if (!a0.z(aVar6.name(), state6, true)) {
                                        i222++;
                                        coparents = cVar;
                                    }
                                } else {
                                    cVar = coparents;
                                    aVar6 = null;
                                }
                            }
                            if (aVar6 == null) {
                                aVar6 = of8.a.ENABLED;
                            }
                            pf8.c cVar2 = new pf8.c(aVar6, cVar.getForeignCoParentsAllowed());
                            df8.b cards = aVar12.getCards();
                            Intrinsics.checkNotNullParameter(cards, str2);
                            pf8.b bVar = new pf8.b(cards.getMaxCardsCount(), cards.getMaxOrderVirtualCardLimit());
                            df8.m virtualCards = aVar12.getVirtualCards();
                            if (virtualCards != null) {
                                Intrinsics.checkNotNullParameter(virtualCards, str2);
                                String state7 = virtualCards.getState();
                                of8.a[] aVarArrValues7 = of8.a.values();
                                int length7 = aVarArrValues7.length;
                                int i32 = 0;
                                while (true) {
                                    if (i32 < length7) {
                                        aVar11 = aVarArrValues7[i32];
                                        of8.a[] aVarArr = aVarArrValues7;
                                        aVar7 = aVar12;
                                        if (!a0.z(aVar11.name(), state7, true)) {
                                            i32++;
                                            aVarArrValues7 = aVarArr;
                                            aVar12 = aVar7;
                                        }
                                    } else {
                                        aVar7 = aVar12;
                                        aVar11 = null;
                                    }
                                }
                                if (aVar11 == null) {
                                    aVar11 = of8.a.ENABLED;
                                }
                                qVar = new q(aVar11);
                            } else {
                                aVar7 = aVar12;
                                qVar = null;
                            }
                            df8.i paymentLinks = aVar7.getPaymentLinks();
                            Intrinsics.checkNotNullParameter(paymentLinks, str2);
                            String state8 = paymentLinks.getState();
                            of8.a[] aVarArrValues8 = of8.a.values();
                            int length8 = aVarArrValues8.length;
                            int i33 = 0;
                            while (true) {
                                if (i33 < length8) {
                                    aVar8 = aVarArrValues8[i33];
                                    of8.a[] aVarArr2 = aVarArrValues8;
                                    int i43 = length8;
                                    if (!a0.z(aVar8.name(), state8, true)) {
                                        i33++;
                                        aVarArrValues8 = aVarArr2;
                                        length8 = i43;
                                    }
                                } else {
                                    aVar8 = null;
                                }
                            }
                            if (aVar8 == null) {
                                aVar8 = of8.a.UNAVAILABLE;
                            }
                            pf8.k kVar = new pf8.k(aVar8);
                            df8.h partnerships = aVar7.getPartnerships();
                            Intrinsics.checkNotNullParameter(partnerships, str2);
                            String state9 = partnerships.getState();
                            of8.a[] aVarArrValues9 = of8.a.values();
                            int length9 = aVarArrValues9.length;
                            int i59 = 0;
                            while (true) {
                                if (i59 < length9) {
                                    aVar9 = aVarArrValues9[i59];
                                    int i66 = i59;
                                    str = str2;
                                    if (!a0.z(aVar9.name(), state9, true)) {
                                        i59 = i66 + 1;
                                        str2 = str;
                                    }
                                } else {
                                    str = str2;
                                    aVar9 = null;
                                }
                            }
                            if (aVar9 == null) {
                                aVar9 = of8.a.UNAVAILABLE;
                            }
                            pf8.j jVar2 = new pf8.j(aVar9);
                            df8.j googlePay = aVar7.getGooglePay();
                            if (googlePay == null || (mVar = ue8.c.V(googlePay)) == null) {
                                mVar = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            df8.j applePay = aVar7.getApplePay();
                            if (applePay == null || (mVar2 = ue8.c.V(applePay)) == null) {
                                mVar2 = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            pf8.m mVarV = ue8.c.V(aVar7.getP2pTransfers());
                            if (mVarV == null) {
                                mVarV = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            pf8.m mVar6 = mVarV;
                            df8.j firstPartyNfcPayments = aVar7.getFirstPartyNfcPayments();
                            if (firstPartyNfcPayments == null || (mVar3 = ue8.c.V(firstPartyNfcPayments)) == null) {
                                mVar3 = new pf8.m(of8.a.UNAVAILABLE);
                            }
                            df8.g multicurrency = aVar7.getMulticurrency();
                            pf8.m mVar7 = mVar;
                            pf8.h fVar = pf8.g.f235514a;
                            if (multicurrency != null) {
                                jVar = jVar2;
                                String state10 = multicurrency.getState();
                                mVar4 = mVar2;
                                of8.a[] aVarArrValues10 = of8.a.values();
                                mVar5 = mVar3;
                                int length10 = aVarArrValues10.length;
                                int i74 = 0;
                                while (true) {
                                    if (i74 < length10) {
                                        aVar10 = aVarArrValues10[i74];
                                        int i92 = i74;
                                        int i96 = length10;
                                        if (!a0.z(aVar10.name(), state10, true)) {
                                            i74 = i92 + 1;
                                            length10 = i96;
                                        }
                                    } else {
                                        aVar10 = null;
                                    }
                                }
                                if (aVar10 == null) {
                                    aVar10 = of8.a.UNAVAILABLE;
                                }
                                of8.a aVar15 = aVar10;
                                if (aVar15 != of8.a.UNAVAILABLE && multicurrency.getMinAgeExchange() != null) {
                                    fVar = new pf8.f(multicurrency.getMinAgeExchange().intValue());
                                }
                                iVar = new pf8.i(aVar15, fVar);
                            } else {
                                jVar = jVar2;
                                mVar4 = mVar2;
                                mVar5 = mVar3;
                                iVar = new pf8.i(of8.a.UNAVAILABLE, fVar);
                            }
                            arrayList.add(new of8.b(userId, aVar13, oVar, eVar, pVar, nVar, cVar2, bVar, qVar, kVar, jVar, mVar7, mVar4, mVar6, mVar5, iVar));
                            it9 = it8;
                            str2 = str;
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: ff8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f134781b;

            {
                this.f134781b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                df8.e eVar;
                df8.m mVar;
                Integer numValueOf;
                int i22 = i3;
                o oVar = this.f134781b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<xe8.a>> youthUsersProducts = oVar.f134784a.getYouthUsersProducts(registeredIdentityId);
                        n nVar = n.f;
                        dug.e eVar2 = new dug.e(20);
                        youthUsersProducts.getClass();
                        ufm.i iVar = new ufm.i(youthUsersProducts, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        oVar.f134785b.f(m.a(o.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    default:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = oVar.f134786c;
                        String strA = m.a(o.Companion, registeredIdentityId3);
                        String str = "<this>";
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        List list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            of8.b bVar = (of8.b) it8.next();
                            Intrinsics.checkNotNullParameter(bVar, str);
                            String str2 = bVar.f224748a;
                            pf8.a aVar = bVar.f224749b;
                            Intrinsics.checkNotNullParameter(aVar, str);
                            df8.a aVar2 = new df8.a(aVar.f235504a.name());
                            pf8.o oVar2 = bVar.f224750c;
                            Intrinsics.checkNotNullParameter(oVar2, str);
                            df8.k kVar = new df8.k(oVar2.f235522a.name());
                            pf8.e eVar3 = bVar.d;
                            Intrinsics.checkNotNullParameter(eVar3, str);
                            String strName = eVar3.f235511a.name();
                            pf8.d dVar = eVar3.f235512b;
                            if (dVar != null) {
                                Intrinsics.checkNotNullParameter(dVar, str);
                                eVar = new df8.e(hx7.a.A(dVar.f235509a), hx7.a.A(dVar.f235510b));
                            } else {
                                eVar = null;
                            }
                            df8.f fVar = new df8.f(strName, eVar);
                            p pVar = bVar.e;
                            Intrinsics.checkNotNullParameter(pVar, str);
                            df8.l lVar = new df8.l(pVar.f235523a.name());
                            pf8.n nVar2 = bVar.f;
                            Intrinsics.checkNotNullParameter(nVar2, str);
                            df8.d dVar2 = new df8.d(nVar2.f235521a.name());
                            pf8.c cVar2 = bVar.f224751g;
                            Intrinsics.checkNotNullParameter(cVar2, str);
                            df8.c cVar3 = new df8.c(cVar2.f235507a.name(), cVar2.f235508b);
                            pf8.b bVar2 = bVar.f224752h;
                            Intrinsics.checkNotNullParameter(bVar2, str);
                            Iterator it9 = it8;
                            df8.b bVar3 = new df8.b(bVar2.f235505a, bVar2.f235506b);
                            q qVar = bVar.i;
                            if (qVar != null) {
                                Intrinsics.checkNotNullParameter(qVar, str);
                                mVar = new df8.m(qVar.f235524a.name());
                            } else {
                                mVar = null;
                            }
                            pf8.k kVar2 = bVar.f224753j;
                            Intrinsics.checkNotNullParameter(kVar2, str);
                            df8.i iVar2 = new df8.i(kVar2.f235518a.name());
                            pf8.j jVar = bVar.k;
                            Intrinsics.checkNotNullParameter(jVar, str);
                            df8.h hVar = new df8.h(jVar.f235517a.name());
                            df8.j jVarD0 = ue8.c.d0(bVar.f224754l);
                            df8.j jVarD02 = ue8.c.d0(bVar.f224755m);
                            df8.j jVarD03 = ue8.c.d0(bVar.f224756n);
                            df8.j jVarD04 = ue8.c.d0(bVar.o);
                            pf8.i iVar3 = bVar.f224757p;
                            Intrinsics.checkNotNullParameter(iVar3, str);
                            String str3 = str;
                            String strName2 = iVar3.f235515a.name();
                            pf8.h hVar2 = iVar3.f235516b;
                            if (hVar2 instanceof pf8.f) {
                                numValueOf = Integer.valueOf(((pf8.f) hVar2).f235513a);
                            } else {
                                if (!(hVar2 instanceof pf8.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                numValueOf = null;
                            }
                            arrayList.add(new cf8.a(str2, aVar2, kVar, fVar, lVar, dVar2, cVar3, bVar3, mVar, iVar2, hVar, jVarD0, jVarD02, jVarD03, jVarD04, new df8.g(strName2, numValueOf)));
                            it8 = it9;
                            str = str3;
                        }
                        cVar.G(arrayList, strA, kii.e.o(cf8.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
