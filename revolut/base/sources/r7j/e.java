package r7j;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f252264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.e f252265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f252266c;

    public e(wd6.h orderType, wd6.e exchangeMode, xi0.b currency) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f252264a = orderType;
        this.f252265b = exchangeMode;
        this.f252266c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f252264a == eVar.f252264a && this.f252265b == eVar.f252265b && Intrinsics.f(this.f252266c, eVar.f252266c);
    }

    public final int hashCode() {
        return this.f252266c.hashCode() + y.g(this.f252265b, this.f252264a.hashCode() * 31, 31);
    }
}
