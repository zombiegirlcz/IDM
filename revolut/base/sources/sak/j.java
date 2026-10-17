package sak;

import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f261453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f261454c;
    public final Long d;

    public j(dj0.d availableMoney, dj0.d targetMoney, xi0.b sourceCurrency, Long l2) {
        Intrinsics.checkNotNullParameter(availableMoney, "availableMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f261452a = availableMoney;
        this.f261453b = targetMoney;
        this.f261454c = sourceCurrency;
        this.d = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f261452a, jVar.f261452a) && Intrinsics.f(this.f261453b, jVar.f261453b) && Intrinsics.f(this.f261454c, jVar.f261454c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iJ = l.j(this.f261454c, v7.c(this.f261452a.hashCode() * 31, 31, this.f261453b), 31);
        Long l2 = this.d;
        return iJ + (l2 == null ? 0 : l2.hashCode());
    }
}
