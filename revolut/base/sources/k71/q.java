package k71;

import com.revolut.domain.models.joint.JointAccountData;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements Serializable {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.n f181794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f181795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f181796c;
    public final Map d;
    public final Map e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f181797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f181798h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r61.c f181799j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yt8.i f181800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f181801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f181802n;
    public final Map o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f181803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f181804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final JointAccountData f181805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f181806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f181807t;
    public final Map u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f181808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f181809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f181810y;

    public q(do3.n nVar, Map pockets, Map pocketOwners, Map customisedVaults, Map billAccount, String mainWalletId, Map splitBills, boolean z, Map groupsData, r61.c cryptoWithdrawData, Map cryptoActionRequiredDeposits, yt8.i iVar, boolean z3, Map maxLoanAmountByCurrencyMap, Map minLoanAmountByCurrencyMap, boolean z4, Map beneficiaries, JointAccountData jointAccountData, Map juniorTransactionData, Map proBackgroundIcons, Map roboPortfolioInfo, List creditCardInstalmentTransactionIds, Set hiddenAccountsIds, List debitToInstalmentTagTransactionIds, Map paidPlanContactsMap) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(pocketOwners, "pocketOwners");
        Intrinsics.checkNotNullParameter(customisedVaults, "customisedVaults");
        Intrinsics.checkNotNullParameter(billAccount, "billAccount");
        Intrinsics.checkNotNullParameter(mainWalletId, "mainWalletId");
        Intrinsics.checkNotNullParameter(splitBills, "splitBills");
        Intrinsics.checkNotNullParameter(groupsData, "groupsData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawData, "cryptoWithdrawData");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposits, "cryptoActionRequiredDeposits");
        Intrinsics.checkNotNullParameter(maxLoanAmountByCurrencyMap, "maxLoanAmountByCurrencyMap");
        Intrinsics.checkNotNullParameter(minLoanAmountByCurrencyMap, "minLoanAmountByCurrencyMap");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        Intrinsics.checkNotNullParameter(juniorTransactionData, "juniorTransactionData");
        Intrinsics.checkNotNullParameter(proBackgroundIcons, "proBackgroundIcons");
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        Intrinsics.checkNotNullParameter(creditCardInstalmentTransactionIds, "creditCardInstalmentTransactionIds");
        Intrinsics.checkNotNullParameter(hiddenAccountsIds, "hiddenAccountsIds");
        Intrinsics.checkNotNullParameter(debitToInstalmentTagTransactionIds, "debitToInstalmentTagTransactionIds");
        Intrinsics.checkNotNullParameter(paidPlanContactsMap, "paidPlanContactsMap");
        this.f181794a = nVar;
        this.f181795b = pockets;
        this.f181796c = pocketOwners;
        this.d = customisedVaults;
        this.e = billAccount;
        this.f = mainWalletId;
        this.f181797g = splitBills;
        this.f181798h = z;
        this.i = groupsData;
        this.f181799j = cryptoWithdrawData;
        this.k = cryptoActionRequiredDeposits;
        this.f181800l = iVar;
        this.f181801m = z3;
        this.f181802n = maxLoanAmountByCurrencyMap;
        this.o = minLoanAmountByCurrencyMap;
        this.f181803p = z4;
        this.f181804q = beneficiaries;
        this.f181805r = jointAccountData;
        this.f181806s = juniorTransactionData;
        this.f181807t = proBackgroundIcons;
        this.u = roboPortfolioInfo;
        this.v = creditCardInstalmentTransactionIds;
        this.f181808w = hiddenAccountsIds;
        this.f181809x = debitToInstalmentTagTransactionIds;
        this.f181810y = paidPlanContactsMap;
    }

    public static q a(q qVar, boolean z, Map map, Map map2, LinkedHashMap linkedHashMap, int i) {
        boolean z3;
        Map beneficiaries;
        do3.n nVar = qVar.f181794a;
        Map pockets = qVar.f181795b;
        Map pocketOwners = qVar.f181796c;
        Map customisedVaults = qVar.d;
        Map billAccount = qVar.e;
        String mainWalletId = qVar.f;
        Map splitBills = qVar.f181797g;
        boolean z4 = qVar.f181798h;
        Map groupsData = qVar.i;
        r61.c cryptoWithdrawData = qVar.f181799j;
        Map cryptoActionRequiredDeposits = qVar.k;
        yt8.i iVar = qVar.f181800l;
        boolean z6 = (i & 4096) != 0 ? qVar.f181801m : z;
        Map maxLoanAmountByCurrencyMap = (i & 8192) != 0 ? qVar.f181802n : map;
        Map minLoanAmountByCurrencyMap = (i & 16384) != 0 ? qVar.o : map2;
        boolean z11 = qVar.f181803p;
        if ((i & 65536) != 0) {
            z3 = z11;
            beneficiaries = qVar.f181804q;
        } else {
            z3 = z11;
            beneficiaries = linkedHashMap;
        }
        JointAccountData jointAccountData = qVar.f181805r;
        Map juniorTransactionData = qVar.f181806s;
        Map proBackgroundIcons = qVar.f181807t;
        boolean z12 = z6;
        Map roboPortfolioInfo = qVar.u;
        List creditCardInstalmentTransactionIds = qVar.v;
        Set hiddenAccountsIds = qVar.f181808w;
        List debitToInstalmentTagTransactionIds = qVar.f181809x;
        Map paidPlanContactsMap = qVar.f181810y;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(pocketOwners, "pocketOwners");
        Intrinsics.checkNotNullParameter(customisedVaults, "customisedVaults");
        Intrinsics.checkNotNullParameter(billAccount, "billAccount");
        Intrinsics.checkNotNullParameter(mainWalletId, "mainWalletId");
        Intrinsics.checkNotNullParameter(splitBills, "splitBills");
        Intrinsics.checkNotNullParameter(groupsData, "groupsData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawData, "cryptoWithdrawData");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposits, "cryptoActionRequiredDeposits");
        Intrinsics.checkNotNullParameter(maxLoanAmountByCurrencyMap, "maxLoanAmountByCurrencyMap");
        Intrinsics.checkNotNullParameter(minLoanAmountByCurrencyMap, "minLoanAmountByCurrencyMap");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        Intrinsics.checkNotNullParameter(juniorTransactionData, "juniorTransactionData");
        Intrinsics.checkNotNullParameter(proBackgroundIcons, "proBackgroundIcons");
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        Intrinsics.checkNotNullParameter(creditCardInstalmentTransactionIds, "creditCardInstalmentTransactionIds");
        Intrinsics.checkNotNullParameter(hiddenAccountsIds, "hiddenAccountsIds");
        Intrinsics.checkNotNullParameter(debitToInstalmentTagTransactionIds, "debitToInstalmentTagTransactionIds");
        Intrinsics.checkNotNullParameter(paidPlanContactsMap, "paidPlanContactsMap");
        return new q(nVar, pockets, pocketOwners, customisedVaults, billAccount, mainWalletId, splitBills, z4, groupsData, cryptoWithdrawData, cryptoActionRequiredDeposits, iVar, z12, maxLoanAmountByCurrencyMap, minLoanAmountByCurrencyMap, z3, beneficiaries, jointAccountData, juniorTransactionData, proBackgroundIcons, roboPortfolioInfo, creditCardInstalmentTransactionIds, hiddenAccountsIds, debitToInstalmentTagTransactionIds, paidPlanContactsMap);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f181794a, qVar.f181794a) && Intrinsics.f(this.f181795b, qVar.f181795b) && Intrinsics.f(this.f181796c, qVar.f181796c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f181797g, qVar.f181797g) && this.f181798h == qVar.f181798h && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f181799j, qVar.f181799j) && Intrinsics.f(this.k, qVar.k) && this.f181800l == qVar.f181800l && this.f181801m == qVar.f181801m && Intrinsics.f(this.f181802n, qVar.f181802n) && Intrinsics.f(this.o, qVar.o) && this.f181803p == qVar.f181803p && Intrinsics.f(this.f181804q, qVar.f181804q) && Intrinsics.f(this.f181805r, qVar.f181805r) && Intrinsics.f(this.f181806s, qVar.f181806s) && Intrinsics.f(this.f181807t, qVar.f181807t) && Intrinsics.f(this.u, qVar.u) && Intrinsics.f(this.v, qVar.v) && Intrinsics.f(this.f181808w, qVar.f181808w) && Intrinsics.f(this.f181809x, qVar.f181809x) && Intrinsics.f(this.f181810y, qVar.f181810y);
    }

    public final int hashCode() {
        do3.n nVar = this.f181794a;
        int iE = p.a.e((this.f181799j.hashCode() + p.a.e(j6.a.c(p.a.e(p.a.c(p.a.e(p.a.e(p.a.e(p.a.e((nVar == null ? 0 : nVar.hashCode()) * 31, 31, this.f181795b), 31, this.f181796c), 31, this.d), 31, this.e), 31, this.f), 31, this.f181797g), 31, this.f181798h), 31, this.i)) * 31, 31, this.k);
        yt8.i iVar = this.f181800l;
        int iE2 = p.a.e(j6.a.c(p.a.e(p.a.e(j6.a.c((iE + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f181801m), 31, this.f181802n), 31, this.o), 31, this.f181803p), 31, this.f181804q);
        JointAccountData jointAccountData = this.f181805r;
        return this.f181810y.hashCode() + p.a.d(p.a.f(p.a.d(p.a.e(p.a.e(p.a.e((iE2 + (jointAccountData != null ? jointAccountData.hashCode() : 0)) * 31, 31, this.f181806s), 31, this.f181807t), 31, this.u), 31, this.v), 31, this.f181808w), 31, this.f181809x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(do3.n nVar, Map map, Map map2, Map map3, Map map4, String str, Map map5, boolean z, Map map6, r61.c cVar, LinkedHashMap linkedHashMap, yt8.i iVar, boolean z3, JointAccountData jointAccountData, Map map7, Map map8, Map map9, List list, Set set, List list2, Map map10, int i) {
        r61.c cVarA;
        if ((i & 512) != 0) {
            r61.c.Companion.getClass();
            cVarA = r61.b.a();
        } else {
            cVarA = cVar;
        }
        this(nVar, map, map2, map3, map4, str, map5, z, map6, cVarA, (i & 1024) != 0 ? r0.g() : linkedHashMap, iVar, false, r0.g(), r0.g(), z3, r0.g(), (131072 & i) != 0 ? null : jointAccountData, (262144 & i) != 0 ? r0.g() : map7, (524288 & i) != 0 ? r0.g() : map8, (1048576 & i) != 0 ? r0.g() : map9, (2097152 & i) != 0 ? f0.f322471a : list, (4194304 & i) != 0 ? h0.f322473a : set, (8388608 & i) != 0 ? f0.f322471a : list2, (i & 16777216) != 0 ? r0.g() : map10);
    }
}
