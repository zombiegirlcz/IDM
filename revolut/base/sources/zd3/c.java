package zd3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f321298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f321299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f321300c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f321301g;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, int i) {
        if ((i & 1) != 0) {
            data = cVar.f321298a;
        }
        Data upgradeToEarnMetalStateData = data;
        if ((i & 2) != 0) {
            data2 = cVar.f321299b;
        }
        Data upgradeToEarnUltraStateData = data2;
        if ((i & 4) != 0) {
            data3 = cVar.f321300c;
        }
        Data cashbackBySourcesData = data3;
        if ((i & 8) != 0) {
            data4 = cVar.d;
        }
        Data availableToWithdrawAmountForPlanCashbackData = data4;
        if ((i & 16) != 0) {
            data5 = cVar.e;
        }
        Data cashbackBoxId = data5;
        if ((i & 32) != 0) {
            data6 = cVar.f;
        }
        Data currentPlanData = data6;
        if ((i & 64) != 0) {
            data7 = cVar.f321301g;
        }
        Data cashbackStatus = data7;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(upgradeToEarnMetalStateData, "upgradeToEarnMetalStateData");
        Intrinsics.checkNotNullParameter(upgradeToEarnUltraStateData, "upgradeToEarnUltraStateData");
        Intrinsics.checkNotNullParameter(cashbackBySourcesData, "cashbackBySourcesData");
        Intrinsics.checkNotNullParameter(availableToWithdrawAmountForPlanCashbackData, "availableToWithdrawAmountForPlanCashbackData");
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        Intrinsics.checkNotNullParameter(currentPlanData, "currentPlanData");
        Intrinsics.checkNotNullParameter(cashbackStatus, "cashbackStatus");
        return new c(upgradeToEarnMetalStateData, upgradeToEarnUltraStateData, cashbackBySourcesData, availableToWithdrawAmountForPlanCashbackData, cashbackBoxId, currentPlanData, cashbackStatus);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321298a, cVar.f321298a) && Intrinsics.f(this.f321299b, cVar.f321299b) && Intrinsics.f(this.f321300c, cVar.f321300c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f321301g, cVar.f321301g);
    }

    public final int hashCode() {
        return this.f321301g.hashCode() + kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f321300c, kii.e.c(this.f321299b, this.f321298a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public c(Data upgradeToEarnMetalStateData, Data upgradeToEarnUltraStateData, Data cashbackBySourcesData, Data availableToWithdrawAmountForPlanCashbackData, Data cashbackBoxId, Data currentPlanData, Data cashbackStatus) {
        Intrinsics.checkNotNullParameter(upgradeToEarnMetalStateData, "upgradeToEarnMetalStateData");
        Intrinsics.checkNotNullParameter(upgradeToEarnUltraStateData, "upgradeToEarnUltraStateData");
        Intrinsics.checkNotNullParameter(cashbackBySourcesData, "cashbackBySourcesData");
        Intrinsics.checkNotNullParameter(availableToWithdrawAmountForPlanCashbackData, "availableToWithdrawAmountForPlanCashbackData");
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        Intrinsics.checkNotNullParameter(currentPlanData, "currentPlanData");
        Intrinsics.checkNotNullParameter(cashbackStatus, "cashbackStatus");
        this.f321298a = upgradeToEarnMetalStateData;
        this.f321299b = upgradeToEarnUltraStateData;
        this.f321300c = cashbackBySourcesData;
        this.d = availableToWithdrawAmountForPlanCashbackData;
        this.e = cashbackBoxId;
        this.f = currentPlanData;
        this.f321301g = cashbackStatus;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
