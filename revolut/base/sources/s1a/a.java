package s1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f259115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f259116b;

    public a(int i, dj0.d billAmount) {
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        this.f259115a = i;
        this.f259116b = billAmount;
    }

    public static a a(a aVar, int i) {
        dj0.d billAmount = aVar.f259116b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        return new a(i, billAmount);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f259115a == aVar.f259115a && Intrinsics.f(this.f259116b, aVar.f259116b);
    }

    public final int hashCode() {
        return this.f259116b.hashCode() + (Integer.hashCode(this.f259115a) * 31);
    }
}
