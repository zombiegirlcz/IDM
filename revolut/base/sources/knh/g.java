package knh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerCollection f186170a;

    public g(ScreenerCollection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f186170a = collection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f186170a, ((g) obj2).f186170a);
    }

    public final int hashCode() {
        return this.f186170a.hashCode();
    }
}
