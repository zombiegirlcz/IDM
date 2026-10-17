package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f221761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOrderExitStrategy f221762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f221763c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public s(u strategyInputType, TradingOrderExitStrategy strategy, r inputState, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(strategyInputType, "strategyInputType");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        this.f221761a = strategyInputType;
        this.f221762b = strategy;
        this.f221763c = inputState;
        this.d = z;
        this.e = z3;
        this.f = z4;
    }

    public static s a(u strategyInputType, TradingOrderExitStrategy strategy, r inputState, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(strategyInputType, "strategyInputType");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        return new s(strategyInputType, strategy, inputState, z, z3, z4);
    }

    public static /* synthetic */ s b(s sVar, r rVar, int i) {
        u uVar = sVar.f221761a;
        TradingOrderExitStrategy tradingOrderExitStrategy = sVar.f221762b;
        if ((i & 4) != 0) {
            rVar = sVar.f221763c;
        }
        r rVar2 = rVar;
        boolean z = sVar.d;
        boolean z3 = sVar.e;
        boolean z4 = (i & 32) != 0 ? sVar.f : false;
        sVar.getClass();
        return a(uVar, tradingOrderExitStrategy, rVar2, z, z3, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f221761a == sVar.f221761a && Intrinsics.f(this.f221762b, sVar.f221762b) && Intrinsics.f(this.f221763c, sVar.f221763c) && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f221763c.hashCode() + ((this.f221762b.hashCode() + (this.f221761a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
