package us9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f282837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f282839c;

    public a(dj0.d amount, dj0.d dVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f282837a = currency;
        this.f282838b = amount;
        this.f282839c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282837a, aVar.f282837a) && Intrinsics.f(this.f282838b, aVar.f282838b) && Intrinsics.f(this.f282839c, aVar.f282839c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f282837a.hashCode() * 31, 31, this.f282838b);
        dj0.d dVar = this.f282839c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
