package bc5;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14375b;

    public a(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f14374a = facilityId;
        this.f14375b = j6.a.q("credit_card_autopay_config_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<ac5.a>() { // from class: com.revolut.feature.credit_card.autopay.impl.v3.repositories.CreditCardAutopayCacheKey$Config$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f14374a, ((a) obj2).f14374a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f14375b;
    }

    public final int hashCode() {
        return this.f14374a.hashCode();
    }
}
