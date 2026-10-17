package qwd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f249863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f249864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f249865c;
    public final Data d;
    public final boolean e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f249866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f249867h;
    public final yqi.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final do3.n f249868j;

    public m(long j2, xi0.b displayCurrency, xi0.b stakingCurrency, Data inputAmountsData, boolean z, l stakeInfo, Data sourcePocketData, Data sourcePocketInfo, yqi.b bVar, do3.n nVar) {
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(stakingCurrency, "stakingCurrency");
        Intrinsics.checkNotNullParameter(inputAmountsData, "inputAmountsData");
        Intrinsics.checkNotNullParameter(stakeInfo, "stakeInfo");
        Intrinsics.checkNotNullParameter(sourcePocketData, "sourcePocketData");
        Intrinsics.checkNotNullParameter(sourcePocketInfo, "sourcePocketInfo");
        this.f249863a = j2;
        this.f249864b = displayCurrency;
        this.f249865c = stakingCurrency;
        this.d = inputAmountsData;
        this.e = z;
        this.f = stakeInfo;
        this.f249866g = sourcePocketData;
        this.f249867h = sourcePocketInfo;
        this.i = bVar;
        this.f249868j = nVar;
    }

    public static m a(m mVar, long j2, xi0.b bVar, Data data, boolean z, Data data2, Data data3, yqi.b bVar2, do3.n nVar, int i) {
        long j3 = (i & 1) != 0 ? mVar.f249863a : j2;
        xi0.b displayCurrency = (i & 2) != 0 ? mVar.f249864b : bVar;
        xi0.b stakingCurrency = mVar.f249865c;
        Data inputAmountsData = (i & 8) != 0 ? mVar.d : data;
        boolean z3 = (i & 16) != 0 ? mVar.e : z;
        l stakeInfo = mVar.f;
        Data sourcePocketData = (i & 64) != 0 ? mVar.f249866g : data2;
        Data sourcePocketInfo = (i & 128) != 0 ? mVar.f249867h : data3;
        yqi.b bVar3 = (i & 256) != 0 ? mVar.i : bVar2;
        do3.n nVar2 = (i & 512) != 0 ? mVar.f249868j : nVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(stakingCurrency, "stakingCurrency");
        Intrinsics.checkNotNullParameter(inputAmountsData, "inputAmountsData");
        Intrinsics.checkNotNullParameter(stakeInfo, "stakeInfo");
        Intrinsics.checkNotNullParameter(sourcePocketData, "sourcePocketData");
        Intrinsics.checkNotNullParameter(sourcePocketInfo, "sourcePocketInfo");
        return new m(j3, displayCurrency, stakingCurrency, inputAmountsData, z3, stakeInfo, sourcePocketData, sourcePocketInfo, bVar3, nVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f249863a == mVar.f249863a && Intrinsics.f(this.f249864b, mVar.f249864b) && Intrinsics.f(this.f249865c, mVar.f249865c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f249866g, mVar.f249866g) && Intrinsics.f(this.f249867h, mVar.f249867h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f249868j, mVar.f249868j);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f249867h, kii.e.c(this.f249866g, (this.f.hashCode() + j6.a.c(kii.e.c(this.d, h30.l.j(this.f249865c, h30.l.j(this.f249864b, Long.hashCode(this.f249863a) * 31, 31), 31), 31), 31, this.e)) * 31, 31), 31);
        yqi.b bVar = this.i;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        do3.n nVar = this.f249868j;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }
}
