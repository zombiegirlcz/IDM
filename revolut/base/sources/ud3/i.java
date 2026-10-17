package ud3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f279103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f279104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f279105c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f279106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f279107h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f279108j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f279109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f279110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f279111n;

    public i(Data cashbackBySourcesData, Data transactionsData, Data cashbackPercentagesData, Data upgradeToEarnMetalStateData, Data upgradeToEarnUltraStateData, Data exchangeRateAlertVisibleData, Data ultraPlanAvailableData, Data availableToWithdrawAmountForPlanCashbackData, Data currentPlanData, boolean z, Data cashbackBoxId, Data cashbackStatus, Data revPointsOptInState, boolean z3) {
        Intrinsics.checkNotNullParameter(cashbackBySourcesData, "cashbackBySourcesData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(cashbackPercentagesData, "cashbackPercentagesData");
        Intrinsics.checkNotNullParameter(upgradeToEarnMetalStateData, "upgradeToEarnMetalStateData");
        Intrinsics.checkNotNullParameter(upgradeToEarnUltraStateData, "upgradeToEarnUltraStateData");
        Intrinsics.checkNotNullParameter(exchangeRateAlertVisibleData, "exchangeRateAlertVisibleData");
        Intrinsics.checkNotNullParameter(ultraPlanAvailableData, "ultraPlanAvailableData");
        Intrinsics.checkNotNullParameter(availableToWithdrawAmountForPlanCashbackData, "availableToWithdrawAmountForPlanCashbackData");
        Intrinsics.checkNotNullParameter(currentPlanData, "currentPlanData");
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        Intrinsics.checkNotNullParameter(cashbackStatus, "cashbackStatus");
        Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
        this.f279103a = cashbackBySourcesData;
        this.f279104b = transactionsData;
        this.f279105c = cashbackPercentagesData;
        this.d = upgradeToEarnMetalStateData;
        this.e = upgradeToEarnUltraStateData;
        this.f = exchangeRateAlertVisibleData;
        this.f279106g = ultraPlanAvailableData;
        this.f279107h = availableToWithdrawAmountForPlanCashbackData;
        this.i = currentPlanData;
        this.f279108j = z;
        this.k = cashbackBoxId;
        this.f279109l = cashbackStatus;
        this.f279110m = revPointsOptInState;
        this.f279111n = z3;
    }

    public static i a(i iVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, Data data11, Data data12, boolean z, int i) {
        Data cashbackBySourcesData = (i & 1) != 0 ? iVar.f279103a : data;
        Data transactionsData = (i & 2) != 0 ? iVar.f279104b : data2;
        Data cashbackPercentagesData = (i & 4) != 0 ? iVar.f279105c : data3;
        Data upgradeToEarnMetalStateData = (i & 8) != 0 ? iVar.d : data4;
        Data upgradeToEarnUltraStateData = (i & 16) != 0 ? iVar.e : data5;
        Data exchangeRateAlertVisibleData = (i & 32) != 0 ? iVar.f : data6;
        Data ultraPlanAvailableData = (i & 64) != 0 ? iVar.f279106g : data7;
        Data availableToWithdrawAmountForPlanCashbackData = (i & 128) != 0 ? iVar.f279107h : data8;
        Data currentPlanData = (i & 256) != 0 ? iVar.i : data9;
        boolean z3 = (i & 512) != 0 ? iVar.f279108j : true;
        Data cashbackBoxId = (i & 1024) != 0 ? iVar.k : data10;
        Data cashbackStatus = (i & 2048) != 0 ? iVar.f279109l : data11;
        Data revPointsOptInState = (i & 4096) != 0 ? iVar.f279110m : data12;
        boolean z4 = (i & 8192) != 0 ? iVar.f279111n : z;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(cashbackBySourcesData, "cashbackBySourcesData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(cashbackPercentagesData, "cashbackPercentagesData");
        Intrinsics.checkNotNullParameter(upgradeToEarnMetalStateData, "upgradeToEarnMetalStateData");
        Intrinsics.checkNotNullParameter(upgradeToEarnUltraStateData, "upgradeToEarnUltraStateData");
        Intrinsics.checkNotNullParameter(exchangeRateAlertVisibleData, "exchangeRateAlertVisibleData");
        Intrinsics.checkNotNullParameter(ultraPlanAvailableData, "ultraPlanAvailableData");
        Intrinsics.checkNotNullParameter(availableToWithdrawAmountForPlanCashbackData, "availableToWithdrawAmountForPlanCashbackData");
        Intrinsics.checkNotNullParameter(currentPlanData, "currentPlanData");
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        Intrinsics.checkNotNullParameter(cashbackStatus, "cashbackStatus");
        Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
        return new i(cashbackBySourcesData, transactionsData, cashbackPercentagesData, upgradeToEarnMetalStateData, upgradeToEarnUltraStateData, exchangeRateAlertVisibleData, ultraPlanAvailableData, availableToWithdrawAmountForPlanCashbackData, currentPlanData, z3, cashbackBoxId, cashbackStatus, revPointsOptInState, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f279103a, iVar.f279103a) && Intrinsics.f(this.f279104b, iVar.f279104b) && Intrinsics.f(this.f279105c, iVar.f279105c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f279106g, iVar.f279106g) && Intrinsics.f(this.f279107h, iVar.f279107h) && Intrinsics.f(this.i, iVar.i) && this.f279108j == iVar.f279108j && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f279109l, iVar.f279109l) && Intrinsics.f(this.f279110m, iVar.f279110m) && this.f279111n == iVar.f279111n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279111n) + kii.e.c(this.f279110m, kii.e.c(this.f279109l, kii.e.c(this.k, j6.a.c(kii.e.c(this.i, kii.e.c(this.f279107h, kii.e.c(this.f279106g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f279105c, kii.e.c(this.f279104b, this.f279103a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f279108j), 31), 31), 31);
    }
}
