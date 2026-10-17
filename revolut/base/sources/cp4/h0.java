package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107809b;

    public h0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107808a = facilityId;
        this.f107809b = j6.a.q("credit_card_preferences_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.l>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Preferences$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f107808a, ((h0) obj2).f107808a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107809b;
    }

    public final int hashCode() {
        return this.f107808a.hashCode();
    }
}
