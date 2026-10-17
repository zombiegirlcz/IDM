package amd;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6314c;
    public final dj0.d d;

    public d(e netWorthProductGroupType, List netWorthProductModels, List netWorthProductPromoModels, dj0.d totalBalance) {
        Intrinsics.checkNotNullParameter(netWorthProductGroupType, "netWorthProductGroupType");
        Intrinsics.checkNotNullParameter(netWorthProductModels, "netWorthProductModels");
        Intrinsics.checkNotNullParameter(netWorthProductPromoModels, "netWorthProductPromoModels");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        this.f6312a = netWorthProductGroupType;
        this.f6313b = netWorthProductModels;
        this.f6314c = netWorthProductPromoModels;
        this.d = totalBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f6312a == dVar.f6312a && Intrinsics.f(this.f6313b, dVar.f6313b) && Intrinsics.f(this.f6314c, dVar.f6314c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return v7.c(p.a.d(p.a.d(this.f6312a.hashCode() * 31, 31, this.f6313b), 31, this.f6314c), 31, this.d);
    }
}
