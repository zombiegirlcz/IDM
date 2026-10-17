package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107863b;

    public v(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107862a = facilityId;
        this.f107863b = j6.a.q("credit_card_in_app_statements_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends so4.b>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InAppStatements$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f107862a, ((v) obj2).f107862a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107863b;
    }

    public final int hashCode() {
        return this.f107862a.hashCode();
    }
}
