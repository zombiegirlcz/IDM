package q9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f243862b;

    public d(String orderToken, String merchantPublicKey) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        this.f243861a = orderToken;
        this.f243862b = merchantPublicKey;
    }

    @Override // q9c.f
    public final String a() {
        return this.f243861a;
    }

    @Override // q9c.f
    public final String b() {
        return this.f243862b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f243861a, dVar.f243861a) && Intrinsics.f(this.f243862b, dVar.f243862b);
    }

    public final int hashCode() {
        return this.f243862b.hashCode() + (this.f243861a.hashCode() * 31);
    }
}
