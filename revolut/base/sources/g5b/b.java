package g5b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f140720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f140721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f140722c;
    public final bfl.g d;

    public b(e widgetData, BigDecimal quantity, n instrument, bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(widgetData, "widgetData");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        this.f140720a = widgetData;
        this.f140721b = quantity;
        this.f140722c = instrument;
        this.d = tradeSide;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f140720a, bVar.f140720a) && Intrinsics.f(this.f140721b, bVar.f140721b) && Intrinsics.f(this.f140722c, bVar.f140722c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + a10.b.d(this.f140722c, t61.a.d(this.f140721b, this.f140720a.hashCode() * 31, 31), 31);
    }
}
