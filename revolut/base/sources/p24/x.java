package p24;

import com.google.gson.reflect.TypeToken;
import ft3.g1;
import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f232072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f232073b;

    public x(j1 productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f232072a = productType;
        this.f232073b = "waiting-list-subscription-".concat(g1.i(productType));
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<au3.m>() { // from class: com.revolut.feature.credit.application.plugins.impl.repositories.impl.WaitingListSubscriptionCacheKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f232072a == ((x) obj2).f232072a;
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f232073b;
    }

    public final int hashCode() {
        return this.f232072a.hashCode();
    }
}
