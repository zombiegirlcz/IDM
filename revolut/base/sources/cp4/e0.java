package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107795c;

    public e0(String facilityId, String str) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107793a = facilityId;
        this.f107794b = str;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        this.f107795c = a0.d.s("credit_card_payment_info_", facilityId, "_", str);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<on4.h>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Payment$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f107793a, e0Var.f107793a) && Intrinsics.f(this.f107794b, e0Var.f107794b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107795c;
    }

    public final int hashCode() {
        int iHashCode = this.f107793a.hashCode() * 31;
        String str = this.f107794b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
