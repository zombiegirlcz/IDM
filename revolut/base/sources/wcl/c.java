package wcl;

import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kel.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import wel.e;
import wel.f;
import wel.g;
import wel.i;
import wel.j;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f296426a = r0.k(new Pair("NONE", TradingOnboardingStatus.NONE), new Pair("FAILED", TradingOnboardingStatus.FAILED), new Pair("PENDING", TradingOnboardingStatus.PENDING), new Pair("COMPLETED", TradingOnboardingStatus.COMPLETED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f296427b = r0.k(new Pair("ENABLED", j.ENABLED), new Pair("DISABLED", j.DISABLED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f296428c;

    static {
        String str;
        i[] iVarArrValues = i.values();
        int iB = q0.b(iVarArrValues.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (i iVar : iVarArrValues) {
            int i = b.f296425a[iVar.ordinal()];
            if (i == 1) {
                str = "CREATED";
            } else if (i == 2) {
                str = "ACTIVE";
            } else if (i == 3) {
                str = "SUSPENDED";
            } else if (i == 4) {
                str = "OFFBOARDING";
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "TERMINATED";
            }
            linkedHashMap.put(str, iVar);
        }
        f296428c = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Map] */
    public static final e a(kcl.b bVar, ArrayList holdings) {
        h hVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        String str = bVar.f182740a;
        String str2 = bVar.f182741b;
        jo3.b bVar2 = bVar.d;
        wel.h hVar2 = null;
        d dVarV = bVar2 != null ? hx7.a.v(bVar2) : null;
        lcl.b bVar3 = bVar.e;
        Intrinsics.checkNotNullParameter(bVar3, "<this>");
        String[] elements = {bVar3.getFirstNationality(), bVar3.getSecondNationality()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList);
        }
        Boolean usTaxPayer = bVar3.getUsTaxPayer();
        Boolean rtlBrexitOptIn = bVar3.getRtlBrexitOptIn();
        List<lcl.a> documents = bVar3.getDocuments();
        ArrayList arrayList2 = new ArrayList(w.t(documents, 10));
        for (lcl.a aVar : documents) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String countryCode = aVar.getCountryCode();
            wi0.b.Companion.getClass();
            arrayList2.add(new xel.c(wi0.a.a(countryCode), aVar.getKey(), aVar.getName(), aVar.getHint(), aVar.getSubtitle(), aVar.getCanSkip(), aVar.getValidation(), aVar.getCheck(), aVar.getValue(), aVar.getInfoLink()));
        }
        xel.b bVar4 = new xel.b(arrayList2, arrayList, usTaxPayer, rtlBrexitOptIn);
        kcl.c cVar = bVar.f182743g;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        kcl.d stockInfo = cVar.getStockInfo();
        if (stockInfo != null) {
            Intrinsics.checkNotNullParameter(stockInfo, "<this>");
            String kycStatus = stockInfo.getKycStatus();
            TradingOnboardingStatus tradingOnboardingStatus = kycStatus != null ? (TradingOnboardingStatus) u1.u(kycStatus, f296426a) : TradingOnboardingStatus.NONE;
            String driveWealthAccountNumber = stockInfo.getDriveWealthAccountNumber();
            String stockLendingState = stockInfo.getStockLendingState();
            hVar2 = new wel.h(tradingOnboardingStatus, driveWealthAccountNumber, stockLendingState != null ? (j) u1.u(stockLendingState, f296427b) : null, stockInfo.getExtendedHoursOptInPassed());
        }
        g gVar = new g(hVar2);
        List<jcl.d> list = bVar.f182742c;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (jcl.d dVar : list) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            int i = a.e[dVar.ordinal()];
            if (i == 1) {
                hVar = h.STOCK;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = h.CASH;
            }
            arrayList3.add(hVar);
        }
        i iVar = (i) u1.v(str2, f296428c);
        if (iVar == null) {
            throw new IllegalStateException(j6.a.q("Undefined portfolio state ", str2));
        }
        kcl.a aVar2 = bVar.f;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        return new e(str, iVar, bVar4, dVarV, holdings, gVar, new f(aVar2.getRtlBrexitOptInRequired(), aVar2.getRtlBrexitOptInSkippable()), arrayList3, bVar.f182744h, bVar.i);
    }
}
