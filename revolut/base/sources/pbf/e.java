package pbf;

import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lbf.k;
import lbf.m;
import qbf.o;
import qbf.p;
import qbf.t;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static m a(o dto) {
        lbf.f fVar;
        k kVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String strD = dto.getId();
        int i = f.f234681a[dto.getCode().ordinal()];
        if (i == 1) {
            fVar = lbf.f.TRADING_PRO;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = lbf.f.UNKNOWN;
        }
        lbf.f fVar2 = fVar;
        List<qbf.d> listA = dto.getBilling();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (qbf.d dVar : listA) {
            lbf.c cVarC = hx7.b.C(dVar.getCode());
            Period periodE = dVar.getPeriod();
            dj0.d dVarO = mo3.a.o(dVar.getFee());
            qbf.c cVarB = dVar.getDiscount();
            lbf.e eVar = null;
            lbf.d dVar2 = cVarB != null ? new lbf.d(cVarB.getDuration(), cVarB.getEndDate(), cVarB.getTermsUrl(), mo3.a.o(cVarB.getFee())) : null;
            qbf.e eVarD = dVar.getFreeTrial();
            if (eVarD != null) {
                eVar = new lbf.e(eVarD.getDuration(), eVarD.getEndDate(), eVarD.getTermsUrl());
            }
            arrayList.add(new lbf.b(cVarC, periodE, dVarO, dVar2, eVar));
        }
        List listC = dto.getIb.b.Features java.lang.String();
        ArrayList arrayList2 = new ArrayList(w.t(listC, 10));
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            switch (f.f234683c[((t) it8.next()).ordinal()]) {
                case 1:
                    kVar = k.UNKNOWN;
                    break;
                case 2:
                    kVar = k.STOCKS;
                    break;
                case 3:
                    kVar = k.CRYPTO;
                    break;
                case 4:
                    kVar = k.ADVANCED_PORTFOLIO_ANALYTICS;
                    break;
                case 5:
                    kVar = k.ADVANCED_WEB_TRADING_TERMINAL;
                    break;
                case 6:
                    kVar = k.EXTENDED_SECURITIES;
                    break;
                case 7:
                    kVar = k.INCREASED_ORDER_LIMITS;
                    break;
                case 8:
                    kVar = k.DEDICATED_CUSTOMER_SUPPORT;
                    break;
                case 9:
                    kVar = k.NO_MINIMUM_FEES;
                    break;
                case 10:
                    kVar = k.ORDER_BOOK;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(kVar);
        }
        List listF = dto.getProducts();
        ArrayList arrayList3 = new ArrayList();
        Iterator it9 = listF.iterator();
        while (it9.hasNext()) {
            lbf.a aVarC = hx7.e.c((p) it9.next());
            if (aVarC != null) {
                arrayList3.add(aVarC);
            }
        }
        List listE = dto.getPricingPlanProducts();
        ArrayList arrayList4 = new ArrayList();
        Iterator it10 = listE.iterator();
        while (it10.hasNext()) {
            lbf.a aVarC2 = hx7.e.c((p) it10.next());
            if (aVarC2 != null) {
                arrayList4.add(aVarC2);
            }
        }
        return new m(strD, fVar2, arrayList, arrayList2, arrayList3, arrayList4, dto.getTermsUrl());
    }
}
