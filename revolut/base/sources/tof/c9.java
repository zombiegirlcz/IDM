package tof;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f272671a;

    public c9(LinkedHashSet scopedAssetIds) {
        Intrinsics.checkNotNullParameter(scopedAssetIds, "scopedAssetIds");
        this.f272671a = scopedAssetIds;
    }

    public final Set a() {
        return this.f272671a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c9) && this.f272671a.equals(((c9) obj2).f272671a);
    }

    public final int hashCode() {
        return this.f272671a.hashCode();
    }
}
