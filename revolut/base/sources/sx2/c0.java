package sx2;

import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.model.SkipConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c93.e f266271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f266272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f266273c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f266274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f266275h;
    public final mxl.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f266276j;
    public final bla.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f266277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SkipConfig f266278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f266279n;
    public final boolean o;

    public c0(c93.e cardType, Data user, Data currentPlan, Data plans, Data config, Data group, Data lockInfoList, Data hasFreeDeliveryPromo, mxl.j jVar, String str, bla.c multiCurrencyCardState, boolean z, SkipConfig skipConfig, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(lockInfoList, "lockInfoList");
        Intrinsics.checkNotNullParameter(hasFreeDeliveryPromo, "hasFreeDeliveryPromo");
        Intrinsics.checkNotNullParameter(multiCurrencyCardState, "multiCurrencyCardState");
        this.f266271a = cardType;
        this.f266272b = user;
        this.f266273c = currentPlan;
        this.d = plans;
        this.e = config;
        this.f = group;
        this.f266274g = lockInfoList;
        this.f266275h = hasFreeDeliveryPromo;
        this.i = jVar;
        this.f266276j = str;
        this.k = multiCurrencyCardState;
        this.f266277l = z;
        this.f266278m = skipConfig;
        this.f266279n = z3;
        this.o = z4;
    }

    public static c0 a(c0 c0Var, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, mxl.j jVar, bla.c cVar, boolean z, boolean z3, int i) {
        c93.e cardType = c0Var.f266271a;
        Data user = (i & 2) != 0 ? c0Var.f266272b : data;
        Data currentPlan = (i & 4) != 0 ? c0Var.f266273c : data2;
        Data plans = (i & 8) != 0 ? c0Var.d : data3;
        Data config = (i & 16) != 0 ? c0Var.e : data4;
        Data group = (i & 32) != 0 ? c0Var.f : data5;
        Data lockInfoList = (i & 64) != 0 ? c0Var.f266274g : data6;
        Data hasFreeDeliveryPromo = (i & 128) != 0 ? c0Var.f266275h : data7;
        mxl.j jVar2 = (i & 256) != 0 ? c0Var.i : jVar;
        String str = (i & 512) != 0 ? c0Var.f266276j : null;
        bla.c multiCurrencyCardState = (i & 1024) != 0 ? c0Var.k : cVar;
        boolean z4 = (i & 2048) != 0 ? c0Var.f266277l : z;
        SkipConfig skipConfig = c0Var.f266278m;
        boolean z6 = z4;
        boolean z11 = c0Var.f266279n;
        boolean z12 = (i & 16384) != 0 ? c0Var.o : z3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(lockInfoList, "lockInfoList");
        Intrinsics.checkNotNullParameter(hasFreeDeliveryPromo, "hasFreeDeliveryPromo");
        Intrinsics.checkNotNullParameter(multiCurrencyCardState, "multiCurrencyCardState");
        return new c0(cardType, user, currentPlan, plans, config, group, lockInfoList, hasFreeDeliveryPromo, jVar2, str, multiCurrencyCardState, z6, skipConfig, z11, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f266271a == c0Var.f266271a && Intrinsics.f(this.f266272b, c0Var.f266272b) && Intrinsics.f(this.f266273c, c0Var.f266273c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f266274g, c0Var.f266274g) && Intrinsics.f(this.f266275h, c0Var.f266275h) && Intrinsics.f(this.i, c0Var.i) && Intrinsics.f(this.f266276j, c0Var.f266276j) && this.k == c0Var.k && this.f266277l == c0Var.f266277l && Intrinsics.f(this.f266278m, c0Var.f266278m) && this.f266279n == c0Var.f266279n && this.o == c0Var.o;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f266275h, kii.e.c(this.f266274g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f266273c, kii.e.c(this.f266272b, this.f266271a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        mxl.j jVar = this.i;
        int iHashCode = (iC + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.f266276j;
        int iC2 = j6.a.c((this.k.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f266277l);
        SkipConfig skipConfig = this.f266278m;
        return Boolean.hashCode(this.o) + j6.a.c((iC2 + (skipConfig != null ? skipConfig.hashCode() : 0)) * 31, 31, this.f266279n);
    }
}
