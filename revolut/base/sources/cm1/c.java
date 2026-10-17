package cm1;

import kotlin.jvm.internal.Intrinsics;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f25108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo1.b f25109b;

    public c(g paymentMethod, xo1.b bVar) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f25108a = paymentMethod;
        this.f25109b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f25108a == cVar.f25108a && this.f25109b == cVar.f25109b;
    }

    public final int hashCode() {
        int iHashCode = this.f25108a.hashCode() * 31;
        xo1.b bVar = this.f25109b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
