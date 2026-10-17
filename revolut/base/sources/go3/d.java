package go3;

import fo3.e;
import fo3.f;
import fo3.g;
import io3.i;
import io3.j;
import io3.l;
import io3.m;
import io3.o;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import ro3.h;
import ro3.k;
import ro3.n;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements b {
    public final fo3.c a(k dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        xi0.a aVar = xi0.b.Companion;
        String baseCurrency = dto.getBaseCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(baseCurrency);
        String ref2 = dto.getRef();
        e eVar = (e) u1.t(dto.getState(), e.TERMINATED, hb9.b.h());
        long totalTopup = dto.getTotalTopup();
        Long topupLimit = dto.getTopupLimit();
        Long topupResetDate = dto.getTopupResetDate();
        LocalDate localDateI = topupResetDate != null ? oc.c.I(topupResetDate.longValue()) : null;
        String ownerId = dto.getOwnerId();
        if (ownerId == null) {
            RuntimeException runtimeException = new RuntimeException("WalletDto.ownerId absent");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
            m70.a.c(t0.f186434a);
            ownerId = "";
        }
        return new fo3.c(id10, eVar, ref2, bVarA, totalTopup, topupLimit, localDateI, ownerId);
    }

    public final g b(String updateId, List updates) {
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        Intrinsics.checkNotNullParameter(updates, "updates");
        List<n> list = updates;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (n nVar : list) {
            String strB = nVar.b();
            List<h> listA = nVar.a();
            ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
            for (h hVar : listA) {
                arrayList2.add(new fo3.a(hVar.c(), hVar.a(), hVar.b()));
            }
            arrayList.add(new f(strB, arrayList2));
        }
        return new g(updateId, arrayList);
    }

    public final io3.d c(ro3.e dto, String walletId) {
        boolean z;
        String str;
        String str2;
        List list;
        o oVarA;
        i iVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        String id10 = dto.getId();
        String currency = dto.getCurrency();
        String name = dto.getName();
        if (name == null) {
            name = dto.getCurrency();
        }
        String str3 = name;
        l lVar = (l) u1.t(dto.getType(), l.UNKNOWN, hb9.b.g());
        io3.k kVar = (io3.k) u1.t(dto.getState(), io3.k.UNKNOWN, hb9.b.f());
        long balance = dto.getBalance();
        Long blockedAmount = dto.getBlockedAmount();
        Long blockedByOpenRevXOrder = dto.getBlockedByOpenRevXOrder();
        long jLongValue = blockedByOpenRevXOrder != null ? blockedByOpenRevXOrder.longValue() : 0L;
        Long creditLimit = dto.getCreditLimit();
        Long overdraftLimit = dto.getOverdraftLimit();
        j jVar = j.PERSONAL;
        ro3.a logo = dto.getLogo();
        io3.b bVar = logo != null ? new io3.b((io3.a) u1.u(logo.getType(), hb9.b.d()), logo.getValue()) : null;
        String institutionId = dto.getInstitutionId();
        String institutionName = dto.getInstitutionName();
        Boolean paymentInitiation = dto.getPaymentInitiation();
        boolean zBooleanValue = paymentInitiation != null ? paymentInitiation.booleanValue() : false;
        List accountsDetails = dto.getAccountsDetails();
        if (accountsDetails != null) {
            List list2 = accountsDetails;
            z = zBooleanValue;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                ro3.c cVar = (ro3.c) it8.next();
                Iterator it9 = it8;
                io3.f fVar = (io3.f) u1.u(cVar.getScope(), hb9.b.c());
                String beneficiaryName = cVar.getBeneficiaryName();
                if (beneficiaryName == null) {
                    m70.a.c(t0.f186434a);
                    beneficiaryName = "";
                }
                List fields = cVar.getFields();
                String str4 = id10;
                String str5 = currency;
                ArrayList arrayList2 = new ArrayList(w.t(fields, 10));
                for (Iterator it10 = fields.iterator(); it10.hasNext(); it10 = it10) {
                    ro3.d dVar = (ro3.d) it10.next();
                    arrayList2.add(new Pair(dVar.getLabel(), dVar.getValue()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r0.x(arrayList2, linkedHashMap);
                arrayList.add(new io3.e(fVar, beneficiaryName, linkedHashMap));
                currency = str5;
                it8 = it9;
                id10 = str4;
            }
            str = id10;
            str2 = currency;
            list = arrayList;
        } else {
            z = zBooleanValue;
            str = id10;
            str2 = currency;
            list = f0.f322471a;
        }
        ro3.j topupSettings = dto.getTopupSettings();
        if (topupSettings != null) {
            String system = topupSettings.getSystem();
            b.Companion.getClass();
            oVarA = new o((io3.n) u1.u(system, a.a()), topupSettings.getRecurrenceSupported());
        } else {
            o.Companion.getClass();
            oVarA = m.a();
        }
        String origin = dto.getOrigin();
        if (origin == null || (iVar = (i) u1.v(origin, hb9.b.b())) == null) {
            iVar = i.INTERNAL;
        }
        i iVar2 = iVar;
        boolean z3 = z;
        Long balanceUpdatedDate = dto.getBalanceUpdatedDate();
        String str6 = str2;
        Long transferLimit = dto.getTransferLimit();
        Long createdDate = dto.getCreatedDate();
        LocalDate localDateI = oc.c.I(createdDate != null ? createdDate.longValue() : 0L);
        Long updatedDate = dto.getUpdatedDate();
        return new io3.d(str, walletId, str6, str3, lVar, kVar, jVar, iVar2, balance, localDateI, blockedAmount, jLongValue, creditLimit, overdraftLimit, institutionId, institutionName, z3, bVar, list, oVarA, balanceUpdatedDate, transferLimit, updatedDate != null ? oc.c.I(updatedDate.longValue()) : null);
    }

    public final io3.d d(uo3.d entity) {
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        o oVarA;
        i iVar;
        Intrinsics.checkNotNullParameter(entity, "entity");
        String id10 = entity.getId();
        String walletId = entity.getWalletId();
        String name = entity.getName();
        String currency = entity.getCurrency();
        long balance = entity.getBalance();
        l lVar = (l) u1.u(entity.getType(), hb9.b.g());
        io3.k kVar = (io3.k) u1.u(entity.getState(), hb9.b.f());
        j jVar = (j) u1.u(entity.getInternalType(), hb9.b.e());
        Long creditLimit = entity.getCreditLimit();
        Long overdraftLimit = entity.getOverdraftLimit();
        Long blockedAmount = entity.getBlockedAmount();
        Long blockedByOpenRevXOrder = entity.getBlockedByOpenRevXOrder();
        long jLongValue = blockedByOpenRevXOrder != null ? blockedByOpenRevXOrder.longValue() : 0L;
        String institutionId = entity.getInstitutionId();
        String institutionName = entity.getInstitutionName();
        boolean availableForTopUpFrom = entity.getAvailableForTopUpFrom();
        uo3.a logo = entity.getLogo();
        io3.b bVar = logo != null ? new io3.b((io3.a) u1.u(logo.getType(), hb9.b.d()), logo.getValue()) : null;
        List accounts = entity.getAccounts();
        if (accounts != null) {
            List list2 = accounts;
            str = id10;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                uo3.c cVar = (uo3.c) it8.next();
                Iterator it9 = it8;
                io3.f fVar = (io3.f) u1.u(cVar.getScope(), hb9.b.c());
                String beneficiaryName = cVar.getBeneficiaryName();
                List fields = cVar.getFields();
                String str5 = walletId;
                String str6 = currency;
                String str7 = name;
                ArrayList arrayList2 = new ArrayList(w.t(fields, 10));
                for (Iterator it10 = fields.iterator(); it10.hasNext(); it10 = it10) {
                    uo3.b bVar2 = (uo3.b) it10.next();
                    arrayList2.add(new Pair(bVar2.getLabel(), bVar2.getValue()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r0.x(arrayList2, linkedHashMap);
                arrayList.add(new io3.e(fVar, beneficiaryName, linkedHashMap));
                name = str7;
                it8 = it9;
                walletId = str5;
                currency = str6;
            }
            str2 = walletId;
            str3 = currency;
            str4 = name;
            list = arrayList;
        } else {
            str = id10;
            str2 = walletId;
            str3 = currency;
            str4 = name;
            list = f0.f322471a;
        }
        uo3.e topupSettings = entity.getTopupSettings();
        if (topupSettings != null) {
            String system = topupSettings.getSystem();
            b.Companion.getClass();
            oVarA = new o((io3.n) u1.u(system, a.a()), topupSettings.getRecurrenceSupported());
        } else {
            o.Companion.getClass();
            oVarA = m.a();
        }
        String originType = entity.getOriginType();
        if (originType == null || (iVar = (i) u1.v(originType, hb9.b.b())) == null) {
            iVar = i.INTERNAL;
        }
        Long balanceUpdatedDate = entity.getBalanceUpdatedDate();
        String str8 = str2;
        Long transferLimit = entity.getTransferLimit();
        LocalDate localDateI = oc.c.I(entity.getCreatedDate());
        Long updatedDate = entity.getUpdatedDate();
        return new io3.d(str, str8, str3, str4, lVar, kVar, jVar, iVar, balance, localDateI, blockedAmount, jLongValue, creditLimit, overdraftLimit, institutionId, institutionName, availableForTopUpFrom, bVar, list, oVarA, balanceUpdatedDate, transferLimit, updatedDate != null ? oc.c.I(updatedDate.longValue()) : null);
    }

    public final uo3.d e(io3.d pocket) {
        String str;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        String id10 = pocket.getId();
        String strO1 = pocket.o1();
        String currency = pocket.getCurrency();
        long jD = pocket.d();
        String strG = u1.g(pocket.u(), hb9.b.g());
        String strG2 = u1.g(pocket.r(), hb9.b.f());
        String name = pocket.getName();
        int i = c.f145081a[pocket.q().ordinal()];
        if (i == 1) {
            str = "PERSONAL";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SHARED";
        }
        String str2 = str;
        Long lK = pocket.k();
        Long lP = pocket.p();
        Long lF = pocket.f();
        long jH = pocket.h();
        String strL = pocket.l();
        String strM = pocket.m();
        boolean zC = pocket.c();
        io3.b bVarN = pocket.n();
        uo3.a aVar = bVarN != null ? new uo3.a(u1.g(bVarN.a(), hb9.b.d()), bVarN.b()) : null;
        List listB = pocket.b();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            io3.e eVar = (io3.e) it8.next();
            Iterator it9 = it8;
            String strG3 = u1.g(eVar.c(), hb9.b.c());
            String strA = eVar.a();
            LinkedHashMap linkedHashMapB = eVar.b();
            String str3 = strO1;
            String str4 = str2;
            ArrayList arrayList2 = new ArrayList(linkedHashMapB.size());
            Iterator it10 = linkedHashMapB.entrySet().iterator();
            while (it10.hasNext()) {
                Map.Entry entry = (Map.Entry) it10.next();
                Iterator it11 = it10;
                String str5 = strG;
                arrayList2.add(new uo3.b((String) entry.getKey(), (String) entry.getValue()));
                strG2 = strG2;
                strG = str5;
                it10 = it11;
            }
            arrayList.add(new uo3.c(strG3, strA, arrayList2));
            it8 = it9;
            strO1 = str3;
            str2 = str4;
        }
        String str6 = strO1;
        String str7 = str2;
        String str8 = strG;
        String str9 = strG2;
        o topupSettings = pocket.s();
        Intrinsics.checkNotNullParameter(topupSettings, "topupSettings");
        io3.n nVarB = topupSettings.b();
        b.Companion.getClass();
        uo3.e eVar2 = new uo3.e(u1.g(nVarB, a.a()), topupSettings.a());
        String strH = u1.h(pocket.o(), hb9.b.b());
        Long lE = pocket.e();
        Long lT = pocket.t();
        long jN = oc.c.N(pocket.i());
        LocalDate localDateV = pocket.v();
        return new uo3.d(id10, str6, str7, str8, str9, name, currency, jD, jN, lF, Long.valueOf(jH), lK, lP, aVar, strL, strM, zC, arrayList, eVar2, strH, lE, lT, localDateV != null ? Long.valueOf(oc.c.N(localDateV)) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public final ArrayList f(k dto) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        List pockets = dto.getPockets();
        ArrayList arrayList2 = new ArrayList(w.t(pockets, 10));
        Iterator it8 = pockets.iterator();
        while (it8.hasNext()) {
            arrayList2.add(c((ro3.e) it8.next(), dto.getId()));
        }
        List sharedPockets = dto.getSharedPockets();
        if (sharedPockets != null) {
            List<ro3.i> list = sharedPockets;
            arrayList = new ArrayList(w.t(list, 10));
            for (ro3.i iVar : list) {
                String id10 = dto.getId();
                String id11 = iVar.getId();
                String currency = iVar.getCurrency();
                String name = iVar.getName();
                if (name == null) {
                    name = iVar.getCurrency();
                }
                String str = name;
                l lVar = (l) u1.t(iVar.getType(), l.UNKNOWN, hb9.b.g());
                io3.k kVar = (io3.k) u1.t(iVar.getState(), io3.k.UNKNOWN, hb9.b.f());
                long balance = iVar.getBalance();
                j jVar = j.SHARED;
                LocalDate localDateI = oc.c.I(0L);
                f0 f0Var = f0.f322471a;
                o.Companion.getClass();
                o oVarA = m.a();
                i iVar2 = i.INTERNAL;
                Long updatedDate = iVar.getUpdatedDate();
                arrayList.add(new io3.d(id11, id10, currency, str, lVar, kVar, jVar, iVar2, balance, localDateI, f0Var, oVarA, updatedDate != null ? oc.c.I(updatedDate.longValue()) : null));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return d0.E0(arrayList, arrayList2);
    }
}
