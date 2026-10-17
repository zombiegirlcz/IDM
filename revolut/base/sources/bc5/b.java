package bc5;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14378c;

    public b(String facilityId, String mandateId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        this.f14376a = facilityId;
        this.f14377b = mandateId;
        this.f14378c = a0.d.s("credit_card_autopay_mandate_", facilityId, "_", mandateId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<ac5.e>() { // from class: com.revolut.feature.credit_card.autopay.impl.v3.repositories.CreditCardAutopayCacheKey$Mandate$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f14376a, bVar.f14376a) && Intrinsics.f(this.f14377b, bVar.f14377b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f14378c;
    }

    public final int hashCode() {
        return this.f14377b.hashCode() + (this.f14376a.hashCode() * 31);
    }
}
