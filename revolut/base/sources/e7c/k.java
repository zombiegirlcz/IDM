package e7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Le7c/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMerchantPublicKey", "merchantPublicKey", "b", "getCurrency", "currency", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantPublicKey")
    @NotNull
    private final String merchantPublicKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    public k(String merchantPublicKey, String currency) {
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.merchantPublicKey = merchantPublicKey;
        this.currency = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.merchantPublicKey, kVar.merchantPublicKey) && Intrinsics.f(this.currency, kVar.currency);
    }

    public final int hashCode() {
        return this.currency.hashCode() + (this.merchantPublicKey.hashCode() * 31);
    }
}
