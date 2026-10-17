package v1i;

import kotlin.jvm.internal.Intrinsics;
import wd6.e;
import wd6.h;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f285318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f285319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f285320c;

    public a(h orderType, e exchangeMode, b currency) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f285318a = orderType;
        this.f285319b = exchangeMode;
        this.f285320c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f285318a == aVar.f285318a && this.f285319b == aVar.f285319b && Intrinsics.f(this.f285320c, aVar.f285320c);
    }

    public final int hashCode() {
        return this.f285320c.hashCode() + y.g(this.f285319b, this.f285318a.hashCode() * 31, 31);
    }
}
