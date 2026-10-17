package pel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8l.c f235405a;

    public i(f8l.c percentageInputAssetType) {
        Intrinsics.checkNotNullParameter(percentageInputAssetType, "percentageInputAssetType");
        this.f235405a = percentageInputAssetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f235405a == ((i) obj2).f235405a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f235405a.hashCode() * 31);
    }
}
