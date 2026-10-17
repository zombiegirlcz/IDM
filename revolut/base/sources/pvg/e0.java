package pvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f240119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240120c;
    public final jo3.b d;

    public e0(iwg.a analyticsProductType, a3 sector, String currency, jo3.b totalValue) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        this.f240118a = analyticsProductType;
        this.f240119b = sector;
        this.f240120c = currency;
        this.d = totalValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f240118a == e0Var.f240118a && this.f240119b == e0Var.f240119b && Intrinsics.f(this.f240120c, e0Var.f240120c) && Intrinsics.f(this.d, e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f240119b.hashCode() + (this.f240118a.hashCode() * 31)) * 31, 31, this.f240120c);
    }
}
