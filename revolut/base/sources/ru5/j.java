package ru5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt5.b f257416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f257417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f257418c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f257419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f257420h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f257421j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoInvestmentsFeatureConfig.CurrencyMode f257422l;

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 0 == true ? 1 : 0, 4095);
    }

    public static j a(j jVar, pt5.b bVar, Data data, Data data2, Data data3, Data data4, Data data5, String str, List list, boolean z, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            bVar = jVar.f257416a;
        }
        pt5.b activityTab = bVar;
        if ((i & 2) != 0) {
            data = jVar.f257417b;
        }
        Data orders = data;
        Data filteredOrders = (i & 4) != 0 ? jVar.f257418c : data2;
        Data transactions = (i & 8) != 0 ? jVar.d : data3;
        Data suspiciousDeposits = (i & 16) != 0 ? jVar.e : data4;
        Data transactionsWithFiltersAndQueryApplied = (i & 32) != 0 ? jVar.f : data5;
        String searchQuery = (i & 64) != 0 ? jVar.f257419g : str;
        List list2 = (i & 128) != 0 ? jVar.f257420h : list;
        boolean z3 = (i & 256) != 0 ? jVar.i : z;
        String str4 = (i & 512) != 0 ? jVar.f257421j : str2;
        String str5 = (i & 1024) != 0 ? jVar.k : str3;
        CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode = jVar.f257422l;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(activityTab, "activityTab");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(filteredOrders, "filteredOrders");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(suspiciousDeposits, "suspiciousDeposits");
        Intrinsics.checkNotNullParameter(transactionsWithFiltersAndQueryApplied, "transactionsWithFiltersAndQueryApplied");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        return new j(activityTab, orders, filteredOrders, transactions, suspiciousDeposits, transactionsWithFiltersAndQueryApplied, searchQuery, list2, z3, str4, str5, currencyMode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f257416a == jVar.f257416a && Intrinsics.f(this.f257417b, jVar.f257417b) && Intrinsics.f(this.f257418c, jVar.f257418c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f257419g, jVar.f257419g) && Intrinsics.f(this.f257420h, jVar.f257420h) && this.i == jVar.i && Intrinsics.f(this.f257421j, jVar.f257421j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f257422l, jVar.f257422l);
    }

    public final int hashCode() {
        int iC = p.a.c(kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f257418c, kii.e.c(this.f257417b, this.f257416a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.f257419g);
        List list = this.f257420h;
        int iC2 = j6.a.c((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.i);
        String str = this.f257421j;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return this.f257422l.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public j(pt5.b activityTab, Data orders, Data filteredOrders, Data transactions, Data suspiciousDeposits, Data transactionsWithFiltersAndQueryApplied, String searchQuery, List list, boolean z, String str, String str2, CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode) {
        Intrinsics.checkNotNullParameter(activityTab, "activityTab");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(filteredOrders, "filteredOrders");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(suspiciousDeposits, "suspiciousDeposits");
        Intrinsics.checkNotNullParameter(transactionsWithFiltersAndQueryApplied, "transactionsWithFiltersAndQueryApplied");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        this.f257416a = activityTab;
        this.f257417b = orders;
        this.f257418c = filteredOrders;
        this.d = transactions;
        this.e = suspiciousDeposits;
        this.f = transactionsWithFiltersAndQueryApplied;
        this.f257419g = searchQuery;
        this.f257420h = list;
        this.i = z;
        this.f257421j = str;
        this.k = str2;
        this.f257422l = currencyMode;
    }

    public /* synthetic */ j(pt5.b bVar, CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode, int i) {
        this((i & 1) != 0 ? pt5.b.TRANSACTIONS : bVar, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), "", null, false, null, null, (i & 2048) != 0 ? CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies.f71404a : currencyMode);
    }
}
