package xr3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.application.impl.repositories.CreditLimitIncreaseApplicationRepositoryImpl$CreditLimitIncreasePreferenceCacheKey$storageCacheType$1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308238b;

    public t(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f308237a = facilityId;
        this.f308238b = j6.a.q("credit_limit_increase_preference_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new CreditLimitIncreaseApplicationRepositoryImpl$CreditLimitIncreasePreferenceCacheKey$storageCacheType$1();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f308237a, ((t) obj2).f308237a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f308238b;
    }

    public final int hashCode() {
        return this.f308237a.hashCode();
    }
}
