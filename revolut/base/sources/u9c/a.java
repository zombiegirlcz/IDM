package u9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278449b;

    public a(String merchantPublicKey, String currency) {
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f278448a = merchantPublicKey;
        this.f278449b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f278448a, aVar.f278448a) && Intrinsics.f(this.f278449b, aVar.f278449b);
    }

    public final int hashCode() {
        return this.f278449b.hashCode() + (this.f278448a.hashCode() * 31);
    }
}
