package i3k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import h3k.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import m2k.y;
import z1k.o;
import z1k.p;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f158233a = q0.c(new Pair("CHARGE_BEARER", z1k.g.CHARGE_BEARER));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RemittanceRouteId a(String str, String str2, String str3) {
        switch (str.hashCode()) {
            case 2031164:
                if (str.equals("BANK")) {
                    return RemittanceRouteId.BANK.f101914b;
                }
                break;
            case 2061072:
                if (str.equals("CARD")) {
                    return RemittanceRouteId.CARD.f101915b;
                }
                break;
            case 1353037501:
                if (str.equals("INTERNAL")) {
                    return RemittanceRouteId.Internal.f101916b;
                }
                break;
            case 1723967030:
                if (str.equals("MOBILE_WALLET")) {
                    if (str2 != null) {
                        return new RemittanceRouteId.MobileWallet(str2, str3);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                break;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "RemittanceDtoToDomainMapper", "Received unknown route: ".concat(str), null, null, 16);
        return null;
    }

    public static final z1k.m b(h3k.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        wi0.a aVar = wi0.b.Companion;
        String code = mVar.getCode();
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(code);
        String name = mVar.getName();
        xi0.a aVar2 = xi0.b.Companion;
        String defaultCurrency = mVar.getDefaultCurrency();
        aVar2.getClass();
        return new z1k.m(name, bVarA, xi0.a.a(defaultCurrency), xi0.a.a(mVar.getLocalCurrency()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final p c(q qVar, String str) {
        ArrayList arrayList;
        Iterator it8;
        z1k.h hVar;
        z1k.h hVar2;
        n9l.a aVar;
        ?? arrayList2;
        o oVar;
        kq2.o oVar2;
        Iterator it9;
        z1k.h hVar3;
        z1k.h hVar4;
        n9l.a aVar2;
        z1k.i iVar;
        z1k.j jVar;
        ArrayList arrayList3;
        z1k.h hVar5;
        z1k.h hVar6;
        n9l.a aVar3;
        kq2.e eVar;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        h3k.f sender = qVar.getSender();
        long amount = sender.getAmount();
        xi0.a aVar4 = xi0.b.Companion;
        String currency = sender.getCurrency();
        aVar4.getClass();
        z1k.h hVar7 = new z1k.h(amount, xi0.a.a(currency));
        h3k.f recipient = qVar.getRecipient();
        long amount2 = recipient.getAmount();
        String currency2 = recipient.getCurrency();
        aVar4.getClass();
        z1k.h hVar8 = new z1k.h(amount2, xi0.a.a(currency2));
        h3k.l rate = qVar.getRate();
        String from = rate.getFrom();
        aVar4.getClass();
        n9l.a aVar5 = new n9l.a(xi0.a.a(from), xi0.a.a(rate.getTo()), rate.getRate(), null, null, null);
        List routes = qVar.getRoutes();
        ArrayList arrayList4 = new ArrayList();
        Iterator it10 = routes.iterator();
        while (it10.hasNext()) {
            h3k.p pVar = (h3k.p) it10.next();
            RemittanceRouteId remittanceRouteIdA = a(pVar.getId(), pVar.getTransferVendor(), pVar.getLocalisedName());
            if (remittanceRouteIdA == null) {
                it8 = it10;
                hVar = hVar7;
                hVar2 = hVar8;
                aVar = aVar5;
                oVar = null;
            } else {
                String estimate = pVar.getEstimate();
                Boolean intermediaryFees = pVar.getIntermediaryFees();
                List<h3k.g> plans = pVar.getPlans();
                if (plans != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (h3k.g gVar : plans) {
                        if (Intrinsics.f(gVar.getId(), "CURRENT")) {
                            z1k.k kVar = z1k.k.CURRENT;
                            String name = gVar.getName();
                            h3k.h fees = gVar.getFees();
                            if (fees != null) {
                                h3k.e fxRareCurrency = fees.getFxRareCurrency();
                                z1k.f fVar = fxRareCurrency != null ? new z1k.f(fxRareCurrency.getPercent(), fxRareCurrency.getAmount(), fxRareCurrency.getCurrency()) : null;
                                h3k.e fxWeekend = fees.getFxWeekend();
                                z1k.f fVar2 = fxWeekend != null ? new z1k.f(fxWeekend.getPercent(), fxWeekend.getAmount(), fxWeekend.getCurrency()) : null;
                                long fx2 = fees.getFx();
                                long ftt = fees.getFtt();
                                long transfer = fees.getTransfer();
                                long total = fees.getTotal();
                                long cost = fees.getCost();
                                xi0.a aVar6 = xi0.b.Companion;
                                String currency3 = fees.getCurrency();
                                aVar6.getClass();
                                jVar = new z1k.j(fVar, fVar2, fx2, ftt, transfer, total, cost, xi0.a.a(currency3));
                            } else {
                                jVar = null;
                            }
                            List<y> transferFeeOptions = gVar.getTransferFeeOptions();
                            if (transferFeeOptions != null) {
                                ArrayList arrayList6 = new ArrayList();
                                for (y yVar : transferFeeOptions) {
                                    Iterator it11 = it10;
                                    kq2.c cVar = (kq2.c) u1.v(yVar.getChargeBearer(), n2k.b.f211582a);
                                    if (cVar != null) {
                                        hVar5 = hVar7;
                                        hVar6 = hVar8;
                                        long amount3 = yVar.getAmount();
                                        xi0.a aVar7 = xi0.b.Companion;
                                        String currency4 = yVar.getCurrency();
                                        aVar7.getClass();
                                        aVar3 = aVar5;
                                        eVar = new kq2.e(cVar, new dj0.d(amount3, xi0.a.a(currency4)));
                                    } else {
                                        hVar5 = hVar7;
                                        hVar6 = hVar8;
                                        aVar3 = aVar5;
                                        eVar = null;
                                    }
                                    if (eVar != null) {
                                        arrayList6.add(eVar);
                                    }
                                    it10 = it11;
                                    hVar7 = hVar5;
                                    hVar8 = hVar6;
                                    aVar5 = aVar3;
                                }
                                arrayList3 = arrayList6;
                            } else {
                                arrayList3 = null;
                            }
                            it9 = it10;
                            hVar3 = hVar7;
                            hVar4 = hVar8;
                            aVar2 = aVar5;
                            m2k.g charges = gVar.getCharges();
                            iVar = new z1k.i(kVar, name, jVar, arrayList3, charges != null ? qk.d.A(charges) : null);
                        } else {
                            it9 = it10;
                            hVar3 = hVar7;
                            hVar4 = hVar8;
                            aVar2 = aVar5;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.b(rd0.c.WARNING, "RemittanceDtoToDomainMapper", j6.a.q("Received unknown plan: ", gVar.getId()), null, null, 16);
                            iVar = null;
                        }
                        if (iVar != null) {
                            arrayList5.add(iVar);
                        }
                        it10 = it9;
                        hVar7 = hVar3;
                        hVar8 = hVar4;
                        aVar5 = aVar2;
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                it8 = it10;
                hVar = hVar7;
                hVar2 = hVar8;
                aVar = aVar5;
                List<String> supportedStraightThroughMethods = pVar.getSupportedStraightThroughMethods();
                if (supportedStraightThroughMethods != null) {
                    arrayList2 = new ArrayList();
                    for (String str2 : supportedStraightThroughMethods) {
                        kq2.o[] oVarArrValues = kq2.o.values();
                        int length = oVarArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                oVar2 = null;
                                break;
                            }
                            oVar2 = oVarArrValues[i];
                            if (a0.z(oVar2.name(), str2, true)) {
                                break;
                            }
                            i++;
                        }
                        if (oVar2 != null) {
                            arrayList2.add(oVar2);
                        }
                    }
                } else {
                    arrayList2 = f0.f322471a;
                }
                oVar = new o(remittanceRouteIdA, estimate, intermediaryFees, arrayList, arrayList2);
            }
            if (oVar != null) {
                arrayList4.add(oVar);
            }
            it10 = it8;
            hVar7 = hVar;
            hVar8 = hVar2;
            aVar5 = aVar;
        }
        z1k.h hVar9 = hVar7;
        z1k.h hVar10 = hVar8;
        n9l.a aVar8 = aVar5;
        orf.c availability = qVar.getAvailability();
        return new p(hVar9, hVar10, aVar8, arrayList4, availability != null ? availability.a() : null, str);
    }
}
