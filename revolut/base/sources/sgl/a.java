package sgl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f262667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262668b;

    public a(e amount, String side) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f262667a = amount;
        this.f262668b = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f262667a, aVar.f262667a) && Intrinsics.f(this.f262668b, aVar.f262668b);
    }

    public final int hashCode() {
        return this.f262668b.hashCode() + (this.f262667a.hashCode() * 31);
    }
}
