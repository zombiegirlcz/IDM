package j7j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f171930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.e f171931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd6.h f171932c;
    public final Set d;
    public final Set e;

    public h(xi0.b orderBaseCurrency, wd6.e exchangeMode, wd6.h currentOrderType, Set availableOrderTypes, Set disabledOrderTypes) {
        Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currentOrderType, "currentOrderType");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(disabledOrderTypes, "disabledOrderTypes");
        this.f171930a = orderBaseCurrency;
        this.f171931b = exchangeMode;
        this.f171932c = currentOrderType;
        this.d = availableOrderTypes;
        this.e = disabledOrderTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f171930a, hVar.f171930a) && this.f171931b == hVar.f171931b && this.f171932c == hVar.f171932c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.f(v1.c.b(this.f171932c, y.g(this.f171931b, this.f171930a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
