package fb3;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f133437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f133438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f133439c;

    public d(dj0.d max, dj0.d min, String info) {
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f133437a = max;
        this.f133438b = min;
        this.f133439c = info;
    }

    public final boolean a(dj0.d amount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        xi0.b bVar = amount.f115083b;
        dj0.d dVar2 = this.f133437a;
        if (!Intrinsics.f(bVar, dVar2.f115083b)) {
            return false;
        }
        xi0.b bVar2 = amount.f115083b;
        dj0.d dVarO = this.f133438b;
        if (!Intrinsics.f(bVar2, dVarO.f115083b)) {
            return false;
        }
        if (dVar != null) {
            dVarO = pyd.c.O(dVarO, dVar);
        }
        return amount.e(dVarO) && amount.h(dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f133437a, dVar.f133437a) && Intrinsics.f(this.f133438b, dVar.f133438b) && Intrinsics.f(this.f133439c, dVar.f133439c);
    }

    public final int hashCode() {
        return this.f133439c.hashCode() + v7.c(this.f133437a.hashCode() * 31, 31, this.f133438b);
    }
}
