package ub3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpLocationInfo f278731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f278732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f278733c;

    public c(CashTopUpLocationInfo location, a primaryButtonType, a aVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(primaryButtonType, "primaryButtonType");
        this.f278731a = location;
        this.f278732b = primaryButtonType;
        this.f278733c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f278731a, cVar.f278731a) && this.f278732b == cVar.f278732b && this.f278733c == cVar.f278733c;
    }

    public final int hashCode() {
        int iHashCode = (this.f278732b.hashCode() + (this.f278731a.hashCode() * 31)) * 31;
        a aVar = this.f278733c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
