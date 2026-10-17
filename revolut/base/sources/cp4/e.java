package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107792c;

    public e(String facilityId, String cardholderId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        this.f107790a = facilityId;
        this.f107791b = cardholderId;
        this.f107792c = a0.d.s("credit_card_additional_cardholder_settings_", facilityId, "_", cardholderId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.d>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$AdditionalCardholderSettingsKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f107790a, eVar.f107790a) && Intrinsics.f(this.f107791b, eVar.f107791b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107792c;
    }

    public final int hashCode() {
        return this.f107791b.hashCode() + (this.f107790a.hashCode() * 31);
    }
}
