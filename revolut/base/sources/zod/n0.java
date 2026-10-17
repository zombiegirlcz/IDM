package zod;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f324011c;
    public final j0 d;
    public final m0 e;
    public final NetWorthAccount f;

    public n0(List assets, List liabilities, xi0.b baseCurrency, j0 chartData, m0 owner, NetWorthAccount netWorthAccount) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(liabilities, "liabilities");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f324009a = assets;
        this.f324010b = liabilities;
        this.f324011c = baseCurrency;
        this.d = chartData;
        this.e = owner;
        this.f = netWorthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f324009a, n0Var.f324009a) && Intrinsics.f(this.f324010b, n0Var.f324010b) && Intrinsics.f(this.f324011c, n0Var.f324011c) && this.d.equals(n0Var.d) && this.e.equals(n0Var.e) && this.f.equals(n0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + h30.l.j(this.f324011c, p.a.d(this.f324009a.hashCode() * 31, 31, this.f324010b), 31)) * 31)) * 31);
    }
}
