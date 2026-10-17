package n3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f212000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212001b;

    public a(String side, jo3.b amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f212000a = amount;
        this.f212001b = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f212000a, aVar.f212000a) && Intrinsics.f(this.f212001b, aVar.f212001b);
    }

    public final int hashCode() {
        return this.f212001b.hashCode() + (this.f212000a.hashCode() * 31);
    }
}
