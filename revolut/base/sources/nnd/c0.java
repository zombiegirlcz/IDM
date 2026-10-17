package nnd;

import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnd.j f217534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f217535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f217536c;
    public final zf8.k d;
    public final rnd.v0 e;
    public final ge3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j9l.a f217537g;

    public c0(rnd.j analyticsAccountProvider, wsg.n walletInteractor, ppk.f ratesInteractor, zf8.k juniorAccountInfoProvider, rnd.v0 savingsAnalyticsAccountProvider, ge3.a analyticsPocketsInteractor, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(analyticsAccountProvider, "analyticsAccountProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(savingsAnalyticsAccountProvider, "savingsAnalyticsAccountProvider");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f217534a = analyticsAccountProvider;
        this.f217535b = walletInteractor;
        this.f217536c = ratesInteractor;
        this.d = juniorAccountInfoProvider;
        this.e = savingsAnalyticsAccountProvider;
        this.f = analyticsPocketsInteractor;
        this.f217537g = moneyCalculator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0076, code lost:
    
        r7.put(r5, (xi0.b) r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0109 -> B:47:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0131 -> B:46:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nnd.c0 r11, java.util.List r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nnd.c0.a(nnd.c0, java.util.List, gim.c):java.lang.Object");
    }

    public static io3.d c(AnalyticsAccount analyticsAccount, String str, Map map) {
        Object next;
        List<AnalyticsAccountPocketSource> list = (List) map.get(analyticsAccount);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AnalyticsAccountPocketSource analyticsAccountPocketSource : list) {
                AnalyticsAccountPocketSource.PocketSource pocketSource = analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource ? (AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource : null;
                if (pocketSource != null) {
                    arrayList.add(pocketSource);
                }
            }
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((AnalyticsAccountPocketSource.PocketSource) next).f65740a.f163145a, str)) {
                    break;
                }
            }
            AnalyticsAccountPocketSource.PocketSource pocketSource2 = (AnalyticsAccountPocketSource.PocketSource) next;
            if (pocketSource2 != null) {
                return pocketSource2.f65740a;
            }
        }
        return null;
    }

    public static Subaccount d(SpendingAnalyticsAccount spendingAnalyticsAccount, String str, Map map) {
        Object next;
        List<AnalyticsAccountPocketSource> list = (List) map.get(spendingAnalyticsAccount);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AnalyticsAccountPocketSource analyticsAccountPocketSource : list) {
                AnalyticsAccountPocketSource.SubaccountSource subaccountSource = analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource ? (AnalyticsAccountPocketSource.SubaccountSource) analyticsAccountPocketSource : null;
                if (subaccountSource != null) {
                    arrayList.add(subaccountSource);
                }
            }
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((AnalyticsAccountPocketSource.SubaccountSource) next).f65741a.getF88959a().f234881a, str)) {
                    break;
                }
            }
            AnalyticsAccountPocketSource.SubaccountSource subaccountSource2 = (AnalyticsAccountPocketSource.SubaccountSource) next;
            if (subaccountSource2 != null) {
                return subaccountSource2.f65741a;
            }
        }
        return null;
    }

    public static dj0.d e(AnalyticsAccountPocketSource analyticsAccountPocketSource) {
        if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource) {
            return io3.h.e(((AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource).f65740a);
        }
        if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource) {
            return ((AnalyticsAccountPocketSource.SubaccountSource) analyticsAccountPocketSource).f65741a.getBalance();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final dj0.d b(List list, List list2, xi0.b bVar) {
        if (list == null) {
            return null;
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(e((AnalyticsAccountPocketSource) it8.next()));
        }
        return this.f217537g.a(bVar, arrayList, list2);
    }
}
