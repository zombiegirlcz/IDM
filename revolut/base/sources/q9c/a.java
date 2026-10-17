package q9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f243853b;

    public a(String orderToken, String merchantPublicKey) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        this.f243852a = orderToken;
        this.f243853b = merchantPublicKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f243852a, aVar.f243852a) && Intrinsics.f(this.f243853b, aVar.f243853b);
    }

    public final int hashCode() {
        return this.f243853b.hashCode() + (this.f243852a.hashCode() * 31);
    }
}
