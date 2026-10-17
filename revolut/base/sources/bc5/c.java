package bc5;

import ac5.r;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14380b;

    public c(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f14379a = facilityId;
        this.f14380b = j6.a.q("credit_card_autopay_payments_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<r>() { // from class: com.revolut.feature.credit_card.autopay.impl.v3.repositories.CreditCardAutopayCacheKey$Payments$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f14379a, ((c) obj2).f14379a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f14380b;
    }

    public final int hashCode() {
        return this.f14379a.hashCode();
    }
}
