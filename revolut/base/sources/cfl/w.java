package cfl;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f23752b;

    public w(UUID id10, TradingProductCode code) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f23751a = id10;
        this.f23752b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f23751a, wVar.f23751a) && Intrinsics.f(this.f23752b, wVar.f23752b);
    }

    public final int hashCode() {
        return this.f23752b.hashCode() + (this.f23751a.hashCode() * 31);
    }
}
