package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107865b;

    public w(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107864a = facilityId;
        this.f107865b = j6.a.q("credit_card_in_app_statements_widget_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<so4.c>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InAppStatementsWidget$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f107864a, ((w) obj2).f107864a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107865b;
    }

    public final int hashCode() {
        return this.f107864a.hashCode();
    }
}
