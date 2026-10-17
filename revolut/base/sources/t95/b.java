package t95;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268948b;

    public b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f268947a = facilityId;
        this.f268948b = j6.a.q("overdraft_details_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<r95.a>() { // from class: com.revolut.feature.credit.overdraft.impl.repositories.OverdraftCacheKey$Details$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f268947a, ((b) obj2).f268947a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f268948b;
    }

    public final int hashCode() {
        return this.f268947a.hashCode();
    }
}
