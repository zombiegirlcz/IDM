package oph;

import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerCollection f227661a;

    public b(ScreenerCollection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f227661a = collection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f227661a, ((b) obj2).f227661a);
    }

    public final int hashCode() {
        return this.f227661a.hashCode();
    }
}
