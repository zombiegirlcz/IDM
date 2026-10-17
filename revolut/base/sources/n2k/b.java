package n2k;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import do3.q;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq2.c;
import kq2.d;
import kq2.e;
import kq2.f;
import le.u1;
import m2k.a0;
import m2k.g;
import m2k.j;
import m2k.v;
import m2k.w;
import m2k.y;
import m2k.z;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f211582a = r0.k(new Pair("SHARED", c.SHARED), new Pair("DEBTOR", c.DEBTOR));

    public static final d a(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        double percent = vVar.getPercent();
        long amount = vVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = vVar.getCurrency();
        aVar.getClass();
        return new d(percent, new dj0.d(amount, xi0.a.a(currency)));
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Map] */
    public static final f b(j jVar, String str) {
        ArrayList arrayList;
        TransferQuoteSplit transferQuoteSplit;
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        e eVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        dj0.d dVarO = mo3.a.o(jVar.getFrom());
        dj0.d dVarO2 = mo3.a.o(jVar.getTo());
        dj0.d dVarO3 = mo3.a.o(jVar.getExchangeFee());
        jo3.a aVarU = jVar.getTransferFee();
        dj0.d dVarO4 = aVarU != null ? mo3.a.o(aVarU) : null;
        jo3.a aVarC = jVar.getCashAdvanceFee();
        dj0.d dVarO5 = aVarC != null ? mo3.a.o(aVarC) : null;
        dj0.d dVarO6 = mo3.a.o(jVar.getTotalFee());
        w wVarM = jVar.getFxRate();
        double rate = wVarM != null ? wVarM.getRate() : jVar.getRate();
        long jR = jVar.getTimestamp();
        v vVarJ = jVar.getExchangeRareCurrencyFee();
        d dVarA = vVarJ != null ? a(vVarJ) : null;
        v vVarK = jVar.getExchangeWeekendFee();
        d dVarA2 = vVarK != null ? a(vVarK) : null;
        v vVarG = jVar.getCryptoFee();
        d dVarA3 = vVarG != null ? a(vVarG) : null;
        v vVarE = jVar.getCommodityFee();
        d dVarA4 = vVarE != null ? a(vVarE) : null;
        List listV = jVar.getTransferFeeOptions();
        if (listV != null) {
            arrayList = new ArrayList();
            Iterator it8 = listV.iterator();
            while (it8.hasNext()) {
                y yVar = (y) it8.next();
                Iterator it9 = it8;
                c cVar = (c) u1.v(yVar.getChargeBearer(), f211582a);
                if (cVar != null) {
                    dVar = dVarO;
                    dVar2 = dVarO2;
                    dVar3 = dVarO3;
                    long amount = yVar.getAmount();
                    xi0.a aVar = xi0.b.Companion;
                    String currency = yVar.getCurrency();
                    aVar.getClass();
                    dVar4 = dVarO4;
                    eVar = new e(cVar, new dj0.d(amount, xi0.a.a(currency)));
                } else {
                    dVar = dVarO;
                    dVar2 = dVarO2;
                    dVar3 = dVarO3;
                    dVar4 = dVarO4;
                    eVar = null;
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
                it8 = it9;
                dVarO = dVar;
                dVarO2 = dVar2;
                dVarO3 = dVar3;
                dVarO4 = dVar4;
            }
        } else {
            arrayList = null;
        }
        dj0.d dVar5 = dVarO;
        dj0.d dVar6 = dVarO2;
        dj0.d dVar7 = dVarO3;
        dj0.d dVar8 = dVarO4;
        a4l.b bVarP = jVar.getTaxesDto();
        z3l.a aVarE = bVarP != null ? q.E(bVarP) : null;
        orf.a aVarF = jVar.getCreditCardInterest();
        CreditCardInterest creditCardInterestA = aVarF != null ? aVarF.a() : null;
        w wVarM2 = jVar.getFxRate();
        boolean dealing = wVarM2 != null ? wVarM2.getDealing() : true;
        g gVarD = jVar.getCharges();
        nrf.e eVarA = gVarD != null ? qk.d.A(gVarD) : null;
        z zVarW = jVar.getTransferSplit();
        if (zVarW != null) {
            Intrinsics.checkNotNullParameter(zVarW, "<this>");
            List<a0> options = zVarW.getOptions();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(options, 10));
            for (a0 a0Var : options) {
                dj0.d dVarO7 = mo3.a.o(a0Var.getAmount());
                dj0.d dVarO8 = mo3.a.o(a0Var.getTotalAmountWithInterest());
                int term = a0Var.getTerm();
                jo3.a monthlyRepayment = a0Var.getMonthlyRepayment();
                dj0.d dVarO9 = monthlyRepayment != null ? mo3.a.o(monthlyRepayment) : null;
                String firstInstalmentDueDate = a0Var.getFirstInstalmentDueDate();
                LocalDate localDate = firstInstalmentDueDate != null ? LocalDate.parse(firstInstalmentDueDate) : null;
                String lastInstalmentDueDate = a0Var.getLastInstalmentDueDate();
                arrayList2.add(new TransferQuoteSplitOption(dVarO7, dVarO8, term, dVarO9, localDate, lastInstalmentDueDate != null ? LocalDate.parse(lastInstalmentDueDate) : null, a0Var.getRate()));
            }
            transferQuoteSplit = new TransferQuoteSplit(arrayList2);
        } else {
            transferQuoteSplit = null;
        }
        jo3.a aVarA = jVar.getAmountWithoutCharges();
        dj0.d dVarO10 = aVarA != null ? mo3.a.o(aVarA) : null;
        String strH = jVar.getDisclaimer();
        a4l.b bVarQ = jVar.getTaxesInTransactionCcy();
        z3l.a aVarE2 = bVarQ != null ? q.E(bVarQ) : null;
        orf.c cVarB = jVar.getAvailability();
        TransferAvailability transferAvailabilityA = cVarB != null ? cVarB.a() : null;
        rrf.a aVarO = jVar.getTaxTreatment();
        return new f(dVar5, dVar6, dVar7, dVar8, dVarO5, dVarO6, rate, jR, dVarA, dVarA2, dVarA3, dVarA4, arrayList, aVarE, creditCardInterestA, dealing, eVarA, transferQuoteSplit, dVarO10, strH, str, aVarE2, transferAvailabilityA, aVarO != null ? n14.e.G(aVarO) : null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String c(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return u1.h(cVar, f211582a);
    }
}
