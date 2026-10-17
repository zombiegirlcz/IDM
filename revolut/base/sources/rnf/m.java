package rnf;

import com.revolut.domain.models.joint.JointAccountData;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tof.x2;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    public final Double A;
    public final boolean B;
    public final x2 C;
    public final List D;
    public final Set E;
    public final na7.a F;
    public final List G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f255666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f255668c;
    public final Map d;
    public final Map e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v61.h f255669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sq9.c f255670h;
    public final MoneyRequest i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f255671j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f255672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f255673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f255674n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TrustedMerchant f255675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f255676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f255677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f255678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final JointAccountData f255679t;
    public final Map u;
    public final r61.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f255680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f255681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q f255682y;
    public final r z;

    public m(u transactionResult, String mainWalletId, do3.n user, Map pockets, Map customisedVaults, Map billAccounts, v61.h hVar, sq9.c cVar, MoneyRequest moneyRequest, List splittedItemsFromMoneyRequest, boolean z, boolean z3, List suspiciousTransactionBannerWidget, List securityDelayBannerWidget, List dailyLimitExceededBanner, TrustedMerchant trustedMerchant, t features, List chargebackStatusWidget, List helpItems, JointAccountData jointAccountData, Map juniorTransactionData, r61.c cryptoAddressTransactionData, Map proBackgroundIcons, boolean z4, q creditCardInstalment, r debitToInstalment, Double d, boolean z6, x2 x2Var, List equivalentWidget, Set walletProfiles, na7.a hiddenAccountData, List slotItems) {
        Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
        Intrinsics.checkNotNullParameter(mainWalletId, "mainWalletId");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(customisedVaults, "customisedVaults");
        Intrinsics.checkNotNullParameter(billAccounts, "billAccounts");
        Intrinsics.checkNotNullParameter(splittedItemsFromMoneyRequest, "splittedItemsFromMoneyRequest");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBannerWidget, "suspiciousTransactionBannerWidget");
        Intrinsics.checkNotNullParameter(securityDelayBannerWidget, "securityDelayBannerWidget");
        Intrinsics.checkNotNullParameter(dailyLimitExceededBanner, "dailyLimitExceededBanner");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(chargebackStatusWidget, "chargebackStatusWidget");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        Intrinsics.checkNotNullParameter(juniorTransactionData, "juniorTransactionData");
        Intrinsics.checkNotNullParameter(cryptoAddressTransactionData, "cryptoAddressTransactionData");
        Intrinsics.checkNotNullParameter(proBackgroundIcons, "proBackgroundIcons");
        Intrinsics.checkNotNullParameter(creditCardInstalment, "creditCardInstalment");
        Intrinsics.checkNotNullParameter(debitToInstalment, "debitToInstalment");
        Intrinsics.checkNotNullParameter(equivalentWidget, "equivalentWidget");
        Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
        Intrinsics.checkNotNullParameter(hiddenAccountData, "hiddenAccountData");
        Intrinsics.checkNotNullParameter(slotItems, "slotItems");
        this.f255666a = transactionResult;
        this.f255667b = mainWalletId;
        this.f255668c = user;
        this.d = pockets;
        this.e = customisedVaults;
        this.f = billAccounts;
        this.f255669g = hVar;
        this.f255670h = cVar;
        this.i = moneyRequest;
        this.f255671j = splittedItemsFromMoneyRequest;
        this.k = z;
        this.f255672l = z3;
        this.f255673m = suspiciousTransactionBannerWidget;
        this.f255674n = securityDelayBannerWidget;
        this.o = dailyLimitExceededBanner;
        this.f255675p = trustedMerchant;
        this.f255676q = features;
        this.f255677r = chargebackStatusWidget;
        this.f255678s = helpItems;
        this.f255679t = jointAccountData;
        this.u = juniorTransactionData;
        this.v = cryptoAddressTransactionData;
        this.f255680w = proBackgroundIcons;
        this.f255681x = z4;
        this.f255682y = creditCardInstalment;
        this.z = debitToInstalment;
        this.A = d;
        this.B = z6;
        this.C = x2Var;
        this.D = equivalentWidget;
        this.E = walletProfiles;
        this.F = hiddenAccountData;
        this.G = slotItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f255666a, mVar.f255666a) && Intrinsics.f(this.f255667b, mVar.f255667b) && Intrinsics.f(this.f255668c, mVar.f255668c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f255669g, mVar.f255669g) && Intrinsics.f(this.f255670h, mVar.f255670h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f255671j, mVar.f255671j) && this.k == mVar.k && this.f255672l == mVar.f255672l && Intrinsics.f(this.f255673m, mVar.f255673m) && Intrinsics.f(this.f255674n, mVar.f255674n) && Intrinsics.f(this.o, mVar.o) && Intrinsics.f(this.f255675p, mVar.f255675p) && Intrinsics.f(this.f255676q, mVar.f255676q) && Intrinsics.f(this.f255677r, mVar.f255677r) && Intrinsics.f(this.f255678s, mVar.f255678s) && Intrinsics.f(this.f255679t, mVar.f255679t) && Intrinsics.f(this.u, mVar.u) && Intrinsics.f(this.v, mVar.v) && Intrinsics.f(this.f255680w, mVar.f255680w) && this.f255681x == mVar.f255681x && Intrinsics.f(this.f255682y, mVar.f255682y) && Intrinsics.f(this.z, mVar.z) && Intrinsics.f(this.A, mVar.A) && this.B == mVar.B && Intrinsics.f(this.C, mVar.C) && Intrinsics.f(this.D, mVar.D) && Intrinsics.f(this.E, mVar.E) && Intrinsics.f(this.F, mVar.F) && Intrinsics.f(this.G, mVar.G);
    }

    public final int hashCode() {
        int iE = p.a.e(p.a.e(p.a.e((this.f255668c.hashCode() + p.a.c(this.f255666a.hashCode() * 31, 31, this.f255667b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        v61.h hVar = this.f255669g;
        int iHashCode = (iE + (hVar == null ? 0 : hVar.hashCode())) * 31;
        sq9.c cVar = this.f255670h;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        MoneyRequest moneyRequest = this.i;
        int iD = p.a.d(p.a.d(p.a.d(j6.a.c(j6.a.c(p.a.d((iHashCode2 + (moneyRequest == null ? 0 : moneyRequest.hashCode())) * 31, 31, this.f255671j), 31, this.k), 31, this.f255672l), 31, this.f255673m), 31, this.f255674n), 31, this.o);
        TrustedMerchant trustedMerchant = this.f255675p;
        int iD2 = p.a.d(p.a.d((this.f255676q.hashCode() + ((iD + (trustedMerchant == null ? 0 : trustedMerchant.hashCode())) * 31)) * 31, 31, this.f255677r), 31, this.f255678s);
        JointAccountData jointAccountData = this.f255679t;
        int iHashCode3 = (this.z.hashCode() + ((this.f255682y.hashCode() + j6.a.c(p.a.e((this.v.hashCode() + p.a.e((iD2 + (jointAccountData == null ? 0 : jointAccountData.hashCode())) * 31, 31, this.u)) * 31, 31, this.f255680w), 31, this.f255681x)) * 31)) * 31;
        Double d = this.A;
        int iC = j6.a.c((iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31, this.B);
        x2 x2Var = this.C;
        return this.G.hashCode() + ((this.F.hashCode() + p.a.f(p.a.d((iC + (x2Var != null ? x2Var.hashCode() : 0)) * 31, 31, this.D), 31, this.E)) * 31);
    }
}
