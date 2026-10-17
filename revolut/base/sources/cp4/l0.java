package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107825b;

    public l0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107824a = facilityId;
        this.f107825b = j6.a.q("credit_card_settings_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends ro4.d>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Settings$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f107824a, ((l0) obj2).f107824a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107825b;
    }

    public final int hashCode() {
        return this.f107824a.hashCode();
    }
}
