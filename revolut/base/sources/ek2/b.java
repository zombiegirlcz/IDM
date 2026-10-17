package ek2;

import com.revolut.data.model.Data;
import com.revolut.feature.atm.api.model.Atm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f126924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f126925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f126926c;
    public final Data d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f126927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f126928h;
    public final boolean i;

    public b(Atm selectedAtm, Data currentPlan, Data planLimits, Data planUsageLimits, Data walletLimits, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(selectedAtm, "selectedAtm");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(planLimits, "planLimits");
        Intrinsics.checkNotNullParameter(planUsageLimits, "planUsageLimits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        this.f126924a = selectedAtm;
        this.f126925b = currentPlan;
        this.f126926c = planLimits;
        this.d = planUsageLimits;
        this.e = walletLimits;
        this.f = z;
        this.f126927g = z3;
        this.f126928h = z4;
        this.i = z6;
    }

    public static b a(b bVar, Atm atm, Data data, Data data2, Data data3, Data data4, boolean z, boolean z3, boolean z4, boolean z6, int i) {
        if ((i & 1) != 0) {
            atm = bVar.f126924a;
        }
        Atm selectedAtm = atm;
        if ((i & 2) != 0) {
            data = bVar.f126925b;
        }
        Data currentPlan = data;
        if ((i & 4) != 0) {
            data2 = bVar.f126926c;
        }
        Data planLimits = data2;
        if ((i & 8) != 0) {
            data3 = bVar.d;
        }
        Data planUsageLimits = data3;
        if ((i & 16) != 0) {
            data4 = bVar.e;
        }
        Data walletLimits = data4;
        boolean z11 = (i & 32) != 0 ? bVar.f : z;
        boolean z12 = (i & 64) != 0 ? bVar.f126927g : z3;
        boolean z29 = (i & 128) != 0 ? bVar.f126928h : z4;
        boolean z31 = (i & 256) != 0 ? bVar.i : z6;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(selectedAtm, "selectedAtm");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(planLimits, "planLimits");
        Intrinsics.checkNotNullParameter(planUsageLimits, "planUsageLimits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        return new b(selectedAtm, currentPlan, planLimits, planUsageLimits, walletLimits, z11, z12, z29, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f126924a, bVar.f126924a) && Intrinsics.f(this.f126925b, bVar.f126925b) && Intrinsics.f(this.f126926c, bVar.f126926c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && this.f126927g == bVar.f126927g && this.f126928h == bVar.f126928h && this.i == bVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f126926c, kii.e.c(this.f126925b, this.f126924a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31, this.f126927g), 31, this.f126928h);
    }
}
