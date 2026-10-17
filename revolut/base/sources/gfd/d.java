package gfd;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143391a;

    public d(List selectedAssetIds) {
        Intrinsics.checkNotNullParameter(selectedAssetIds, "selectedAssetIds");
        this.f143391a = selectedAssetIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f143391a, ((d) obj2).f143391a);
    }

    public final int hashCode() {
        return this.f143391a.hashCode();
    }
}
