package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107870b;

    public y(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107869a = facilityId;
        this.f107870b = p.a.p("credit_card_", facilityId, "_info_sections_content");
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xn4.c>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InfoSectionsContent$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f107869a, ((y) obj2).f107869a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107870b;
    }

    public final int hashCode() {
        return this.f107869a.hashCode();
    }
}
