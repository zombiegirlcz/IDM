package t95;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268946b;

    public a(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f268945a = facilityId;
        this.f268946b = j6.a.q("overdraft_agreements_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<rx4.b>() { // from class: com.revolut.feature.credit.overdraft.impl.repositories.OverdraftCacheKey$Agreements$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f268945a, ((a) obj2).f268945a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f268946b;
    }

    public final int hashCode() {
        return this.f268945a.hashCode();
    }
}
