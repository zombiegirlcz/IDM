package k4l;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f181000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dfl.x f181001c;
    public final ej0.b d;
    public final String e;
    public final TradingOrderExitStrategies f;

    public r(String securityRef, bfl.g side, dfl.x value, ej0.b clientPricePrecise, String positionId, TradingOrderExitStrategies exitStrategies) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(clientPricePrecise, "clientPricePrecise");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        this.f180999a = securityRef;
        this.f181000b = side;
        this.f181001c = value;
        this.d = clientPricePrecise;
        this.e = positionId;
        this.f = exitStrategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f180999a, rVar.f180999a) && this.f181000b == rVar.f181000b && this.f181001c.equals(rVar.f181001c) && this.d.equals(rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(org.bouncycastle.jcajce.provider.digest.a.d(this.d, t61.a.d(this.f181001c.f114516a, wp5.y.b(this.f181000b, this.f180999a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }
}
