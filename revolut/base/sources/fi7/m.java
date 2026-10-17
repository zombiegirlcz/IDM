package fi7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsTrendCollectionId f135333a;

    public m(InstrumentsTrendCollectionId collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.f135333a = collectionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f135333a, ((m) obj2).f135333a);
    }

    public final int hashCode() {
        return this.f135333a.hashCode();
    }
}
