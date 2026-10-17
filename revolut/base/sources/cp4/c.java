package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107785c;

    public c(String facilityId, String cardholderId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        this.f107783a = facilityId;
        this.f107784b = cardholderId;
        this.f107785c = a0.d.s("credit_card_additional_cardholder_cards_", facilityId, "_", cardholderId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends xo4.b>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$AdditionalCardholderCards$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f107783a, cVar.f107783a) && Intrinsics.f(this.f107784b, cVar.f107784b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107785c;
    }

    public final int hashCode() {
        return this.f107784b.hashCode() + (this.f107783a.hashCode() * 31);
    }
}
