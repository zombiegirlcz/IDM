package h2j;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f148829c;

    public h(List balances, List currencies, do3.n user) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f148827a = balances;
        this.f148828b = currencies;
        this.f148829c = user;
    }

    public static h a(h hVar, ArrayList balances) {
        List currencies = hVar.f148828b;
        do3.n user = hVar.f148829c;
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(user, "user");
        return new h(balances, currencies, user);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f148827a, hVar.f148827a) && Intrinsics.f(this.f148828b, hVar.f148828b) && Intrinsics.f(this.f148829c, hVar.f148829c);
    }

    public final int hashCode() {
        return this.f148829c.hashCode() + p.a.d(this.f148827a.hashCode() * 31, 31, this.f148828b);
    }
}
